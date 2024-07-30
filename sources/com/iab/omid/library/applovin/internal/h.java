package com.iab.omid.library.applovin.internal;

import android.content.Context;
import android.os.Handler;
import com.huawei.hms.ads.gl;
import com.iab.omid.library.applovin.internal.d;
import com.iab.omid.library.applovin.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class h implements com.iab.omid.library.applovin.devicevolume.c, d.a {
    private static h f;

    /* renamed from: a, reason: collision with root package name */
    private float f24280a = gl.Code;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.e f24281b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.b f24282c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.devicevolume.d f24283d;

    /* renamed from: e, reason: collision with root package name */
    private c f24284e;

    public h(com.iab.omid.library.applovin.devicevolume.e eVar, com.iab.omid.library.applovin.devicevolume.b bVar) {
        this.f24281b = eVar;
        this.f24282c = bVar;
    }

    private c a() {
        if (this.f24284e == null) {
            this.f24284e = c.c();
        }
        return this.f24284e;
    }

    public static h c() {
        if (f == null) {
            f = new h(new com.iab.omid.library.applovin.devicevolume.e(), new com.iab.omid.library.applovin.devicevolume.b());
        }
        return f;
    }

    public float b() {
        return this.f24280a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f24283d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f24283d.d();
    }

    @Override // com.iab.omid.library.applovin.devicevolume.c
    public void a(float f10) {
        this.f24280a = f10;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f24283d = this.f24281b.a(new Handler(), context, this.f24282c.a(), this);
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
