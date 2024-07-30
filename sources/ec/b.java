package ec;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSOutcomeEventParams.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f27889a;

    /* renamed from: b, reason: collision with root package name */
    public final d f27890b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27891c;

    /* renamed from: d, reason: collision with root package name */
    public long f27892d;

    public b(String str, d dVar, float f, long j10) {
        zc.d.d(str, "outcomeId");
        this.f27889a = str;
        this.f27890b = dVar;
        this.f27891c = f;
        this.f27892d = j10;
    }

    public final JSONObject a() throws JSONException {
        JSONObject put = new JSONObject().put("id", this.f27889a);
        d dVar = this.f27890b;
        if (dVar != null) {
            JSONObject jSONObject = new JSONObject();
            e eVar = dVar.f27893a;
            if (eVar != null) {
                JSONObject put2 = new JSONObject().put("notification_ids", eVar.f27895a).put("in_app_message_ids", eVar.f27896b);
                zc.d.c(put2, "JSONObject()\n        .pu…AM_IDS, inAppMessagesIds)");
                jSONObject.put("direct", put2);
            }
            e eVar2 = dVar.f27894b;
            if (eVar2 != null) {
                JSONObject put3 = new JSONObject().put("notification_ids", eVar2.f27895a).put("in_app_message_ids", eVar2.f27896b);
                zc.d.c(put3, "JSONObject()\n        .pu…AM_IDS, inAppMessagesIds)");
                jSONObject.put("indirect", put3);
            }
            put.put("sources", jSONObject);
        }
        float f = 0;
        float f10 = this.f27891c;
        if (f10 > f) {
            put.put("weight", Float.valueOf(f10));
        }
        long j10 = this.f27892d;
        if (j10 > 0) {
            put.put("timestamp", j10);
        }
        zc.d.c(put, "json");
        return put;
    }

    public final String toString() {
        return "OSOutcomeEventParams{outcomeId='" + this.f27889a + "', outcomeSource=" + this.f27890b + ", weight=" + this.f27891c + ", timestamp=" + this.f27892d + '}';
    }
}
