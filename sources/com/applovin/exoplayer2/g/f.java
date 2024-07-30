package com.applovin.exoplayer2.g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import com.applovin.exoplayer2.w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends com.applovin.exoplayer2.e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    private final c f15176a;

    /* renamed from: b, reason: collision with root package name */
    private final e f15177b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f15178c;

    /* renamed from: d, reason: collision with root package name */
    private final d f15179d;

    /* renamed from: e, reason: collision with root package name */
    private b f15180e;
    private boolean f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15181g;

    /* renamed from: h, reason: collision with root package name */
    private long f15182h;

    /* renamed from: i, reason: collision with root package name */
    private long f15183i;

    /* renamed from: j, reason: collision with root package name */
    private a f15184j;

    public f(e eVar, Looper looper) {
        this(eVar, looper, c.f15113a);
    }

    private void B() {
        if (!this.f && this.f15184j == null) {
            this.f15179d.a();
            w t10 = t();
            int a10 = a(t10, this.f15179d, 0);
            if (a10 == -4) {
                if (this.f15179d.c()) {
                    this.f = true;
                    return;
                }
                d dVar = this.f15179d;
                dVar.f = this.f15182h;
                dVar.h();
                a a11 = ((b) ai.a(this.f15180e)).a(this.f15179d);
                if (a11 != null) {
                    ArrayList arrayList = new ArrayList(a11.a());
                    a(a11, arrayList);
                    if (!arrayList.isEmpty()) {
                        this.f15184j = new a(arrayList);
                        this.f15183i = this.f15179d.f13647d;
                        return;
                    }
                    return;
                }
                return;
            }
            if (a10 == -5) {
                this.f15182h = ((v) com.applovin.exoplayer2.l.a.b(t10.f16876b)).f16841p;
            }
        }
    }

    private void b(a aVar) {
        this.f15177b.a(aVar);
    }

    private boolean c(long j10) {
        boolean z10;
        a aVar = this.f15184j;
        if (aVar != null && this.f15183i <= j10) {
            a(aVar);
            this.f15184j = null;
            this.f15183i = com.anythink.expressad.exoplayer.b.f7291b;
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f && this.f15184j == null) {
            this.f15181g = true;
        }
        return z10;
    }

    @Override // com.applovin.exoplayer2.ar
    public boolean A() {
        return this.f15181g;
    }

    @Override // com.applovin.exoplayer2.as
    public int a(v vVar) {
        if (this.f15176a.a(vVar)) {
            return as.b(vVar.E == 0 ? 4 : 2);
        }
        return as.b(0);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            b((a) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // com.applovin.exoplayer2.e
    public void r() {
        this.f15184j = null;
        this.f15183i = com.anythink.expressad.exoplayer.b.f7291b;
        this.f15180e = null;
    }

    @Override // com.applovin.exoplayer2.ar, com.applovin.exoplayer2.as
    public String y() {
        return "MetadataRenderer";
    }

    @Override // com.applovin.exoplayer2.ar
    public boolean z() {
        return true;
    }

    public f(e eVar, Looper looper, c cVar) {
        super(5);
        this.f15177b = (e) com.applovin.exoplayer2.l.a.b(eVar);
        this.f15178c = looper == null ? null : ai.a(looper, (Handler.Callback) this);
        this.f15176a = (c) com.applovin.exoplayer2.l.a.b(cVar);
        this.f15179d = new d();
        this.f15183i = com.anythink.expressad.exoplayer.b.f7291b;
    }

    @Override // com.applovin.exoplayer2.e
    public void a(v[] vVarArr, long j10, long j11) {
        this.f15180e = this.f15176a.b(vVarArr[0]);
    }

    @Override // com.applovin.exoplayer2.e
    public void a(long j10, boolean z10) {
        this.f15184j = null;
        this.f15183i = com.anythink.expressad.exoplayer.b.f7291b;
        this.f = false;
        this.f15181g = false;
    }

    @Override // com.applovin.exoplayer2.ar
    public void a(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            B();
            z10 = c(j10);
        }
    }

    private void a(a aVar, List<a.InterfaceC0172a> list) {
        for (int i10 = 0; i10 < aVar.a(); i10++) {
            v a10 = aVar.a(i10).a();
            if (a10 != null && this.f15176a.a(a10)) {
                b b10 = this.f15176a.b(a10);
                byte[] bArr = (byte[]) com.applovin.exoplayer2.l.a.b(aVar.a(i10).b());
                this.f15179d.a();
                this.f15179d.f(bArr.length);
                ((ByteBuffer) ai.a(this.f15179d.f13645b)).put(bArr);
                this.f15179d.h();
                a a11 = b10.a(this.f15179d);
                if (a11 != null) {
                    a(a11, list);
                }
            } else {
                list.add(aVar.a(i10));
            }
        }
    }

    private void a(a aVar) {
        Handler handler = this.f15178c;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            b(aVar);
        }
    }
}
