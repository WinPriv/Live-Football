package m4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import m4.f;

/* compiled from: SonicAudioProcessor.java */
/* loaded from: classes2.dex */
public final class b0 implements f {

    /* renamed from: b, reason: collision with root package name */
    public int f32696b;

    /* renamed from: c, reason: collision with root package name */
    public float f32697c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f32698d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public f.a f32699e;
    public f.a f;

    /* renamed from: g, reason: collision with root package name */
    public f.a f32700g;

    /* renamed from: h, reason: collision with root package name */
    public f.a f32701h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f32702i;

    /* renamed from: j, reason: collision with root package name */
    public a0 f32703j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f32704k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f32705l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f32706m;

    /* renamed from: n, reason: collision with root package name */
    public long f32707n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f32708p;

    public b0() {
        f.a aVar = f.a.f32733e;
        this.f32699e = aVar;
        this.f = aVar;
        this.f32700g = aVar;
        this.f32701h = aVar;
        ByteBuffer byteBuffer = f.f32732a;
        this.f32704k = byteBuffer;
        this.f32705l = byteBuffer.asShortBuffer();
        this.f32706m = byteBuffer;
        this.f32696b = -1;
    }

    @Override // m4.f
    public final void a(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        a0 a0Var = this.f32703j;
        a0Var.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f32707n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = a0Var.f32672b;
        int i11 = remaining2 / i10;
        short[] b10 = a0Var.b(a0Var.f32679j, a0Var.f32680k, i11);
        a0Var.f32679j = b10;
        asShortBuffer.get(b10, a0Var.f32680k * i10, ((i11 * i10) * 2) / 2);
        a0Var.f32680k += i11;
        a0Var.e();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // m4.f
    public final boolean b() {
        a0 a0Var;
        if (this.f32708p && ((a0Var = this.f32703j) == null || a0Var.f32682m * a0Var.f32672b * 2 == 0)) {
            return true;
        }
        return false;
    }

    @Override // m4.f
    public final void c() {
        a0 a0Var = this.f32703j;
        if (a0Var != null) {
            int i10 = a0Var.f32680k;
            float f = a0Var.f32673c;
            float f10 = a0Var.f32674d;
            int i11 = a0Var.f32682m + ((int) ((((i10 / (f / f10)) + a0Var.o) / (a0Var.f32675e * f10)) + 0.5f));
            short[] sArr = a0Var.f32679j;
            int i12 = a0Var.f32677h * 2;
            a0Var.f32679j = a0Var.b(sArr, i10, i12 + i10);
            int i13 = 0;
            while (true) {
                int i14 = a0Var.f32672b;
                if (i13 >= i12 * i14) {
                    break;
                }
                a0Var.f32679j[(i14 * i10) + i13] = 0;
                i13++;
            }
            a0Var.f32680k = i12 + a0Var.f32680k;
            a0Var.e();
            if (a0Var.f32682m > i11) {
                a0Var.f32682m = i11;
            }
            a0Var.f32680k = 0;
            a0Var.f32686r = 0;
            a0Var.o = 0;
        }
        this.f32708p = true;
    }

    @Override // m4.f
    public final f.a d(f.a aVar) throws f.b {
        if (aVar.f32736c == 2) {
            int i10 = this.f32696b;
            if (i10 == -1) {
                i10 = aVar.f32734a;
            }
            this.f32699e = aVar;
            f.a aVar2 = new f.a(i10, aVar.f32735b, 2);
            this.f = aVar2;
            this.f32702i = true;
            return aVar2;
        }
        throw new f.b(aVar);
    }

    @Override // m4.f
    public final boolean e() {
        if (this.f.f32734a != -1 && (Math.abs(this.f32697c - 1.0f) >= 1.0E-4f || Math.abs(this.f32698d - 1.0f) >= 1.0E-4f || this.f.f32734a != this.f32699e.f32734a)) {
            return true;
        }
        return false;
    }

    @Override // m4.f
    public final void flush() {
        if (e()) {
            f.a aVar = this.f32699e;
            this.f32700g = aVar;
            f.a aVar2 = this.f;
            this.f32701h = aVar2;
            if (this.f32702i) {
                this.f32703j = new a0(aVar.f32734a, aVar.f32735b, this.f32697c, this.f32698d, aVar2.f32734a);
            } else {
                a0 a0Var = this.f32703j;
                if (a0Var != null) {
                    a0Var.f32680k = 0;
                    a0Var.f32682m = 0;
                    a0Var.o = 0;
                    a0Var.f32684p = 0;
                    a0Var.f32685q = 0;
                    a0Var.f32686r = 0;
                    a0Var.f32687s = 0;
                    a0Var.f32688t = 0;
                    a0Var.f32689u = 0;
                    a0Var.f32690v = 0;
                }
            }
        }
        this.f32706m = f.f32732a;
        this.f32707n = 0L;
        this.o = 0L;
        this.f32708p = false;
    }

    @Override // m4.f
    public final ByteBuffer getOutput() {
        a0 a0Var = this.f32703j;
        if (a0Var != null) {
            int i10 = a0Var.f32682m;
            int i11 = a0Var.f32672b;
            int i12 = i10 * i11 * 2;
            if (i12 > 0) {
                if (this.f32704k.capacity() < i12) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
                    this.f32704k = order;
                    this.f32705l = order.asShortBuffer();
                } else {
                    this.f32704k.clear();
                    this.f32705l.clear();
                }
                ShortBuffer shortBuffer = this.f32705l;
                int min = Math.min(shortBuffer.remaining() / i11, a0Var.f32682m);
                int i13 = min * i11;
                shortBuffer.put(a0Var.f32681l, 0, i13);
                int i14 = a0Var.f32682m - min;
                a0Var.f32682m = i14;
                short[] sArr = a0Var.f32681l;
                System.arraycopy(sArr, i13, sArr, 0, i14 * i11);
                this.o += i12;
                this.f32704k.limit(i12);
                this.f32706m = this.f32704k;
            }
        }
        ByteBuffer byteBuffer = this.f32706m;
        this.f32706m = f.f32732a;
        return byteBuffer;
    }

    @Override // m4.f
    public final void reset() {
        this.f32697c = 1.0f;
        this.f32698d = 1.0f;
        f.a aVar = f.a.f32733e;
        this.f32699e = aVar;
        this.f = aVar;
        this.f32700g = aVar;
        this.f32701h = aVar;
        ByteBuffer byteBuffer = f.f32732a;
        this.f32704k = byteBuffer;
        this.f32705l = byteBuffer.asShortBuffer();
        this.f32706m = byteBuffer;
        this.f32696b = -1;
        this.f32702i = false;
        this.f32703j = null;
        this.f32707n = 0L;
        this.o = 0L;
        this.f32708p = false;
    }
}
