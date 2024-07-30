package com.google.android.gms.common.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import e0.i;
import javax.annotation.Nullable;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class Asserts {
    private Asserts() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkMainThread(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        Log.e("Asserts", i.g("checkMainThread: current thread ", String.valueOf(Thread.currentThread()), " IS NOT the main thread ", String.valueOf(Looper.getMainLooper().getThread()), "!"));
        throw new IllegalStateException(str);
    }

    @KeepForSdk
    public static void checkNotMainThread(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return;
        }
        Log.e("Asserts", i.g("checkNotMainThread: current thread ", String.valueOf(Thread.currentThread()), " IS the main thread ", String.valueOf(Looper.getMainLooper().getThread()), "!"));
        throw new IllegalStateException(str);
    }

    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static void checkNotNull(@Nullable Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("null reference");
        }
    }

    @KeepForSdk
    public static void checkNull(Object obj) {
        if (obj == null) {
        } else {
            throw new IllegalArgumentException("non-null reference");
        }
    }

    @KeepForSdk
    public static void checkState(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    @EnsuresNonNull({"#1"})
    @KeepForSdk
    public static void checkNotNull(@Nullable Object obj, Object obj2) {
        if (obj == null) {
            throw new IllegalArgumentException(String.valueOf(obj2));
        }
    }

    @KeepForSdk
    public static void checkState(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
