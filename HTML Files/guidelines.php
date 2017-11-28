<!DOCTYPE html>
<html>
<meta charset="utf-8" name="viewport" content="width=device-width,initial-scale=1.0">
<head>
	<link rel="stylesheet" href="css/reset.css"> <!-- CSS reset -->
	<link rel="stylesheet" href="./css/style.css">
	<link rel="stylesheet" href="./css/modalstyle.css">
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
	            <li class="current"><a href="guidelines.php">Guidelines</a></li>
	            <li><a href="map.php">Map</a></li>
	            <li><a href="portner.html">Porter Assistance</a></li>
	          </ul>
	        </nav>
	      </div>
	    </header>
	    <section id="marquee">
        <div class="announcements">
         <p id="clockbox"></p><marquee><p><?php

              $f = fopen("announcements.txt", "r");

              // read line by line
              while(!feof($f)) {
                echo fgets($f);
                if (!feof($f)) {
                  echo " • ";
                }
              }

              fclose($f);

            ?></p></marquee>
        </div>
      </section>
		<!--img src="images/bg2.png" alt="Background" style="max-width: 100%; max-height: 100%;" class="bg2"-->
	</div>
	
	<!-- Button containers for Pier 1 and 3-->
	<div class="container">
	  <div class="interior">
	    <a class="btn" href="#open-modal">Guidelines Flowchart</a>
	  </div>
	</div>
	<!-- Pier 1 Modal content-->
	<div id="open-modal" class="modal-window">
	   <div>
		    <a href="#modal-close" title="Close" class="modal-close">Close Flowchart</a>
	    	<div class = "modal-content"><embed src=".\images\process_Scene-1.swf" width="100%" height="100%" SCALE="default" wmode="transparent"  /></div>
	  </div>
	</div>
	<marquee> In case of Emergency: call 1234-567-8901</marquee>
	<footer>
      <p> </p>
    </footer>
</body>
</html>
