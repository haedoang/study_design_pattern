package chapter1.domain;

import chapter1.domain.flyable.FlyNoWay;
import chapter1.domain.quackable.Quack;

/**
 * author : haedoang
 * date : 2022/03/21
 * description :
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다");
    }
}
