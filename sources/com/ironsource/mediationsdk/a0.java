package com.ironsource.mediationsdk;

import android.view.View;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public final class a0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ IronSourceError f25071s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f25072t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ IronSourceBannerLayout f25073u;

    public a0(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError, boolean z10) {
        this.f25073u = ironSourceBannerLayout;
        this.f25071s = ironSourceError;
        this.f25072t = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1424n a10;
        boolean z10;
        IronSourceBannerLayout ironSourceBannerLayout = this.f25073u;
        boolean z11 = ironSourceBannerLayout.f24821x;
        IronSourceError ironSourceError = this.f25071s;
        if (z11) {
            a10 = C1424n.a();
            z10 = true;
        } else {
            try {
                View view = ironSourceBannerLayout.f24816s;
                if (view != null) {
                    ironSourceBannerLayout.removeView(view);
                    ironSourceBannerLayout.f24816s = null;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            a10 = C1424n.a();
            z10 = this.f25072t;
        }
        a10.a(ironSourceError, z10);
    }
}
