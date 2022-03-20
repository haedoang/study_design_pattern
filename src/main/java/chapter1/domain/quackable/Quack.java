package chapter1.domain.quackable;

/**
 * author : haedoang
 * date : 2022/03/21
 * description :
 */
public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("꽥꽥 소리를 냄");
    }
}
