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

        <title>Eslam Hamouda</title>

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

        <div id="myCarousel" class="carousel slide">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
            </ol>

            <!-- Wrapper for slides -->
            <div class="carousel-inner">
                <div class="item active">
                    <div class="fill" style="background-image:url('http://localhost:8080/examples/genuine_abstract-wide.jpg');"></div>
                    <div class="carousel-caption">
                        <h1>Welcome to Eslam Hamouda Website</h1>
                    </div>
                </div>
                <div class="item">
                    <div class="fill" style="background-image:url('http://localhost:8080/examples/abstract_variation-wide.jpg');"></div>
                    <div class="carousel-caption">
                        <h1>You Can Find a Lot Of My Articles In The Blog</h1>
                    </div>
                </div>
                <div class="item">
                    <div class="fill" style="background-image:url('http://localhost:8080/examples/3d_inspiration-wide.jpg');"></div>
                    <div class="carousel-caption">
                        <h1>Please Register At My Website To Get All Content.</h1>
                    </div>
                </div>
            </div>

            <!-- Controls -->
            <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                <span class="icon-prev"></span>
            </a>
            <a class="right carousel-control" href="#myCarousel" data-slide="next">
                <span class="icon-next"></span>
            </a>
        </div>

        <div class="section">

            <div class="container">

                <div class="row">
                    <div class="col-lg-4 col-md-4 col-sm-d">
                        <h3><i class="fa fa-check-circle"></i> Programming Skills</h3>
                        <p><b>here is some of them :</b></p>
                        <ul>
                            <li><h4>.NET (C#,VB,ASP)</h4></li>
                            <li><h4>Java</h4></li>
                            <li><h4>C++</h4></li>
                            <li><h4>PHP</h4></li>
                        </ul>

                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-d">
                        <h3><i class="fa fa-pencil"></i> Currently Reading</h3>
                        <p><b>I'm reading those books write now</b></p>
                        <ul>
                            <li><h4>C# via CLR</h4></li>
                            <li><h4>Master Minds in Programming</h4></li>
                            <li><h4>.NET Book Zero</h4></li>

                        </ul>

                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-d">
                        <h3><i class="fa fa-folder-open"></i>Blog Contents</h3>
                        <p><b>my blog contains :</b></p>
                        <ul>
                            <li><h4>Articles</h4></li>
                            <li><h4>Videos</h4></li>
                            <li><h4>My Apps</h4></li>

                        </ul>

                    </div>
                </div><!-- /.row -->

            </div><!-- /.container -->

        </div><!-- /.section -->



        <%--        <div class="section">
        <div class="section-colored text-center">

            <div class="container">

                <div class="row">
                    <div class="col-lg-12">
                        <h2 class="text-center">Think , Then Code.</h2>
                        <p>in most of debugging cases you have solve the problem in your mind first then check the code. <em>Eslam<em></p>
                        <hr>
                    </div>
                </div><!-- /.row -->

            </div><!-- /.container -->

        </div><!-- /.section-colored -->
            <div class="container">

                <div class="row">
                    <div class="col-lg-12 text-center">
                        <h2>Display Some Work on the Home Page Portfolio</h2>
                        <hr>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-6">
                        <a href="portfolio-item.html"><img class="img-responsive img-home-portfolio" src="http://www.hdwallpapers.in/walls/aurora_minimalistic-wide.jpg"></a>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-6">
                        <a href="portfolio-item.html"><img class="img-responsive img-home-portfolio" src="http://www.hdwallpapers.in/walls/green_bubbles-wide.jpg"></a>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-6">
                        <a href="portfolio-item.html"><img class="img-responsive img-home-portfolio" src="http://www.hdwallpapers.in/walls/mystic_eye-wide.jpg"></a>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-6">
                        <a href="portfolio-item.html"><img class="img-responsive img-home-portfolio" src="http://www.hdwallpapers.in/walls/green_bubbles-wide.jpg"></a>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-6">
                        <a href="portfolio-item.html"><img class="img-responsive img-home-portfolio" src="http://www.hdwallpapers.in/walls/mystic_eye-wide.jpg"></a>
                    </div>
                    <div class="col-lg-4 col-md-4 col-sm-6">
                        <a href="portfolio-item.html"><img class="img-responsive img-home-portfolio" src="http://www.hdwallpapers.in/walls/green_bubbles-wide.jpg"></a>
                    </div>
                </div><!-- /.row -->

            </div><!-- /.container -->

        </div><!-- /.section -->

        <div class="section-colored">

            <div class="container">

                <div class="row">
                    <div class="col-lg-6 col-md-6 col-sm-6">
                        <h2>Modern Business Features Include:</h2>
                        <ul>
                            <li>Bootstrap 3 Framework</li>
                            <li>Mobile Responsive Design</li>
                            <li>Predefined File Paths</li>
                            <li>Working PHP Contact Page</li>
                            <li>Minimal Custom CSS Styles</li>
                            <li>Unstyled: Add Your Own Style and Content!</li>
                            <li>Font-Awesome fonts come pre-installed!</li>
                            <li>100% <strong>Free</strong> to Use</li>
                            <li>Open Source: Use for any project, private or commercial!</li>
                        </ul>
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-6">
                        <img class="img-responsive" src="http://www.hdwallpapers.in/walls/3d_colorful_squares-wide.jpg">
                    </div>
                </div><!-- /.row -->

            </div><!-- /.container -->

        </div><!-- /.section-colored -->

        <div class="section">

            <div class="container">

                <div class="row">
                    <div class="col-lg-6 col-md-6 col-sm-6">
                        <img class="img-responsive" src="http://www.hdwallpapers.in/walls/abtsract_tunnel-wide.jpg">
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-6">
                        <h2>Modern Business Features Include:</h2>
                        <ul>
                            <li>Bootstrap 3 Framework</li>
                            <li>Mobile Responsive Design</li>
                            <li>Predefined File Paths</li>
                            <li>Working PHP Contact Page</li>
                            <li>Minimal Custom CSS Styles</li>
                            <li>Unstyled: Add Your Own Style and Content!</li>
                            <li>Font-Awesome fonts come pre-installed!</li>
                            <li>100% <strong>Free</strong> to Use</li>
                            <li>Open Source: Use for any project, private or commercial!</li>
                        </ul>
                    </div>
                </div><!-- /.row -->

            </div><!-- /.container -->

        </div><!-- /.section -->

        
<div class="container">

    <br>
    <br>
            <div class="row well">
                <div class="col-lg-8 col-md-8">
                    <h4>Ready to GoOoOOoOo ???!</h4>
                    <p>take your breath again and press this button!</p>
                </div>
                <div class="col-lg-4 col-md-4">
                    <a class="btn btn-lg btn-primary pull-right" href="blog.jsp">Goto My Blog NOW!</a>
                </div>
            </div><!-- /.row -->

        </div><!-- /.container -->
--%>

        <div class="container">

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

    </body>
</html>

