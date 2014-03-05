<%-- 
    Document   : index
    Created on : 18/12/2013, 07:58:21 ص
    Author     : Eslam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="web.*" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Eslam Hamouda">

        <title>Login | Eslam Hamouda</title>

        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.css" rel="stylesheet">

        <!-- Add custom CSS here -->
        <link href="css/modern-business.css" rel="stylesheet">
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet">
    </head>

    <body>

        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <!-- You'll want to use a responsive image option so this logo looks good on devices - I recommend using something like retina.js (do a quick Google search for it and you'll find it) -->
                    <a class="navbar-brand logo" href="index.jsp">Eslam Hamouda</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse navbar-ex1-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="index.jsp">Home</a></li>
                        <li><a href="blog.jsp">Blog</a></li>
                        <li><a href="login.jsp">Login</a></li>
                        <li><a href="register.jsp">Register</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">About <b class="caret"></b></a>
                            <ul class="dropdown-menu">
                                 <li><a href="#">About Me</a></li>
                                <li><a href="#">Contact Me</a></li>
                            </ul>
                        </li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container -->
        </nav>

        <div class="container">

            <% if (request.getParameter("access") != null) {
                    if (request.getParameter("access").equals("denied")) {%>
            <div class="jumbotron hero-spacer">
                <h2 class="text-center text-danger">Access Denied !!!</h2>
            </div>
            <%}
                }%>

                <% if ((request.getParameter("access") == null)|| request.getParameter("access").equals("denied") ) {%>

            <div class="container center-block" style="width: 450px;">

                <form class="form-signin" action="./LoginAPI" method="POST" role="form">
                    <br>
                    <br>
                    <h2 class="form-signin-heading">Please Login</h2>
                    <br>
                    <input name="txtUsername" type="text" class="form-control" placeholder="Username" required autofocus>
                    <br>
                   
                    <input name="txtPassword" type="password" class="form-control" placeholder="Password" required>
                    <br>
                    <button name="btnLogin" class="btn btn-lg btn-success btn-block" type="submit">Login</button>
                    <br>
                </form>



                <hr>

            </div> <!-- /container --> 

            <%}%>

            <footer>
                <div class="row">
                    <div class="col-lg-12">
                        <p>Copyright &copy; EslaMxSoft 2013</p>
                    </div>
                </div>
            </footer>

        </div><!-- /.container -->

        <!-- JavaScript -->
        <script src="js/jquery-1.10.2.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="js/modern-business.js"></script>

    </body>
</html>

