package io.swagger.api.factories;

import io.swagger.api.CustomerApiService;
import io.swagger.api.impl.CustomerApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-31T04:37:03.640Z")
public class CustomerApiServiceFactory {

   private final static CustomerApiService service = new CustomerApiServiceImpl();

   public static CustomerApiService getCustomerApi()
   {
      return service;
   }
}
