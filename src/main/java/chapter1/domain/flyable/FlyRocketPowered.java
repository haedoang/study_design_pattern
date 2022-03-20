package chapter1.domain.flyable;

/**
 * author : haedoang
 * date : 2022/03/21
 * description :
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("로켓 추진으로 날아갑니다");
    }
}
