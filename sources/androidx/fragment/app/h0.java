package androidx.fragment.app;

import androidx.fragment.app.j0;
import java.util.ArrayList;

/* compiled from: SpecialEffectsController.java */
/* loaded from: classes.dex */
public final class h0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j0.a f1822s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0 f1823t;

    public h0(j0 j0Var, j0.a aVar) {
        this.f1823t = j0Var;
        this.f1822s = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<j0.b> arrayList = this.f1823t.f1829b;
        j0.a aVar = this.f1822s;
        if (arrayList.contains(aVar)) {
            a3.l.a(aVar.f1834a, aVar.f1836c.mView);
        }
    }
}
