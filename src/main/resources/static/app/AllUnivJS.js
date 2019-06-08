$(document).ready(function () {
    var table = $("#uniTable");
    $.ajax({
        url: "http://localhost:8080/app/universities",
        type: "GET",
        dataType: "json",
    })
        .done(function (response) {
            $.each(response, function (i, values) {
                table.append("<tr>\n" +
                    "            <th scope=\"row\">"+values.univ_id+"</th>\n" +
                    "            <td>"+values.univ_name+"</td>\n" +
                    "            <td>"+values.univ_country+"</td>\n" +
                    "        </tr>");
            })

        })
        .fail(function (xhr, status, errorThrown) {
            alert("Oops! looks like this error is rare and shouldn't happen, give us some time to think!");
            console.log(status);
            console.log(errorThrown);
        });
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
$("#UniAddHomePage").on("click", function () {
    window.location.href = "/app/addUniversity";
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

$("#homePageOption").on("click", function () {
    window.location.href = "/app/home";
});