

<%@page import="java.util.Iterator"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="web.*" %>
<% DbManager db = new DbManager();
    Post post;
//if (request.getParameter("id") != null) {
    int postID = Integer.parseInt(request.getParameter("id").toString());
    post = db.GetPost(postID);
    //} else {
    //  response.sendError(404, "This Article Not Found... :D");
    //  }
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Eslam Hamouda">

        <title><%= post.PostTitle%> | Eslam Hamouda</title>

        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.css" rel="stylesheet">

        <!-- Add custom CSS here -->
        <link href="css/modern-business.css" rel="stylesheet">
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet">
        <link href="css/prism.css" rel="stylesheet">
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

        <br>
        <div class="container">
            <br>
            <br>
            <div class="row row-offcanvas row-offcanvas-right">
                <div class="col-lg-9 col-md-9 col-xs-9 col-sm-9">


                    <div class="jumbotron">
                        <h2><a href="#"><%= post.PostTitle%></a></h2>
                        <img class="postimg" src="<%= post.PostImage%>" title="Image Title !!!" />
                        <%= post.PostContent%>

                        <br>
                        
                    </div>
                        <p> This Article Written By : <strong> <%= post.PostAuthor %> </strong> </p>
                        <br>
                         <a href="./DeleteAPI?id=<%= post.ID%>" class="btn btn-danger">Delete This Post!</a>
                         <a href="./update.jsp?id=<%= post.ID%>" class="btn btn-success">Update This Post!</a>
                    <hr />


                </div>


                <div class="col-lg-3 col-md-3 col-xs-3 col-sm-3 sidebar-offcanvas" id="sidebar" role="navigation">
                    <div class="well sidebar-nav">
                        <ul class="nav">
                            <li><b>Categories</b></li>
                            <li class="active"><a href="#">Home</a></li>
                            <li><a href="#">Programming</a></li>
                            <li><a href="#">Web</a></li>
                            <hr />
                            <li><b>Social Links</b></li>
                            <li><a href="#">Facebook</a></li>
                            <li><a href="#">Youtube</a></li>
                        </ul>

                    </div>
                    <!--/.well -->
                    <a class="twitter-timeline" href="https://twitter.com/EslaMx7" data-widget-id="386756343878541312">Tweets by EslaMx7</a>
                    <script>!function(d, s, id) {
                            var js, fjs = d.getElementsByTagName(s)[0], p = /^http:/.test(d.location) ? 'http' : 'https';
                            if (!d.getElementById(id)) {
                                js = d.createElement(s);
                                js.id = id;
                                js.src = p + "://platform.twitter.com/widgets.js";
                                fjs.parentNode.insertBefore(js, fjs);
                            }
                        }(document, "script", "twitter-wjs");</script>

                </div>
                <!--/span-->
            </div>



            <hr>

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
        <script src="js/prism.js"></script>
    </body>
</html>

