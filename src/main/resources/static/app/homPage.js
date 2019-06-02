$(document).ready(function () {



});

$("#logOutButton").on("click", function () {
    var value = confirm("Are you sure you want to logout?");
    if (value == true)
    window.location.href = "/logout";

});
$("#addStudentOption").on("click", function () {
    window.location.href = "/app/addStudent";

});