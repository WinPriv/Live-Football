package b9;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.hamkho.livefoot.Activities.SoccerLive.ChannelDetailActivity;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.VideoOperator;
import com.huawei.hms.ads.nativead.NativeAd;
import com.huawei.hms.ads.nativead.NativeView;

/* compiled from: ChannelDetailActivity.java */
/* loaded from: classes2.dex */
public final class j implements NativeAd.NativeAdLoadedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f3149a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f3150b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ChannelDetailActivity f3151c;

    /* compiled from: ChannelDetailActivity.java */
    /* loaded from: classes2.dex */
    public class a extends VideoOperator.VideoLifecycleListener {
        @Override // com.huawei.hms.ads.VideoOperator.VideoLifecycleListener
        public final void onVideoEnd() {
            super.onVideoEnd();
        }
    }

    public j(ChannelDetailActivity channelDetailActivity, Activity activity, FrameLayout frameLayout) {
        this.f3151c = channelDetailActivity;
        this.f3149a = activity;
        this.f3150b = frameLayout;
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd.NativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd) {
        ChannelDetailActivity channelDetailActivity = this.f3151c;
        channelDetailActivity.A = nativeAd;
        channelDetailActivity.f21470s.f32955g.b();
        channelDetailActivity.f21470s.f32955g.setVisibility(8);
        NativeView nativeView = (NativeView) this.f3149a.getLayoutInflater().inflate(R.layout.ad_native, (ViewGroup) null);
        t8.a.l(nativeAd, nativeView);
        FrameLayout frameLayout = this.f3150b;
        frameLayout.removeAllViews();
        frameLayout.addView(nativeView);
        nativeAd.getVideoOperator().setVideoLifecycleListener(new a());
    }
}
