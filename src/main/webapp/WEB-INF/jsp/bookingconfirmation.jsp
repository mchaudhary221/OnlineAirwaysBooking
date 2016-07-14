<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <title>Booking Confirmation</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Booking Confirmation</h1>

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
            <tr><td>${resultdata}</td></tr>
            <%--<c:forEach items="${resultdata}" var="item">--%>
<!--                <tr>
                    <td>${item}</td>
                </tr>-->
            <%--</c:forEach>--%>

            <%--<c:forEach items="${data}">--%>
            <!--                <tr>
                            <input type="hidden" disabled="true" id="hfid" value="${data.flightId}" />
                            <input type="hidden" disabled="true" id="pcount" value="${data.pcount}" />
                            <td>${data.flightName}</td>
                            <td>${data.fromDestination}</td>
                            <td>${data.toDestination}</td>
                            <td>${data.departureDate}</td>
                        </tr>-->
            <%--</c:forEach>--%>
        </table>    
        <div id="con" >
            <form action="<c:url value="/confirm/fid=10&pcount=20" />" method="post">
                <input type="submit" value="Confirm Booking"  class="btn btn-warning" />
            </form>
        </div>
    </body>
</html>
