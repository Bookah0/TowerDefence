package src.Controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import src.Model.AMap;
import src.Model.ICreateObservable;
import src.Model.TowerSubject;
import src.View.GameView;

public class CreateTowerController extends TowerController implements ICreateObservable{

    public CreateTowerController(TowerSubject towerSubject, GameView gameView) {
        super(towerSubject, gameView);
        super.towerSubject.addObserver(this);
    }

/*    @Override
    public void initTowerController() {
        JLabel label = new JLabel("Create Towers");
        label.setForeground(Color.BLACK);

        JPanel buttonPanel = new JPanel();

        buttonPanel.setBackground(Color.BLUE);
        buttonPanel.setLayout(new GridLayout(0, 4, 10, 10));
        buttonPanel.setPreferredSize(new Dimension(300, 200));

        List<JButton> listwithButtons = getButtons();
        buttonPanel.add(label, BorderLayout.CENTER);
        for (JButton button : listwithButtons) {
            button.setBackground(Color.WHITE);
            System.out.println("inne i knappenloopne");
            button.setPreferredSize(new Dimension(10, 10));
            buttonPanel.add(button);
        }

    }
*/

    public void createTower(String type) {
        towerSubject.notifyObservers(savedMousePosX, savedMousePosY, type);
        gameView.placeTower(savedMousePosX, savedMousePosY, type);
    }

    @Override
    public void handleButtonClick(String type) {
        createTower(type);
    }

}
