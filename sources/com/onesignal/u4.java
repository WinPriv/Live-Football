package com.onesignal;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.onesignal.v3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserStatePushSynchronizer.java */
/* loaded from: classes2.dex */
public final class u4 extends v3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v4 f27104a;

    public u4(v4 v4Var) {
        this.f27104a = v4Var;
    }

    @Override // com.onesignal.v3.c
    public final void b(String str) {
        JSONObject e10;
        v4.f27153m = true;
        if (str == null || str.isEmpty()) {
            str = JsonUtils.EMPTY_JSON;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("tags")) {
                synchronized (this.f27104a.f27223a) {
                    v4 v4Var = this.f27104a;
                    JSONObject optJSONObject = ((JSONObject) v4Var.j().d().f27251t).optJSONObject("tags");
                    JSONObject optJSONObject2 = ((JSONObject) this.f27104a.o().d().f27251t).optJSONObject("tags");
                    synchronized (v4Var.f27223a) {
                        e10 = c3.e(optJSONObject, optJSONObject2, null, null);
                    }
                    q4 j10 = this.f27104a.j();
                    JSONObject optJSONObject3 = jSONObject.optJSONObject("tags");
                    j10.getClass();
                    synchronized (q4.f26990d) {
                        j10.f26994c.put("tags", optJSONObject3);
                    }
                    this.f27104a.j().h();
                    this.f27104a.o().f(jSONObject, e10);
                    this.f27104a.o().h();
                }
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }
}
