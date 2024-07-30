package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.metadata.App;
import com.huawei.openalliance.ad.ppskit.beans.metadata.DelayInfo;
import com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.ppskit.beans.parameter.RequestOptions;
import com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.TemplateRecord;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ka.n1;

/* loaded from: classes2.dex */
public final class ad {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f30933i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f30934a;

    /* renamed from: b, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.e0 f30935b;

    /* renamed from: c, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.p f30936c;

    /* renamed from: d, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.i0 f30937d;

    /* renamed from: e, reason: collision with root package name */
    public final ConfigSpHandler f30938e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public final DelayInfo f30939g = new DelayInfo();

    /* renamed from: h, reason: collision with root package name */
    public final boolean f30940h;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f30941s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ p6 f30942t;

        public a(String str, com.huawei.openalliance.ad.ppskit.handlers.l lVar) {
            this.f30941s = str;
            this.f30942t = lVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            fc.a(ad.this.f30934a, this.f30941s, "insAppsList");
            p6 p6Var = this.f30942t;
            String str = this.f30941s;
            long currentTimeMillis = System.currentTimeMillis();
            com.huawei.openalliance.ad.ppskit.handlers.l lVar = (com.huawei.openalliance.ad.ppskit.handlers.l) p6Var;
            synchronized (lVar.f22585a) {
                lVar.G(str).edit().putLong("last_report_insapp_time", currentTimeMillis).commit();
            }
        }
    }

    public ad(Context context) {
        this.f30940h = false;
        this.f30934a = context.getApplicationContext();
        this.f30935b = new com.huawei.openalliance.ad.ppskit.handlers.e0(context);
        this.f30936c = new com.huawei.openalliance.ad.ppskit.handlers.p(context);
        this.f30937d = com.huawei.openalliance.ad.ppskit.handlers.i0.d(context);
        this.f30938e = ConfigSpHandler.b(context);
        this.f30940h = Cif.a(context).d();
    }

    public final App a(AdSlotParam adSlotParam, String str) {
        RequestOptions V;
        String j10 = com.huawei.openalliance.ad.ppskit.utils.o2.j(this.f30934a, str);
        if (adSlotParam.d0() && !oa.j.b(str, j10)) {
            n7.g("ad", "can not set app info:" + str);
            return null;
        }
        App Q = adSlotParam.Q();
        if (Q == null && (V = adSlotParam.V()) != null) {
            return V.l();
        }
        return Q;
    }

    public final AdContentRsp b(int i10, AdSlotParam adSlotParam, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        try {
            i(str);
            List<String> v3 = adSlotParam.v();
            com.huawei.openalliance.ad.ppskit.handlers.e0 e0Var = this.f30935b;
            ArrayList D = com.huawei.openalliance.ad.ppskit.handlers.e0.D(e0Var.C(str, i10, v3));
            if (16 == i10) {
                ArrayList C = e0Var.C(str, i10, v3);
                if (!C.isEmpty()) {
                    arrayList2 = new ArrayList();
                    Iterator it = C.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Long.valueOf(((ContentRecord) it.next()).I0()));
                    }
                } else {
                    arrayList2 = null;
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            adSlotParam.x(a(adSlotParam, str));
            return c(str, i10, adSlotParam, D, null, arrayList, false);
        } catch (Throwable th) {
            n7.h("ad", "request splash ad error: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0496, code lost:
    
        if (r1.F() == r6) goto L238;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0429 A[Catch: all -> 0x06dd, TryCatch #30 {all -> 0x06dd, blocks: (B:234:0x039e, B:201:0x0422, B:203:0x0429, B:204:0x042e, B:75:0x04a7, B:69:0x0469, B:71:0x0470, B:72:0x0476, B:270:0x03c4, B:271:0x03de), top: B:48:0x02bd }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0470 A[Catch: all -> 0x06dd, TryCatch #30 {all -> 0x06dd, blocks: (B:234:0x039e, B:201:0x0422, B:203:0x0429, B:204:0x042e, B:75:0x04a7, B:69:0x0469, B:71:0x0470, B:72:0x0476, B:270:0x03c4, B:271:0x03de), top: B:48:0x02bd }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0507  */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.huawei.openalliance.ad.ppskit.beans.server.AdContentReq] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, com.huawei.openalliance.ad.ppskit.handlers.i0] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [android.util.Pair<java.lang.Integer, android.util.Pair<java.lang.String, java.lang.String>>] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp c(java.lang.String r31, int r32, com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam r33, java.util.List r34, java.util.ArrayList r35, java.util.ArrayList r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 1775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.ad.c(java.lang.String, int, com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam, java.util.List, java.util.ArrayList, java.util.ArrayList, boolean):com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp");
    }

    public final AdContentRsp d(String str, int i10, AdSlotParam adSlotParam, List list, ArrayList arrayList, boolean z10) {
        return c(str, i10, adSlotParam, list, arrayList, null, z10);
    }

    public final AdContentRsp e(String str, AdSlotParam adSlotParam, String str2, int i10, List<String> list) {
        ArrayList arrayList;
        i(str);
        ArrayList h10 = this.f30936c.h(TemplateRecord.class, new String[]{"templateId"}, 0, null, null, null);
        if (!h10.isEmpty()) {
            arrayList = new ArrayList();
            Iterator it = h10.iterator();
            while (it.hasNext()) {
                arrayList.add(((TemplateRecord) it.next()).A());
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        App a10 = a(adSlotParam, str);
        if (a10 == null) {
            a10 = new App(this.f30934a, str);
        }
        List<String> v3 = adSlotParam.v();
        if (i10 == 3) {
            list = this.f30935b.w(str, 3, v3);
        }
        a10.h(str2);
        adSlotParam.x(a10);
        return d(str, i10, adSlotParam, list, arrayList2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.String r24, com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp r25, com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam r26, ka.ng r27, ka.r1.a r28, long r29, int r31) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.ad.f(java.lang.String, com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp, com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam, ka.ng, ka.r1$a, long, int):void");
    }

    public final void g(String str, AdContentRsp adContentRsp, n1.a aVar, int i10, long j10, boolean z10) {
        if (adContentRsp == null) {
            n7.e("ad", "null == adContentRsp");
        } else {
            n7.e("ad", "dealArResponse");
            com.huawei.openalliance.ad.ppskit.utils.p2.a(new vc(this, z10, aVar, str, adContentRsp, i10, j10), 4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (androidx.transition.n.M(r0) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp h(java.lang.String r9, com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam r10, boolean r11) {
        /*
            r8 = this;
            r8.i(r9)
            java.util.List r5 = r10.v()
            com.huawei.openalliance.ad.ppskit.beans.metadata.App r0 = r8.a(r10, r9)
            r10.x(r0)
            com.huawei.openalliance.ad.ppskit.handlers.e0 r0 = r8.f30935b
            r1 = 12
            java.util.ArrayList r7 = r0.w(r9, r1, r5)
            if (r11 == 0) goto L3b
            r1 = 12
            long r2 = java.lang.System.currentTimeMillis()
            r4 = r9
            java.util.ArrayList r0 = r0.q(r1, r2, r4, r5)
            boolean r1 = androidx.transition.n.M(r0)
            if (r1 != 0) goto L33
            boolean r1 = androidx.transition.n.M(r7)
            if (r1 != 0) goto L33
            r0.addAll(r7)
            goto L39
        L33:
            boolean r1 = androidx.transition.n.M(r0)
            if (r1 != 0) goto L3b
        L39:
            r4 = r0
            goto L3c
        L3b:
            r4 = r7
        L3c:
            r2 = 12
            r5 = 0
            r0 = r8
            r1 = r9
            r3 = r10
            r6 = r11
            com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp r0 = r0.d(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.ad.h(java.lang.String, com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam, boolean):com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp");
    }

    public final void i(String str) {
        Context context = this.f30934a;
        if (!Cif.c(context)) {
            return;
        }
        if (!com.huawei.openalliance.ad.ppskit.utils.d0.m(context) && !TextUtils.isEmpty(str)) {
            com.huawei.openalliance.ad.ppskit.utils.p2.d(new ld(this, str));
        }
        if (!com.huawei.openalliance.ad.ppskit.utils.m.Z(context)) {
            z6.f F = androidx.activity.n.F(context);
            F.c(str);
            F.i(str);
        }
    }

    public final void j(String str) {
        boolean z10;
        long j10;
        Integer num;
        int i10;
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(this.f30934a);
        if (!com.huawei.openalliance.ad.ppskit.utils.d0.m(this.f30934a)) {
            if (Calendar.getInstance().get(11) < 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                n7.b("ad", "currently is rest, not reportInsApp");
                return;
            }
            n7.b("ad", "report insApp in sdk");
            synchronized (d10.f22585a) {
                j10 = d10.G(str).getLong("last_report_insapp_time", 0L);
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (d10.f22585a) {
                Map<String, String> K = d10.K(str, false);
                if (!a0.a.e0(K)) {
                    num = com.huawei.openalliance.ad.ppskit.utils.y1.q(K.get("scheRefreshIntvl"));
                } else {
                    num = null;
                }
                if (num != null && num.intValue() >= 0) {
                    i10 = num.intValue();
                }
                i10 = 24;
            }
            long j11 = i10;
            if (j11 != 0 && currentTimeMillis - j10 > 3600000 * j11 && d10.I(0, str)) {
                com.huawei.openalliance.ad.ppskit.utils.p2.a(new a(str, d10), 1);
            } else {
                n7.c("ad", "clct app install list to adserver: %s H", Long.valueOf(j11));
            }
        }
    }
}
