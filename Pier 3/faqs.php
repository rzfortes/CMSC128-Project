<!doctype html>
<html lang="en" class="no-js">
  <head>

    <meta charset="utf-8">
    <!-- refreshes the page every 30 seconds to keep the announcements updated -->
    <meta http-equiv="refresh" content="30" />
    <meta name="viewport" content="width=device-width">
    <meta name="description" content="Passenger Assistance System">
    <meta name="keywords" content="PAS,CPA, Cebu,Pier Map,Port FAQ,Pier FAQ">
    
    <title>Passenger Assistance System | Welcome</title>
    
    <!-- Link references for the CSS usage -->
    <link rel="stylesheet" href="css/reset.css"> <!-- CSS reset -->
    <link rel="stylesheet" href="css/faqstyle.css">
    <link rel="stylesheet" href="css/style.css"> <!-- Resource style -->
    <script src="js/modernizr.js"></script> <!-- Modernizr -->
    
    <!-- Link references for the FONT -->
    <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">

    <!-- time and date data is here -->
    <script type="text/javascript" src="js/time.js"></script>

  </head>
  <body>

    <!-- upper div. contains logo properties and text navigation properties -->
    <header>
      <div class="container">
        <div id="branding">
          <h1><span class="highlight"><img src="./images/cpa-logo.png"></span></h1>
        </div>
        <nav>
          <ul>

            <!-- text navigation -->
            <li><a href="index.php">Home</a></li>
            <li class="current"><a href="faqs.php">FAQ</a></li>
            <li><a href="guidelines.php">Guidelines</a></li>
            <li><a href="map.php">Map</a></li>

          </ul>
        </nav>
      </div>
    </header>

    <!-- shows marquee -->
    <section id="marquee">
         <p id="clockbox" class="FAQclock"></p>
         <div class="FAQannouncements">
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
 <br></br> 
 <br></br>       

