package jiegou.proxy.staticProxy2;


public class UITableView {

    private UITableViewDelegate delegate;

    public UITableViewDelegate getDelegate() {
        return delegate;
    }

    public void setDelegate(UITableViewDelegate delegate) {
        this.delegate = delegate;
    }

    public void reloadData() {
        int sections = delegate.numberOfSectionsInTableView(this);
        System.out.println("---sections = " + sections);
    }


}
