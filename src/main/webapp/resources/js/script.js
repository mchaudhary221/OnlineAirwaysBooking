/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    $("#detailsid").click(function () {
        var fid = $("#hfid").val();
        alert(fid);
        $.ajax("/OnlineAirwaysApplication/rest/flightdetails/" + fid,
                {
                    type: 'GET',
                    dataType: 'JSON',
                    success: function (data, textStatus, jqXHR) {
                        var result = "";
                        result += "<p>From Destination :" + data.flightname + " To Destination : " + data.from +"</p>";
                        result += "<p><span>Class : </span>" + "Economy" + "<span>Duration : </span>" + "120 minutes"
                                + "<span>Aircraft : </span>" + "Airbus A230" + "</p>";
                        $("#output").append(result);
                    },
                    error: function (data, textStatus, jqXHR) {
                        $("#output").html("Failed to load details" + textStatus);
                    }
                }
        );
    });
});


