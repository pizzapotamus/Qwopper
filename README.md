# Qwopper
[Java] A QWOP-playing bot driven by a Cellular Genetic Algorithm that evolves QWOP runners (input loops)

QWOPPER: helping QWOP win the 100 meters with genetic programming
===============================================================================

The intended goal of the project is to write a bot able to play 
QWOP (http://www.foddy.net/Athletics.html), training it with 
genetic programming principles.

Explanation of the origin of this project can be found in Laurent 
Vaucher's blog post at 
http://slowfrog.blogspot.com/2011/03/genetically-engineered-qwop-part-1.html

===============================================================================

This project was extended into Steven Ray's Computer Science 
master project at CSU Sacramento in 2013, and later published at:
GECCO '14 Proceedings of the 2014 conference on Genetic and 
evolutionary computation, ACM, Vancouver, pp. 823-830

Abstract:  http://research.google.com/pubs/pub42902.html
Project URL (pdf):  http://athena.ecs.csus.edu/~gordonvs/papers/QWOPgecco14.pdf

===============================================================================

Instructions for importing and running the bot with the genetic 
algorithm learning component:

Either pull the project into Eclipse from my github:
https://github.com/pizzapotamus/Qwopper.git

Or unzip the archive and import the whole thing into eclipse, and 
it should be good to go. 

Running the Cellular GA:
Genetic.java is the class that handles the GA logic. Running the 
Genetic class with a QWOP game fully visible in a browser window will 
run the GA according to the parameters. 

You can also run the QWOPPER gui app shown in the video by running 
src/com/slowfrog/qwop/ui/Main.java.  This app will let you manually 
enter input strings for the bot to iterate over as it plays QWOP.  
Here's a video of me using the GUI app by first generating 3 random 
"runners", and then pasting in a string that was actually evolved by 
the algorithm over 30 or so generations: 
https://www.youtube.com/watch?v=eWxFI3NHtT8 

===============================================================================

A Note on all the txt files included in the project:
These are here to show some history of the GA's performance throughout the 
implementation's evolution toward a Cellular GA, as well as to provide the 
initial lists of runners used to populate Generation 0 for each of the genetic 
encodings explored.
