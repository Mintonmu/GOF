package proxy.staticproxy;


/**
 * @author:muming
 * @date:2018/12/1 14:57
 * @description:
 */
public class Client {

    public static void main(String[] args) {

        Star star = new RealStar();
        Star proxy = new ProxyStar(star);
        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();

        proxy.collectMoney();
    }
}
