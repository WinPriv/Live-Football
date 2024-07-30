package fa;

import com.huawei.hms.ads.consent.inter.Consent;
import com.huawei.openalliance.ad.inter.HiAd;

/* loaded from: classes2.dex */
public final class b implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ HiAd f28218s;

    public b(HiAd hiAd) {
        this.f28218s = hiAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Consent.getInstance(this.f28218s.f22217a).getNpaAccordingToServerConsent();
    }
}
