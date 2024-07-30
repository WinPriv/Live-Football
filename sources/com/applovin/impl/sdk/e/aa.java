package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class aa extends ab {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.e f18840a;

    /* renamed from: b, reason: collision with root package name */
    private final AppLovinAdRewardListener f18841b;

    public aa(com.applovin.impl.sdk.ad.e eVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.p pVar) {
        super("TaskValidateAppLovinReward", pVar);
        this.f18840a = eVar;
        this.f18841b = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.sdk.e.y
    public String a() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.sdk.e.ab
    public boolean b() {
        return this.f18840a.aG();
    }

    @Override // com.applovin.impl.sdk.e.y
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f18840a.getAdZone().a());
        String clCode = this.f18840a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.sdk.e.ab
    public void a(com.applovin.impl.sdk.b.c cVar) {
        this.f18840a.a(cVar);
        String b10 = cVar.b();
        Map<String, String> a10 = cVar.a();
        if (b10.equals("accepted")) {
            this.f18841b.userRewardVerified(this.f18840a, a10);
            return;
        }
        if (b10.equals("quota_exceeded")) {
            this.f18841b.userOverQuota(this.f18840a, a10);
        } else if (b10.equals("rejected")) {
            this.f18841b.userRewardRejected(this.f18840a, a10);
        } else {
            this.f18841b.validationRequestFailed(this.f18840a, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.sdk.e.y
    public void a(int i10) {
        String str;
        super.a(i10);
        if (i10 >= 400 && i10 < 500) {
            this.f18841b.userRewardRejected(this.f18840a, Collections.emptyMap());
            str = "rejected";
        } else {
            this.f18841b.validationRequestFailed(this.f18840a, i10);
            str = "network_timeout";
        }
        this.f18840a.a(com.applovin.impl.sdk.b.c.a(str));
    }
}
