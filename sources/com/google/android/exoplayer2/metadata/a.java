package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c5.b;
import c5.c;
import c5.d;
import com.google.android.exoplayer2.metadata.Metadata;
import d6.g0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import k4.a0;
import k4.e;
import k4.i0;
import k4.j1;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: MetadataRenderer.java */
/* loaded from: classes2.dex */
public final class a extends e implements Handler.Callback {
    public final b E;
    public final d F;
    public final Handler G;
    public final c H;
    public c5.a I;
    public boolean J;
    public boolean K;
    public long L;
    public Metadata M;
    public long N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a0.b bVar, Looper looper) {
        super(5);
        Handler handler;
        b.a aVar = b.f3282a;
        this.F = bVar;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = g0.f27302a;
            handler = new Handler(looper, this);
        }
        this.G = handler;
        this.E = aVar;
        this.H = new c();
        this.N = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // k4.e
    public final void A() {
        this.M = null;
        this.I = null;
        this.N = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // k4.e
    public final void C(long j10, boolean z10) {
        this.M = null;
        this.J = false;
        this.K = false;
    }

    @Override // k4.e
    public final void G(i0[] i0VarArr, long j10, long j11) {
        this.I = this.E.d(i0VarArr[0]);
        Metadata metadata = this.M;
        if (metadata != null) {
            long j12 = this.N;
            long j13 = metadata.f19998t;
            long j14 = (j12 + j13) - j11;
            if (j13 != j14) {
                metadata = new Metadata(j14, metadata.f19997s);
            }
            this.M = metadata;
        }
        this.N = j11;
    }

    public final void I(Metadata metadata, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f19997s;
            if (i10 < entryArr.length) {
                i0 g6 = entryArr[i10].g();
                if (g6 != null) {
                    b bVar = this.E;
                    if (bVar.c(g6)) {
                        c5.e d10 = bVar.d(g6);
                        byte[] S = entryArr[i10].S();
                        S.getClass();
                        c cVar = this.H;
                        cVar.h();
                        cVar.j(S.length);
                        ByteBuffer byteBuffer = cVar.f33322u;
                        int i11 = g0.f27302a;
                        byteBuffer.put(S);
                        cVar.k();
                        Metadata a10 = d10.a(cVar);
                        if (a10 != null) {
                            I(a10, arrayList);
                        }
                        i10++;
                    }
                }
                arrayList.add(entryArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    @SideEffectFree
    public final long J(long j10) {
        boolean z10;
        boolean z11 = true;
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.d(z10);
        if (this.N == com.anythink.expressad.exoplayer.b.f7291b) {
            z11 = false;
        }
        d6.a.d(z11);
        return j10 - this.N;
    }

    @Override // k4.i1
    public final boolean b() {
        return this.K;
    }

    @Override // k4.j1
    public final int c(i0 i0Var) {
        int i10;
        if (this.E.c(i0Var)) {
            if (i0Var.Y == 0) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            return j1.k(i10, 0, 0);
        }
        return j1.k(0, 0, 0);
    }

    @Override // k4.i1, k4.j1
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.F.h((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // k4.i1
    public final boolean isReady() {
        return true;
    }

    @Override // k4.i1
    public final void o(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            if (!this.J && this.M == null) {
                c cVar = this.H;
                cVar.h();
                j1.a aVar = this.f30405t;
                aVar.n();
                int H = H(aVar, cVar, 0);
                if (H == -4) {
                    if (cVar.f(4)) {
                        this.J = true;
                    } else {
                        cVar.A = this.L;
                        cVar.k();
                        c5.a aVar2 = this.I;
                        int i10 = g0.f27302a;
                        Metadata a10 = aVar2.a(cVar);
                        if (a10 != null) {
                            ArrayList arrayList = new ArrayList(a10.f19997s.length);
                            I(a10, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.M = new Metadata(J(cVar.f33324w), (Metadata.Entry[]) arrayList.toArray(new Metadata.Entry[0]));
                            }
                        }
                    }
                } else if (H == -5) {
                    i0 i0Var = (i0) aVar.f29569u;
                    i0Var.getClass();
                    this.L = i0Var.H;
                }
            }
            Metadata metadata = this.M;
            if (metadata != null && metadata.f19998t <= J(j10)) {
                Metadata metadata2 = this.M;
                Handler handler = this.G;
                if (handler != null) {
                    handler.obtainMessage(0, metadata2).sendToTarget();
                } else {
                    this.F.h(metadata2);
                }
                this.M = null;
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.J && this.M == null) {
                this.K = true;
            }
        }
    }
}
