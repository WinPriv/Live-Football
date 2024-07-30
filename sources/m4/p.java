package m4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import m4.f;

/* compiled from: BaseAudioProcessor.java */
/* loaded from: classes2.dex */
public abstract class p implements f {

    /* renamed from: b, reason: collision with root package name */
    public f.a f32791b;

    /* renamed from: c, reason: collision with root package name */
    public f.a f32792c;

    /* renamed from: d, reason: collision with root package name */
    public f.a f32793d;

    /* renamed from: e, reason: collision with root package name */
    public f.a f32794e;
    public ByteBuffer f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f32795g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f32796h;

    public p() {
        ByteBuffer byteBuffer = f.f32732a;
        this.f = byteBuffer;
        this.f32795g = byteBuffer;
        f.a aVar = f.a.f32733e;
        this.f32793d = aVar;
        this.f32794e = aVar;
        this.f32791b = aVar;
        this.f32792c = aVar;
    }

    @Override // m4.f
    public boolean b() {
        if (this.f32796h && this.f32795g == f.f32732a) {
            return true;
        }
        return false;
    }

    @Override // m4.f
    public final void c() {
        this.f32796h = true;
        h();
    }

    @Override // m4.f
    public final f.a d(f.a aVar) throws f.b {
        this.f32793d = aVar;
        this.f32794e = f(aVar);
        if (e()) {
            return this.f32794e;
        }
        return f.a.f32733e;
    }

    @Override // m4.f
    public boolean e() {
        if (this.f32794e != f.a.f32733e) {
            return true;
        }
        return false;
    }

    public abstract f.a f(f.a aVar) throws f.b;

    @Override // m4.f
    public final void flush() {
        this.f32795g = f.f32732a;
        this.f32796h = false;
        this.f32791b = this.f32793d;
        this.f32792c = this.f32794e;
        g();
    }

    @Override // m4.f
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f32795g;
        this.f32795g = f.f32732a;
        return byteBuffer;
    }

    public final ByteBuffer j(int i10) {
        if (this.f.capacity() < i10) {
            this.f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.f32795g = byteBuffer;
        return byteBuffer;
    }

    @Override // m4.f
    public final void reset() {
        flush();
        this.f = f.f32732a;
        f.a aVar = f.a.f32733e;
        this.f32793d = aVar;
        this.f32794e = aVar;
        this.f32791b = aVar;
        this.f32792c = aVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
