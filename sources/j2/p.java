package j2;

import com.huawei.hms.ads.gl;
import java.util.Collections;

/* compiled from: ValueCallbackKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class p<K, A> extends a<K, A> {

    /* renamed from: i, reason: collision with root package name */
    public final A f29629i;

    public p(t2.c cVar, A a10) {
        super(Collections.emptyList());
        k(cVar);
        this.f29629i = a10;
    }

    @Override // j2.a
    public final float c() {
        return 1.0f;
    }

    @Override // j2.a
    public final A f() {
        t2.c cVar = this.f29579e;
        A a10 = this.f29629i;
        float f = this.f29578d;
        return (A) cVar.b(gl.Code, gl.Code, a10, a10, f, f, f);
    }

    @Override // j2.a
    public final A g(t2.a<K> aVar, float f) {
        return f();
    }

    @Override // j2.a
    public final void i() {
        if (this.f29579e != null) {
            super.i();
        }
    }

    @Override // j2.a
    public final void j(float f) {
        this.f29578d = f;
    }
}
