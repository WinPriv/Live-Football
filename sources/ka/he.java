package ka;

import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.EventRecord;

/* loaded from: classes2.dex */
public final class he implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f31247s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ContentRecord f31248t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f31249u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f31250v = true;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f31251w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f31252x;
    public final /* synthetic */ ke y;

    public he(ke keVar, o oVar, ContentRecord contentRecord, String str, boolean z10, boolean z11) {
        this.y = keVar;
        this.f31247s = oVar;
        this.f31248t = contentRecord;
        this.f31249u = str;
        this.f31251w = z10;
        this.f31252x = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f31249u;
        o oVar = this.f31247s;
        ke keVar = this.y;
        try {
            EventRecord a10 = ke.a(keVar, oVar);
            if (ke.v(a10, com.anythink.expressad.foundation.d.f.f9575i)) {
                return;
            }
            ContentRecord contentRecord = this.f31248t;
            if (contentRecord != null) {
                a10.c1(contentRecord.u1());
            }
            a10.z1(str);
            zf z10 = androidx.transition.n.z(keVar.f31386g, keVar.f31381a, com.anythink.expressad.foundation.d.f.f9575i);
            String str2 = a10.i() + "_" + oVar.f31525a;
            if (this.f31250v) {
                if ((!this.f31251w || !z10.h(contentRecord, str2)) && !z10.m(str2)) {
                    z10.j(a10, contentRecord);
                }
            } else {
                n7.e("EventProcessor", "do not report this event");
            }
            if (this.f31252x) {
                z10.i().execute(new com.huawei.openalliance.ad.ppskit.utils.b2(new xf(z10, true, str)));
            }
        } catch (Throwable unused) {
            n7.i("EventProcessor", "onAnalysis.addEventToCache exception");
            n7.a();
        }
    }
}
