link : 
- http://www.mastertheboss.com/bpm/drools/jboss-drools-tutorial/
- https://github.com/fmarchioni/mastertheboss/tree/master/drools/helloworld-eclipse


C:\_tools\apache-maven-3.8.6\bin\mvn.cmd -B archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DgroupId=org.sample.drools -DartifactId=droolsShop
md droolsShop\src\main\resources\META-INF
md droolsShop\src\test\resources\META-INF
cd droolsShop

C:\_tools\apache-maven-3.8.6\bin\mvn.cmd clean install
C:\_tools\apache-maven-3.8.6\bin\mvn.cmd exec:java -Dexec.mainClass="org.sample.drools.App"

Result of execution :
Customer mark just purchased shoes
Customer mark just purchased hat
Customer mark now has a discount of 0
Customer mark now has a shopping total of 120.0
Customer mark now has a discount of 10
Customer mark has returned the hat
Customer mark now has a discount of 0