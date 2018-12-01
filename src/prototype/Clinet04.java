package prototype;

/**
 * @author:muming
 * @date:2018/12/1 14:12
 * @description:new对象相当耗时就使用clone模式
 */
public class Clinet04 {
    public static void testNew(int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            LopTop t = new LopTop();
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start));
    }

    public static void testClone(int size) throws CloneNotSupportedException {
        long start = System.currentTimeMillis();
        LopTop t = new LopTop();
        for (int i = 0; i < size; i++) {
            LopTop temp = (LopTop) t.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start));
    }

    public static void main(String[] agrs) throws CloneNotSupportedException {

        testNew(1000);
        testClone(1000);

    }
}


class LopTop implements Cloneable {
    public LopTop() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}