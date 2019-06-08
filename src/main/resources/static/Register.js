$("#registerForm").submit( function (e) {
    e.preventDefault();
    var username = $("#exampleInputEmail1").val();
    var password = $("#exampleInputPassword1").val();

    if (username.length > 0 && password.length > 0){
        $.ajax({
            url: "http://localhost:8080/signup/user",
            type: "POST",
            data: { uName: username,
                pass: password}

        })
            .done(function (value) {
                alert("User: "+username+" is successfully registered with ID: "+value+". You can now login");
                window.location.href = '/login';
            })
            .fail(function (xhr, status, errorThrown) {
                alert("Oops! looks like this error is rare and shouldn't happen, give us some time to think!");
                console.log(status);
                console.log(errorThrown);
            })
    }
    else {
        alert("Hahaha, gotcha! you can't register a ghost user. please enter some details.");
    }

});