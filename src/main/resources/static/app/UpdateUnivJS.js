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

$("#addUnivOption").on("click", function () {
    window.location.href = "/app/addUniversity";
});

$("#allUnivOption").on("click", function () {
    window.location.href = "/app/allUniversities";
});

$("#updateUnivOption").on("click", function () {
   window.location.href = "/app/updateUniversities";
});