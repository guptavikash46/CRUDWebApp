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

$(document).ready(function () {
    var table = $("#studentTable");
    $.ajax({
        url: "http://localhost:8080/app/allStudents",
        type: "GET",
        dataType: "json",
    })
        .done(function (response) {
            $.each(response, function (i, values) {
                table.append("<tr>\n" +
                    "            <th scope=\"row\">"+values.stu_id+"</th>\n" +
                    "            <td>"+values.stu_name+"</td>\n" +
                    "            <td>"+values.age+"</td>\n" +
                    "            <td>"+values.course+"</td>\n" +
                    "            <td>"+values.email+"</td>\n" +
                    "            <td>"+values.university.univ_id+"</td>\n" +
                    "        </tr>");
            })
            
        })
        .fail(function (xhr, status, errorThrown) {
            alert("Oops! looks like this error is rare and shouldn't happen, give us some time to think!");
            console.log(status);
            console.log(errorThrown);
        });
});