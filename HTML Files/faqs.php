<!doctype html>
<html lang="en" class="no-js">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <meta name="description" content="Passenger Assistance System">
      <meta name="keywords" content="PAS,CPA, Cebu,Pier Map,Port FAQ,Pier FAQ">
    <title>Passenger Assistance System | Welcome</title>
    
    <link rel="stylesheet" href="css/reset.css"> <!-- CSS reset -->
    <link rel="stylesheet" href="css/faqstyle.css">
    <link rel="stylesheet" href="css/style.css"> <!-- Resource style -->
    <script src="js/modernizr.js"></script> <!-- Modernizr -->
    <script type="text/javascript" src="js/time.js"></script>
  </head>
  <body>

    <header>
      <div class="container">
        <div id="branding">
          <h1><span class="highlight"><img src="./images/cpa-logo.png"></span></h1>
        </div>
        <nav>
          <ul>
            <li><a href="index.php">Home</a></li>
            <li class="current"><a href="faqs.php">FAQ</a></li>
            <li><a href="guidelines.php">Guidelines</a></li>
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

<section class="cd-faq">
    <ul class="cd-faq-categories">
        <li><img src="faq-general-info-button.png"><a class="selected" href="#basics">General Information</a></li>
        <li><a href="#Porter">Porter</a></li>
        <li><a href="#Terminal">Terminal</a></li>
        <li><a href="#payments">Payments</a></li>
    </ul> <!-- cd-faq-categories -->

    <div class="cd-faq-items">
        <ul id="basics" class="cd-faq-group">
            <li class="cd-faq-title"><h2>General Information</h2></li>
            <li>
                <a align="left" class="cd-faq-trigger" href="#0">How do I ensure I do not miss my ship?</a>
                <div class="cd-faq-content">
                    <p align="left">Arrive early 30 minutes prior to your ship's departure time</p>
                </div> <!-- cd-faq-content -->
            </li>

            <li>
                <a align="left"class="cd-faq-trigger" href="#0">Is there a free wi-fi service?</a>
                <div class="cd-faq-content">
                    <p align="left">Yes</p>
                </div> <!-- cd-faq-content -->
            </li>

        </ul> <!-- cd-faq-group -->

        <ul id="Porter" class="cd-faq-group">
            <li class="cd-faq-title"><h2>Porter</h2></li>
            <li>
                <a align="left"  class="cd-faq-trigger" href="#0">Who will assist me if I have many baggages?</a>
                <div class="cd-faq-content">
                    <p align="left" >Porter, you can use the "Grab a Porter" app</p>
                </div> <!-- cd-faq-content -->
            </li>

            <li>
                <a align="left"  class="cd-faq-trigger" href="#0">How do I link to a file or folder?</a>
                <div class="cd-faq-content">
                    <p align="left" >Lorem ipsum dolor sit amet, consectetur adipisicing elit. Blanditiis provident officiis, reprehenderit numquam. Praesentium veritatis eos tenetur magni debitis inventore fugit, magnam, reiciendis, saepe obcaecati ex vero quaerat distinctio velit.</p>
                </div> <!-- cd-faq-content -->
            </li>
        </ul> <!-- cd-faq-group -->

        <ul id="Terminal" class="cd-faq-group">
            <li class="cd-faq-title"><h2>Terminal</h2></li>
            <li>
                <a align="left"  class="cd-faq-trigger" href="#0">How can I transfer from the passenger terminal to my ship?</a>
                <div class="cd-faq-content">
                    <p align="left" >Through a designated shuttle</p>
                </div> <!-- cd-faq-content -->
            </li>


            <li>
                <a align="left" class="cd-faq-trigger" href="#0">Are the baby changing facilities at the passenger terminal?</a>
                <div class="cd-faq-content">
                    <p align="left">Yes, please check the directory</p>
                </div> <!-- cd-faq-content -->
            </li>

        </ul> <!-- cd-faq-group -->

        <ul id="payments" class="cd-faq-group">
            <li class="cd-faq-title"><h2>Payments</h2></li>
            <li>
                <a align="left"  class="cd-faq-trigger" href="#0">Can I have an invoice for my subscription?</a>
                <div class="cd-faq-content">
                    <p align="left" >Lorem ipsum dolor sit amet, consectetur adipisicing elit. Impedit quidem delectus rerum eligendi mollitia, repudiandae quae beatae. Et repellat quam atque corrupti iusto architecto impedit explicabo repudiandae qui similique aut iure ipsum quis inventore nulla error aliquid alias quia dolorem dolore, odio excepturi veniam odit veritatis. Quo iure magnam, et cum. Laudantium, eaque non? Tempore nihil corporis cumque dolor ipsum accusamus sapiente aliquid quis ea assumenda deserunt praesentium voluptatibus, accusantium a mollitia necessitatibus nostrum voluptatem numquam modi ab, sint rem.</p>
                </div> <!-- cd-faq-content -->
            </li>

            <li>
                <a align="left" class="cd-faq-trigger" href="#0">Why did my credit card or PayPal payment fail?</a>
                <div class="cd-faq-content">
                    <p align="left" >Lorem ipsum dolor sit amet, consectetur adipisicing elit. Tenetur accusantium dolorem vel, ad, nostrum natus eos, nemo placeat quos nisi architecto rem dolorum amet consectetur molestiae reprehenderit cum harum commodi beatae necessitatibus. Mollitia a nostrum enim earum minima doloribus illum autem, provident vero et, aspernatur quae sunt illo dolorem. Corporis blanditiis, unde, neque, adipisci debitis quas ullam accusantium repudiandae eum nostrum quis! Velit esse harum qui, modi ratione debitis alias laboriosam minus eaque, quod, itaque labore illo totam aut quia fuga nemo. Perferendis ipsa laborum atque assumenda tempore aspernatur a eos harum non id commodi excepturi quaerat ullam, explicabo, incidunt ipsam, accusantium quo magni ut! Ratione, magnam. Delectus nesciunt impedit praesentium sed, aliquam architecto dolores quae, distinctio consectetur obcaecati esse, consequuntur vel sit quis blanditiis possimus dolorum. Eaque architecto doloremque aliquid quae cumque, vitae perferendis enim, iure fugiat, soluta aut!</p>
                </div> <!-- cd-faq-content -->
            </li>

            <li>
                <a align="left"  class="cd-faq-trigger" href="#0">Why does my bank statement show multiple charges for one upgrade?</a>
                <div class="cd-faq-content">
                    <p align="left" >Lorem ipsum dolor sit amet, consectetur adipisicing elit. Blanditiis provident officiis, reprehenderit numquam. Praesentium veritatis eos tenetur magni debitis inventore fugit, magnam, reiciendis, saepe obcaecati ex vero quaerat distinctio velit.</p>
                </div> <!-- cd-faq-content -->
            </li>
        </ul> <!-- cd-faq-group -->
    
    </div> <!-- cd-faq-items -->
    <a href="#0" class="cd-close-panel">Close</a>
</section> <!-- cd-faq -->
<marquee> In case of Emergency: call 1234-567-8901</marquee>
<footer>
  <p> </p>
</footer>
<script src="js/jquery-2.1.1.js"></script>
<script src="js/jquery.mobile.custom.min.js"></script>
<script src="js/main.js"></script> <!-- Resource jQuery -->
</body>
</html>