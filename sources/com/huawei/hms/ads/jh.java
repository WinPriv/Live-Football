package com.huawei.hms.ads;

import android.content.Context;
import com.huawei.hms.ads.jg;
import com.huawei.openalliance.ad.beans.inner.AdEventReport;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.FeedbackInfo;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import java.util.List;

/* loaded from: classes2.dex */
public class jh {
    public static AdEventReport Code(AdContentData adContentData) {
        AdEventReport adEventReport = new AdEventReport();
        if (adContentData != null) {
            adEventReport.g(adContentData.a0());
            adEventReport.H(adContentData.L());
            adEventReport.c(adContentData.u());
            adEventReport.e(adContentData.E());
            adEventReport.A(adContentData.t0());
            adEventReport.O(adContentData.w0());
            adEventReport.h(adContentData.c0());
            adEventReport.K(adContentData.f0());
            adEventReport.T(adContentData.e0());
            adEventReport.W(adContentData.D());
            adEventReport.a(adContentData.j0());
            adEventReport.n(adContentData.A());
        }
        return adEventReport;
    }

    public static void V(Context context, AdContentData adContentData) {
        Code(context, com.huawei.openalliance.ad.constant.s.f22110d, Code(adContentData));
    }

    public static void Code(Context context, AdContentData adContentData) {
        Code(context, com.huawei.openalliance.ad.constant.s.I, Code(adContentData));
    }

    public static void V(Context context, AdContentData adContentData, String str) {
        AdEventReport Code = Code(adContentData);
        Code.D(str);
        Code(context, com.huawei.openalliance.ad.constant.s.f22111e, Code);
    }

    public static void Code(Context context, AdContentData adContentData, int i10, int i11, String str) {
        Code(context, adContentData, i10, i11, (List<String>) null, str);
    }

    public static void Code(Context context, AdContentData adContentData, int i10, int i11, String str, int i12, MaterialClickInfo materialClickInfo, String str2, int[] iArr) {
        AdEventReport Code = Code(adContentData);
        Code.E(i10);
        Code.u(i11);
        if (!(iArr == null || iArr.length == 0) && iArr.length > 1) {
            Code.p(Integer.valueOf(iArr[0]));
            Code.z(Integer.valueOf(iArr[1]));
            Code.P(Integer.valueOf(gb.u.l(context)));
        }
        Code.N(str);
        Code.F(Integer.valueOf(i12));
        Code.q(str2);
        if (materialClickInfo != null) {
            Code.C(materialClickInfo.c());
            Code.s(materialClickInfo.i());
            Code.Q(materialClickInfo.f());
            Code.S(materialClickInfo.k());
            Code.j(materialClickInfo.h());
            Code.V(materialClickInfo.a());
            Code.Y(materialClickInfo.b());
        }
        Code.M(Long.valueOf(System.currentTimeMillis()));
        Code(context, com.huawei.openalliance.ad.constant.s.B, Code);
    }

    public static void Code(Context context, AdContentData adContentData, int i10, int i11, String str, int i12, String str2) {
        AdEventReport Code = Code(adContentData);
        Code.E(i10);
        Code.u(i11);
        Code.N(str);
        Code.F(Integer.valueOf(i12));
        Code.q(str2);
        Code.M(Long.valueOf(System.currentTimeMillis()));
        Code(context, com.huawei.openalliance.ad.constant.s.B, Code);
    }

    public static void Code(Context context, AdContentData adContentData, int i10, int i11, String str, int i12, String str2, int[] iArr) {
        AdEventReport Code = Code(adContentData);
        Code.E(i10);
        Code.u(i11);
        Code.N(str);
        Code.F(Integer.valueOf(i12));
        Code.q(str2);
        if (!(iArr == null || iArr.length == 0) && iArr.length > 1) {
            Code.p(Integer.valueOf(iArr[0]));
            Code.z(Integer.valueOf(iArr[1]));
            Code.P(Integer.valueOf(gb.u.l(context)));
        }
        Code.M(Long.valueOf(System.currentTimeMillis()));
        Code(context, com.huawei.openalliance.ad.constant.s.B, Code);
    }

