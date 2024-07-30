package com.ironsource.mediationsdk;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;

/* loaded from: classes2.dex */
public class IronSourceBannerLayout extends FrameLayout {

    /* renamed from: s, reason: collision with root package name */
    public View f24816s;

    /* renamed from: t, reason: collision with root package name */
    public ISBannerSize f24817t;

    /* renamed from: u, reason: collision with root package name */
    public String f24818u;

    /* renamed from: v, reason: collision with root package name */
    public Activity f24819v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f24820w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f24821x;
    public a y;

    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z10);
    }

    public IronSourceBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f24820w = false;
        this.f24821x = false;
        this.f24819v = activity;
        this.f24817t = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public final IronSourceBannerLayout a() {
        IronSourceBannerLayout ironSourceBannerLayout = new IronSourceBannerLayout(this.f24819v, this.f24817t);
        ironSourceBannerLayout.setBannerListener(C1424n.a().f25735d);
        ironSourceBannerLayout.setLevelPlayBannerListener(C1424n.a().f25736e);
        ironSourceBannerLayout.setPlacementName(this.f24818u);
        return ironSourceBannerLayout;
    }

    public Activity getActivity() {
        return this.f24819v;
    }

    public BannerListener getBannerListener() {
        return C1424n.a().f25735d;
    }

    public View getBannerView() {
        return this.f24816s;
    }

    public LevelPlayBannerListener getLevelPlayBannerListener() {
        return C1424n.a().f25736e;
    }

    public String getPlacementName() {
        return this.f24818u;
    }

    public ISBannerSize getSize() {
        return this.f24817t;
    }

    public a getWindowFocusChangedListener() {
        return this.y;
    }

    public boolean isDestroyed() {
        return this.f24820w;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        a aVar = this.y;
        if (aVar != null) {
            aVar.a(z10);
        }
    }

    public void removeBannerListener() {
        IronLog.API.info("");
        C1424n.a().f25735d = null;
        C1424n.a().f25736e = null;
    }

    public void setBannerListener(BannerListener bannerListener) {
        IronLog.API.info("");
        C1424n.a().f25735d = bannerListener;
    }

    public void setLevelPlayBannerListener(LevelPlayBannerListener levelPlayBannerListener) {
        IronLog.API.info("");
        C1424n.a().f25736e = levelPlayBannerListener;
    }

    public void setPlacementName(String str) {
        this.f24818u = str;
    }

    public void setWindowFocusChangedListener(a aVar) {
        this.y = aVar;
    }
}
