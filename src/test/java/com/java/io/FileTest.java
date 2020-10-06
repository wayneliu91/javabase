package com.java.io;

import org.junit.Test;

import java.io.File;

public class FileTest {

    @Test
    public void reName() {
        String path = "/Volumes/Extreme SSD/video/大数据/1-采集&传输/Flume/4.视频";
        File file = new File(path);
        if (file.exists()) {
            rename(file);
        }
    }

    private void rename(File directory) {
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    rename(file);
                } else {
                    String oldPath = file.getAbsolutePath();
                    String newPath = oldPath.replace("尚硅谷_","");
                    file.renameTo(new File(newPath));
                }
            }
        }
    }

}
