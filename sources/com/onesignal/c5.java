package com.onesignal;

import com.onesignal.v3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserStateSynchronizer.java */
/* loaded from: classes2.dex */
public final class c5 extends v3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f26713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JSONObject f26714b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26715c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z4 f26716d;

    public c5(z4 z4Var, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        this.f26716d = z4Var;
        this.f26713a = jSONObject;
        this.f26714b = jSONObject2;
        this.f26715c = str;
    }

    @Override // com.onesignal.v3.c
    public final void a(int i10, String str, Throwable th) {
        synchronized (this.f26716d.f27223a) {
            this.f26716d.f27231j = false;
            e3.b(4, "Failed last request. statusCode: " + i10 + "\nresponse: " + str, null);
            if (z4.a(this.f26716d, i10, str, "not a valid device_type")) {
                z4.c(this.f26716d);
            } else {
                z4.d(this.f26716d, i10);
            }
        }
    }

    @Override // com.onesignal.v3.c
    public final void b(String str) {
        synchronized (this.f26716d.f27223a) {
            z4 z4Var = this.f26716d;
            z4Var.f27231j = false;
            z4Var.j().i(this.f26713a, this.f26714b);
            try {
                e3.b(6, "doCreateOrNewSession:response: " + str, null);
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("id")) {
                    String optString = jSONObject.optString("id");
                    this.f26716d.C(optString);
                    e3.b(5, "Device registered, UserId = " + optString, null);
                } else {
                    e3.b(5, "session sent, UserId = " + this.f26715c, null);
                }
                q4 p10 = this.f26716d.p();
                Boolean bool = Boolean.FALSE;
                p10.getClass();
                synchronized (q4.f26990d) {
                    p10.f26993b.put("session", bool);
                }
                this.f26716d.p().h();
                if (jSONObject.has("in_app_messages")) {
                    e3.n().H(jSONObject.getJSONArray("in_app_messages"));
                }
                this.f26716d.t(this.f26714b);
            } catch (JSONException e10) {
                e3.b(3, "ERROR parsing on_session or create JSON Response.", e10);
            }
        }
    }
}
