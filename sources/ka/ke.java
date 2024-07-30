package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.av;
import com.huawei.openalliance.ad.ppskit.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.ppskit.beans.inner.DownloadBlockInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdEventResult;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdEventResultV2;
import com.huawei.openalliance.ad.ppskit.beans.metadata.FeedbackInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.PostBackEvent;
import com.huawei.openalliance.ad.ppskit.beans.server.EventReportRsp;
import com.huawei.openalliance.ad.ppskit.db.bean.AdSampleRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.EventRecord;
import com.huawei.openalliance.ad.ppskit.handlers.ConfigSpHandler;
import com.huawei.openalliance.ad.ppskit.inter.data.MaterialClickInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class ke implements lg {

    /* renamed from: a, reason: collision with root package name */
    public final gi f31381a;

    /* renamed from: b, reason: collision with root package name */
    public ContentRecord f31382b;

    /* renamed from: c, reason: collision with root package name */
    public final ce f31383c;

    /* renamed from: d, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.i0 f31384d;

    /* renamed from: e, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.l f31385e;
    public final com.huawei.openalliance.ad.ppskit.handlers.f f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f31386g;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ PostBackEvent f31387s;

        public a(PostBackEvent postBackEvent) {
            this.f31387s = postBackEvent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ke keVar = ke.this;
            Context context = keVar.f31386g;
            PostBackEvent postBackEvent = this.f31387s;
            postBackEvent.getClass();
            if (com.huawei.openalliance.ad.ppskit.handlers.x.j(context)) {
                com.huawei.openalliance.ad.ppskit.handlers.x.g(keVar.f31386g, postBackEvent);
            }
        }
    }

    public ke(Context context, gi giVar, ContentRecord contentRecord) {
        Context applicationContext = context.getApplicationContext();
        this.f31386g = applicationContext;
        this.f31381a = giVar;
        this.f31384d = com.huawei.openalliance.ad.ppskit.handlers.i0.d(context);
        this.f31382b = contentRecord;
        this.f31383c = new ce(context);
        this.f31385e = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
        this.f = com.huawei.openalliance.ad.ppskit.handlers.f.a(applicationContext);
    }

    public static EventRecord a(ke keVar, o oVar) {
        String str;
        int i10;
        if (!keVar.f31385e.k()) {
            n7.j("EventProcessor", "fail to create %s analysis event, not enable userInfo.", com.anythink.expressad.foundation.d.f.f9575i);
        } else {
            try {
                EventRecord eventRecord = new EventRecord();
                Integer num = oVar.f31569u;
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = -1;
                }
                eventRecord.P0(i10);
                eventRecord.N0(com.anythink.expressad.foundation.d.f.f9575i);
                eventRecord.Q0(System.currentTimeMillis());
                eventRecord.Y0(oVar.e());
                eventRecord.z1(oVar.f31552l);
                n7.f("EventProcessor", "pkg: %s, create event, type is : %s", oVar.f31552l, "exception " + oVar.toString());
                return eventRecord;
            } catch (RuntimeException unused) {
                str = "createAnalysisEvent RuntimeException";
                n7.i("EventProcessor", str);
                return null;
            } catch (Exception unused2) {
                str = "createAnalysisEvent error";
                n7.i("EventProcessor", str);
                return null;
            }
        }
        return null;
    }

    public static String b(int i10, ContentRecord contentRecord, String str) {
        StringBuilder sb2 = new StringBuilder();
        if (contentRecord == null) {
            return sb2.toString();
        }
        sb2.append(contentRecord.z0());
        sb2.append("_");
        sb2.append(contentRecord.h());
        sb2.append("_");
        String o12 = contentRecord.o1();
        if (!TextUtils.isEmpty(o12)) {
            sb2.append(o12);
            sb2.append("_");
        }
        if (i10 == 2 || (i10 == 1 && TextUtils.isEmpty(o12))) {
            sb2.append(contentRecord.j2());
            sb2.append("_");
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static boolean s(ke keVar, EventReportRsp eventReportRsp) {
        keVar.getClass();
        if (eventReportRsp.p() != null && eventReportRsp.p().intValue() == 0) {
            return true;
        }
        List<AdEventResult> k10 = eventReportRsp.k();
        List<AdEventResultV2> r10 = eventReportRsp.r();
        if (androidx.transition.n.M(k10) && androidx.transition.n.M(r10)) {
            n7.i("EventProcessor", "real time report failed");
        } else if (androidx.transition.n.M(r10)) {
            for (AdEventResult adEventResult : k10) {
                if (adEventResult == null || 200 == adEventResult.b()) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean v(EventRecord eventRecord, String str) {
        if (eventRecord != null) {
            return false;
        }
        n7.j("EventProcessor", "fail to create %s event record", str);
        return true;
    }

    public static String w(ke keVar) {
        boolean isEmpty = TextUtils.isEmpty(keVar.f31382b.w1());
        ContentRecord contentRecord = keVar.f31382b;
        if (!isEmpty) {
            return contentRecord.w1();
        }
        return contentRecord.h1();
    }

    public final void A(String str) {
        ContentRecord contentRecord = this.f31382b;
        if (contentRecord != null && contentRecord.Y0()) {
            String h12 = this.f31382b.h1();
            String b10 = b(androidx.transition.n.Y(this.f31382b.q0()), this.f31382b, str);
            n7.f("EventProcessor", "vastMonitor, key: %s", b10);
            Context context = this.f31386g;
            if (l9.a(context, h12).b(this.f31382b.z0(), b10)) {
                if (n7.d()) {
                    n7.c("EventProcessor", "event %s has reported", str);
                }
            } else {
                EventRecord z10 = z(str);
                if (z10 == null) {
                    return;
                }
                zf z11 = androidx.transition.n.z(context, this.f31381a, str);
                z11.i().execute(new com.huawei.openalliance.ad.ppskit.utils.b2(new ag(z11, z10, this.f31382b)));
            }
        }
    }

    public final void c(int i10, long j10) {
        EventRecord z10 = z("webclose");
        if (v(z10, "webclose")) {
            return;
        }
        z10.a1(i10);
        z10.o0(j10);
        androidx.transition.n.z(this.f31386g, this.f31381a, z10.i()).k(z10.i(), z10, true, this.f31382b);
    }

    public final void d(int i10, String str) {
        EventRecord z10 = z("adPreCheck");
        if (v(z10, "adPreCheck")) {
            return;
        }
        if (n7.d()) {
            n7.c("EventProcessor", "onPreCheckResult result: %d contentid: %s", Integer.valueOf(i10), this.f31382b.h());
        }
        if (!TextUtils.isEmpty(str)) {
            z10.x1(str);
        }
        z10.t1(String.valueOf(i10));
        androidx.transition.n.z(this.f31386g, this.f31381a, z10.i()).k(z10.i(), z10, true, this.f31382b);
    }

    public final void e(ContentRecord contentRecord, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (contentRecord != null && (contentRecord.z0() == 12 || contentRecord.z0() == 7)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && !TextUtils.isEmpty(contentRecord.h()) && TextUtils.equals("imp", str)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            return;
        }
        String h12 = contentRecord.h1();
        Context context = this.f31386g;
        if (com.huawei.openalliance.ad.ppskit.handlers.l.d(context).n(h12) && !Cif.a(context).d()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            n7.c("EventProcessor", "use Cached Content is %s ", contentRecord.h());
            ce ceVar = this.f31383c;
            ceVar.getClass();
            com.huawei.openalliance.ad.ppskit.utils.p2.a(new de(ceVar, contentRecord), 0);
        }
    }

    public final void f(EventRecord eventRecord) {
        PostBackEvent postBackEvent;
        if (eventRecord != null && this.f31382b != null) {
            postBackEvent = new PostBackEvent();
            postBackEvent.d(eventRecord.K());
            postBackEvent.f(eventRecord.l1());
            postBackEvent.h(this.f31382b.p2());
            postBackEvent.n(eventRecord.i());
            postBackEvent.j(eventRecord.g0());
            postBackEvent.l(eventRecord.i1());
            postBackEvent.b(eventRecord.Z0());
            postBackEvent.c(eventRecord.m0());
            postBackEvent.g(eventRecord.g1());
        } else {
            postBackEvent = null;
        }
        if (postBackEvent == null || com.huawei.openalliance.ad.ppskit.utils.m.Z(this.f31386g)) {
            return;
        }
        com.huawei.openalliance.ad.ppskit.utils.p2.a(new a(postBackEvent), 0);
    }

    public final void g(EventRecord eventRecord, String str, Long l10, Integer num, Integer num2, Boolean bool, ge geVar) {
        ContentRecord contentRecord;
        ContentRecord contentRecord2;
        int i10;
        String j22;
        if (n7.d()) {
            Object[] objArr = new Object[5];
            objArr[0] = str;
            objArr[1] = l10;
            objArr[2] = num;
            ContentRecord contentRecord3 = this.f31382b;
            if (contentRecord3 == null) {
                j22 = "";
            } else {
                j22 = contentRecord3.j2();
            }
            objArr[3] = j22;
            objArr[4] = num2;
            n7.c("EventProcessor", "onAdImpEvent type: %s duration: %s ratio: %s showId: %s source: %s", objArr);
        }
        ContentRecord contentRecord4 = this.f31382b;
        if (contentRecord4 != null && (contentRecord4.z0() == 1 || this.f31382b.z0() == 18)) {
            eventRecord.f1(this.f31382b.m0());
        }
        if (l10 != null) {
            eventRecord.o0(l10.longValue());
        }
        if (num != null) {
            eventRecord.L0(num.intValue());
        }
        if (num2 != null) {
            eventRecord.v1(String.valueOf(num2));
        }
        if (("imp".equals(str) || "supplementImp".equals(str)) && (contentRecord = this.f31382b) != null) {
            eventRecord.D1(contentRecord.J0());
        }
        boolean equals = str.equals("imp");
        Context context = this.f31386g;
        if ((equals || "supplementImp".equals(str)) && (contentRecord2 = this.f31382b) != null && contentRecord2.j0() != null) {
            String packageName = this.f31382b.j0().getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                if (com.huawei.openalliance.ad.ppskit.utils.o2.c(context, packageName)) {
                    i10 = 10;
                } else {
                    i10 = 11;
                }
                eventRecord.t1(String.valueOf(i10));
                n7.c("EventProcessor", "appStatus: %s", Integer.valueOf(i10));
            }
        }
        if (geVar != null) {
            n7.e("EventProcessor", "add eventExtInfo data");
            Integer num3 = geVar.f31220a;
            if (num3 != null && num3.intValue() >= 0) {
                eventRecord.j1(num3.intValue());
            }
            Integer num4 = geVar.f31221b;
            if (num4 != null && num4.intValue() >= 0) {
                eventRecord.Y(String.valueOf(num4));
            }
            eventRecord.b0(geVar.f31222c);
        }
        gi giVar = this.f31381a;
        zf z10 = androidx.transition.n.z(context, giVar, str);
        if (bool != null && !bool.booleanValue()) {
            z10.d(str, eventRecord, !"imp".equals(str), this.f31382b);
        } else {
            z10.k(str, eventRecord, !"imp".equals(str), this.f31382b);
        }
        if ("imp".equals(str)) {
            giVar.b(eventRecord.K());
            yd ydVar = new yd(context, this.f31382b);
            AdSampleRecord e10 = ydVar.e("imp");
            if (!yd.c(e10, "imp")) {
                e10.F().o(l10);
                e10.F().y(num);
                e10.F().B(String.valueOf(num2));
                ydVar.a(e10);
            }
        }
        if (str.equals("imp") || str.equals("repeatedImp")) {
            x(str);
        }
        f(eventRecord);
    }

    public final void h(EventRecord eventRecord, vf vfVar) {
        eventRecord.T0(vfVar.f32011a);
        eventRecord.W0(vfVar.f32012b);
        String str = vfVar.f32013c;
        eventRecord.r0(str);
        MaterialClickInfo materialClickInfo = vfVar.f32015e;
        Integer num = vfVar.f32014d;
        if (materialClickInfo != null) {
            eventRecord.n1(num.toString());
        }
        String i10 = eventRecord.i();
        n7.c("onAdClick", "cacheAndReportEvent, clickSource: %s", num);
        Context context = this.f31386g;
        androidx.transition.n.z(context, this.f31381a, i10).k(i10, eventRecord, false, this.f31382b);
        if ("click".equals(i10)) {
            yd ydVar = new yd(context, this.f31382b);
            AdSampleRecord e10 = ydVar.e("click");
            if (!yd.c(e10, "click")) {
                e10.F().b(Integer.valueOf(vfVar.f32017h));
                e10.F().g(Integer.valueOf(vfVar.f32018i));
                e10.F().k(Integer.valueOf(vfVar.f32019j));
                e10.F().t(str);
                ydVar.a(e10);
            }
        }
        if ("click".equals(i10) || "repeatedClick".equals(i10)) {
            x(i10);
        }
        f(eventRecord);
    }

    public final void i(Integer num, Integer num2, String str) {
        EventRecord z10 = z(str);
        if (v(z10, str)) {
            return;
        }
        if (num != null) {
            z10.h1(num.toString());
        }
        if (num2 != null) {
            z10.k1(num2.toString());
        }
        Context context = this.f31386g;
        zf z11 = androidx.transition.n.z(context, this.f31381a, str);
        if ("intentSuccess".equals(str)) {
            z11.k(str, z10, false, this.f31382b);
            yd ydVar = new yd(context, this.f31382b);
            AdSampleRecord e10 = ydVar.e("intentSuccess");
            if (!yd.c(e10, "intentSuccess")) {
                ydVar.a(e10);
                return;
            }
            return;
        }
        z11.d(str, z10, true, this.f31382b);
    }

    public final void j(Integer num, Integer num2, String str, String str2, String str3) {
        EventRecord z10 = z(av.ag);
        boolean v3 = v(z10, av.ag);
        Context context = this.f31386g;
        if (!v3) {
            n7.e("EventProcessor", " install source=" + num);
            n7.c("EventProcessor", "reportInstallEvent type: %s source: %s agVerifyCode: %s installType: %s", av.ag, num, str, str2);
            if (num != null) {
                z10.q1(num.toString());
            }
            if (num2 != null) {
                z10.n1(num2.toString());
            }
            if (str != null) {
                z10.I(str);
            }
            if (str2 != null) {
                z10.L(str2);
            }
            z10.W(com.huawei.openalliance.ad.ppskit.utils.y1.x(str3));
            androidx.transition.n.z(context, this.f31381a, av.ag).k(av.ag, z10, false, this.f31382b);
        }
        yd ydVar = new yd(context, this.f31382b);
        AdSampleRecord e10 = ydVar.e(av.ag);
        if (!yd.c(e10, av.ag)) {
            ydVar.a(e10);
        }
    }

    public final void k(String str, int i10, String str2, boolean z10) {
        int i11;
        p pVar = new p(this.f31386g);
        Integer valueOf = Integer.valueOf(i10);
        ContentRecord contentRecord = this.f31382b;
        Context context = pVar.f31722a;
        try {
            if (ConfigSpHandler.b(context).m()) {
                if (contentRecord == null) {
                    n7.g("AnalysisReport", "onAdEventMonitor, contentRecord is null.");
                    return;
                }
                o c10 = pVar.c(contentRecord.h1(), true);
                if (c10 != null) {
                    c10.f31525a = "99";
                    int z02 = contentRecord.z0();
                    c10.b(z02);
                    c10.f31561q = contentRecord.h();
                    c10.f31567t = contentRecord.o1();
                    c10.D = str;
                    if (valueOf != null) {
                        c10.E = valueOf.toString();
                    }
                    c10.F = str2;
                    c10.U = contentRecord.j2();
                    if (z10) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    c10.K = i11;
                    if (n7.d()) {
                        n7.c("AnalysisReport", "filterEvent eventType: %s, result: %s", str, Integer.valueOf(c10.K));
                    }
                    new ke(context, zh.a(z02, context), null).t(contentRecord.h1(), c10, false, true);
                }
            }
        } catch (Throwable th) {
            e0.i.p(th, "onAdEventMonitor:", "AnalysisReport");
        }
    }

    public final void l(String str, long j10, long j11, int i10, int i11, String str2) {
        n7.c("EventProcessor", "reportVideoPlayState eventType: %s startTime: %d, endtime: %d startProgress: %d endProgress: %d", str, Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10), Integer.valueOf(i11));
        EventRecord z10 = z(str);
        if (v(z10, str)) {
            return;
        }
        z10.H0(j10);
        z10.M0(j11);
        z10.a(i10);
        z10.G0(i11);
        z10.O1(str2);
        ContentRecord contentRecord = this.f31382b;
        if (contentRecord != null) {
            z10.D1(contentRecord.J0());
        }
        String i12 = z10.i();
        Context context = this.f31386g;
        androidx.transition.n.z(context, this.f31381a, i12).k(z10.i(), z10, false, this.f31382b);
        yd ydVar = new yd(context, this.f31382b);
        AdSampleRecord e10 = ydVar.e(str);
        if (!yd.c(e10, str)) {
            e10.F().h(Long.valueOf(j10));
            e10.F().l(Long.valueOf(j11));
            e10.F().n(Integer.valueOf(i10));
            e10.F().q(Integer.valueOf(i11));
            ydVar.a(e10);
        }
    }

    public final void m(String str, AdEventReport adEventReport) {
        ge geVar;
        Long T = adEventReport.T();
        Integer X = adEventReport.X();
        Integer b02 = adEventReport.b0();
        String P0 = adEventReport.P0();
        Long f = adEventReport.f();
        Boolean b10 = adEventReport.b();
        String v3 = adEventReport.v();
        if (!com.huawei.openalliance.ad.ppskit.utils.y1.h(v3)) {
            ge geVar2 = new ge();
            geVar2.f31222c = v3;
            geVar = geVar2;
        } else {
            geVar = null;
        }
        o(str, T, X, b02, P0, f, b10, geVar);
    }

    public final void n(String str, Integer num, String str2, boolean z10, boolean z11, Integer num2, DownloadBlockInfo downloadBlockInfo, String str3, String str4, String str5) {
        ContentRecord contentRecord;
        EventRecord z12 = z(str);
        if (v(z12, str)) {
            return;
        }
        if ("download".equalsIgnoreCase(str) && (contentRecord = this.f31382b) != null) {
            z12.O1(contentRecord.M0());
            z12.Q1(this.f31382b.N0());
        }
        n7.c("EventProcessor", "reportDownloadOrOpenEvent type: %s source: %s reason: %s blockInfo: %s installActionSource: %s agVerifyCode: %s installType: %s", str, num, num2, downloadBlockInfo, str2, str3, str4);
        n7.e("EventProcessor", "source=" + num);
        if (num != null) {
            z12.n1(num.toString());
        }
        z12.q1(str2);
        if (num2 != null) {
            z12.B1(String.valueOf(num2));
        }
        if (str3 != null) {
            z12.I(str3);
        }
        if (str4 != null) {
            z12.L(str4);
        }
        z12.W(com.huawei.openalliance.ad.ppskit.utils.y1.x(str5));
        if (downloadBlockInfo != null) {
            z12.D1(String.valueOf(downloadBlockInfo.d()));
            z12.F1(String.valueOf(downloadBlockInfo.f()));
            z12.H1(String.valueOf(downloadBlockInfo.g() ? 1 : 0));
        }
        zf z13 = androidx.transition.n.z(this.f31386g, this.f31381a, z12.i());
        String i10 = z12.i();
        ContentRecord contentRecord2 = this.f31382b;
        if (z10) {
            z13.k(i10, z12, z11, contentRecord2);
        } else {
            z13.d(i10, z12, z11, contentRecord2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(java.lang.String r17, java.lang.Long r18, java.lang.Integer r19, java.lang.Integer r20, java.lang.String r21, java.lang.Long r22, java.lang.Boolean r23, ka.ge r24) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.ke.o(java.lang.String, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.Boolean, ka.ge):void");
    }

    public final void p(String str, o oVar, boolean z10, boolean z11) {
        t(str, oVar, z10, z11);
    }

    public final void q(List<FeedbackInfo> list) {
        gi giVar = this.f31381a;
        Context context = this.f31386g;
        EventRecord z10 = z("userclose");
        if (v(z10, "userclose")) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (!androidx.transition.n.M(list)) {
                for (FeedbackInfo feedbackInfo : list) {
                    if (feedbackInfo != null && (1 == feedbackInfo.b() || 3 == feedbackInfo.b())) {
                        arrayList.add(feedbackInfo.a());
                        arrayList2.add(String.valueOf(feedbackInfo.k()));
                    }
                }
            }
            if (!androidx.transition.n.M(arrayList)) {
                n7.c("EventProcessor", "onAdClose, selectedKeyWords: %s", arrayList.toString());
            }
            if (!androidx.transition.n.M(arrayList2)) {
                n7.c("EventProcessor", "onAdClose, selectedKeyWordsType: %s", arrayList2.toString());
            }
            z10.T0(0);
            z10.W0(0);
            z10.s0(arrayList);
            z10.J0(arrayList2);
            androidx.transition.n.z(context, giVar, z10.i()).k(z10.i(), z10, false, this.f31382b);
            giVar.c(z10.K());
            new yd(context, this.f31382b).b(arrayList);
            f(z10);
        } catch (Throwable th) {
            n7.h("EventProcessor", "onAdClose error, %s", th.getClass().getSimpleName());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(ka.vf r8) {
        /*
            r7 = this;
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r0 = r7.f31382b
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            com.huawei.openalliance.ad.ppskit.beans.metadata.CtrlExt r0 = r0.Q1()
        La:
            r1 = 0
            if (r0 != 0) goto Lf
            r0 = r1
            goto L19
        Lf:
            java.lang.String r2 = "1"
            java.lang.String r0 = r0.a()
            boolean r0 = r2.equals(r0)
        L19:
            r2 = 1
            if (r0 != 0) goto L1d
            goto L41
        L1d:
            boolean r0 = r8.f32020k
            if (r0 != 0) goto L22
            goto L41
        L22:
            java.lang.Integer r0 = r8.f32014d
            if (r0 != 0) goto L27
            goto L3f
        L27:
            int r3 = r0.intValue()
            r4 = 12
            if (r3 == r4) goto L41
            int r0 = r0.intValue()
            r3 = 13
            if (r0 != r3) goto L38
            goto L41
        L38:
            java.lang.String r0 = "EventProcessor"
            java.lang.String r3 = "is need delay"
            ka.n7.b(r0, r3)
        L3f:
            r0 = r2
            goto L42
        L41:
            r0 = r1
        L42:
            if (r0 == 0) goto La1
            ka.le r0 = new ka.le
            r0.<init>(r7, r8)
            com.huawei.openalliance.ad.ppskit.handlers.f r8 = r7.f
            byte[] r3 = r8.f22533a
            monitor-enter(r3)
            android.content.SharedPreferences r8 = r8.b()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r4 = "minSmartImpDelay"
            int r8 = r8.getInt(r4, r1)     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9e
            com.huawei.openalliance.ad.ppskit.handlers.f r3 = r7.f
            byte[] r4 = r3.f22533a
            monitor-enter(r4)
            android.content.SharedPreferences r3 = r3.b()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r5 = "maxSmartImpDelay"
            int r3 = r3.getInt(r5, r1)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L9b
            if (r8 < 0) goto L6f
            if (r3 <= 0) goto L6f
            if (r8 < r3) goto L72
        L6f:
            r3 = 2000(0x7d0, float:2.803E-42)
            r8 = r1
        L72:
            if (r3 != r8) goto L75
            goto L87
        L75:
            if (r8 <= r3) goto L78
            goto L7b
        L78:
            r6 = r3
            r3 = r8
            r8 = r6
        L7b:
            java.security.SecureRandom r4 = new java.security.SecureRandom
            r4.<init>()
            int r8 = r8 - r3
            int r8 = r8 + r2
            int r8 = r4.nextInt(r8)
            int r8 = r8 + r3
        L87:
            java.lang.String r3 = "EventProcessor"
            java.lang.String r4 = "clk millis: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r2[r1] = r5
            ka.n7.f(r3, r4, r2)
            long r1 = (long) r8
            com.huawei.openalliance.ad.ppskit.utils.f1.a(r0, r1)
            goto La4
        L9b:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L9b
            throw r8
        L9e:
            r8 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9e
            throw r8
        La1:
            r7.y(r8)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.ke.r(ka.vf):void");
    }

    public final void t(String str, o oVar, boolean z10, boolean z11) {
        com.huawei.openalliance.ad.ppskit.utils.p2.a(new he(this, oVar, this.f31382b, str, z11, z10), 0);
    }

    public final void u(List<FeedbackInfo> list) {
        EventRecord z10 = z("positiveFeedback");
        if (v(z10, "positiveFeedback")) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!androidx.transition.n.M(list)) {
            for (FeedbackInfo feedbackInfo : list) {
                if (feedbackInfo != null && feedbackInfo.b() == 2) {
                    arrayList.add(feedbackInfo.a());
                    arrayList2.add(String.valueOf(feedbackInfo.k()));
                }
            }
        }
        if (!androidx.transition.n.M(arrayList)) {
            n7.c("EventProcessor", "onAdPositiveFeedback, selectedKeyWords: %s", arrayList.toString());
        }
        if (!androidx.transition.n.M(arrayList2)) {
            n7.c("EventProcessor", "onAdPositiveFeedback, selectedKeyWordsType: %s", arrayList2.toString());
        }
        z10.T0(0);
        z10.W0(0);
        z10.s0(arrayList);
        z10.J0(arrayList2);
        androidx.transition.n.z(this.f31386g, this.f31381a, z10.i()).k(z10.i(), z10, false, this.f31382b);
    }

    public final void x(String str) {
        ContentRecord contentRecord = this.f31382b;
        if (contentRecord != null) {
            int O1 = contentRecord.O1();
            n7.c("EventProcessor", "onAdRecallReport, eventType:%s, recallSource:%s", str, Integer.valueOf(O1));
            if (O1 == 1) {
                p pVar = new p(this.f31386g);
                ContentRecord contentRecord2 = this.f31382b;
                if (contentRecord2 != null) {
                    try {
                        o f = pVar.f(contentRecord2);
                        if (f != null) {
                            f.f31525a = "170";
                            f.D = str;
                            Context context = pVar.f31722a;
                            new ke(context, zh.a(f.f31569u.intValue(), context), contentRecord2).p(f.f31552l, f, false, false);
                        }
                    } catch (Throwable th) {
                        n7.h("AnalysisReport", "onRecallReport ex: %s", th.getClass().getSimpleName());
                    }
                }
            }
        }
    }

    public final void y(vf vfVar) {
        boolean z10;
        String str;
        EventRecord z11 = z("click");
        if (v(z11, "click")) {
            return;
        }
        Long l10 = vfVar.f32016g;
        if (l10 != null) {
            z11.Q0(l10.longValue());
        }
        MaterialClickInfo materialClickInfo = vfVar.f32015e;
        if (materialClickInfo != null) {
            if (materialClickInfo.i() != null) {
                z11.q0(materialClickInfo.i());
            }
            if (materialClickInfo.j() != null) {
                z11.I0(materialClickInfo.j());
            }
            if (materialClickInfo.k() != null) {
                z11.P(materialClickInfo.k());
            }
            if (materialClickInfo.h() != null) {
                z11.n0(materialClickInfo.h().floatValue());
            }
            if (materialClickInfo.a() != null) {
                z11.m1(materialClickInfo.a().intValue());
            }
            if (materialClickInfo.d() != null) {
                z11.p1(materialClickInfo.d().intValue());
            }
            if (materialClickInfo.f() != null) {
                z11.s1(materialClickInfo.f().intValue());
            }
        }
        ContentRecord contentRecord = this.f31382b;
        if (contentRecord != null) {
            int Y = androidx.transition.n.Y(contentRecord.q0());
            boolean z12 = false;
            if (Y != 2 && Y != 1) {
                z10 = false;
            } else {
                z10 = true;
            }
            String str2 = vfVar.f;
            if (z10) {
                ContentRecord contentRecord2 = this.f31382b;
                if (contentRecord2 != null) {
                    str = b(Y, contentRecord2, z11.i());
                    String h12 = this.f31382b.h1();
                    n7.c("EventProcessor", "onAdClick key: %s", str);
                    if (!l9.a(this.f31386g, h12).b(this.f31382b.z0(), str)) {
                        n7.f("EventProcessor", "onAdClick key: %s report event", str);
                        h(z11, vfVar);
                        com.huawei.openalliance.ad.ppskit.utils.p2.f(new ne(this, str2));
                    } else {
                        n7.f("EventProcessor", "onAdClick key: %s repeated event", str);
                        if (this.f31385e.o(h12)) {
                            z11.N0("repeatedClick");
                            h(z11, vfVar);
                        }
                        z12 = true;
                    }
                } else {
                    return;
                }
            } else {
                h(z11, vfVar);
                com.huawei.openalliance.ad.ppskit.utils.p2.f(new ne(this, str2));
                str = "";
            }
            k("click", Y, str, z12);
        }
    }

    public final EventRecord z(String str) {
        if (TextUtils.isEmpty(str)) {
            n7.i("EventProcessor", "event is null");
            return null;
        }
        if (this.f31382b == null) {
            n7.j("EventProcessor", "fail to create %s event record", str);
            return null;
        }
        if (!this.f31385e.k()) {
            n7.j("EventProcessor", "fail to create %s event record, not enable userInfo.", str);
            return null;
        }
        EventRecord eventRecord = new EventRecord();
        eventRecord.N0(str);
        eventRecord.z1(this.f31382b.h1());
        eventRecord.P0(this.f31381a.a());
        eventRecord.p0(this.f31382b.A());
        HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
        eventRecord.Q0(System.currentTimeMillis());
        eventRecord.R0(this.f31382b.j2());
        eventRecord.o(this.f31382b.r());
        eventRecord.J1(this.f31382b.n1());
        eventRecord.L1(com.huawei.openalliance.ad.ppskit.utils.i2.p(this.f31386g));
        eventRecord.c1(this.f31382b.u1());
        eventRecord.G(this.f31382b.o1());
        eventRecord.E(this.f31382b.h());
        eventRecord.X0(this.f31382b.W0());
        if (!TextUtils.isEmpty(this.f31382b.f1()) && com.huawei.openalliance.ad.ppskit.utils.y1.f23070a.matcher(this.f31382b.f1()).matches()) {
            eventRecord.e1(Integer.parseInt(this.f31382b.f1()));
        }
        if (str.equals("imp") || str.equals("supplementImp")) {
            eventRecord.D(this.f31382b.y1());
        }
        if (n7.d()) {
            n7.c("EventProcessor", "create event, type is : %s", str);
        }
        return eventRecord;
    }
}
