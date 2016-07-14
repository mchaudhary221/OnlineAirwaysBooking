<%-- 
    Document   : register
    Created on : Jul 12, 2016, 4:24:53 PM
    Author     : ayush
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <title>Register</title>
    </head>

    <body>
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Book My Trip</h1>

                </div>
            </div>
        </section>
        <section class="container">
            <form:form modelAttribute="registerUser">
                <div>
                    <h1> User Register </h1>
                    <form:errors path="*" cssClass="alert alert-danger" element="div"/>
                     <div class="form-group">
                        <label for="userName">Username:</label>
                        <form:input type="text" id="userName" path="userName" class="form:input-large"/>
                        <form:errors path="userName" cssClass="text-danger"/>
                    </div>

                    <div class="form-group">
                        <label for="password">Password:</label>
                        <form:input placeholder="Password" type="password" id="password" path="password" class="form:input-large"/>
                    </div>

                    <div class="form-group">
                        <label for="email">Email:</label>
                        <form:input type="text" id="email" path="email" class="form:input-large"/>
                    </div>

                    <fieldset class="form-group">
                        <label for="phone">Phone:</label>
                        <form:input type="text" id="phone" path="phone" class="form:input-large"/>
                    </fieldset>

                    <fieldset class="form-group">
                        <label for="firstName">First Name:</label>
                        <form:input type="text" id="firstName" path="firstName" class="form:input-large"/>
                    </fieldset>

                    <fieldset class="form-group">
                        <label for="lastName">Last Name:</label>
                        <form:input type="text" id="lastName" path="lastName" class="form:input-large"/>
                    </fieldset>                    
                </div>
                <br>
                <div class="form-group">
                    <input type="submit" id="btnAdd" class="btn btn-success" value="Register"/>
                </div>
        </body>
    </form:form>
</html>
