# 20170328_JavaLand2017_MutationTesting
Basic Project for the Mutation Testing Community Micro - Workshop ;-)


## Basic procedure

Go to the src folder. Here you will find packages m01 , m02, ...
In every package you will find a class called MXX. ( XX i s number beginning from 01)

For every class you will find a test class in the test/java/junit/.. folder.

## Task
Write for every method from the production classes junit tests until
* test coverage is 100%
* mutation test coverage is as good as possible

Write first the junit tests based on linecoverage and your personel 
estimation/ experience until you are sure that your result is "perfect" ;-)

After this generate the mutation test coverage report with the maven plugin pitest.

### mutationCoverage goal
The mutation coverage goal analyses all classes in the codebase that match the target tests and target classes filters.
It can be run directly from the commandline
```mvn org.pitest:pitest-maven:mutationCoverage```

This will output an html report to target/pit-reports/YYYYMMDDHHMI.

