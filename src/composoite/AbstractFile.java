package composoite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:muming
 * @date:2018/12/2
 * @description:
 */
public interface AbstractFile {
    void killVirus();

}

//叶子节点
class ImageFile implements AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("图形文件" + name);
    }
}

class TextFile implements AbstractFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("图形文件" + name);
    }
}

//容器
class Folder implements AbstractFile {

    private String name;
    private List<AbstractFile> list = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile abstractFile) {
        list.add(abstractFile);
    }

    public void remove(AbstractFile abstractFile) {
        list.remove(abstractFile);
    }

    public AbstractFile getChile(int index) {
        return list.get(index);
    }

    @Override
    public void killVirus() {
        System.out.println("文件夹查杀" + name);
        list.forEach(AbstractFile::killVirus);
//        for (var i : list
//        ) {
//            i.killVirus();
//        }
    }
}