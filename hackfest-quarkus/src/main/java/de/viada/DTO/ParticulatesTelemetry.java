package de.viada.DTO;

import java.time.Instant;

public class ParticulatesTelemetry {


    private String instant;
    private int stationID;
    private ParticulatesDTO particulatesDTO;

    public ParticulatesTelemetry() {}

    public ParticulatesTelemetry(int _stationID, ParticulatesDTO _particulatesDTO ) {
        instant = Instant.now().toString();
        particulatesDTO = _particulatesDTO;
        stationID = _stationID;
    }

    public String getInstant() { return instant; }

    public void setInstant(String instant) { this.instant = instant; }

    public int getStationID() { return stationID; }

    public void setStationID(int stationID) { this.stationID = stationID; }

    public ParticulatesDTO getParticulatesDTO() { return particulatesDTO; }

    public void setParticulatesDTO(ParticulatesDTO particulatesDTO) { this.particulatesDTO = particulatesDTO; }
}
