package bridege;

/**
 * @author:muming
 * @date:2018/12/1
 * @description:
 */
public interface  Computer {
    void sale();

}

class Desktop implements Computer {

    @Override
    public void sale() {
        System.out.println("销售台式机");
    }
}

class Laptop implements Computer{

    @Override
    public void sale() {
        System.out.println("销售笔记本电脑");
    }
}
class Pad implements Computer{

    @Override
    public void sale() {
        System.out.println("销售平板电脑");
    }
}
class LenovoDesktop extends Desktop{

    @Override
    public void sale() {
        System.out.println("销售联想电脑");
    }
}