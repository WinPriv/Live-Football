package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi19.java */
/* loaded from: classes.dex */
public class v extends a0.a {
    public static boolean I0 = true;

    @SuppressLint({"NewApi"})
    public float Z0(View view) {
        float transitionAlpha;
        if (I0) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                I0 = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void a1(View view, float f) {
        if (I0) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                I0 = false;
            }
        }
        view.setAlpha(f);
    }
}
