package phoenix.types;

import phoenix.abs.Soldier;
import phoenix.enums.SoldierType;

/**
 * @author mert on 5.02.2023
 * @project FactoryMethodDemo
 */
public class Commander extends Soldier {

    @Override
    public void printSoldierType() {
        soldierType = SoldierType.COMMANDER;
        System.out.println(this.getClass().getSimpleName() + " generated");
    }

}
