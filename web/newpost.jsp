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

        <title>New Post | Eslam Hamouda</title>

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


            <div class="container center-block" >

                <form class="form-signin" action="./InsertAPI" method="POST" role="form">
                    <br>
                    <br>
                    
                    <h2 class="form-signin-heading">Write a new Post : </h2>
                    <br>
                    <p><strong>Title : </strong></p>
                    <input name="txtTitle" type="text" class="form-control"   required autofocus>
                    <br>
                    <p><strong>Description: </strong></p>
                    <input name="txtDescription" type="text" class="form-control"  required >
                    <br>
                    <p><strong>Image URL : </strong></p>
                    <input name="txtImage" type="text" class="form-control"   required >
                    <br>
                    <p><strong>Content : </strong></p>
                    <textarea name="txtContent" style="resize: both;" type="text" class="form-control" rows="15" cols="8" required > </textarea>
                    <br>
                    <p><strong>Author : </strong></p>
                    <input name="txtAuthor" type="text" class="form-control"    required >
                    <br>
                    
                    <br>
                    <button name="btnUpdate" class="btn btn-lg btn-primary btn-block" type="submit">Publish</button>
                    <br>
                </form>



                <hr>

            </div> <!-- /container --> 


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

