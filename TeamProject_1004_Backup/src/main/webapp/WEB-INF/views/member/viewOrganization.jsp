<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>조직도</title>

<!-- css -->
	<link rel="stylesheet" type="text/css" href="resources/css/sideBar.css">
<!-- css -->

</head>
<body>
<!-- 왼쪽 메뉴바 -->
	<jsp:include page="../common/sideBar.jsp" flush="true"></jsp:include>
<!-- 왼쪽 메뉴바 -->

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">

</script>

<c:forEach items="${ organizationList }" var="organization" varStatus="status">
	부서명 : ${ organization.div_name } / 사원명 : ${ organization.member_name }<br>
</c:forEach>
</body>
</html>