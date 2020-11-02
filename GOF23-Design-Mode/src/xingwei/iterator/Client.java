package xingwei.iterator;

//迭代器
public class Client {
    public static void main(String[] args) {

        MyCollection collection = new MyCollection();
        collection.addObject(1);
        collection.addObject(2);
        collection.addObject(5);
        collection.addObject(3);
        collection.addObject(4);
        System.out.println("collection.getList() = " + collection.getList());
        
        collection.removeObject(5);
        System.out.println("collection.getList() = " + collection.getList());
        
        while (collection.getIterator().hasNext()) {
            System.out.println("collection.getIterator().getCurrentObj() = " + collection.getIterator().getCurrentObj());
            collection.getIterator().next();
        }

    }
}
