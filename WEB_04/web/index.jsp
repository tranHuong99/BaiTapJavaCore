<%-- 
    Document   : index
    Created on : Aug 18, 2019, 3:13:51 PM
    Author     : HUONG XINH GAI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-item nav-link active" href="#">Home <span class="sr-only">(current)</span></a>
                </div>
            </div>
        </nav>
        <br/>
        <br/>
        <div class="container">
            <table class="table">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Tên sách</th>
                        <th scope="col">Tác giả</th>
                        <th scope="col">Giá</th>
                        <th scope="col">Số lượng</th>
                        <th scope="col">Chức năng</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="item" items="${Book}">
                        <tr>
                            <th scope="row">${item.id}</th>
                            <td>${item.title}</td>
                            <td>${item.author}</td>
                            <td>${item.price}</td>
                            <td>${item.quantity}</td>
                            <td>
                                <button type="button" class="btn btn-primary"><a href="updateBookServlet?id=${item.id}" class="btn btn-primary">Sửa</a></button>
                                <button type="button" class="btn btn-danger"><a href="deleteBookServlet?id=${item.id}" onclick="remove()" class="btn btn-danger">Xóa</a></button>
                            </td>
                        </tr>
                    </c:forEach>
                    
                </tbody>
            </table>
            <button type="button" class="btn btn-success"><a href="add.jsp" style="color: white">Thêm mới</a></button>
            <script>
                function remove() {
                    confirm('Are you sure?');
                    
                }
            </script>
        </div>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </body>
</html>
