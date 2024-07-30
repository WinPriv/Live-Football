package com.anythink.expressad.exoplayer.g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.anythink.expressad.exoplayer.m;
import com.anythink.expressad.exoplayer.n;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends com.anythink.expressad.exoplayer.a implements Handler.Callback {

    /* renamed from: n, reason: collision with root package name */
    private static final int f8128n = 0;
    private static final int o = 5;

    /* renamed from: p, reason: collision with root package name */
    private final d f8129p;

    /* renamed from: q, reason: collision with root package name */
    private final f f8130q;

    /* renamed from: r, reason: collision with root package name */
    private final Handler f8131r;

    /* renamed from: s, reason: collision with root package name */
    private final n f8132s;

    /* renamed from: t, reason: collision with root package name */
    private final e f8133t;

    /* renamed from: u, reason: collision with root package name */
    private final com.anythink.expressad.exoplayer.g.a[] f8134u;

    /* renamed from: v, reason: collision with root package name */
    private final long[] f8135v;

    /* renamed from: w, reason: collision with root package name */
    private int f8136w;

    /* renamed from: x, reason: collision with root package name */
    private int f8137x;
    private b y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f8138z;

    @Deprecated
    /* loaded from: classes.dex */
    public interface a extends f {
    }

    public g(f fVar, Looper looper) {
        this(fVar, looper, d.f8126a);
    }

    private void b(com.anythink.expressad.exoplayer.g.a aVar) {
        this.f8130q.a(aVar);
    }

    private void w() {
        Arrays.fill(this.f8134u, (Object) null);
        this.f8136w = 0;
        this.f8137x = 0;
    }

    @Override // com.anythink.expressad.exoplayer.z
    public final int a(m mVar) {
        if (this.f8129p.a(mVar)) {
            return com.anythink.expressad.exoplayer.a.a((com.anythink.expressad.exoplayer.d.g<?>) null, mVar.f9260k) ? 4 : 2;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            b((com.anythink.expressad.exoplayer.g.a) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.anythink.expressad.exoplayer.a
    public final void p() {
        w();
        this.y = null;
    }

    @Override // com.anythink.expressad.exoplayer.y
    public final boolean u() {
        return true;
    }

    @Override // com.anythink.expressad.exoplayer.y
    public final boolean v() {
        return this.f8138z;
    }

    private g(f fVar, Looper looper, d dVar) {
        super(4);
        this.f8130q = (f) com.anythink.expressad.exoplayer.k.a.a(fVar);
        this.f8131r = looper == null ? null : new Handler(looper, this);
        this.f8129p = (d) com.anythink.expressad.exoplayer.k.a.a(dVar);
        this.f8132s = new n();
        this.f8133t = new e();
        this.f8134u = new com.anythink.expressad.exoplayer.g.a[5];
        this.f8135v = new long[5];
    }

    @Override // com.anythink.expressad.exoplayer.a
    public final void a(m[] mVarArr, long j10) {
        this.y = this.f8129p.b(mVarArr[0]);
    }

    @Override // com.anythink.expressad.exoplayer.a
    public final void a(long j10, boolean z10) {
        w();
        this.f8138z = false;
    }

    @Override // com.anythink.expressad.exoplayer.y
    public final void a(long j10, long j11) {
        if (!this.f8138z && this.f8137x < 5) {
            this.f8133t.a();
            if (a(this.f8132s, (com.anythink.expressad.exoplayer.c.e) this.f8133t, false) == -4) {
                if (this.f8133t.c()) {
                    this.f8138z = true;
                } else if (!this.f8133t.b()) {
                    e eVar = this.f8133t;
                    eVar.f8127g = this.f8132s.f9274a.f9261l;
                    eVar.h();
                    try {
                        int i10 = (this.f8136w + this.f8137x) % 5;
                        this.f8134u[i10] = this.y.a(this.f8133t);
                        this.f8135v[i10] = this.f8133t.f;
                        this.f8137x++;
                    } catch (c e10) {
                        throw com.anythink.expressad.exoplayer.g.a(e10, s());
                    }
                }
            }
        }
        if (this.f8137x > 0) {
            long[] jArr = this.f8135v;
            int i11 = this.f8136w;
            if (jArr[i11] <= j10) {
                com.anythink.expressad.exoplayer.g.a aVar = this.f8134u[i11];
                Handler handler = this.f8131r;
                if (handler != null) {
                    handler.obtainMessage(0, aVar).sendToTarget();
                } else {
                    b(aVar);
                }
                com.anythink.expressad.exoplayer.g.a[] aVarArr = this.f8134u;
                int i12 = this.f8136w;
                aVarArr[i12] = null;
                this.f8136w = (i12 + 1) % 5;
                this.f8137x--;
            }
        }
    }

    private void a(com.anythink.expressad.exoplayer.g.a aVar) {
        Handler handler = this.f8131r;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            b(aVar);
        }
    }
}
