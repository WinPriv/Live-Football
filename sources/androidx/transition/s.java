package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;

/* compiled from: ViewGroupUtils.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f2494a = true;

    public static void a(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
        } else if (f2494a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f2494a = false;
            }
        }
    }
}
