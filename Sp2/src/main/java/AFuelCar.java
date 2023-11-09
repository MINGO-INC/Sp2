public class AFuelCar extends ACar {
    int kmPrLitre;
    public AFuelCar(String registrationNumber, String make, String model, int doors, int kmPrLitre) {
        super(registrationNumber, make, model, doors);
        this.kmPrLitre = kmPrLitre;
    }

    public String getFuelType() {
        return null;
    }

    public int kmPrLitre(){
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return super.toString() + ", Km/L: " + kmPrLitre;
    }

}
