public abstract class ACar implements Car {
    String registrationNumber;
    final String make;
    final String model;
    int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors ) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    @Override
    public String toString(){
        return "RegistrationNumber: " + getRegistrationNumber() +
                ",Make: " + getMake() +
                ", Model: " + getModel() +
                ", Number Of Doors" + getNumberOfDoors();
    }
}