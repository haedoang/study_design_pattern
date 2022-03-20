package chapter1.domain.quackable;

/**
 * author : haedoang
 * date : 2022/03/21
 * description :
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("아무 소리도 내지 못함");
    }
}
