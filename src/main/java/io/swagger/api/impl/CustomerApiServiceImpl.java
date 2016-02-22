package io.swagger.api.impl;

import com.laki.customer.CustomerDao;
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
public class CustomerApiServiceImpl extends CustomerApiService {
  
      @Override
      public Response customerAddPut(String name,String address,String emailAddress,String phoneNumber,String faxNumber,SecurityContext securityContext)
      throws NotFoundException {
      Customer customer = new Customer();
          customer.setName(name);
          customer.setAddress(address);
          customer.setEmailAddress(emailAddress);
          customer.setPhoneNumber(phoneNumber);
          customer.setFaxNumber(faxNumber);
          boolean success = CustomerDao.addCustomer(customer);
          if(!success){
              return Response.serverError().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "Error Occured..!")).build();
          }
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "successfully added..!")).build();
  }
  
      @Override
      public Response customerDeleteCustomerIdDelete(String customerId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response customerGetCustomerIdGet(String customerId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response customerGetallGet(SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response customerUpdateCustomerIdPost(String customerId,Payload payload,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
}
