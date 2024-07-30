package com.anythink.expressad.video.signal.a;

import android.content.res.Configuration;

/* loaded from: classes.dex */
public class a implements com.anythink.expressad.video.signal.a {
    protected static final String f = "DefaultJSActivity";

    @Override // com.anythink.expressad.video.signal.a
    public void a(int i10) {
        a3.l.u(i10, "setSystemResume,isResume:", f);
    }

    @Override // com.anythink.expressad.video.signal.a
    public void b() {
        com.anythink.expressad.foundation.h.o.a(f, "DefaultJSActivity-onResume");
    }

    @Override // com.anythink.expressad.video.signal.a
    public void c() {
        com.anythink.expressad.foundation.h.o.a(f, "DefaultJSActivity-onDestory");
    }

    @Override // com.anythink.expressad.video.signal.a
    public final void d() {
        com.anythink.expressad.foundation.h.o.a(f, "DefaultJSActivity-onStop");
    }

    @Override // com.anythink.expressad.video.signal.a
    public final void e() {
        com.anythink.expressad.foundation.h.o.a(f, "DefaultJSActivity-onStart");
    }

    @Override // com.anythink.expressad.video.signal.a
    public final void f() {
        com.anythink.expressad.foundation.h.o.a(f, "DefaultJSActivity-onRestart");
    }

    @Override // com.anythink.expressad.video.signal.a
    public void g() {
        com.anythink.expressad.foundation.h.o.a(f, "DefaultJSActivity-onBackPressed");
    }

    @Override // com.anythink.expressad.video.signal.a
    public int h() {
        com.anythink.expressad.foundation.h.o.a(f, "isSystemResume");
        return 0;
    }

    @Override // com.anythink.expressad.video.signal.a
    public void a() {
        com.anythink.expressad.foundation.h.o.a(f, "DefaultJSActivity-onPause");
    }

    @Override // com.anythink.expressad.video.signal.a
    public void a(Configuration configuration) {
        com.anythink.expressad.foundation.h.o.a(f, "DefaultJSActivity-onConfigurationChanged:" + configuration.orientation);
    }
}
