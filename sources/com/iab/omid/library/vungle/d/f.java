package com.iab.omid.library.vungle.d;

import android.view.View;
import com.huawei.hms.ads.gl;

/* loaded from: classes2.dex */
public final class f {
    public static float a(View view) {
        return view.getZ();
    }

    public static View b(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    public static boolean c(View view) {
        if (!view.isAttachedToWindow() || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == gl.Code) {
                return false;
            }
            view = b(view);
        }
        return true;
    }

    public static boolean d(View view) {
        if (e(view) == null) {
            return true;
        }
        return false;
    }

    public static String e(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility != 0) {
            if (visibility != 4) {
                if (visibility != 8) {
                    return "viewNotVisible";
                }
                return "viewGone";
            }
            return "viewInvisible";
        }
        if (view.getAlpha() == gl.Code) {
            return "viewAlphaZero";
        }
        return null;
    }
}
