package fa;

import com.huawei.hms.ads.da;
import com.huawei.openalliance.ad.inter.HiAd;

/* loaded from: classes2.dex */
public final class c implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ HiAd f28219s;

    public c(HiAd hiAd) {
        this.f28219s = hiAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HiAd hiAd = this.f28219s;
        da.Code(hiAd.f22217a);
        com.huawei.hms.ads.g.Code(hiAd.f22217a);
    }
}
