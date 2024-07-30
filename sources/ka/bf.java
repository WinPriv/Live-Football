package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdEvent;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Content;
import com.huawei.openalliance.ad.ppskit.beans.metadata.FeedbackInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Monitor;
import com.huawei.openalliance.ad.ppskit.beans.metadata.NegativeFb;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ParamFromServer;
import com.huawei.openalliance.ad.ppskit.beans.metadata.RewardItem;
import com.huawei.openalliance.ad.ppskit.beans.metadata.Skip;
import com.huawei.openalliance.ad.ppskit.beans.metadata.VideoInfo;
import com.huawei.openalliance.ad.ppskit.beans.vast.Creative;
import com.huawei.openalliance.ad.ppskit.beans.vast.Impression;
import com.huawei.openalliance.ad.ppskit.beans.vast.Tracking;
import com.huawei.openalliance.ad.ppskit.beans.vast.VastContent;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.EncryptionField;
import com.huawei.openalliance.ad.ppskit.db.bean.EventRecord;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class bf {
    public static AdEvent a(EventRecord eventRecord, Context context) {
        String a10;
        String a11;
        AdEvent adEvent = new AdEvent();
        adEvent.q(eventRecord.i());
        adEvent.b(eventRecord.g1());
        adEvent.a(eventRecord.r1());
        adEvent.h(eventRecord.u1());
        adEvent.n(eventRecord.w1());
        adEvent.v(eventRecord.h());
        adEvent.l(eventRecord.i1());
        adEvent.g(eventRecord.A1());
        adEvent.m(eventRecord.C1());
        adEvent.i(eventRecord.I1());
        adEvent.A(eventRecord.E1());
        adEvent.C(eventRecord.G1());
        adEvent.t(com.huawei.openalliance.ad.ppskit.utils.y1.q(eventRecord.K1()));
        adEvent.r(eventRecord.M1());
        adEvent.w(com.huawei.openalliance.ad.ppskit.utils.y1.q(eventRecord.N1()));
        adEvent.z(com.huawei.openalliance.ad.ppskit.utils.y1.q(eventRecord.P1()));
        adEvent.B(com.huawei.openalliance.ad.ppskit.utils.y1.q(eventRecord.A()));
        adEvent.D(com.huawei.openalliance.ad.ppskit.utils.y1.q(eventRecord.C()));
        adEvent.X(eventRecord.i0());
        adEvent.Z(eventRecord.j0());
        adEvent.G(com.huawei.openalliance.ad.ppskit.utils.y1.q(eventRecord.D()));
        adEvent.I(com.huawei.openalliance.ad.ppskit.utils.y1.q(eventRecord.F()));
        adEvent.E(eventRecord.H());
        adEvent.K(com.huawei.openalliance.ad.ppskit.utils.y1.q(eventRecord.X()));
        adEvent.u(com.huawei.openalliance.ad.ppskit.utils.y1.s(eventRecord.U()));
        adEvent.M(com.huawei.openalliance.ad.ppskit.utils.y1.q(eventRecord.a0()));
        adEvent.O(com.huawei.openalliance.ad.ppskit.utils.y1.q(eventRecord.O()));
        adEvent.H(eventRecord.L());
        adEvent.J(eventRecord.M());
        adEvent.L(eventRecord.N());
        adEvent.N(eventRecord.c0());
        adEvent.P(eventRecord.P());
        adEvent.R(eventRecord.Q());
        adEvent.T(eventRecord.d0());
        adEvent.Q(Integer.valueOf(eventRecord.e0()));
        adEvent.S(eventRecord.f0());
        adEvent.b0(eventRecord.t0());
        adEvent.c0(eventRecord.u0());
        adEvent.s(eventRecord.w0());
        adEvent.e0(eventRecord.E0());
        if (-111111 != eventRecord.k0()) {
            adEvent.U(Integer.valueOf(eventRecord.k0()));
        }
        if (-111111 != eventRecord.l0()) {
            adEvent.W(Integer.valueOf(eventRecord.l0()));
        }
        if (-111111 != eventRecord.Z0()) {
            adEvent.d(Integer.valueOf(eventRecord.Z0()));
        }
        if (-111111 != eventRecord.m0()) {
            adEvent.e(Long.valueOf(eventRecord.m0()));
        }
        adEvent.f(eventRecord.F0());
        if (-111111 != eventRecord.K0()) {
            adEvent.k(Long.valueOf(eventRecord.K0()));
        }
        if (-111111 != eventRecord.O0()) {
            adEvent.p(Long.valueOf(eventRecord.O0()));
        }
        if (-111111 != eventRecord.S0()) {
            adEvent.j(Integer.valueOf(eventRecord.S0()));
        }
        if (-111111 != eventRecord.V0()) {
            adEvent.o(Integer.valueOf(eventRecord.V0()));
        }
        if (-111111 != eventRecord.v0() && eventRecord.v0() > 0) {
            adEvent.x(Long.valueOf(eventRecord.v0()));
        }
        if (-111111 != eventRecord.x0()) {
            adEvent.Y(Integer.valueOf(eventRecord.x0()));
        }
        if (-111111 != eventRecord.y0()) {
            adEvent.a0(Integer.valueOf(eventRecord.y0()));
        }
        adEvent.d0(eventRecord.z0());
        EncryptionField<String> o12 = eventRecord.o1();
        if (o12 != null) {
            byte[] r10 = eventRecord.r();
            if (r10 != null) {
                a11 = o12.b(r10);
            } else {
                a11 = o12.a(context);
            }
            String str = a11;
            if (!com.huawei.openalliance.ad.ppskit.utils.y1.h(str)) {
                adEvent.c((ParamFromServer) com.huawei.openalliance.ad.ppskit.utils.y0.o(null, str, ParamFromServer.class, new Class[0]));
            }
        }
        EncryptionField<String> y12 = eventRecord.y1();
        if (y12 != null) {
            byte[] r11 = eventRecord.r();
            if (r11 != null) {
                a10 = y12.b(r11);
            } else {
                a10 = y12.a(context);
            }
            String str2 = a10;
            if (!com.huawei.openalliance.ad.ppskit.utils.y1.h(str2)) {
                adEvent.y(str2);
            }
        }
        return adEvent;
    }

    public static ContentRecord b(String str, Content content, int i10, String str2, boolean z10) {
        boolean z11;
        String str3;
        int intValue;
        ArrayList arrayList;
        List<ImageInfo> h02;
        int m10;
        List<Monitor> arrayList2;
        Context context;
        Creative creative;
        int m11;
        List<Monitor> list = null;
        if (content == null || (!z10 && com.huawei.openalliance.ad.ppskit.utils.y1.h(str))) {
            return null;
        }
        ContentRecord contentRecord = new ContentRecord();
        contentRecord.r2(0);
        contentRecord.w2(com.huawei.openalliance.ad.ppskit.utils.d0.j("yyyy-MM-dd"));
        contentRecord.v2(content.v0());
        contentRecord.C2(content.o0());
        contentRecord.g2(content.p0());
        contentRecord.m2(content.q0());
        contentRecord.a2(str);
        contentRecord.F1(content.t0());
        contentRecord.U1(content.u0());
        contentRecord.T1(content.r0());
        contentRecord.y2(0);
        contentRecord.f2(System.currentTimeMillis());
        if (content.A() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        contentRecord.c2(z11);
        contentRecord.l2(content.F());
        contentRecord.d0(content.N());
        contentRecord.u2(content.I0());
        List<String> x02 = content.x0();
        if (x02 != null && x02.size() > 0) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<String> it = x02.iterator();
            while (it.hasNext()) {
                arrayList3.add(com.huawei.openalliance.ad.ppskit.utils.y1.p(it.next()));
            }
            contentRecord.G0(arrayList3);
        }
        List<String> o = content.o();
        if (o != null && o.size() > 0) {
            ArrayList arrayList4 = new ArrayList();
            Iterator<String> it2 = o.iterator();
            while (it2.hasNext()) {
                arrayList4.add(com.huawei.openalliance.ad.ppskit.utils.y1.p(it2.next()));
            }
            contentRecord.H1(arrayList4);
        }
        contentRecord.g3(content.k());
        ParamFromServer w02 = content.w0();
        if (w02 != null) {
            contentRecord.H2(com.huawei.openalliance.ad.ppskit.utils.y0.q(null, w02));
        }
        RewardItem q10 = content.q();
        if (q10 != null) {
            contentRecord.E(q10.a());
            contentRecord.O2(q10.b());
        }
        contentRecord.a(i10);
        contentRecord.F0(content.l0());
        contentRecord.P2(content.B0());
        Skip v3 = content.v();
        if (v3 != null) {
            if (!TextUtils.isEmpty(v3.a())) {
                contentRecord.P2(v3.a());
            }
            if (v3.b() > 0) {
                contentRecord.T2(v3.b());
            }
            if (v3.c() > 0) {
                contentRecord.R2(v3.c());
            }
        }
        contentRecord.G1(content.d());
        MetaData n02 = content.n0();
        if (n02 != null) {
            contentRecord.L2(n02.g0());
            contentRecord.D2(n02.Y());
            contentRecord.k3(n02.v());
            contentRecord.n2(n02.p0());
            VideoInfo K = n02.K();
            if (K != null) {
                Float A = K.A();
                if (A != null) {
                    m11 = (int) ((720 * 1.0f) / A.floatValue());
                    contentRecord.e2(720);
                    contentRecord.k2(m11);
                }
                contentRecord.o3(n02.u0());
                contentRecord.r3(n02.p());
                contentRecord.x2(n02.q());
            } else {
                List<ImageInfo> h03 = n02.h0();
                if (h03 != null && h03.size() > 0) {
                    ImageInfo imageInfo = h03.get(0);
                    contentRecord.z2(imageInfo.g());
                    contentRecord.e2(imageInfo.l());
                    m11 = imageInfo.m();
                    contentRecord.k2(m11);
                }
                contentRecord.o3(n02.u0());
                contentRecord.r3(n02.p());
                contentRecord.x2(n02.q());
            }
        }
        contentRecord.b2(content.y0());
        contentRecord.W1(content.f0());
        contentRecord.S2(com.huawei.openalliance.ad.ppskit.utils.y1.p(content.z0()));
        contentRecord.U2(content.C0());
        contentRecord.G2(content.A0());
        contentRecord.h2(content.D0());
        contentRecord.a3(content.E0());
        contentRecord.d3(content.F0());
        contentRecord.l3(content.p());
        contentRecord.e0(content.H());
        contentRecord.v3(content.D());
        contentRecord.w3(content.r());
        contentRecord.z(content.u());
        if (content.x() != null) {
            str3 = String.valueOf(content.x());
        } else {
            str3 = null;
        }
        contentRecord.G(str3);
        contentRecord.c3(content.G());
        contentRecord.K2(content.G0());
        if (content.E() != null) {
            contentRecord.h3(content.E().intValue());
        }
        if (content.C() != null) {
            contentRecord.f3(content.C().intValue());
        }
        contentRecord.A2(content.K());
        contentRecord.E2(content.O());
        contentRecord.g0(content.U());
        contentRecord.i0(str2);
        contentRecord.C0(content.X());
        List<NegativeFb> Y = content.Y();
        if (!androidx.transition.n.M(Y)) {
            ArrayList arrayList5 = new ArrayList();
            for (NegativeFb negativeFb : Y) {
                if (negativeFb != null) {
                    FeedbackInfo feedbackInfo = new FeedbackInfo();
                    feedbackInfo.b(negativeFb.k());
                    feedbackInfo.c(com.huawei.openalliance.ad.ppskit.utils.y1.p(negativeFb.p()));
                    feedbackInfo.a(negativeFb.q());
                    arrayList5.add(feedbackInfo);
                }
            }
            contentRecord.I2(arrayList5);
        }
        if (content.c0() != null) {
            contentRecord.k0(content.c0().a());
            contentRecord.D0(content.c0().k());
            contentRecord.w0(content.c0().c());
        }
        contentRecord.M2(content.b0());
        if (content.a0() == null) {
            intValue = -1;
        } else {
            intValue = content.a0().intValue();
        }
        contentRecord.n3(intValue);
        contentRecord.n0(content.d0());
        contentRecord.p0(com.huawei.openalliance.ad.ppskit.utils.y1.p(content.e0()));
        contentRecord.Q2(content.h0());
        contentRecord.B0(content.i0());
        contentRecord.i3(UUID.randomUUID().toString());
        contentRecord.q3(content.j0());
        contentRecord.V(content.k0());
        HashMap hashMap = nf.f31514a;
        MetaData X1 = contentRecord.X1();
        int z02 = contentRecord.z0();
        VastContent c10 = nf.c(X1, z02, contentRecord.z());
        if (c10 != null) {
            n7.f("VastAdapter", "content:%s is vast ad.", contentRecord.h());
        }
        nf.d(X1, c10, z02, true);
        contentRecord.G1(com.huawei.openalliance.ad.ppskit.utils.y0.q(null, X1));
        if (c10 != null) {
            contentRecord.q2();
            MetaData X12 = contentRecord.X1();
            if (X12 != null) {
                contentRecord.D2(X12.Y());
            }
            List<Creative> m12 = c10.m();
            if (!androidx.transition.n.M(m12) && m12.size() <= 1 && (creative = m12.get(0)) != null) {
                arrayList = new ArrayList();
                List<Impression> k10 = c10.k();
                if (!androidx.transition.n.M(k10)) {
                    Monitor monitor = new Monitor();
                    monitor.b("imp");
                    ArrayList arrayList6 = new ArrayList();
                    Iterator<Impression> it3 = k10.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(it3.next().a());
                    }
                    monitor.c(arrayList6);
                    arrayList.add(monitor);
                }
                if (creative.c() != null && creative.c().j() != null) {
                    List<Tracking> c11 = creative.c().j().c();
                    if (!androidx.transition.n.M(c11)) {
                        arrayList.add(nf.b("click", c11));
                    }
                }
                HashMap hashMap2 = new HashMap();
                if (creative.c() != null && !a0.a.e0(creative.c().h())) {
                    hashMap2.putAll(creative.c().h());
                }
                if (creative.d() != null && !a0.a.e0(creative.d().c())) {
                    hashMap2.putAll(creative.d().c());
                }
                if (!a0.a.e0(hashMap2)) {
                    for (Map.Entry entry : nf.f31514a.entrySet()) {
                        String str4 = (String) entry.getKey();
                        String str5 = (String) entry.getValue();
                        if (!a0.a.e0(hashMap2) && !TextUtils.isEmpty(str4) && str5 != null && hashMap2.containsKey(str4)) {
                            List list2 = (List) hashMap2.get(str4);
                            if (!androidx.transition.n.M(list2)) {
                                arrayList.add(nf.b(str5, list2));
                            }
                        }
                    }
                }
            } else {
                arrayList = null;
            }
            if (n7.d()) {
                n7.c("VastAdapter", "monitors from vast: %s", com.huawei.openalliance.ad.ppskit.utils.y1.j(com.huawei.openalliance.ad.ppskit.utils.y0.q(null, arrayList)));
            }
            if (!androidx.transition.n.M(arrayList)) {
                EncryptionField<List<Monitor>> K2 = contentRecord.K();
                if (K2 != null) {
                    m6 m6Var = m6.f31448d;
                    if (m6Var == null) {
                        context = null;
                    } else {
                        context = m6Var.f31452c;
                    }
                    if (context != null) {
                        list = K2.a(context);
                    }
                }
                if (!androidx.transition.n.M(list)) {
                    HashMap hashMap3 = new HashMap();
                    nf.e(list, hashMap3);
                    nf.e(arrayList, hashMap3);
                    if (a0.a.e0(hashMap3)) {
                        arrayList2 = Collections.EMPTY_LIST;
                    } else {
                        arrayList2 = new ArrayList((Collection<? extends Monitor>) hashMap3.values());
                    }
                    contentRecord.b2(arrayList2);
                } else {
                    contentRecord.b2(arrayList);
                }
            }
            VideoInfo h04 = contentRecord.h0();
            if (h04 != null) {
                Float A2 = h04.A();
                if (A2 != null) {
                    m10 = (int) ((720 * 1.0f) / A2.floatValue());
                    contentRecord.e2(720);
                    contentRecord.k2(m10);
                }
            } else if (X12 != null && (h02 = X12.h0()) != null && h02.size() > 0) {
                ImageInfo imageInfo2 = h02.get(0);
                contentRecord.z2(imageInfo2.g());
                contentRecord.e2(imageInfo2.l());
                m10 = imageInfo2.m();
                contentRecord.k2(m10);
            }
        }
        return contentRecord;
    }

    public static ContentRecord c(String str, String str2, String str3, Content content, int i10, String str4) {
        ContentRecord b10 = b(str3, content, i10, str4, false);
        if (b10 != null) {
            b10.t3(str);
            b10.B(str2);
            b10.E1(1);
        }
        return b10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList d(java.util.Collection r11, android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.bf.d(java.util.Collection, android.content.Context):java.util.ArrayList");
    }
}
