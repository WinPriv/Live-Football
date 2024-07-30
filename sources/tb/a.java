package tb;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.ae;
import com.ironsource.mediationsdk.logger.IronLog;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final IronSource.AD_UNIT f35593a;

    public a(IronSource.AD_UNIT ad_unit) {
        this.f35593a = ad_unit;
    }

    public final void a(boolean z10, AdInfo adInfo) {
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        IronSource.AD_UNIT ad_unit2 = this.f35593a;
        if (ad_unit2 == ad_unit) {
            ae.a().a(z10, adInfo);
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit2);
    }
}
