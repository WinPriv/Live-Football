package com.applovin.mediation.nativeAds.adPlacer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.nativeAds.a.a;
import com.applovin.impl.mediation.nativeAds.a.b;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MaxAdPlacer implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private AppLovinSdkUtils.Size f19660a;

    /* renamed from: b, reason: collision with root package name */
    private MaxNativeAdViewBinder f19661b;

    /* renamed from: c, reason: collision with root package name */
    private final a f19662c;

    /* renamed from: d, reason: collision with root package name */
    private final b f19663d;

    /* renamed from: e, reason: collision with root package name */
    private Listener f19664e;
    protected final y logger;
    protected final p sdk;

    /* loaded from: classes.dex */
    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i10);

        void onAdRemoved(int i10);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    public void clearAds() {
        a(this.f19662c.b(), new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.1
            @Override // java.lang.Runnable
            public void run() {
                y yVar = MaxAdPlacer.this.logger;
                if (y.a()) {
                    MaxAdPlacer.this.logger.b("MaxAdPlacer", "Clearing all cached ads");
                }
                MaxAdPlacer.this.f19662c.c();
                MaxAdPlacer.this.f19663d.e();
            }
        });
    }

    public Collection<Integer> clearTrailingAds(final int i10) {
        final Collection<Integer> d10 = this.f19662c.d(i10);
        if (!d10.isEmpty()) {
            a(d10, new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.2
                @Override // java.lang.Runnable
                public void run() {
                    y yVar = MaxAdPlacer.this.logger;
                    if (y.a()) {
                        MaxAdPlacer.this.logger.b("MaxAdPlacer", "Clearing trailing ads after position " + i10);
                    }
                    MaxAdPlacer.this.f19662c.a(d10);
                }
            });
        }
        return d10;
    }

    public void destroy() {
        if (y.a()) {
            this.logger.b("MaxAdPlacer", "Destroying ad placer");
        }
        clearAds();
        this.f19663d.a();
    }

    public long getAdItemId(int i10) {
        if (isFilledPosition(i10)) {
            return -System.identityHashCode(this.f19662c.c(i10));
        }
        return 0L;
    }

    public AppLovinSdkUtils.Size getAdSize(int i10, int i11) {
        boolean z10;
        int i12;
        double d10;
        int i13;
        if (isFilledPosition(i10)) {
            AppLovinSdkUtils.Size size = this.f19660a;
            if (size != AppLovinSdkUtils.Size.ZERO) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i12 = size.getWidth();
            } else {
                i12 = 360;
            }
            int min = Math.min(i12, i11);
            d dVar = (d) this.f19662c.c(i10);
            if ("small_template_1".equalsIgnoreCase(dVar.D())) {
                if (z10) {
                    i13 = this.f19660a.getHeight();
                } else {
                    i13 = 120;
                }
                return new AppLovinSdkUtils.Size(min, i13);
            }
            if (MaxNativeAdView.MEDIUM_TEMPLATE_1.equalsIgnoreCase(dVar.D())) {
                if (z10) {
                    d10 = this.f19660a.getWidth() / this.f19660a.getHeight();
                } else {
                    d10 = 1.2d;
                }
                return new AppLovinSdkUtils.Size(min, (int) (min / d10));
            }
            if (z10) {
                return this.f19660a;
            }
            if (dVar.C() != null) {
                View mainView = dVar.C().getMainView();
                return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i10) {
        return this.f19662c.e(i10);
    }

    public int getAdjustedPosition(int i10) {
        return this.f19662c.f(i10);
    }

    public int getOriginalPosition(int i10) {
        return this.f19662c.g(i10);
    }

    public void insertItem(int i10) {
        if (y.a()) {
            this.logger.b("MaxAdPlacer", "Inserting item at position: " + i10);
        }
        this.f19662c.h(i10);
    }

    public boolean isAdPosition(int i10) {
        return this.f19662c.a(i10);
    }

    public boolean isFilledPosition(int i10) {
        return this.f19662c.b(i10);
    }

    public void loadAds() {
        if (y.a()) {
            this.logger.b("MaxAdPlacer", "Loading ads");
        }
        this.f19663d.c();
    }

    public void moveItem(int i10, int i11) {
        this.f19662c.b(i10, i11);
    }

    @Override // com.applovin.impl.mediation.nativeAds.a.b.a
    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.f19664e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.impl.mediation.nativeAds.a.b.a
    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.f19664e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.impl.mediation.nativeAds.a.b.a
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        if (y.a()) {
            this.logger.e("MaxAdPlacer", "Native ad failed to load: " + maxError);
        }
    }

    @Override // com.applovin.impl.mediation.nativeAds.a.b.a
    public void onNativeAdLoaded() {
        if (y.a()) {
            this.logger.b("MaxAdPlacer", "Native ad enqueued");
        }
        a();
    }

    public void removeItem(final int i10) {
        List emptyList;
        if (isFilledPosition(i10)) {
            emptyList = Collections.singletonList(Integer.valueOf(i10));
        } else {
            emptyList = Collections.emptyList();
        }
        a(emptyList, new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.3
            @Override // java.lang.Runnable
            public void run() {
                y yVar = MaxAdPlacer.this.logger;
                if (y.a()) {
                    MaxAdPlacer.this.logger.b("MaxAdPlacer", "Removing item at position: " + i10);
                }
                MaxAdPlacer.this.f19662c.i(i10);
            }
        });
    }

    public void renderAd(int i10, ViewGroup viewGroup) {
        MaxAd c10 = this.f19662c.c(i10);
        if (c10 == null) {
            if (y.a()) {
                this.logger.b("MaxAdPlacer", "An ad is not available for position: " + i10);
                return;
            }
            return;
        }
        MaxNativeAdView C = ((d) c10).C();
        if (C != null) {
            if (y.a()) {
                this.logger.b("MaxAdPlacer", "Using pre-rendered ad at position: " + i10);
            }
        } else if (this.f19661b != null) {
            C = new MaxNativeAdView(this.f19661b, viewGroup.getContext());
            if (this.f19663d.a(C, c10)) {
                if (y.a()) {
                    this.logger.b("MaxAdPlacer", "Rendered ad at position: " + i10);
                }
            } else if (y.a()) {
                this.logger.e("MaxAdPlacer", "Unable to render ad at position: " + i10);
            }
        } else {
            if (y.a()) {
                this.logger.e("MaxAdPlacer", "Unable to render ad at position: " + i10 + ". If you're using a custom ad template, check that nativeAdViewBinder is set.");
                return;
            }
            return;
        }
        for (int childCount = viewGroup.getChildCount(); childCount >= 0; childCount--) {
            if (viewGroup.getChildAt(childCount) instanceof MaxNativeAdView) {
                viewGroup.removeViewAt(childCount);
            }
        }
        if (C.getParent() != null) {
            ((ViewGroup) C.getParent()).removeView(C);
        }
        viewGroup.addView(C, -1, -1);
    }

    public void setAdSize(int i10, int i11) {
        this.f19660a = new AppLovinSdkUtils.Size(i10, i11);
    }

    public void setListener(Listener listener) {
        this.f19664e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.f19661b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i10, int i11) {
        this.f19662c.a(i10, i11);
        if (i10 != -1 && i11 != -1) {
            a();
        }
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.f19660a = AppLovinSdkUtils.Size.ZERO;
        p pVar = appLovinSdk.coreSdk;
        this.sdk = pVar;
        y L = pVar.L();
        this.logger = L;
        this.f19662c = new a(maxAdPlacerSettings);
        this.f19663d = new b(maxAdPlacerSettings.getAdUnitId(), maxAdPlacerSettings.getMaxPreloadedAdCount(), context, this);
        if (y.a()) {
            L.b("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
        }
    }

    private void a() {
        int a10;
        while (this.f19663d.b() && (a10 = this.f19662c.a()) != -1) {
            if (y.a()) {
                this.logger.b("MaxAdPlacer", "Placing ad at position: " + a10);
            }
            this.f19662c.a(this.f19663d.d(), a10);
            Listener listener = this.f19664e;
            if (listener != null) {
                listener.onAdLoaded(a10);
            }
        }
    }

    private void a(Collection<Integer> collection, Runnable runnable) {
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            this.f19663d.a(this.f19662c.c(it.next().intValue()));
        }
        runnable.run();
        if (collection.isEmpty()) {
            return;
        }
        if (y.a()) {
            this.logger.b("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
        }
        if (this.f19664e != null) {
            Iterator<Integer> it2 = collection.iterator();
            while (it2.hasNext()) {
                this.f19664e.onAdRemoved(it2.next().intValue());
            }
        }
    }
}
