package chapter1.domain.quackable;

/**
 * author : haedoang
 * date : 2022/03/21
 * description :
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑삑 소리를 냄");
    }
}
