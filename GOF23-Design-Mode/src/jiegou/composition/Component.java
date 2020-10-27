package jiegou.composition;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;


//组合模式涉及的角色及其职责如下：
//
//        抽象组件(Component)角色：为组合对象和叶子对象声明公共的接口，让客户端可以通过这个接口来访问和管理整个对象树，并可以为这些定义的接口提供缺省的实现。
//        组合对象(Composite)角色：通常会存储子组件(组合对象、叶子对象)，定义包含子组件的那些组件的行为，并实现在抽象组件中定义的与子组件有关的操作，例如子组件的添加(addChild)和删除(removeChild)等。
//        叶子对象(Leaf)角色：定义和实现叶子对象的行为，并且它不再包含其他的子节点对象。
//        客户端(Client)角色：通过Component接口来统一操作组合对象和叶子对象，以创建出整个对象树结构。
//
//        组合模式结构示意源代码如下：
//        先看看抽象组件类的定义，示例代码如下。

/**
 * 抽象的组件对象，为组合中的对象声明接口，实现接口的缺省行为
 */
public abstract class Component {

    // 示意方法，子组件对象可能有的功能方法
    public abstract void someOperation(String preStr);

    public void addChild(Component child) {
        // 缺省的实现，抛出异常，因为叶子对象没有这个功能，或子类未实现这个功能
        throw new UnsupportedOperationException("对象不支持此功能");
    }

    public void removeChild(Component child) {
        // 缺省的实现，抛出异常，因为叶子对象没有这个功能，或子类未实现这个功能
        throw new UnsupportedOperationException("对象不支持此功能");
    }

    public Component getChildren(int index) {
        // 缺省的实现，抛出异常，因为叶子对象没有这个功能，或子类未实现这个功能
        throw new UnsupportedOperationException("对象不支持此功能");
    }
}

