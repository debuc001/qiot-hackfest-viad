package de.viada.Service;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * ReST-Service to Register to DataHub
 */
@RegisterRestClient(baseUri = "http://registration-service-qiotcovid19v2.apps.cluster-cf04.cf04.sandbox37.opentlc.com",
                    configKey = "registration-api")
@ApplicationScoped
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public interface DataHubClientService {

    /**
     * Register Station at the DataHub.
     *
     * @param serial    Serial ID from Hardware
     * @param name      Group/Team-Name
     * @param longitude Longitude (Coordinates)
     * @param latitude  Latetude (Coordinates)
     * @param keystore  Keystore (Verification)
     * @return int
     * @throws Exception
     */
    @POST
    @Path("/v1/register/serial/{serial}/name/{name}/longitude/{longitude}/latitude/{latitude}/keystore/{keystore}")
    public int register(@PathParam("serial") String serial,
                        @PathParam("name") String name,
                        @PathParam("longitude") double longitude,
                        @PathParam("latitude") double latitude,
                        @PathParam("keystore") String keystore) throws Exception;
}