# Links Cloud Infrastructure

This is a simple collection of sample infrastructure-level microservices. 
It includes:
* Eureka-based Service Registry
* Zuul-based Proxy Service
* Sample "Hello Client" service

This is nothing new, just putting them on version control for further experimentation.

# How to run
To "make things happen", you have to start services in this order: 
1. Service Registry
2. HTTP Load Balancer
3. (optional) Hello Client

Wait a few seconds for the services to warm up. By default you can check:
* Eureka Console - http://localhost:8761/
* HTTP Routes - http://localhost:8762/actuator/routes/
* Hello Client service - http://localhost:8762/links-hello-client/

# TODO
* Containerization and start/stop infrastructure

# References

* [Introduction to Spring Cloud Netflix – Eureka](https://www.baeldung.com/spring-cloud-netflix-eureka)
* [An Example of Load Balancing with Zuul and Eureka](https://www.baeldung.com/zuul-load-balancing) 
