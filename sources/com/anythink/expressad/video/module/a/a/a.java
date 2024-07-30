package com.anythink.expressad.video.module.a.a;

import android.app.Activity;

/* loaded from: classes.dex */
public final class a extends f {
    private com.anythink.expressad.foundation.d.c V;

    /* renamed from: a, reason: collision with root package name */
    private Activity f11879a;

    private a(Activity activity, com.anythink.expressad.foundation.d.c cVar) {
        this.f11879a = activity;
        this.V = cVar;
    }

    @Override // com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public final void a(int i10, Object obj) {
        Activity activity;
        super.a(i10, obj);
        if (i10 == 106 && (activity = this.f11879a) != null && this.V != null) {
            activity.finish();
        }
    }
}
