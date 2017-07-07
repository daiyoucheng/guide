var login = {
    loginClick: function () {
        $("#login").click(function () {
            debugger;
            if($("#usrname").val() ==""|| $("#password").val() ==""){
                $("#spanReminde").html("账户或密码不能为空");
                return;
            }
            $.ajax({
                type: "POST",
                url: "/login/longinSearch",
                success: function(msg){
                    alert( "Data Saved: " + msg );
                }
            });
        })
    }
}

$(document).ready(function () {
    document.getElementsByTagName("body")[0].style.height=  window.screen.availHeight*0.94 + "px";
    login.loginClick();
})

