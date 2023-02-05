package phoenix.types;

import phoenix.abs.Soldier;
import phoenix.enums.SoldierType;

/**
 * @author mert on 5.02.2023
 * @project FactoryMethodDemo
 */
public class Private extends Soldier {

    @Override
    public void printSoldierType() {
        soldierType = SoldierType.PRIVATE;
        System.out.println(this.getClass().getSimpleName() + " generated");
    }

}
