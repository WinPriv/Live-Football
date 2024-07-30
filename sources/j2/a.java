package j2;

import android.view.animation.Interpolator;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseKeyframeAnimation.java */
/* loaded from: classes.dex */
public abstract class a<K, A> {

    /* renamed from: c, reason: collision with root package name */
    public final c<K> f29577c;

    /* renamed from: e, reason: collision with root package name */
    public t2.c f29579e;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f29575a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public boolean f29576b = false;

    /* renamed from: d, reason: collision with root package name */
    public float f29578d = gl.Code;
    public A f = null;

    /* renamed from: g, reason: collision with root package name */
    public float f29580g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f29581h = -1.0f;

    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: j2.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0404a {
        void a();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public static final class b<T> implements c<T> {
        @Override // j2.a.c
        public final boolean a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // j2.a.c
        public final t2.a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // j2.a.c
        public final boolean c(float f) {
            return false;
        }

        @Override // j2.a.c
        public final float d() {
            return 1.0f;
        }

        @Override // j2.a.c
        public final float e() {
            return gl.Code;
        }

        @Override // j2.a.c
        public final boolean isEmpty() {
            return true;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public interface c<T> {
        boolean a(float f);

        t2.a<T> b();

        boolean c(float f);

        float d();

        float e();

        boolean isEmpty();
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public static final class d<T> implements c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final List<? extends t2.a<T>> f29582a;

        /* renamed from: c, reason: collision with root package name */
        public t2.a<T> f29584c = null;

        /* renamed from: d, reason: collision with root package name */
        public float f29585d = -1.0f;

        /* renamed from: b, reason: collision with root package name */
        public t2.a<T> f29583b = f(gl.Code);

        public d(List<? extends t2.a<T>> list) {
            this.f29582a = list;
        }

        @Override // j2.a.c
        public final boolean a(float f) {
            t2.a<T> aVar = this.f29584c;
            t2.a<T> aVar2 = this.f29583b;
            if (aVar == aVar2 && this.f29585d == f) {
                return true;
            }
            this.f29584c = aVar2;
            this.f29585d = f;
            return false;
        }

        @Override // j2.a.c
        public final t2.a<T> b() {
            return this.f29583b;
        }

        @Override // j2.a.c
        public final boolean c(float f) {
            boolean z10;
            t2.a<T> aVar = this.f29583b;
            if (f >= aVar.b() && f < aVar.a()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return !this.f29583b.c();
            }
            this.f29583b = f(f);
            return true;
        }

        @Override // j2.a.c
        public final float d() {
            return this.f29582a.get(r0.size() - 1).a();
        }

        @Override // j2.a.c
        public final float e() {
            return this.f29582a.get(0).b();
        }

        public final t2.a<T> f(float f) {
            List<? extends t2.a<T>> list = this.f29582a;
            t2.a<T> aVar = list.get(list.size() - 1);
            if (f >= aVar.b()) {
                return aVar;
            }
            int size = list.size() - 2;
            while (true) {
                boolean z10 = false;
                if (size >= 1) {
                    t2.a<T> aVar2 = list.get(size);
                    if (this.f29583b != aVar2) {
                        if (f >= aVar2.b() && f < aVar2.a()) {
                            z10 = true;
                        }
                        if (z10) {
                            return aVar2;
                        }
                    }
                    size--;
                } else {
                    return list.get(0);
                }
            }
        }

        @Override // j2.a.c
        public final boolean isEmpty() {
            return false;
        }
    }

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public static final class e<T> implements c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final t2.a<T> f29586a;

        /* renamed from: b, reason: collision with root package name */
        public float f29587b = -1.0f;

        public e(List<? extends t2.a<T>> list) {
            this.f29586a = list.get(0);
        }

        @Override // j2.a.c
        public final boolean a(float f) {
            if (this.f29587b == f) {
                return true;
            }
            this.f29587b = f;
            return false;
        }

        @Override // j2.a.c
        public final t2.a<T> b() {
            return this.f29586a;
        }

        @Override // j2.a.c
        public final boolean c(float f) {
            return !this.f29586a.c();
        }

        @Override // j2.a.c
        public final float d() {
            return this.f29586a.a();
        }

        @Override // j2.a.c
        public final float e() {
            return this.f29586a.b();
        }

        @Override // j2.a.c
        public final boolean isEmpty() {
            return false;
        }
    }

    public a(List<? extends t2.a<K>> list) {
        c dVar;
        c cVar;
        if (list.isEmpty()) {
            cVar = new b();
        } else {
            if (list.size() == 1) {
                dVar = new e(list);
            } else {
                dVar = new d(list);
            }
            cVar = dVar;
        }
        this.f29577c = cVar;
    }

    public final void a(InterfaceC0404a interfaceC0404a) {
        this.f29575a.add(interfaceC0404a);
    }

    public final t2.a<K> b() {
        t2.a<K> b10 = this.f29577c.b();
        androidx.activity.n.s0();
        return b10;
    }

    public float c() {
        if (this.f29581h == -1.0f) {
            this.f29581h = this.f29577c.d();
        }
        return this.f29581h;
    }

    public final float d() {
        t2.a<K> b10 = b();
        if (b10 != null && !b10.c()) {
            return b10.f35381d.getInterpolation(e());
        }
        return gl.Code;
    }

    public final float e() {
        if (this.f29576b) {
            return gl.Code;
        }
        t2.a<K> b10 = b();
        if (b10.c()) {
            return gl.Code;
        }
        return (this.f29578d - b10.b()) / (b10.a() - b10.b());
    }

    public A f() {
        A g6;
        Interpolator interpolator;
        float e10 = e();
        if (this.f29579e == null && this.f29577c.a(e10)) {
            return this.f;
        }
        t2.a<K> b10 = b();
        Interpolator interpolator2 = b10.f35382e;
        if (interpolator2 != null && (interpolator = b10.f) != null) {
            g6 = h(b10, e10, interpolator2.getInterpolation(e10), interpolator.getInterpolation(e10));
        } else {
            g6 = g(b10, d());
        }
        this.f = g6;
        return g6;
    }

    public abstract A g(t2.a<K> aVar, float f);

    public A h(t2.a<K> aVar, float f, float f10, float f11) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void i() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f29575a;
            if (i10 < arrayList.size()) {
                ((InterfaceC0404a) arrayList.get(i10)).a();
                i10++;
            } else {
                return;
            }
        }
    }

    public void j(float f) {
        c<K> cVar = this.f29577c;
        if (cVar.isEmpty()) {
            return;
        }
        if (this.f29580g == -1.0f) {
            this.f29580g = cVar.e();
        }
        float f10 = this.f29580g;
        if (f < f10) {
            if (f10 == -1.0f) {
                this.f29580g = cVar.e();
            }
            f = this.f29580g;
        } else if (f > c()) {
            f = c();
        }
        if (f == this.f29578d) {
            return;
        }
        this.f29578d = f;
        if (cVar.c(f)) {
            i();
        }
    }

    public final void k(t2.c cVar) {
        t2.c cVar2 = this.f29579e;
        if (cVar2 != null) {
            cVar2.f35399t = null;
        }
        this.f29579e = cVar;
        if (cVar != null) {
            cVar.f35399t = this;
        }
    }
}
