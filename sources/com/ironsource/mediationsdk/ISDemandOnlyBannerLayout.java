package com.ironsource.mediationsdk;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyBannerListener;

/* loaded from: classes2.dex */
public class ISDemandOnlyBannerLayout extends FrameLayout {
    public m mListenerWrapper;

    /* renamed from: s, reason: collision with root package name */
    public View f24806s;

    /* renamed from: t, reason: collision with root package name */
    public ISBannerSize f24807t;

    /* renamed from: u, reason: collision with root package name */
    public String f24808u;

    /* renamed from: v, reason: collision with root package name */
    public Activity f24809v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f24810w;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ View f24811s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ FrameLayout.LayoutParams f24812t;

        public a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f24811s = view;
            this.f24812t = layoutParams;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = ISDemandOnlyBannerLayout.this;
            iSDemandOnlyBannerLayout.removeAllViews();
            View view = this.f24811s;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            iSDemandOnlyBannerLayout.f24806s = view;
            iSDemandOnlyBannerLayout.addView(view, 0, this.f24812t);
        }
    }

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f24810w = false;
        this.f24809v = activity;
        this.f24807t = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
        this.mListenerWrapper = new m();
    }

    public Activity getActivity() {
        return this.f24809v;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return this.mListenerWrapper.f25591a;
    }

    public View getBannerView() {
        return this.f24806s;
    }

    public final m getListener() {
        return this.mListenerWrapper;
    }

    public String getPlacementName() {
        return this.f24808u;
    }

    public ISBannerSize getSize() {
        return this.f24807t;
    }

    public boolean isDestroyed() {
        return this.f24810w;
    }

    public void removeBannerListener() {
        IronLog.API.info("");
        this.mListenerWrapper.f25591a = null;
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info("");
        this.mListenerWrapper.f25591a = iSDemandOnlyBannerListener;
    }

    public void setPlacementName(String str) {
        this.f24808u = str;
    }
}
