package com.anythink.core.common.e;

import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.BaseAd;

/* loaded from: classes.dex */
public class b implements Comparable<b> {

    /* renamed from: a, reason: collision with root package name */
    private int f5561a;

    /* renamed from: b, reason: collision with root package name */
    private long f5562b;

    /* renamed from: c, reason: collision with root package name */
    private ATBaseAdAdapter f5563c;

    /* renamed from: d, reason: collision with root package name */
    private BaseAd f5564d;

    /* renamed from: e, reason: collision with root package name */
    private int f5565e;
    private boolean f;

    /* renamed from: g, reason: collision with root package name */
    private long f5566g;

    /* renamed from: h, reason: collision with root package name */
    private String f5567h;

    /* renamed from: i, reason: collision with root package name */
    private int f5568i;

    /* renamed from: j, reason: collision with root package name */
    private long f5569j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f5570k;

    private long l() {
        return this.f5566g;
    }

    private int m() {
        return this.f5561a;
    }

    private long n() {
        return this.f5562b;
    }

    public final String b() {
        return this.f5567h;
    }

    public final boolean c() {
        return this.f;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(b bVar) {
        if (com.anythink.core.common.k.g.a(this.f5563c.getUnitGroupInfo()) > com.anythink.core.common.k.g.a(bVar.f5563c.getUnitGroupInfo())) {
            return -1;
        }
        return 1;
    }

    public final int d() {
        return this.f5565e;
    }

    public final ATBaseAdAdapter e() {
        return this.f5563c;
    }

    public final BaseAd f() {
        return this.f5564d;
    }

    public final boolean g() {
        try {
            ATBaseAdAdapter aTBaseAdAdapter = this.f5563c;
            if (aTBaseAdAdapter != null && this.f5564d != null) {
                return true;
            }
            if (aTBaseAdAdapter != null) {
                return aTBaseAdAdapter.isAdReady();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final e h() {
        BaseAd baseAd = this.f5564d;
        if (baseAd != null) {
            return baseAd.getDetail();
        }
        return this.f5563c.getTrackingInfo();
    }

    public final boolean i() {
        if (this.f5562b + this.f5566g > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (i() && g()) {
            return true;
        }
        return false;
    }

    public final synchronized void k() {
        if (this.f5570k) {
            return;
        }
        this.f5570k = true;
        com.anythink.core.common.b.n.a().a(new Runnable() { // from class: com.anythink.core.common.e.b.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (b.this.f5563c != null) {
                        b.this.f5563c.destory();
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public final boolean a() {
        return this.f5568i == 1 && System.currentTimeMillis() - this.f5562b < this.f5569j;
    }

    public final void b(long j10) {
        this.f5566g = j10;
    }

    public final void c(long j10) {
        this.f5568i = 1;
        this.f5562b = j10;
    }

    public final void a(long j10) {
        this.f5569j = j10;
    }

    public final void b(int i10) {
        this.f5561a = i10;
    }

    private int b(b bVar) {
        return com.anythink.core.common.k.g.a(this.f5563c.getUnitGroupInfo()) > com.anythink.core.common.k.g.a(bVar.f5563c.getUnitGroupInfo()) ? -1 : 1;
    }

    public final void a(String str) {
        this.f5567h = str;
    }

    public final void a(boolean z10) {
        this.f = z10;
    }

    public final void a(int i10) {
        this.f5565e = i10;
        if (i10 > 0) {
            this.f5568i = 0;
        }
    }

    public final void a(ATBaseAdAdapter aTBaseAdAdapter) {
        this.f5563c = aTBaseAdAdapter;
    }

    public final void a(BaseAd baseAd) {
        this.f5564d = baseAd;
    }
}
