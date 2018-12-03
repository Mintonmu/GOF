package composoite;

import org.junit.jupiter.api.Test;

/**
 * @author:muming
 * @date:2018/12/2 23:47
 * @description:
 */
public class Clinet {
    @Test
    public void Test() {
        AbstractFile f2, f3, f4, f5, f6;
        Folder f1 = new Folder("我的收藏");
        f2 = new ImageFile("个人头像");
        f3 = new TextFile("hello.txt");

        f1.add(f2);
        f1.add(f3);
        Folder ff = new Folder("电影");
        f4 = new VideoFile("笑傲江湖");

        f4.killVirus();
        //  f2.killVirus();
        //f1.killVirus();
    }
}
