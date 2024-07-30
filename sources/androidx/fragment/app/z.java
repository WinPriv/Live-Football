package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* compiled from: FragmentTransition.java */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f1910a = new b0();

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f1911b;

    static {
        e0 e0Var;
        try {
            e0Var = (e0) androidx.transition.g.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            e0Var = null;
        }
        f1911b = e0Var;
    }

    public static void a(Fragment fragment, Fragment fragment2, boolean z10) {
        if (z10) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    public static void b(int i10, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i10);
        }
    }
}
