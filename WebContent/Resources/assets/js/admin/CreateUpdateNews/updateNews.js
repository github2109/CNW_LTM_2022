/**
 * 
 *//**
 * 
 */
 $(function(){
	$('#overviewContent').summernote();
	$('#content').summernote();
	
	$("#newsTitle").on('change', function() {
        const value = document.getElementById('newsTitle').value;
        document.getElementById('newsSlug').value = convertToSlug(value);
    });
    
    function convertToSlug(str) {
	    str = str.replace(/^\s+|\s+$/g, '');
	    str = str.toLowerCase();
	
	    var from = "áàãảạâấầẫẩậăắằẵẳặđéèẽẻẹêềếễệểìíĩỉịòóõỏọôốồỗộổơớờỡởợùúũụủưứừữửự·/_,:;";
	    var to = "aaaaaaaaaaaaaaaaadeeeeeeeeeeeiiiiiooooooooooooooooouuuuuuuuuuu------";
	    for (var i = 0, l = from.length; i < l; i++) {
	        str = str.replace(new RegExp(from.charAt(i), 'g'), to.charAt(i));
	    }
	
	    str = str.replace(/[^a-z0-9 -]/g, '')
	        .replace(/\s+/g, '-')
	        .replace(/-+/g, '-');
	
	    return str;
	}
	
	$("#importThumbFile").change(function(){
        readURLThumb(this);
    });
	
	function readURLThumb(input) {
        if (input.files && input.files[0]) {
            var reader = new FileReader();
            reader.onload = function (e) {
                $('#imageThumb').attr('src', e.target.result);
            }

            reader.readAsDataURL(input.files[0]);
        }
    }
    
    $("#importCoverFile").change(function(){
        readURLCover(this);
    });
	
	function readURLCover(input) {
        if (input.files && input.files[0]) {
            var reader = new FileReader();

            reader.onload = function (e) {
                $('#imageCover').attr('src', e.target.result);
            }

            reader.readAsDataURL(input.files[0]);
        }
    }
    
    $('#categoryId').on('change',function(){	
		$('#category').val($('#categoryId').find(":selected").val());
	})
	
	
	$('#submitCreate').on('click',function(){
		$('#thumbNews').val(document.getElementById('imageThumb').getAttribute('src'));
		$('#coverNews').val(document.getElementById('imageCover').getAttribute('src'));
		if(('#createNewsForm').valid())
		{
			swal("Succes !", "Create successfully!", "success");
		}
	})
	
	$( document ).ready(function() {
    document.getElementById('imageCover').setAttribute('src',$('#coverNews').val()) ;
    document.getElementById('imageThumb').setAttribute('src',$('#thumbNews').val()) ;
	$('#overviewContent').summernote('code', $('#overviewContentHidden').val());
	$('#content').summernote('code',content);
});

})