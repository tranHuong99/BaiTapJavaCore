<%-- 
    Document   : footer
    Created on : Oct 4, 2019, 2:38:47 PM
    Author     : HUONG XINH GAI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lập trình bằng ngôn ngữ tự nhiên</title>
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
        <footer class="container-fluid bg-grey py-5" style="background-color: #233567">
            <div class="container">
                <div class="row">
                    <div class="col-md-6">
                        <div class="row">
                            <div class="col-md-6 " style="color: white; font-size: 14px">
                                <div class="logo-part">
                                    <img src="<c:url value="/resources/logo2.png" />" class="w-50 logo-footer" style="width: 350px; height: 50px" >
                                    <p>Số 141-đường Chiến Thắng-Tân Triều-Thanh Trì-Hà Nội</p>
                                    <p>Điện thoại: 0964 952 889</p>
                                    <p>Email: hotro@hocvienact.edu.vn</p>
                                </div>
                            </div>
                            <div class="col-md-6 px-4" style="color: white">
                                <h6 style="font-size: 20px"> VỀ CHÚNG TÔI</h6>
                                <p style="color: white; font-size: 14px">Học viện CNTT ACT  là sự hợp tác chính thức của Học viện kỹ thuật mật mã  với các tập đoàn Cisco Systems, Microsoft,... trong lĩnh vực đào tạo, nghiên cứu, triển khai Công nghệ thông tin (CNTT) và An toàn thông tin.</p>
                                <a href="#" class="btn-footer" style="color: #5edfff"> More Info </a><br>
                                <a href="#" class="btn-footer" style="color: #5edfff"> Contact Us</a>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="row">
                            <div class="col-md-6 px-4" style="color: white">
                                <h6 style="font-size: 20px">ACT TECHKID</h6>
                                <div class="row ">
                                    <div class="col-md-6" style="font-size: 14px">
                                        <ul>
                                            <li> <a href="${contextPath}/" style="color: #5edfff"> Trang chủ</a> </li>
                                            <li> <a href="#" style="color: #5edfff"> Giới thiệu</a> </li>
                                            <li> <a href="#" style="color: #5edfff"> Tin tức</a> </li>
                                            <li> <a href="#" style="color: #5edfff"> Các khóa học</a> </li>
                                            <li> <a href="${contextPath}/dangkyhoc" style="color: #5edfff"> Đăng ký học</a> </li>
                                            <li> <a href="#" style="color: #5edfff"> Liên hệ</a> </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6" style="color: white">
                                <h6 style="font-size: 20px"> SOCIAL</h6>
                                <div class="social">
                                    <a href="https://www.facebook.com/HocVienAct"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                                </div>
                                <form class="form-footer my-3">
                                    <input type="text"  placeholder="Tìm kiếm...." name="search">
                                    <input type="button" value="Go">
                                </form>
                                <p>Tìm kiếm chúng tôi trên Facebook hoặc nhập từ khóa</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
    </body>
</html>
