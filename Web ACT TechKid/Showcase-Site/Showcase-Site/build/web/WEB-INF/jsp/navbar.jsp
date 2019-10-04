<%-- 
    Document   : navbar
    Created on : Oct 4, 2019, 2:21:10 PM
    Author     : HUONG XINH GAI
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lập trình C căn bản</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="<c:url value="/resources/assets/css/card.css" />" />
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,700,900" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700" rel="stylesheet">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </head>
    <body>
            <div style="background-image: url(https://images.freecreatives.com/wp-content/uploads/2016/03/White-Snow-Background.jpg); background-repeat: no-repeat; text-indent:10px; height: 400px">
                <div id="header">
                    <span class="left"><a href="${contextPath}/"><img src="<c:url value="/resources/logo.png" />" style="width: 260px; height: 80px; margin-top: 10px"/></a></span>
                </div>
                <div id="navbar">
                    <nav class="navbar navbar-expand-lg navbar-light bg-light" style="border-radius: 5px; margin-left: 10px; margin-right: 10px">
                        <a class="navbar-brand" href="${contextPath}/">Trang chủ</a>
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggle  r-icon"></span>
                        </button>

                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav mr-auto">
                                <li class="nav-item active">
                                    <a class="nav-link" href="${contextPath}/vechungtoi">Về chúng tôi</a>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: black">
                                        Các khóa học
                                    </a>
                                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                        <a class="dropdown-item" href="${contextPath}/laptrinhbangNNTN">Lập trình bằng ngôn ngữ tự nhiên</a>
                                        <a class="dropdown-item" href="${contextPath}/laptrinhCcanban">Lập trình C căn bản</a>
                                        <a class="dropdown-item" href="${contextPath}/giaithuatcanban">Khóa học Giải thuật căn bản</a>
                                        <a class="dropdown-item" href="${contextPath}/giaithuatnangcao">Khóa học Giải thuật nâng cao</a>
                                    </div>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#" style="color: black">Học online</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#" style="color: black">Thư viện</a>
                                </li>
                            </ul>
                            <form class="form-inline my-2 my-lg-0">
                                <input class="form-control mr-sm-2" type="search" placeholder="Tìm kiếm" aria-label="Search">
                                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Tìm kiếm</button>
                            </form>
                        </div>
                    </nav>
                </div>
                <div class="bd-example" style="margin-top: 20px">
                    <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
                        <ol class="carousel-indicators">
                            <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
                            <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
                            <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
                        </ol>
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <img src="http://www.hocvienact.edu.vn/images/slider/Java1.png" class="d-block w-100" alt="">
                            </div>
                            <div class="carousel-item">
                                <img src="http://www.hocvienact.edu.vn/images/slider/PHP1.png" class="d-block w-100" alt="">
                            </div>
                            <div class="carousel-item">
                                <img src="http://www.hocvienact.edu.vn/images/slider/KhoaArduino.png" class="d-block w-100" alt="">
                            </div>
                            <div class="carousel-item">
                                <img src="http://www.hocvienact.edu.vn/images/slider/KhoaCEH.png" class="d-block w-100" alt="">
                            </div>
                        </div>
                        <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>
                </div>
            </div>
    </body>
</html>
