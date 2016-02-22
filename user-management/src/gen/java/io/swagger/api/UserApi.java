package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.UserApiService;
import io.swagger.api.factories.UserApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Error;
import io.swagger.model.User;
import io.swagger.model.Payload;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/user")


@io.swagger.annotations.Api(description = "the user API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-22T09:26:07.219Z")
public class UserApi  {
   private final UserApiService delegate = UserApiServiceFactory.getUserApi();

    @PUT
    @Path("/add")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "add a user", notes = "", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "user added", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class) })

    public Response userAddPut(
@ApiParam(value = "user name")@FormParam("name")  String name,
@ApiParam(value = "user address")@FormParam("address")  String address,
@ApiParam(value = "user email")@FormParam("emailAddress")  String emailAddress,
@ApiParam(value = "user phone number")@FormParam("phoneNumber")  String phoneNumber,
@ApiParam(value = "user fax number")@FormParam("faxNumber")  String faxNumber,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userAddPut(name,address,emailAddress,phoneNumber,faxNumber,securityContext);
    }
    @DELETE
    @Path("/delete/{user-id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "delete a user", notes = "", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "user deleted", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class) })

    public Response userDeleteUserIdDelete(
@ApiParam(value = "",required=true) @PathParam("user-id") String userId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userDeleteUserIdDelete(userId,securityContext);
    }
    @GET
    @Path("/get/{user-id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get user data by id", notes = "", response = User.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "user response", response = User.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = User.class) })

    public Response userGetUserIdGet(
@ApiParam(value = "",required=true) @PathParam("user-id") String userId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userGetUserIdGet(userId,securityContext);
    }
    @GET
    @Path("/getall")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get all users", notes = "", response = User.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array of user", response = User.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = User.class, responseContainer = "List") })

    public Response userGetallGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userGetallGet(securityContext);
    }
    @POST
    @Path("/update/{user-id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "update a user", notes = "", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "user updated", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class) })

    public Response userUpdateUserIdPost(
@ApiParam(value = "",required=true) @PathParam("user-id") String userId,
@ApiParam(value = "Request Body" ) Payload payload,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.userUpdateUserIdPost(userId,payload,securityContext);
    }
}
