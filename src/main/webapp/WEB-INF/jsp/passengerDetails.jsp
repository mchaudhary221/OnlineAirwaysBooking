<%-- 
    Document   : passengerDetails
    Created on : Jul 12, 2016, 5:23:47 PM
    Author     : ayush
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Book My Trip</h1>
                    
                </div>
            </div>
        </section>
        
          <table class="table table-bordered" >
                <tr>
                    
                     <th>Passenger Name</th>
                    <th>Class</th>
                     <th>From Airport</th>
                    <th>Depart Date</th>
                     <th>Depart Time</th>
                    <th>To Airport</th>
                    <th>Seat_no</th>
                    
                </tr>
                   

                <tr>
                   

                       <td>${passenger.firstName}</td>
                        <td>${flight.fromDestination}</td>
                         <td>${flight.fromDestination}</td>
                        <td>${flight.departureDate}</td>
                        <td>${flight.duration}</td>
                         <td>${flight.toDestination}</td>
                        
                </tr>
                </c:forEach>
                
                
            </table>
           
            
        
    </body>
</html>
