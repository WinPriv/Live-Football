package fa;

import android.content.Context;
import com.huawei.hms.ads.cj;
import com.huawei.hms.ads.cl;
import com.huawei.openalliance.ad.beans.parameter.AdSlotParam;
import gb.z;

/* loaded from: classes2.dex */
public final class i implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AdSlotParam f28247s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f28248t;

    public i(j jVar, AdSlotParam adSlotParam) {
        this.f28248t = jVar;
        this.f28247s = adSlotParam;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdSlotParam adSlotParam = this.f28247s;
        adSlotParam.g();
        j jVar = this.f28248t;
        jVar.getClass();
        adSlotParam.q();
        adSlotParam.i(cj.Code(adSlotParam.a()));
        Context context = jVar.f28251a;
        if (cl.Code(context).V()) {
            adSlotParam.s(gb.a.a(context));
        }
        adSlotParam.D(z.n(context));
        adSlotParam.C(com.huawei.hms.ads.g.Code());
        ha.i.e(context).d("reqPreSplashAd", gb.b.p(adSlotParam), null, null);
    }
}
