package xingwei.iterator;

public interface MyIterator {
    void first(); //将游标指向第一个
    void next(); //将游标执行下一个
    boolean hasNext();
    boolean isFirst();
    boolean isLast();
    Object getCurrentObj();

}
