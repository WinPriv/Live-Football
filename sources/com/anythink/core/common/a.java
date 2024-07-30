package com.anythink.core.common;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationBidManager;
import com.anythink.core.common.e.ah;
import com.anythink.core.common.e.ai;
import com.anythink.core.common.e.aj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f4889a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4890b = getClass().getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, ConcurrentHashMap<String, aj>> f4891c = new ConcurrentHashMap<>();

    private a() {
    }

    public static a a() {
        if (f4889a == null) {
            synchronized (a.class) {
                if (f4889a == null) {
                    f4889a = new a();
                }
            }
        }
        return f4889a;
    }

    public static void b(String str, ai aiVar) {
        if (aiVar == null) {
            return;
        }
        aiVar.t();
        aiVar.l();
        aiVar.c();
        int l10 = aiVar.l();
        if (l10 != 3) {
            if (l10 != 4) {
                if (l10 != 7) {
                    return;
                }
            } else {
                com.anythink.core.basead.b.a();
                Context g6 = com.anythink.core.common.b.n.a().g();
                com.anythink.core.basead.b.a();
                com.anythink.core.basead.b.b(g6, com.anythink.core.basead.b.a(str, aiVar.t(), aiVar.c()));
                return;
            }
        }
        com.anythink.core.common.e.m N = aiVar.N();
        com.anythink.core.b.f.a().a(aiVar.t());
        com.anythink.core.b.f.a();
        com.anythink.core.b.f.b(aiVar.t());
        if (N != null && !TextUtils.isEmpty(N.token)) {
            N.b();
            com.anythink.core.common.a.a.a().b(com.anythink.core.common.b.n.a().g(), N.token);
        }
    }

    public final aj a(String str, int i10, ATBaseAdAdapter aTBaseAdAdapter, List<? extends BaseAd> list, long j10) {
        synchronized (v.a().a(str)) {
            ConcurrentHashMap<String, aj> concurrentHashMap = this.f4891c.get(str);
            ai unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
            String t10 = aTBaseAdAdapter.getUnitGroupInfo().t();
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap<>();
                this.f4891c.put(str, concurrentHashMap);
            }
            aj ajVar = concurrentHashMap.get(t10);
            if (ajVar == null) {
                ajVar = new aj();
                ajVar.f5512a = i10;
                ajVar.f5513b = aTBaseAdAdapter.getTrackingInfo().X();
                concurrentHashMap.put(t10, ajVar);
            } else {
                ajVar.f5512a = i10;
                ajVar.f5513b = aTBaseAdAdapter.getTrackingInfo().X();
            }
            com.anythink.core.common.e.b a10 = ajVar.a();
            if (a10 != null && TextUtils.equals(w.a().b(str), a10.h().X())) {
                return ajVar;
            }
            if (list != null && list.size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (BaseAd baseAd : list) {
                    baseAd.setTrackingInfo(aTBaseAdAdapter.getTrackingInfo().N());
                    com.anythink.core.common.e.b bVar = new com.anythink.core.common.e.b();
                    bVar.b(i10);
                    bVar.a(aTBaseAdAdapter);
                    bVar.a(baseAd);
                    bVar.c(System.currentTimeMillis());
                    bVar.b(j10);
                    bVar.a(aTBaseAdAdapter.getTrackingInfo().X());
                    bVar.a(unitGroupInfo.A());
                    arrayList.add(bVar);
                }
                ajVar.a(arrayList);
            } else {
                com.anythink.core.common.e.b bVar2 = new com.anythink.core.common.e.b();
                bVar2.b(i10);
                bVar2.a(aTBaseAdAdapter);
                bVar2.c(System.currentTimeMillis());
                bVar2.b(j10);
                bVar2.a(aTBaseAdAdapter.getTrackingInfo().X());
                bVar2.a(unitGroupInfo.A());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar2);
                ajVar.a(arrayList2);
            }
            return ajVar;
        }
    }

    public final com.anythink.core.common.e.b a(Context context, String str) {
        synchronized (v.a().a(str)) {
            List<com.anythink.core.common.e.b> a10 = a(context, str, false, false, false, null);
            if (a10 == null || a10.size() <= 0) {
                return null;
            }
            return a10.get(0);
        }
    }

    public final com.anythink.core.common.e.b a(Context context, String str, boolean z10, boolean z11, Map<String, Object> map) {
        synchronized (v.a().a(str)) {
            List<com.anythink.core.common.e.b> a10 = a(context, str, z10, z11, false, map);
            if (a10 == null || a10.size() <= 0) {
                return null;
            }
            return a10.get(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02c0 A[Catch: all -> 0x0505, TryCatch #1 {, blocks: (B:9:0x001c, B:11:0x0044, B:14:0x0046, B:16:0x005c, B:19:0x0063, B:20:0x0066, B:23:0x0079, B:25:0x007f, B:27:0x008e, B:28:0x0091, B:30:0x0097, B:31:0x009e, B:33:0x00a8, B:36:0x0301, B:37:0x00cf, B:39:0x00e6, B:40:0x00ff, B:42:0x0105, B:45:0x0120, B:47:0x0131, B:51:0x013f, B:54:0x014b, B:56:0x0183, B:59:0x01a1, B:64:0x01ae, B:65:0x01b3, B:62:0x01b5, B:67:0x01be, B:70:0x01d8, B:72:0x01e0, B:76:0x01ef, B:78:0x01f9, B:94:0x025a, B:95:0x0271, B:97:0x028c, B:102:0x02af, B:103:0x02b6, B:99:0x02b8, B:106:0x02c0, B:121:0x02d3, B:127:0x010c, B:129:0x0116, B:132:0x02ea, B:138:0x0310, B:140:0x0316, B:142:0x031d, B:143:0x0320, B:145:0x0322, B:147:0x032a, B:149:0x0330, B:151:0x033b, B:153:0x0344, B:156:0x0364, B:158:0x036f, B:159:0x0384, B:161:0x0386, B:164:0x0399, B:167:0x03a1, B:169:0x03af, B:170:0x03b3, B:172:0x03b9, B:175:0x03c5, B:180:0x03d5, B:198:0x049b, B:216:0x049f, B:219:0x04ce, B:221:0x04ea, B:222:0x0503, B:226:0x038e), top: B:8:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.anythink.core.common.e.b> a(android.content.Context r36, java.lang.String r37, boolean r38, boolean r39, boolean r40, java.util.Map<java.lang.String, java.lang.Object> r41) {
        /*
            Method dump skipped, instructions count: 1288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.a.a(android.content.Context, java.lang.String, boolean, boolean, boolean, java.util.Map):java.util.List");
    }

    private static void a(String str, com.anythink.core.common.e.b bVar) {
        try {
            ai unitGroupInfo = bVar.e().getUnitGroupInfo();
            com.anythink.core.common.e.m N = unitGroupInfo.N();
            if (N != null) {
                com.anythink.core.common.e.e h10 = bVar.h();
                ai c10 = com.anythink.core.b.f.a().c(str);
                double a10 = com.anythink.core.common.k.g.a(c10);
                com.anythink.core.common.e.r rVar = new com.anythink.core.common.e.r();
                rVar.f5731a = 1;
                rVar.f5732b = a10;
                rVar.f5735e = h10;
                rVar.f5733c = c10;
                rVar.f5734d = unitGroupInfo;
                N.a(rVar, true);
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(ATBaseAdAdapter aTBaseAdAdapter, String str, String str2, com.anythink.core.c.d dVar, ai aiVar, int i10, Map<String, Object> map) {
        Map<String, Object> c10 = v.a().c(str2);
        int[] iArr = {0};
        if (c10.containsKey(ah.O)) {
            try {
                iArr[0] = ((Integer) c10.get(ah.O)).intValue();
            } catch (Throwable unused) {
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aiVar.c());
        com.anythink.core.common.e.e a10 = com.anythink.core.common.k.s.a(str, str2, "", dVar, sb2.toString(), 1, 0, iArr[0], map);
        com.anythink.core.common.k.s.a(a10, aiVar, i10, true);
        com.anythink.core.common.k.s.a(aTBaseAdAdapter, a10, aiVar);
        a10.f5595q = 3;
        a10.g(aTBaseAdAdapter.getNetworkPlacementId());
        aTBaseAdAdapter.setRefresh(false);
    }

    private static void a(JSONArray jSONArray, int i10, String str, int i11, String str2, boolean z10, int i12) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("priority", i10);
            jSONObject.put("unit_id", str);
            jSONObject.put("nw_firm_id", i11);
            jSONObject.put("nw_ver", str2);
            jSONObject.put("result", z10 ? 1 : 0);
            if (i12 != -1) {
                jSONObject.put("reason", i12);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        jSONArray.put(jSONObject);
    }

    public final void a(String str, String str2) {
        aj remove;
        synchronized (v.a().a(str)) {
            ConcurrentHashMap<String, aj> concurrentHashMap = this.f4891c.get(str);
            if (concurrentHashMap != null && concurrentHashMap.size() > 0 && (remove = concurrentHashMap.remove(str2)) != null) {
                remove.c();
            }
        }
    }

    public final void a(String str, String str2, com.anythink.core.common.e.b bVar) {
        aj ajVar;
        synchronized (v.a().a(str)) {
            if (bVar == null) {
                return;
            }
            ConcurrentHashMap<String, aj> concurrentHashMap = this.f4891c.get(str);
            if (concurrentHashMap != null && concurrentHashMap.size() > 0 && (ajVar = concurrentHashMap.get(str2)) != null) {
                ajVar.a(bVar);
                if (!ajVar.d()) {
                    concurrentHashMap.remove(str2);
                }
            }
        }
    }

    public final void a(final Context context, final com.anythink.core.common.e.b bVar) {
        final ATBaseAdAdapter e10 = bVar.e();
        final com.anythink.core.common.e.e h10 = bVar.h();
        ai unitGroupInfo = e10 != null ? e10.getUnitGroupInfo() : null;
        if (h10 != null) {
            v.a().b(h10.W()).a(h10.X(), unitGroupInfo != null ? com.anythink.core.common.k.g.a(unitGroupInfo) : 0.0d, unitGroupInfo);
            b(h10.W(), unitGroupInfo);
            com.anythink.core.common.k.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.anythink.core.a.a.a(context).a(h10.Y(), h10.W(), h10.x());
                    com.anythink.core.a.c.a();
                    com.anythink.core.a.c.a(h10.W());
                    com.anythink.core.a.c.a().a(h10.W(), h10.x());
                    a.this.a(h10.W(), h10.x(), bVar);
                    MediationBidManager b10 = com.anythink.core.b.f.a().b();
                    if (b10 != null) {
                        b10.notifyWinnerDisplay(h10.W(), e10.getUnitGroupInfo());
                    }
                }
            });
        }
    }

    public final com.anythink.core.common.e.b a(String str, ai aiVar) {
        com.anythink.core.common.e.m a10;
        ConcurrentHashMap<String, aj> concurrentHashMap;
        if (((aiVar.l() != 3 && aiVar.l() != 7) || ((a10 = com.anythink.core.b.f.a().a(aiVar)) != null && !a10.a())) && (concurrentHashMap = this.f4891c.get(str)) != null) {
            aj ajVar = concurrentHashMap.get(aiVar.t());
            com.anythink.core.common.e.b a11 = ajVar != null ? ajVar.a() : null;
            if (a11 != null && a11.j()) {
                return a11;
            }
            if (a11 != null) {
                a(str, a11);
                a11.k();
            }
        }
        return null;
    }

    public final void a(String str, String str2, com.anythink.core.c.d dVar) {
        com.anythink.core.common.e.b a10;
        synchronized (v.a().a(str)) {
            ConcurrentHashMap<String, aj> concurrentHashMap = this.f4891c.get(str);
            if (concurrentHashMap != null && concurrentHashMap.size() != 0) {
                Iterator<Map.Entry<String, aj>> it = concurrentHashMap.entrySet().iterator();
                while (it != null && it.hasNext()) {
                    aj value = it.next().getValue();
                    if (value != null && (a10 = value.a()) != null) {
                        if (a10.j()) {
                            if (!a10.b().equals(str2)) {
                                com.anythink.core.common.e.e N = a10.e().getTrackingInfo().N();
                                N.f5600v = str2;
                                N.f5595q = 4;
                                com.anythink.core.common.k.s.a(N, dVar);
                                com.anythink.core.common.j.c.a(N, a10.b());
                                value.a(N);
                            }
                        } else {
                            a(str, a10);
                            a10.k();
                        }
                    }
                }
            }
        }
    }

    private List<com.anythink.core.common.e.b> a(String str, boolean z10) {
        boolean z11;
        ConcurrentHashMap<String, aj> concurrentHashMap = this.f4891c.get(str);
        if (concurrentHashMap == null) {
            return null;
        }
        Iterator<Map.Entry<String, aj>> it = concurrentHashMap.entrySet().iterator();
        ArrayList arrayList = new ArrayList(3);
        com.anythink.core.common.e.b bVar = null;
        while (it.hasNext()) {
            aj value = it.next().getValue();
            com.anythink.core.common.e.b a10 = value != null ? value.a() : null;
            if (a10 == null || !a10.j()) {
                z11 = false;
            } else {
                z11 = true;
                if (z10) {
                    arrayList.add(a10);
                } else if (bVar == null || com.anythink.core.common.k.g.a(bVar.e().getUnitGroupInfo()) < com.anythink.core.common.k.g.a(a10.e().getUnitGroupInfo())) {
                    bVar = a10;
                }
            }
            if (!z11 && a10 != null) {
                a(str, a10);
                a10.k();
            }
        }
        if (z10) {
            Collections.sort(arrayList);
        } else if (bVar != null) {
            arrayList.add(bVar);
        }
        return arrayList;
    }
}
