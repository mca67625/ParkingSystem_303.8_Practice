public class HospitalParking implements ParkingSystem {

    private int time;
    private double surcharge = .2;

    HospitalParking(int time){
        this.time = time;
    }

    @Override
    public String toString() {
        String price = String.format("Price for Hospital Parking is: $%.2f",processTicket());
       return price;
    }

    public double processTicket(){
        double price = 0;
        if(time >= 5 || time <= 17){
            price = surcharge * MORNING +MORNING;
        }
        if(time > 17 || time <= 24){
            price = surcharge * NIGHTLY +NIGHTLY;
        }
        if(time > 0 || time < 5){
            price = surcharge * TWENTY_FOUR +TWENTY_FOUR;
        }
        return price;
    }
}

