package chapter1;

import chapter1.domain.MallardDuck;
import chapter1.domain.ModelDuck;
import chapter1.domain.flyable.FlyRocketPowered;

/**
 * author : haedoang
 * date : 2022/03/21
 * description :
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        final MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("--------------------");

        final ModelDuck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.swim();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
