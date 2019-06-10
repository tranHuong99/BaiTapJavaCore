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
        <!--Biến bắt đầu bằng $-->
            <h1 style="color: blue; text-align: center; font-size: 40px">Đăng ký</h1>
            <form name="Đăng ký" action="login.php" method="Post" style="color: red; margin: auto; padding: auto">
                Name: 
                <input type="text" name="username" size="40"/><br/>
                Email:
                <input type="text" name="email" size="40"/><br/>
                Date of birth:
                <input type="text" name="date" size="40"/><br/>
                Sex:
                <input type="text" name="sex" size="40"/><br/>
                <input type="submit" name="add" value="Submit" style="font-size: 15px; width: 100px; height: 35px; font-family: cursive"/><br/>
            </form>
    </body>
</html>
