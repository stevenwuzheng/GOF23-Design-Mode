package jiegou.composition;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.List;

public interface File {
    void showFormat();
}

class ImageFile implements File {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void showFormat() {
        System.out.println("这是个image文件: " + name);
    }
}

class VideoFile implements File {
    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void showFormat() {
        System.out.println("这是个video文件: " + name);
    }
}

class Folder implements File {
    private String name;
    private List<File> list = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }



    @Override
    public void showFormat() {

    }
}