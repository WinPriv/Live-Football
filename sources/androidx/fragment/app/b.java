package androidx.fragment.app;

import androidx.fragment.app.j0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f1780s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0.b f1781t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f1782u;

    public b(k kVar, ArrayList arrayList, j0.b bVar) {
        this.f1782u = kVar;
        this.f1780s = arrayList;
        this.f1781t = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.f1780s;
        j0.b bVar = this.f1781t;
        if (list.contains(bVar)) {
            list.remove(bVar);
            this.f1782u.getClass();
            a3.l.a(bVar.f1834a, bVar.f1836c.mView);
        }
    }
}
