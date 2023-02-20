# Soap-webservice-calculator
This is project for soap producer/exposer webservice calculator method implementations.

-At first, let's mention the dependencies we required for our webservice i.e, jax-ws runtime from sun 
Here, we also need to add the plugin goals for generating the sources 
At last let's include the tomcat/jetty plugin so we can use any of the servers where we want to deploy our war
Don't forget to add the portname = "localhost" and portType = "9191" (can be manually configured as per preferences)

- Now let's create a Client Service to provide our methods inside that, also make use of the annotations bind wherever required.
- Now, to set endpoint either we can set it through our java class or inside our xml file.

- Once project implementation is done go to maven cli interface and run the command ${mvn clean install}
- After, this run the command ${mvn generate-sources} to automatically generate the wsdl file as mentioned in plugin goals.

- Run the ${mvn package} to finally pack up our webapp, once is done we can check our war ready to deploy at any server.

- Now, let's deploy our war at preferred server {ignore if any warn levels occuring : creating noise in our log messages}

- We can see now our war is up and running at the server chosen, hit the url as provided in the binding to check the service availability

- Goto, any testing tool(like postman, soapui, etc.) here we are using soapUI to test the project for request-response flow

- I'm using soapUI tool to do so, now create a new soap project : provide a suitable name and import the wsdl file generated through jaxws-maven-plugin goals

- Note : Maven can use it's own standardization while generating the wsdl file 
(one can fix the @WebParam name types & wsdlsoap:address location from the method implementation)

- Provide the values inside the parameters at soap envelope request and verify our response message.

Thank You!
