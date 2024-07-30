package com.huawei.openalliance.ad.ppskit.handlers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.ads.consent.inter.Consent;
import com.huawei.openalliance.ad.ppskit.beans.base.ReqBean;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdEventResult;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdEventResultV2;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdTimeStatistics;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Device;
import com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam;
import com.huawei.openalliance.ad.ppskit.beans.server.AppDataCollectionReq;
import com.huawei.openalliance.ad.ppskit.beans.server.EventReportReq;
import com.huawei.openalliance.ad.ppskit.beans.server.EventReportRsp;
import com.huawei.openalliance.ad.ppskit.beans.server.ThirdReportRsp;
import com.huawei.openalliance.ad.ppskit.net.http.Response;
import com.huawei.openalliance.ad.ppskit.net.http.d;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import com.huawei.openalliance.ad.ppskit.utils.i2;
import com.huawei.openalliance.ad.ppskit.utils.k1;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ka.Cif;
import ka.ke;
import ka.n7;
import ka.o6;
import ka.r9;
import ka.s9;
import ka.t9;
import ka.v9;
import ka.x9;
import ka.y9;
import ka.zh;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class i0 implements o6 {

    /* renamed from: k, reason: collision with root package name */
    public static i0 f22551k;

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f22552l = new byte[0];

    /* renamed from: m, reason: collision with root package name */
    public static final HashMap f22553m;

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f22554n;

    /* renamed from: a, reason: collision with root package name */
    public final Context f22555a;

    /* renamed from: b, reason: collision with root package name */
    public final l f22556b;

    /* renamed from: c, reason: collision with root package name */
    public f f22557c;

    /* renamed from: d, reason: collision with root package name */
    public t9 f22558d;

    /* renamed from: e, reason: collision with root package name */
    public v9 f22559e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f22560g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22561h;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f22562i = new byte[0];

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f22563j = new byte[0];

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f22564s;

        public a(Context context) {
            this.f22564s = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            j7.r.w(this.f22564s);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public final /* synthetic */ Response A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ int C;
        public final /* synthetic */ String D;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f22565s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ AdTimeStatistics f22566t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f22567u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f22568v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f22569w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ int f22570x;
        public final /* synthetic */ long y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ boolean f22571z;

        public b(String str, AdTimeStatistics adTimeStatistics, int i10, String str2, String str3, int i11, long j10, boolean z10, Response response, boolean z11, int i12, String str4) {
            this.f22565s = str;
            this.f22566t = adTimeStatistics;
            this.f22567u = i10;
            this.f22568v = str2;
            this.f22569w = str3;
            this.f22570x = i11;
            this.y = j10;
            this.f22571z = z10;
            this.A = response;
            this.B = z11;
            this.C = i12;
            this.D = str4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            int I;
            String str;
            Throwable th;
            String str2;
            int I2;
            String str3;
            Throwable th2;
            String str4;
            String str5;
            ka.u uVar = new ka.u(i0.this.f22555a);
            uVar.f31723b = this.f22565s;
            String q10 = y0.q(null, this.f22566t);
            int i10 = this.f22567u;
            if (i10 >= 200 && i10 < 300 && i10 != 204) {
                z10 = true;
            } else {
                z10 = false;
            }
            Response response = this.A;
            boolean z11 = this.f22571z;
            long j10 = this.y;
            int i11 = this.f22570x;
            String str6 = this.f22569w;
            String str7 = this.f22568v;
            Context context = uVar.f31722a;
            if (z10) {
                if (i11 != 16) {
                    if (response == null) {
                        I2 = 0;
                    } else {
                        try {
                            I2 = response.I();
                        } catch (Throwable th3) {
                            th2 = th3;
                            str3 = "AnalysisReport";
                            e0.i.p(th2, "onAdRequestSuccess:", str3);
                            return;
                        }
                    }
                    ka.o c10 = uVar.c(str7, true);
                    if (c10 != null) {
                        c10.P0 = I2;
                    }
                    if (c10 != null) {
                        str3 = "AnalysisReport";
                        if (I2 == 1) {
                            str4 = "75";
                        } else {
                            if (I2 != 3 && I2 != 5) {
                                if (z11) {
                                    str4 = "28";
                                } else {
                                    str4 = "7";
                                }
                            }
                            str4 = "123";
                        }
                        try {
                            c10.f31525a = str4;
                            if (ConfigSpHandler.b(context).m() || !"28".equals(c10.f31525a)) {
                                if (this.B) {
                                    str5 = "1";
                                } else {
                                    str5 = "0";
                                }
                                c10.W = str5;
                                c10.f31567t = str6;
                                c10.f31565s = "retCode:" + i10;
                                c10.b(i11);
                                c10.N0 = q10;
                                ka.u.p(c10, response, j10);
                                new ke(context, zh.a(i11, context), null).t(str7, c10, false, false);
                                return;
                            }
                            return;
                        } catch (Throwable th4) {
                            th2 = th4;
                            e0.i.p(th2, "onAdRequestSuccess:", str3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            int i12 = this.C;
            String str8 = this.D;
            if (i11 != 16) {
                if (response == null) {
                    I = 0;
                } else {
                    try {
                        I = response.I();
                    } catch (Throwable th5) {
                        th = th5;
                        str = "AnalysisReport";
                        e0.i.p(th, "onAdRequestFail:", str);
                    }
                }
                ka.o c11 = uVar.c(str7, true);
                if (c11 != null) {
                    c11.P0 = I;
                }
                if (c11 != null) {
                    str = "AnalysisReport";
                    if (I == 1) {
                        str2 = "76";
                    } else {
                        if (I != 3 && I != 5) {
                            if (z11) {
                                str2 = "29";
                            } else {
                                str2 = "8";
                            }
                        }
                        str2 = "124";
                    }
                    try {
                        c11.f31525a = str2;
                        if (!"8".equals(str2)) {
                            if (ConfigSpHandler.b(context).m() || !"29".equals(c11.f31525a)) {
                                c11.f31567t = str6;
                                c11.f31565s = "httpCode:" + i12 + ", reason:" + str8 + ", retCode:" + i10;
                                c11.b(i11);
                                ka.u.p(c11, response, j10);
                                new ke(context, zh.a(i11, context), null).t(str7, c11, false, true);
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        e0.i.p(th, "onAdRequestFail:", str);
                    }
                }
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f22553m = hashMap;
        HashMap hashMap2 = new HashMap();
        f22554n = hashMap2;
        hashMap.put(3, 30458300);
        hashMap.put(9, 30459100);
        hashMap2.put(3, 130458305);
        hashMap2.put(9, 130459100);
    }

    public i0(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f22555a = applicationContext;
        this.f22556b = l.d(context);
        p2.a(new a(applicationContext), 2);
    }

    public static i0 d(Context context) {
        i0 i0Var;
        synchronized (f22552l) {
            if (f22551k == null) {
                f22551k = new i0(context);
            }
            i0Var = f22551k;
        }
        return i0Var;
    }

    public static void l(EventReportRsp eventReportRsp, EventReportRsp eventReportRsp2) {
        if (eventReportRsp != null) {
            if (eventReportRsp.responseCode == 0) {
                eventReportRsp2.responseCode = 0;
            }
            List<AdEventResultV2> r10 = eventReportRsp2.r();
            if (r10 == null) {
                r10 = new ArrayList<>();
            }
            List<AdEventResult> k10 = eventReportRsp2.k();
            if (k10 == null) {
                k10 = new ArrayList<>();
            }
            List<AdEventResult> k11 = eventReportRsp.k();
            if (k11 != null) {
                k10.addAll(k11);
            }
            List<AdEventResultV2> r11 = eventReportRsp.r();
            if (r11 != null) {
                r10.addAll(r11);
            }
            eventReportRsp2.l(k10);
            eventReportRsp2.q(r10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0319, code lost:
    
        if ((r2 == null || !r2.booleanValue()) != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x071f, code lost:
    
        if ("00000000-0000-0000-0000-000000000000".equals(r1) == false) goto L335;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x060e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0656 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0067  */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [int] */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r1v14, types: [com.huawei.openalliance.ad.ppskit.handlers.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.openalliance.ad.ppskit.beans.server.AdContentReq a(java.lang.String r36, int r37, com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam r38, java.util.List r39, java.util.ArrayList r40, java.lang.String r41) {
        /*
            Method dump skipped, instructions count: 1884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.handlers.i0.a(java.lang.String, int, com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam, java.util.List, java.util.ArrayList, java.lang.String):com.huawei.openalliance.ad.ppskit.beans.server.AdContentReq");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.openalliance.ad.ppskit.beans.server.EventReportRsp b(java.lang.String r9, java.util.ArrayList r10) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.handlers.i0.b(java.lang.String, java.util.ArrayList):com.huawei.openalliance.ad.ppskit.beans.server.EventReportRsp");
    }

    public final ThirdReportRsp c(String str, String str2) {
        String str3;
        if (y1.h(str2)) {
            n7.i("i0", "fail to report to thirdParty event, thirdParty url is empty");
            return null;
        }
        try {
            v9 o = o(str);
            int i10 = 0;
            Integer q10 = androidx.transition.n.q(7, 0, this.f22556b.J(str));
            if (q10 != null) {
                q10.intValue();
            }
            Response a10 = o.a();
            ThirdReportRsp thirdReportRsp = new ThirdReportRsp();
            int a11 = a10.a();
            thirdReportRsp.a(a11);
            if ((a11 < 200 || a11 >= 300) && a11 != 302) {
                i10 = 1;
            }
            thirdReportRsp.responseCode = i10;
            thirdReportRsp.errorReason = a10.s();
            return thirdReportRsp;
        } catch (IllegalArgumentException unused) {
            str3 = "reportThirdPartyEvent IllegalArgumentException";
            n7.g("i0", str3);
            return null;
        } catch (Exception unused2) {
            str3 = "reportThirdPartyEvent exception";
            n7.g("i0", str3);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.openalliance.ad.ppskit.net.http.Response<com.huawei.openalliance.ad.ppskit.beans.server.AdContentRsp> e(java.lang.String r12, int r13, java.lang.String r14, com.huawei.openalliance.ad.ppskit.beans.server.AdContentReq r15) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.handlers.i0.e(java.lang.String, int, java.lang.String, com.huawei.openalliance.ad.ppskit.beans.server.AdContentReq):com.huawei.openalliance.ad.ppskit.net.http.Response");
    }

    public final e6.c f(SourceParam sourceParam) {
        return new za.c(this.f22555a, sourceParam).e();
    }

    public final HashMap g(ReqBean reqBean, String str, String str2) {
        Pair<Integer, Pair<String, String>> pair;
        Pair pair2;
        y9 y9Var = new y9(this.f22555a);
        y9Var.f32216d = this.f22556b.k();
        y9Var.b("X-HW-AD-Sdkver", "3.4.65.300");
        y9Var.b("X-HW-AD-Pkgname", str);
        y9Var.b("X-HW-AD-Osver", Build.VERSION.RELEASE);
        if (!TextUtils.isEmpty(str2)) {
            y9Var.b("X-HW-AD-Appsdkver", str2);
        }
        if (y9Var.f32216d && !Cif.c(y9Var.f32215c) && Cif.a(y9Var.f32215c).d() && !TextUtils.isEmpty(null)) {
            y9Var.b("X-HW-AD-Androidid", null);
        }
        d a10 = d.a(y9Var.f32215c);
        synchronized (a10.f22516a) {
            pair = a10.f22520e;
        }
        if (pair == null) {
            pair = k1.h(y9Var.f32215c);
        }
        if (pair != null && (pair2 = (Pair) pair.second) != null) {
            y9Var.b("X-HW-AD-Mcc", (String) pair2.first);
            y9Var.b("X-HW-AD-Mnc", (String) pair2.second);
        }
        if (reqBean instanceof EventReportReq) {
            y9Var.b("User-Agent", i2.m(y9Var.f32215c));
        }
        y9Var.d(str, reqBean);
        return y9Var.a();
    }

    public final HashMap h(String str, AppDataCollectionReq appDataCollectionReq) {
        y9 y9Var = new y9(this.f22555a);
        y9Var.b("X-HW-AD-Sdkver", "3.4.65.300");
        y9Var.b("X-HW-App-Id", "100003");
        y9Var.d(str, appDataCollectionReq);
        return y9Var.a();
    }

    public final t9 i(String str) {
        t9 t9Var;
        synchronized (this.f22562i) {
            boolean z10 = x9.a(this.f22555a).f32180b;
            if (this.f22558d == null || z10 != this.f22561h || this.f != this.f22556b.L(str)) {
                this.f = this.f22556b.L(str);
                r();
            }
            t9Var = this.f22558d;
        }
        return t9Var;
    }

    public final void j(Device device, String str, AdSlotParam adSlotParam) {
        boolean z10;
        boolean z11;
        int i10;
        l3.d dVar;
        Pair pair;
        boolean z12 = true;
        if ((TextUtils.equals("1", device.D()) && !TextUtils.isEmpty(device.C())) || (TextUtils.equals("1", device.c()) && !TextUtils.isEmpty(device.b()))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            i10 = 9;
        } else {
            l lVar = this.f22556b;
            synchronized (lVar.f22585a) {
                Map<String, String> K = lVar.K(str, false);
                if (K != null && K.get("rptAdReqGrpId") != null && !TextUtils.equals("0", K.get("rptAdReqGrpId")) && TextUtils.equals("1", K.get("rptAdReqGrpId"))) {
                    z11 = true;
                }
                z11 = false;
            }
            if (!z11) {
                i10 = 7;
            } else if (1 == i2.j(this.f22555a, true)) {
                i10 = 6;
            } else {
                i10 = 0;
            }
        }
        String str2 = "";
        if (i10 == 0) {
            if (a0.a.C0 != null) {
                dVar = a0.a.C0;
            } else {
                synchronized (a0.a.D0) {
                    if (a0.a.C0 == null) {
                        a0.a.C0 = new l3.d();
                    }
                    dVar = a0.a.C0;
                }
            }
            Context context = this.f22555a;
            dVar.getClass();
            try {
                pair = a0.a.x(context.getApplicationContext());
            } catch (Throwable th) {
                n7.h("NonHmsGroupIdAccessor", "getGroupId ex: %s", th.getClass().getSimpleName());
                pair = new Pair("", 2);
            }
            str2 = (String) pair.first;
            i10 = ((Integer) pair.second).intValue();
            if (!TextUtils.isEmpty(str2)) {
                device.A(null);
                device.F(null);
                l lVar2 = this.f22556b;
                synchronized (lVar2.f22585a) {
                    Map<String, String> K2 = lVar2.K(str, false);
                    if (K2 != null && K2.get("rtpOtherIdWithGrpId") != null && !TextUtils.equals("0", K2.get("rtpOtherIdWithGrpId")) && TextUtils.equals("1", K2.get("rtpOtherIdWithGrpId"))) {
                    }
                    z12 = false;
                }
                if (!z12) {
                    device.w();
                    device.H();
                    device.y();
                    device.e();
                    device.g(null);
                }
            }
        }
        device.h(str2);
        adSlotParam.M(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(com.huawei.openalliance.ad.ppskit.beans.server.AdContentReq r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.handlers.i0.k(com.huawei.openalliance.ad.ppskit.beans.server.AdContentReq, java.lang.String, boolean, boolean):void");
    }

    public final void m(String str, String str2, int i10, String str3, int i11, int i12, String str4, long j10, boolean z10, Response response, AdTimeStatistics adTimeStatistics, boolean z11) {
        p2.d(new b(str2, adTimeStatistics, i11, str, str3, i10, j10, z10, response, z11, i12, str4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ad, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.huawei.openalliance.ad.ppskit.beans.metadata.App] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15, types: [com.huawei.openalliance.ad.ppskit.beans.metadata.Device] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.openalliance.ad.ppskit.beans.server.AppConfigReq n(java.lang.String r8, java.lang.String r9, y1.g r10) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.handlers.i0.n(java.lang.String, java.lang.String, y1.g):com.huawei.openalliance.ad.ppskit.beans.server.AppConfigReq");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r1 != r4) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ka.v9 o(java.lang.String r6) {
        /*
            r5 = this;
            byte[] r0 = r5.f22563j
            monitor-enter(r0)
            ka.v9 r1 = r5.f22559e     // Catch: java.lang.Throwable -> L38
            r2 = 0
            r3 = 6
            if (r1 == 0) goto L1f
            int r1 = r5.f22560g     // Catch: java.lang.Throwable -> L38
            com.huawei.openalliance.ad.ppskit.handlers.l r4 = r5.f22556b     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = r4.J(r6)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r4 = androidx.transition.n.q(r3, r2, r4)     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L1c
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L38
            goto L1d
        L1c:
            r4 = r2
        L1d:
            if (r1 == r4) goto L34
        L1f:
            com.huawei.openalliance.ad.ppskit.handlers.l r1 = r5.f22556b     // Catch: java.lang.Throwable -> L38
            java.lang.String r6 = r1.J(r6)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r6 = androidx.transition.n.q(r3, r2, r6)     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L2f
            int r2 = r6.intValue()     // Catch: java.lang.Throwable -> L38
        L2f:
            r5.f22560g = r2     // Catch: java.lang.Throwable -> L38
            r5.p()     // Catch: java.lang.Throwable -> L38
        L34:
            ka.v9 r6 = r5.f22559e     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            return r6
        L38:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.handlers.i0.o(java.lang.String):ka.v9");
    }

    public final void p() {
        n7.f("i0", "createThirdRequester lib switch: %d", Integer.valueOf(this.f22560g));
        d.b bVar = new d.b(this.f22555a);
        bVar.f = this.f22560g;
        bVar.f22764e = new s9();
        bVar.f22765g = true;
        bVar.f22766h = false;
        this.f22559e = (v9) new com.huawei.openalliance.ad.ppskit.net.http.d(bVar).b(v9.class);
    }

    public final int q(String str) {
        String str2;
        Context context = this.f22555a;
        if (!com.huawei.openalliance.ad.ppskit.utils.d0.m(context) && com.huawei.openalliance.ad.ppskit.utils.d0.u()) {
            Integer npaAccordingToServerConsent = Consent.getInstance(context).getNpaAccordingToServerConsent();
            if (npaAccordingToServerConsent != null) {
                n7.f("i0", "fat sdk, got npa according to server consent: %s", npaAccordingToServerConsent);
                return npaAccordingToServerConsent.intValue();
            }
            str2 = "fat sdk, no cached consent status.";
        } else {
            l lVar = this.f22556b;
            if (!lVar.z(str)) {
                str2 = "need consent: false";
            } else {
                int intValue = lVar.s(str).intValue();
                if (2 == intValue) {
                    return -1;
                }
                n7.f("i0", "got npa according to consent result status: %s", Integer.valueOf(intValue));
                return intValue;
            }
        }
        n7.e("i0", str2);
        return -1;
    }

    public final void r() {
        int i10;
        x9 a10 = x9.a(this.f22555a);
        boolean z10 = a10.f32180b;
        boolean z11 = a10.f32181c;
        if (z10) {
            i10 = 2;
        } else {
            i10 = this.f;
        }
        this.f22561h = z10;
        n7.f("i0", "isNetworkKitEnable: %s, isQuicEnable: %s, lib switch: %s", Boolean.valueOf(z10), Boolean.valueOf(z11), Integer.valueOf(this.f));
        d.b bVar = new d.b(this.f22555a);
        bVar.f = i10;
        bVar.f22763d = new r9();
        bVar.f22764e = new s9();
        bVar.f22767i = z11;
        this.f22558d = (t9) new com.huawei.openalliance.ad.ppskit.net.http.d(bVar).b(t9.class);
    }

    public final void s(String str) {
        if (this.f22557c == null) {
            this.f22557c = f.a(this.f22555a);
        }
        f fVar = this.f22557c;
        if (fVar != null) {
            if (y1.h(str)) {
                n7.b("ReportSpHandler", "saveConfigMapSmartImpDelay(), configMap is blank");
                return;
            }
            try {
                String str2 = (String) new JSONObject(str).get("smartImpDelay");
                if (!y1.h(str2)) {
                    n7.b("ReportSpHandler", "saveConfigMapSmartImpDelay(), hasSmartImpDelay:" + str2);
                    String[] split = str2.trim().split(",");
                    if (split.length > 1) {
                        int intValue = Integer.valueOf(split[0]).intValue();
                        synchronized (fVar.f22533a) {
                            fVar.b().edit().putInt("minSmartImpDelay", intValue).commit();
                        }
                        int intValue2 = Integer.valueOf(split[1]).intValue();
                        synchronized (fVar.f22533a) {
                            fVar.b().edit().putInt("maxSmartImpDelay", intValue2).commit();
                        }
                    }
                }
            } catch (Throwable th) {
                e0.i.p(th, "saveConfigMapSmartImpDelay(), exception:", "ReportSpHandler");
            }
        }
    }
}
