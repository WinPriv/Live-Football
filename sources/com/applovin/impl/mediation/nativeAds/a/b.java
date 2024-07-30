package com.applovin.impl.mediation.nativeAds.a;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.d;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes.dex */
public class b extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* renamed from: a, reason: collision with root package name */
    private final int f18384a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxNativeAdLoader f18385b;

    /* renamed from: c, reason: collision with root package name */
    private final Queue<MaxAd> f18386c = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f18387d = false;

    /* renamed from: e, reason: collision with root package name */
    private final Object f18388e = new Object();
    private a f;

    /* loaded from: classes.dex */
    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public b(String str, int i10, Context context, a aVar) {
        this.f18384a = i10;
        this.f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(str, context);
        this.f18385b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, d.a.NATIVE_AD_PLACER);
    }

    public void a() {
        this.f = null;
        e();
        this.f18385b.destroy();
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f18388e) {
            if (!this.f18386c.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public void c() {
        synchronized (this.f18388e) {
            if (!this.f18387d && this.f18386c.size() < this.f18384a) {
                this.f18387d = true;
                this.f18385b.loadAd();
            }
        }
    }

    public MaxAd d() {
        MaxAd maxAd;
        synchronized (this.f18388e) {
            maxAd = null;
            while (!this.f18386c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                maxAd = this.f18386c.remove();
            }
            c();
        }
        return maxAd;
    }

    public void e() {
        synchronized (this.f18388e) {
            Iterator<MaxAd> it = this.f18386c.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            this.f18386c.clear();
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f18388e) {
            this.f18386c.add(maxAd);
            this.f18387d = false;
            c();
        }
        a aVar = this.f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }

    public void a(MaxAd maxAd) {
        this.f18385b.destroy(maxAd);
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f18385b.render(maxNativeAdView, maxAd);
    }
}
