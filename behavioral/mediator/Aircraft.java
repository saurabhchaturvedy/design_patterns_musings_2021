public class Aircraft implements AircraftColleague {

    private AircraftMediator aircraftMediator;
    private String flightName;

    public Aircraft(AircraftMediator aircraftMediator, String flightName) {
        this.aircraftMediator = aircraftMediator;
        this.flightName = flightName;
    }

    @Override
    public void startLanding() {
        String runway = aircraftMediator.allotRunwayTo(this);
        if (runway == null) {
            System.out.printf("Flight %s landing is delayed due to technical reasons ", flightName);
        } else {
            System.out.printf("Fasten seat-belts , Flight %s is going to land on the runway %s", flightName, runway);
        }
    }

    @Override
    public void finishLanding() {

        boolean isRunWayReleased = aircraftMediator.releaseRunwayOccupiedBy(this);
        if (isRunWayReleased) {
            System.out.printf("Flight %s has finished landing successfully", flightName);
        }
    }
}
