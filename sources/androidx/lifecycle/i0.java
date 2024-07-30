package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: ViewModelStore.java */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, e0> f1981a = new HashMap<>();

    public final void a() {
        for (e0 e0Var : this.f1981a.values()) {
            e0Var.f1964c = true;
            HashMap hashMap = e0Var.f1962a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    Iterator it = e0Var.f1962a.values().iterator();
                    while (it.hasNext()) {
                        e0.a(it.next());
                    }
                }
            }
            LinkedHashSet linkedHashSet = e0Var.f1963b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    Iterator it2 = e0Var.f1963b.iterator();
                    while (it2.hasNext()) {
                        e0.a((Closeable) it2.next());
                    }
                }
            }
            e0Var.b();
        }
        this.f1981a.clear();
    }
}
