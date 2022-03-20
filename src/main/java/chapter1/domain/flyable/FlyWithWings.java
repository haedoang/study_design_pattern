package chapter1.domain.flyable;

/**
 * author : haedoang
 * date : 2022/03/21
 * description :
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날고 있어요!");
    }
}
