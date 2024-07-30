package com.anythink.core.b.d;

import com.anythink.core.c.d;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.ai;
import com.anythink.core.common.e.e;
import com.anythink.core.common.l;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    static final String f4609a = "a";

    public static void a(final String str, final d dVar, final String str2, final int i10, final List<ai> list, final long j10, final int i11, final int i12) {
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.b.d.a.1
            @Override // java.lang.Runnable
            public final void run() {
                String str3;
                String str4;
                String str5 = a.f4609a;
                JSONArray jSONArray = new JSONArray();
                e eVar = new e();
                eVar.x(str);
                eVar.y(str2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dVar.X());
                eVar.z(sb2.toString());
                eVar.w(dVar.U());
                eVar.t(i10);
                eVar.e(j10);
                eVar.f(System.currentTimeMillis());
                eVar.E(dVar.O());
                eVar.v(dVar.ae());
                eVar.D(i11);
                eVar.f5595q = i12;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    ai aiVar = (ai) list.get(i13);
                    if (aiVar.l() != 7 && aiVar.j()) {
                        try {
                            int o = aiVar.o();
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("sorttype", o);
                            jSONObject.put("unit_id", aiVar.t());
                            jSONObject.put("bidresult", aiVar.P());
                            String str6 = "0";
                            if (!aiVar.M()) {
                                str3 = "0";
                            } else {
                                str3 = String.valueOf(aiVar.x());
                            }
                            jSONObject.put("bidprice", str3);
                            if (aiVar.M()) {
                                str6 = String.valueOf(aiVar.ag());
                            }
                            jSONObject.put(l.am, str6);
                            jSONObject.put("nw_firm_id", String.valueOf(aiVar.c()));
                            if (aiVar.N() != null) {
                                str4 = aiVar.N().f5695g;
                            } else {
                                str4 = null;
                            }
                            jSONObject.put("tp_bid_id", str4);
                            jSONObject.put("rl_bid_status", aiVar.O());
                            jSONObject.put("errormsg", aiVar.z());
                            jSONArray.put(jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                }
                eVar.s(jSONArray.toString());
                com.anythink.core.common.j.a.a(n.a().g()).a(11, eVar);
            }
        });
    }
}
