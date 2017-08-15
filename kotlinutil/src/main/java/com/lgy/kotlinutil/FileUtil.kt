package com.lgy.kotlinutil

import java.io.File

/**
 * Created by LGY on 2017/8/15.
 *
 */
//全是静态方法的类，可以直接在class改为object
class FileUtil {

    //静态方法用companion object｛｝包裹即可
    companion object {
        /**
         * 创建文件
         */
        fun createFile(path: String) {
            val file = File(path)
            if (!file.exists()) {
                file.mkdirs()
            }
        }

        /**
         * 判断文件是否存在
         */
        fun fileIsExist(path: String): Boolean {
            val file = File(path)
            return file.exists()
        }

        /**
         * 获取文件名
         */
        fun fileName(nameEnd:String):String?{
            return System.currentTimeMillis() as String + nameEnd
        }
    }

}