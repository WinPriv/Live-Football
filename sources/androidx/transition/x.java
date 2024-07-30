package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi22.java */
/* loaded from: classes.dex */
public class x extends w {
    public static boolean L0 = true;

    @SuppressLint({"NewApi"})
    public void d1(View view, int i10, int i11, int i12, int i13) {
        if (L0) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                L0 = false;
            }
        }
    }
}
