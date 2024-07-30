package i2;

import android.graphics.Path;
import g2.a0;
import j2.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeContent.java */
/* loaded from: classes.dex */
public final class q implements l, a.InterfaceC0404a {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29150b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f29151c;

    /* renamed from: d, reason: collision with root package name */
    public final j2.k f29152d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f29153e;

    /* renamed from: a, reason: collision with root package name */
    public final Path f29149a = new Path();
    public final b1.c f = new b1.c();

    public q(a0 a0Var, o2.b bVar, n2.o oVar) {
        oVar.getClass();
        this.f29150b = oVar.f33283d;
        this.f29151c = a0Var;
        j2.k kVar = new j2.k((List) oVar.f33282c.f35738t);
        this.f29152d = kVar;
        bVar.f(kVar);
        kVar.a(this);
    }

    @Override // j2.a.InterfaceC0404a
    public final void a() {
        this.f29153e = false;
        this.f29151c.invalidateSelf();
    }

    @Override // i2.b
    public final void b(List<b> list, List<b> list2) {
        ArrayList arrayList = null;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i10 < arrayList2.size()) {
                b bVar = (b) arrayList2.get(i10);
                if (bVar instanceof t) {
                    t tVar = (t) bVar;
                    if (tVar.f29161c == 1) {
                        this.f.f2800a.add(tVar);
                        tVar.e(this);
                        i10++;
                    }
                }
                if (bVar instanceof r) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((r) bVar);
                }
                i10++;
            } else {
                this.f29152d.f29606k = arrayList;
                return;
            }
        }
    }

    @Override // i2.l
    public final Path i() {
        boolean z10 = this.f29153e;
        Path path = this.f29149a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f29150b) {
            this.f29153e = true;
            return path;
        }
        Path f = this.f29152d.f();
        if (f == null) {
            return path;
        }
        path.set(f);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f.a(path);
        this.f29153e = true;
        return path;
    }
}
