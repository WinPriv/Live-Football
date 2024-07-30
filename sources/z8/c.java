package z8;

import android.app.Activity;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.AdError;
import com.anythink.nativead.api.ATNativeAdView;
import com.anythink.nativead.api.ATNativeEventExListener;
import com.anythink.nativead.api.ATNativeNetworkListener;
import com.anythink.nativead.api.ATNativePrepareExInfo;
import com.anythink.nativead.api.NativeAd;
import com.hamkho.livefoot.Activities.FootballScores.AllScores.MatchDetails;
import m9.j;

/* compiled from: MatchDetails.java */
/* loaded from: classes2.dex */
public final class c implements ATNativeNetworkListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ATNativeAdView f37333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f37334b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f37335c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MatchDetails f37336d;

    public c(MatchDetails matchDetails, ATNativeAdView aTNativeAdView, Activity activity, j jVar) {
        this.f37336d = matchDetails;
        this.f37333a = aTNativeAdView;
        this.f37334b = activity;
        this.f37335c = jVar;
    }

    @Override // com.anythink.nativead.api.ATNativeNetworkListener
    public final void onNativeAdLoadFail(AdError adError) {
        this.f37333a.setVisibility(8);
    }

    @Override // com.anythink.nativead.api.ATNativeNetworkListener
    public final void onNativeAdLoaded() {
        j jVar = this.f37335c;
        MatchDetails matchDetails = this.f37336d;
        NativeAd nativeAd = matchDetails.D.getNativeAd();
        if (nativeAd != null) {
            NativeAd nativeAd2 = matchDetails.C;
            if (nativeAd2 != null) {
                nativeAd2.destory();
            }
            matchDetails.C = nativeAd;
            nativeAd.setNativeEventListener(new a());
            ATNativeAdView aTNativeAdView = this.f37333a;
            aTNativeAdView.removeAllViews();
            matchDetails.E = null;
            try {
                matchDetails.E = new ATNativePrepareExInfo();
                if (matchDetails.C.isNativeExpress()) {
                    matchDetails.C.renderAdContainer(aTNativeAdView, null);
                } else {
                    i9.d.a(this.f37334b, matchDetails.C.getAdMaterial(), jVar, matchDetails.E);
                    matchDetails.C.renderAdContainer(aTNativeAdView, jVar.f33019a);
                }
            } catch (Exception unused) {
            }
            matchDetails.C.prepare(aTNativeAdView, matchDetails.E);
            aTNativeAdView.setVisibility(0);
        }
    }

    /* compiled from: MatchDetails.java */
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
