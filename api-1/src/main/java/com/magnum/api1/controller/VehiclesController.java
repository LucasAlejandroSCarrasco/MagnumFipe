package com.magnum.api1.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.List;
import java.util.Map;
import com.magnum.shared.MockFipeClient;

@Path("/v1/vehicles")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VehiclesController {

    @POST
    @Path("/load")
    public Response triggerLoad() {
        // mock publish to RabbitMQ
        return Response.accepted().entity("{\"status\":\"mock published brands\"}").build();
    }

    @GET
    @Path("/brands")
    public Response listBrands() {
        List<Map<String,String>> brands = MockFipeClient.getBrands();
        return Response.ok(brands).build();
    }

    @GET
    @Path("/brand/{brandId}/models")
    public Response listModels(@PathParam("brandId") String brandId) {
        return Response.ok(MockFipeClient.getModelsByBrand(brandId)).build();
    }

    @PUT
    @Path("/{vehicleId}")
    public Response updateVehicle(@PathParam("vehicleId") Long id, Map<String,String> body) {
        return Response.ok(Map.of("updated", true, "id", id)).build();
    }
}
