package com.applovin.impl.b.a;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends d {
    public e(JSONObject jSONObject, p pVar) {
        super(jSONObject, pVar);
    }

    public String e() {
        return a("title");
    }

    public String f() {
        return a(CrashHianalyticsData.MESSAGE);
    }

    public List<f> g() {
        f a10;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f17273b, "transitions", null);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject != null && (a10 = f.a(jSONObject, this.f17272a)) != null) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.b.a.d
    public String toString() {
        return "ConsentFlowState{id=" + a() + "type=" + b() + "isInitialState=" + c() + "title=" + e() + "message=" + f() + "actions=" + g() + "}";
    }
}
