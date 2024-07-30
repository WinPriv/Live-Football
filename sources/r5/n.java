package r5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.anythink.expressad.exoplayer.k.o;
import d6.g0;
import d6.r;
import j7.j0;
import j7.v1;
import k4.a0;
import k4.i0;
import k4.j1;
import org.checkerframework.dataflow.qual.SideEffectFree;
import r5.j;

/* compiled from: TextRenderer.java */
/* loaded from: classes2.dex */
public final class n extends k4.e implements Handler.Callback {
    public final Handler E;
    public final m F;
    public final j G;
    public final j1.a H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public i0 M;
    public h N;
    public k O;
    public l P;
    public l Q;
    public int R;
    public long S;
    public long T;
    public long U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a0.b bVar, Looper looper) {
        super(3);
        Handler handler;
        j.a aVar = j.f34927a;
        this.F = bVar;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = g0.f27302a;
            handler = new Handler(looper, this);
        }
        this.E = handler;
        this.G = aVar;
        this.H = new j1.a(4, 0);
        this.S = com.anythink.expressad.exoplayer.b.f7291b;
        this.T = com.anythink.expressad.exoplayer.b.f7291b;
        this.U = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // k4.e
    public final void A() {
        this.M = null;
        this.S = com.anythink.expressad.exoplayer.b.f7291b;
        I();
        this.T = com.anythink.expressad.exoplayer.b.f7291b;
        this.U = com.anythink.expressad.exoplayer.b.f7291b;
        L();
        h hVar = this.N;
        hVar.getClass();
        hVar.release();
        this.N = null;
        this.L = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cb, code lost:
    
        if (r0.equals(com.anythink.expressad.exoplayer.k.o.aj) == false) goto L55;
     */
    @Override // k4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(long r3, boolean r5) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.n.C(long, boolean):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b3, code lost:
    
        if (r3.equals(com.anythink.expressad.exoplayer.k.o.aj) == false) goto L56;
     */
    @Override // k4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(k4.i0[] r1, long r2, long r4) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.n.G(k4.i0[], long, long):void");
    }

    public final void I() {
        c cVar = new c(K(this.U), v1.f30113w);
        Handler handler = this.E;
        if (handler != null) {
            handler.obtainMessage(0, cVar).sendToTarget();
            return;
        }
        j0<a> j0Var = cVar.f34917s;
        m mVar = this.F;
        mVar.w(j0Var);
        mVar.u(cVar);
    }

    public final long J() {
        if (this.R == -1) {
            return Long.MAX_VALUE;
        }
        this.P.getClass();
        if (this.R >= this.P.d()) {
            return Long.MAX_VALUE;
        }
        return this.P.b(this.R);
    }

    @SideEffectFree
    public final long K(long j10) {
        boolean z10;
        boolean z11 = true;
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        if (this.T == com.anythink.expressad.exoplayer.b.f7291b) {
            z11 = false;
        }
        d6.a.d(z11);
        return j10 - this.T;
    }

    public final void L() {
        this.O = null;
        this.R = -1;
        l lVar = this.P;
        if (lVar != null) {
            lVar.h();
            this.P = null;
        }
        l lVar2 = this.Q;
        if (lVar2 != null) {
            lVar2.h();
            this.Q = null;
        }
    }

    @Override // k4.i1
    public final boolean b() {
        return this.J;
    }

    @Override // k4.j1
    public final int c(i0 i0Var) {
        boolean z10;
        int i10;
        ((j.a) this.G).getClass();
        String str = i0Var.D;
        if (!o.O.equals(str) && !o.P.equals(str) && !o.Z.equals(str) && !o.f9066ab.equals(str) && !o.Y.equals(str) && !o.f9065aa.equals(str) && !o.W.equals(str) && !o.f9067ac.equals(str) && !o.X.equals(str) && !o.aj.equals(str) && !o.af.equals(str) && !"text/x-exoplayer-cues".equals(str)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (i0Var.Y == 0) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            return j1.k(i10, 0, 0);
        }
        if (r.l(i0Var.D)) {
            return j1.k(1, 0, 0);
        }
        return j1.k(0, 0, 0);
    }

    @Override // k4.i1, k4.j1
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            c cVar = (c) message.obj;
            j0<a> j0Var = cVar.f34917s;
            m mVar = this.F;
            mVar.w(j0Var);
            mVar.u(cVar);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // k4.i1
    public final boolean isReady() {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x04a5, code lost:
    
        if (r13.equals(com.anythink.expressad.exoplayer.k.o.f9065aa) == false) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011a, code lost:
    
        if (r2.equals(com.anythink.expressad.exoplayer.k.o.aj) == false) goto L69;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:184:0x04d9. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0121. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0393 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0394 A[EXC_TOP_SPLITTER, LOOP:1: B:128:0x0394->B:151:0x0394, LOOP_START, SYNTHETIC] */
    @Override // k4.i1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(long r23, long r25) {
        /*
            Method dump skipped, instructions count: 1560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.n.o(long, long):void");
    }
}
