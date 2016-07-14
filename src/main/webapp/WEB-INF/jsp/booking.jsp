<%-- 
    Document   : booking
    Created on : Jul 11, 2016, 4:32:15 PM
    Author     : ayush
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="resources/css/style.css">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"/>
        <link rel="stylesheet" type="text/css" href="resources/Css/datepicker.css" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <script src="resources/js/bootstrap-datepicker.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $('#pickyDate').datepicker({
                    format: "dd/mm/yyyy"
                });
            });
        </script>
        <title>Index Page</title>
    </head>

    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Book My Trip</h1>

                </div>
            </div>
        </section>
        <h1 id="fly">Where do you want to fly?</h1>
    <form:form modelAttribute="searchInfo" class="form-inline">
        <div>
            <form:label for="flightType" path="flightType">One Way</form:label> 
                <form:radiobutton path="flightType" value="oneway"/> &nbsp;&nbsp;&nbsp;
            <form:label for="flightType" path="flightType">Two Way</form:label> 
            <form:radiobutton path="flightType" value="twoway"/>
<!--            <input type="radio" name="way" value="oneway"> Oneway 
            <input id="" type="radio" name="way" value="twoway"> Twoway-->
        </div>
        &nbsp;&nbsp;&nbsp;
        <div>
            From Airport:
            <form:select path="fromDestination">
                  <form:options items="${countries}"/>  
            </form:select>
<!--            <select>
                <option value="Newyork">NewYork</option>
                <option value="Chicago">Chicago</option>            
            </select>-->
            To Airport:
            <form:select path="toDestination" items="${countries}"/>
<!--            <select>
                <option value="Newyork">NewYork</option>
                <option value="Chicago">Chicago</option>            
            </select>-->
        </div>
        <h2>When do you want to fly?</h2>
        <div>
            Depart on Date:   

            <input  type="date" placeholder="click to show datepicker"  id="pickyDate"/>

            Time:

            <input  type="text" placeholder="Time" /> HH:MM
            <br/>
            <br/>
            <h2>Class:</h2>
            <form:label for="class" path="class">Economy</form:label> 
                <form:radiobutton path="class" value="Economy"/> &nbsp;&nbsp;&nbsp;
            <form:label for="class" path="class">Business</form:label> 
            <form:radiobutton path="class" value="Business"/>
<!--            <input type="radio" name="class" value="economy"> Economy &nbsp;&nbsp;&nbsp;
            <input type="radio" id="radiobtn"  name="class" value="business"> Business-->
        </div>

        <h3>Who is Travelling</h3>
        <div>
            Adults:(12+ yrs)
            <form:select path="adult" items="${counter}"/>

            Children:(2-12 yrs)
            <form:select path="child" items="${counter}"/>
<!--            <select>
                <option value="one">1</option>
                <option value="one">2</option>
                <option value="one">3</option>
                <option value="one">4</option>
                <option value="one">5</option>
                <option value="one">6</option>
                <option value="one">7</option>
                <option value="one">8</option>
                <option value="one">9</option>
                <option value="one">10</option>
                <option value="one">11</option>
                <option value="one">12</option>
            </select>-->

            Infants:(0-2 yrs)
            <form:select path="infant" items="${counter}"/>
            
        </div>
        <br>
        <input type="submit" value="search"/>


    </body>
</form:form>
</html>
