package io.swagger.api.factories;

import io.swagger.api.InvoiceApiService;
import io.swagger.api.impl.InvoiceApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-31T04:37:03.640Z")
public class InvoiceApiServiceFactory {

   private final static InvoiceApiService service = new InvoiceApiServiceImpl();

   public static InvoiceApiService getInvoiceApi()
   {
      return service;
   }
}
