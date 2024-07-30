package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import android.os.Handler;
import com.huawei.hms.ads.gl;
import com.iab.omid.library.ironsrc.internal.d;
import com.iab.omid.library.ironsrc.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class h implements com.iab.omid.library.ironsrc.devicevolume.c, d.a {
    private static h f;

    /* renamed from: a, reason: collision with root package name */
    private float f24398a = gl.Code;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.devicevolume.e f24399b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.devicevolume.b f24400c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.devicevolume.d f24401d;

    /* renamed from: e, reason: collision with root package name */
    private c f24402e;

    public h(com.iab.omid.library.ironsrc.devicevolume.e eVar, com.iab.omid.library.ironsrc.devicevolume.b bVar) {
        this.f24399b = eVar;
        this.f24400c = bVar;
    }

    private c a() {
        if (this.f24402e == null) {
            this.f24402e = c.c();
        }
        return this.f24402e;
    }

    public static h c() {
        if (f == null) {
            f = new h(new com.iab.omid.library.ironsrc.devicevolume.e(), new com.iab.omid.library.ironsrc.devicevolume.b());
        }
        return f;
    }

    public float b() {
        return this.f24398a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f24401d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f24401d.d();
    }

    @Override // com.iab.omid.library.ironsrc.devicevolume.c
    public void a(float f10) {
        this.f24398a = f10;
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f24401d = this.f24399b.a(new Handler(), context, this.f24400c.a(), this);
    }

    @Override // com.iab.omid.library.ironsrc.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
