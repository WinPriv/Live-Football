package a3;

import a3.j;
import android.util.Log;
import com.bumptech.glide.k;
import e3.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import u3.a;

/* compiled from: DecodePath.java */
/* loaded from: classes.dex */
public final class m<DataType, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<DataType> f149a;

    /* renamed from: b, reason: collision with root package name */
    public final List<? extends y2.i<DataType, ResourceType>> f150b;

    /* renamed from: c, reason: collision with root package name */
    public final m3.c<ResourceType, Transcode> f151c;

    /* renamed from: d, reason: collision with root package name */
    public final m0.d<List<Throwable>> f152d;

    /* renamed from: e, reason: collision with root package name */
    public final String f153e;

    public m(Class cls, Class cls2, Class cls3, List list, m3.c cVar, a.c cVar2) {
        this.f149a = cls;
        this.f150b = list;
        this.f151c = cVar;
        this.f152d = cVar2;
        this.f153e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final x a(int i10, int i11, y2.g gVar, com.bumptech.glide.load.data.e eVar, j.b bVar) throws t {
        x xVar;
        y2.k kVar;
        boolean z10;
        y2.c cVar;
        boolean z11;
        y2.e fVar;
        m0.d<List<Throwable>> dVar = this.f152d;
        List<Throwable> b10 = dVar.b();
        androidx.activity.n.n0(b10);
        List<Throwable> list = b10;
        try {
            x<ResourceType> b11 = b(eVar, i10, i11, gVar, list);
            dVar.a(list);
            j jVar = j.this;
            jVar.getClass();
            Class<?> cls = b11.get().getClass();
            y2.a aVar = y2.a.RESOURCE_DISK_CACHE;
            y2.a aVar2 = bVar.f141a;
            i<R> iVar = jVar.f134s;
            y2.j jVar2 = null;
            if (aVar2 != aVar) {
                y2.k f = iVar.f(cls);
                xVar = f.b(jVar.f140z, b11, jVar.D, jVar.E);
                kVar = f;
            } else {
                xVar = b11;
                kVar = null;
            }
            if (!b11.equals(xVar)) {
                b11.a();
            }
            if (iVar.f120c.a().f19743d.a(xVar.c()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                com.bumptech.glide.k a10 = iVar.f120c.a();
                a10.getClass();
                y2.j a11 = a10.f19743d.a(xVar.c());
                if (a11 != null) {
                    cVar = a11.h(jVar.G);
                    jVar2 = a11;
                } else {
                    throw new k.d(xVar.c());
                }
            } else {
                cVar = y2.c.NONE;
            }
            y2.e eVar2 = jVar.P;
            ArrayList b12 = iVar.b();
            int size = b12.size();
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    if (((n.a) b12.get(i12)).f27703a.equals(eVar2)) {
                        z11 = true;
                        break;
                    }
                    i12++;
                } else {
                    z11 = false;
                    break;
                }
            }
            if (jVar.F.d(!z11, aVar2, cVar)) {
                if (jVar2 != null) {
                    int ordinal = cVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            fVar = new z(iVar.f120c.f19724a, jVar.P, jVar.A, jVar.D, jVar.E, kVar, cls, jVar.G);
                        } else {
                            throw new IllegalArgumentException("Unknown strategy: " + cVar);
                        }
                    } else {
                        fVar = new f(jVar.P, jVar.A);
                    }
                    w<Z> wVar = (w) w.f219w.b();
                    androidx.activity.n.n0(wVar);
                    wVar.f223v = false;
                    wVar.f222u = true;
                    wVar.f221t = xVar;
                    j.c<?> cVar2 = jVar.f139x;
                    cVar2.f143a = fVar;
                    cVar2.f144b = jVar2;
                    cVar2.f145c = wVar;
                    xVar = wVar;
                } else {
                    throw new k.d(xVar.get().getClass());
                }
            }
            return this.f151c.f(xVar, gVar);
        } catch (Throwable th) {
            dVar.a(list);
            throw th;
        }
    }

    public final x<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, y2.g gVar, List<Throwable> list) throws t {
        List<? extends y2.i<DataType, ResourceType>> list2 = this.f150b;
        int size = list2.size();
        x<ResourceType> xVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            y2.i<DataType, ResourceType> iVar = list2.get(i12);
            try {
                if (iVar.a(eVar.a(), gVar)) {
                    xVar = iVar.b(eVar.a(), i10, i11, gVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + iVar, e10);
                }
                list.add(e10);
            }
            if (xVar != null) {
                break;
            }
        }
        if (xVar != null) {
            return xVar;
        }
        throw new t(this.f153e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f149a + ", decoders=" + this.f150b + ", transcoder=" + this.f151c + '}';
    }
}
