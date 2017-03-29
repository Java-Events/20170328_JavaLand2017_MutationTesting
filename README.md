# Mutation Testing Community Micro - Workshop
Basic Project for the Mutation Testing Community Micro - Workshop ;-)

## Preparations
Clone the directory to your harddrive.
Open the maven project (mutationtesting/pom.xml) with your prefered IDE.
Start with the maven targets clean and install ( mvn clean install )

After a few seconds or minutes you will have all dependencies locally.

This project is using Java8.

## Basic procedure
Go to the src folder. Here you will find packages org.rapidpm.event.mutationtesting.m01 , m02, ...
In every package you will find a class called MXX. (XX is a number, beginning from 01)

For every class you will find a test class in the corresponding test/java/junit/.. folder.

Start writing tests for the class and reach 100% Line Coverage.
To check this you have to run the maven targets clean and install. 
After the "Build Success" message you will find under target/site/jacoco 
the actual Line Coverage report.
 
After you reached your LineCoverage target, create the mutation testing report.

```mvn clean install pitest:mutationCoverage```

This will create an html report inside the folder target/pit-reports/YYYYMMDDHHMI.

## Task
Write for every method from the production classes junit tests until
* test coverage is 100%
* mutation test coverage is as good as possible

Write first the junit tests based on linecoverage and your  
estimation/ experience until you are sure that your result is "perfect" ;-)

After this generate the mutation test coverage report with the maven plugin pitest.

## Solutions
The master brach is your working branch. If you want to compare the results 
commit your code and switch to the solution branch.

## The Task M03
The task M03 is a little bit different.
Start writing jUnit tests as best as you can. ( based on the mutation test coverage report)

If you are done, create a second class ```M03_Refactored```  to write a new version 
of the method ```discardCommonPrefix```. 

Check the method ```create()``` in the Test-Class to see how to switch implementations for this example.



