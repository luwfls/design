package com.luwfls.design.composite;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 杀毒软件
 */
public interface AbstractFile {
    void killVirus();
}

interface SampleFile extends AbstractFile {

}

interface FolderFile extends AbstractFile {
    void add(AbstractFile file);

    void remove(AbstractFile file);

    AbstractFile getChild(int index);
}

class ImageFile implements SampleFile {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("视频查杀 " + name);
    }
}

class TextFile implements SampleFile {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("文本查杀 " + name);
    }
}

class VideoFile implements SampleFile {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("图像查杀 " + name);
    }
}

class Folder implements FolderFile {

    //private final List<AbstractFile> files = Collections.synchronizedList(new ArrayList<>());
    private final List<AbstractFile> files = new CopyOnWriteArrayList<>();

    public List<AbstractFile> getFiles() {
        return files;
    }

    @Override
    public void killVirus() {
        if (!CollectionUtils.isEmpty(files)) {
            files.forEach(AbstractFile::killVirus);
        }
    }

    @Override
    public void add(AbstractFile file) {
        files.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        files.remove(file);
    }

    @Override
    public AbstractFile getChild(int index) {
        return files.get(index);
    }
}
