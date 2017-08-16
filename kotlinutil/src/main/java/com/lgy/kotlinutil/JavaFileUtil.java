package com.lgy.kotlinutil;

import java.io.File;

/**
 * Created by LGY on 2017/8/16.
 */

public class JavaFileUtil {
    public static void createFile(String path){
        File file = new File(path);
        if (!file.exists()){
            file.mkdirs();
        }
    }
}
