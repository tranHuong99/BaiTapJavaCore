/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// element
var UserName = document.getElementById('username');
var Email = document.getElementById('email');
// var Password1 = document.getElementById('Password1');
// var Password2 = document.getElementById('Password2');
// var Phone = document.getElementById('Phone');
var Message = document.getElementById('message');
var Website = document.getElementById("website");


//error
var UsernameErr = document.getElementById('nameErr');
var EmailErr = document.getElementById('emailErr');
var MessageErr = document.getElementById("messageErr");
var WebsiteErr = document.getElementById("websiteErr");

// var PhoneErr = document.getElementById('phoneErr');
// var Password1Err = document.getElementById('Pass1Err');
// var Password2Err = document.getElementById('Pass2Err');

function goGg() {
    var name = UserName.value;
    var email = Email.value;
    var message = Message.value;
    var website = Website.value;
    if (name == "") {
        UsernameErr.innerText = "This field is required";
        UserName.style.border = "2px solid red";
    } else {
        UsernameErr.innerText = "";
        UserName.style.border = "1px solid gray";
    }

    //Email
    if (email == "") {
        EmailErr.innerText = "This field is required";
        Email.style.border = "2px solid red";
    } else {
        EmailErr.innerText = "";
        Email.style.border = "1px solid gray";
    }

    //Message

    if (message == "") {
        MessageErr.innerText = "This field is required";
        Message.style.border = "2px solid red";
    } else {
        MessageErr.innerText = "";
        Message.style.border = "1px solid gray";
    }

    //Website
    if (website == "") {
        WebsiteErr.innerText = "This field is required";
        Website.style.border = "2px solid red";
    } else {
        Website.innerText = "";
        Website.style.border = "1px solid gray";
    }
}
