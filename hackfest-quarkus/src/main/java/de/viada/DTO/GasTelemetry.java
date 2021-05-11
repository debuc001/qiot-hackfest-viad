package de.viada.DTO;


import java.time.Instant;

public class GasTelemetry {

    private String instant;
    private int stationID;
    private GasDTO gasDTO;

    public GasTelemetry() {}

    public GasTelemetry(int _stationID, GasDTO _gasDTO ) {
        instant = Instant.now().toString();
        gasDTO = _gasDTO;
        stationID = _stationID;
    }

    public String getInstant() { return instant; }

    public void setInstant(String instant) { this.instant = instant; }

    public int getStationID() { return stationID; }

    public void setStationID(int stationID) { this.stationID = stationID; }

    public GasDTO getGasDTO() { return gasDTO; }

    public void setGasDTO(GasDTO gasDTO) { this.gasDTO = gasDTO; }

}
