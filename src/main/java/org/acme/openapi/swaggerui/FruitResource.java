package org.acme.openapi.swaggerui;

import io.swagger.annotations.Api;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

@Path("/fruits")
@Api(value = "/fruits")
public class FruitResource {
    private Set<Fruit> fruits = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    private First first ;
    private Second second;

    @Inject
    public FruitResource(First first, Second second) {
        this.first=first;
        this.second=second;
    }

    @GET
    public Set<Fruit> list() {
        return fruits;
    }
}