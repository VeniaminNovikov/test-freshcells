##### xml-json-converter

### XML/JSON converter service

This is a demo service based on [FasterXML Jackson library](https://github.com/FasterXML/jackson). </br> 
Initially auto generated models (`/resources/generated`) 
were manually updated and fixed to reflect actual structure of requests; deserializers 
were added to handle JSON format specific `@attribute` entries. 
To allow use of external data sources resource-to-repository adapter reads data from a folder 
configured in `application.yml` `resources.data-source` section. 
Service layer is focused on business logic, so required
model-to-response conversions are located in a service facade providing better 
separation of concerns.</br>
Service runs on port 8080. Swagger UI available at http://localhost:8080/swagger-ui.html
