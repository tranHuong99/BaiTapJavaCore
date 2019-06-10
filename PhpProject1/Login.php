 <html>
     <head>
         <meta charset="UTF-8">
         <title>check</title>
     </head>
     <body>
         <?php
            $user = "";
            if($_POST['username' == NULL]){
                echo 'Chưa nhập dữ liệu!';
                exit();
            }
            else{
                $user = $_POST['username'];
                if($user == "ADMIN")
                    echo 'Bạn đang sử dụng tên ADMIN';
                else 
                    echo 'Chào bạn '.$user;              
            }
         ?>
     </body>
 </html>