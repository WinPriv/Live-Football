package androidx.fragment.app;

import androidx.fragment.app.j0;

/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j0.b f1814s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0.b f1815t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f1816u;

    public g(j0.b bVar, j0.b bVar2, boolean z10, q.b bVar3) {
        this.f1814s = bVar;
        this.f1815t = bVar2;
        this.f1816u = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z.a(this.f1814s.f1836c, this.f1815t.f1836c, this.f1816u);
    }
}
