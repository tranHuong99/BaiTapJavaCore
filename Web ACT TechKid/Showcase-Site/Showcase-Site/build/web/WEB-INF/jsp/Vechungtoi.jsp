<%-- 
    Document   : Vechungtoi
    Created on : Oct 4, 2019, 6:57:49 PM
    Author     : HUONG XINH GAI
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Về chúng tôi</title>
        <link rel="stylesheet" href="<c:url value="/resources/assets/css/vechungtoi.css" />" />
    </head>
    <body>
        <div class="slider-container">
            <div class="slider-control left inactive"></div>
            <div class="slider-control right"></div>
            <ul class="slider-pagi"></ul>
            <div class="slider">
                <div class="slide slide-0 active">
                    <div class="slide__bg"></div>
                    <div class="slide__content">
                        <svg class="slide__overlay" viewBox="0 0 720 405" preserveAspectRatio="xMaxYMax slice">
                        <path class="slide__overlay-path" d="M0,0 150,0 500,405 0,405" />
                        </svg>
                        <div class="slide__text">
                            <h2 class="slide__text-heading">Thành lập</h2>
                            <p class="slide__text-desc">Học viện Công nghệ thông tin ACT TechKid được thành lập ngày 26-07-1999 do giảng viên Ths.Hoàng Thanh Nam trực tiếp điều hành.</p>
                            <p class="slide__text-desc">Trải qua 20 năm thành lập và phát triển, ACT TechKid đã trở thành trung tâm tin học với chất lượng đào tạo tốt, xuất sắc đạt TOP1 những trung tâm tin học tại Hà Nội.</p>
                            <a class="slide__text-link">ẢNH</a>
                        </div>
                    </div>
                </div>
                <div class="slide slide-1 ">
                    <div class="slide__bg"></div>
                    <div class="slide__content">
                        <svg class="slide__overlay" viewBox="0 0 720 405" preserveAspectRatio="xMaxYMax slice">
                        <path class="slide__overlay-path" d="M0,0 150,0 500,405 0,405" />
                        </svg>
                        <div class="slide__text">
                            <h2 class="slide__text-heading">Chương trình đào tạo</h2>
                            <p class="slide__text-desc">Các khóa học tại ACT TechKid hướng tới đào tạo và giáo dục cho lớp trẻ em độ tuổi từ 8-15 tuổi.</p>
                            <p class="slide__text-desc">Với chương trình học được biên soạn và giảng dạy bởi các giáo sư, tiến sĩ đầu ngành, phù hợp với độ tuổi và nhận thức của trẻ.</p>
                            <a class="slide__text-link">ẢNH</a>
                        </div>
                    </div>
                </div>
                <div class="slide slide-2">
                    <div class="slide__bg"></div>
                    <div class="slide__content">
                        <svg class="slide__overlay" viewBox="0 0 720 405" preserveAspectRatio="xMaxYMax slice">
                        <path class="slide__overlay-path" d="M0,0 150,0 500,405 0,405" />
                        </svg>
                        <div class="slide__text">
                            <h2 class="slide__text-heading">Đội ngũ giảng viên</h2>
                            <p class="slide__text-desc">Giảng viên các khóa học tại ACT TEchKid đều là những giáo sư, tiến sĩ đã có nhiều năm kinh nghiệm trong nghề, đã có thời gian du học ở các nước Châu Âu như: Anh, Nga, Mỹ,...</p>
                            <a class="slide__text-link">ẢNH</a>
                        </div>
                    </div>
                </div>
                <div class="slide slide-3">
                    <div class="slide__bg"></div>
                    <div class="slide__content">
                        <svg class="slide__overlay" viewBox="0 0 720 405" preserveAspectRatio="xMaxYMax slice">
                        <path class="slide__overlay-path" d="M0,0 150,0 500,405 0,405" />
                        </svg>
                        <div class="slide__text">
                            <h2 class="slide__text-heading">Liên kết</h2>
                            <p class="slide__text-desc">Học viện CNTT ACT TechKid là sự hợp tác chính thức của Học viện kỹ thuật mật mã  với các tập đoàn Cisco Systems, Microsoft,... trong lĩnh vực đào tạo, nghiên cứu, triển khai Công nghệ thông tin (CNTT) và An toàn thông tin.</p>
                            <a class="slide__text-link">ẢNH</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script
  src="https://code.jquery.com/jquery-3.4.1.min.js"
  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
  crossorigin="anonymous"></script>
        <script src="<c:url value="/resources/assets/js/vechungtoi.js" />" > </script>

    </body>
</html>
