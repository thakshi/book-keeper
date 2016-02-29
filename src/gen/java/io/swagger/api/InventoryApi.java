package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.InventoryApiService;
import io.swagger.api.factories.InventoryApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Error;
import io.swagger.model.Inventory;
import io.swagger.model.Payload1;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/inventory")


@io.swagger.annotations.Api(description = "the inventory API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-02-27T14:28:47.690Z")
public class InventoryApi  {
   private final InventoryApiService delegate = InventoryApiServiceFactory.getInventoryApi();

    @PUT
    @Path("/add")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "add an inventory item", notes = "", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "inventory item added", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class) })

    public Response inventoryAddPut(
@ApiParam(value = "", required=true)@FormParam("inventoryCode")  String inventoryCode,
@ApiParam(value = "", required=true)@FormParam("name")  String name,
@ApiParam(value = "", required=true)@FormParam("itemPrice")  String itemPrice,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.inventoryAddPut(inventoryCode,name,itemPrice,securityContext);
    }
    @DELETE
    @Path("/delete/{inventory-code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "delete an inventory item", notes = "", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "inventory item deleted", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class) })

    public Response inventoryDeleteInventoryCodeDelete(
@ApiParam(value = "",required=true) @PathParam("inventory-code") String inventoryCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.inventoryDeleteInventoryCodeDelete(inventoryCode,securityContext);
    }
    @GET
    @Path("/get/{inventory-code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get inventory data by id", notes = "", response = Inventory.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "inventory item response", response = Inventory.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Inventory.class) })

    public Response inventoryGetInventoryCodeGet(
@ApiParam(value = "",required=true) @PathParam("inventory-code") String inventoryCode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.inventoryGetInventoryCodeGet(inventoryCode,securityContext);
    }
    @GET
    @Path("/getall")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "get all inventory data", notes = "return all inventory items", response = Inventory.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array of inventory items", response = Inventory.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Inventory.class, responseContainer = "List") })

    public Response inventoryGetallGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.inventoryGetallGet(securityContext);
    }
    @POST
    @Path("/update/{inventory-code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "update an inventory item", notes = "", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "inventory updated", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = void.class) })

    public Response inventoryUpdateInventoryCodePost(
@ApiParam(value = "",required=true) @PathParam("inventory-code") String inventoryCode,
@ApiParam(value = "Request Body" ) Payload1 payload,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.inventoryUpdateInventoryCodePost(inventoryCode,payload,securityContext);
    }
}
