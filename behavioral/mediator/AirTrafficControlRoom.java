import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class AirTrafficControlRoom implements AircraftMediator {

    LinkedList<Runway> runwayList = new LinkedList<>();
    Map<Aircraft, Runway> aircraftRunwayMap = new HashMap<>();

    @Override
    public void registerRunway(Runway runway) {
        this.runwayList.add(runway);
    }

    @Override
    public String allotRunwayTo(Aircraft aircraft) {
        Runway runwayToAllot = null;
        if (!this.runwayList.isEmpty()) {
            runwayToAllot = runwayList.removeFirst();
            aircraftRunwayMap.put(aircraft, runwayToAllot);
        }

        return runwayToAllot == null ? null : runwayToAllot.getName();

    }

    @Override
    public boolean releaseRunwayOccupiedBy(Aircraft aircraft) {
        Runway releasedRunway = null;
        if (aircraftRunwayMap.containsKey(aircraft)) {
            releasedRunway = aircraftRunwayMap.remove(aircraft);
            runwayList.add(releasedRunway);
            return true;
        }
        return false;
    }
}
