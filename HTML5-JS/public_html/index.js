/*var rs = confirm ("Are you Ready?");       
alert("Now, let's go!");       
document.write(" Welcome! "); //in nội dung lên web (thường thì k dùng)
document.write(rs);
//dùng cửa sổ console
console.log('Nguoi dung da chon', rs, rs); //tương đương lệnh print
function move(){
    var eleB  =document.getElementsById("btn");
    var posX  = Math.round(Math.random()*300);
    var posY  = Math.round(Math.random()*300);
    eleB.style.position = 'absolute';
    eleB.style.top = posX + 'px';
    eleB.style.left = posY +'px';
}
function goGoogle(){
    var ele = document.getElementsById("name");
    var ele1 = document.getElementsById("welcome");
    ele1.innerHTML = "Hello, "+ele.value;
    ele1.style = "color:blue";
   }*/

function calc(opt) {
    var num1 = document.getElementById("a");
    var a = parseFloat(num1.value);
    var num2 = document.getElementById("b");
    var b = parseFloat(num2.value);
    var kq = 0;
    switch(opt) {
        case '+' : kq = a+b; break;
        case '-' : kq = a-b; break;
        case '*' : kq = a*b; break;
        case '/' : kq = a/b; break;
           
    }
    //kết quả
    var rs = document.getElementById("rs");
    rs.value = kq;
}
