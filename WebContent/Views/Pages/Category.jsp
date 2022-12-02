<%@page import="java.util.Base64"%>
<%@page import="model.bean.Category"%>
<%@page import="model.bean.News"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<jsp:include page="../Components/ImportCSSUser.jsp" />
<body>
	<%@ include file="../Components/Header.jsp"%>
	<%
	ArrayList<Category> listCategories = (ArrayList<Category>) request.getAttribute("listCategories");
	%>
	<main>
		<div class="about-area2 gray-bg pt-60 pb-60">
			<div class="container">
				<div class="row">
					<div class="col-lg-8">
						<div class="whats-news-wrapper">
							<!-- Heading & Nav Button -->
							<div class="row justify-content-between align-items-end mb-15">
								<div class="col-xl-4">
									<div class="section-tittle mb-30">
										<h3>Whats New</h3>
									</div>
								</div>
								<div class="col-xl-8 col-md-9">
									<div class="properties__button">
										<!--Nav Button  -->
										<nav>
											<div class="nav nav-tabs" id="nav-tab" role="tablist">
												<%
												for (int i = 0; i < listCategories.size(); i++) {
												%>
												<a
													class="<%=i == 0 ? "nav-item nav-link active" : "nav-item nav-link"%>"
													id=<%="nav-" + listCategories.get(i).getCategoryName() + "-tab"%>
													data-toggle="tab"
													href=<%="#nav-" + listCategories.get(i).getCategoryName()%>
													role="tab"
													aria-controls=<%="nav-" + listCategories.get(i).getCategoryName()%>
													aria-selected=<%=i == 0 ? "true" : "false"%>><%=listCategories.get(i).getCategoryName()%></a>
												<%
												}
												%>
											</div>
										</nav>
										<!--End Nav Button  -->
									</div>
								</div>
							</div>
							<!-- Tab content -->
							<div class="row">
								<div class="col-12">
									<!-- Nav Card -->
									<div class="tab-content" id="nav-tabContent">
										<%
										for (int i = 0; i < listCategories.size(); i++) {
											ArrayList<News> listNews = (ArrayList<News>) request
											.getAttribute("listNewsByCategoryId=" + listCategories.get(i).getCategoryId());
										%>
										<div class="tab-pane fade show <%=i == 0 ? "active" : ""%>"
											id=<%="nav-" + listCategories.get(i).getCategoryName()%>
											role="tabpanel"
											aria-labelledby=<%="nav-" + listCategories.get(i).getCategoryName() + "-tab"%>>
											<div class="row">
												<%
												for (int j = 0; j < listNews.size(); j++) {
												%>
												<div class="col-xl-6 col-lg-6 col-md-6">
													<div class="whats-news-single mb-40 mb-40">
														<div class="whates-img">
															<img
																style="width: 280px; height: 168px; object-fit: cover;"
																src=<%="data:image/png;base64," + new String(Base64.getEncoder().encode(listNews.get(j).getNewsCover()))%>
																alt="">
														</div>
														<div class="whates-caption whates-caption2">
															<h4>
																<a
																	href=<%="NewsController?NewsId=" + listNews.get(j).getNewsId()%>><%=listNews.get(j).getNewsTitle()%></a>
															</h4>
															<span>by <%=listNews.get(j).getNewsWriter()%> -
																Jun 19, 2020
															</span>
															<p><%=listNews.get(j).getNewsOverviewContent()%></p>
														</div>
													</div>
												</div>
												<%
												}
												%>
											</div>
										</div>
										<%
										}
										%>
									</div>
									<!-- End Nav Card -->
								</div>
							</div>
						</div>
					</div>
					<div class="col-lg-4">
						<!-- Flow Socail -->
						<div class="single-follow mb-45">
							<div class="single-box">
								<div class="follow-us d-flex align-items-center">
									<div class="follow-social">
										<a href="#"><img src="Resources/assets/img/news/icon-fb.png" alt=""></a>
									</div>
									<div class="follow-count">
										<span>8,045</span>
										<p>Fans</p>
									</div>
								</div>
								<div class="follow-us d-flex align-items-center">
									<div class="follow-social">
										<a href="#"><img src="Resources/assets/img/news/icon-tw.png" alt=""></a>
									</div>
									<div class="follow-count">
										<span>8,045</span>
										<p>Fans</p>
									</div>
								</div>
								<div class="follow-us d-flex align-items-center">
									<div class="follow-social">
										<a href="#"><img src="Resources/assets/img/news/icon-ins.png" alt=""></a>
									</div>
									<div class="follow-count">
										<span>8,045</span>
										<p>Fans</p>
									</div>
								</div>
								<div class="follow-us d-flex align-items-center">
									<div class="follow-social">
										<a href="#"><img src="Resources/assets/img/news/icon-yo.png" alt=""></a>
									</div>
									<div class="follow-count">
										<span>8,045</span>
										<p>Fans</p>
									</div>
								</div>
							</div>
						</div>
						<!-- New Poster -->
						<div class="news-poster d-none d-lg-block">
							<img src="Resources/assets/img/news/news_card.jpg" alt="">
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- About US End -->
		<!--Start pagination -->
		<div class="pagination-area  gray-bg pb-45">
			<div class="container">
				<div class="row">
					<div class="col-xl-12">
						<div class="single-wrap">
							<nav aria-label="Page navigation example">
								<ul class="pagination justify-content-start">
									<li class="page-item"><a class="page-link" href="#"> <!-- SVG icon -->
											<svg xmlns="http://www.w3.org/2000/svg"
												xmlns:xlink="http://www.w3.org/1999/xlink" width="24px"
												height="15px">
                                    <path fill-rule="evenodd"
													fill="rgb(221, 221, 221)"
													d="M8.142,13.118 L6.973,14.135 L0.127,7.646 L0.127,6.623 L6.973,0.132 L8.087,1.153 L2.683,6.413 L23.309,6.413 L23.309,7.856 L2.683,7.856 L8.142,13.118 Z" />
                                    </svg> </span></a></li>
									<li class="page-item active"><a class="page-link" href="#">01</a></li>
									<li class="page-item"><a class="page-link" href="#">02</a></li>
									<li class="page-item"><a class="page-link" href="#">03</a></li>
									<li class="page-item"><a class="page-link" href="#"> <!-- SVG iocn -->
											<svg xmlns="http://www.w3.org/2000/svg"
												xmlns:xlink="http://www.w3.org/1999/xlink" width="40px"
												height="15px">
                                <path fill-rule="evenodd"
													fill="rgb(255, 11, 11)"
													d="M31.112,13.118 L32.281,14.136 L39.127,7.646 L39.127,6.624 L32.281,0.132 L31.167,1.154 L36.571,6.413 L0.491,6.413 L0.491,7.857 L36.571,7.857 L31.112,13.118 Z" />
                                </svg> </span></a></li>
								</ul>
							</nav>
						</div>
					</div>
				</div>
			</div>
		</div>
	</main>
	<jsp:include page="../Components/ImportJSUser.jsp" />
</body>
</html>