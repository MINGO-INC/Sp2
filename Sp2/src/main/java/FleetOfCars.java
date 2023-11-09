import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car>fleet = new ArrayList<Car>();

    public void addCar(Car car){
        fleet.add(car);

    }

    public int getTotalRegistrationFeeForFleet(){
int svar=0;
        for(Car car:fleet){
            svar+=car.getRegistrationFee();

        }return svar;

    }

    @Override
    public String toString() {
        System.out.println("fleet of cars");
        int count=1;
        for(int i=0;i<fleet.size();i++){
            System.out.println(count+i+": "+fleet.get(i));
        }
        return "";
    }
}
