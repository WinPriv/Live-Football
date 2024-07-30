package com.applovin.exoplayer2.i;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.v;
import com.applovin.exoplayer2.w;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends com.applovin.exoplayer2.e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f15867a;

    /* renamed from: b, reason: collision with root package name */
    private final l f15868b;

    /* renamed from: c, reason: collision with root package name */
    private final i f15869c;

    /* renamed from: d, reason: collision with root package name */
    private final w f15870d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15871e;
    private boolean f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15872g;

    /* renamed from: h, reason: collision with root package name */
    private int f15873h;

    /* renamed from: i, reason: collision with root package name */
    private v f15874i;

    /* renamed from: j, reason: collision with root package name */
    private g f15875j;

    /* renamed from: k, reason: collision with root package name */
    private j f15876k;

    /* renamed from: l, reason: collision with root package name */
    private k f15877l;

    /* renamed from: m, reason: collision with root package name */
    private k f15878m;

    /* renamed from: n, reason: collision with root package name */
    private int f15879n;
    private long o;

    public m(l lVar, Looper looper) {
        this(lVar, looper, i.f15811a);
    }

    private void B() {
        this.f15876k = null;
        this.f15879n = -1;
        k kVar = this.f15877l;
        if (kVar != null) {
            kVar.f();
            this.f15877l = null;
        }
        k kVar2 = this.f15878m;
        if (kVar2 != null) {
            kVar2.f();
            this.f15878m = null;
        }
    }

    private void C() {
        B();
        ((g) com.applovin.exoplayer2.l.a.b(this.f15875j)).d();
        this.f15875j = null;
        this.f15873h = 0;
    }

    private void D() {
        this.f15872g = true;
        this.f15875j = this.f15869c.b((v) com.applovin.exoplayer2.l.a.b(this.f15874i));
    }

    private void E() {
        C();
        D();
    }

    private long F() {
        if (this.f15879n == -1) {
            return Long.MAX_VALUE;
        }
        com.applovin.exoplayer2.l.a.b(this.f15877l);
        if (this.f15879n >= this.f15877l.f_()) {
            return Long.MAX_VALUE;
        }
        return this.f15877l.a(this.f15879n);
    }

    private void G() {
        a(Collections.emptyList());
    }

    private void b(List<a> list) {
        this.f15868b.a(list);
    }

    @Override // com.applovin.exoplayer2.ar
    public boolean A() {
        return this.f;
    }

    @Override // com.applovin.exoplayer2.as
    public int a(v vVar) {
        if (this.f15869c.a(vVar)) {
            return as.b(vVar.E == 0 ? 4 : 2);
        }
        if (u.c(vVar.f16838l)) {
            return as.b(1);
        }
        return as.b(0);
    }

    public void c(long j10) {
        com.applovin.exoplayer2.l.a.b(j());
        this.o = j10;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            b((List<a>) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.applovin.exoplayer2.e
    public void r() {
        this.f15874i = null;
        this.o = com.anythink.expressad.exoplayer.b.f7291b;
        G();
        C();
    }

    @Override // com.applovin.exoplayer2.ar, com.applovin.exoplayer2.as
    public String y() {
        return "TextRenderer";
    }

    @Override // com.applovin.exoplayer2.ar
    public boolean z() {
        return true;
    }

    public m(l lVar, Looper looper, i iVar) {
        super(3);
        this.f15868b = (l) com.applovin.exoplayer2.l.a.b(lVar);
        this.f15867a = looper == null ? null : ai.a(looper, (Handler.Callback) this);
        this.f15869c = iVar;
        this.f15870d = new w();
        this.o = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // com.applovin.exoplayer2.e
    public void a(v[] vVarArr, long j10, long j11) {
        this.f15874i = vVarArr[0];
        if (this.f15875j != null) {
            this.f15873h = 1;
        } else {
            D();
        }
    }

    @Override // com.applovin.exoplayer2.e
    public void a(long j10, boolean z10) {
        G();
        this.f15871e = false;
        this.f = false;
        this.o = com.anythink.expressad.exoplayer.b.f7291b;
        if (this.f15873h != 0) {
            E();
        } else {
            B();
            ((g) com.applovin.exoplayer2.l.a.b(this.f15875j)).c();
        }
    }

    @Override // com.applovin.exoplayer2.ar
    public void a(long j10, long j11) {
        boolean z10;
        if (j()) {
            long j12 = this.o;
            if (j12 != com.anythink.expressad.exoplayer.b.f7291b && j10 >= j12) {
                B();
                this.f = true;
            }
        }
        if (this.f) {
            return;
        }
        if (this.f15878m == null) {
            ((g) com.applovin.exoplayer2.l.a.b(this.f15875j)).a(j10);
            try {
                this.f15878m = ((g) com.applovin.exoplayer2.l.a.b(this.f15875j)).b();
            } catch (h e10) {
                a(e10);
                return;
            }
        }
        if (d_() != 2) {
            return;
        }
        if (this.f15877l != null) {
            long F = F();
            z10 = false;
            while (F <= j10) {
                this.f15879n++;
                F = F();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        k kVar = this.f15878m;
        if (kVar != null) {
            if (kVar.c()) {
                if (!z10 && F() == Long.MAX_VALUE) {
                    if (this.f15873h == 2) {
                        E();
                    } else {
                        B();
                        this.f = true;
                    }
                }
            } else if (((com.applovin.exoplayer2.c.i) kVar).f13657a <= j10) {
                k kVar2 = this.f15877l;
                if (kVar2 != null) {
                    kVar2.f();
                }
                this.f15879n = kVar.a(j10);
                this.f15877l = kVar;
                this.f15878m = null;
                z10 = true;
            }
        }
        if (z10) {
            com.applovin.exoplayer2.l.a.b(this.f15877l);
            a(this.f15877l.b(j10));
        }
        if (this.f15873h == 2) {
            return;
        }
        while (!this.f15871e) {
            try {
                j jVar = this.f15876k;
                if (jVar == null) {
                    jVar = ((g) com.applovin.exoplayer2.l.a.b(this.f15875j)).a();
                    if (jVar == null) {
                        return;
                    } else {
                        this.f15876k = jVar;
                    }
                }
                if (this.f15873h == 1) {
                    jVar.a_(4);
                    ((g) com.applovin.exoplayer2.l.a.b(this.f15875j)).a((g) jVar);
                    this.f15876k = null;
                    this.f15873h = 2;
                    return;
                }
                int a10 = a(this.f15870d, jVar, 0);
                if (a10 == -4) {
                    if (jVar.c()) {
                        this.f15871e = true;
                        this.f15872g = false;
                    } else {
                        v vVar = this.f15870d.f16876b;
                        if (vVar == null) {
                            return;
                        }
                        jVar.f = vVar.f16841p;
                        jVar.h();
                        this.f15872g &= !jVar.d();
                    }
                    if (!this.f15872g) {
                        ((g) com.applovin.exoplayer2.l.a.b(this.f15875j)).a((g) jVar);
                        this.f15876k = null;
                    }
                } else if (a10 == -3) {
                    return;
                }
            } catch (h e11) {
                a(e11);
                return;
            }
        }
    }

    private void a(List<a> list) {
        Handler handler = this.f15867a;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            b(list);
        }
    }

    private void a(h hVar) {
        q.c("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f15874i, hVar);
        G();
        E();
    }
}
