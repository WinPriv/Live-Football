package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class aj {

    /* loaded from: classes2.dex */
    public final class a extends com.ironsource.lifecycle.g {
        public a(aj ajVar) {
            zc.d.d(ajVar, "this$0");
        }

        @Override // com.ironsource.lifecycle.g, java.lang.Runnable
        public final void run() {
            JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
            try {
                mediationAdditionalData.put("duration", this.f24734s);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            com.ironsource.mediationsdk.a.g.f25067w.b(new com.ironsource.mediationsdk.a.c(44, mediationAdditionalData));
        }
    }

    public final void a() {
        new com.ironsource.lifecycle.a(new a(this));
    }
}
