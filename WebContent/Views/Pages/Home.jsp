<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<jsp:include page="../Components/ImportCSSUser.jsp" />
<body>
	<%@ include file="../Components/Header.jsp"%>
	<main>
		<jsp:include page="../Components/TrendingAreaNews.jsp" />
		<jsp:include page="../Components/WhatNews.jsp" />
	</main>
	<jsp:include page="../Components/ImportJSUser.jsp" />
</body>
</html>