<!-- shows the category box on the left of the webpage -->
<section class="cd-faq">
    <ul class="cd-faq-categories">
        <li><img src="images\icons\faqssmall.png"><a class="selected" href="#basics">General Information</a></li>
        <li><a href="#Porter">Porter</a></li>
        <li><a href="#Terminal">Terminal</a></li>
        <li><a href="#payments">Payments</a></li>
    </ul> <!-- cd-faq-categories -->

    <!-- General Info FAQs starts here -->
    <div class="cd-faq-items">
        <ul id="basics" class="cd-faq-group">
            <li class="cd-faq-title"><h2>General Information</h2></li>
            <li>
                <a align="left" class="cd-faq-trigger" href="#0">Are shuttle services available for all passengers? </a>
                <div class="cd-faq-content">
                    <p align="left">CPA prioritizes senior citizens and persons with disabilities first and foremeost therefore, shuttles are for now solely for their use only.</p>
                </div> <!-- cd-faq-content -->
            </li>

            <li>
                <a align="left"class="cd-faq-trigger" href="#0">How often do shuttle services operate?</a>
                <div class="cd-faq-content">
                    <p align="left">Everyday unless under maintenance.</p>
                </div> <!-- cd-faq-content -->
            </li>

            <li>
                <a align="left"class="cd-faq-trigger" href="#0">Is the mactan to cebu ferry a one-way trip?</a>
                <div class="cd-faq-content">
                    <p align="left">Mactan-to-Cebu ferry trip is a two-way trip back and forth.</p>
                </div> <!-- cd-faq-content -->
            </li>

            <li>
                <a align="left"class="cd-faq-trigger" href="#0">Are there senior citizen/pwd discounts inside the pier?</a>
                <div class="cd-faq-content">
                    <p align="left">As per mandated by the government, yes.</p>
                </div> <!-- cd-faq-content -->
            </li>

             <li>
                <a align="left"class="cd-faq-trigger" href="#0">Hand carried luggages have a limit of how many kilograms?</a>
                <div class="cd-faq-content">
                    <p align="left">As long as you can carry it and will not be an inconvenience to other passengers.</p>
                </div> <!-- cd-faq-content -->
            </li>

            <li>
                <a align="left"class="cd-faq-trigger" href="#0">Where can I claim or drop lost and found items inside the pier?</a>
                <div class="cd-faq-content">
                    <p align="left">Helpdesk will provide this services for you.</p>
                </div> <!-- cd-faq-content -->
            </li>

             <li>
                <a align="left"class="cd-faq-trigger" href="#0">Are the massage services for free? If not, how much?</a>
                <div class="cd-faq-content">
                    <p align="left">No, it depends on how long and the scope of the requested massage. Please directly talk to the person incharge at their stations.</p>
                </div> <!-- cd-faq-content -->
            </li>


        </ul> <!-- cd-faq-group -->

        <!-- Porter FAQs starts here -->
        <ul id="Porter" class="cd-faq-group">
            <li class="cd-faq-title"><h2>Porter</h2></li>
            <li>
                <a align="left"  class="cd-faq-trigger" href="#0">Where do I inquire about the luggages that I carry?</a>
                <div class="cd-faq-content">
                    <p align="left" >For luggages, if not with porter then please proceed to your respective shipping lines office for further questions.</p>
                </div> <!-- cd-faq-content -->
            </li>

            <li>
                <a align="left"  class="cd-faq-trigger" href="#0">How much will it cost me if I hire a porter?</a>
                <div class="cd-faq-content">
                    <p align="left" >Your shipping lines will be able to provide this information. Please proceed to their offices for inquiries.</p>
                </div> <!-- cd-faq-content -->
            </li>

        </ul> <!-- cd-faq-group -->

        <!-- Terminal FAQs starts here -->
        <ul id="Terminal" class="cd-faq-group">
            <li class="cd-faq-title"><h2>Terminal</h2></li>
            <li>
                <a align="left"  class="cd-faq-trigger" href="#0">Is the pier 24 hours open?</a>
                <div class="cd-faq-content">
                    <p align="left" >No, the last trip leaves AT 1 AM. Pier 1 and 3 closes for a few hours and re-opens again at 5 AM.</p>
                </div> <!-- cd-faq-content -->
            </li>

            <li>
                <a align="left"  class="cd-faq-trigger" href="#0">Are there any souvenir shops inside the pier? </a>
                <div class="cd-faq-content">
                    <p align="left" >Limited but yes, Tshirts, keychains and a lot more have stalls solely for them by small merchants inside the pier. </p>
                </div> <!-- cd-faq-content -->
            </li>

            <li>
                <a align="left"  class="cd-faq-trigger" href="#0">Are there any priority boarding gates present? </a>
                <div class="cd-faq-content">
                    <p align="left" >Yes there are. Ask assistance at the helpdesk when needed for your boarding.</p>
                </div> <!-- cd-faq-content -->
            </li>


            <li>
                <a align="left" class="cd-faq-trigger" href="#0">Where do I ask for assistance?</a>
                <div class="cd-faq-content">
                    <p align="left">Inside the pier, you may go to the helpdesk for qustions or approach any Pier employee nearest to you.</p>
                </div> <!-- cd-faq-content -->
            </li>

            <li>
                <a align="left" class="cd-faq-trigger" href="#0">Are there any equipments/objects that should not be brought inside the pier?</a>
                <div class="cd-faq-content">
                    <p align="left">Firearms, cigarettes and objects that are usually used for ill intent are banned inside the pier.</p>
                </div> <!-- cd-faq-content -->
            </li>
 

              <li>
                <a align="left" class="cd-faq-trigger" href="#0"> Are there any landlines or payphones available inside the pier?</a>
                <div class="cd-faq-content">
                    <p align="left">You may use all provided services inside the pier. Please ask the helpdesk if you are in need of a landline connection. </p>
                </div> <!-- cd-faq-content -->
            </li>

        </ul> <!-- cd-faq-group -->

        <!-- Payment FAQs starts here -->
        <ul id="payments" class="cd-faq-group">
            <li class="cd-faq-title"><h2>Payments</h2></li>
            <li>
                <a align="left"  class="cd-faq-trigger" href="#0">How much is the terminal fee?</a>
                <div class="cd-faq-content">
                    <p align="left" >The terminal fee is at Php 25.</p>
                </div> <!-- cd-faq-content -->
            </li>

                <li>
                <a align="left"  class="cd-faq-trigger" href="#0">  Do I line up for terminal fees if I'm a senior citizen?</a>
                <div class="cd-faq-content">
                    <p align="left" >  No, you are exempted from the terminal fee and can proceed directly to the pre-departure areas. </p>
                </div> <!-- cd-faq-content -->
            </li>
        </ul> <!-- cd-faq-group -->
    
    </div> <!-- cd-faq-items -->
    <a href="#0" class="cd-close-panel">Close</a>
</section> <!-- cd-faq -->
<!-- <p> Emergency hotline: 1234-567-8901</p> -->
<footer>
  <p> </p>
</footer>
<script src="js/jquery-2.1.1.js"></script>
<script src="js/jquery.mobile.custom.min.js"></script>
<script src="js/main.js"></script> <!-- Resource jQuery -->
</body>
</html>