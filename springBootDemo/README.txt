
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
2) Gateway API --> Netflix Zuul ---> localhost:8079


4)Subscript-service -->Security -->user/password localhost:9990
  - Exposes monitoring route /actuator/health
  - Exposes subcription creation API  /subcribe/new?{payload}
  - Exposes quering of all subscriptions /subscribe/users
  
  
  
3) Circuit Breaker --> Netflix histrix
4) Persistent Storage --> Mysql Databases  (Could be made more secure with SSL certificates)


5) Email Service --> Netflix histrix

6)Event service
EVENTS WITH RABBITMQ
**********************
$ docker run -d --hostname my-rabbit --name some-rabbit rabbitmq:3-management

EXTERNAL Library
?::::::::::::::::
servlet javax.servlet.ServletContext






