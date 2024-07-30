package rb;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b extends a {
    public b(int i10) {
        this.f34988b = i10;
    }

    @Override // rb.a
    public final String a(ArrayList<com.ironsource.mediationsdk.a.c> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f34987a = jSONObject;
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<com.ironsource.mediationsdk.a.c> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject c10 = a.c(it.next());
                    if (c10 != null) {
                        jSONArray.put(c10);
                    }
                }
            }
            jSONObject2.put("table", "super.dwh.mediation_events");
            jSONObject2.put("data", b(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    @Override // rb.a
    public final String b() {
        return "https://outcome-ssp.supersonicads.com/mediation?adUnit=2";
    }

    @Override // rb.a
    public final String c() {
        return "ironbeast";
    }
}
