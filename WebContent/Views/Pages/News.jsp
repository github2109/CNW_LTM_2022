<%@page import="model.dto.CommentDTO"%>
<%@page import="model.bean.News"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<jsp:include page="../Components/ImportCSSUser.jsp" />
<body>

	<main>
		<%@ include file="../Components/Header.jsp"%>
		<%
		News news = (News) request.getAttribute("news");
		%>
		<!-- About US Start -->
		<div class="about-area2 gray-bg pt-60 pb-60">
			<div class="container">
				<div class="row">
					<div class="col-lg-8">
						<!-- Trending Tittle -->
						<div class="about-right mb-90">
							<div class="about-img">
								<img
									src=<%="data:image/png;base64," + new String(Base64.getEncoder().encode(news.getNewsCover()))%>
									alt="" />
							</div>
							<div class="heading-news mb-30 pt-30">
								<h3><%=news.getNewsTitle()%></h3>
							</div>
							<%=news.getNewsContent()%>
							<div class="social-share pt-30">
								<div class="section-tittle">
									<h3 class="mr-20">Share:</h3>
									<ul>
										<li><a href="#"><img
												src="Resources/assets/img/news/icon-ins.png" alt=""></a></li>
										<li><a href="#"><img
												src="Resources/assets/img/news/icon-fb.png" alt=""></a></li>
										<li><a href="#"><img
												src="Resources/assets/img/news/icon-tw.png" alt=""></a></li>
										<li><a href="#"><img
												src="Resources/assets/img/news/icon-yo.png" alt=""></a></li>
									</ul>
								</div>
							</div>
						</div>
						<div class="blog-author">
							<div class="media align-items-center">
							</div>
						</div>
						<div class="comments-area">
						
							<% ArrayList<CommentDTO> listComments = (ArrayList<CommentDTO>) request.getAttribute("listComments"); %>
							<h4><%=listComments.size() + " Comments" %></h4>
							<% for(int i = 0;i<listComments.size();i++){ %>
							<div class="comment-list">
								<div class="single-comment justify-content-between d-flex">
									<div class="user justify-content-between d-flex">
										<div class="thumb">
											<img src="Resources/assets/img/comment/comment_1.png" alt="">
										</div>
										<div class="desc">
											<p class="comment"><%= listComments.get(i).getCommentContent() %></p>
											<div class="d-flex justify-content-between">
												<div class="d-flex align-items-center">
													<h5>
														<a href="#"><%= listComments.get(i).getReader().getReaderName() %></a>
													</h5>
													<p class="date">December 4, 2017 at 3:12 pm</p>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							<%} %>
						</div>
						<!-- From -->
						<div class="row">
							<div class="col-lg-8">
								<form class="form-contact contact_form mb-80"
									action=<%= "CreateCommentController?NewsId="+news.getNewsId()%> method="post" id="contactForm"
									novalidate="novalidate">
									<div class="row">
										<div class="col-12">
											<div class="form-group">
												<textarea class="form-control w-100 error" name="message"
													id="message" cols="30" rows="9"
													onfocus="this.placeholder = ''"
													onblur="this.placeholder = 'Enter Message'"
													placeholder="Enter Message"></textarea>
											</div>
										</div>
									</div>
									<div class="form-group mt-3">
										<button type="submit"
											class="send-message-button">Send</button>
									</div>
								</form>
							</div>
						</div>
					</div>

					<div class="col-lg-4">
						<!-- Flow Socail -->
						<div class="single-follow mb-45">
							<div class="single-box">
								<div class="follow-us d-flex align-items-center">
									<div class="follow-social">
										<a href="#"><img
											src="Resources/assets/img/news/icon-fb.png" alt=""></a>
									</div>
									<div class="follow-count">
										<span>8,045</span>
										<p>Fans</p>
									</div>
								</div>
								<div class="follow-us d-flex align-items-center">
									<div class="follow-social">
										<a href="#"><img
											src="Resources/assets/img/news/icon-tw.png" alt=""></a>
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
										<a href="#"><img
											src="Resources/assets/img/news/icon-yo.png" alt=""></a>
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
	</main>
	<jsp:include page="../Components/ImportJSUser.jsp" />
</body>
</html>