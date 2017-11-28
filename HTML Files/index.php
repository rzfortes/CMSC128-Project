<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <meta name="description" content="Passenger Assistance System">
    <meta name="keywords" content="PAS,CPA, Cebu,Pier Map,Port FAQ,Pier FAQ">
    <title>Passenger Assistance System | Welcome</title>
    <link rel="stylesheet" href="./css/style.css">
  </head>
  <body>
    <header>
      <div class="container">
        <div id="branding">
          <h1><span class="highlight"><img src="./images/cpa-logo.png"></span></h1>
        </div>
        <nav>
          <ul>
            <li class="current"><a href="index.html">Home</a></li>
            <li><a href="faqs.html">FAQ</a></li>
            <li><a href="guidelines.html">Guidelines</a></li>
            <li><a href="map.html">Map</a></li>
            <li><a href="portner.html">Porter Assistance</a></li>
          </ul>
        </nav>
      </div>
    </header>
      <section id="marquee">
        <div class="announcements">
         <p id="date"></p><p style="width: 74%;"><?php

              $f = fopen("announcements.txt", "r");

              // read line by line
              while(!feof($f)) {
                echo fgets($f);
                if (!feof($f)) {
                  echo " • ";
                }
              }

              fclose($f);

            ?></p>
        </div>
      </section>
    <section id="boxes">
      <div class="container">
        <div class="box">
          <a href="faqs.html"><img src="./images/icons/faqs-large.png">
          <h3>FAQ</h3></a>
          <p>Answers to Frequently Asked Questions for the Passenger Terminal</p>
        </div>
        <div class="box">
          <a href="pierGuide.html"><img src="./images/icons/process-large.png">
          <h3>Pier Guidelines</h3></a>
          <p>Flowchart and detailed instructions to most common processes in Piers 1 and 3</p>
        </div>
        <div class="box">
          <a href="map.html"><img src="./images/icons/map-large.png">
          <h3>Map</h3></a>
          <p>Looking for your assigned Gate? or the nearest Cafeteria? For detailed steps to certain key locations, click here.</p>
        </div>
        <div class="box">
          <a href="portner.html"><img src="./images/icons/porter-large.png">
          <h3>   Porter Assistance</h3></a>
          <p>Need help with your luggage? Say no more! Our friendly porters are here to help.</p>
        </div>
      </div>
    </section>
    <marquee> In case of Emergency: call 1234-567-8901</marquee>
    <script>
        document.getElementById("date").innerHTML = Date();
    </script>
    <footer>
       
    </footer>
  </body>
</html>