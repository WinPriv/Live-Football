package z8;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.hamkho.livefoot.Activities.FootballScores.AllScores.MatchDetails;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.VideoOperator;
import com.huawei.hms.ads.nativead.NativeAd;
import com.huawei.hms.ads.nativead.NativeView;

/* compiled from: MatchDetails.java */
/* loaded from: classes2.dex */
public final class f implements NativeAd.NativeAdLoadedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f37339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f37340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MatchDetails f37341c;

    /* compiled from: MatchDetails.java */
    /* loaded from: classes2.dex */
    public class a extends VideoOperator.VideoLifecycleListener {
        @Override // com.huawei.hms.ads.VideoOperator.VideoLifecycleListener
        public final void onVideoEnd() {
            super.onVideoEnd();
        }
    }

    public f(MatchDetails matchDetails, Activity activity, FrameLayout frameLayout) {
        this.f37341c = matchDetails;
        this.f37339a = activity;
        this.f37340b = frameLayout;
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd.NativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd) {
        MatchDetails matchDetails = this.f37341c;
        matchDetails.H = nativeAd;
        matchDetails.f21452s.f33003i.b();
        matchDetails.f21452s.f33003i.setVisibility(8);
        NativeView nativeView = (NativeView) this.f37339a.getLayoutInflater().inflate(R.layout.ad_native, (ViewGroup) null);
        t8.a.l(nativeAd, nativeView);
        FrameLayout frameLayout = this.f37340b;
        frameLayout.removeAllViews();
        frameLayout.addView(nativeView);
        nativeAd.getVideoOperator().setVideoLifecycleListener(new a());
    }
}
