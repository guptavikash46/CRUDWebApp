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

$("#removeStuForm").submit(function (event) {
    event.preventDefault();
    var studentID = $("#studentID").val();
    var userSelection = confirm("Are you sure, you want to remove the student with ID: "+ studentID+ " from the database?");

    if (userSelection){
        $.ajax({
            url: "http://localhost:8080/app/deleteStudent/"+studentID,
            type: "DELETE",
            dataType: "json",
        })
            .done(function (response) {
                if (response == true) {
                    alert("The student with ID: " + studentID + " is removed from the database.");
                    location.reload();
                }
                else {
                    alert("Oh! We couldn't remove the student. Please check the student ID once again.");
                    location.reload();
                }
            })
            .fail(function (xhr, status, errorThrown) {
                alert("Oops! looks like this error is rare and shouldn't happen, give us some time to think!");
                console.log(status);
                console.log(errorThrown);
            });
    }
    else {
        location.reload();
    }

});