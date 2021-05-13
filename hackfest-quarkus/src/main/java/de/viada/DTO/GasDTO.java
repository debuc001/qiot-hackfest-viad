package de.viada.DTO;

public class GasDTO {
    private String status;
    private String stationID;
    private double adc;
    private double nh3;
    private double oxidising;
    private double reducing;

    public GasDTO() {}

    public double getAdc() { return adc; }

    public void setAdc(double adc) { this.adc = adc; }

    public double getNh3() { return nh3; }

    public void setNh3(double nh3) { this.nh3 = nh3; }

    public double getOxidising() { return oxidising; }

    public void setOxidising(double oxidising) { this.oxidising = oxidising; }

    public double getReducing() { return reducing; }

    public void setReducing(double reducing) { this.reducing = reducing; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public String getStationID() { return stationID; }

    public void setStationID(String stationID) { this.stationID = stationID; }

    @Override
    public String toString() {
        return "Gas{" +
                ", adc=" + adc +
                ", nh3=" + nh3 +
                ", oxidising=" + oxidising +
                ", reducing=" + reducing +
                ", status='" + status + '\'' +
                '}';
    }
}
