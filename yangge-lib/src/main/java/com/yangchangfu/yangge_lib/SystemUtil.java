package com.yangchangfu.yangge_lib;

/**
 * Created by apple on 16/7/1.
 */
public class SystemUtil {

    /**
     * @param msg string - you need display log info
     */
    public static void show(String msg){
        System.out.println(msg);
    }

    /**
     * @param TAG Sting - your tag, for search more fast
     * @param msg string - you need display log info
     */
    public static void show(String TAG, String msg){
        System.out.println(TAG + ":" + msg);
    }
}
