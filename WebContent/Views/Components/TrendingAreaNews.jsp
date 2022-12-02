<%@page import="model.bean.Category"%>
<%@page import="model.bean.News"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<!-- Trending Area Start -->
<%
ArrayList<Category> listCategories = new ArrayList<Category>(
		(ArrayList<Category>) request.getAttribute("listCategories"));
ArrayList<Category> listCategoriesRandom = new ArrayList<Category>();
Random rand = new Random();
int tmp;
for (int i = 0; i < 3; i++) {
	tmp = rand.nextInt(listCategories.size());
	listCategoriesRandom.add(listCategories.get(tmp));
	listCategories.remove(tmp);
}
%>
<div class="trending-area fix pt-25 gray-bg">
	<div class="container">
		<div class="trending-main">
			<div class="row">
				<div class="col-lg-8">
					<!-- Trending Top -->

					<div class="slider-active">
						<%
						ArrayList<News> listNews = (ArrayList<News>) request
								.getAttribute("listNewsMostRecentByCategoryId=" + listCategoriesRandom.get(0).getCategoryId());

						for (int i = 0; i < listNews.size(); i++) {
						%>
						<!-- Single -->
						<div class="single-slider">
							<div class="trending-top mb-30">
								<div class="trend-top-img">
									<img class="img-single-slider-TrendingArea"
										src=<%="data:image/png;base64," + new String(Base64.getEncoder().encode(listNews.get(i).getNewsCover()))%>
										alt="">
									<div class="trend-top-cap">
										<span class="bgr" data-animation="fadeInUp" data-delay=".1s"
											data-duration="1000ms"><%=listCategoriesRandom.get(0).getCategoryName()%></span>
										<h2>
											<a
												href=<%="NewsController?NewsId=" + listNews.get(i).getNewsId()%>
												data-animation="fadeInUp" data-delay=".4s"
												data-duration="1000ms"><%=listNews.get(i).getNewsTitle()%></a>
										</h2>
										<p data-animation="fadeInUp" data-delay=".6s"
											data-duration="1000ms">
											by
											<%=listNews.get(i).getNewsWriter()%>
											- <%=listNews.get(i).getNewsCreatedAt() %>
										</p>
									</div>
								</div>
							</div>
						</div>
						<%
						}
						%>
					</div>
				</div>
				<%
				listNews = (ArrayList<News>) request
						.getAttribute("listNewsMostRecentByCategoryId=" + listCategoriesRandom.get(1).getCategoryId());
				News news1 = listNews.get(rand.nextInt(listNews.size()));
				listNews = (ArrayList<News>) request
						.getAttribute("listNewsMostRecentByCategoryId=" + listCategoriesRandom.get(2).getCategoryId());
				News news2 = listNews.get(rand.nextInt(listNews.size()));
				%>
				<!-- Right content -->
				<div class="col-lg-4">
					<div class="row">
						<div class="col-lg-12 col-md-6 col-sm-6">
							<div class="trending-top mb-30">
								<div class="trend-top-img">
									<img class = "img-single-slider-trending-area-right-top" src=<%="data:image/png;base64," + new String(Base64.getEncoder().encode(news1.getNewsCover()))%>
										alt="">
									<div class="trend-top-cap trend-top-cap2">
										<span class="bgb"><%=listCategoriesRandom.get(1).getCategoryName()%></span>
										<h2>
											<a href=<%="NewsController?NewsId=" + news1.getNewsId()%>><%=news1.getNewsTitle()%></a>
										</h2>
										<p>by <%=news1.getNewsWriter() %> - <%=news1.getNewsCreatedAt() %></p>
									</div>
								</div>
							</div>
						</div>
						<div class="col-lg-12 col-md-6 col-sm-6">
							<div class="trending-top mb-30">
								<div class="trend-top-img">
									<img class = "img-single-slider-trending-area-right-bot" src=<%="data:image/png;base64," + new String(Base64.getEncoder().encode(news2.getNewsCover()))%>
										alt="">
									<div class="trend-top-cap trend-top-cap2">
										<span class="bgg"><%=listCategoriesRandom.get(2).getCategoryName()%> </span>
										<h2>
											<a href=<%="NewsController?NewsId=" + news2.getNewsId()%>><%=news2.getNewsTitle()%></a>
										</h2>
										<p>by <%=news2.getNewsWriter() %> - <%=news2.getNewsCreatedAt() %></p>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<!-- Trending Area End -->