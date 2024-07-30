package com.anythink.expressad.video.bt.module.b;

import a3.l;
import com.anythink.expressad.foundation.h.o;

/* loaded from: classes.dex */
public class c implements h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11359a = "ShowRewardListener";

    @Override // com.anythink.expressad.video.bt.module.b.h
    public void a(String str) {
        l.C(str, "onShowFail:", f11359a);
    }

    @Override // com.anythink.expressad.video.bt.module.b.h
    public void b() {
        o.a(f11359a, "onVideoComplete: ");
    }

    @Override // com.anythink.expressad.video.bt.module.b.h
    public void c() {
        o.a(f11359a, "onEndcardShow: ");
    }

    @Override // com.anythink.expressad.video.bt.module.b.h
    public void a() {
        o.a(f11359a, "onAdShow");
    }

    @Override // com.anythink.expressad.video.bt.module.b.h
    public void a(boolean z10, com.anythink.expressad.videocommon.c.c cVar) {
        o.a(f11359a, "onAdClose:isCompleteView:" + z10 + ",reward:" + cVar);
    }

    @Override // com.anythink.expressad.video.bt.module.b.h
    public void a(com.anythink.expressad.foundation.d.c cVar) {
        o.a(f11359a, "onVideoAdClicked:");
    }

    @Override // com.anythink.expressad.video.bt.module.b.h
    public void a(boolean z10, int i10) {
        o.a(f11359a, "onAdCloseWithIVReward: " + z10 + "  " + i10);
    }
}
