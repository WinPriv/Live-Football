package com.applovin.mediation.hybridAds;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final p f19608a;

    /* loaded from: classes.dex */
    public static class a extends com.applovin.impl.sdk.utils.a {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.mediation.a.c f19609a;

        /* renamed from: b, reason: collision with root package name */
        private final p f19610b;

        /* renamed from: c, reason: collision with root package name */
        private final MaxAdapterListener f19611c;

        public a(com.applovin.impl.mediation.a.c cVar, p pVar, MaxAdapterListener maxAdapterListener) {
            this.f19609a = cVar;
            this.f19610b = pVar;
            this.f19611c = maxAdapterListener;
        }

        @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridMRecAdActivity) {
                com.applovin.impl.mediation.a.c cVar = this.f19609a;
                ((MaxHybridMRecAdActivity) activity).a(cVar, cVar.q(), this.f19610b, this.f19611c);
            }
        }

        @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridMRecAdActivity) && !activity.isChangingConfigurations() && this.f19609a.z().get()) {
                this.f19610b.w().b(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends com.applovin.impl.sdk.utils.a {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.mediation.a.c f19612a;

        /* renamed from: b, reason: collision with root package name */
        private final p f19613b;

        /* renamed from: c, reason: collision with root package name */
        private final MaxAdapterListener f19614c;

        public b(com.applovin.impl.mediation.a.c cVar, p pVar, MaxAdapterListener maxAdapterListener) {
            this.f19612a = cVar;
            this.f19613b = pVar;
            this.f19614c = maxAdapterListener;
        }

        @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridNativeAdActivity) {
                com.applovin.impl.mediation.a.c cVar = this.f19612a;
                ((MaxHybridNativeAdActivity) activity).a(cVar, cVar.getNativeAd(), this.f19613b, this.f19614c);
            }
        }

        @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridNativeAdActivity) && !activity.isChangingConfigurations() && this.f19612a.z().get()) {
                this.f19613b.w().b(this);
            }
        }
    }

    public d(p pVar) {
        this.f19608a = pVar;
    }

    public void a(com.applovin.impl.mediation.a.c cVar, Activity activity, MaxAdapterListener maxAdapterListener) {
        Utils.assertMainThread();
        if (activity == null) {
            activity = this.f19608a.w().a();
        }
        if (cVar.getNativeAd() != null) {
            this.f19608a.L();
            if (y.a()) {
                this.f19608a.L().b("MaxHybridAdService", "Showing fullscreen native ad...");
            }
            this.f19608a.w().a(new b(cVar, this.f19608a, maxAdapterListener));
            activity.startActivity(new Intent(activity, (Class<?>) MaxHybridNativeAdActivity.class));
            return;
        }
        if (cVar.q() != null) {
            this.f19608a.L();
            if (y.a()) {
                this.f19608a.L().b("MaxHybridAdService", "Showing fullscreen MREC ad...");
            }
            this.f19608a.w().a(new a(cVar, this.f19608a, maxAdapterListener));
            activity.startActivity(new Intent(activity, (Class<?>) MaxHybridMRecAdActivity.class));
            return;
        }
        if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
        } else {
            if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
                ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
                return;
            }
            throw new IllegalStateException("Failed to display hybrid ad: neither native nor adview ad");
        }
    }
}
