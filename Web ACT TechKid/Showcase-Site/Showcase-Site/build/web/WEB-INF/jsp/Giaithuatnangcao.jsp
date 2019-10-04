<%-- 
    Document   : LaptrinhbangNNTN
    Created on : Sep 30, 2019, 11:09:01 AM
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
        <div class="container">
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
                                    <a class="nav-link" href="#">Về chúng tôi</a>
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
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <img src="http://www.hocvienact.edu.vn/images/slider/KhoaCEH.png" class="d-block w-100" alt="">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <br/>
            <div class="card">
                <div class="card-header">
                    Trang chủ > Giải thuật nâng cao
                </div>
                <div class="card mb-3" style="border: none">
                    <div class="row no-gutters">
                        <div class="col-md-8">
                            <div class="card-body">
                                <h5 class="card-title">Giải thuật nâng cao</h5>
                                <p style="color: #999999">2019-10-02</p>
                                <p class="card-text">- Đối tượng: Học viên từ 8-10 tuổi trở lên</p>
                                <p class="card-text">- Thời gian học: 45h</p>
                                <p class="card-text">- Số buổi: 25 buổi (2-2.5h/buổi), 2 buổi/tuần</p>
                                <p class="card-text">--------------------------------------</p>
                                <p class="card-text">Cái cây muốn tốt, phải có một cái gốc khỏe mạnh! Việc học lập trình cũng vậy! Hãy để những kiến thức của ngôn ngữ lập trình C vun đắp
                                    nền móng vững chắc cho con đường trở thành lập trình viên tương lai của bé!
                                </p>
                                <a href="${contextPath}/dangkyhoc?course=3" class="btn btn-primary">Đăng ký ngay</a>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <br/>
                            <img style="width: 350px; height: 300px" src="https://minhhien.com.vn/sites/default/files/top-5-cong-nghe-lap-trinh-giup-sinh-vien-it-top-5-cong-nghe-lap-trinh-giup-sinh-vien-it-vuot-b-1536561619-329-width660height495.jpg" class="card-img">
                        </div>
                    </div>
                </div>
                <br/><br/>
                <div class="card mb-3" style="border: none; background-color: #f8f9fa">
                    <br/>
                    <div class="row no-gutters">
                        <div class="col-md-4">
                            <img src="<c:url value="/resources/camket.jpg" />" class="card-img">
                        </div>
                        <div class="col-md-8">
                            <div class="card-body">
                                <h5 class="card-title">Cam kết sau khóa học</h5>
                                <p class="card-text">100% học sinh có thể mô tả 1 bài toán lập trình bằng ngôn ngữ tự nhiên.</p>
                                <p class="card-text">100% học sinh được làm việc nhóm, học cách thuyết trình tự tin về ý tưởng của mình.</p>
                                <p class="card-text">100% học sinh được nâng cao khả năng tư duy logic, tư duy giải quyết vấn đề và sáng tạo, những tư duy quan trọng nhất của thế kỷ 21.</p>
                                <a href="#" class="btn btn-primary" style="background-color: white; color: black; border-color: black">Video buổi học</a>
                            </div>
                        </div>
                    </div>
                    <br/>
                </div>
                <div class="course-name" style="margin-top: 30px">
                    <button type="button" class="btn btn-primary btn-lg btn-block" style="background-color: white; color: black; border: none; font-size: 30px">Nội dung khóa học</button>
                    <hr style="border-top: 2px solid #2a75ab; width: 120px; height: 2px; margin: 10px auto 10px;"/>
                </div>
                <div class="card-deck">
                    <div class="card">
                        <img src="http://f.imgs.vietnamnet.vn/2018/01/22/12/hoc-sinh-lop-1-va-2-se-duoc-lam-quen-tieng-anh-o-chuong-trinh-moi-the-nao-1.jpg" class="card-img-top" style="height: 200px">
                        <div class="card-body">
                            <h5 class="card-title">Card title</h5>
                            <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                        </div>
                        <div class="card-footer">
                            <small class="text-muted">Thời lượng: 15h</small>
                        </div>
                    </div>
                    <div class="card">
                        <img src="https://3er1viui9wo30pkxh1v2nh4w-wpengine.netdna-ssl.com/wp-content/uploads/2016/11/1-5826bee63e230.png" class="card-img-top" style="height: 200px">
                        <div class="card-body">
                            <h5 class="card-title">Card title</h5>
                            <p class="card-text">This card has supporting text below as a natural lead-in to additional content.</p>
                        </div>
                        <div class="card-footer">
                            <small class="text-muted">Thời lượng: 15h</small>
                        </div>
                    </div>
                    <div class="card">
                        <img src="http://excelenglish.edu.vn/wp-content/uploads/2017/09/Excel-English-Wecode-2017-Thang-Long-Kidsmart.jpg" class="card-img-top" style="height: 200px">
                        <div class="card-body">
                            <h5 class="card-title">Card title</h5>
                            <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>
                        </div>
                        <div class="card-footer">
                            <small class="text-muted">Thời lượng: 15h</small>
                        </div>
                    </div>
                </div>
                <br/>
                <%--<div class="card-body" style="float: left">
                    <div style="float: left; width: 50%">
                        <h5 class="card-title">Lập trình bằng ngôn ngữ tự nhiên</h5>
                        <p style="color: #999999">2019-10-02</p>
                        <p class="card-text">- Đối tượng: Học viên từ 8 tuổi trở lên</p>
                        <p class="card-text">- Thời gian học: 45h</p>
                        <p class="card-text">- Số buổi: 25 buổi (2-2.5h/buổi), 2 buổi/tuần</p>
                        <p class="card-text">--------------------------------------</p>
                        <p class="card-text">Chỉ cần kích thích trẻ học đúng cách, khả năng phát triển của các bé là rất cao. Lập trình cũng vậy! 
                        Hãy để cho con bạn tiếp cận với lập trình một cách tự nhiên và nhẹ nhàng nhất.Và biết đâu những đứa trẻ nhà bạn hôm nay sẽ là những Bill Gates, Nguyễn Hà Đông của tương lai ?
                        </p>
                        <a href="#" class="btn btn-primary">Đăng ký ngay</a>
                    </div>
                    <div style="float: left; width: 50%">
                        <img src="https://afamilycdn.com/thumb_w/600/2019/7/6/3287244-phuong-phap-ren-luyen-su-0-1562381338966862147607-crop-1562381361168954311302.jpg" style="width: 400px">
                    </div>
                </div>--%>
            </div>
            <br/>
            <a class="btn btn-danger" style="width: 150px; font-size: 25px" href="${contextPath}/dangkyhoc?course=3">Đăng ký</a>
        </div>
        <script
            src="https://code.jquery.com/jquery-3.4.1.min.js"
            integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
            crossorigin="anonymous">
        </script>
        <script src="<c:url value="/resources/assets/js/card.js" />" > </script>
        <br/><br/><br/>
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
                                            <li> <a href="#" style="color: #5edfff"> Trang chủ</a> </li>
                                            <li> <a href="#" style="color: #5edfff"> Giới thiệu</a> </li>
                                            <li> <a href="#" style="color: #5edfff"> Tin tức</a> </li>
                                            <li> <a href="#" style="color: #5edfff"> Các khóa học</a> </li>
                                            <li> <a href="#" style="color: #5edfff"> Đăng ký học</a> </li>
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
                                    <input type="button" value="Go" >
                                </form>
                                <p>Tìm kiếm chúng tôi trên Facebook hoặc nhập từ khóa</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
