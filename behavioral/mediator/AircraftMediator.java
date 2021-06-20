public interface AircraftMediator {

    void registerRunway(Runway runway);

    String allotRunwayTo(Aircraft aircraft);

    boolean releaseRunwayOccupiedBy(Aircraft aircraft);
}
