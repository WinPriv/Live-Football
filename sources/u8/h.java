package u8;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.hamkho.livefoot.Activities.MainActivity;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.VideoOperator;
import com.huawei.hms.ads.nativead.NativeAd;
import com.huawei.hms.ads.nativead.NativeView;

/* compiled from: MainActivity.java */
/* loaded from: classes2.dex */
public final class h implements NativeAd.NativeAdLoadedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f35802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f35803b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainActivity f35804c;

    /* compiled from: MainActivity.java */
    /* loaded from: classes2.dex */
    public class a extends VideoOperator.VideoLifecycleListener {
        @Override // com.huawei.hms.ads.VideoOperator.VideoLifecycleListener
        public final void onVideoEnd() {
            super.onVideoEnd();
        }
    }

    public h(MainActivity mainActivity, Activity activity, FrameLayout frameLayout) {
        this.f35804c = mainActivity;
        this.f35802a = activity;
        this.f35803b = frameLayout;
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd.NativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd) {
        MainActivity mainActivity = this.f35804c;
        mainActivity.y = nativeAd;
        mainActivity.f21464s.f32992e.b();
        mainActivity.f21464s.f32992e.setVisibility(8);
        NativeView nativeView = (NativeView) this.f35802a.getLayoutInflater().inflate(R.layout.ad_native, (ViewGroup) null);
        t8.a.l(nativeAd, nativeView);
        FrameLayout frameLayout = this.f35803b;
        frameLayout.removeAllViews();
        frameLayout.addView(nativeView);
        nativeAd.getVideoOperator().setVideoLifecycleListener(new a());
    }
}
