package bridege;

/**
 * @author:muming
 * @date:2018/12/2 23:21
 * @description:
 */
public class Computer2 {
    protected Brand brand;

    public Computer2(Brand brand) {
        this.brand = brand;
    }

    public void sale() {
        brand.sale();
    }
}


class Desktop2 extends Computer2{
    @Override
    public void sale() {
        super.sale();
        System.out.println("销售台式机");
    }

    public Desktop2(Brand brand) {
        super(brand);
    }
}


class Laptop2 extends Computer2{
    @Override
    public void sale() {
        super.sale();
        System.out.println("销售笔记本");
    }

    public Laptop2(Brand brand) {
        super(brand);
    }
}