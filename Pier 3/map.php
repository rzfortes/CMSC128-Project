<!DOCTYPE html>
<html>
<meta charset="utf-8" name="viewport" content="width=device-width,initial-scale=1.0">
<head>
	<!-- refreshes the page every 30 seconds to keep the announcements updated -->
    <meta http-equiv="refresh" content="30" />

    <!-- Link reference for CSS usage -->
	<link rel="stylesheet" href="css/reset.css"> <!-- CSS reset -->
	<link rel="stylesheet" href="./css/style.css">
	<link rel="stylesheet" href="./css/modalstyle.css">
	
	<!-- Link reference for the FONT -->
    <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
	
	<!-- time and date data -->
	<script type="text/javascript" src="js/time.js"></script>

	<title>Map</title>

</head>
<body>
<!-- Background div-->
	<div style="position: relative;">
		<header>
	      <div class="container">
	        <div id="branding">
	          <h1><span class="highlight"><img src="./images/cpa-logo.png"></span></h1>
	        </div>
	        <nav>
	          <ul>
	            <li><a href="index.php">Home</a></li>
	            <li><a href="faqs.php">FAQ</a></li>
	            <li><a href="guidelines.php">Guidelines</a></li>
	            <li class="current"><a href="map.php">Map</a></li>
	          </ul>
	        </nav>
	      </div>
	    </header>

	    <!-- shows marquee -->
	    <section id="marquee">
         <p id="clockbox" class="clock"></p>
         <div class="announcements">
         <marquee class="text">
           <?php

              $f = fopen("announcements.txt", "r");

              // read line by line
              while(!feof($f)) {
                echo fgets($f);
                if (!feof($f)) {
                  echo " • ";
                }
              }

              fclose($f);

            ?>
         </marquee>
         </div>
		
	</div>
	
	<!-- modal properties for map -->
	 <div class="container">
	  <div class="interior">
	    <a href="#open-modal"><img src="./images/go.png"></a>
	  </div>
	</div> 
	 <div id="open-modal" class="modal-window">
	   <div>
		    <a href="#modal-close"><img src="./images/exit.png"></a>
	    	<div class = "#flash-content"><embed src=".\images\Pier3.swf" width="100%" height="85%" SCALE="default" wmode="transparent"  /></div>
	  </div>
	</div>
</body>
</html>
