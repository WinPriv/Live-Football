package com.anythink.core.common.h;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.AdError;
import com.anythink.core.c.d;
import com.anythink.core.common.b.j;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.e;
import com.anythink.core.common.g.i;
import com.huawei.openalliance.ad.constant.ba;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d implements com.anythink.core.common.f.c {
    /* JADX INFO: Access modifiers changed from: private */
    public static String b(long j10, long j11, e eVar, ATBaseAdAdapter aTBaseAdAdapter) {
        String str;
        Map<String, Object> networkInfoMap;
        try {
            networkInfoMap = aTBaseAdAdapter.getNetworkInfoMap();
        } catch (Throwable unused) {
        }
        try {
            if (networkInfoMap != null) {
                str = new JSONObject(networkInfoMap).toString();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pl_id", eVar.W());
                jSONObject.put("req_id", eVar.X());
                jSONObject.put(ba.f22057e, eVar.l());
                jSONObject.put("unit_id", eVar.x());
                jSONObject.put("nw_firm_id", eVar.H());
                jSONObject.put("scenario_id", eVar.C);
                jSONObject.put("rv_start_ts", j10);
                jSONObject.put("r_callback_ts", j11);
                jSONObject.put("rv_play_dur", j11 - j10);
                jSONObject.put("tp_bid_id", eVar.e());
                jSONObject.put("extra_info", str);
                jSONObject.put("user_id", aTBaseAdAdapter.getUserId());
                jSONObject.put("extra_data", aTBaseAdAdapter.getUserCustomData());
                jSONObject.put("curr_ts", System.currentTimeMillis());
                jSONObject.put(d.a.f4853i, j.a(eVar, aTBaseAdAdapter).toString());
                return jSONObject.toString();
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("pl_id", eVar.W());
            jSONObject2.put("req_id", eVar.X());
            jSONObject2.put(ba.f22057e, eVar.l());
            jSONObject2.put("unit_id", eVar.x());
            jSONObject2.put("nw_firm_id", eVar.H());
            jSONObject2.put("scenario_id", eVar.C);
            jSONObject2.put("rv_start_ts", j10);
            jSONObject2.put("r_callback_ts", j11);
            jSONObject2.put("rv_play_dur", j11 - j10);
            jSONObject2.put("tp_bid_id", eVar.e());
            jSONObject2.put("extra_info", str);
            jSONObject2.put("user_id", aTBaseAdAdapter.getUserId());
            jSONObject2.put("extra_data", aTBaseAdAdapter.getUserCustomData());
            jSONObject2.put("curr_ts", System.currentTimeMillis());
            jSONObject2.put(d.a.f4853i, j.a(eVar, aTBaseAdAdapter).toString());
            return jSONObject2.toString();
        } catch (Throwable unused2) {
            return "";
        }
        str = "";
    }

    @Override // com.anythink.core.common.f.c
    public final void a(final long j10, final long j11, final ATBaseAdAdapter aTBaseAdAdapter, final e eVar) {
        com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.h.d.1
            @Override // java.lang.Runnable
            public final void run() {
                long j12;
                try {
                    if (aTBaseAdAdapter.getUnitGroupInfo().S() != 1) {
                        return;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j13 = j11;
                    if (j13 != 0 && elapsedRealtime >= j13) {
                        j12 = j13;
                    } else {
                        j12 = elapsedRealtime;
                    }
                    final String W = eVar.W();
                    com.anythink.core.c.d a10 = com.anythink.core.c.e.a(n.a().g()).a(W);
                    JSONObject jSONObject = new JSONObject(a.a(a10.u()));
                    int optInt = jSONObject.optInt("a");
                    b a11 = a.a(jSONObject.optString("b"), d.b(j10, j12, eVar, aTBaseAdAdapter));
                    if (TextUtils.isEmpty(a11.a())) {
                        com.anythink.core.common.j.c.a(eVar, a10, "", a11.b());
                    } else {
                        new c(n.a().g(), optInt, a11.a(), eVar, a10).a(0, new i() { // from class: com.anythink.core.common.h.d.1.1
                            @Override // com.anythink.core.common.g.i
                            public final void onLoadError(int i10, String str, AdError adError) {
                                Log.e("anythink_s2s_reward", "S2S reward error! PlacementId: " + W + ", " + adError.printStackTrace());
                            }

                            @Override // com.anythink.core.common.g.i
                            public final void onLoadFinish(int i10, Object obj) {
                                if (n.a().A()) {
                                    Log.i("anythink_s2s_reward", "S2S reward succeeded. PlacementId: " + W);
                                }
                            }

                            @Override // com.anythink.core.common.g.i
                            public final void onLoadCanceled(int i10) {
                            }

                            @Override // com.anythink.core.common.g.i
                            public final void onLoadStart(int i10) {
                            }
                        });
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }
}
