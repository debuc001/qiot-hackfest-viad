package de.viada.Service;

import de.viada.DTO.GasDTO;
import de.viada.DTO.ParticulatesDTO;
import de.viada.DTO.Serial;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;


/**
 * Service to retrieve Data from Pi
 */
@RegisterRestClient(baseUri = "http://qiot-sensor-service:5000")
public interface SensorService {

    @GET
    @Path("/gas")
    @Consumes(MediaType.APPLICATION_JSON)
    GasDTO getGas();

    @GET
    @Path("/particulates")
    @Consumes(MediaType.APPLICATION_JSON)
    ParticulatesDTO getParticulates();

    /**
     * Retreive Serial-Id from Sensor
     * @return SerialRaw
     */
    @GET
    @Path("/serial")
    @Consumes(MediaType.APPLICATION_JSON)
    Serial getSerial();

}
