package ka;

import com.huawei.openalliance.ad.ppskit.db.bean.ContentResource;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class a5 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f30914s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f30915t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.huawei.openalliance.ad.ppskit.utils.h f30916u;

    public a5(com.huawei.openalliance.ad.ppskit.utils.h hVar, String str, long j10) {
        this.f30916u = hVar;
        this.f30914s = str;
        this.f30915t = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.huawei.openalliance.ad.ppskit.utils.h hVar = this.f30916u;
        com.huawei.openalliance.ad.ppskit.handlers.s n10 = com.huawei.openalliance.ad.ppskit.handlers.s.n(hVar.f22856a);
        ArrayList r10 = n10.r(this.f30914s, hVar.f22857b);
        if (!androidx.transition.n.M(r10)) {
            Iterator it = r10.iterator();
            while (it.hasNext()) {
                ((ContentResource) it.next()).z(this.f30915t);
            }
            n10.s(r10);
        }
    }
}
