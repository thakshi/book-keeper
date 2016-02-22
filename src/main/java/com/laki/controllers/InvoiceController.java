package com.laki.controllers;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/invoice")
public class InvoiceController {


    @POST
    @Path("/add")
    public Response addInvoice(@FormParam("name") String name, @FormParam("date") String date, @FormParam("address") String address,
                               @FormParam("tpNo") String tpNo, @FormParam("invoice-table") String invoiceTable){
        System.out.println("execution comes here");
        return Response.status(200).entity("").build();
    }



}
