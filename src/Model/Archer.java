package Model;

public class Archer extends AttackTower{

   public Archer(int x, int y) {
       super(x, y);
       //cost = 1;
       //model = archerImage;
       damage = 5;
       fireSpeed = 200;
       range = 200;
   }

   @Override
   public void shoot() {
        AEnemy target = findFirstTarget(null);
        // target.health -= getDamage();
   }

   @Override
   public void place(int x, int y) {
       setX(x);
       setY(y);
   }
}
