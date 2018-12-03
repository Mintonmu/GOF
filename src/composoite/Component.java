package composoite;

/**
 * @author:muming
 * @date:2018/12/2
 * @description:组合模式
 */
public interface Component {
    void operation();
}

interface Leaf extends Component {

}

interface Composite extends Component {
    void add(Component component);

    void remove(Component component);

    Component getChild(Component component);
}