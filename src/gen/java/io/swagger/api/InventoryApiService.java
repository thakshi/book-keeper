package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Error;
import io.swagger.model.Inventory;
import io.swagger.model.Payload1;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-27T14:28:47.690Z")
public abstract class InventoryApiService {
  
      public abstract Response inventoryAddPut(String inventoryCode,String name,String itemPrice,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response inventoryDeleteInventoryCodeDelete(String inventoryCode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response inventoryGetInventoryCodeGet(String inventoryCode,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response inventoryGetallGet(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response inventoryUpdateInventoryCodePost(String inventoryCode,Payload1 payload,SecurityContext securityContext)
      throws NotFoundException;
  
}
