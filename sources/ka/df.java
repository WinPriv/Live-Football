package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdContentData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.EventRecord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class df implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f31102s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f31103t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Map f31104u;

    public df(Context context, String str, HashMap hashMap) {
        this.f31102s = context;
        this.f31103t = str;
        this.f31104u = hashMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = new ArrayList();
        Context context = this.f31102s;
        Map map = this.f31104u;
        if (map != null && !map.isEmpty() && context != null) {
            String str = this.f31103t;
            if (!TextUtils.isEmpty(str)) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    for (AdContentData adContentData : (List) it.next()) {
                        arrayList.add(new com.huawei.openalliance.ad.ppskit.handlers.e0(context).n(str, adContentData.B(), adContentData.A()));
                    }
                }
            }
        }
        byte[] h10 = com.huawei.openalliance.ad.ppskit.utils.u1.h(context);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ContentRecord contentRecord = (ContentRecord) it2.next();
            if (contentRecord != null) {
                contentRecord.o(h10);
                ke keVar = new ke(context, zh.a(contentRecord.z0(), context), null);
                keVar.f31382b = contentRecord;
                EventRecord z10 = keVar.z("adLoaded");
                if (!ke.v(z10, "adLoaded")) {
                    z10.R0(null);
                    androidx.transition.n.z(keVar.f31386g, keVar.f31381a, z10.i()).d(z10.i(), z10, true, keVar.f31382b);
                }
            }
        }
    }
}
