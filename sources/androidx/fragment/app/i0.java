package androidx.fragment.app;

import androidx.fragment.app.j0;
import java.util.ArrayList;

/* compiled from: SpecialEffectsController.java */
/* loaded from: classes.dex */
public final class i0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j0.a f1825s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0 f1826t;

    public i0(j0 j0Var, j0.a aVar) {
        this.f1826t = j0Var;
        this.f1825s = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j0 j0Var = this.f1826t;
        ArrayList<j0.b> arrayList = j0Var.f1829b;
        j0.a aVar = this.f1825s;
        arrayList.remove(aVar);
        j0Var.f1830c.remove(aVar);
    }
}
