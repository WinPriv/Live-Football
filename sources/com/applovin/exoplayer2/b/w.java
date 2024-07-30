package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.b.f;
import com.applovin.exoplayer2.l.ai;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class w implements f {

    /* renamed from: b, reason: collision with root package name */
    private int f13550b;

    /* renamed from: c, reason: collision with root package name */
    private float f13551c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f13552d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    private f.a f13553e;
    private f.a f;

    /* renamed from: g, reason: collision with root package name */
    private f.a f13554g;

    /* renamed from: h, reason: collision with root package name */
    private f.a f13555h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13556i;

    /* renamed from: j, reason: collision with root package name */
    private v f13557j;

    /* renamed from: k, reason: collision with root package name */
    private ByteBuffer f13558k;

    /* renamed from: l, reason: collision with root package name */
    private ShortBuffer f13559l;

    /* renamed from: m, reason: collision with root package name */
    private ByteBuffer f13560m;

    /* renamed from: n, reason: collision with root package name */
    private long f13561n;
    private long o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f13562p;

    public w() {
        f.a aVar = f.a.f13381a;
        this.f13553e = aVar;
        this.f = aVar;
        this.f13554g = aVar;
        this.f13555h = aVar;
        ByteBuffer byteBuffer = f.f13380a;
        this.f13558k = byteBuffer;
        this.f13559l = byteBuffer.asShortBuffer();
        this.f13560m = byteBuffer;
        this.f13550b = -1;
    }

    public void a(float f) {
        if (this.f13551c != f) {
            this.f13551c = f;
            this.f13556i = true;
        }
    }

    public void b(float f) {
        if (this.f13552d != f) {
            this.f13552d = f;
            this.f13556i = true;
        }
    }

    @Override // com.applovin.exoplayer2.b.f
    public ByteBuffer c() {
        int d10;
        v vVar = this.f13557j;
        if (vVar != null && (d10 = vVar.d()) > 0) {
            if (this.f13558k.capacity() < d10) {
                ByteBuffer order = ByteBuffer.allocateDirect(d10).order(ByteOrder.nativeOrder());
                this.f13558k = order;
                this.f13559l = order.asShortBuffer();
            } else {
                this.f13558k.clear();
                this.f13559l.clear();
            }
            vVar.b(this.f13559l);
            this.o += d10;
            this.f13558k.limit(d10);
            this.f13560m = this.f13558k;
        }
        ByteBuffer byteBuffer = this.f13560m;
        this.f13560m = f.f13380a;
        return byteBuffer;
    }

    @Override // com.applovin.exoplayer2.b.f
    public boolean d() {
        v vVar;
        if (this.f13562p && ((vVar = this.f13557j) == null || vVar.d() == 0)) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.b.f
    public void e() {
        if (a()) {
            f.a aVar = this.f13553e;
            this.f13554g = aVar;
            f.a aVar2 = this.f;
            this.f13555h = aVar2;
            if (this.f13556i) {
                this.f13557j = new v(aVar.f13382b, aVar.f13383c, this.f13551c, this.f13552d, aVar2.f13382b);
            } else {
                v vVar = this.f13557j;
                if (vVar != null) {
                    vVar.c();
                }
            }
        }
        this.f13560m = f.f13380a;
        this.f13561n = 0L;
        this.o = 0L;
        this.f13562p = false;
    }

    @Override // com.applovin.exoplayer2.b.f
    public void f() {
        this.f13551c = 1.0f;
        this.f13552d = 1.0f;
        f.a aVar = f.a.f13381a;
        this.f13553e = aVar;
        this.f = aVar;
        this.f13554g = aVar;
        this.f13555h = aVar;
        ByteBuffer byteBuffer = f.f13380a;
        this.f13558k = byteBuffer;
        this.f13559l = byteBuffer.asShortBuffer();
        this.f13560m = byteBuffer;
        this.f13550b = -1;
        this.f13556i = false;
        this.f13557j = null;
        this.f13561n = 0L;
        this.o = 0L;
        this.f13562p = false;
    }

    public long a(long j10) {
        if (this.o >= 1024) {
            long a10 = this.f13561n - ((v) com.applovin.exoplayer2.l.a.b(this.f13557j)).a();
            int i10 = this.f13555h.f13382b;
            int i11 = this.f13554g.f13382b;
            if (i10 == i11) {
                return ai.d(j10, a10, this.o);
            }
            return ai.d(j10, a10 * i10, this.o * i11);
        }
        return (long) (this.f13551c * j10);
    }

    @Override // com.applovin.exoplayer2.b.f
    public void b() {
        v vVar = this.f13557j;
        if (vVar != null) {
            vVar.b();
        }
        this.f13562p = true;
    }

    @Override // com.applovin.exoplayer2.b.f
    public f.a a(f.a aVar) throws f.b {
        if (aVar.f13384d == 2) {
            int i10 = this.f13550b;
            if (i10 == -1) {
                i10 = aVar.f13382b;
            }
            this.f13553e = aVar;
            f.a aVar2 = new f.a(i10, aVar.f13383c, 2);
            this.f = aVar2;
            this.f13556i = true;
            return aVar2;
        }
        throw new f.b(aVar);
    }

    @Override // com.applovin.exoplayer2.b.f
    public boolean a() {
        return this.f.f13382b != -1 && (Math.abs(this.f13551c - 1.0f) >= 1.0E-4f || Math.abs(this.f13552d - 1.0f) >= 1.0E-4f || this.f.f13382b != this.f13553e.f13382b);
    }

    @Override // com.applovin.exoplayer2.b.f
    public void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            v vVar = (v) com.applovin.exoplayer2.l.a.b(this.f13557j);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f13561n += remaining;
            vVar.a(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }
}
