package com.anythink.core.b;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.c.k;
import com.anythink.core.common.e.ai;
import com.anythink.core.common.e.l;
import com.anythink.core.common.e.m;
import com.anythink.core.common.e.r;
import com.anythink.core.common.k.s;
import com.huawei.openalliance.ad.constant.w;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: d, reason: collision with root package name */
    protected com.anythink.core.common.e.a f4607d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f4608e;

    /* renamed from: a, reason: collision with root package name */
    private final String f4606a = getClass().getSimpleName().concat(w.bE);
    protected AtomicBoolean f = new AtomicBoolean(false);

    public d(com.anythink.core.common.e.a aVar) {
        this.f4607d = aVar;
    }

    public static JSONArray b(List<JSONObject> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (JSONObject jSONObject : list) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(k.a.f5346d, 67);
                if (jSONObject.has("unit_ids")) {
                    jSONObject2.put("unit_ids", jSONObject.get("unit_ids"));
                }
                jSONArray.put(jSONObject2);
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    public abstract void a();

    public abstract void a(com.anythink.core.b.b.a aVar);

    public abstract void a(ai aiVar, l lVar, long j10);

    public void a(boolean z10) {
        this.f4608e = z10;
    }

    public final boolean c() {
        return this.f.get();
    }

    public static JSONArray a(List<ai> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (ai aiVar : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(k.a.f5346d, aiVar.c());
                jSONObject.put("ad_source_id", aiVar.t());
                jSONObject.put("content", aiVar.g());
                if (!TextUtils.isEmpty(aiVar.z())) {
                    jSONObject.put("error", aiVar.z());
                }
                jSONArray.put(jSONObject);
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    public static void a(ai aiVar, String str, long j10, int i10) {
        aiVar.a(j10);
        aiVar.a(0.0d);
        aiVar.d(0.0d);
        aiVar.g(i10);
        aiVar.b();
        if (TextUtils.isEmpty(str)) {
            aiVar.h("bid error");
        } else {
            aiVar.h(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.anythink.core.common.e.ai r22, com.anythink.core.common.e.m r23) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.b.d.a(com.anythink.core.common.e.ai, com.anythink.core.common.e.m):void");
    }

    public final boolean a(ai aiVar, String str, int i10) {
        return a(aiVar, str, i10, 0);
    }

    public final boolean a(ai aiVar, String str, int i10, int i11) {
        m a10 = f.a().a(aiVar);
        if (a10 != null && !a10.a()) {
            aiVar.a(a10, 0, i10, i11);
            aiVar.h(str);
            return true;
        }
        if (a10 != null) {
            try {
                com.anythink.core.common.e.a aVar = this.f4607d;
                String str2 = aVar.f5389c;
                String str3 = aVar.f5390d;
                com.anythink.core.c.d dVar = aVar.f5399n;
                com.anythink.core.common.j jVar = aVar.f5388b;
                com.anythink.core.common.e.e a11 = s.a(str2, str3, "", dVar, "", 1, 0, 0, jVar != null ? jVar.f6025g : null);
                r rVar = new r();
                rVar.f5731a = 1;
                rVar.f5732b = a10.getSortPrice();
                rVar.f5735e = a11;
                rVar.f5733c = aiVar;
                rVar.f5734d = aiVar;
                a10.a(rVar, true);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r0 <= 1.0d) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r7, com.anythink.core.common.e.l r8, double r9) {
        /*
            r6 = this;
            r0 = 28
            if (r7 == r0) goto L5
            return
        L5:
            com.anythink.core.common.e.a r0 = r6.f4607d
            com.anythink.core.c.d r0 = r0.f5399n
            org.json.JSONObject r0 = r0.f()
            if (r0 == 0) goto L24
            java.lang.String r7 = java.lang.String.valueOf(r7)
            double r0 = r0.optDouble(r7)
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L24
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 > 0) goto L24
            goto L29
        L24:
            r0 = 4606732058837280358(0x3fee666666666666, double:0.95)
        L29:
            double r2 = r8.originPrice
            double r2 = r2 * r0
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 5
            r7.<init>(r0)
            com.anythink.core.common.w r0 = com.anythink.core.common.w.a()
            com.anythink.core.common.e.a r1 = r6.f4607d
            java.lang.String r4 = r1.f5390d
            java.lang.String r1 = r1.f5389c
            java.util.List r0 = r0.b(r4, r1)
            if (r0 == 0) goto L45
            r7.addAll(r0)
        L45:
            java.util.Iterator r7 = r7.iterator()
        L49:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r7.next()
            com.anythink.core.common.e.ai r0 = (com.anythink.core.common.e.ai) r0
            double r0 = com.anythink.core.common.k.g.a(r0)
            double r4 = r8.originPrice
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L49
            double r2 = java.lang.Math.max(r2, r0)
        L63:
            double r9 = java.lang.Math.max(r2, r9)
            double r0 = r8.originPrice
            double r0 = r0 - r9
            double r2 = java.lang.Math.random()
            double r2 = r2 * r0
            double r2 = r2 + r9
            r8.setPrice(r2)
            r8.setSortPrice(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.b.d.a(int, com.anythink.core.common.e.l, double):void");
    }

    public final double a(ai aiVar) {
        if (aiVar.ad() == null) {
            return 1.0d;
        }
        if (aiVar.ad() == ATAdConst.CURRENCY.RMB_CENT) {
            return (1.0d / this.f4607d.f5399n.p()) * 100.0d;
        }
        if (aiVar.ad() == ATAdConst.CURRENCY.RMB) {
            return 1.0d / this.f4607d.f5399n.p();
        }
        return 1.0d;
    }

    public final double a(double d10, ai aiVar) {
        double p10;
        if (aiVar.ad() == null) {
            return d10;
        }
        if (aiVar.ad() == ATAdConst.CURRENCY.RMB) {
            p10 = this.f4607d.f5399n.p();
        } else {
            if (aiVar.ad() != ATAdConst.CURRENCY.RMB_CENT) {
                return d10;
            }
            d10 /= 100.0d;
            p10 = this.f4607d.f5399n.p();
        }
        return d10 * p10;
    }
}
