package bridege;

import org.junit.jupiter.api.Test;

/**
 * @author:muming
 * @date:2018/12/2 23:24
 * @description:桥接模式
 */
public class Client {
    @Test
    public void Test() {
        Computer2 c = new Desktop2(new Lenovo());
        c.sale();

        Computer2 d = new Laptop2(new SZ());
        d.sale();
    }
}
