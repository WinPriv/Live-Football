package ka;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ie implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ContentRecord f31291s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ke f31292t;

    public ie(ke keVar, ContentRecord contentRecord) {
        this.f31292t = keVar;
        this.f31291s = contentRecord;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.huawei.openalliance.ad.ppskit.handlers.s n10 = com.huawei.openalliance.ad.ppskit.handlers.s.n(this.f31292t.f31386g);
        String h10 = this.f31291s.h();
        n10.getClass();
        if (TextUtils.isEmpty(h10)) {
            n7.i("ContentResourceDao", "contentId is null, can't update content resource");
            return;
        }
        synchronized (com.huawei.openalliance.ad.ppskit.handlers.s.f22622d) {
            List t10 = n10.t(h10);
            if (!androidx.transition.n.M(t10)) {
                Iterator it = ((ArrayList) t10).iterator();
                while (it.hasNext()) {
                    ContentResource contentResource = (ContentResource) it.next();
                    contentResource.I(contentResource.U() + 1);
                }
                n10.s(t10);
            } else {
                n7.e("ContentResourceDao", "contentResources is empty");
            }
        }
    }
}
