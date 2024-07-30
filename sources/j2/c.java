package j2;

import android.graphics.Color;
import j2.a;

/* compiled from: DropShadowKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class c implements a.InterfaceC0404a {

    /* renamed from: a, reason: collision with root package name */
    public final a.InterfaceC0404a f29588a;

    /* renamed from: b, reason: collision with root package name */
    public final g f29589b;

    /* renamed from: c, reason: collision with root package name */
    public final d f29590c;

    /* renamed from: d, reason: collision with root package name */
    public final d f29591d;

    /* renamed from: e, reason: collision with root package name */
    public final d f29592e;
    public final d f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29593g = true;

    /* compiled from: DropShadowKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public class a extends t2.c {

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ t2.c f29594v;

        public a(t2.c cVar) {
            this.f29594v = cVar;
        }

        @Override // t2.c
        public final Object a(t2.b bVar) {
            Float f = (Float) this.f29594v.a(bVar);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public c(a.InterfaceC0404a interfaceC0404a, o2.b bVar, q2.j jVar) {
        this.f29588a = interfaceC0404a;
        j2.a a10 = ((m2.a) jVar.f34586s).a();
        this.f29589b = (g) a10;
        a10.a(this);
        bVar.f(a10);
        j2.a<Float, Float> a11 = ((m2.b) jVar.f34587t).a();
        this.f29590c = (d) a11;
        a11.a(this);
        bVar.f(a11);
        j2.a<Float, Float> a12 = ((m2.b) jVar.f34588u).a();
        this.f29591d = (d) a12;
        a12.a(this);
        bVar.f(a12);
        j2.a<Float, Float> a13 = ((m2.b) jVar.f34589v).a();
        this.f29592e = (d) a13;
        a13.a(this);
        bVar.f(a13);
        j2.a<Float, Float> a14 = ((m2.b) jVar.f34590w).a();
        this.f = (d) a14;
        a14.a(this);
        bVar.f(a14);
    }

    @Override // j2.a.InterfaceC0404a
    public final void a() {
        this.f29593g = true;
        this.f29588a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(h2.a aVar) {
        if (!this.f29593g) {
            return;
        }
        this.f29593g = false;
        double floatValue = this.f29591d.f().floatValue() * 0.017453292519943295d;
        float floatValue2 = this.f29592e.f().floatValue();
        float sin = ((float) Math.sin(floatValue)) * floatValue2;
        float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
        int intValue = ((Integer) this.f29589b.f()).intValue();
        aVar.setShadowLayer(this.f.f().floatValue(), sin, cos, Color.argb(Math.round(this.f29590c.f().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
    }

    public final void c(t2.c cVar) {
        d dVar = this.f29590c;
        if (cVar == null) {
            dVar.k(null);
        } else {
            dVar.k(new a(cVar));
        }
    }
}
