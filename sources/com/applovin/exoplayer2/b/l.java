package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.b.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class l implements f {

    /* renamed from: b, reason: collision with root package name */
    protected f.a f13434b;

    /* renamed from: c, reason: collision with root package name */
    protected f.a f13435c;

    /* renamed from: d, reason: collision with root package name */
    private f.a f13436d;

    /* renamed from: e, reason: collision with root package name */
    private f.a f13437e;
    private ByteBuffer f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f13438g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13439h;

    public l() {
        ByteBuffer byteBuffer = f.f13380a;
        this.f = byteBuffer;
        this.f13438g = byteBuffer;
        f.a aVar = f.a.f13381a;
        this.f13436d = aVar;
        this.f13437e = aVar;
        this.f13434b = aVar;
        this.f13435c = aVar;
    }

    @Override // com.applovin.exoplayer2.b.f
    public final f.a a(f.a aVar) throws f.b {
        this.f13436d = aVar;
        this.f13437e = b(aVar);
        return a() ? this.f13437e : f.a.f13381a;
    }

    @Override // com.applovin.exoplayer2.b.f
    public final void b() {
        this.f13439h = true;
        h();
    }

    @Override // com.applovin.exoplayer2.b.f
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f13438g;
        this.f13438g = f.f13380a;
        return byteBuffer;
    }

    @Override // com.applovin.exoplayer2.b.f
    public boolean d() {
        if (this.f13439h && this.f13438g == f.f13380a) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.b.f
    public final void e() {
        this.f13438g = f.f13380a;
        this.f13439h = false;
        this.f13434b = this.f13436d;
        this.f13435c = this.f13437e;
        i();
    }

    @Override // com.applovin.exoplayer2.b.f
    public final void f() {
        e();
        this.f = f.f13380a;
        f.a aVar = f.a.f13381a;
        this.f13436d = aVar;
        this.f13437e = aVar;
        this.f13434b = aVar;
        this.f13435c = aVar;
        j();
    }

    public final boolean g() {
        return this.f13438g.hasRemaining();
    }

    public f.a b(f.a aVar) throws f.b {
        return f.a.f13381a;
    }

    @Override // com.applovin.exoplayer2.b.f
    public boolean a() {
        return this.f13437e != f.a.f13381a;
    }

    public final ByteBuffer a(int i10) {
        if (this.f.capacity() < i10) {
            this.f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.f13438g = byteBuffer;
        return byteBuffer;
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }
}
