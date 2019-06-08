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

$("#addUniversityForm").submit(function (event) {
    event.preventDefault();
    var univName = $("#uniName").val();
    var univCountry = $("#country").val();

    $.ajax({
        url: "http://localhost:8080/app/addUniv",
        type: "POST",
        data: { UniName: univName, UniCountry: univCountry},
        dataType: "json",
    })
        .done(function (response) {
            console.log(response);
                alert("Successfully added the university: "+ response.univ_name+ " in the database.");
                location.reload();
        })
        .fail(function (xhr, status, errorThrown) {
            alert("Oops! looks like this error is rare and shouldn't happen, give us some time to think!");
            console.log(status);
            console.log(errorThrown);
        })
});