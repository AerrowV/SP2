import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car) {
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet() {
        int totalFee = 0;
        for (Car car : fleet) {
            totalFee += car.getRegistrationFee();
        }
        return totalFee;

    }

    @Override
    public String toString() {
            for (Car car : fleet) {
                System.out.println(car);

            }
            return "Total registration fee for the fleet: " + getTotalRegistrationFeeForFleet() + " kr";

    }

    }


