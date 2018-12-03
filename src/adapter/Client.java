package adapter;


/**
 * @author:muming
 * @date:2018/12/1 14:31
 * @description:
 */
public class Client {

    public static void main(String[] agrs) {
        Client client = new Client();
        Adaptee adaptee = new Adaptee();
        Target t = new Adapter(adaptee);
        client.Test(t);
    }

    public void Test(Target target) {
        target.handleReq();
    }

}
