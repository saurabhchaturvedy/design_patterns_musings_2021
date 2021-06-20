public class MediatorTest {

    public static void main(String[] args) {
        Runway runway = new Runway("A1-01");

        AircraftMediator aircraftMediator = new AirTrafficControlRoom();
        aircraftMediator.registerRunway(runway);

        Aircraft aircraft1 = new Aircraft(aircraftMediator, "1E-292");
        Aircraft aircraft2 = new Aircraft(aircraftMediator, "1B-636");

        aircraft1.startLanding();
        System.out.println();
        aircraft2.startLanding();  // can't land only one runway
        System.out.println();
        aircraft1.finishLanding();
        System.out.println();
        aircraft2.startLanding();  // Lands this time !!, previous aircraft finished landing , now runway is available for landing of aircraft 2 !


    }
}
