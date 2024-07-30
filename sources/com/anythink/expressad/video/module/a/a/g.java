package com.anythink.expressad.video.module.a.a;

import com.anythink.expressad.video.module.AnythinkClickMiniCardView;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: a, reason: collision with root package name */
    private AnythinkClickMiniCardView f11884a;

    public g(AnythinkClickMiniCardView anythinkClickMiniCardView, com.anythink.expressad.video.module.a.a aVar) {
        super(aVar);
        this.f11884a = anythinkClickMiniCardView;
    }

    @Override // com.anythink.expressad.video.module.a.a.i, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public final void a(int i10, Object obj) {
        boolean z10 = false;
        switch (i10) {
            case 100:
                AnythinkClickMiniCardView anythinkClickMiniCardView = this.f11884a;
                if (anythinkClickMiniCardView != null) {
                    anythinkClickMiniCardView.webviewshow();
                    AnythinkClickMiniCardView anythinkClickMiniCardView2 = this.f11884a;
                    anythinkClickMiniCardView2.onSelfConfigurationChanged(anythinkClickMiniCardView2.getResources().getConfiguration());
                    break;
                }
                break;
            case 101:
            case 102:
                z10 = true;
                break;
            case 103:
                i10 = 107;
                break;
        }
        if (!z10) {
            super.a(i10, obj);
        }
    }
}
