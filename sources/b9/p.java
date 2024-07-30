package b9;

import android.app.Activity;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.AdError;
import com.anythink.nativead.api.ATNativeAdView;
import com.anythink.nativead.api.ATNativeEventExListener;
import com.anythink.nativead.api.ATNativeNetworkListener;
import com.anythink.nativead.api.ATNativePrepareExInfo;
import com.anythink.nativead.api.NativeAd;
import com.hamkho.livefoot.Activities.SoccerLive.EventDetailActivity;

/* compiled from: EventDetailActivity.java */
/* loaded from: classes2.dex */
public final class p implements ATNativeNetworkListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ATNativeAdView f3159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f3160b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m9.j f3161c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EventDetailActivity f3162d;

    public p(EventDetailActivity eventDetailActivity, ATNativeAdView aTNativeAdView, Activity activity, m9.j jVar) {
        this.f3162d = eventDetailActivity;
        this.f3159a = aTNativeAdView;
        this.f3160b = activity;
        this.f3161c = jVar;
    }

    @Override // com.anythink.nativead.api.ATNativeNetworkListener
    public final void onNativeAdLoadFail(AdError adError) {
        this.f3159a.setVisibility(8);
    }

    @Override // com.anythink.nativead.api.ATNativeNetworkListener
    public final void onNativeAdLoaded() {
        m9.j jVar = this.f3161c;
        EventDetailActivity eventDetailActivity = this.f3162d;
        NativeAd nativeAd = eventDetailActivity.f21485w.getNativeAd();
        if (nativeAd != null) {
            NativeAd nativeAd2 = eventDetailActivity.f21484v;
            if (nativeAd2 != null) {
                nativeAd2.destory();
            }
            eventDetailActivity.f21484v = nativeAd;
            nativeAd.setNativeEventListener(new a());
            ATNativeAdView aTNativeAdView = this.f3159a;
            aTNativeAdView.removeAllViews();
            eventDetailActivity.f21486x = null;
            try {
                eventDetailActivity.f21486x = new ATNativePrepareExInfo();
                if (eventDetailActivity.f21484v.isNativeExpress()) {
                    eventDetailActivity.f21484v.renderAdContainer(aTNativeAdView, null);
                } else {
                    i9.d.a(this.f3160b, eventDetailActivity.f21484v.getAdMaterial(), jVar, eventDetailActivity.f21486x);
                    eventDetailActivity.f21484v.renderAdContainer(aTNativeAdView, jVar.f33019a);
                }
            } catch (Exception unused) {
            }
            eventDetailActivity.f21484v.prepare(aTNativeAdView, eventDetailActivity.f21486x);
            aTNativeAdView.setVisibility(0);
        }
    }

    /* compiled from: EventDetailActivity.java */
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
