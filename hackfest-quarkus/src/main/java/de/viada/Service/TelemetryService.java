package de.viada.Service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

/**
 * Service to send processed Telemetry Data to DataHub.
 */
@ApplicationScoped
public class TelemetryService {

    @Inject
    @Channel("gas")
    Emitter<String> gasEmitter;

    @Inject
    @Channel("pollution")
    Emitter<String> particulatesEmitter;

    /**
     * Sends processed Gas Telemetry to the DataHub.
     * @param data String
     */
    public void sendGas(String data) {
        gasEmitter.send(data);
    }

    /**
     * Sends processed Particulates Telemetry to the DataHub.
     * @param data String
     */
    public void sendParticulates(String data) {
        particulatesEmitter.send(data);
    }
}