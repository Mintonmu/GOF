package proxy.staticproxy;

/**
 * @author:muming
 * @date:2018/12/1 15:02
 * @description:
 */
public class RealStar implements Star {
    @Override
    public void confer() {
        System.out.println("RealStar confer");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar signContract");
    }

    @Override
    public void bookTicket() {
        System.out.println("RealStar bookTicket");
    }

    @Override
    public void sing() {
        System.out.println("RealStar Sing");
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar collectMoney");
    }
}
