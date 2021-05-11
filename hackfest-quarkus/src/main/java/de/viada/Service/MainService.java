package de.viada.Service;

import javax.enterprise.context.ApplicationScoped;
import io.quarkus.scheduler.Scheduled;

@ApplicationScoped
public class MainService {

    //@RegisterRestClient
    //    @GET    @Path("/gas")    @Consumes(MediaType.APPLICATION_JSON)    GasRaw getGas();
    // @ApplicationScoped
    //@RegisterRestClient(baseUri = "http://qiot-sensor-service:5000")

    // Rest-Clients der Flask ansteuert @RegisterRestClient
    // DTOs bauen für GAS und POLLUTION (?)
    /*
    */

    @Scheduled(every = "5s")
    public void mainMethod(){
        System.out.println("TEST");
        //
        // get the pollution data
        // get the gas data
        // ...
        // send the data
    }
}
