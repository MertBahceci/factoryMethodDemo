package phoenix.abs;

import phoenix.enums.SoldierType;
import phoenix.types.Commander;
import phoenix.types.Lieutenant;
import phoenix.types.Private;

/**
 * @author mert on 5.02.2023
 * @project FactoryMethodDemo
 */
public abstract class Soldier {

    public SoldierType soldierType;

    abstract public void printSoldierType();

    public static Soldier generateSoldier(SoldierType soldierType){
        if (soldierType == SoldierType.COMMANDER){
            return new Commander();
        }else if (soldierType == SoldierType.LIEUTENANT){
            return new Lieutenant();
        }else if (soldierType == SoldierType.PRIVATE){
            return new Private();
        }else
            return null;

    }

}
