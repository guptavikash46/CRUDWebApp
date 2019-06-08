$(document).ready(function () {
    var dropDownMenu = $("#uniSelect");
   $.ajax({
       url: "http://localhost:8080/app/universities",
       type: "GET",
       dataType: "json",
       
   })
       .done(function (universityDetails) {
           $.each(universityDetails, function (i, names) {
               dropDownMenu.append("<option value="+i+">"+names.univ_name+"</option>");
           });
       })
       .fail(function (xhr, status, errorThrown ) {
           alert("Oops! looks like this error is rare and shouldn't happen, give us some time to think!");
           console.log(status);
           console.log(errorThrown);
       })
});

$("#logOutButton").on("click", function () {
    var value = confirm("Are you sure you want to logout?");
    if (value == true)
        window.location.href = "/logout";

});
$("#addStudentOption").on("click", function () {
    window.location.href = "/app/addStudent";

});
$("#allStudentOption").on("click", function () {
    window.location.href = "/app/students";

});
$("#removeStudentOption").on("click", function () {
    window.location.href = "/app/removeStu";

});
//addStudent button functionality

$("#addStudentForm").submit( function (e) {
    e.preventDefault();

    var name = $("#stuName").val();
    var course = $("#course").val();
    var age = $("#age").val();
    var email = $("#email").val();
    var university = $("#uniSelect option:selected").text();

    if (university != "choose here") {

        //obtaining university ID & then adding the student to the database.
        $.ajax({
            url: "http://localhost:8080/app/getUniID/"+university,
            type: "GET",
            dataType: "json",
        })
            .done(function (value) {
                console.log(value);

                $.ajax({
                    url: "http://localhost:8080/app/addStudent",
                    type: "POST",
                    data: {name: name, course: course, age: age, email: email, uniID: value},
                    dataType: "json",
                })
                    .done(function (response) {
                        if (response.stu_id != null) {
                            alert("Student with ID: " + response.stu_id + " is successfully registered in the database.");
                            location.reload();
                        }
                        else {
                            alert("Sorry! there's something not right! we couldn't register you.");
                        }
                    })
                    .fail(function (xhr, status, errorThrown) {
                        alert("Oops! looks like this error is rare and shouldn't happen, give us some time to think!");
                        console.log(status);
                        console.log(errorThrown);

                    })
            })
            .fail(function (xhr, status, errorThrown) {
                alert("Error in Get request in getting University ID");
                console.log(status);
                console.log(errorThrown);
            });
    }
    else{
        alert("Please select the university!");
    }
});