    public static void Code(Context context, AdContentData adContentData, int i10, int i11, String str, MaterialClickInfo materialClickInfo, String str2, int[] iArr) {
        AdEventReport Code = Code(adContentData);
        Code.E(i10);
        Code.u(i11);
        if (!(iArr == null || iArr.length == 0) && iArr.length > 1) {
            Code.p(Integer.valueOf(iArr[0]));
            Code.z(Integer.valueOf(iArr[1]));
            Code.P(Integer.valueOf(gb.u.l(context)));
        }
        Code.N(str);
        Code.q(str2);
        if (materialClickInfo != null) {
            Code.C(materialClickInfo.c());
            Code.s(materialClickInfo.i());
            Code.Q(materialClickInfo.f());
            Code.S(materialClickInfo.k());
            Code.j(materialClickInfo.h());
            Code.V(materialClickInfo.a());
            Code.Y(materialClickInfo.b());
        }
        Code.M(Long.valueOf(System.currentTimeMillis()));
        Code(context, com.huawei.openalliance.ad.constant.s.B, Code);
    }

    public static void Code(Context context, AdContentData adContentData, int i10, int i11, String str, String str2) {
        Code(context, adContentData, i10, i11, str, (MaterialClickInfo) null, str2, new int[0]);
    }

    public static void Code(Context context, AdContentData adContentData, int i10, int i11, String str, String str2, int[] iArr) {
        Code(context, adContentData, i10, i11, str, (MaterialClickInfo) null, str2, iArr);
    }

    public static void Code(Context context, AdContentData adContentData, int i10, int i11, List<String> list) {
        Code(context, adContentData, i10, i11, list, (String) null);
    }

    private static void Code(Context context, AdContentData adContentData, int i10, int i11, List<String> list, String str) {
        AdEventReport Code = Code(adContentData);
        Code.E(i10);
        Code.u(i11);
        Code.m(list);
        if (!gb.p.f(str)) {
            Code.x(str);
        }
        Code(context, com.huawei.openalliance.ad.constant.s.C, Code);
    }

    public static void Code(Context context, AdContentData adContentData, long j10, int i10) {
        jg.a aVar = new jg.a();
        aVar.Code(Long.valueOf(j10)).Code(Integer.valueOf(i10));
        Code(context, adContentData, true, aVar.Code());
    }

    public static void Code(Context context, AdContentData adContentData, jg jgVar) {
        Code(context, adContentData, false, jgVar);
    }

    public static void Code(Context context, AdContentData adContentData, jg jgVar, String str) {
        Code(context, adContentData, false, jgVar, str);
    }

    public static void Code(Context context, AdContentData adContentData, Integer num) {
        AdEventReport Code = Code(adContentData);
        Code.F(num);
        Code(context, com.huawei.openalliance.ad.constant.s.D, Code);
    }

    public static void Code(Context context, AdContentData adContentData, Integer num, String str) {
        AdEventReport Code = Code(adContentData);
        Code.F(num);
        Code.D(str);
        Code(context, com.huawei.openalliance.ad.constant.s.F, Code);
    }

    public static void Code(Context context, AdContentData adContentData, Long l10, Integer num, Integer num2, Long l11, Boolean bool) {
        jg.a aVar = new jg.a();
        aVar.Code(l10).Code(num).V(num2).V(l11).Code(bool);
        Code(context, adContentData, false, aVar.Code());
    }

    public static void Code(Context context, AdContentData adContentData, Long l10, Integer num, Integer num2, String str) {
        jg.a aVar = new jg.a();
        aVar.Code(l10);
        aVar.Code(num);
        aVar.V(num2);
        aVar.Code(str);
        Code(context, adContentData, false, aVar.Code());
    }

    public static void Code(Context context, AdContentData adContentData, String str) {
        Code(context, adContentData, str, (Long) null, (Boolean) null);
    }

    public static void Code(Context context, AdContentData adContentData, String str, int i10, int i11, String str2, int i12, String str3, MaterialClickInfo materialClickInfo) {
        Code(context, adContentData, str, i10, i11, str2, i12, str3, null, null, materialClickInfo);
    }

    public static void Code(Context context, AdContentData adContentData, String str, int i10, int i11, String str2, int i12, String str3, Long l10, Boolean bool, MaterialClickInfo materialClickInfo) {
        AdEventReport Code = Code(adContentData);
        Code.E(i10);
        Code.u(i11);
        Code.N(str2);
        Code.F(Integer.valueOf(i12));
        Code.D(str);
        Code.q(str3);
        Code.M(l10);
        Code.i(bool);
        if (materialClickInfo != null) {
            Code.C(materialClickInfo.c());
            Code.s(materialClickInfo.i());
            Code.Q(materialClickInfo.f());
            Code.S(materialClickInfo.k());
            Code.j(materialClickInfo.h());
            Code.V(materialClickInfo.a());
            Code.Y(materialClickInfo.b());
        }
        Code(context, com.huawei.openalliance.ad.constant.s.B, Code);
    }

