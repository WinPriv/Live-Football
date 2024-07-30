package com.anythink.core.common.k;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.common.e.ae;
import com.anythink.core.common.e.ai;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s {
    public static com.anythink.core.common.e.e a(String str, String str2, String str3, com.anythink.core.c.d dVar, String str4, int i10, int i11, int i12, Map<String, Object> map) {
        com.anythink.core.common.e.e eVar = new com.anythink.core.common.e.e();
        eVar.x(str2);
        eVar.y(str);
        eVar.p(str3);
        eVar.m(str4);
        eVar.s(i10);
        eVar.t(i11);
        eVar.f5596r = 0;
        eVar.f5595q = 2;
        eVar.f5597s = 0;
        a(eVar, dVar);
        eVar.R();
        eVar.C(com.anythink.core.common.b.n.a().j());
        eVar.D(i12);
        a(map, eVar);
        return eVar;
    }

    public static void a(Map<String, Object> map, com.anythink.core.common.e.e eVar) {
        if (map != null) {
            Object obj = map.get(ATAdConst.KEY.CP_PLACEMENT_ID);
            if (obj != null) {
                eVar.u(obj.toString());
            }
            Object obj2 = map.get(ATAdConst.KEY.CP_LOAD_MODE);
            if (obj2 instanceof Integer) {
                eVar.B(Integer.parseInt(obj2.toString()));
            }
        }
    }

    public static com.anythink.core.common.e.e a(ATBaseAdAdapter aTBaseAdAdapter, com.anythink.core.common.e.e eVar, ai aiVar) {
        aTBaseAdAdapter.setUnitGroupInfo(aiVar);
        aTBaseAdAdapter.setRefresh(eVar.F() == 1);
        try {
            eVar.f5599u = aTBaseAdAdapter.getNetworkSDKVersion();
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(eVar.T())) {
            eVar.v(aTBaseAdAdapter.getNetworkName());
        }
        eVar.e(aTBaseAdAdapter.getClass().getName());
        aTBaseAdAdapter.setTrackingInfo(eVar);
        return eVar;
    }

    public static void a(com.anythink.core.common.e.e eVar, ai aiVar, int i10, boolean z10) {
        com.anythink.core.common.e.m N;
        com.anythink.core.common.e.s e10;
        ae.a a10 = z10 ? com.anythink.core.a.a.a(com.anythink.core.common.b.n.a().g()).a(eVar.W(), aiVar.t()) : null;
        eVar.c(aiVar.l());
        eVar.u(aiVar.c());
        eVar.l(aiVar.t());
        eVar.l(aiVar.C());
        eVar.m(aiVar.D());
        eVar.f(aiVar.U());
        eVar.o(i10);
        eVar.n(aiVar.g());
        eVar.q(a10 != null ? a10.f5466e : 0);
        eVar.r(a10 != null ? a10.f5465d : 0);
        if (aiVar.M()) {
            if (aiVar.aa()) {
                com.anythink.core.common.e.m N2 = aiVar.N();
                if (N2 != null) {
                    eVar.d(N2.o);
                    eVar.a(N2.o);
                }
            } else {
                eVar.d(aiVar.x());
                eVar.a(aiVar.ag());
            }
        } else {
            eVar.d(0.0d);
            eVar.a(0.0d);
        }
        if (aiVar.j()) {
            if (aiVar.V() != 2) {
                if (aiVar.aa()) {
                    com.anythink.core.common.e.m N3 = aiVar.N();
                    if (N3 != null) {
                        eVar.b(eVar.g() * N3.o);
                        eVar.i(N3.f5703p);
                    }
                } else {
                    eVar.b(eVar.g() * aiVar.x());
                    eVar.i("exact");
                }
            }
        } else {
            eVar.b(aiVar.J());
            String G = aiVar.G();
            if (TextUtils.isEmpty(G)) {
                G = "publisher_defined";
            }
            eVar.i(G);
        }
        eVar.n(aiVar.i());
        eVar.f(aiVar.y());
        eVar.ao = aiVar.u();
        eVar.ap = aiVar.v();
        eVar.aq = aiVar.w();
        eVar.k(aiVar.F());
        eVar.e(aiVar.V());
        try {
            JSONObject jSONObject = new JSONObject(aiVar.g());
            JSONObject jSONObject2 = new JSONObject();
            if (35 == aiVar.c()) {
                String optString = jSONObject.optString("my_oid");
                com.anythink.core.c.d a11 = com.anythink.core.c.e.a(com.anythink.core.common.b.n.a().g()).a(eVar.W());
                if (a11 != null && (e10 = a11.e(optString)) != null) {
                    jSONObject2.put("o_id", optString);
                    jSONObject2.put("c_id", e10.q());
                }
            }
            if ("0".equals(eVar.Y()) && (3 == aiVar.l() || 7 == aiVar.l())) {
                String optString2 = jSONObject.optString("layout_type");
                if (TextUtils.isEmpty(optString2) || optString2.equals("0")) {
                    optString2 = "2";
                }
                jSONObject2.put("tpl_type", optString2);
            }
            if (28 == aiVar.c() && (N = aiVar.N()) != null) {
                jSONObject2.put("origin_price", N.originPrice);
            }
            eVar.q(jSONObject2.toString());
        } catch (Throwable unused) {
        }
        com.anythink.core.common.e.m N4 = aiVar.N();
        eVar.c(N4 != null ? N4.f5695g : "");
        eVar.w(aiVar.Y());
        eVar.v(aiVar.d());
    }

    public static void a(com.anythink.core.common.e.e eVar, com.anythink.core.c.d dVar) {
        if (eVar == null || dVar == null) {
            return;
        }
        if (dVar.X() == Integer.parseInt("1")) {
            eVar.o("1");
        } else {
            eVar.o("0");
        }
        eVar.E(dVar.O());
        eVar.w(dVar.U());
        eVar.v(dVar.ae());
        eVar.z(String.valueOf(dVar.X()));
        eVar.j(dVar.K());
        eVar.k(dVar.J());
        eVar.c(dVar.x());
        eVar.d(dVar.y());
        eVar.b(dVar.I());
        eVar.a(dVar.L());
        eVar.c(dVar.M());
        eVar.a(dVar.k());
        eVar.b(dVar.l());
        eVar.t(dVar.c());
    }

    public static void a(Context context, com.anythink.core.common.e.e eVar) {
        ae aeVar;
        int i10;
        int i11;
        System.currentTimeMillis();
        Map<String, ae> a10 = com.anythink.core.a.a.a(context).a(Integer.parseInt(eVar.Y()));
        if (a10 != null) {
            i10 = 0;
            i11 = 0;
            for (ae aeVar2 : a10.values()) {
                i10 += aeVar2.f5459c;
                i11 += aeVar2.f5460d;
            }
            aeVar = a10.get(eVar.W());
        } else {
            aeVar = null;
            i10 = 0;
            i11 = 0;
        }
        eVar.g(i10 + 1);
        eVar.h(i11 + 1);
        eVar.i((aeVar != null ? aeVar.f5459c : 0) + 1);
        eVar.j((aeVar != null ? aeVar.f5460d : 0) + 1);
        System.currentTimeMillis();
    }
}
