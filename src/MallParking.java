public class MallParking implements ParkingSystem{

    private int time;
    private double surcharge = 0.1;

//    public MallParking(){}

    public MallParking(int time){
        this.time = time;
    }


    @Override
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
