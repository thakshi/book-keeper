package io.swagger.api.impl;

import com.laki.impl.UserServiceImpl;
import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Error;
import io.swagger.model.User;
import io.swagger.model.Payload;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-22T09:26:07.219Z")
public class UserApiServiceImpl extends UserApiService {
  
      @Override
      public Response userAddPut(String name,String address,String emailAddress,String phoneNumber,String faxNumber,SecurityContext securityContext)
      throws NotFoundException {
      User user  = new User();
          user.setName(name);
          user.setAddress(address);
          user.setEmailAddress(emailAddress);
          user.setPhoneNumber(phoneNumber);
          user.setFaxNumber(faxNumber);

          UserServiceImpl
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response userDeleteUserIdDelete(String userId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response userGetUserIdGet(String userId,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response userGetallGet(SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
      @Override
      public Response userUpdateUserIdPost(String userId,Payload payload,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
  
}
