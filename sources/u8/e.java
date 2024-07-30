package u8;

import android.app.Activity;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.AdError;
import com.anythink.nativead.api.ATNativeAdView;
import com.anythink.nativead.api.ATNativeEventExListener;
import com.anythink.nativead.api.ATNativeNetworkListener;
import com.anythink.nativead.api.ATNativePrepareExInfo;
import com.anythink.nativead.api.NativeAd;
import com.hamkho.livefoot.Activities.MainActivity;
import m9.j;

/* compiled from: MainActivity.java */
/* loaded from: classes2.dex */
public final class e implements ATNativeNetworkListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ATNativeAdView f35796a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f35797b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f35798c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MainActivity f35799d;

    public e(MainActivity mainActivity, ATNativeAdView aTNativeAdView, Activity activity, j jVar) {
        this.f35799d = mainActivity;
        this.f35796a = aTNativeAdView;
        this.f35797b = activity;
        this.f35798c = jVar;
    }

    @Override // com.anythink.nativead.api.ATNativeNetworkListener
    public final void onNativeAdLoadFail(AdError adError) {
        this.f35796a.setVisibility(8);
    }

    @Override // com.anythink.nativead.api.ATNativeNetworkListener
    public final void onNativeAdLoaded() {
        j jVar = this.f35798c;
        MainActivity mainActivity = this.f35799d;
        NativeAd nativeAd = mainActivity.f21466u.getNativeAd();
        if (nativeAd != null) {
            NativeAd nativeAd2 = mainActivity.f21465t;
            if (nativeAd2 != null) {
                nativeAd2.destory();
            }
            mainActivity.f21465t = nativeAd;
            nativeAd.setNativeEventListener(new a());
            ATNativeAdView aTNativeAdView = this.f35796a;
            aTNativeAdView.removeAllViews();
            mainActivity.f21467v = null;
            try {
                mainActivity.f21467v = new ATNativePrepareExInfo();
                if (mainActivity.f21465t.isNativeExpress()) {
                    mainActivity.f21465t.renderAdContainer(aTNativeAdView, null);
                } else {
                    i9.d.a(this.f35797b, mainActivity.f21465t.getAdMaterial(), jVar, mainActivity.f21467v);
                    mainActivity.f21465t.renderAdContainer(aTNativeAdView, jVar.f33019a);
                }
            } catch (Exception unused) {
            }
            mainActivity.f21465t.prepare(aTNativeAdView, mainActivity.f21467v);
            aTNativeAdView.setVisibility(0);
        }
    }

    /* compiled from: MainActivity.java */
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
