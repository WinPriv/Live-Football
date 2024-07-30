package a3;

import a3.h;
import a3.o;
import com.bumptech.glide.load.data.d;
import e3.n;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ResourceCacheGenerator.java */
/* loaded from: classes.dex */
public final class y implements h, d.a<Object> {
    public File A;
    public z B;

    /* renamed from: s, reason: collision with root package name */
    public final h.a f224s;

    /* renamed from: t, reason: collision with root package name */
    public final i<?> f225t;

    /* renamed from: u, reason: collision with root package name */
    public int f226u;

    /* renamed from: v, reason: collision with root package name */
    public int f227v = -1;

    /* renamed from: w, reason: collision with root package name */
    public y2.e f228w;

    /* renamed from: x, reason: collision with root package name */
    public List<e3.n<File, ?>> f229x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public volatile n.a<?> f230z;

    public y(i<?> iVar, h.a aVar) {
        this.f225t = iVar;
        this.f224s = aVar;
    }

    @Override // a3.h
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList a10 = this.f225t.a();
        if (a10.isEmpty()) {
            return false;
        }
        List<Class<?>> d10 = this.f225t.d();
        if (d10.isEmpty()) {
            if (File.class.equals(this.f225t.f127k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f225t.f121d.getClass() + " to " + this.f225t.f127k);
        }
        while (true) {
            List<e3.n<File, ?>> list = this.f229x;
            if (list != null) {
                if (this.y < list.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.f230z = null;
                    boolean z13 = false;
                    while (!z13) {
                        if (this.y < this.f229x.size()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            break;
                        }
                        List<e3.n<File, ?>> list2 = this.f229x;
                        int i10 = this.y;
                        this.y = i10 + 1;
                        e3.n<File, ?> nVar = list2.get(i10);
                        File file = this.A;
                        i<?> iVar = this.f225t;
                        this.f230z = nVar.b(file, iVar.f122e, iVar.f, iVar.f125i);
                        if (this.f230z != null) {
                            if (this.f225t.c(this.f230z.f27705c.a()) != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                this.f230z.f27705c.e(this.f225t.o, this);
                                z13 = true;
                            }
                        }
                    }
                    return z13;
                }
            }
            int i11 = this.f227v + 1;
            this.f227v = i11;
            if (i11 >= d10.size()) {
                int i12 = this.f226u + 1;
                this.f226u = i12;
                if (i12 >= a10.size()) {
                    return false;
                }
                this.f227v = 0;
            }
            y2.e eVar = (y2.e) a10.get(this.f226u);
            Class<?> cls = d10.get(this.f227v);
            y2.k<Z> f = this.f225t.f(cls);
            i<?> iVar2 = this.f225t;
            this.B = new z(iVar2.f120c.f19724a, eVar, iVar2.f130n, iVar2.f122e, iVar2.f, f, cls, iVar2.f125i);
            File j10 = ((o.c) iVar2.f124h).a().j(this.B);
            this.A = j10;
            if (j10 != null) {
                this.f228w = eVar;
                this.f229x = this.f225t.f120c.a().e(j10);
                this.y = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(Exception exc) {
        this.f224s.a(this.B, exc, this.f230z.f27705c, y2.a.RESOURCE_DISK_CACHE);
    }

    @Override // a3.h
    public final void cancel() {
        n.a<?> aVar = this.f230z;
        if (aVar != null) {
            aVar.f27705c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void f(Object obj) {
        this.f224s.c(this.f228w, obj, this.f230z.f27705c, y2.a.RESOURCE_DISK_CACHE, this.B);
    }
}
