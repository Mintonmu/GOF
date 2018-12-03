package composoite;

/**
 * @author:muming
 * @date:2018/12/2 23:55
 * @description:
 */
public class VideoFile implements AbstractFile {
    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {

        System.out.println("视频文件" + name);

    }
}
