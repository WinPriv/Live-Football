package ab;

import android.content.Context;
import com.huawei.hms.ads.ep;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.util.Map;
import ka.ii;
import ka.l7;
import ka.n7;

/* loaded from: classes2.dex */
public class f extends ii {
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f396g;

    /* renamed from: h, reason: collision with root package name */
    public final l7 f397h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f398i;

    public f(Context context, ContentRecord contentRecord, Map map, boolean z10) {
        super(context, contentRecord);
        l7 l7Var = new l7();
        this.f397h = l7Var;
        this.f398i = false;
        this.f = "3.4.65.300";
        this.f396g = z10;
        n7.b("InnerWebAction", "buildLinkedAdConfig");
        if (map != null && !map.isEmpty()) {
            String str = (String) map.getOrDefault(ba.f22065n, String.valueOf(0));
            String str2 = (String) map.getOrDefault(ba.f22064m, String.valueOf(0));
            String str3 = (String) map.getOrDefault(ba.f22067q, ep.V);
            String str4 = (String) map.getOrDefault(ba.o, null);
            String str5 = (String) map.getOrDefault(ba.f22066p, "n");
            Integer q10 = y1.q(str);
            if (q10 != null) {
                l7Var.b(q10.intValue());
            } else {
                l7Var.b(0);
            }
            l7Var.f31407b = str2;
            Integer q11 = y1.q(str4);
            if (q11 != null) {
                l7Var.f31408c = q11.intValue();
                n7.e("InnerWebAction", "set progress from native view " + q11);
            } else {
                l7Var.f31408c = 0;
            }
            l7Var.f31409d = str5;
            l7Var.a(ep.Code.equals(str3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1 A[Catch: all -> 0x0112, TryCatch #0 {all -> 0x0112, blocks: (B:23:0x0057, B:25:0x00b3, B:30:0x00bd, B:33:0x00cb, B:35:0x00d1, B:36:0x00da, B:38:0x00e7, B:39:0x00f1, B:41:0x00f7, B:42:0x00fc, B:44:0x0108, B:46:0x010c, B:48:0x00c6), top: B:22:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7 A[Catch: all -> 0x0112, TryCatch #0 {all -> 0x0112, blocks: (B:23:0x0057, B:25:0x00b3, B:30:0x00bd, B:33:0x00cb, B:35:0x00d1, B:36:0x00da, B:38:0x00e7, B:39:0x00f1, B:41:0x00f7, B:42:0x00fc, B:44:0x0108, B:46:0x010c, B:48:0x00c6), top: B:22:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7 A[Catch: all -> 0x0112, TryCatch #0 {all -> 0x0112, blocks: (B:23:0x0057, B:25:0x00b3, B:30:0x00bd, B:33:0x00cb, B:35:0x00d1, B:36:0x00da, B:38:0x00e7, B:39:0x00f1, B:41:0x00f7, B:42:0x00fc, B:44:0x0108, B:46:0x010c, B:48:0x00c6), top: B:22:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108 A[Catch: all -> 0x0112, TryCatch #0 {all -> 0x0112, blocks: (B:23:0x0057, B:25:0x00b3, B:30:0x00bd, B:33:0x00cb, B:35:0x00d1, B:36:0x00da, B:38:0x00e7, B:39:0x00f1, B:41:0x00f7, B:42:0x00fc, B:44:0x0108, B:46:0x010c, B:48:0x00c6), top: B:22:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010c A[Catch: all -> 0x0112, TRY_LEAVE, TryCatch #0 {all -> 0x0112, blocks: (B:23:0x0057, B:25:0x00b3, B:30:0x00bd, B:33:0x00cb, B:35:0x00d1, B:36:0x00da, B:38:0x00e7, B:39:0x00f1, B:41:0x00f7, B:42:0x00fc, B:44:0x0108, B:46:0x010c, B:48:0x00c6), top: B:22:0x0057 }] */
    @Override // ka.ii
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.f.a():boolean");
    }
}
