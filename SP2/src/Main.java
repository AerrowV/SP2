public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();

        GasolineCar gasCar = new GasolineCar("A24DSD", "Toyota", "Corolla", 5, 10);
        DieselCar dieselCar = new DieselCar("NIG336", "Mercedes", "S-Class", 5, 10, true);
        ElectricCar electricCar = new ElectricCar("BLU289", "Tesla", "Model S", 5, 103, 531);

        fleet.addCar(gasCar);
        fleet.addCar(dieselCar);
        fleet.addCar(electricCar);

        System.out.println(fleet);

    }


}