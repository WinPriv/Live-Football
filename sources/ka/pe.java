package ka;

import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.EventRecord;

/* loaded from: classes2.dex */
public final class pe implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f31654s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f31655t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ContentRecord f31656u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f31657v = true;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f31658w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ke f31659x;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ cg f31660s;

        public a(zf zfVar) {
            this.f31660s = zfVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = pe.this.f31658w;
            zf zfVar = (zf) this.f31660s;
            zfVar.getClass();
            zfVar.i().execute(new com.huawei.openalliance.ad.ppskit.utils.b2(new xf(zfVar, false, str)));
        }
    }

    public pe(ke keVar, o oVar, boolean z10, ContentRecord contentRecord, String str) {
        this.f31659x = keVar;
        this.f31654s = oVar;
        this.f31655t = z10;
        this.f31656u = contentRecord;
        this.f31658w = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.f31654s;
        ke keVar = this.f31659x;
        try {
            EventRecord a10 = ke.a(keVar, oVar);
            if (ke.v(a10, com.anythink.expressad.foundation.d.f.f9575i)) {
                return;
            }
            String str = a10.i() + "_" + oVar.f31525a;
            zf z10 = androidx.transition.n.z(keVar.f31386g, keVar.f31381a, com.anythink.expressad.foundation.d.f.f9575i);
            boolean z11 = this.f31655t;
            ContentRecord contentRecord = this.f31656u;
            if ((!z11 || !z10.h(contentRecord, str)) && !z10.m(str)) {
                z10.j(a10, contentRecord);
            }
            if (this.f31657v) {
                com.huawei.openalliance.ad.ppskit.utils.p2.a(new a(z10), 5);
            }
        } catch (Throwable unused) {
            n7.i("EventProcessor", "onThirdPartException onAnalysis.addEventToCache exception");
            n7.a();
        }
    }
}
