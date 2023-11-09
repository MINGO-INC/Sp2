public class Main {
    public static void main(String[] args) {

        ElectricCar eCar1 = new ElectricCar("Appelsinerne","Toyota","Century", 5, 100,650);
        ElectricCar eCar2 = new ElectricCar("Appelsinerne","Dodge challanger","Century", 5, 100,650);
        ElectricCar eCar3 = new ElectricCar("Appelsinerne","Model Y","Century", 5, 100,650);

        GasolineCar acar1=new GasolineCar("Appelsinerne","BMW X5","Century",5,15);
        GasolineCar acar2=new GasolineCar("Appelsinerne","BMW X3","Century",5,10);
        GasolineCar acar3=new GasolineCar("Appelsinerne","BMW X7","Century",5,14);

        DieselCar gcar1=new DieselCar("Appelsinerne","ford","Century",5,100,false);
        DieselCar gcar2=new DieselCar("Appelsinerne","ford","Century",5,100,true);
        DieselCar gcar3=new DieselCar("Appelsinerne","ford","Century",5,100,false);

        FleetOfCars fleetOfCars=new FleetOfCars();
        fleetOfCars.addCar(eCar1);
        fleetOfCars.addCar(eCar2);
        fleetOfCars.addCar(eCar3);
        fleetOfCars.addCar(acar1);
        fleetOfCars.addCar(acar2);
        fleetOfCars.addCar(acar3);
        fleetOfCars.addCar(gcar1);
        fleetOfCars.addCar(gcar2);
        fleetOfCars.addCar(gcar3);

        fleetOfCars.toString();
        System.out.println(fleetOfCars.getTotalRegistrationFeeForFleet()+"kr");

    }
}