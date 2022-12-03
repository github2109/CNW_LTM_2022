<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="model.dto.CategoryDto"%>
<!DOCTYPE html>
<html>
<jsp:include page="../Components/ImportCSSAdmin.jsp" />
<jsp:include page="../Components/ImportJSAdmin.jsp" />

<body>
<form action="createNewsController" method="post" id="createNewsForm">
<input type="text" name = "test" />
	<div class="card card-info">
		<div class="card-header">
		  <h3 class="card-title">Create a new News</h3>
		</div>
		<div class="card-body">
			<div class="card">
			<div class="row">
				<div class="col-2"></div>
					<div class="col-8">
						<div class="input-group mb-3">
							  <div class="input-group-prepend">
							    <span class="input-group-text">Title</span>
							  </div>
						  <input type="text" class="form-control" placeholder="Title" id="newsTitle" name="newsTitle">
						</div>  
					</div>
				<div class="col-2"></div>
			</div>
			<div class="row">
				<div class="col-2"></div>
					<div class="col-8">
						<div class="input-group mb-3">
						  <div class="input-group-prepend">
						    <span class="input-group-text">Slug</span>
						  </div>
						  <input type="text" class="form-control" placeholder="Slug" id="newsSlug" name="newsSlug">
						</div> 
					</div>
				<div class="col-2"></div>
			</div>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-4">
					<div class="input-group mb-3">
					  <div class="input-group-prepend">
					    <span class="input-group-text">Writer</span>
					  </div>
					  <input type="text" class="form-control" placeholder="Write" name="writer">
					</div>
				</div>
				<div class="col-4">
					<div class="input-group mb-3">
					  <div class="input-group-prepend">
					    <span class="input-group-text">Categories</span>
					  </div>
					  <select class="form-control" id="categoryId">
					  		<% ArrayList<CategoryDto> listCategoriesDto =  (ArrayList<CategoryDto>) request
								.getAttribute("listCategoriesDto");
		                  	for (int i = 0; i < listCategoriesDto.size(); i++) {			
								if(i == 0){
							%>
	                         		<option value=<%=listCategoriesDto.get(i).getCategoryId()%> selected><%=listCategoriesDto.get(i).getCategoryName()%></option>
	                       	<%} else {%>
	                       			<option value=<%=listCategoriesDto.get(i).getCategoryId()%>><%=listCategoriesDto.get(i).getCategoryName()%></option>
	                       	<%} %>
	                       	<%} %>
	                       </select>
					</div>
				</div>
				
				<div class="col-2"></div>
			</div>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-8">				
					<div class="card">
						<div class="col-6">
							<div class="custom-file">	
								<input type="file" class="custom-file-input" accept="image/webp" id="importThumbFile" />	
								<label class="custom-file-label" for="customFile">Choose Thumb file</label>           
							</div>
						</div>
						<div class="col-sm-10">
							<img src="Resources/assets/img/admin/image_file.png" alt="Image thumb preview..." id="imageThumb"/>
						</div>
					</div>
				</div>
				<div class="col-2"></div>
			</div>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-8">				
					<div class="card">
						<div class="col-6">
							<div class="custom-file">						
								<input type="file" class="custom-file-input" accept="image/webp" id="importCoverFile"/>	  
								<label class="custom-file-label" for="customFile">Choose Cover file</label>         
							</div>
						</div>
						<div class="col-6">
							<div class="box-image">					
								<img src="Resources/assets/img/admin/image_file.png" alt="Image cover preview..." id="imageCover"/>
							</div>
						</div>
					</div>
				</div>
				<div class="col-2"></div>
			</div>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-8">
					<span class="input-group-text">Overview content</span>
			          <textarea id="overviewContent" placeholder="Enter overview content..." Name="overviewContent"></textarea>  
				</div>
				<div class="col-2"></div>
			</div>
			<div class="row">
				<div class="col-2"></div>
				<div class="col-8">
					<span class="input-group-text">Content</span>
			          <textarea id="content" placeholder="Enter  content..." Name="content"></textarea>  
				</div>
				<div class="col-2"></div>
			</div>
			
			<div class="row">
				<div class="col-2"></div>
				<div class="col-8">
					<div class="custom-control custom-switch">
			           <input type="checkbox" class="custom-control-input" id="isActive" name="isActive">
			           <label class="custom-control-label" for="customSwitch1">Is Active</label>
			         </div>  
				</div>
				<div class="col-2"></div>
			</div>
			<div class="row">
				<div class="col-11"></div>
				<div class="col-1">			
					<input class="btn btn-block btn-primary btn-lg" type="submit" id="submitCreate"></input>
					<input class="btn btn-block btn-primary btn-lg" type="button" id="btn123"></input>
				</div>
			</div>             
		</div>
		<input type="text" style="display:none" id="coverNews" name="coverNews"/>
		<input type="text" style="display:none" id="thumbNews" name="thumbNews"/>
		<input type="text" style="display:none" id="category" name="category"/>
		</div>
	</div>
</form>
</body>
</html>