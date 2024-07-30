package com.applovin.impl.sdk.e;

import android.text.TextUtils;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class u<T> extends a implements b.c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.c<T> f18937a;

    /* renamed from: b, reason: collision with root package name */
    private final b.c<T> f18938b;

    /* renamed from: c, reason: collision with root package name */
    private o.a f18939c;

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.sdk.c.b<String> f18940d;

    /* renamed from: e, reason: collision with root package name */
    protected b.a f18941e;

    /* renamed from: i, reason: collision with root package name */
    private com.applovin.impl.sdk.c.b<String> f18942i;

    public u(com.applovin.impl.sdk.network.c<T> cVar, com.applovin.impl.sdk.p pVar) {
        this(cVar, pVar, false);
    }

    public abstract void a(int i10, String str, T t10);

    public abstract void a(T t10, int i10);

    @Override // java.lang.Runnable
    public void run() {
        String str;
        com.applovin.impl.sdk.network.b O = d().O();
        if (!d().c() && !d().d()) {
            com.applovin.impl.sdk.y.i("AppLovinSdk", "AppLovin SDK is disabled");
            a(-22, null, null);
            return;
        }
        if (StringUtils.isValidString(this.f18937a.a()) && this.f18937a.a().length() >= 4) {
            if (TextUtils.isEmpty(this.f18937a.b())) {
                if (this.f18937a.e() != null) {
                    str = "POST";
                } else {
                    str = "GET";
                }
                this.f18937a.b(str);
            }
            O.a(this.f18937a, this.f18941e, this.f18938b);
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.e(this.f18838g, "Task has an invalid or null request endpoint.");
        }
        a(AppLovinErrorCodes.INVALID_URL, null, null);
    }

    public u(com.applovin.impl.sdk.network.c<T> cVar, final com.applovin.impl.sdk.p pVar, boolean z10) {
        super("TaskRepeatRequest", pVar, z10);
        this.f18939c = o.a.BACKGROUND;
        this.f18940d = null;
        this.f18942i = null;
        if (cVar != null) {
            this.f18937a = cVar;
            this.f18941e = new b.a();
            this.f18938b = new b.c<T>() { // from class: com.applovin.impl.sdk.e.u.1
                @Override // com.applovin.impl.sdk.network.b.c
                public void a(T t10, int i10) {
                    u.this.f18937a.a(0);
                    u.this.a((u) t10, i10);
                }

                @Override // com.applovin.impl.sdk.network.b.c
                public void a(int i10, String str, T t10) {
                    long millis;
                    boolean z11 = false;
                    boolean z12 = i10 < 200 || i10 >= 500;
                    boolean z13 = i10 == 429;
                    if ((i10 != -1009) && (z12 || z13 || u.this.f18937a.m())) {
                        String f = u.this.f18937a.f();
                        if (u.this.f18937a.h() <= 0) {
                            if (f != null && f.equals(u.this.f18937a.a())) {
                                u uVar = u.this;
                                uVar.c(uVar.f18942i);
                            } else {
                                u uVar2 = u.this;
                                uVar2.c(uVar2.f18940d);
                            }
                            u.this.a(i10, str, t10);
                            return;
                        }
                        com.applovin.impl.sdk.y yVar = u.this.f18839h;
                        if (com.applovin.impl.sdk.y.a()) {
                            u uVar3 = u.this;
                            com.applovin.impl.sdk.y yVar2 = uVar3.f18839h;
                            String str2 = uVar3.f18838g;
                            StringBuilder n10 = a3.k.n("Unable to send request due to server failure (code ", i10, "). ");
                            n10.append(u.this.f18937a.h());
                            n10.append(" attempts left, retrying in ");
                            n10.append(TimeUnit.MILLISECONDS.toSeconds(u.this.f18937a.k()));
                            n10.append(" seconds...");
                            yVar2.d(str2, n10.toString());
                        }
                        int h10 = u.this.f18937a.h() - 1;
                        u.this.f18937a.a(h10);
                        if (h10 == 0) {
                            u uVar4 = u.this;
                            uVar4.c(uVar4.f18940d);
                            if (StringUtils.isValidString(f) && f.length() >= 4) {
                                com.applovin.impl.sdk.y yVar3 = u.this.f18839h;
                                if (com.applovin.impl.sdk.y.a()) {
                                    u uVar5 = u.this;
                                    uVar5.f18839h.c(uVar5.f18838g, "Switching to backup endpoint ".concat(f));
                                }
                                u.this.f18937a.a(f);
                                z11 = true;
                            }
                        }
                        if (((Boolean) pVar.a(com.applovin.impl.sdk.c.b.dt)).booleanValue() && z11) {
                            millis = 0;
                        } else {
                            millis = u.this.f18937a.l() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, u.this.f18937a.i())) : u.this.f18937a.k();
                        }
                        o M = pVar.M();
                        u uVar6 = u.this;
                        M.a(uVar6, uVar6.f18939c, millis);
                        return;
                    }
                    u.this.a(i10, str, t10);
                }
            };
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <ST> void c(com.applovin.impl.sdk.c.b<ST> bVar) {
        if (bVar != null) {
            d().N().a((com.applovin.impl.sdk.c.b<?>) bVar, (Object) bVar.b());
        }
    }

    public void b(com.applovin.impl.sdk.c.b<String> bVar) {
        this.f18942i = bVar;
    }

    public void a(o.a aVar) {
        this.f18939c = aVar;
    }

    public void a(com.applovin.impl.sdk.c.b<String> bVar) {
        this.f18940d = bVar;
    }
}
