package ka;

import com.iab.omid.library.huawei.adsession.AdEvents;
import com.iab.omid.library.huawei.adsession.AdSession;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class gb extends c5.e implements hb {

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f31210w = jb.a(com.huawei.hms.ads.hb.f21700e);

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f31211v = new ArrayList();

    @Override // ka.hb
    public final void b() {
        this.f31211v.clear();
    }

    @Override // ka.hb
    public final void f(ob obVar) {
        if (obVar instanceof fb) {
            ArrayList<AdSession> d10 = ((fb) obVar).d();
            if (!d10.isEmpty()) {
                for (AdSession adSession : d10) {
                    if (adSession != null) {
                        this.f31211v.add(AdEvents.createAdEvents(adSession));
                    }
                }
            }
        }
    }

    public final void i() {
        ArrayList arrayList = this.f31211v;
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AdEvents) it.next()).impressionOccurred();
            }
        } catch (IllegalStateException unused) {
            n7.e("DisplayEventAgent", "impressionOccurred, fail");
        }
    }

    public final void j() {
        ArrayList arrayList = this.f31211v;
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AdEvents) it.next()).loaded();
            }
        } catch (IllegalStateException unused) {
            n7.e("DisplayEventAgent", "loaded, fail");
        }
    }
}
