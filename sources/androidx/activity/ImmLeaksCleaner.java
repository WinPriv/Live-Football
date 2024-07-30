package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.i;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements androidx.lifecycle.k {

    /* renamed from: s, reason: collision with root package name */
    public static int f458s;

    public ImmLeaksCleaner() {
        throw null;
    }

    @Override // androidx.lifecycle.k
    public final void c(androidx.lifecycle.m mVar, i.b bVar) {
        if (bVar != i.b.ON_DESTROY) {
            return;
        }
        if (f458s == 0) {
            try {
                f458s = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                f458s = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f458s != 1) {
        } else {
            throw null;
        }
    }
}
