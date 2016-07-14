<%-- 
    Document   : flightList
    Created on : Jul 11, 2016, 10:59:36 PM
    Author     : ayush
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <script src="<c:url value="/resources/js/script.js"/>"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Flight Details</h1>

                </div>
            </div>
        </section>
        <table class="table table-bordered" >
            <tr>
                <th></th>
                <th>Flight Name</th>
                <th>From Airport</th>
                <th>To Airport</th>
                <th>Departure Date</th>

            </tr>
            <c:forEach items="${flightlist}" var="flight">
                <tr>
                    <td><a class="btn btn-info" role="button" href="<c:url value="/bookflight/fid=${flight.flightId}&pcount=20"/>">Book Now</a>
                    <input type="button" id="detailsid" value="Flight Details" class="btn btn-warning" />
                    </td>
                <input type="hidden" disabled="true" id="hfid" value="${flight.flightId}" />
                <td>${flight.flightName}</td>
                <td>${flight.fromDestination}</td>
                <td>${flight.toDestination}</td>
                <td>${flight.departureDate}</td>
            </tr>
        </c:forEach>
    </table>    
        <div id="output" >
        </div>
</body>
</html>
