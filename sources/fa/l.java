package fa;

import com.huawei.hms.ads.jd;
import com.huawei.openalliance.ad.beans.inner.NativeAdReqParam;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;

/* loaded from: classes2.dex */
public final class l implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f28252s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AdSlotParam.a f28253t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ NativeAdReqParam f28254u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o f28255v;

    public l(o oVar, long j10, AdSlotParam.a aVar, NativeAdReqParam nativeAdReqParam) {
        this.f28255v = oVar;
        this.f28252s = j10;
        this.f28253t = aVar;
        this.f28254u = nativeAdReqParam;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.f28255v;
        oVar.I.P(System.currentTimeMillis() - this.f28252s);
        jd.Code(oVar.f28271l.getApplicationContext(), "reqNativeAd", this.f28253t.b(), gb.b.p(this.f28254u), new m(oVar), String.class);
    }
}
