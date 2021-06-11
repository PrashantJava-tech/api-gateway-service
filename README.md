# api-gateway-service
api-gateway-service.
This service created to work as gateway and which handles all client request coming and will route to respective services.

It uses below annotations.
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix

And its application.yml file contains below piece of code.

predicates:
filters:
  - name: CircuitBreaker
  fallbackuri: forward:/accountServiceFallback

