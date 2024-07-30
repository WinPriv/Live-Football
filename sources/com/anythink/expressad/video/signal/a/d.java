package com.anythink.expressad.video.signal.a;

import android.content.res.Configuration;

/* loaded from: classes.dex */
public class d implements com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h {

    /* renamed from: j, reason: collision with root package name */
    protected static final String f11916j = "DefaultJSContainerModule";

    @Override // com.anythink.expressad.video.signal.e
    public boolean endCardShowing() {
        com.anythink.expressad.foundation.h.o.a(f11916j, "endCardShowing");
        return true;
    }

    @Override // com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h
    public void handlerPlayableException(String str) {
        a3.l.C(str, "handlerPlayableException ,msg=", f11916j);
    }

    @Override // com.anythink.expressad.video.signal.e
    public void hideAlertWebview() {
        com.anythink.expressad.foundation.h.o.a(f11916j, "hideAlertWebview ,msg=");
    }

    @Override // com.anythink.expressad.video.signal.h
    public void install(com.anythink.expressad.foundation.d.c cVar) {
        com.anythink.expressad.foundation.h.o.a(f11916j, "install ,campaign=".concat(String.valueOf(cVar)));
    }

    @Override // com.anythink.expressad.video.signal.e
    public void ivRewardAdsWithoutVideo(String str) {
        com.anythink.expressad.foundation.h.o.a(f11916j, "ivRewardAdsWithoutVideo,params=");
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean miniCardLoaded() {
        com.anythink.expressad.foundation.h.o.a(f11916j, "miniCardLoaded");
        return false;
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean miniCardShowing() {
        com.anythink.expressad.foundation.h.o.a(f11916j, "miniCardShowing");
        return false;
    }

    @Override // com.anythink.expressad.video.signal.h
    public void notifyCloseBtn(int i10) {
        a3.l.u(i10, "notifyCloseBtn:state = ", f11916j);
    }

    @Override // com.anythink.expressad.video.signal.h
    public void orientation(Configuration configuration) {
        com.anythink.expressad.foundation.h.o.a(f11916j, "orientation ,config=".concat(String.valueOf(configuration)));
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(com.anythink.expressad.video.signal.factory.b bVar) {
        com.anythink.expressad.foundation.h.o.a(f11916j, "preLoadData");
    }

    @Override // com.anythink.expressad.video.signal.e, com.anythink.expressad.video.signal.h
    public void readyStatus(int i10) {
        a3.l.u(i10, "readyStatus:isReady=", f11916j);
    }

    @Override // com.anythink.expressad.video.signal.e
    public void resizeMiniCard(int i10, int i11, int i12) {
        StringBuilder r10 = a3.l.r("showMiniCard width = ", i10, " height = ", i11, " radius = ");
        r10.append(i12);
        com.anythink.expressad.foundation.h.o.a(f11916j, r10.toString());
    }

    @Override // com.anythink.expressad.video.signal.e
    public boolean showAlertWebView() {
        com.anythink.expressad.foundation.h.o.a(f11916j, "showAlertWebView ,msg=");
        return false;
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showEndcard(int i10) {
        a3.l.u(i10, "showEndcard,type=", f11916j);
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showMiniCard(int i10, int i11, int i12, int i13, int i14) {
        StringBuilder r10 = a3.l.r("showMiniCard top = ", i10, " left = ", i11, " width = ");
        e0.i.n(r10, i12, " height = ", i13, " radius = ");
        r10.append(i14);
        com.anythink.expressad.foundation.h.o.a(f11916j, r10.toString());
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showPlayableView() {
        com.anythink.expressad.foundation.h.o.a(f11916j, "showPlayableView");
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showVideoClickView(int i10) {
        a3.l.u(i10, "showVideoClickView:", f11916j);
    }

    @Override // com.anythink.expressad.video.signal.e
    public void showVideoEndCover() {
        com.anythink.expressad.foundation.h.o.a(f11916j, "showVideoEndCover");
    }

    @Override // com.anythink.expressad.video.signal.h
    public void toggleCloseBtn(int i10) {
        a3.l.u(i10, "toggleCloseBtn:state=", f11916j);
    }

    @Override // com.anythink.expressad.video.signal.h
    public void webviewshow() {
        com.anythink.expressad.foundation.h.o.a(f11916j, "webviewshow");
    }

    @Override // com.anythink.expressad.video.signal.e
    public void configurationChanged(int i10, int i11, int i12) {
    }
}
