public class DieselCar extends GasolineCar{
    boolean particleFilter;
    public DieselCar(String registrationNumber, String make, String model, int doors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, doors, kmPrLitre);
        this.particleFilter = particleFilter;
    }
    public String getFuelType(){
        return null; // skal returnere gasoline eller diesel
    }
    public boolean hasParticleFilter(){
        return particleFilter;
    }

    /*
      For en Dieselbil er der samme afgift som for benzinbilen, plus en udligningsafgift,
      som også er afhængig af km/l. Hvis bilen kører mellem 20 km/l og 50 km/l er udligningsafgiften
      130 kr, kører den mellem 15 km/l og 20 km/l er den 1390 kr, kører den mellem 10 km/l og 15 km/l
      er den 1850 kr, kører den mellem 5 km/l og 10 km/l er den 2770 kr, og kører den under 5 km/l er
       den 15260 kr. Der er desuden en partikeludledningsafgift på 1000 kr hvis bilen ikke har et
       partikelfilter monteret.


     */

    public int getRegistrationFee(){
        boolean a=true;
        int particleFilterpris=10000;
        if(kmPrLitre>20 && kmPrLitre<=50){
            while(particleFilter==a){
                return 330+particleFilterpris+130;
            }
            return 330+130;

        }else if (kmPrLitre >15 && kmPrLitre <=20){
            while(particleFilter==true){
                return 1050+particleFilterpris+1390;
            }
            return 1050+1390;
        } else if (kmPrLitre >10 && kmPrLitre <=15) {
            while(particleFilter==true){
                return 2340+particleFilterpris+1050;
            }
            return 2340+1850;
        }else if(kmPrLitre >5 && kmPrLitre<=10){
            while(particleFilter==true){
                return 5500+particleFilterpris+2770;
            }
            return 5500+2770;
        }else { while(particleFilter==true){
            return 10470+15260+particleFilterpris;
        }
            return 10470+15260;
        }

    }
    @Override
    public String toString() {
        return super.toString() + ", Fuel Type: " + getFuelType() + ", Particle Filter: " + particleFilter;    }
}
