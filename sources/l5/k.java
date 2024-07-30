package l5;

import c6.g0;
import java.io.IOException;
import k4.i0;
import l5.f;

/* compiled from: InitializationChunk.java */
/* loaded from: classes2.dex */
public final class k extends e {

    /* renamed from: j, reason: collision with root package name */
    public final f f32532j;

    /* renamed from: k, reason: collision with root package name */
    public f.a f32533k;

    /* renamed from: l, reason: collision with root package name */
    public long f32534l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f32535m;

    public k(c6.j jVar, c6.m mVar, i0 i0Var, int i10, Object obj, f fVar) {
        super(jVar, mVar, 2, i0Var, i10, obj, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b);
        this.f32532j = fVar;
    }

    @Override // c6.b0.d
    public final void a() {
        this.f32535m = true;
    }

    @Override // c6.b0.d
    public final void load() throws IOException {
        boolean z10;
        if (this.f32534l == 0) {
            ((d) this.f32532j).a(this.f32533k, com.anythink.expressad.exoplayer.b.f7291b, com.anythink.expressad.exoplayer.b.f7291b);
        }
        try {
            c6.m a10 = this.f32506b.a(this.f32534l);
            g0 g0Var = this.f32512i;
            p4.e eVar = new p4.e(g0Var, a10.f, g0Var.f(a10));
            while (!this.f32535m) {
                try {
                    int c10 = ((d) this.f32532j).f32493s.c(eVar, d.B);
                    boolean z11 = false;
                    if (c10 != 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    d6.a.d(z10);
                    if (c10 == 0) {
                        z11 = true;
                    }
                    if (!z11) {
                        break;
                    }
                } finally {
                    this.f32534l = eVar.f34314d - this.f32506b.f;
                }
            }
        } finally {
            androidx.activity.n.o0(this.f32512i);
        }
    }
}
