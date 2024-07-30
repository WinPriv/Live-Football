package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import com.iab.omid.library.ironsrc.internal.d;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class a implements d.a {
    private static a f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.ironsrc.utils.f f24377a = new com.iab.omid.library.ironsrc.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f24378b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24379c;

    /* renamed from: d, reason: collision with root package name */
    private d f24380d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f24381e;

    private a(d dVar) {
        this.f24380d = dVar;
    }

    public static a a() {
        return f;
    }

    private void c() {
        if (this.f24379c && this.f24378b != null) {
            Iterator<com.iab.omid.library.ironsrc.adsession.a> it = c.c().a().iterator();
            while (it.hasNext()) {
                it.next().getAdSessionStatePublisher().a(b());
            }
        }
    }

    public Date b() {
        Date date = this.f24378b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a10 = this.f24377a.a();
        Date date = this.f24378b;
        if (date == null || a10.after(date)) {
            this.f24378b = a10;
            c();
        }
    }

    public void a(Context context) {
        if (this.f24379c) {
            return;
        }
        this.f24380d.a(context);
        this.f24380d.a(this);
        this.f24380d.e();
        this.f24381e = this.f24380d.c();
        this.f24379c = true;
    }

    @Override // com.iab.omid.library.ironsrc.internal.d.a
    public void a(boolean z10) {
        if (!this.f24381e && z10) {
            d();
        }
        this.f24381e = z10;
    }
}
