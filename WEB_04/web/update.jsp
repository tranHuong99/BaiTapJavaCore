<%-- 
    Document   : add
    Created on : Aug 18, 2019, 4:01:00 PM
    Author     : HUONG XINH GAI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sửa thông tin</title>
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
        <div class="container">
            <br/>
            <br/>
            <form class="needs-validation" novalidate action="updateBookServlet" method="POST">
                <div class="form-row">
                    <div class="col-md-6 mb-3">
                        <label for="id">Id</label>
                        <input type="text" class="form-control" id="title" name="id" readonly="true" value="${book.id}">
                    </div>
                </div>
                <div class="form-row">
                    <div class="col-md-6 mb-3">
                        <label for="title">Tên sách</label>
                        <input type="text" class="form-control" id="title" placeholder="Math" name="title" value="${book.title}">
                    </div>
                </div>
                <div class="form-row">
                    <div class="col-md-6 mb-3">
                        <label for="author">Tác giả</label>
                        <input type="text" class="form-control" id="author" placeholder="Otto" name="author" value="${book.author}">
                    </div>
                </div>
                <div class="form-row">
                    <div class="col-md-6 mb-3">
                        <label for="price">Giá</label>
                        <input type="text" class="form-control" id="price" placeholder="12.3" name="price" value="${book.price}">
                    </div>
                </div>
                <div class="form-row">
                    <div class="col-md-6 mb-3">
                        <label for="quantity">Số lượng</label>
                        <input type="text" class="form-control" id="quantity" placeholder="20" name="quantity" value="${book.quantity}">
                    </div>
                </div>
                <button class="btn btn-primary" type="submit">Thêm</button>
            </form>
        </div>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

    </body>
</html>
