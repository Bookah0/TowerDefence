package src.Controller;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import src.Model.AMap;
import src.View.GameView;

public class UpgradeTowerController extends TowerController {
    
    private String towerType;
    
    public UpgradeTowerController(GameView gameView, AMap map, JLabel label, String towerType) {
        super(gameView, map, label);
        this.towerType = towerType;
        // TODO Auto-generated constructor stub
    }

    public String getTowerType() {
        return towerType;
    }

    /// Methods///

    // TODO METHOD upgradeTower();

    // public void upgradeTower(int x, int y, Atower tower){
    // Example: upgrading a tower object and adding it to the game world.
    // ATower newTower = new ATower(x, y, tower);
    // Tell mainModel to upgrade the tower..
    // MainModel.upgrade(newTower);

}