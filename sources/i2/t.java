package i2;

import j2.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TrimPathContent.java */
/* loaded from: classes.dex */
public final class t implements b, a.InterfaceC0404a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29159a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f29160b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final int f29161c;

    /* renamed from: d, reason: collision with root package name */
    public final j2.d f29162d;

    /* renamed from: e, reason: collision with root package name */
    public final j2.d f29163e;
    public final j2.d f;

    public t(o2.b bVar, n2.q qVar) {
        qVar.getClass();
        this.f29159a = qVar.f33297e;
        this.f29161c = qVar.f33293a;
        j2.a<Float, Float> a10 = qVar.f33294b.a();
        this.f29162d = (j2.d) a10;
        j2.a<Float, Float> a11 = qVar.f33295c.a();
        this.f29163e = (j2.d) a11;
        j2.a<Float, Float> a12 = qVar.f33296d.a();
        this.f = (j2.d) a12;
        bVar.f(a10);
        bVar.f(a11);
        bVar.f(a12);
        a10.a(this);
        a11.a(this);
        a12.a(this);
    }

    @Override // j2.a.InterfaceC0404a
    public final void a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f29160b;
            if (i10 < arrayList.size()) {
                ((a.InterfaceC0404a) arrayList.get(i10)).a();
                i10++;
            } else {
                return;
            }
        }
    }

    public final void e(a.InterfaceC0404a interfaceC0404a) {
        this.f29160b.add(interfaceC0404a);
    }

    @Override // i2.b
    public final void b(List<b> list, List<b> list2) {
    }
}
