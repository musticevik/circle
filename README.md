Hello, 
Just added 3D Library support which is avaliable on 3D-Branch. 

--Changelog--


+Added proper file system in order to create more organized codebase. 
+Balls are now 3D.
+Used javaFX library.
+Updated jumping physics.
+If-else or switch-case are still not used in any part of the soruce code.
+Provided jumping with "reflect" method which is available on Bounce3D class.
+Provided boundary control with modulo operator. Imagine a room with 10 range. and ball wanted to go 12 x-wise. We force the ball to go the 8th x-axis by this equation:
(Its actually available on every axis. X axis is just an example.)
        double range = max - min; //in this line we take the room width.
        double doubleRange = 2 * range; // this is useful to use in the modulo operator because it creates "mirror effect"

        double distBefore = (pos - min) % doubleRange; // This line and descendent lines provides where the ball should be after "mirror effect".
        double distAfter = (distBefore + doubleRange) % doubleRange;

        double newPos = min + range - Math.abs(distAfter - range);

+Polymorphism is used effectively in order to provide jumping action. update() method is the main polymorphism method.
+I have defined a flow that uses polymorphism treat in order to claim Bounce or Gravity behaviors.
+Anything that says to be a motion must implement motion interface which includes update() function.


--Improvable things in this project--
-The jumping method is still a bit primal.
-Balls do not collide within X axis and Z axis.


Used online sources:
https://www.youtube.com/@Randomcode_0 
I have used this channel in order to learn how JavaFX library works.
Since I got no experience on working with this library, this channel helped me a lot.

Since I am in an ongoing internship and didnt know how to work with javaFX library, the delivery of the code was a bit slow. I offer my apologies.

