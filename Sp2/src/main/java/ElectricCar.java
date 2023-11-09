public class ElectricCar extends ACar {
    private int batteryCapacityKWh;
    private int maxRangeKm;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacityKWh, int maxRangeKm) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxRangeKm = maxRangeKm;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public int getMaxRangeKm() {
        return maxRangeKm;
    }

    public int getWhPrKm() {
        int whprkm=batteryCapacityKWh / maxRangeKm;
        return (int) ((int)whprkm/91.25/100);
    }

    @Override
    public int getRegistrationFee() {
        if(getWhPrKm()>20 && getWhPrKm()<=50){
            return 330;
        }else if (getWhPrKm() >15 && getWhPrKm() <=20){
            return 1050;
        } else if (getWhPrKm() >10 && getWhPrKm() <=15) {
            return 2340;
        }else if(getWhPrKm() >5 && getWhPrKm()<=10){
            return 5500;
        }else {
            return 10470;
        }

    }

    @Override
    public String toString() {
        // Override toString() to represent ElectricCar details
        return super.toString() + ", Battery Capacity: " + batteryCapacityKWh + " kWh, Max Range: " + maxRangeKm + " km";
    }
}
