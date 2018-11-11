<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <spring:url  var="css" value="/resources/css"/>
    <spring:url  var="js" value="/resources/js"/>
    <spring:url  var="images" value="/resources/images"/>
    <c:set var="contextRoot" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Rewa Visit-${title}</title>

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/myapp.css" rel="stylesheet">

  </head>

  <body>
  <div class="wrapper">

    <!-- Navigation -->
    <%@include file="./shared/navbar.jsp" %>
    

    <!-- Page Content -->
    <div class="content">
<!--    Loading home content -->
<c:if test="${userClickHome==true}">
<%@include file="home.jsp" %>
</c:if>
<!--    Loading About us content -->
<c:if test="${userClickAboutUs==true}">
<%@include file="aboutUs.jsp" %>
</c:if>
<!-- Loading Gallary content -->
<%-- <c:if test="${userClickGallary==true}"> --%>
<%-- <%@include file="gallary.jsp" %> --%>
<%-- </c:if> --%>
<!--    Loading Contact content -->
<c:if test="${userClickContact==true}">
<%@include file="contact.jsp" %>
</c:if>

<c:if test="${userClickAllGallary==true or userClickCetegoryGallary==true}">
<%@include file="gallary.jsp" %>
</c:if>
</div>
       <!-- Footer -->
    <%@include file="./shared/footer.jsp" %>
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src="${js}/jquery.min.js"></script>
    <script src="${js}/bootstrap.bundle.min.js"></script>
</div>
  </body>

</html>
