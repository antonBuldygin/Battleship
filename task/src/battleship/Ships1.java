package battleship;

import java.util.ArrayList;
import java.util.List;

public enum Ships1 {

    AIRCRAFT_CARRIER(5, "Aircraft Carrier ", new ArrayList<>()),
    BATTLESHIP(4, "Battleship ", new ArrayList<>()),
    SUBMARINE(3, "Submarine",  new ArrayList<>()),
    CRUISER(3, "Cruiser",  new ArrayList<>()),
    DESTROYER(2, "Destroyer",  new ArrayList<>());

    int cells;
    String ship;
    List<String> list;

    public int getCells() {
        return cells;
    }

    public String getShip() {
        return ship;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    Ships1(int cells, String ship, List<String> list) {
        this.cells = cells;
        this.ship = ship;
        this.list =list;
    }
}
