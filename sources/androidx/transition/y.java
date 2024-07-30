package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* compiled from: ViewUtilsApi23.java */
/* loaded from: classes.dex */
public class y extends x {
    public static boolean M0 = true;

    @Override // a0.a
    @SuppressLint({"NewApi"})
    public void W0(int i10, View view) {
        if (Build.VERSION.SDK_INT == 28) {
            super.W0(i10, view);
        } else if (M0) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                M0 = false;
            }
        }
    }
}
