package rb;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.EventMonitorRecord;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f34987a;

    /* renamed from: b, reason: collision with root package name */
    public int f34988b;

    /* renamed from: c, reason: collision with root package name */
    public String f34989c;

    public static JSONObject c(com.ironsource.mediationsdk.a.c cVar) {
        try {
            JSONObject jSONObject = !TextUtils.isEmpty(cVar.c()) ? new JSONObject(cVar.c()) : new JSONObject();
            jSONObject.put(EventMonitorRecord.EVENT_ID, cVar.a());
            jSONObject.put("timestamp", cVar.b());
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public abstract String a(ArrayList<com.ironsource.mediationsdk.a.c> arrayList, JSONObject jSONObject);

    public abstract String b();

    public final String b(JSONArray jSONArray) {
        try {
            if (this.f34987a != null) {
                JSONObject jSONObject = new JSONObject(this.f34987a.toString());
                jSONObject.put("timestamp", IronSourceUtils.getTimeStamp());
                jSONObject.put(this.f34988b != 2 ? "events" : "InterstitialEvents", jSONArray);
                return jSONObject.toString();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public abstract String c();
}
