<%-- 
    Document   : edit
    Created on : Aug 1, 2019, 10:03:25 AM
    Author     : HUONG XINH GAI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    </head>
    <body>
        <header class="container-fluid">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <img src="https://scontent.fhan2-1.fna.fbcdn.net/v/t1.0-9/41155325_1660879110708099_1566664341409759232_n.jpg?_nc_cat=102&_nc_oc=AQlC4w7wgvKn027pjV5GkLjWxVEwA4HI8NrYfmytE0u_jAwpaPmaISQ_AQzakK8cDZM&_nc_ht=scontent.fhan2-1.fna&oh=8864ad5979c91042558a608dc106c0fa&oe=5DD9FC4A" alt="background">
                    </div>
                </div>
            </div>
        </header>

        <div class="container-fluid">
            <div class="container">
                <br/>
                <div class="row">
                    <div class="col-md-9">
                        <h1>Sửa student</h1>
                        
                        <form class="col-md-6" method="Get" action="Edit" modelAttribute="edit">
                            <div class="form-group">
                                <label for="name">ID</label>
                                <input type="number" class="form-control" value="${edit.id}" id="id" aria-describedby="emailHelp" name="id">
                            </div>
                            <div class="form-group">
                                <label for="name">Họ tên</label>
                                <input type="text" class="form-control" id="hoTen" value="${edit.hoTen}" aria-describedby="emailHelp" placeholder="nguyen van a" name="name">

                            </div>
                            <div class="form-group">
                                <label for="major">Khoa</label>
                                <input class="form-control" id="email" placeholder="ATTT" name="khoa" value="${edit.khoa}">
                            </div>

                            <div class="form-group">
                                <label for="className">Lớp</label>
                                <input class="form-control" id="address" placeholder="AT14"  value ="${edit.lop}" name="lop">
                            </div>

                            <button type="submit" class="btn btn-primary">Submit</button>
                        </form>
                    </div>
                </div>

            </div>
        </div>
    </body>
</html>
