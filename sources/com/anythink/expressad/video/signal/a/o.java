package com.anythink.expressad.video.signal.a;

import android.app.Activity;
import com.anythink.expressad.video.module.AnythinkContainerView;

/* loaded from: classes.dex */
public final class o extends e {

    /* renamed from: n, reason: collision with root package name */
    private Activity f11947n;
    private AnythinkContainerView o;

    private o(Activity activity, AnythinkContainerView anythinkContainerView) {
        this.f11947n = activity;
        this.o = anythinkContainerView;
    }

    @Override // com.anythink.expressad.video.signal.a.e, com.anythink.expressad.video.signal.g
    public final void a(int i10, String str) {
        Activity activity;
        super.a(i10, str);
        int i11 = 1;
        if (i10 != 1) {
            if (i10 == 2 && (activity = this.f11947n) != null) {
                activity.finish();
                return;
            }
            return;
        }
        if (this.o != null) {
            try {
                i11 = Integer.valueOf(str).intValue();
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.o.showVideoClickView(i11);
        }
    }
}
