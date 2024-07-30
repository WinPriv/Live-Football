package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class y2 extends c5.e {

    /* renamed from: v, reason: collision with root package name */
    public final String f32204v;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final HashMap f32205a = new HashMap();
    }

    public y2(String str) {
        this.f32204v = str;
    }

    @Override // c5.e
    public final void c(Context context, ContentRecord contentRecord) {
        if (contentRecord != null) {
            HashMap hashMap = a.f32205a;
            String str = this.f32204v;
            boolean z10 = false;
            if (str != null) {
                HashMap hashMap2 = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
                long currentTimeMillis = System.currentTimeMillis();
                HashMap hashMap3 = a.f32205a;
                Iterator it = hashMap3.entrySet().iterator();
                while (it.hasNext()) {
                    Long l10 = (Long) ((Map.Entry) it.next()).getValue();
                    if (l10 == null || currentTimeMillis - l10.longValue() > 500) {
                        it.remove();
                    }
                }
                Long l11 = (Long) hashMap3.get(str);
                if (l11 == null) {
                    hashMap3.put(str, Long.valueOf(currentTimeMillis));
                    z10 = true;
                } else {
                    n7.f("ApiDownloadCheckerWithAction", "frequency control current:%s, last:%s, caller:%s", Long.valueOf(currentTimeMillis), l11, str);
                }
            }
            if (!z10) {
                n7.e("ApiDownloadCheckerWithAction", "frequency control return");
                return;
            }
            MetaData X1 = contentRecord.X1();
            HashMap hashMap4 = new HashMap();
            if (X1 != null) {
                hashMap4.put("appId", X1.f0());
                hashMap4.put("thirdId", X1.j());
            }
            a0.a.N(context, contentRecord, hashMap4, true).a();
        }
    }
}
