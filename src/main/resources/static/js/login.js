var login = {
    loginClick: function () {
        $("#login").click(function () {
            if($("#usrname").val() ==""|| $("#password").val() ==""){
                $("#spanReminde").html("账户或密码不能为空");
                return;
            }

            var param = {
                username:$("#usrname").val(),
                password: $("#password").val()
            }
            $.ajax({
                type: "post",
                data:JSON.stringify(param),
                dataType: 'json',
                contentType: "application/json",
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

