package t8;

import android.app.Activity;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.AdError;
import com.anythink.nativead.api.ATNativeAdView;
import com.anythink.nativead.api.ATNativeEventExListener;
import com.anythink.nativead.api.ATNativeNetworkListener;
import com.anythink.nativead.api.ATNativePrepareExInfo;
import com.anythink.nativead.api.NativeAd;

/* compiled from: AdsManager.java */
/* loaded from: classes2.dex */
public final class f implements ATNativeNetworkListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ATNativeAdView f35582a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f35583b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m9.j f35584c;

    public f(Activity activity, ATNativeAdView aTNativeAdView, m9.j jVar) {
        this.f35582a = aTNativeAdView;
        this.f35583b = activity;
        this.f35584c = jVar;
    }

    @Override // com.anythink.nativead.api.ATNativeNetworkListener
    public final void onNativeAdLoadFail(AdError adError) {
        this.f35582a.setVisibility(8);
    }

    @Override // com.anythink.nativead.api.ATNativeNetworkListener
    public final void onNativeAdLoaded() {
        m9.j jVar = this.f35584c;
        NativeAd nativeAd = t8.a.f35562i.getNativeAd();
        if (nativeAd != null) {
            NativeAd nativeAd2 = t8.a.f35561h;
            if (nativeAd2 != null) {
                nativeAd2.destory();
            }
            t8.a.f35561h = nativeAd;
            nativeAd.setNativeEventListener(new a());
            ATNativeAdView aTNativeAdView = this.f35582a;
            aTNativeAdView.removeAllViews();
            t8.a.f35563j = null;
            try {
                t8.a.f35563j = new ATNativePrepareExInfo();
                if (t8.a.f35561h.isNativeExpress()) {
                    t8.a.f35561h.renderAdContainer(aTNativeAdView, null);
                } else {
                    i9.d.a(this.f35583b, t8.a.f35561h.getAdMaterial(), jVar, t8.a.f35563j);
                    t8.a.f35561h.renderAdContainer(aTNativeAdView, jVar.f33019a);
                }
            } catch (Exception unused) {
            }
            t8.a.f35561h.prepare(aTNativeAdView, t8.a.f35563j);
            aTNativeAdView.setVisibility(0);
        }
    }

    /* compiled from: AdsManager.java */
    /* loaded from: classes2.dex */
    public class a implements ATNativeEventExListener {
        @Override // com.anythink.nativead.api.ATNativeEventListener
        public final void onAdVideoEnd(ATNativeAdView aTNativeAdView) {
        }

        @Override // com.anythink.nativead.api.ATNativeEventListener
        public final void onAdVideoStart(ATNativeAdView aTNativeAdView) {
        }

        @Override // com.anythink.nativead.api.ATNativeEventListener
        public final void onAdClicked(ATNativeAdView aTNativeAdView, ATAdInfo aTAdInfo) {
        }

        @Override // com.anythink.nativead.api.ATNativeEventListener
        public final void onAdImpressed(ATNativeAdView aTNativeAdView, ATAdInfo aTAdInfo) {
        }

        @Override // com.anythink.nativead.api.ATNativeEventListener
        public final void onAdVideoProgress(ATNativeAdView aTNativeAdView, int i10) {
        }

        @Override // com.anythink.nativead.api.ATNativeEventExListener
        public final void onDeeplinkCallback(ATNativeAdView aTNativeAdView, ATAdInfo aTAdInfo, boolean z10) {
        }
    }
}
