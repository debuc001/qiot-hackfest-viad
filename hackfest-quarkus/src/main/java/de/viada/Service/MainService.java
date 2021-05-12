package de.viada.Service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import io.quarkus.scheduler.Scheduled;
import de.viada.DTO.*;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class MainService {

    // Rest-Client der Flask ansteuert @RegisterRestClient

    @Inject
    @RestClient
    private SensorService sensorService;

    @Scheduled(every = "5s")
    public void mainMethod(){
        System.out.println("TEST");
        try {
            GasDTO gasDTO = this.sensorService.getGas();
            GasTelemetry gasTelementry = new GasTelemetry( this.teamId, gasDTO);
            // send telemetry as json
            System.out.println("Gas Telemetry sucessfully sent.");
        } catch (Exception ex){
            System.out.println("Gas Telemetry could not be send.");
        }
        try {
            ParticulatesDTO particulatesDTO = this.sensorService.getParticulates();
            ParticulatesTelemetry particulatesTelemetry = new ParticulatesTelemetry( this.teamId, particulatesDTO);
            // send telemetry as json
            System.out.println("Particulates Telemetry sucessfully sent.");
        } catch (Exception ex){
            System.out.println("Particulates Telemetry could not be send.");
        }
    }
}
