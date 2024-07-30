package f6;

import com.anythink.expressad.exoplayer.k.o;
import d6.g0;
import d6.w;
import java.nio.ByteBuffer;
import k4.i0;
import k4.j1;
import k4.m;

/* compiled from: CameraMotionRenderer.java */
/* loaded from: classes2.dex */
public final class b extends k4.e {
    public final n4.g E;
    public final w F;
    public long G;
    public a H;
    public long I;

    public b() {
        super(6);
        this.E = new n4.g(1);
        this.F = new w();
    }

    @Override // k4.e
    public final void A() {
        a aVar = this.H;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // k4.e
    public final void C(long j10, boolean z10) {
        this.I = Long.MIN_VALUE;
        a aVar = this.H;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // k4.e
    public final void G(i0[] i0VarArr, long j10, long j11) {
        this.G = j11;
    }

    @Override // k4.i1
    public final boolean b() {
        return f();
    }

    @Override // k4.j1
    public final int c(i0 i0Var) {
        if (o.ah.equals(i0Var.D)) {
            return j1.k(4, 0, 0);
        }
        return j1.k(0, 0, 0);
    }

    @Override // k4.i1, k4.j1
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // k4.i1
    public final boolean isReady() {
        return true;
    }

    @Override // k4.i1
    public final void o(long j10, long j11) {
        float[] fArr;
        while (!f() && this.I < 100000 + j10) {
            n4.g gVar = this.E;
            gVar.h();
            j1.a aVar = this.f30405t;
            aVar.n();
            if (H(aVar, gVar, 0) == -4 && !gVar.f(4)) {
                this.I = gVar.f33324w;
                if (this.H != null && !gVar.g()) {
                    gVar.k();
                    ByteBuffer byteBuffer = gVar.f33322u;
                    int i10 = g0.f27302a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        w wVar = this.F;
                        wVar.C(limit, array);
                        wVar.E(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i11 = 0; i11 < 3; i11++) {
                            fArr2[i11] = Float.intBitsToFloat(wVar.g());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.H.a(this.I - this.G, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // k4.e, k4.f1.b
    public final void p(int i10, Object obj) throws m {
        if (i10 == 8) {
            this.H = (a) obj;
        }
    }
}
