package u8;

import com.hamkho.livefoot.Activities.MainActivity;
import com.huawei.hms.ads.AdListener;

/* compiled from: MainActivity.java */
/* loaded from: classes2.dex */
public final class g extends AdListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f35801a;

    public g(MainActivity mainActivity) {
        this.f35801a = mainActivity;
    }

    @Override // com.huawei.hms.ads.AdListener
    public final void onAdFailed(int i10) {
        MainActivity mainActivity = this.f35801a;
        mainActivity.f21464s.f32992e.b();
        mainActivity.f21464s.f32992e.setVisibility(8);
    }

    @Override // com.huawei.hms.ads.AdListener
    public final void onAdLoaded() {
    }
}
