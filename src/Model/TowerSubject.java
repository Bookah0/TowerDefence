package src.Model;

public interface TowerSubject {
    void addObserver(ICreateObservable observer);
    void removeObserver(ICreateObservable observer);
    void notifyObservers(int x, int y, String towerType);
    void notifyObservers(int x, int y, String towerType, int upgradeType);
}
