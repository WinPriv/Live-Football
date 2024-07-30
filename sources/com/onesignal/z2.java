package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSTrigger.java */
/* loaded from: classes2.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27217a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27218b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27219c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27220d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f27221e;

    public z2(JSONObject jSONObject) throws JSONException {
        int i10;
        this.f27217a = jSONObject.getString("id");
        String string = jSONObject.getString("kind");
        int i11 = 4;
        int[] d10 = s.f.d(4);
        int length = d10.length;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                break;
            }
            int i14 = d10[i13];
            if (a3.k.c(i14).equalsIgnoreCase(string)) {
                i11 = i14;
                break;
            }
            i13++;
        }
        this.f27218b = i11;
        this.f27219c = jSONObject.optString("property", null);
        String string2 = jSONObject.getString("operator");
        int[] _values = com.ironsource.adapters.facebook.a._values();
        int length2 = _values.length;
        while (true) {
            if (i12 < length2) {
                i10 = _values[i12];
                if (com.ironsource.adapters.facebook.a.f(i10).equalsIgnoreCase(string2)) {
                    break;
                } else {
                    i12++;
                }
            } else {
                i10 = 3;
                break;
            }
        }
        this.f27220d = i10;
        this.f27221e = jSONObject.opt("value");
    }

    public final String toString() {
        return "OSTrigger{triggerId='" + this.f27217a + "', kind=" + a3.k.D(this.f27218b) + ", property='" + this.f27219c + "', operatorType=" + com.ironsource.adapters.facebook.a.s(this.f27220d) + ", value=" + this.f27221e + '}';
    }
}
