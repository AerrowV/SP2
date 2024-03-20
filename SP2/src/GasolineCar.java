public class GasolineCar extends AFuelCar {

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee() {
        int kmPrLitre = getKmPrLitre();
        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            return 330;
        } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
            return 1050;
        } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            return 2340;
        } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
            return 5500;
        } else {
            return 10470;
        }

    }

    @Override
    public String toString(){
        return  "Gasoline Car: \n" +
                "Registration Number = " + getRegistrationNumber() + "\n" +
                "Brand = " + getMake() + "\n" +
                "Model = " + getModel() + "\n" +
                "Number of Doors = " + getNumberOfDoors() + "\n" +
                "Km. Pr. Litre = " + getKmPrLitre() + "\n" +
                "Fuel Type: " + getFuelType() + "\n" +
                "Fee = " + getRegistrationFee() + "\n";
    }
}