package io.swagger.api.factories;

import io.swagger.api.InventoryApiService;
import io.swagger.api.impl.InventoryApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-31T04:37:03.640Z")
public class InventoryApiServiceFactory {

   private final static InventoryApiService service = new InventoryApiServiceImpl();

   public static InventoryApiService getInventoryApi()
   {
      return service;
   }
}
