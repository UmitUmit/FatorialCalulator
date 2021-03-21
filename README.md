# FatorialCalulator
This project is build with Java+Selenium+Cucumber+Junit BDD framework; As well as a cool maven-cucumber-reporting plugin

# Structure
I created 4 pages: pages, runners, step_definitions, utilities. Also a resources directory.
All the data related to all the pages will go under the pages package.
All runner classes will go under the runners package
All the test cases/scenarios will go under the resources/features directory
All logics will go under the utilities package

# How it works
Run CukesRunner class under the runners package, it will read the Calculator.feature file, then it will go to all the step_definition classes and run all the automated scripts from there. URL is only present in configuration.properties file, my code will take URL from this file whenever needed, using the logic under utilities package.
@After method in the hooks class, if any test fails, will take screenshots and attach the screenshots under the related scenarios, then it will also close the browser after test run finishes.


# Maven-Cucumber_reporting, How it works ?
In order to see this beautiful report, please follow below steps:
If you use intellij idea, then click maven from top right of the IDE
Under the maven life cycle
1.double click the clean option, wait until it finishes the execution
2. double click the verify option, wait until it finished the execution
3. open cucumber-html-reports under the target folder
5. right click overview-features.html, open in -> Browser -> Chrome(for example)
6. you will see a colorful pie chart, the report will be in front of you on the browser page, you can click all the clickables to see the report however you want 


If you are using other IDEs that doesn't has the maven life cycle option on it
1. from command line / terminal go into  this project
2. type maven clean, press enter
3. type maven verify, press enter
4. open cucumber-html-reports under the target folder
5. right click overview-features.html, open in -> Browser -> Chrome(for example)
6. you will see a colorful pie chart, the report will be in front of you on the browser page, you can click all the clickables to see the report however you want 

