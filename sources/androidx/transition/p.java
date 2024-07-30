package androidx.transition;

import android.os.Build;

/* compiled from: TransitionUtils.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f2487a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f2488b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f2489c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        f2487a = true;
        f2488b = true;
        if (i10 < 28) {
            z10 = false;
        }
        f2489c = z10;
    }
}
