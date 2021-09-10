# xml-json-converter
XML/JSON converter service

This service is based on Jackson conversion. 
Initially auto generated models (/resources/xml/*) 
were manually updated and fixed to reflect actual structure of requests; deserializers 
were added to handle JSON format specific @attribute entries. 
Resource-to-repository adapter supplies data from a folder configured in application.yml 
(resources.data-source section), HotelDataService is intended to contain business logic, 
while model to response conversions have been moved to service facade so providing better 
separation of concerns.

http://localhost:8080/swagger-ui.html
