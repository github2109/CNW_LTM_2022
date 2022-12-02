<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="model.bean.Category"%>
<%@page import="model.bean.News"%>
<%@page import="java.util.*"%>
<%
ArrayList<Category> listCategories = (ArrayList<Category>) request.getAttribute("listCategories");
%>
<!-- Whats New Start -->
<section class="whats-news-area pt-50 pb-20 gray-bg">
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
									.getAttribute("listNewsMostRecentByCategoryId=" + listCategories.get(i).getCategoryId());
									if (listNews.size() == 0)
										continue;
								%>
								<!-- card one -->
								<div class="tab-pane fade show <%=i == 0 ? "active" : ""%>"
									id=<%="nav-" + listCategories.get(i).getCategoryName()%>
									role="tabpanel"
									aria-labelledby=<%="nav-" + listCategories.get(i).getCategoryName() + "-tab" %>>
									<div class="row">

										<!-- Left Details Caption -->
										<div class="col-xl-6 col-lg-12">
											<div class="whats-news-single mb-40 mb-40">
												<div class="whates-img">
													<img
														src=<%="data:image/png;base64," + new String(Base64.getEncoder().encode(listNews.get(0).getNewsCover()))%>
														alt="">
												</div>
												<div class="whates-caption">
													<h4>
														<a
															href=<%="NewsController?NewsId=" + listNews.get(0).getNewsId()%>><%=listNews.get(0).getNewsTitle()%></a>
													</h4>
													<span>by <%=listNews.get(0).getNewsWriter()%> - <%= listNews.get(0).getNewsCreatedAt() %>
													</span>
													<p><%=listNews.get(0).getNewsOverviewContent()%></p>
												</div>
											</div>
										</div>

										<!-- Right single caption -->
										<div class="col-xl-6 col-lg-12">
											<div class="row">
												<%
												for (int j = 1; j < listNews.size(); j++) {
												%>
												<!-- single -->
												<div class="col-xl-12 col-lg-6 col-md-6 col-sm-10">
													<div class="whats-right-single mb-20">
														<div class="whats-right-img">
															<img class="img-right-single-caption"
																src=<%="data:image/png;base64," + new String(Base64.getEncoder().encode(listNews.get(j).getNewsCover()))%>
																alt="">
														</div>
														<div class="whats-right-cap">
															<span class="colorb"><%=listCategories.get(i).getCategoryName().toUpperCase()%></span>
															<h4>
																<a
																	href=<%="NewsController?NewsId=" + listNews.get(j).getNewsId()%>><%=listNews.get(j).getNewsTitle()%></a>
															</h4>
															<p><%=listNews.get(j).getNewsCreatedAt() %></p>
														</div>
													</div>
												</div>
												<%
												}
												%>
											</div>
										</div>
									</div>
								</div>

								<%
								}
								%>
								<!-- End Nav Card -->
							</div>
						</div>
					</div>
				</div>
				<!-- Banner -->
				<div class="banner-one mt-20 mb-30">
					<img src="Resources/assets/img/gallery/body_card1.png" alt="">
				</div>
			</div>
			<div class="col-lg-4">
				<!-- Flow Socail -->
				<div class="single-follow mb-45">
					<div class="single-box">
						<div class="follow-us d-flex align-items-center">
							<div class="follow-social">
								<a href="#"><img src="Resources/assets/img/news/icon-fb.png"
									alt=""></a>
							</div>
							<div class="follow-count">
								<span>8,045</span>
								<p>Fans</p>
							</div>
						</div>
						<div class="follow-us d-flex align-items-center">
							<div class="follow-social">
								<a href="#"><img src="Resources/assets/img/news/icon-tw.png"
									alt=""></a>
							</div>
							<div class="follow-count">
								<span>8,045</span>
								<p>Fans</p>
							</div>
						</div>
						<div class="follow-us d-flex align-items-center">
							<div class="follow-social">
								<a href="#"><img
									src="Resources/assets/img/news/icon-ins.png" alt=""></a>
							</div>
							<div class="follow-count">
								<span>8,045</span>
								<p>Fans</p>
							</div>
						</div>
						<div class="follow-us d-flex align-items-center">
							<div class="follow-social">
								<a href="#"><img src="Resources/assets/img/news/icon-yo.png"
									alt=""></a>
							</div>
							<div class="follow-count">
								<span>8,045</span>
								<p>Fans</p>
							</div>
						</div>
					</div>
				</div>
				<!-- Most Recent Area -->
				<div class="most-recent-area">
					<!-- Section Tittle -->
					<div class="small-tittle mb-20">
						<h4>Most Recent</h4>
					</div>
					<!-- Details -->
					<div class="most-recent mb-40">
						<div class="most-recent-img">
							<img src="Resources/assets/img/gallery/most_recent.png" alt="">
							<div class="most-recent-cap">
								<span class="bgbeg">Vogue</span>
								<h4>
									<a href="latest_news.html">What to Wear: 9+ Cute Work <br>
										Outfits to Wear This.
									</a>
								</h4>
								<p>Jhon | 2 hours ago</p>
							</div>
						</div>
					</div>
					<!-- Single -->
					<div class="most-recent-single">
						<div class="most-recent-images">
							<img src="Resources/assets/img/gallery/most_recent1.png" alt="">
						</div>
						<div class="most-recent-capt">
							<h4>
								<a href="latest_news.html">Scarlett’s disappointment at
									latest accolade</a>
							</h4>
							<p>Jhon | 2 hours ago</p>
						</div>
					</div>
					<!-- Single -->
					<div class="most-recent-single">
						<div class="most-recent-images">
							<img src="Resources/assets/img/gallery/most_recent2.png" alt="">
						</div>
						<div class="most-recent-capt">
							<h4>
								<a href="latest_news.html">Most Beautiful Things to Do in
									Sidney with Your BF</a>
							</h4>
							<p>Jhon | 3 hours ago</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
