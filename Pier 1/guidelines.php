<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8" name="viewport" content="width=device-width,initial-scale=1.0">
	<!-- refreshes the page every 30 seconds to keep the announcements updated -->
    <meta http-equiv="refresh" content="30" /> 

    <!-- Link references for CSS usage -->
	<link rel="stylesheet" href="css/reset.css"> <!-- CSS reset -->
	<link rel="stylesheet" href="./css/style.css">
	<link rel="stylesheet" href="./css/modalstyle.css">
	
	<!-- Link references for FONT -->
    <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
	<script type="text/javascript" src="js/time.js"></script>

	<title>Guidelines</title>

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
	            <li class="current"><a href="guidelines.php">Guidelines</a></li>
	            <li><a href="map.php">Map</a></li>
	          </ul>
	        </nav>
	      </div>
	    </header>

	    <!-- shows the marquee -->
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
         </section>
		
	</div>
	
	<!-- embed flash file of process flow here -->
	<embed style="background-color: transparent;" src=".\images\processFlow.swf" quality="high" width="1024" height="576" name="intro" align="middle" allowScriptAccess="sameDomain" allowFullScreen="false" type="application/x-shockwave-flash" pluginspage="http://www.adobe.com/go/getflashplayer" />

	<footer>
    </footer> 
</body>
</html>
