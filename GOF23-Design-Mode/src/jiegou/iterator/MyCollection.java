package jiegou.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyCollection {
    private List<Object> list;
    private MyIterator iterator;

    public MyCollection() {
        list = new ArrayList<>();
    }

    public List<Object> getList() {
        return list;
    }

    public void addObject(Object obj) {
        this.list.add(obj);
    }

    public void removeObject(Object obj) {
        this.list.remove(obj);
    }

    //获取到游标对象
    public MyIterator getIterator() {
        if (iterator == null) {
            iterator = new MyIteratorImpl();
        }
        return iterator;
    }


    //定义一个内部类，实现迭代器接口
    private class MyIteratorImpl implements MyIterator {

        private int cursor; //用于记录遍历到的位置

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if (cursor < list.size()) {
                cursor++;
            }
        }

        @Override
        public boolean hasNext() {
            if (cursor < list.size()) {
                return true;
            }
            return false;
        }

        @Override
        public boolean isFirst() {
            return cursor == 0;
        }

        @Override
        public boolean isLast() {
            return cursor == list.size()-1;
        }

        @Override
        public Object getCurrentObj() {
            if (cursor < list.size()) {
                return list.get(cursor);
            }
            return null;
        }
    }


}

