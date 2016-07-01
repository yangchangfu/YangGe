package com.yangchangfu.yangge_lib;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by apple on 16/6/20.
 */
public class ToastUtil {

    /**
     * display short or long time
     */
    public enum Style {
        SHORT, LONG
    }

    /**
     * @param context
     * @param msg string - you need display alert info
     */
    public static void show(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    /**
     * @param context
     * @param msg string - you need display alert info
     * @param style Style - display short or long time
     *
     */
    public static void show(Context context, String msg, Style style){

        if (style == Style.SHORT) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        }
        else if (style == Style.LONG) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        }
        else {
            throw new IllegalArgumentException("style is not macth.");
        }
    }
}
