package com.mahmoudmabrok.toasty;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

public class Toasty {

    private static Toast toast;

    public static void showMessage(Context context, String message) {
        if (toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public static void showMessageAtXY(Context context, String message, int x, int y) {
        if (toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.LEFT | Gravity.TOP, x, y);
        toast.show();
    }

    public static void showMessageAtCenter(Context context, String message) {
        if (toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }


}