    public static void Code(Context context, AdContentData adContentData, String str, Integer num, Integer num2) {
        Code(context, adContentData, str, num, num2, (Long) null, (Boolean) null);
    }

    public static void Code(Context context, AdContentData adContentData, String str, Integer num, Integer num2, Long l10, Boolean bool) {
        AdEventReport Code = Code(adContentData);
        Code.x(str);
        Code.b(num);
        Code.d(num2);
        Code.M(l10);
        Code.i(bool);
        Code(context, com.huawei.openalliance.ad.constant.s.S, Code);
    }

    public static void Code(Context context, AdContentData adContentData, String str, Long l10, Boolean bool) {
        AdEventReport Code = Code(adContentData);
        Code.D(str);
        Code(context, com.huawei.openalliance.ad.constant.s.I, Code);
    }

    public static void Code(Context context, AdContentData adContentData, String str, Long l10, Integer num, Integer num2, String str2) {
        jg.a aVar = new jg.a();
        aVar.V(str).Code(l10).Code(num).V(num2).Code(str2);
        Code(context, adContentData, false, aVar.Code());
    }

    public static void Code(Context context, AdContentData adContentData, String str, Long l10, Long l11, Integer num, Integer num2) {
        AdEventReport Code = Code(adContentData);
        Code.x(str);
        Code.G(l10);
        Code.w(l11);
        Code.v(num);
        Code.L(num2);
        Code(context, com.huawei.openalliance.ad.constant.s.Z, Code);
    }

    public static void Code(Context context, AdContentData adContentData, String str, Long l10, Long l11, Integer num, Integer num2, String str2) {
        AdEventReport Code = Code(adContentData);
        Code.x(str);
        Code.G(l10);
        Code.w(l11);
        Code.v(num);
        Code.L(num2);
        Code.D(str2);
        Code(context, com.huawei.openalliance.ad.constant.s.Z, Code);
    }

    public static void Code(Context context, AdContentData adContentData, String str, String str2, String str3) {
        AdEventReport Code = Code(adContentData);
        if (str != null) {
            Code.D(str);
        } else {
            ex.I("event", "on ad rewarded, customData is null");
        }
        if (str2 != null) {
            Code.t(str2);
        } else {
            ex.I("event", "on ad rewarded, userId is null");
        }
        Code.q(str3);
        Code(context, com.huawei.openalliance.ad.constant.s.f22108b, Code);
    }

    public static void Code(Context context, AdContentData adContentData, List<FeedbackInfo> list, int i10) {
        AdEventReport Code = Code(adContentData);
        Code.D(String.valueOf(i10));
        Code.I(list);
        Code(context, com.huawei.openalliance.ad.constant.s.f22127w, Code);
    }

    public static void Code(Context context, AdContentData adContentData, boolean z10) {
        AdEventReport Code = Code(adContentData);
        Code.y(z10);
        Code(context, com.huawei.openalliance.ad.constant.s.f22114i, Code);
    }

    private static void Code(Context context, AdContentData adContentData, boolean z10, jg jgVar) {
        Code(context, adContentData, z10, jgVar, (String) null);
    }

    private static void Code(Context context, AdContentData adContentData, boolean z10, jg jgVar, String str) {
        if (adContentData == null) {
            ex.I("EvtProcessor", "on ad show, ad data is null");
            return;
        }
        AdEventReport Code = Code(adContentData);
        Code.J(z10);
        if (jgVar != null) {
            if (jgVar.S() != null) {
                Code.D(jgVar.S());
            }
            if (jgVar.Code() != null) {
                Code.l(jgVar.Code());
            }
            if (jgVar.V() != null) {
                Code.k(jgVar.V());
            }
            if (jgVar.I() != null) {
                Code.F(jgVar.I());
            }
            if (jgVar.Z() != null) {
                Code.q(jgVar.Z());
            }
            if (jgVar.B() != null) {
                Code.M(jgVar.B());
            }
            if (jgVar.C() != null) {
                Code.i(jgVar.C());
            }
            if (jgVar.F() != null) {
                Code.Z(jgVar.F());
            }
        }
        if (!gb.p.f(str)) {
            Code.x(str);
        }
        Code(context, com.huawei.openalliance.ad.constant.s.V, Code);
    }

    private static void Code(Context context, String str, AdEventReport adEventReport) {
        if (context == null) {
            return;
        }
        a0.a.h(context, adEventReport.h0()).d(str, gb.b.p(adEventReport), null, null);
    }
}
