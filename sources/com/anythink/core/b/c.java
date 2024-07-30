package com.anythink.core.b;

import com.anythink.core.common.e.ai;
import com.anythink.core.common.e.al;
import com.anythink.core.common.e.l;
import com.anythink.core.common.e.m;
import com.anythink.core.common.k.t;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    String f4601a;

    /* renamed from: b, reason: collision with root package name */
    List<ai> f4602b;

    /* renamed from: c, reason: collision with root package name */
    List<ai> f4603c;

    public c(com.anythink.core.common.e.a aVar) {
        super(aVar);
        this.f4601a = com.anythink.core.common.k.g.a(aVar.f5387a, this.f4622l, this.f4623m, aVar.f5391e, 0).toString();
        if (aVar.f5395j == null) {
            this.f4602b = new ArrayList(4);
            this.f4603c = new ArrayList(1);
        } else {
            this.f4602b = new ArrayList(aVar.f5395j);
            this.f4603c = new ArrayList(aVar.f5395j);
        }
    }

    private String e() {
        if (this.f4607d.f5398m) {
            JSONArray jSONArray = new JSONArray();
            if (this.f4626q != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ad_source_id", this.f4626q.f5699k);
                    jSONObject.put("tp_bid_id", this.f4626q.f5695g);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        }
        return ContentRecord.XRINFOLIST_NULL;
    }

    @Override // com.anythink.core.b.e
    public final void a(List<JSONObject> list, com.anythink.core.common.g.i iVar) {
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        a(jSONArray, jSONArray2);
        a(jSONArray);
        com.anythink.core.b.a.b bVar = new com.anythink.core.b.a.b();
        bVar.f4567a = this.f4601a;
        bVar.f4568b = jSONArray2.toString();
        bVar.f4569c = e();
        bVar.f = this.f4607d.f5399n.ar();
        Boolean bool = this.f4607d.f5408x;
        if (bool != null && bool.booleanValue()) {
            al alVar = this.f4607d.f5407w;
            if (alVar != null) {
                bVar.f4570d = alVar.a().toString();
            }
            bVar.f4571e = jSONArray.toString();
        }
        bVar.f4572g = this.f4607d.f5399n.e();
        com.anythink.core.b.a.a aVar = new com.anythink.core.b.a.a(this.f4624n, this.f4623m, this.f4622l, list, 0);
        aVar.a(bVar);
        aVar.a(0, iVar);
    }

    @Override // com.anythink.core.b.e
    public final String b() {
        return this.f4607d.f5397l;
    }

    @Override // com.anythink.core.b.e, com.anythink.core.b.d
    public final void a(ai aiVar, l lVar, long j10) {
        super.a(aiVar, lVar, j10);
        if (aiVar.aa()) {
            return;
        }
        com.anythink.core.common.k.g.a(this.f4602b, aiVar, false);
    }

    private void a(JSONArray jSONArray) {
        List<ai> list;
        Boolean bool = this.f4607d.f5408x;
        if (bool == null || !bool.booleanValue() || (list = this.f4607d.f5394i) == null) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ai aiVar = this.f4607d.f5394i.get(i10);
            if (t.a(this.f4623m, aiVar)) {
                jSONArray.put(new al.a(aiVar).a());
            }
        }
    }

    private void a(JSONArray jSONArray, JSONArray jSONArray2) {
        List<ai> list;
        List<ai> list2 = this.f4602b;
        if (list2 != null) {
            int size = list2.size();
            for (int i10 = 0; i10 < size; i10++) {
                ai aiVar = list2.get(i10);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ad_source_id", aiVar.t());
                    jSONObject.put("price", aiVar.x());
                    m N = aiVar.N();
                    if (N != null) {
                        jSONObject.put("tp_bid_id", N.f5695g);
                    }
                    jSONObject.put(com.anythink.core.common.l.am, aiVar.ag());
                    jSONArray2.put(jSONObject);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        Boolean bool = this.f4607d.f5408x;
        if (bool == null || !bool.booleanValue() || (list = this.f4603c) == null) {
            return;
        }
        for (ai aiVar2 : list) {
            if (t.a(this.f4623m, aiVar2)) {
                jSONArray.put(new al.a(aiVar2).a());
            }
        }
    }
}
