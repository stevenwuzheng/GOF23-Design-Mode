package jiegou.composition;

public interface Component {
    void operation();
}

/*叶子节点*/
interface Leaf extends Component {

}

/*容器节点*/
interface Composition extends Component {
    public void add(Leaf lf);
    public void remove(int index);
}