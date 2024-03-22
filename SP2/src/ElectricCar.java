public class ElectricCar extends ACar {
    private int batteryCapacityKWh;
    private int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacityKWh, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public int getMaxRangeKm() {
        return maxRange;
    }

    public int getWhPrKm() {
        return (batteryCapacityKWh * 1000) / maxRange;
    }

    @Override
    public int getRegistrationFee() {
        double kmPerLitreEquivalent = (100 / (getWhPrKm()/ 91.25));
        int fee;
        if (kmPerLitreEquivalent >= 20 && kmPerLitreEquivalent <= 50) {
            fee = 330;
        } else if (kmPerLitreEquivalent >= 15 && kmPerLitreEquivalent < 20) {
            fee = 1050;
        } else if (kmPerLitreEquivalent >= 10 && kmPerLitreEquivalent < 15) {
            fee = 2340;
        } else if (kmPerLitreEquivalent >= 5 && kmPerLitreEquivalent < 10) {
            fee = 5500;
        } else {
            fee = 10470;
        }

        return fee;
    }

    @Override
    public String toString() {
        return  "Electric Car: \n" +
                "Registration Number = " + getRegistrationNumber() + "\n" +
                "Brand = " + getMake() + "\n" +
                "Model = " + getModel() + "\n" +
                "Number of Doors = " + getNumberOfDoors() + "\n" +
                "Battery Capacity KWh = " + batteryCapacityKWh + "\n" +
                "Max Range = " + maxRange + "\n" +
                "Watt Pr. Km: " + getWhPrKm() + "\n" +
                "Fee = " + getRegistrationFee() + "\n";
    }
    }


