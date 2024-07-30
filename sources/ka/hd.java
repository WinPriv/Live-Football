package ka;

import com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.ppskit.net.http.Response;

/* loaded from: classes2.dex */
public final class hd implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31241s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f31242t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f31243u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f31244v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AdSlotParam f31245w = null;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Response f31246x;
    public final /* synthetic */ ad y;

    public hd(ad adVar, String str, String str2, int i10, long j10, Response response) {
        this.y = adVar;
        this.f31241s = str;
        this.f31242t = str2;
        this.f31243u = i10;
        this.f31244v = j10;
        this.f31246x = response;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ad adVar = this.y;
        u uVar = new u(adVar.f30934a);
        String q10 = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, adVar.f30939g.E());
        uVar.f31723b = adVar.f;
        uVar.m(this.f31241s, this.f31242t, this.f31243u, this.f31244v, this.f31245w, this.f31246x, q10, false);
    }
}
