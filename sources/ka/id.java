package ka;

import com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.ppskit.net.http.Response;

/* loaded from: classes2.dex */
public final class id implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31284s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f31285t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f31286u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f31287v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AdSlotParam f31288w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Response f31289x;
    public final /* synthetic */ boolean y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ ad f31290z;

    public id(ad adVar, String str, String str2, int i10, long j10, AdSlotParam adSlotParam, Response response, boolean z10) {
        this.f31290z = adVar;
        this.f31284s = str;
        this.f31285t = str2;
        this.f31286u = i10;
        this.f31287v = j10;
        this.f31288w = adSlotParam;
        this.f31289x = response;
        this.y = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ad adVar = this.f31290z;
        u uVar = new u(adVar.f30934a);
        String q10 = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, adVar.f30939g.E());
        uVar.f31723b = adVar.f;
        uVar.m(this.f31284s, this.f31285t, this.f31286u, this.f31287v, this.f31288w, this.f31289x, q10, this.y);
    }
}
