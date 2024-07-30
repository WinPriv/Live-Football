package com.anythink.expressad.video.bt.module.b;

import a3.l;
import com.anythink.expressad.foundation.h.o;

/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11358a = "RewardVideoListener";

    @Override // com.anythink.expressad.video.bt.module.b.g
    public final void a(String str) {
        l.C(str, "onVideoLoadFail:", f11358a);
    }

    @Override // com.anythink.expressad.video.bt.module.b.g
    public final void b(String str) {
        l.C(str, "onShowFail:", f11358a);
    }

    @Override // com.anythink.expressad.video.bt.module.b.g
    public final void c() {
        o.a(f11358a, "onAdShow");
    }

    @Override // com.anythink.expressad.video.bt.module.b.g
    public final void d() {
        o.a(f11358a, "onVideoAdClicked:");
    }

    @Override // com.anythink.expressad.video.bt.module.b.g
    public final void e() {
        o.a(f11358a, "onEndcardShow: ");
    }

    @Override // com.anythink.expressad.video.bt.module.b.g
    public final void f() {
        o.a(f11358a, "onVideoComplete: ");
    }

    @Override // com.anythink.expressad.video.bt.module.b.g
    public final void a() {
        o.a(f11358a, "onLoadSuccess:");
    }

    @Override // com.anythink.expressad.video.bt.module.b.g
    public final void b() {
        o.a(f11358a, "onVideoLoadSuccess:");
    }

    @Override // com.anythink.expressad.video.bt.module.b.g
    public final void a(boolean z10, String str, float f) {
        o.a(f11358a, "onAdClose:" + z10 + ",RewardName:" + str + ",rewardAmout:" + f);
    }
}
