package b9;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.hamkho.livefoot.Activities.SoccerLive.EventDetailActivity;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.VideoOperator;
import com.huawei.hms.ads.nativead.NativeAd;
import com.huawei.hms.ads.nativead.NativeView;

/* compiled from: EventDetailActivity.java */
/* loaded from: classes2.dex */
public final class s implements NativeAd.NativeAdLoadedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f3165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f3166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EventDetailActivity f3167c;

    /* compiled from: EventDetailActivity.java */
    /* loaded from: classes2.dex */
    public class a extends VideoOperator.VideoLifecycleListener {
        @Override // com.huawei.hms.ads.VideoOperator.VideoLifecycleListener
        public final void onVideoEnd() {
            super.onVideoEnd();
        }
    }

    public s(EventDetailActivity eventDetailActivity, Activity activity, FrameLayout frameLayout) {
        this.f3167c = eventDetailActivity;
        this.f3165a = activity;
        this.f3166b = frameLayout;
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd.NativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd) {
        EventDetailActivity eventDetailActivity = this.f3167c;
        eventDetailActivity.A = nativeAd;
        eventDetailActivity.f21481s.f32964e.b();
        eventDetailActivity.f21481s.f32964e.setVisibility(8);
        NativeView nativeView = (NativeView) this.f3165a.getLayoutInflater().inflate(R.layout.ad_native, (ViewGroup) null);
        t8.a.l(nativeAd, nativeView);
        FrameLayout frameLayout = this.f3166b;
        frameLayout.removeAllViews();
        frameLayout.addView(nativeView);
        nativeAd.getVideoOperator().setVideoLifecycleListener(new a());
    }
}
