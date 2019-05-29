$(document).ready(function() {
   // var uniList = $(".list-group");
    $.ajax({
        url: "http://localhost:8080/app/universities",
        type: "GET",
        dataType: 'json',
    })
        .done(function (univInfo) {
            $.each(univInfo, function (i, uni) {
                // uniList.append('<li class="list-group-item">University ID:'+uni.univ_id+'</li>'+
                //     '<li class="list-group-item">Name:'+uni.univ_name+'</li>'+
                //     '<li class="list-group-item">Country:'+uni.univ_country+'</li></br></br');
            })
        })
        .fail(function (xhr, status, errorThrown) {
            // alert("error found");
            // console.log(status);
        })

});