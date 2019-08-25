<%-- 
    Document   : index
    Created on : Aug 14, 2019, 10:28:58 PM
    Author     : chellong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <title>Hello, world!</title>
    </head>
    <body>
        <nav style="background-color: #26BAAC" class="navbar navbar-expand-lg navbar-light">
            <a class="display-4 text-light navbar-brand" href="#">Tin Nhanh</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
        </nav>

        <div class="container">
            <form>
                <div class="form-group mt-5">
                    <label for="exampleInputEmail1">Search</label>
                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter value">
                </div>
                <button type="submit" style="background-color: #26BAAC" class="btn text-light">Submit</button>
            </form>

            <div class="mt-5">
                <c:forEach var="item" items="${news}">                
                    <div class="card">
                        <div class="card-body">
                            <div class="float-right">${item.date}</div>
                            <h5 class="card-title">${item.title}</h5>
                            <p class="card-text">${item.content}</p>
                            <small>author: ${item.author.id}</small>
                        </div>
                    </div>
                </c:forEach>

            </div>

            <nav class="mt-5">
                <ul class="pagination">
                    <c:choose>
                        <c:when test="${currentPage==1}">
                            <li class="page-item disabled"><a class="page-link" href="?page=${1}">Previous</a></li>
                            </c:when>    
                            <c:otherwise>
                            <li class="page-item"><a class="page-link" href="?page=${currentPage-1}">Previous</a></li>
                            </c:otherwise>
                        </c:choose>


                    <c:forEach var="index" begin="1" end="${totalPage}">
                        <c:choose>
                            <c:when test="${index==currentPage}">
                                <li class="active page-item"><a class="page-link" href="?page=${index}">${index}</a></li>
                            </c:when>    
                            <c:otherwise>
                                <li class="page-item"><a class="page-link" href="?page=${index}">${index}</a></li>
                            </c:otherwise>
                            </c:choose>
                        </c:forEach>

                    <c:choose>
                        <c:when test="${currentPage==totalPage}">
                            <li class="page-item disabled"><a class="page-link" href="?page=${1}">Next</a></li>
                            </c:when>    
                            <c:otherwise>
                            <li class="page-item"><a class="page-link" href="?page=${currentPage+1}">Next</a></li>
                            </c:otherwise>
                        </c:choose>

                </ul>
            </nav>
        </div>




        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>