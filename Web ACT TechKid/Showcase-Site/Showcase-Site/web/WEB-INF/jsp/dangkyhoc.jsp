<%-- 
    Document   : dangkyhoc
    Created on : Oct 2, 2019, 10:48:34 PM
    Author     : HUONG XINH GAI
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="UTF-8" contentType="text/html;charset=UTF-8"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng ký học</title>        
        <link rel="stylesheet" href="<c:url value="/resources/assets/css/dangky.css" />" />
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,700,900" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <%--
        <div id="form-main">
            <div id="form-div">
                <form class="form" id="form1">
                    <p class="name">
                        <input name="name" type="text" class="validate[required,custom[onlyLetter],length[0,100]] feedback-input" placeholder="Họ tên" id="name" />
                    </p>
                    <p class="phone">
                        <input name="Phone" type="tel" class="validate[required,custom[email]] feedback-input" id="email" placeholder="Số điện thoại" />
                    </p>                    
                    <p class="email">
                        <input name="email" type="text" class="validate[required,custom[email]] feedback-input" id="email" placeholder="Email" />
                    </p>
                    <p class="text">
                        <textarea name="text" class="validate[required,length[6,300]] feedback-input" id="comment" placeholder="Tên khóa học"></textarea>
                    </p>
                    <div class="submit">
                        <input type="submit" value="SEND" id="button-blue"/>
                        <div class="ease"></div>
                    </div>
                </form>
            </div>
        </div>--%>
        
        <div id="form-main">
            <div id="form-div">
                <form:form method="POST" class="form" id="form1"
                           action="${contextPath}/dangkyhoc" modelAttribute="user">
                    <p class="name">
                        <form:input path="name" class="feedback-input" placeholder="Họ tên"/>
                    </p>
                    <p class="phone">
                        <form:input path="phone" class="feedback-input" placeholder="Số điện thoại"/>
                    </p>
                    <p class="email">
                        <form:input path="email" class="feedback-input" placeholder="Email"/>
                    </p>
                    <p class="course">
                        <form:textarea path="course" class="feedback-input" placeholder="Tên khóa học"/>
                    </p>
                    <div class="submit">
                        <input type="submit" value="SEND" id="button-blue"/>
                        <div class="ease"></div>
                    </div>
                </form:form>
            </div>
        </div>
        
        
        
        
    </body>
</html>
