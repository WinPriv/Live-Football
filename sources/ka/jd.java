package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.EventRecord;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class jd implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31328s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AdContentRsp f31329t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f31330u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ad f31331v;

    public jd(ad adVar, String str, AdContentRsp adContentRsp, int i10) {
        this.f31331v = adVar;
        this.f31328s = str;
        this.f31329t = adContentRsp;
        this.f31330u = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ad adVar = this.f31331v;
        ArrayList y = androidx.transition.n.y(this.f31328s, adVar.f, this.f31329t, this.f31330u);
        Context context = adVar.f30934a;
        byte[] h10 = com.huawei.openalliance.ad.ppskit.utils.u1.h(context);
        Iterator it = y.iterator();
        while (it.hasNext()) {
            ContentRecord contentRecord = (ContentRecord) it.next();
            if (contentRecord != null) {
                contentRecord.o(h10);
                ke keVar = new ke(context, zh.a(contentRecord.z0(), context), null);
                keVar.f31382b = contentRecord;
                EventRecord z10 = keVar.z("response");
                if (!ke.v(z10, "response")) {
                    z10.R0(null);
                    ContentRecord contentRecord2 = keVar.f31382b;
                    if (contentRecord2 != null) {
                        z10.D1(contentRecord2.J0());
                    }
                    androidx.transition.n.z(keVar.f31386g, keVar.f31381a, z10.i()).d(z10.i(), z10, true, keVar.f31382b);
                }
            }
        }
    }
}
