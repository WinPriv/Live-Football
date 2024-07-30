package com.applovin.exoplayer2.m.a;

import com.anythink.expressad.exoplayer.k.o;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.p;
import com.applovin.exoplayer2.v;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends com.applovin.exoplayer2.e {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.c.g f16386a;

    /* renamed from: b, reason: collision with root package name */
    private final y f16387b;

    /* renamed from: c, reason: collision with root package name */
    private long f16388c;

    /* renamed from: d, reason: collision with root package name */
    private a f16389d;

    /* renamed from: e, reason: collision with root package name */
    private long f16390e;

    public b() {
        super(6);
        this.f16386a = new com.applovin.exoplayer2.c.g(1);
        this.f16387b = new y();
    }

    private void B() {
        a aVar = this.f16389d;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.applovin.exoplayer2.ar
    public boolean A() {
        return g();
    }

    @Override // com.applovin.exoplayer2.as
    public int a(v vVar) {
        if (o.ah.equals(vVar.f16838l)) {
            return as.b(4);
        }
        return as.b(0);
    }

    @Override // com.applovin.exoplayer2.e
    public void r() {
        B();
    }

    @Override // com.applovin.exoplayer2.ar, com.applovin.exoplayer2.as
    public String y() {
        return "CameraMotionRenderer";
    }

    @Override // com.applovin.exoplayer2.ar
    public boolean z() {
        return true;
    }

    @Override // com.applovin.exoplayer2.e, com.applovin.exoplayer2.ao.b
    public void a(int i10, Object obj) throws p {
        if (i10 == 8) {
            this.f16389d = (a) obj;
        } else {
            super.a(i10, obj);
        }
    }

    @Override // com.applovin.exoplayer2.e
    public void a(v[] vVarArr, long j10, long j11) {
        this.f16388c = j11;
    }

    @Override // com.applovin.exoplayer2.e
    public void a(long j10, boolean z10) {
        this.f16390e = Long.MIN_VALUE;
        B();
    }

    @Override // com.applovin.exoplayer2.ar
    public void a(long j10, long j11) {
        while (!g() && this.f16390e < 100000 + j10) {
            this.f16386a.a();
            if (a(t(), this.f16386a, 0) != -4 || this.f16386a.c()) {
                return;
            }
            com.applovin.exoplayer2.c.g gVar = this.f16386a;
            this.f16390e = gVar.f13647d;
            if (this.f16389d != null && !gVar.b()) {
                this.f16386a.h();
                float[] a10 = a((ByteBuffer) ai.a(this.f16386a.f13645b));
                if (a10 != null) {
                    ((a) ai.a(this.f16389d)).a(this.f16390e - this.f16388c, a10);
                }
            }
        }
    }

    private float[] a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f16387b.a(byteBuffer.array(), byteBuffer.limit());
        this.f16387b.d(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f16387b.r());
        }
        return fArr;
    }
}
