package src.Model;

public class TowerTile extends ATile {

    private String towerType;

    public TowerTile(int x, int y, boolean placeable) {
        super(x, y, placeable);
    }

    public String getTowerType(){
        return towerType;
    }
}
