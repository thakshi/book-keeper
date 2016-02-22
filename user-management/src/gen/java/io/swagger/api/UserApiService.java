package io.swagger.api;

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
public abstract class UserApiService {
  
      public abstract Response userAddPut(String name,String address,String emailAddress,String phoneNumber,String faxNumber,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response userDeleteUserIdDelete(String userId,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response userGetUserIdGet(String userId,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response userGetallGet(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response userUpdateUserIdPost(String userId,Payload payload,SecurityContext securityContext)
      throws NotFoundException;
  
}
