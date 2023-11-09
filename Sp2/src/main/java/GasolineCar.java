public class GasolineCar extends AFuelCar{

    public GasolineCar(String registrationNumber, String make, String model, int doors, int kmPrLitre) {
        super(registrationNumber, make, model, doors, kmPrLitre);
    }
    public String getFuelType(){

        return null;
    }


    public int getRegistrationFee() {
        if(kmPrLitre>20 && kmPrLitre<=50){
           return 330;
        }else if (kmPrLitre >15 && kmPrLitre <=20){
          return 1050;
        } else if (kmPrLitre >10 && kmPrLitre <=15) {
           return 2340;
        }else if(kmPrLitre >5 && kmPrLitre<=10){
            return 5500;
        }else {
            return 10470;
        }
    }
    @Override
    public String toString() {
        return super.toString() + "FuelType: " + getFuelType();
    }
}
