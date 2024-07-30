package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.metadata.TouchPoint;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;

/* loaded from: classes2.dex */
public final class v extends r {
    public v(Context context) {
        super(context);
    }

    public final void g(int i10, int i11, ContentRecord contentRecord) {
        try {
            if (contentRecord == null) {
                n7.g("AnalysisReport", "onDownloadClick, contentRecord is null");
                return;
            }
            this.f31723b = contentRecord.n1();
            o f = f(contentRecord);
            if (f == null) {
                return;
            }
            f.f31525a = "14";
            f.f31565s = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, new TouchPoint(i10, i11, contentRecord.i()));
            Context context = this.f31722a;
            ke keVar = new ke(context, zh.a(contentRecord.z0(), context), null);
            keVar.f31382b = contentRecord;
            keVar.t(contentRecord.h1(), f, false, true);
        } catch (Throwable th) {
            e0.i.p(th, "onDownloadClick:", "AnalysisReport");
        }
    }

    public final void h(int i10, ContentRecord contentRecord, String str) {
        try {
            if (contentRecord == null) {
                n7.g("AnalysisReport", "onAppointFailed, contentRecord is null.");
                return;
            }
            o c10 = c(str, true);
            if (c10 == null) {
                return;
            }
            c10.f31525a = "94";
            c10.b(contentRecord.z0());
            c10.f31559p = contentRecord.p2();
            c10.f31561q = contentRecord.h();
            c10.R = contentRecord.i();
            c10.L = i10;
            c10.D = contentRecord.f1();
            Context context = this.f31722a;
            new ke(context, zh.a(contentRecord.z0(), context), null).t(str, c10, false, false);
        } catch (Throwable th) {
            e0.i.p(th, "onAppointSuccess:", "AnalysisReport");
        }
    }

    public final void i(ContentRecord contentRecord, boolean z10) {
        String str;
        try {
            if (contentRecord == null) {
                n7.g("AnalysisReport", "onLandPageOpen, contentRecord is null");
                return;
            }
            o c10 = c(contentRecord.h1(), true);
            c10.f31525a = "109";
            c10.f31559p = contentRecord.p2();
            c10.f31561q = contentRecord.h();
            c10.b(contentRecord.z0());
            c10.R = contentRecord.i();
            c10.S = Integer.valueOf(contentRecord.z());
            c10.f31567t = contentRecord.o1();
            if (z10) {
                str = "1";
            } else {
                str = "0";
            }
            c10.W = str;
            Context context = this.f31722a;
            new ke(context, zh.a(contentRecord.z0(), context), null).t(contentRecord.h1(), c10, false, false);
        } catch (Throwable th) {
            e0.i.p(th, "onLandPageOpen:", "AnalysisReport");
        }
    }

    public final void j(String str, ContentRecord contentRecord) {
        try {
            if (contentRecord == null) {
                n7.g("AnalysisReport", "onAppointFailed, contentRecord is null.");
                return;
            }
            o c10 = c(str, true);
            if (c10 == null) {
                return;
            }
            c10.f31525a = "93";
            c10.b(contentRecord.z0());
            c10.f31559p = contentRecord.p2();
            c10.f31561q = contentRecord.h();
            c10.R = contentRecord.i();
            c10.D = contentRecord.f1();
            Context context = this.f31722a;
            new ke(context, zh.a(contentRecord.z0(), context), null).t(str, c10, false, false);
        } catch (Throwable th) {
            e0.i.p(th, "onAppointSuccess:", "AnalysisReport");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008b A[Catch: all -> 0x00bb, TryCatch #0 {all -> 0x00bb, blocks: (B:2:0x0000, B:3:0x000d, B:6:0x0015, B:8:0x0023, B:10:0x006c, B:12:0x007a, B:13:0x0083, B:14:0x0085, B:16:0x008b, B:18:0x0091, B:20:0x007f, B:25:0x00a6), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(java.lang.String r9, java.lang.String r10, com.huawei.openalliance.ad.ppskit.beans.client.ConfirmResultReq r11, ka.pg r12) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbb
            r0.<init>()     // Catch: java.lang.Throwable -> Lbb
            java.util.List r11 = r11.a()     // Catch: java.lang.Throwable -> Lbb
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> Lbb
        Ld:
            boolean r1 = r11.hasNext()     // Catch: java.lang.Throwable -> Lbb
            android.content.Context r2 = r8.f31722a
            if (r1 == 0) goto La6
            java.lang.Object r1 = r11.next()     // Catch: java.lang.Throwable -> Lbb
            com.huawei.openalliance.ad.ppskit.beans.client.ApiStatisticsReq r1 = (com.huawei.openalliance.ad.ppskit.beans.client.ApiStatisticsReq) r1     // Catch: java.lang.Throwable -> Lbb
            r3 = 0
            ka.o r3 = r8.a(r9, r3)     // Catch: java.lang.Throwable -> Lbb
            if (r3 != 0) goto L23
            return
        L23:
            java.lang.String r4 = "66"
            r3.f31525a = r4     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r4 = "yyyy-MM-dd HH:mm:ss.SSSZ"
            java.text.SimpleDateFormat r4 = com.huawei.openalliance.ad.ppskit.utils.d0.e(r4)     // Catch: java.lang.Throwable -> Lbb
            java.util.Date r5 = new java.util.Date     // Catch: java.lang.Throwable -> Lbb
            long r6 = r1.i()     // Catch: java.lang.Throwable -> Lbb
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r4 = r4.format(r5)     // Catch: java.lang.Throwable -> Lbb
            r3.f31528b = r4     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r4 = r1.m()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r4 = com.huawei.openalliance.ad.ppskit.utils.y1.n(r4)     // Catch: java.lang.Throwable -> Lbb
            r3.f31565s = r4     // Catch: java.lang.Throwable -> Lbb
            r3.H = r10     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r4 = r1.a()     // Catch: java.lang.Throwable -> Lbb
            r3.I = r4     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r4 = r1.d()     // Catch: java.lang.Throwable -> Lbb
            r3.J = r4     // Catch: java.lang.Throwable -> Lbb
            int r4 = r1.f()     // Catch: java.lang.Throwable -> Lbb
            r3.K = r4     // Catch: java.lang.Throwable -> Lbb
            int r4 = r1.g()     // Catch: java.lang.Throwable -> Lbb
            r3.L = r4     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r4 = r1.p()     // Catch: java.lang.Throwable -> Lbb
            r3.M = r4     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r4 = r1.o()     // Catch: java.lang.Throwable -> Lbb
            if (r4 != 0) goto L7f
            com.huawei.openalliance.ad.ppskit.utils.k0 r4 = a0.a.A()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r5 = r2.getPackageName()     // Catch: java.lang.Throwable -> Lbb
            android.util.Pair r4 = r4.b(r2, r5)     // Catch: java.lang.Throwable -> Lbb
            if (r4 == 0) goto L85
            java.lang.Object r4 = r4.first     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lbb
            goto L83
        L7f:
            java.lang.String r4 = r1.o()     // Catch: java.lang.Throwable -> Lbb
        L83:
            r3.A = r4     // Catch: java.lang.Throwable -> Lbb
        L85:
            java.lang.String r4 = r1.n()     // Catch: java.lang.Throwable -> Lbb
            if (r4 == 0) goto L91
            java.lang.String r1 = r1.n()     // Catch: java.lang.Throwable -> Lbb
            r3.Q = r1     // Catch: java.lang.Throwable -> Lbb
        L91:
            java.lang.String r1 = com.huawei.openalliance.ad.ppskit.utils.m.q(r2)     // Catch: java.lang.Throwable -> Lbb
            r3.P = r1     // Catch: java.lang.Throwable -> Lbb
            com.huawei.openalliance.ad.ppskit.handlers.u r1 = com.huawei.openalliance.ad.ppskit.handlers.u.a(r2)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = r1.b()     // Catch: java.lang.Throwable -> Lbb
            r3.N = r1     // Catch: java.lang.Throwable -> Lbb
            r0.add(r3)     // Catch: java.lang.Throwable -> Lbb
            goto Ld
        La6:
            ka.ke r10 = new ka.ke     // Catch: java.lang.Throwable -> Lbb
            r11 = -1
            ka.gi r11 = ka.zh.a(r11, r2)     // Catch: java.lang.Throwable -> Lbb
            r1 = 0
            r10.<init>(r2, r11, r1)     // Catch: java.lang.Throwable -> Lbb
            ka.oe r11 = new ka.oe     // Catch: java.lang.Throwable -> Lbb
            r11.<init>(r10, r0, r9, r12)     // Catch: java.lang.Throwable -> Lbb
            r9 = 1
            com.huawei.openalliance.ad.ppskit.utils.p2.a(r11, r9)     // Catch: java.lang.Throwable -> Lbb
            goto Lc3
        Lbb:
            r9 = move-exception
            java.lang.String r10 = "onApiStatisticsReport:"
            java.lang.String r11 = "AnalysisReport"
            e0.i.p(r9, r10, r11)
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.v.k(java.lang.String, java.lang.String, com.huawei.openalliance.ad.ppskit.beans.client.ConfirmResultReq, ka.pg):void");
    }

    public final void l(String str, String str2, String str3, String str4, String str5) {
        int i10 = 0;
        try {
            o a10 = a(str, true);
            if (a10 == null) {
                return;
            }
            a10.b(1);
            a10.f31525a = str2;
            a10.D = str3;
            a10.E = str4;
            a10.F = str5;
            Context context = this.f31722a;
            new ke(context, new sh(context, i10), null).t(str, a10, false, true);
        } catch (Throwable th) {
            n7.h("AnalysisReport", "onDbSizeReport ex: %s", th.getClass().getSimpleName());
        }
    }

    public final void m(int i10, ContentRecord contentRecord, String str) {
        try {
            if (contentRecord == null) {
                n7.g("AnalysisReport", "onCancelAppointmentSuccess, contentRecord is null.");
                return;
            }
            o c10 = c(str, true);
            if (c10 == null) {
                return;
            }
            c10.f31525a = "95";
            c10.b(contentRecord.z0());
            c10.f31559p = contentRecord.p2();
            c10.f31561q = contentRecord.h();
            c10.R = contentRecord.i();
            c10.L = i10;
            c10.D = contentRecord.f1();
            Context context = this.f31722a;
            new ke(context, zh.a(contentRecord.z0(), context), null).t(str, c10, false, false);
        } catch (Throwable th) {
            e0.i.p(th, "onCancelAppointmentSuccess:", "AnalysisReport");
        }
    }

    public final void n(ContentRecord contentRecord, String str) {
        try {
            if (contentRecord == null) {
                n7.g("AnalysisReport", "onLandingOpenAppDialogCancel, data is null");
                return;
            }
            o f = f(contentRecord);
            if (f == null) {
                return;
            }
            f.f31525a = str;
            f.D = "1";
            Context context = this.f31722a;
            new ke(context, zh.a(contentRecord.z0(), context), null).t(contentRecord.h1(), f, false, true);
        } catch (Throwable th) {
            e0.i.p(th, "onLandPagePopUpReport:", "AnalysisReport");
        }
    }

    public final void o(int i10, ContentRecord contentRecord, String str) {
        try {
            if (contentRecord == null) {
                n7.g("AnalysisReport", "onCancelAppointmentFailed, contentRecord is null.");
                return;
            }
            o c10 = c(str, true);
            if (c10 == null) {
                return;
            }
            c10.f31525a = "96";
            c10.b(contentRecord.z0());
            c10.f31559p = contentRecord.p2();
            c10.f31561q = contentRecord.h();
            c10.R = contentRecord.i();
            c10.L = i10;
            c10.D = contentRecord.f1();
            Context context = this.f31722a;
            new ke(context, zh.a(contentRecord.z0(), context), null).t(str, c10, false, false);
        } catch (Throwable th) {
            e0.i.p(th, "onCancelAppointmentFailed:", "AnalysisReport");
        }
    }
}
