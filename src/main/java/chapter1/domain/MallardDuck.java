package chapter1.domain;

import chapter1.domain.flyable.FlyWithWings;
import chapter1.domain.quackable.Quack;

/**
 * author : haedoang
 * date : 2022/03/21
 * description :
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("저는 물 오리입니다.");
    }
}
