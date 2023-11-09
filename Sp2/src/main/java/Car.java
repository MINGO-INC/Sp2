public interface Car {
    default String getRegistrationNumber(){
        return null;
    }

    default String getMake(){
        return null;
    }

    default String getModel(){
        return null;
    }
    default int getNumberOfDoors(){
        return 0;
    }
    default int getRegistrationFee(){
        return 0;
    }

}