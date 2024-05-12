public interface ParkingSystem {
    //by default the variables in the interface are
    // public, static, final
    double NIGHTLY = 30d;
    double MORNING = 20d;
    double TWENTY_FOUR = 45d;


   double processTicket();


//default double processTickt(int time, double surcharge){
//    switch((time >=0 && time <5)? "twentyFourRate":
//           (time >= 5 && time <17 )?"morningRate":
//           (time >= 17 && time <24)? "nightlyRate": "overTwentyFour"){
//
//        case "twentyFourRate":
//            return surcharge* TWENTY_FOUR + TWENTY_FOUR;
//        case "morningRate":
//            return surcharge* MORNING + MORNING;
//        case "nightlyRate":
//            return surcharge* NIGHTLY + NIGHTLY;
//        default:
//             System.out.println("Please See Attendant");
//             return 0;
//    }
 //}
}