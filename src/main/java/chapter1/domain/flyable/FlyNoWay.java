package chapter1.domain.flyable;

/**
 * author : haedoang
 * date : 2022/03/21
 * description :
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("저는 못 날아요..");
    }
}
