/**
 * 
 */
 $(function() {
    $('.delete-html').each(function(i, obj) {
        $(obj).html(ExtractContent($(obj).text()))
    });
    function ExtractContent(value) {
	    var div = document.createElement('div')
	    div.innerHTML = value;
	    var text = div.textContent;
	    return text;
	}
});