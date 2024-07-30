package ka;

import android.content.Context;
import android.util.Pair;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.utils.y;

/* loaded from: classes2.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31722a;

    /* renamed from: b, reason: collision with root package name */
    public String f31723b = "";

    public r(Context context) {
        this.f31722a = context.getApplicationContext();
    }

    public static void b(Context context, o oVar) {
        Pair<String, Boolean> b10;
        String str;
        if (oVar != null && (b10 = a0.a.A().b(context, context.getPackageName())) != null) {
            if (((Boolean) b10.second).booleanValue()) {
                str = "0";
            } else {
                str = "1";
            }
            oVar.M = str;
            oVar.A = (String) b10.first;
        }
    }

    public static void d(Context context, o oVar) {
        y.b a10;
        String str;
        if (oVar != null && com.huawei.openalliance.ad.ppskit.utils.y.b(context) && (a10 = com.huawei.openalliance.ad.ppskit.utils.y.a(context)) != null) {
            oVar.L0 = a10.f23063a;
            if (a10.f23064b) {
                str = "0";
            } else {
                str = "1";
            }
            oVar.M0 = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce A[Catch: all -> 0x0114, TryCatch #1 {all -> 0x0114, blocks: (B:3:0x0003, B:4:0x000b, B:8:0x0018, B:13:0x0038, B:15:0x0040, B:17:0x0048, B:19:0x006c, B:20:0x0072, B:22:0x0088, B:24:0x0096, B:26:0x009c, B:27:0x00aa, B:31:0x00a6, B:33:0x00ac, B:35:0x00ce, B:36:0x00d8, B:38:0x00fe, B:40:0x0104, B:45:0x0113, B:6:0x000c, B:7:0x0017), top: B:2:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fe A[Catch: all -> 0x0114, TryCatch #1 {all -> 0x0114, blocks: (B:3:0x0003, B:4:0x000b, B:8:0x0018, B:13:0x0038, B:15:0x0040, B:17:0x0048, B:19:0x006c, B:20:0x0072, B:22:0x0088, B:24:0x0096, B:26:0x009c, B:27:0x00aa, B:31:0x00a6, B:33:0x00ac, B:35:0x00ce, B:36:0x00d8, B:38:0x00fe, B:40:0x0104, B:45:0x0113, B:6:0x000c, B:7:0x0017), top: B:2:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ka.o a(java.lang.String r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.r.a(java.lang.String, boolean):ka.o");
    }

    public final o c(String str, boolean z10) {
        o a10 = a(str, true);
        Context context = this.f31722a;
        if (z10) {
            b(context, a10);
        }
        d(context, a10);
        return a10;
    }

    public final o e(ContentRecord contentRecord, String str) {
        o c10 = c(str, true);
        if (contentRecord != null && c10 != null) {
            c10.f31559p = contentRecord.p2();
            c10.f31561q = contentRecord.h();
            c10.b(contentRecord.z0());
            c10.R = contentRecord.i();
            c10.S = Integer.valueOf(contentRecord.z());
            c10.T = Integer.valueOf(contentRecord.d2());
            c10.f31567t = contentRecord.o1();
            c10.P0 = contentRecord.u1();
        }
        return c10;
    }

    public final o f(ContentRecord contentRecord) {
        String str;
        if (contentRecord != null) {
            str = contentRecord.h1();
        } else {
            str = "";
        }
        return e(contentRecord, str);
    }
}
