public class DieselCar extends AFuelCar {
    private boolean hasParticleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean hasParticleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.hasParticleFilter = hasParticleFilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
            int surcharge;
            int kmPrLitre = getKmPrLitre();

            if (kmPrLitre >= 20 && kmPrLitre <= 50) {
                surcharge = 130;
            } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
                surcharge = 1390;
            } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
                surcharge = 1850;
            } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
                surcharge = 2770;
            } else {
                surcharge = 15260;
            }

            return surcharge + (hasParticleFilter() ? 0 : 1000); // Additional fee if no particle filter
        }

    public boolean hasParticleFilter() {
        return hasParticleFilter;
    }

    @Override
    public String toString() {
        return  "Diesel Car: \n" +
                "Registration Number = " + getRegistrationNumber() + "\n" +
                "Brand = " + getMake() + "\n" +
                "Model = " + getModel() + "\n" +
                "Number of Doors = " + getNumberOfDoors() + "\n" +
                "Km. Pr. Litre = " + getKmPrLitre() + "\n" +
                "Fuel Type: " + getFuelType() + "\n" +
                "Has Filter: " + hasParticleFilter + "\n" +
                "Fee = " + getRegistrationFee() + "\n";

    }
}


