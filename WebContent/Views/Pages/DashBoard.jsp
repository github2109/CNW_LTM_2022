<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="model.dto.NewsDto"%>
<!DOCTYPE html>
<html>
<jsp:include page="../Components/ImportCSSAdmin.jsp" />
<body class="hold-transition dark-mode sidebar-mini layout-fixed layout-navbar-fixed layout-footer-fixed">
	<div class="wrapper">
		<!-- Navbar -->
		<nav class="main-header navbar navbar-expand navbar-dark">
			<!-- Left navbar links -->
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" data-widget="pushmenu"
					href="#" role="button"><i class="fas fa-bars"></i></a></li>
				<li class="nav-item d-none d-sm-inline-block"><a
					href="#" class="nav-link">Home</a></li>
				<li class="nav-item d-none d-sm-inline-block"><a href="#"
					class="nav-link">Contact</a></li>
			</ul>
		</nav>
		<!-- /.navbar -->
	
		<!-- Main Sidebar Container -->
		<aside class="main-sidebar sidebar-dark-primary elevation-4">
			<!-- Brand Logo -->
			<a href="index3.html" class="brand-link"> <img
				src="Resources/assets/img/admin/avatar/AdminLTELogo.png"
				alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
				style="opacity: .8"> <span class="brand-text font-weight-light">Admin</span>
			</a>
			<div class="sidebar">
				<div class="user-panel mt-3 pb-3 mb-3 d-flex">
					<div class="image">
						<img src="Resources\assets\img\admin\avatar\avatar5.png"
							class="img-circle elevation-2" alt="User Image">
					</div>
					<div class="info">
						<a href="#" class="d-block">Admin
					</div>
				</div>
				<nav class="mt-2">
					<ul class="nav nav-pills nav-sidebar flex-column"
						data-widget="treeview" role="menu" data-accordion="false">
						<li class="nav-item menu-open"><a href="#"
							class="nav-link active"> 
								<i class="fa-regular fa-memo-pad"></i>
								<p class="menu-item-title">
									News management <i class="right fas fa-angle-left"></i>
								</p>
						</a>
							<ul class="nav nav-treeview">
								<li class="nav-item"><a href="#" class="nav-link">
										<i class="far fa-circle nav-icon"></i>
											<p class="menu-item-title">Create News</p>
								</a></li>
								<li class="nav-item"><a href="#"
									class="nav-link"> <i class="far fa-circle nav-icon"></i>
											<p class="menu-item-title">Update News</p>
								</a></li>
								<li class="nav-item"><a href="#"
									class="nav-link"> <i class="far fa-circle nav-icon"></i>
											<p class="menu-item-title">DashBoard</p>
								</a></li>
							</ul></li>
					</ul>
				</nav>
	
			</div>
		</aside>
		<div class="content-wrapper">
			<section class="content">
				<div class="container-fluid">
					<div class="row">
          <div class="col-12">
            <div class="card">
              <div class="card-header">
                <h3 class="card-title">Dash board</h3>

                <div class="card-tools">
                  <div class="input-group input-group-sm" style="width: 150px;">
                    <input type="text" name="table_search" class="form-control float-right" placeholder="Search">

                    <div class="input-group-append">
                      <button type="submit" class="btn btn-default">
                        <i class="fas fa-search"></i>
                      </button>
                    </div>
                  </div>
                </div>
              </div>
              <!-- /.card-header -->
              <div class="card-body table-responsive p-0">
                <table class="table-bordered table table-striped dataTable no-footer">
                  <thead>
                    <tr>
                      <th class ="max-width">ID</th>
                      <th class ="max-width">Slug</th>
                      <th class ="max-width">Title</th>
                      <th class ="max-width">Writer</th>
                      <th class ="max-width">Thumb</th>
                      <th class ="max-width">Cover</th>
                      <th class ="max-width">Overview Content</th>
                      <th class ="max-width">Content</th>
                      <th class ="max-width">Is Active</th>
                      <th class ="max-width">Views Number</th>
                      <th class ="max-width">News Created At</th>
                    </tr>
                  </thead>
                  <tbody>
                  	<% ArrayList<NewsDto> newDtoList =  (ArrayList<NewsDto>) request
								.getAttribute("newDtoList");
                  	for (int i = 0; i < newDtoList.size(); i++) {			
					%>
                    <tr>
                      <td class ="max-width"><%=newDtoList.get(i).getNewsId()%></td>
                      <td class ="max-width"><div class="delete-html"><%=newDtoList.get(i).getNewsSlug()%></div></td>
                      <td class ="max-width"><div class="delete-html"><%=newDtoList.get(i).getNewsTitle()%></div></td>
                      <td class ="max-width"><%=newDtoList.get(i).getNewsWriter()%></td>
                      <td class ="max-width">
                      	<img class="Image" src=<%="data:image/png;base64," + new String(Base64.getEncoder().encode(newDtoList.get(i).getNewsThumb()))%>
										alt="">
                      </td>
                      <td class ="max-width">
                      	<img class="Image" src=<%="data:image/png;base64," + new String(Base64.getEncoder().encode(newDtoList.get(i).getNewsCover()))%>
										alt="">
                      </td>
                      <td class ="max-width"><div class="delete-html"><%=newDtoList.get(i).getNewsOverviewContent()%></div></td>
                      <td class ="max-width"><div class="delete-html"><%=newDtoList.get(i).getNewsContent()%></div></td>
                      <td class ="max-width"><%=newDtoList.get(i).isActive()%></td>
                      <td class ="max-width"><%=newDtoList.get(i).getViewsNumber()%></td>
                      <td class ="max-width"><%=newDtoList.get(i).getNewsCreatedAt()%></td>
                    </tr>
                    <%} %>
                  </tbody>
                </table>
              </div>
              <!-- /.card-body -->
            </div>
            <!-- /.card -->
          </div>
        </div>
				</div>
			</section>
		</div>
	</div>
	<jsp:include page="../Components/ImportJSAdmin.jsp" />
</body>

</html>