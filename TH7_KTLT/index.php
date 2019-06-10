<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Xử lý form trong PHP</title>
    </head>
    <body>
        <!--Biến bắt đầu bằng $
        username và pass nên dùng POST vì nó sẽ mã hóa dữ liệu
        Post không giới hạn số lượng kí tự trong khi Get chỉ lấy đc tối đa 1024 kí tự-->
        -->
            <h1 style="color: blue; text-align: center; font-size: 40px; font-family: fantasy">Đăng ký</h1>
            <form name="Đăng ký" method="Post" style="color: red; font-size: 30px">
                Type of your name here: 
                <input type="text" name="username" size="30" style="width: 200px; height: 35px"/><br/>
                Type of your email:
                <input type="text" name="email" size="100" style="width: 200px; height: 35px"/><br/>
                <input type="submit" name="add" value="Submit" style="font-size: 15px; width: 100px; height: 35px; font-family: cursive"/><br/>
            </form>
            <?php
                $user = "";
                if($_POST['username' == NULL]){
                    echo 'Chưa nhập dữ liệu!';
                    exit();
                }
                else{
                    $user = $_POST['username'];
                    if($user = "ADMIN")
                        echo 'Bạn đang sử dụng tên ADMIN';
                    else 
                        echo 'Chào bạn '.$user;              
                }  
            ?>
    </body>
</html>
