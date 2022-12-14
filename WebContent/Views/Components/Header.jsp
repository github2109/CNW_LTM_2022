<!-- Preloader Start -->
<%@page import="model.bean.Reader"%>
<div id="preloader-active">
	<div class="preloader d-flex align-items-center justify-content-center">
		<div class="preloader-inner position-relative">
			<div class="preloader-circle"></div>
			<div class="preloader-img pere-text">
				<img src="Resources/assets/img/logo/logo.png" alt="">
			</div>
		</div>
	</div>
</div>
<!-- Preloader Start -->
<header>
	<!-- Header Start -->
	<div class="header-area">
		<div class="main-header ">
			<div class="header-mid gray-bg">
				<div class="container">
					<div class="row d-flex align-items-center">
						<!-- Logo -->
						<div class="col-xl-3 col-lg-3 col-md-3 d-none d-md-block">
							<div class="logo">
								<a href="index.html"><img
									src="Resources/assets/img/logo/logo.png" alt=""></a>
							</div>
						</div>
						<div class="col-xl-9 col-lg-9 col-md-9">
							<div class="header-banner f-right ">
								<img src="Resources/assets/img/gallery/header_card.png" alt="">
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="header-bottom header-sticky">
				<div class="container">
					<div class="row align-items-center">
						<div class="col-xl-8 col-lg-8 col-md-12 header-flex">
							<!-- sticky -->
							<div class="sticky-logo">
								<a href="index.html"><img
									src="Resources/assets/img/logo/logo.png" alt=""></a>
							</div>
							<!-- Main-menu -->
							<div class="main-menu d-none d-md-block">
								<nav>
									<ul id="navigation">
										<li><a href="HomeController">Home</a></li>
										<li><a href="AboutController">about</a></li>
										<li><a href="CategoryController">Category</a></li>
										<li><a href="LastestNewsController">Latest News</a></li>
										<li><a href="ContactController.html">Contact</a></li>
									</ul>
								</nav>
							</div>
						</div>
						<div class="col-xl-4 col-lg-4 col-md-4">
							<div class="header-right f-right d-none d-lg-block">
								<!-- Heder social -->
								<ul class="header-social">
									<li><a href="https://www.fb.com/sai4ull"><i
											class="fab fa-facebook-f"></i></a></li>
									<li><a href="#"><i class="fab fa-twitter"></i></a></li>
									<li><a href="#"><i class="fab fa-instagram"></i></a></li>
									<li><a href="#"><i class="fab fa-youtube"></i></a></li>
								</ul>
								<!-- Search Nav -->
								<% Reader user = (Reader ) session.getAttribute("user");%>
								<div class="nav-search search-switch">
									<%= user == null ? "<a href='LoginRedirectController'><i class='fa fa-user'></i></a>"
		: "<a href='LogoutController'><i class='fa fa-user-check'></i></a>"%>
								</div>
							</div>
						</div>
						<!-- Mobile Menu -->
						<div class="col-12">
							<div class="mobile_menu d-block d-md-none"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Header End -->
</header>