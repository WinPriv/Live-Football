package ka;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class y6 {

    /* renamed from: a, reason: collision with root package name */
    public String f32209a;

    /* renamed from: b, reason: collision with root package name */
    public int f32210b;

    /* renamed from: c, reason: collision with root package name */
    public Object f32211c;

    public y6(int i10) {
        if (i10 != 1) {
            this.f32210b = -1;
        }
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("att_pl", this.f32210b);
            jSONObject.put("att_ver", this.f32209a);
            jSONObject.put("att_inf", (String) this.f32211c);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
