"use strict";

$(function() {

    $('#send').click(function(){

        let first = $('#first').val();
        let last = $('#last').val();

        if(first != "" && last != "") {
            $.ajax({
                url: "guestapi",
                type: "POST",
                data: {first, last},
                success:  successResp,
                error: failureResp
            })
        }

    })

    function successResp(data){
        $('#guestList').append("<p>" + 'First Name: ' + data.first + ' Last Name: ' + data.last + "</p>");
    }

    function failureResp() {
    }

    alert("Welcome to guest!");
})