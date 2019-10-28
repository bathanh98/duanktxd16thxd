<%-- 
    Document   : header
    Created on : Oct 29, 2019, 1:01:40 AM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <style>
  /* Make the image fully responsive */
  .carousel-inner img {
      width: 100%;
      height: 300px;
  }
  </style>
</head>
<body>

<div id="demo" class="carousel slide" data-ride="carousel">

  <!-- Indicators -->
  <ul class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
    <li data-target="#demo" data-slide-to="2"></li>
  </ul>
  
  <!-- The slideshow -->
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="https://scontent.fdad1-1.fna.fbcdn.net/v/t1.0-9/14316772_1593278480969020_1128641946141563160_n.jpg?_nc_cat=104&_nc_oc=AQlvqqAqFshEsipO_f-7vssF4Gsw08mzqwqW9Me-1eS5JILQO-P389xv3acAOIoHMUo&_nc_ht=scontent.fdad1-1.fna&oh=657dc8b1abafab42e9f5d476ebd0f3d2&oe=5E238F3C" alt="Los Angeles" width="1100" height="500">
    </div>
    <div class="carousel-item">
      <img src="https://scontent.fdad1-1.fna.fbcdn.net/v/t1.0-9/14316772_1593278480969020_1128641946141563160_n.jpg?_nc_cat=104&_nc_oc=AQlvqqAqFshEsipO_f-7vssF4Gsw08mzqwqW9Me-1eS5JILQO-P389xv3acAOIoHMUo&_nc_ht=scontent.fdad1-1.fna&oh=657dc8b1abafab42e9f5d476ebd0f3d2&oe=5E238F3C" alt="Chicago" width="1100" height="500">
    </div>
    <div class="carousel-item">
      <img src="https://scontent.fdad1-1.fna.fbcdn.net/v/t1.0-9/14316772_1593278480969020_1128641946141563160_n.jpg?_nc_cat=104&_nc_oc=AQlvqqAqFshEsipO_f-7vssF4Gsw08mzqwqW9Me-1eS5JILQO-P389xv3acAOIoHMUo&_nc_ht=scontent.fdad1-1.fna&oh=657dc8b1abafab42e9f5d476ebd0f3d2&oe=5E238F3C" alt="New York" width="1100" height="500">
    </div>
  </div>
  
  <!-- Left and right controls -->
  <a class="carousel-control-prev" href="#demo" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#demo" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>
</div>
            
        
