package adapter;

/**
 * @author:muming
 * @date:2018/12/1
 * @description:
 */
public interface Target {
    void handleReq();
}

class Adapter implements Target {
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    private Adaptee adaptee = null;

    @Override
    public void handleReq() {
        adaptee.request();
    }
}