package com.iab.omid.library.vungle.b;

import android.content.Context;
import android.os.Handler;
import com.huawei.hms.ads.gl;
import com.iab.omid.library.vungle.b.b;
import com.iab.omid.library.vungle.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class f implements com.iab.omid.library.vungle.a.c, b.a {

    /* renamed from: a, reason: collision with root package name */
    private static f f24505a;

    /* renamed from: b, reason: collision with root package name */
    private float f24506b = gl.Code;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.vungle.a.e f24507c;

    /* renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.vungle.a.b f24508d;

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.vungle.a.d f24509e;
    private a f;

    public f(com.iab.omid.library.vungle.a.e eVar, com.iab.omid.library.vungle.a.b bVar) {
        this.f24507c = eVar;
        this.f24508d = bVar;
    }

    public static f a() {
        if (f24505a == null) {
            f24505a = new f(new com.iab.omid.library.vungle.a.e(), new com.iab.omid.library.vungle.a.b());
        }
        return f24505a;
    }

    private a e() {
        if (this.f == null) {
            this.f = a.a();
        }
        return this.f;
    }

    public void b() {
        b.a().a(this);
        b.a().b();
        TreeWalker.getInstance().a();
        this.f24509e.a();
    }

    public void c() {
        TreeWalker.getInstance().b();
        b.a().c();
        this.f24509e.b();
    }

    public float d() {
        return this.f24506b;
    }

    @Override // com.iab.omid.library.vungle.a.c
    public void a(float f) {
        this.f24506b = f;
        Iterator<com.iab.omid.library.vungle.adsession.a> it = e().c().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f);
        }
    }

    public void a(Context context) {
        this.f24509e = this.f24507c.a(new Handler(), context, this.f24508d.a(), this);
    }

    @Override // com.iab.omid.library.vungle.b.b.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().a();
        } else {
            TreeWalker.getInstance().c();
        }
    }
}
