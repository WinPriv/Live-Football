package t8;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.VideoOperator;
import com.huawei.hms.ads.nativead.NativeAd;
import com.huawei.hms.ads.nativead.NativeView;

/* compiled from: AdsManager.java */
/* loaded from: classes2.dex */
public final class i implements NativeAd.NativeAdLoadedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f35586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f35587b;

    /* compiled from: AdsManager.java */
    /* loaded from: classes2.dex */
    public class a extends VideoOperator.VideoLifecycleListener {
        @Override // com.huawei.hms.ads.VideoOperator.VideoLifecycleListener
        public final void onVideoEnd() {
            super.onVideoEnd();
        }
    }

    public i(Activity activity, FrameLayout frameLayout) {
        this.f35586a = activity;
        this.f35587b = frameLayout;
    }

    @Override // com.huawei.hms.ads.nativead.NativeAd.NativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd) {
        t8.a.o = nativeAd;
        NativeView nativeView = (NativeView) this.f35586a.getLayoutInflater().inflate(R.layout.ad_native, (ViewGroup) null);
        t8.a.l(nativeAd, nativeView);
        FrameLayout frameLayout = this.f35587b;
        frameLayout.removeAllViews();
        frameLayout.addView(nativeView);
        nativeAd.getVideoOperator().setVideoLifecycleListener(new a());
    }
}
