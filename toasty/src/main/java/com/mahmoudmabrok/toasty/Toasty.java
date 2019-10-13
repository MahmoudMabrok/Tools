package com.mahmoudmabrok.toasty;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Toasty {

    private static Toast toast;

    public static void showMessage(Context context, String message) {
        if (toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.NO_GRAVITY, 0, 0);
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

    public static Toast success(Context context, String message) {
        return makeText(context, message, R.drawable.ic_ok);
    }

    public static Toast error(Context context, String message) {
        return makeText(context, message, R.drawable.ic_error);
    }

    public static Toast fullMessage(Context context, String message, int drawble) {
        return makeText(context, message, drawble);
    }


    private static Toast makeText(Context context, String message, int drawableId) {
        View view = LayoutInflater.from(context).inflate(R.layout.toast_layout, null);

        Toast toast = new Toast(context);
        toast.setView(view);

        TextView textView = view.findViewById(R.id.toastMessage);
        textView.setText(message);

        textView.setCompoundDrawables(context.
                getResources().
                getDrawable(drawableId), null, null, null);
        ImageView imageView = view.findViewById(R.id.imicon);
        imageView.setImageResource(drawableId);
        return toast;


    }


}

class ToastBuilder {

}
