package bridege;

/**
 * @author:muming
 * @date:2018/12/2
 * @description:
 */
public interface Brand {

    void sale();
}


class Lenovo implements Brand {

    @Override
    public void sale() {
        System.out.println("销售联想电脑");
    }
}

class DEll implements Brand {

    @Override
    public void sale() {
        System.out.println("销售戴尔电脑") ;
    }
}
class SZ implements Brand{

    @Override
    public void sale() {
        System.out.println("销售神州笔记本");
    }
}