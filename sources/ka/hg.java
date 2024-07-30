package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Monitor;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.EncryptionField;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class hg {

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadPoolExecutor f31255g = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ti("ThirdMonitor-Event", 5));

    /* renamed from: a, reason: collision with root package name */
    public final Context f31256a;

    /* renamed from: b, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.s f31257b;

    /* renamed from: c, reason: collision with root package name */
    public final xe f31258c;

    /* renamed from: d, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.i0 f31259d;

    /* renamed from: e, reason: collision with root package name */
    public final gi f31260e;
    public ArrayList f;

    /* loaded from: classes2.dex */
    public interface a {
        String a(String str);
    }

    public hg(Context context, gi giVar) {
        this.f31256a = context.getApplicationContext();
        this.f31257b = new com.huawei.openalliance.ad.ppskit.handlers.s(context);
        this.f31258c = new xe(context);
        this.f31259d = com.huawei.openalliance.ad.ppskit.handlers.i0.d(context);
        this.f31260e = giVar;
    }

    public static ArrayList a(Context context, ContentRecord contentRecord, String str) {
        EncryptionField<List<Monitor>> K;
        List<Monitor> a10;
        if (contentRecord == null || (K = contentRecord.K()) == null || (a10 = K.a(context)) == null || a10.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Monitor monitor : a10) {
            if (str.equals(monitor.a())) {
                arrayList.add(monitor);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #0 {all -> 0x0078, blocks: (B:9:0x0031, B:14:0x003e), top: B:8:0x0031 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, long r6, com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r8, com.huawei.openalliance.ad.ppskit.beans.server.ThirdReportRsp r9) {
        /*
            ka.p r0 = new ka.p
            r0.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            if (r9 == 0) goto L28
            java.lang.String r1 = "httpCode:"
            r2.append(r1)
            int r1 = r9.k()
            r2.append(r1)
            java.lang.String r1 = r9.errorReason
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2d
            java.lang.String r1 = ", errorReason:"
            r2.append(r1)
            java.lang.String r9 = r9.errorReason
            goto L2a
        L28:
            java.lang.String r9 = "httpCode:-1"
        L2a:
            r2.append(r9)
        L2d:
            java.lang.String r2 = r2.toString()
            java.lang.String r9 = r8.n1()     // Catch: java.lang.Throwable -> L78
            r0.f31723b = r9     // Catch: java.lang.Throwable -> L78
            ka.o r9 = r0.f(r8)     // Catch: java.lang.Throwable -> L78
            if (r9 != 0) goto L3e
            goto L80
        L3e:
            java.lang.String r1 = "9"
            r9.f31525a = r1     // Catch: java.lang.Throwable -> L78
            r9.y = r2     // Catch: java.lang.Throwable -> L78
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L78
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = r2.getHost()     // Catch: java.lang.Throwable -> L78
            r9.f31575x = r2     // Catch: java.lang.Throwable -> L78
            r9.f31577z = r6     // Catch: java.lang.Throwable -> L78
            r9.f31567t = r5     // Catch: java.lang.Throwable -> L78
            r9.D = r3     // Catch: java.lang.Throwable -> L78
            ka.ke r4 = new ka.ke     // Catch: java.lang.Throwable -> L78
            android.content.Context r2 = r0.f31722a     // Catch: java.lang.Throwable -> L78
            int r3 = r8.z0()     // Catch: java.lang.Throwable -> L78
            ka.gi r3 = ka.zh.a(r3, r2)     // Catch: java.lang.Throwable -> L78
            r5 = 0
            r4.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L78
            java.lang.String r8 = r8.h1()     // Catch: java.lang.Throwable -> L78
            r6 = 0
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r7 = r4.f31382b     // Catch: java.lang.Throwable -> L78
            ka.pe r2 = new ka.pe     // Catch: java.lang.Throwable -> L78
            r3 = r2
            r5 = r9
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L78
            r3 = 0
            com.huawei.openalliance.ad.ppskit.utils.p2.a(r2, r3)     // Catch: java.lang.Throwable -> L78
            goto L80
        L78:
            r2 = move-exception
            java.lang.String r3 = "onUploadThirdPartyEventFail:"
            java.lang.String r4 = "AnalysisReport"
            e0.i.p(r2, r3, r4)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.hg.b(android.content.Context, java.lang.String, java.lang.String, java.lang.String, long, com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord, com.huawei.openalliance.ad.ppskit.beans.server.ThirdReportRsp):void");
    }

    public static void c(Context context, String str, String str2, String str3, ContentRecord contentRecord, long j10) {
        p pVar = new p(context);
        pVar.f31723b = contentRecord.n1();
        try {
            pVar.f31723b = contentRecord.n1();
            o f = pVar.f(contentRecord);
            if (f != null) {
                int z02 = contentRecord.z0();
                f.f31525a = "19";
                f.f31575x = new URL(str2).getHost();
                f.f31577z = j10;
                f.f31567t = str3;
                f.D = str;
                Context context2 = pVar.f31722a;
                ke keVar = new ke(context2, zh.a(z02, context2), null);
                com.huawei.openalliance.ad.ppskit.utils.p2.a(new pe(keVar, f, true, keVar.f31382b, contentRecord.h1()), 0);
            }
        } catch (Throwable th) {
            e0.i.p(th, "onUploadThirdPartyEventSuccess:", "AnalysisReport");
        }
    }
}
