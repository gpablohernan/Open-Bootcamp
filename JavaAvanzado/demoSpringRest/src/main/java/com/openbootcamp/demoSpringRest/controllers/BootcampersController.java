package com.openbootcamp.demoSpringRest.controllers;

import com.openbootcamp.demoSpringRest.models.Bootcamper;
import com.openbootcamp.demoSpringRest.services.BootcamperService;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersController {
    private BootcamperService bootcamperService;

    public BootcampersController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("Pepe", Math.random()));
        this.bootcamperService.add(new Bootcamper("Hugo", Math.random()));
        this.bootcamperService.add(new Bootcamper("Paco", Math.random()));
        this.bootcamperService.add(new Bootcamper("Luis", Math.random()));
    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> listarTodos(){
        return bootcamperService.getAll();
    }

    @GET
    @Path("/bootcampers/{nombre}")
    @Produces("application/json")
    public Bootcamper listarUno(@PathParam("nombre") String nombre){
        return bootcamperService.get(nombre);
    }


    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response meterBootcamper(Bootcamper bootcamper){
        bootcamperService.add(bootcamper);
        return Response.created(
                URI.create("/bootcampers/" + bootcamper.getNombre())
        ).build();
    }
}
