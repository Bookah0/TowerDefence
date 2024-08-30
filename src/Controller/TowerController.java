package src.Controller;

import java.util.List;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.BorderUIResource;

import src.Model.ATower;
import src.Model.TowerSubject;
import src.View.GameView;
import src.Model.AMap;

public abstract class TowerController extends JPanel{
    protected TowerSubject towerSubject;

    public void createTower(String type) {
        towerSubject.notifyObservers(savedMousePosX, savedMousePosY, type);
    }

    protected int savedMousePosX;
    protected int savedMousePosY;
    protected GameView gameView;

    public TowerController(TowerSubject towerSubject, GameView gameView) {
        this.towerSubject = towerSubject;
        this.gameView = gameView;
        initTowerController();
    }

    public void initTowerController() {

    }

    public void handleButtonClick(String type) {
    
    }

    public void setSavedMousePos(int x, int y){
        savedMousePosX = x;
        savedMousePosY = y;
    }

}