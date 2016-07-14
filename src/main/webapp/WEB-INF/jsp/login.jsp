<%-- 
    Document   : login
    Created on : Jul 11, 2016, 3:48:41 PM
    Author     : Deepak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet"
          href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Login</title>
  </head>
  <body>
    <section>
      <div class="jumbotron">
        <div class="container">
          <h1>Online Airways Booking </h1>
          <p>The fastest and easiest way of booking tickets on best price.</p>
        </div>
      </div>
    </section>
    <div class="container">
      <div class="row">
        <div class="col-md-4 col-md-offset-4">
          <div class="panel-heading">
            <h3 class="panel-title">Please sign in</h3>
          </div>
          <div class="panel-body">
              <form action='<c:url value="/login"/>'
                  method="post">
              <fieldset>
                <div class='form-group'>
                  <input class="form-control" placeholder="User Name"
                         name='userName' type="text"/>
                </div>
                <div class="form-group">
                  <input class='form-control' placeholder="Password"
                         name='password' type="password" value="">
                </div>
                <input class="btn btn-lg btn-success btn-block"
                       type="submit" value="login">
              </fieldset>
            </form>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>

