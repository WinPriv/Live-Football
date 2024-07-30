package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.c0;

/* compiled from: FragmentTransitionImpl.java */
/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1799s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1800t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1801u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1802v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1803w;

    public d0(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f1799s = i10;
        this.f1800t = arrayList;
        this.f1801u = arrayList2;
        this.f1802v = arrayList3;
        this.f1803w = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i10 = 0; i10 < this.f1799s; i10++) {
            View view = (View) this.f1800t.get(i10);
            String str = (String) this.f1801u.get(i10);
            WeakHashMap<View, n0.l0> weakHashMap = n0.c0.f33054a;
            c0.i.v(view, str);
            c0.i.v((View) this.f1802v.get(i10), (String) this.f1803w.get(i10));
        }
    }
}
