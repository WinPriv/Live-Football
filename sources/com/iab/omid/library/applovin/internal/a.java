package com.iab.omid.library.applovin.internal;

import android.content.Context;
import com.iab.omid.library.applovin.internal.d;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class a implements d.a {
    private static a f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.applovin.utils.f f24259a = new com.iab.omid.library.applovin.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f24260b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24261c;

    /* renamed from: d, reason: collision with root package name */
    private d f24262d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f24263e;

    private a(d dVar) {
        this.f24262d = dVar;
    }

    public static a a() {
        return f;
    }

    private void c() {
        if (this.f24261c && this.f24260b != null) {
            Iterator<com.iab.omid.library.applovin.adsession.a> it = c.c().a().iterator();
            while (it.hasNext()) {
                it.next().getAdSessionStatePublisher().a(b());
            }
        }
    }

    public Date b() {
        Date date = this.f24260b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a10 = this.f24259a.a();
        Date date = this.f24260b;
        if (date == null || a10.after(date)) {
            this.f24260b = a10;
            c();
        }
    }

    public void a(Context context) {
        if (this.f24261c) {
            return;
        }
        this.f24262d.a(context);
        this.f24262d.a(this);
        this.f24262d.e();
        this.f24263e = this.f24262d.c();
        this.f24261c = true;
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z10) {
        if (!this.f24263e && z10) {
            d();
        }
        this.f24263e = z10;
    }
}
