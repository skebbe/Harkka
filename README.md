Sql creates can be found from Sql_creates.txt, in numbered order.

Deploying to tomcat:

1. Stop Tomcat if its running.
2. Copy or move the Harkka.war package to Apache Software Foundation\Tomcat (version number)\webapps folder, in Tomcat installation folder, something like(C:\Program Files\Apache Software Foundation\Tomcat 7.0\webapps).
3. Run Tomcat(version number).exe, from folder Apache Software Foundation\Tomcat (version number\bin
4. Open web browser and go to url: http://localhost:8080/Harkka/

Theres a lot of things i would do differently, better in this program, especially validation and the confirmation for user. There were a lot of new techniques for me in this project, and thats why some of the solutions are not that good programmatically, and would definitely need some refactoring.
It was a fun and very instructive project, i learned a lot from spring, hibernate and postgresql while programming this exercise.
