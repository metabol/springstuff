
INSTALLATION SOFTWARE:
*********************
1)java JDK 1.8
2) Maven 3.xx
3) IDE eclipse, or netbeans
4) MYSQL 5.7 server

Database:
*********
Import the DUMB.sql script into your database

PORTS
******
Open the following ports on your test machine: 8080, 8090, 9990, 3306

1) Start the eureka service
 cd springstuff/springBootDemo/subscription-eureka-server/target2
 $ ./run.sh
 
 Visit localhost:8090 on your browser
 
 
 2) Start the zuul service
   $ cd springstuff/springBootDemo/subscription-zuul-service/target
   $ ./run.sh
   
   Refresh your browser localhost:8090 to see the zuul api registered
   
   
  3) Start the subscription service
     $ cd springstuff/springBootDemo/subscription-service/target
      
     $ ./run.sh
     
     
  

GET REQUEST TEST DATA
************************************
localhost:9990/subscribe/new?email=homer@simpson.com&consent=y&gender=m&firstName=homer&subscriptionHash=homer.simpson&dateOfBirth=09/01/1953

localhost:9990/subscribe/new?email=marge@simpson.com&consent=y&gender=m&firstName=marge&subscriptionHash=marge.simpson&dateOfBirth=09/01/1959

localhost:9990/subscribe/new?email=bat@simpson.com&consent=y&gender=m&firstName=bat&subscriptionHash=bat.simpson&dateOfBirth=09/01/1993

localhost:9990/subscribe/new?email=lisa@simpson.com&consent=y&gender=m&firstName=lisa&subscriptionHash=lisa.simpson&dateOfBirth=09/01/1993




Configure your classpath with the following libraries
*********************************************************


1)JDK1.8    --> Runtime JVM
2)slf4j-api   --> logging Library


Logging Path resolves to
************************
1) /var/log --> in unix
2) c:\var\log --> in windows


Service Architecture
*********************

1)Service discovery --> Netflix Eureka-server --> localhost:8090


2) Gateway API --> Netflix Zuul ---> localhost:8090


4)Subscript-service -->Security -->user/password localhost:9990
  - Exposes monitoring route /actuator/health
  - Exposes subcription creation API  /subcribe/new?{payload}
  - Exposes quering of all subscriptions /subscribe/users
  
3) Circuit Breaker --> Netflix histrix

4) Persistent Storage --> Mysql Databases  (Could be made more secure with SSL certificates)


5) Email Service --> Netflix histrix with Apache Kafta?

6)Event service

EVENTS WITH RABBITMQ
**********************
$ docker run -d --hostname my-rabbit --name some-rabbit rabbitmq:3-management








