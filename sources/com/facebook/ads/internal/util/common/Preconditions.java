package com.facebook.ads.internal.util.common;

import android.os.Looper;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public final class Preconditions {
    public static void checkIsOnMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
        } else {
            throw new RuntimeException("Must be called from the UiThread");
        }
    }

    public static void checkIsTrue(boolean z10, String str) {
        if (z10) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T checkNotNull(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalArgumentException(str);
    }
}
