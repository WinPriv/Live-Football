package ka;

import android.content.Context;
import android.view.ViewGroup;
import com.huawei.openalliance.ad.ppskit.views.PPSInterstitialView;

/* loaded from: classes2.dex */
public final class gc extends m3.b {

    /* renamed from: v, reason: collision with root package name */
    public PPSInterstitialView f31212v;

    /* renamed from: w, reason: collision with root package name */
    public final Context f31213w;

    /* renamed from: x, reason: collision with root package name */
    public ua.a f31214x;
    public ViewGroup y;

    public gc(Context context, PPSInterstitialView pPSInterstitialView) {
        super(3);
        this.f31212v = pPSInterstitialView;
        this.f31213w = context;
    }

    @Override // m3.b
    public final p9 n() {
        return this.f31212v;
    }
}
