package n0;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuHostHelper.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f33084a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<m> f33085b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f33086c = new HashMap();

    /* compiled from: MenuHostHelper.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.lifecycle.i f33087a;

        /* renamed from: b, reason: collision with root package name */
        public androidx.lifecycle.k f33088b;

        public a(androidx.lifecycle.i iVar, androidx.lifecycle.k kVar) {
            this.f33087a = iVar;
            this.f33088b = kVar;
            iVar.a(kVar);
        }
    }

    public j(androidx.activity.b bVar) {
        this.f33084a = bVar;
    }

    public final void a(m mVar) {
        this.f33085b.remove(mVar);
        a aVar = (a) this.f33086c.remove(mVar);
        if (aVar != null) {
            aVar.f33087a.c(aVar.f33088b);
            aVar.f33088b = null;
        }
        this.f33084a.run();
    }
}
