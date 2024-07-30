package com.anythink.expressad.video.signal.a;

import android.content.res.Configuration;
import com.applovin.impl.sdk.utils.JsonUtils;

/* loaded from: classes.dex */
public class f implements com.anythink.expressad.video.signal.i {

    /* renamed from: a, reason: collision with root package name */
    protected static final String f11918a = "js";

    @Override // com.anythink.expressad.video.signal.i
    public void a(String str) {
        a3.l.C(str, "triggerCloseBtn,state=", f11918a);
    }

    @Override // com.anythink.expressad.video.signal.i
    public void b(String str) {
        a3.l.C(str, "setOrientation,landscape=", f11918a);
    }

    @Override // com.anythink.expressad.video.signal.i, com.anythink.expressad.video.signal.h
    public void handlerPlayableException(String str) {
        a3.l.C(str, "handlerPlayableException，msg=", f11918a);
    }

    @Override // com.anythink.expressad.video.signal.h
    public void install(com.anythink.expressad.foundation.d.c cVar) {
        com.anythink.expressad.foundation.h.o.a(f11918a, "install:campaignEx=".concat(String.valueOf(cVar)));
    }

    @Override // com.anythink.expressad.video.signal.h
    public void notifyCloseBtn(int i10) {
        a3.l.u(i10, "notifyCloseBtn,state=", f11918a);
    }

    @Override // com.anythink.expressad.video.signal.h
    public void orientation(Configuration configuration) {
        com.anythink.expressad.foundation.h.o.a(f11918a, "orientation，config=".concat(String.valueOf(configuration)));
    }

    @Override // com.anythink.expressad.video.signal.h
    public void readyStatus(int i10) {
        a3.l.u(i10, "readyStatus,isReady=", f11918a);
    }

    @Override // com.anythink.expressad.video.signal.h
    public void toggleCloseBtn(int i10) {
        a3.l.u(i10, "toggleCloseBtn,state=", f11918a);
    }

    @Override // com.anythink.expressad.video.signal.h
    public void webviewshow() {
        com.anythink.expressad.foundation.h.o.a(f11918a, "webviewshow");
    }

    @Override // com.anythink.expressad.video.signal.i
    public String a() {
        com.anythink.expressad.foundation.h.o.a(f11918a, "getEndScreenInfo");
        return JsonUtils.EMPTY_JSON;
    }
}
