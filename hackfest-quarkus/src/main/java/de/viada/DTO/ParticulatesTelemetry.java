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
    public String toJSON() {
        return "{" +
                "\"stationID\":" + stationID +
                ",\"instant\": \"" + instant + "\"" +
                ",\"pm1_0\":" + particulatesDTO.getPm1_0()+
                ",\"pm2_5\":" + particulatesDTO.getPm2_5() +
                ",\"pm10\":" + particulatesDTO.getPm10()+
                ",\"pm1_0_atm\":" + particulatesDTO.getPm1_0_atm() +
                ",\"pm2_5_atm\":" + particulatesDTO.getPm2_5_atm()+
                ",\"pm10_atm\":" + particulatesDTO.getPm10_atm() +
                ",\"gt0_3um\":" + particulatesDTO.getGt0_3um()+
                ",\"gt0_5um\":" + particulatesDTO.getGt0_5um()+
                ",\"gt1_0um\":" + particulatesDTO.getGt1_0um()+
                ",\"gt2_5um\":" + particulatesDTO.getGt2_5um() +
                ",\"gt5_0um\":" + particulatesDTO.getGt0_5um() +
                ",\"gt10um\":" + particulatesDTO.getGt10um() +
                ",\"status\":" + particulatesDTO.getStatus() +
                "}";
    }
    public String getInstant() { return instant; }

    public void setInstant(String instant) { this.instant = instant; }

    public int getStationID() { return stationID; }

    public void setStationID(int stationID) { this.stationID = stationID; }

    public ParticulatesDTO getParticulatesDTO() { return particulatesDTO; }

    public void setParticulatesDTO(ParticulatesDTO particulatesDTO) { this.particulatesDTO = particulatesDTO; }
}
