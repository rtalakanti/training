package org.raja.drink.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.raja.drink.model.CardPayment;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

/**
 * PaymentsGateway
 */

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient
public interface PaymentsGateway {

    @POST
    @Path("/post")
    Response makePayment(CardPayment payment);
}
