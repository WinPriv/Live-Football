package com.ironsource.mediationsdk.impressionData;

import android.content.Context;
import com.huawei.openalliance.ad.constant.av;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.K;
import com.ironsource.mediationsdk.L;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.j;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.b;
import com.ironsource.mediationsdk.utils.i;
import java.util.List;
import org.json.JSONObject;
import zc.d;

/* loaded from: classes2.dex */
public final class a implements i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f25504a = true;

    /* renamed from: b, reason: collision with root package name */
    public String f25505b = "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData";

    /* renamed from: com.ironsource.mediationsdk.impressionData.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0332a implements com.ironsource.mediationsdk.server.a {
        @Override // com.ironsource.mediationsdk.server.a
        public final void a(boolean z10) {
            if (!z10) {
                IronLog.API.error("failed to send impression data");
            }
        }
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void a(String str) {
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void a(List<IronSource.AD_UNIT> list, boolean z10, j jVar) {
        if (jVar == null) {
            return;
        }
        b bVar = jVar.f25678e.f;
        this.f25504a = bVar.f25883a;
        this.f25505b = bVar.f25884b;
    }

    public final void a(String str, JSONObject jSONObject) {
        d.d(str, "dataSource");
        d.d(jSONObject, "impressionData");
        if (!this.f25504a) {
            IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("deviceOS", "android");
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            if (applicationContext != null) {
                jSONObject2.put(av.f22030e, IronSourceUtils.getDeviceType(applicationContext));
                K ironSourceAdvId = IronSourceUtils.getIronSourceAdvId(applicationContext);
                if (ironSourceAdvId != null) {
                    jSONObject2.put("advId", ironSourceAdvId.f24835a);
                    jSONObject2.put("advIdType", ironSourceAdvId.f24836b);
                }
            }
            String str2 = L.a().f24855j;
            if (str2 != null) {
                jSONObject2.put("applicationKey", str2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putOpt("externalMediationSource", str);
            jSONObject3.putOpt("externalMediationData", jSONObject);
            jSONObject3.putOpt("clientParams", jSONObject2);
            IronLog.API.info("impressionData: " + jSONObject3);
            HttpFunctions.sendPostRequest(this.f25505b, jSONObject3.toString(), new C0332a());
        } catch (Exception e10) {
            IronLog.API.error("exception " + ((Object) e10.getMessage()) + " sending impression data");
            e10.printStackTrace();
        }
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void f() {
    }
}
