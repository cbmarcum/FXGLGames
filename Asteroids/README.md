Asteroids 
--------------------------------------------

This Asteroids App is modified from the Master branch which is forked from the main project.

The application has been changed from a Maven to a Gradle multi-project build layout and files moving into an app sub-directory.

Changes have also been made as personal preferences for game play like: 
1. moving the asteroid life meter from one side to the center and making it 4 hits.
2. Ship firing delay and speed.

Other additions include:
1. Rolling log files

## To Do's
1. Establish Levels with increasing difficulty.
2. Fix negative life count.
3. Allow asteroids and ship to cross boundary and reenter opposite side.
4. Add sounds for firing and hitting asteroids.
5. Add ship thrust sound and image.
6. Allow ship to coast instead of stopping.


## Using the project: 
1. Add any dependencies to build.gradle.
2. Add logic to AsteroidsApp.groovy.

## Building the Application
- Build archives for distribution:
```
./gradlew assemble
```
- Build an install directory with a runnable project unpacked:
```
./gradlew installDist
```
