Minimalistic Potato [![Build Status](http://zachlatta.com:8080/job/minimalistic-potato/badge/icon)](http://ci.zachlatta.com/job/minimalistic-potato/)
===================

Made with love for Ludum Dare 26. Grab the latest builds [here](http://ci.zachlatta.com/job/minimalistic-potato/).

[![Screenshot](http://i.imgur.com/xmOty5q.png)](http://www.ludumdare.com/compo/ludum-dare-26/?action=preview&uid=18900)


The Story
---------

Minimalistic Potato tells the heartbreaking story of Spudnik, a lost potato. Spudnik is stuck in a dystopia of white.
An insipid plain of nothing. A place that lacks color, emotion, and all that is interesting. But when it seems like all
is lost, an external force (your finger/mouse) flings across the void! It takes a second, but he slowly follows your
finger with curiosity. Pixel after pixel. Movement after movement. And when Spudnik reaches where the external force
stopped, he freezes in fear, lost. But with that fear comes the tiniest sliver of hope. Hope that there is something
out there better than this. That there is a world filled with color, with hope, and with triumph. But for now he is
stuck in this dystopia. And only you can guide him. Only you can teach him to potate.

![Spudnik](http://i.imgur.com/yx7BV8F.png)


Links
-----
[Submission page](http://www.ludumdare.com/compo/ludum-dare-26/?action=preview&uid=18900)

[Google Play](https://play.google.com/store/apps/details?id=com.zachlatta.minimalistic_potato.android)

[Continous Integration](http://ci.zachlatta.com/job/minimalistic-potato/)


Contributing
------------

Potatoes gonna potate. Help me make Spudnik potate harder than the rest.

![Potatoes Gonna Potate](http://www.ludumdare.com/compo/wp-content/compo2/233892/18900-shot0.png)

The project is set up with Maven, which will make getting started super easy. Just clone the repository to get started!

    git clone https://github.com/zachlatta/minimalistic-potato

### Desktop

Run the `-Pdesktop package` goal to compile and package the game for desktops.

    mvn -Pdesktop package

It will create a file called `minimalistic-potato-1.0-SNAPSHOT-jar-with-dependencies.jar` in the `desktop/target` folder.
It contains all of the necessary dependencies, the assets, and a manifest file specifying the main class. You can run
this file via:

    java -jar minimalistic-potato-1.0-SNAPSHOT-jar-with-dependencies.jar
    

### Android

To create an unsigned APK for Android run the `-Pandroid package` goal.

    mvn -Pandroid package

This will create a file called minimalistic-potato-android-1.0-SNAPSHOT.apk in the `android/target` folder. To install
the APK to a connected device or emulator, run the `-Pandroid install` goal.

    mvn -Pandroid install


### HTML5

To compile the project to HTML5, run the `-Phtml package` goal.

    mvn -Phtml package

The end result is located in the `html/target` folder. You can either use the `.war` file that was generated and deploy
that to Jetty/Tomcat, or copy the contents of the `html/target/minimalistic-potato-html-1.0-SNAPSHOT` folder to a
location on a web server. Watch out, if just try to open `MinimalisticPotato.html` with a web browser on your computer,
you're going to get a Javascript error (at least on Chrome).
