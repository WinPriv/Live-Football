package com.onesignal;

import com.onesignal.b4;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserStateSecondaryChannelSynchronizer.java */
/* loaded from: classes2.dex */
public abstract class y4 extends z4 {
    public y4(b4.b bVar) {
        super(bVar);
    }

    public abstract void E();

    public abstract void F();

    public abstract String G();

    public abstract String H();

    public abstract int I();

    @Override // com.onesignal.z4
    public final void e(JSONObject jSONObject) {
        try {
            jSONObject.put("device_type", I());
            jSONObject.putOpt("device_player_id", e3.s());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.onesignal.z4
    public final void h(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            E();
        }
    }

    @Override // com.onesignal.z4
    public final int l() {
        return 5;
    }

    @Override // com.onesignal.z4
    public final void t(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(H(), jSONObject.get("identifier"));
                if (jSONObject.has(G())) {
                    jSONObject2.put(G(), jSONObject.get(G()));
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            F();
        }
    }

    @Override // com.onesignal.z4
    public final void x() {
        boolean z10;
        if (k() == null && n() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && e3.s() != null) {
            m(0).a();
        }
    }
}
