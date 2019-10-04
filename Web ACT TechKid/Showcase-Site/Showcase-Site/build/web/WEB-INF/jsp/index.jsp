<%-- 
    Document   : index
    Created on : Oct 4, 2019, 2:36:22 PM
    Author     : HUONG XINH GAI
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang chủ</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="<c:url value="/resources/assets/css/card.css" />" />
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,700,900" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700" rel="stylesheet">
        
    </head>
<body>
    <div class="container">
        <jsp:include page="navbar.jsp" />
        <br/>
        <div class="course-name" style="margin-top: 30px">
            <button type="button" class="btn btn-primary btn-lg btn-block" style="background-color: white; color: black; border: none; font-size: 30px">Các khóa học Dạy lập trình cho trẻ em tại ACT TECHKID</button>
            <hr style="border-top: 2px solid #2a75ab; width: 120px; height: 2px; margin: 10px auto 10px;"/>
        </div>
        <br/>
        <div class="courses">
            <div class="row">
                <div class="col-sm">
                    <div class="column">
                        <!-- Post-->
                        <div class="post-module">
                            <!-- Thumbnail-->
                            <div class="thumbnail">
                                <div class="date">
                                    <div class="day">04</div>
                                    <div class="month">Oct</div>
                                </div><img src="http://hoctructuyen123.net/wp-content/uploads/2018/01/XuLyNgonNguTuNhien.jpg" /></div>
                            <!-- Post Content-->
                            <div class="post-content">
                                <div class="category">Khóa học</div>
                                <h1 class="title">Lập trình bằng ngôn ngữ tự nhiên</h1>
                                <h2 class="sub_title">Phù hợp với trẻ em từ 8 tuổi trở lên</h2>
                                <p class="description">Với xứ mệnh đưa trẻ tiếp cận gần hơn với lập trình, khóa học giúp trẻ tăng khả năng tư duy sáng tạo từ cuộc sống.</p>
                                <p class="description">Với phương pháp giảng dạy mới mẻ, thân thiện, môi trường học tập đầy đủ trang thiết bị sẽ kích thích sự hứng thú và ham học hỏi ở trẻ, tạo nền tảng lập trình ban đầu vững chắc cho các bé.</p>
                                <div class="post-meta"><a href="${contextPath}/laptrinhbangNNTN" class="btn btn-primary" style="color: white">Chi tiết</a></div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-sm">
                    <div class="column">
                        <!-- Post-->
                        <div class="post-module">
                            <!-- Thumbnail-->
                            <div class="thumbnail">
                                <div class="date">
                                    <div class="day">04</div>
                                    <div class="month">Oct</div>
                                </div><img src="https://4.bp.blogspot.com/-ubGcWyAcVRs/WwMRR1nJRhI/AAAAAAAATd8/2SIjZE1xfT4qKpJm0hgQ0NZLrPKUO6D9gCLcBGAs/s1600/cprogram.jpg" /></div>
                            <!-- Post Content-->
                            <div class="post-content">
                                <div class="category">Khóa học</div>
                                <h1 class="title">Lập trình C căn bản</h1>
                                <h2 class="sub_title">Phù hợp với trẻ em từ 8 tuổi trở lên</h2>
                                <p class="description">Tiếp nối khóa học Lập trình bằng ngôn ngữ tự nhiên, khóa học này sẽ giúp trẻ thay đổi thói quen sử dụng máy tính.</p>
                                <p class="description">Với chương trình học phù hợp với khả năng tiếp nhận theo lứa tuổi, khóa học sẽ đưa đến cho các bé các kiến thức căn bản của ngôn ngữ lập trình C.</p>
                                <div class="post-meta"><a href="${contextPath}/laptrinhCcanban" class="btn btn-primary" style="color: white">Chi tiết</a></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <br/>
            <div class="row">
                <div class="col-sm">
                    <div class="column">
                        <!-- Post-->
                        <div class="post-module">
                            <!-- Thumbnail-->
                            <div class="thumbnail">
                                <div class="date">
                                    <div class="day">04</div>
                                    <div class="month">Oct</div>
                                </div><img src="https://hostingviet.vn/data/images/article/tuyen-lap-trinh-vien-php.jpg" /></div>
                            <!-- Post Content-->
                            <div class="post-content">
                                <div class="category">Khóa học</div>
                                <h1 class="title">Giải thuật căn bản</h1>
                                <h2 class="sub_title">Phù hợp với trẻ em từ 8 tuổi trở lên</h2>
                                <p class="description">Với khóa học này, chúng tôi mong muốn giúp các bé có thể tiếp cận với giải thuật lập trình một cách thân thiện nhất.</p>
                                <p class="description">Các bé sẽ được đào tạo bằng những phương pháp vô cùng hiệu quả như: sơ đồ tư duy (mindmap), giải bài toán gắn với những ví dụ thực tiễn...</p>
                                <div class="post-meta"><a href="${contextPath}/giaithuatcanban" class="btn btn-primary" style="color: white">Chi tiết</a></div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-sm">
                    <div class="column">
                        <!-- Post-->
                        <div class="post-module">
                            <!-- Thumbnail-->
                            <div class="thumbnail">
                                <div class="date">
                                    <div class="day">04</div>
                                    <div class="month">Oct</div>
                                </div><img src="http://tiasang.com.vn/Portals/0/developer-dtt%201.jpg" /></div>
                            <!-- Post Content-->
                            <div class="post-content">
                                <div class="category">Khóa học</div>
                                <h1 class="title">Lập trình bằng ngôn ngữ tự nhiên</h1>
                                <h2 class="sub_title">Phù hợp với trẻ em từ 8 tuổi trở lên</h2>
                                <p class="description">Với xứ mệnh đưa trẻ tiếp cận gần hơn với lập trình, khóa học giúp trẻ tăng khả năng tư duy sáng tạo từ cuộc sống.</p>
                                <p class="description">Với phương pháp giảng dạy mới mẻ, thân thiện, môi trường học tập đầy đủ trang thiết bị sẽ kích thích sự hứng thú và ham học hỏi ở trẻ, tạo nền tảng lập trình ban đầu vững chắc cho các bé.</p>
                                <div class="post-meta"><a href="${contextPath}/giaithuatnangcao" class="btn btn-primary" style="color: white">Chi tiết</a></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <br/><br/>
        <div class="strength">
            <div class="card-group">
                <div class="card" style="height: 200px; background-color: #2b87da; border: none; text-align: center; color: white">
                    <br/>
                    <div class="card-body">
                        <h1 class="card-title" style="font-size: 50px">200+</h1>
                        <p class="card-text">Học viên tham gia</p>
                    </div>
                </div>
                <div class="card" style="height: 200px; background-color: #2b87da; border: none; text-align: center; color: white">
                    <br/>
                    <div class="card-body">
                        <h1 class="card-title" style="font-size: 50px">100%</h1>
                        <p class="card-text">Được học lại miễn phí</p>
                    </div>
                </div>
                <div class="card" style="height: 200px; background-color: #2b87da; border: none; text-align: center; color: white">
                    <br/>
                    <div class="card-body">
                        <h1 class="card-title" style="font-size: 50px">95%</h1>
                        <p class="card-text">Hài lòng với khóa học</p>
                    </div>
                </div>
            </div>
        </div>
        <br/>
        <div class="course-name" style="margin-top: 30px">
            <button type="button" class="btn btn-primary btn-lg btn-block" style="background-color: white; color: black; border: none; font-size: 30px">Tại sao chọn ACT TECHKID là nơi gửi gắm các bé?</button>
            <hr style="border-top: 2px solid #2a75ab; width: 120px; height: 2px; margin: 10px auto 10px;"/>
        </div>
        <br/>
        <div class="benefits">
            <div class="card-group">
                <div class="card" style="border: none">
                    <img src="<c:url value="/resources/giangvien.png" />" class="card-img-top" style="width: 70px; height: 60px">
                    <div class="card-body">
                        <h5 class="card-title">Giảng viên giàu kinh nghiệm</h5>
                        <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                    </div>
                </div>
                <div class="card" style="border: none">
                    <img src="<c:url value="/resources/cosovatchat.png" />" class="card-img-top" style="width: 60px; height: 60px">
                    <div class="card-body">
                        <h5 class="card-title">Cơ sở vật chất hiện đại</h5>
                        <p class="card-text">This card has supporting text below as a natural lead-in to additional content.</p>
                    </div>
                </div>
                <div class="card" style="border: none">
                    <img src="<c:url value="/resources/chiphihoctap.png" />" class="card-img-top" style="width: 60px; height: 60px">
                    <div class="card-body">
                        <h5 class="card-title">Chi phí học tập thấp</h5>
                        <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>
                    </div>
                </div>
                <div class="card" style="border: none">
                    <img src="<c:url value="/resources/baohanhtrondoi.png" />" class="card-img-top" style="width: 60px; height: 60px">
                    <div class="card-body">
                        <h5 class="card-title">Bảo hành trọn đời</h5>
                        <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>
                    </div>
                </div>
            </div>
        </div>
        <br/>
        <div class="feedbacks" style="background-image: url(https://daertube.files.wordpress.com/2012/06/blue-background_8632_1.jpg); height: 400px">
            <div class="course-name" style="margin-top: 30px">
                <button type="button" class="btn btn-primary btn-lg btn-block" style="background-color: #064acb; color: white; border: none; font-size: 30px">CẢM NHẬN CỦA HỌC VIÊN</button>
                <hr style="border-top: 2px solid #2a75ab; width: 120px; height: 2px; margin: 10px auto 10px; border-color: white"/>
                <p style="text-align: center; color: white">Cảm nhận của học viên sau Khóa học</p>
            </div>
            <img class="cangiua" src="<c:url value="/resources/hocvien1.png" />" style="width: 150px; height: 150px">
            <p style="text-align: center; color: white; margin-left: 200px; margin-right: 200px">"Học ở đây con cảm thấy rất vui và hứng thú. Thầy giáo và các anh chị trợ giảng đều rất vui vẻ và nhiệt tình. Thầy thường cho chúng con chơi các trò chơi gắn liền với giải bài tập."</p>
            <p style="text-align: right; color: #f8f9fa; margin-right: 200px"><i>Bé Văn Trần Quốc Dũng - học viên lớp Giải thuật CB-03</i></p>
        </div>
        <br/><br/><br/>
        <div style="float: left; width: 100%">
            <div style="float: left; width: 25%">
                <img class="cangiua" src="http://www.hocvienact.edu.vn/images/Cisco_logo.png">
            </div>
            <div style="float: left; width: 25%">
                <img class="cangiua" src="http://www.hocvienact.edu.vn/images/ms-it.png">
            </div>
            <div style="float: left; width: 25%">
                <img class="cangiua" src="http://www.hocvienact.edu.vn/images/lpi.png">
            </div>
            <div style="float: left; width: 25%">
                <img class="cangiua" src="http://www.hocvienact.edu.vn/images/prometric_test_center.gif">
            </div>
        </div>
        <br/><br/><br/><br/>
    </div>

                    
    <br/><br/><br/>
    <jsp:include page="footer.jsp" />

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <script
        src="https://code.jquery.com/jquery-3.4.1.min.js"
        integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
        crossorigin="anonymous">
    </script>
    <script src="<c:url value="/resources/assets/js/card.js" />" > </script>
    </body>
</html>
