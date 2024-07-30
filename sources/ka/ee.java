package ka;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ee implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f31139s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f31140t = "insre";

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f31141u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ce f31142v;

    public ee(ce ceVar, ArrayList arrayList, long j10) {
        this.f31142v = ceVar;
        this.f31139s = arrayList;
        this.f31141u = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int intValue;
        com.huawei.openalliance.ad.ppskit.handlers.s n10 = com.huawei.openalliance.ad.ppskit.handlers.s.n(this.f31142v.f31054h);
        for (ContentRecord contentRecord : this.f31139s) {
            if (contentRecord != null) {
                String h10 = contentRecord.h();
                if (contentRecord.v1() == null) {
                    intValue = androidx.activity.n.v(contentRecord.z0());
                } else {
                    intValue = com.huawei.openalliance.ad.ppskit.utils.y1.q(contentRecord.v1()).intValue();
                }
                n10.q(h10, intValue, this.f31140t);
                long j10 = this.f31141u;
                String str = this.f31140t;
                if (TextUtils.isEmpty(h10)) {
                    n7.i("ContentResourceDao", "contentId is null, can't update updateTime");
                } else {
                    synchronized (com.huawei.openalliance.ad.ppskit.handlers.s.f22622d) {
                        List t10 = n10.t(h10);
                        if (!androidx.transition.n.M(t10)) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = ((ArrayList) t10).iterator();
                            while (it.hasNext()) {
                                ContentResource contentResource = (ContentResource) it.next();
                                if (n7.d()) {
                                    n7.c("ContentResourceDao", "contentResource fileName: %s contentId: %s old update time: %s newUpdate time: %s cacheType: %s", contentResource.a(), contentResource.c(), Long.valueOf(contentResource.f()), Long.valueOf(j10), str);
                                }
                                ArrayList r10 = n10.r(contentResource.a(), str);
                                if (!androidx.transition.n.M(r10)) {
                                    Iterator it2 = r10.iterator();
                                    while (it2.hasNext()) {
                                        ContentResource contentResource2 = (ContentResource) it2.next();
                                        if (j10 != contentResource.f()) {
                                            contentResource2.z(j10);
                                            arrayList.add(contentResource2);
                                        }
                                    }
                                } else {
                                    n7.e("ContentResourceDao", "contentResourcesByName is empty");
                                }
                            }
                            n10.s(arrayList);
                        } else {
                            n7.e("ContentResourceDao", "contentResources is empty");
                        }
                    }
                }
            }
        }
    }
}
