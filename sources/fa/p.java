package fa;

import com.huawei.hms.ads.jd;
import com.huawei.openalliance.ad.beans.inner.PlacementAdReqParam;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;

/* loaded from: classes2.dex */
public final class p implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AdSlotParam.a f28288s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ PlacementAdReqParam f28289t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ s f28290u;

    public p(s sVar, AdSlotParam.a aVar, PlacementAdReqParam placementAdReqParam) {
        this.f28290u = sVar;
        this.f28288s = aVar;
        this.f28289t = placementAdReqParam;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = this.f28290u;
        jd.Code(sVar.f28295b, "reqPlaceAd", this.f28288s.b(), gb.b.p(this.f28289t), new q(sVar), String.class);
    }
}
