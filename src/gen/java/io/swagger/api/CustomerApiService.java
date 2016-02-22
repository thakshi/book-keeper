package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Error;
import io.swagger.model.Customer;
import io.swagger.model.Payload;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-31T04:37:03.640Z")
public abstract class CustomerApiService {
  
      public abstract Response customerAddPut(String name,String address,String emailAddress,String phoneNumber,String faxNumber,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response customerDeleteCustomerIdDelete(String customerId,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response customerGetCustomerIdGet(String customerId,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response customerGetallGet(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response customerUpdateCustomerIdPost(String customerId,Payload payload,SecurityContext securityContext)
      throws NotFoundException;
  
}
