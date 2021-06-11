# api-gateway-service
api-gateway-service.
This service created to work as gateway and which handles all client request coming and will route to respective services.

It uses below annotations.
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix

And its application.yml file contains below piece of code.
--------------------
spring:
  cloud:
    gateway:
      routes:
        - id: ACCOUNT-SERVICE
          uri: lb://ACCOUNT-SERVICE     #-----lb = load balancing
          predicates:
            - Path=/accounts/**
          filters:
            - name: CircuitBreaker
              args:
                name: ACCOUNT-SERVICE
                fallbackuri: forward:/accountServiceFallback
        - id: PRODUCT-SERVICE
          uri: lb://PRODUCT-SERVICE     #-----lb = load balancing
          predicates:
            - Path=/products/**
          filters:
            - name: CircuitBreaker
              args:
                name: PRODUCT-SERVICE
                fallbackuri: forward:/productServiceFallback

