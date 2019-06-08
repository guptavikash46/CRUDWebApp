$("#loginForm").submit(function (event) {
    event.preventDefault();
    $.ajax({
        url: "http://localhost:8080/login/user",
        type: "GET",
        dataType: 'json',
        data: { uName: $("#exampleInputEmail1").val(),
            pass: $("#exampleInputPassword1").val()}
    })
        .done(function (value) {
            if(value == true){
                $(document).ajaxSuccess(function () {
                    window.location.href = '/app/home';
                })
            }
            else {
                alert("Wrong credentials entered");
            }
            })
        .fail(function (xhr, status, errorThrown) {
            alert("Oops! looks like this error is rare and shouldn't happen, give us some time to think!");
            console.log(status);
            console.log(errorThrown);
        })
});


