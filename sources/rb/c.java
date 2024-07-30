package rb;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c extends a {
    public c(int i10) {
        this.f34988b = i10;
    }

    @Override // rb.a
    public final String a(ArrayList<com.ironsource.mediationsdk.a.c> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f34987a = jSONObject;
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
        return b(jSONArray);
    }

    @Override // rb.a
    public final String b() {
        return "https://outcome-ssp.supersonicads.com/mediation?adUnit=3";
    }

    @Override // rb.a
    public final String c() {
        return "outcome";
    }
}
