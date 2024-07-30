package v;

import com.huawei.openalliance.ad.constant.w;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DependencyNode.java */
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    public final p f35875d;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f35877g;

    /* renamed from: a, reason: collision with root package name */
    public p f35872a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f35873b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f35874c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f35876e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f35878h = 1;

    /* renamed from: i, reason: collision with root package name */
    public g f35879i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f35880j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f35881k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f35882l = new ArrayList();

    public f(p pVar) {
        this.f35875d = pVar;
    }

    @Override // v.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f35882l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f35880j) {
                return;
            }
        }
        this.f35874c = true;
        p pVar = this.f35872a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f35873b) {
            this.f35875d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i10 = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f35880j) {
            g gVar = this.f35879i;
            if (gVar != null) {
                if (gVar.f35880j) {
                    this.f = this.f35878h * gVar.f35877g;
                } else {
                    return;
                }
            }
            d(fVar.f35877g + this.f);
        }
        p pVar2 = this.f35872a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    public final void b(d dVar) {
        this.f35881k.add(dVar);
        if (this.f35880j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f35882l.clear();
        this.f35881k.clear();
        this.f35880j = false;
        this.f35877g = 0;
        this.f35874c = false;
        this.f35873b = false;
    }

    public void d(int i10) {
        if (this.f35880j) {
            return;
        }
        this.f35880j = true;
        this.f35877g = i10;
        Iterator it = this.f35881k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f35875d.f35896b.f35649k0);
        sb2.append(w.bE);
        sb2.append(e0.i.u(this.f35876e));
        sb2.append("(");
        if (this.f35880j) {
            obj = Integer.valueOf(this.f35877g);
        } else {
            obj = "unresolved";
        }
        sb2.append(obj);
        sb2.append(") <t=");
        sb2.append(this.f35882l.size());
        sb2.append(":d=");
        sb2.append(this.f35881k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
