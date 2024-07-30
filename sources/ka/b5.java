package ka;

import com.huawei.openalliance.ad.ppskit.db.bean.ContentResource;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class b5 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f30971s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f30972t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.huawei.openalliance.ad.ppskit.utils.h f30973u;

    public b5(com.huawei.openalliance.ad.ppskit.utils.h hVar, String str, int i10) {
        this.f30973u = hVar;
        this.f30971s = str;
        this.f30972t = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.huawei.openalliance.ad.ppskit.utils.h hVar = this.f30973u;
        com.huawei.openalliance.ad.ppskit.handlers.s n10 = com.huawei.openalliance.ad.ppskit.handlers.s.n(hVar.f22856a);
        ArrayList r10 = n10.r(this.f30971s, hVar.f22857b);
        if (!androidx.transition.n.M(r10)) {
            Iterator it = r10.iterator();
            while (it.hasNext()) {
                ((ContentResource) it.next()).D(this.f30972t);
            }
            n10.s(r10);
        }
    }
}
