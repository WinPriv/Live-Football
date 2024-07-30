package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21.java */
/* loaded from: classes.dex */
public class w extends v {
    public static boolean J0 = true;
    public static boolean K0 = true;

    @SuppressLint({"NewApi"})
    public void b1(View view, Matrix matrix) {
        if (J0) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                J0 = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void c1(View view, Matrix matrix) {
        if (K0) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                K0 = false;
            }
        }
    }
}
