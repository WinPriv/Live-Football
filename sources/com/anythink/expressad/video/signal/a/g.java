package com.anythink.expressad.video.signal.a;

import com.applovin.impl.sdk.utils.JsonUtils;

/* loaded from: classes.dex */
public class g implements com.anythink.expressad.video.signal.j {

    /* renamed from: s, reason: collision with root package name */
    protected static final String f11919s = "DefaultJSVideoModule";

    @Override // com.anythink.expressad.video.signal.j
    public void alertWebViewShowed() {
        com.anythink.expressad.foundation.h.o.a(f11919s, "alertWebViewShowed:");
    }

    @Override // com.anythink.expressad.video.signal.j
    public void closeVideoOperate(int i10, int i11) {
        com.anythink.expressad.foundation.h.o.a(f11919s, "closeOperte:close=" + i10 + "closeViewVisible=" + i11);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void dismissAllAlert() {
        com.anythink.expressad.foundation.h.o.a(f11919s, "dismissAllAlert");
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewHeight() {
        return 0;
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewLeft() {
        return 0;
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewRadius() {
        return 0;
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewTop() {
        return 0;
    }

    @Override // com.anythink.expressad.video.signal.j
    public int getBorderViewWidth() {
        return 0;
    }

    @Override // com.anythink.expressad.video.signal.j
    public String getCurrentProgress() {
        com.anythink.expressad.foundation.h.o.a(f11919s, "getCurrentProgress");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void hideAlertView(int i10) {
        com.anythink.expressad.foundation.h.o.a(f11919s, "hideAlertView:");
    }

    @Override // com.anythink.expressad.video.signal.j
    public boolean isH5Canvas() {
        return false;
    }

    @Override // com.anythink.expressad.video.signal.j
    public void notifyCloseBtn(int i10) {
        a3.l.u(i10, "notifyCloseBtn:", f11919s);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void progressBarOperate(int i10) {
        a3.l.u(i10, "progressBarOperate:progressViewVisible=", f11919s);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void progressOperate(int i10, int i11) {
        com.anythink.expressad.foundation.h.o.a(f11919s, "progressOperate:progress=" + i10 + "progressViewVisible=" + i11);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setCover(boolean z10) {
        com.anythink.expressad.foundation.h.o.a(f11919s, "setCover:".concat(String.valueOf(z10)));
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setInstallDialogState(boolean z10) {
        com.anythink.expressad.foundation.h.o.a(f11919s, "setInstallDialogState");
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setMiniEndCardState(boolean z10) {
        com.anythink.expressad.foundation.h.o.a(f11919s, "setMiniEndCardState");
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setScaleFitXY(int i10) {
        a3.l.u(i10, "setScaleFitXY:", f11919s);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void setVisible(int i10) {
        a3.l.u(i10, "setVisible:", f11919s);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void showAlertView() {
        com.anythink.expressad.foundation.h.o.a(f11919s, "showAlertView:");
    }

    @Override // com.anythink.expressad.video.signal.j
    public void showIVRewardAlertView(String str) {
        com.anythink.expressad.foundation.h.o.a(f11919s, "showAlertView:");
    }

    @Override // com.anythink.expressad.video.signal.j
    public void showVideoLocation(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        StringBuilder r10 = a3.l.r("showVideoLocation:marginTop=", i10, ",marginLeft=", i11, ",width=");
        e0.i.n(r10, i12, ",height=", i13, ",radius=");
        e0.i.n(r10, i14, ",borderTop=", i15, ",borderTop=");
        e0.i.n(r10, i15, ",borderLeft=", i16, ",borderWidth=");
        r10.append(i17);
        r10.append(",borderHeight=");
        r10.append(i18);
        com.anythink.expressad.foundation.h.o.a(f11919s, r10.toString());
    }

    @Override // com.anythink.expressad.video.signal.j
    public void soundOperate(int i10, int i11, String str) {
        StringBuilder r10 = a3.l.r("soundOperate:mute=", i10, ",soundViewVisible=", i11, ",pt=");
        r10.append(str);
        com.anythink.expressad.foundation.h.o.a(f11919s, r10.toString());
    }

    @Override // com.anythink.expressad.video.signal.j
    public void videoOperate(int i10) {
        a3.l.u(i10, "videoOperate:", f11919s);
    }

    @Override // com.anythink.expressad.video.signal.j
    public void soundOperate(int i10, int i11) {
        com.anythink.expressad.foundation.h.o.a(f11919s, "soundOperate:mute=" + i10 + ",soundViewVisible=" + i11);
    }
}
