package com.anythink.expressad.video.signal.a;

import com.anythink.expressad.video.module.AnythinkVideoView;

/* loaded from: classes.dex */
public class e implements com.anythink.expressad.video.signal.g {

    /* renamed from: m, reason: collision with root package name */
    protected static final String f11917m = "DefaultJSNotifyProxy";

    @Override // com.anythink.expressad.video.signal.g
    public void a(int i10) {
        a3.l.u(i10, "onVideoStatusNotify:", f11917m);
    }

    @Override // com.anythink.expressad.video.signal.g
    public void a() {
        com.anythink.expressad.foundation.h.o.a(f11917m, "onSignalCommunication");
    }

    @Override // com.anythink.expressad.video.signal.g
    public void a(int i10, String str) {
        com.anythink.expressad.foundation.h.o.a(f11917m, "onClick:" + i10 + ",pt:" + str);
    }

    @Override // com.anythink.expressad.video.signal.g
    public void a(AnythinkVideoView.a aVar) {
        com.anythink.expressad.foundation.h.o.a(f11917m, "onProgressNotify:" + aVar.toString());
    }

    @Override // com.anythink.expressad.video.signal.g
    public void a(Object obj) {
        com.anythink.expressad.foundation.h.o.a(f11917m, "onWebviewShow:".concat(String.valueOf(obj)));
    }

    @Override // com.anythink.expressad.video.signal.g
    public void a(int i10, int i11, int i12, int i13) {
        com.anythink.expressad.foundation.h.o.a(f11917m, "showDataInfo");
    }
}
