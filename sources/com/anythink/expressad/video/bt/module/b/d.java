package com.anythink.expressad.video.bt.module.b;

import com.anythink.expressad.foundation.h.o;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11360a = "H5ShowRewardListener";

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.expressad.video.bt.module.a.b f11361b;

    /* renamed from: c, reason: collision with root package name */
    private String f11362c;

    public d(com.anythink.expressad.video.bt.module.a.b bVar, String str) {
        this.f11361b = bVar;
        this.f11362c = str;
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a() {
        if (this.f11361b != null) {
            o.a(f11360a, "onAdShow");
            this.f11361b.a(this.f11362c);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void b() {
        if (this.f11361b != null) {
            o.a(f11360a, "onVideoComplete");
            this.f11361b.b(this.f11362c);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void c() {
        if (this.f11361b != null) {
            o.a(f11360a, "onEndcardShow");
            this.f11361b.c(this.f11362c);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a(boolean z10, com.anythink.expressad.videocommon.c.c cVar) {
        if (this.f11361b != null) {
            o.a(f11360a, "onAdClose");
            this.f11361b.a(this.f11362c, z10, cVar);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a(String str) {
        if (this.f11361b != null) {
            o.a(f11360a, "onShowFail");
            this.f11361b.a(this.f11362c, str);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        if (this.f11361b != null) {
            o.a(f11360a, "onVideoAdClicked");
            this.f11361b.a(this.f11362c, cVar);
        }
    }
}
