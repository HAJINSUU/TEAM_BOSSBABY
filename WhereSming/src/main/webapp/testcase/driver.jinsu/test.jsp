<%@page import="com.wheresming.review.ReviewViewerDTO"%>
<%@page import="com.wheresming.review.ReviewDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.wheresming.review.ReviewViewerDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%


	ReviewViewerDAO dao = new ReviewViewerDAO();
	
	List<ReviewViewerDTO> list = null;
	
	list = dao.selectAllReview(11973);
	

%>

<%= list.get(0).getCmt_content() %>

</body>
</html>