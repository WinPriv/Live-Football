package com.anythink.expressad.video.signal.a;

import android.app.Activity;
import com.anythink.expressad.video.bt.module.AnythinkBTContainer;

/* loaded from: classes.dex */
public final class i extends b {

    /* renamed from: a, reason: collision with root package name */
    private Activity f11928a;

    /* renamed from: d, reason: collision with root package name */
    private AnythinkBTContainer f11929d;

    public i(Activity activity, AnythinkBTContainer anythinkBTContainer) {
        this.f11928a = activity;
        this.f11929d = anythinkBTContainer;
    }

    @Override // com.anythink.expressad.video.signal.a.b, com.anythink.expressad.video.signal.d
    public final void click(int i10, String str) {
        super.click(i10, str);
        AnythinkBTContainer anythinkBTContainer = this.f11929d;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.click(i10, str);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.b, com.anythink.expressad.video.signal.d
    public final void handlerH5Exception(int i10, String str) {
        super.handlerH5Exception(i10, str);
        AnythinkBTContainer anythinkBTContainer = this.f11929d;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.handlerH5Exception(i10, str);
        }
    }

    @Override // com.anythink.expressad.video.signal.a.b, com.anythink.expressad.video.signal.b
    public final void reactDeveloper(Object obj, String str) {
        super.reactDeveloper(obj, str);
        AnythinkBTContainer anythinkBTContainer = this.f11929d;
        if (anythinkBTContainer != null) {
            anythinkBTContainer.reactDeveloper(obj, str);
        }
    }
}
