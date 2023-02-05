import phoenix.abs.Soldier;
import phoenix.enums.SoldierType;

/**
 * @author mert on 5.02.2023
 * @project ${FactoryMethodDemo}
 */
public class Main {
    public static void main(String[] args) {

        Soldier soldier1 = Soldier.generateSoldier(SoldierType.COMMANDER);
        Soldier soldier2 = Soldier.generateSoldier(SoldierType.LIEUTENANT);
        Soldier soldier3 = Soldier.generateSoldier(SoldierType.PRIVATE);

        soldier1.printSoldierType();
        soldier2.printSoldierType();
        soldier3.printSoldierType();

    }
}