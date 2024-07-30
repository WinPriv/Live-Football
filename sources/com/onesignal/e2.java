package com.onesignal;

import com.huawei.hms.ads.gl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSOutcomeEvent.java */
/* loaded from: classes2.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final bc.b f26741a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONArray f26742b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26743c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26744d;

    /* renamed from: e, reason: collision with root package name */
    public final Float f26745e;

    public e2(bc.b bVar, JSONArray jSONArray, String str, long j10, float f) {
        this.f26741a = bVar;
        this.f26742b = jSONArray;
        this.f26743c = str;
        this.f26744d = j10;
        this.f26745e = Float.valueOf(f);
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = this.f26742b;
        if (jSONArray != null && jSONArray.length() > 0) {
            jSONObject.put("notification_ids", jSONArray);
        }
        jSONObject.put("id", this.f26743c);
        Float f = this.f26745e;
        if (f.floatValue() > gl.Code) {
            jSONObject.put("weight", f);
        }
        long j10 = this.f26744d;
        if (j10 > 0) {
            jSONObject.put("timestamp", j10);
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e2.class != obj.getClass()) {
            return false;
        }
        e2 e2Var = (e2) obj;
        if (this.f26741a.equals(e2Var.f26741a) && this.f26742b.equals(e2Var.f26742b) && this.f26743c.equals(e2Var.f26743c) && this.f26744d == e2Var.f26744d && this.f26745e.equals(e2Var.f26745e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 1;
        Object[] objArr = {this.f26741a, this.f26742b, this.f26743c, Long.valueOf(this.f26744d), this.f26745e};
        for (int i11 = 0; i11 < 5; i11++) {
            Object obj = objArr[i11];
            int i12 = i10 * 31;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i10 = i12 + hashCode;
        }
        return i10;
    }

    public final String toString() {
        return "OutcomeEvent{session=" + this.f26741a + ", notificationIds=" + this.f26742b + ", name='" + this.f26743c + "', timestamp=" + this.f26744d + ", weight=" + this.f26745e + '}';
    }
}
