# hello-thymeleaf

Spring MVC + Thymeleaf sample with minimum archtecture


## Performacne test

To run with Thymeleaf version:

    % git checkout perf-1.0.0-thymeleaf
    % mvn tomcat7:run
    % ./jmeter.sh -t hello-thymeleaf.jmx -n -Jhost localhost -Jport 8080 -Jroot "/hello-thymeleaf" -Jtest_id 1 -Jloop1 10 -Jloop2 10

To run with JSP version:

    % git checkout perf-1.0.0-jsp
    % mvn tomcat7:run
    % ./jmeter.sh -t hello-thymeleaf.jmx -n -Jhost localhost -Jport 8080 -Jroot "/hello-thymeleaf" -Jtest_id 1 -Jloop1 10 -Jloop2 10


### variables

JMeter `-J` options can set user variables, like `-Jtest_id 1` . Available variables are:

|Name|Default|description|
|---|---|---|
|host|localhost|Host name.|
|port|8080|Port number.|
|root|"/hello-thymeleaf"|Context root path.|
|test_id|1|Test type - 0: non-looped test, 1: single-looped test, 2: double-looped test. See `books-index-.(html|jsp)` files.|
|loop1|10|First loop count which indicates `Book`s number.|
|loop2|10|Second loop count which indicates `Author`s number.|
