package b9;

import android.app.Activity;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.AdError;
import com.anythink.nativead.api.ATNativeAdView;
import com.anythink.nativead.api.ATNativeEventExListener;
import com.anythink.nativead.api.ATNativeNetworkListener;
import com.anythink.nativead.api.ATNativePrepareExInfo;
import com.anythink.nativead.api.NativeAd;
import com.hamkho.livefoot.Activities.SoccerLive.ChannelDetailActivity;

/* compiled from: ChannelDetailActivity.java */
/* loaded from: classes2.dex */
public final class g implements ATNativeNetworkListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ATNativeAdView f3143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f3144b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m9.j f3145c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ChannelDetailActivity f3146d;

    public g(ChannelDetailActivity channelDetailActivity, ATNativeAdView aTNativeAdView, Activity activity, m9.j jVar) {
        this.f3146d = channelDetailActivity;
        this.f3143a = aTNativeAdView;
        this.f3144b = activity;
        this.f3145c = jVar;
    }

    @Override // com.anythink.nativead.api.ATNativeNetworkListener
    public final void onNativeAdLoadFail(AdError adError) {
        this.f3143a.setVisibility(8);
    }

    @Override // com.anythink.nativead.api.ATNativeNetworkListener
    public final void onNativeAdLoaded() {
        m9.j jVar = this.f3145c;
        ChannelDetailActivity channelDetailActivity = this.f3146d;
        NativeAd nativeAd = channelDetailActivity.f21474w.getNativeAd();
        if (nativeAd != null) {
            NativeAd nativeAd2 = channelDetailActivity.f21473v;
            if (nativeAd2 != null) {
                nativeAd2.destory();
            }
            channelDetailActivity.f21473v = nativeAd;
            nativeAd.setNativeEventListener(new a());
            ATNativeAdView aTNativeAdView = this.f3143a;
            aTNativeAdView.removeAllViews();
            channelDetailActivity.f21475x = null;
            try {
                channelDetailActivity.f21475x = new ATNativePrepareExInfo();
                if (channelDetailActivity.f21473v.isNativeExpress()) {
                    channelDetailActivity.f21473v.renderAdContainer(aTNativeAdView, null);
                } else {
                    i9.d.a(this.f3144b, channelDetailActivity.f21473v.getAdMaterial(), jVar, channelDetailActivity.f21475x);
                    channelDetailActivity.f21473v.renderAdContainer(aTNativeAdView, jVar.f33019a);
                }
            } catch (Exception unused) {
            }
            channelDetailActivity.f21473v.prepare(aTNativeAdView, channelDetailActivity.f21475x);
            aTNativeAdView.setVisibility(0);
        }
    }

    /* compiled from: ChannelDetailActivity.java */
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
