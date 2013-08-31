Minimalistic Potato
===================

Made with love for Ludum Dare 26.

[![Screenshot](http://i.imgur.com/xmOty5q.png)](http://www.ludumdare.com/compo/ludum-dare-26/?action=preview&uid=18900)


The Story
---------

Minimalistic Potato tells the heartbreaking story of Spudnik, a potato who couldn't. I like to think of Minimalistic Potato as a reflection on the ephemerality of the human condition. Interpret it how you wish though. Potatoes gonna potate.

![Spudnik](http://i.imgur.com/yx7BV8F.png)


Links
-----
[Submission page](http://www.ludumdare.com/compo/ludum-dare-26/?action=preview&uid=18900)

[Google Play](https://play.google.com/store/apps/details?id=com.zachlatta.minimalistic_potato.android)


Contributing
------------

Potatoes gonna potate. Help me make Spudnik potate harder than the rest.

![Potatoes Gonna Potate](http://www.ludumdare.com/compo/wp-content/compo2/233892/18900-shot0.png)

The project is set up with Maven, which will make getting started super easy. Just clone the repository to get started!

    git clone https://github.com/zachlatta/minimalistic-potato

### Desktop

Run the `-Pdesktop package` goal to compile and package the game for desktops.

    mvn -Pdesktop package

It will create a file called `minimalistic-potato-1.0-SNAPSHOT-jar-with-dependencies.jar` in the `desktop/target` folder. It contains all of the necessary dependencies, the assets, and a manifest file specifying the main class. You can run this file via:

    java -jar minimalistic-potato-1.0-SNAPSHOT-jar-with-dependencies.jar
    

### Android

To create an unsigned APK for Android run the `-Pandroid package` goal.

    mvn -Pandroid package

This will create a file called minimalistic-potato-android-1.0-SNAPSHOT.apk in the `android/target` folder. To install the APK to a connected device or emulator, run the `-Pandroid install` goal.

    mvn -Pandroid install


### HTML5

To compile the project to HTML5, run the `-Phtml package` goal.

    mvn -Phtml package

The end result is located in the `html/target` folder. You can either use the `.war` file that was generated and deploy that to Jetty/Tomcat, or copy the contents of the `html/target/minimalistic-potato-html-1.0-SNAPSHOT` folder to a location on a web server. After you have the files on the web server, copy the generated `assets` folder (in root of project) to the folder you copied onto the web server. Watch out, if you just try to open `MinimalisticPotato.html` with a web browser on your computer, you're going to get a Javascript error (at least on Chrome).
