//import java.util.List;
//
//import javax.inject.Inject;
//import javax.jws.WebService;
//import javax.xml.ws.BindingType;
//import javax.xml.ws.soap.SOAPBinding;
//
//import com.soap.webservice.Exposer.CalculatorEndpoint;
//import com.soap.webservice.Service.CalculatorService;
//
//@WebService(
//        serviceName = "CalculatorService",
//        targetNamespace = "http://Service.webservice.soap.com",
//        endpointInterface = "com.soap.webservice.Service") // (1)
//@BindingType(SOAPBinding.SOAP12HTTP_BINDING) // (2)
//@Configuration
//public class WebserviceConfiguration implements CalculatorService { // (3)
//
//    @Inject // (4)
//    private CalculatorService calculatorService;
//
//    @Inject // (5)
//    private CalculatorEndpoint calculatorEndpoint;
//
//    @Bean    
//    public SpringBinding calculatorEndpoint() throws Exception {
//        return bind(calculatorEndpoint, "Soap-calculator-webservice/service/CalculatorService");
//    }
//
//    private SpringBinding bind(CalculatorEndpoint calculatorEndpoint, String url) throws Exception {
//        CalculatorService calculatorService = new CalculatorService();
//        calculatorService.setBean(endpoint);
//        calculatorBinding binding = new SpringBinding();
//        binding.setService(calculatorService.getObject());
//        binding.setUrl(url);
//        return binding;
//    }
//}