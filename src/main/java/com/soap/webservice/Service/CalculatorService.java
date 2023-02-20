package com.soap.webservice.Service;

import javax.jws.WebMethod;
//@WebMethod annotation expose a method as a service.
import javax.jws.WebParam;
//@WebParam annotation indicates parameters to method coming from SOAP request.
import javax.jws.WebResult;
import javax.jws.WebService;
//@WebService annotation makes a class a Web Service
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(serviceName = "CalculatorService",
            endpointInterface = "com.soap.webservice.Service",
            targetNamespace = "http://Service.webservice.soap.com")
@SOAPBinding(style = Style.DOCUMENT)
public class CalculatorService {
  @WebMethod
  @WebResult(name = "output")
  public int add(@WebParam(name = "number1") int a, @WebParam(name = "number2") int b) {
      return a + b;
  }

  @WebMethod
  @WebResult(name = "output")
  public int subtract(@WebParam(name = "number1") int a, @WebParam(name = "number2") int b) {
      return a - b;
  }

  @WebMethod
  @WebResult(name = "output")
  public int multiply(@WebParam(name = "number1") int a, @WebParam(name = "number2") int b) {
      return a * b;
  }
  
  @WebMethod
  @WebResult(name = "output")
  public int divide(@WebParam(name = "number1") int a, @WebParam(name = "number2") int b){
      return a / b;
  }
  
}