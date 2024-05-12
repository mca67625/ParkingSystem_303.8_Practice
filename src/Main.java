//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     HospitalParking hospitalParking = new HospitalParking(2);
     System.out.println( hospitalParking.toString());

     MallParking mallParking = new MallParking(2);
     System.out.printf("Price for mall parking is $%.2f", mallParking.processTicket());

//        MallParking
// System.out.println(hospitalParking.processTicket());

        //mp = new MallParking();
//        System.out.println( mp.processTickt(20,.2));
    }
}