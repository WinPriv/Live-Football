package com.iab.omid.library.vungle.adsession;

import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.iab.omid.library.vungle.d.b;
import com.iab.omid.library.vungle.d.e;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AdSessionConfiguration {
    private final CreativeType creativeType;
    private final Owner impressionOwner;
    private final ImpressionType impressionType;
    private final boolean isolateVerificationScripts;
    private final Owner mediaEventsOwner;

    private AdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z10) {
        this.creativeType = creativeType;
        this.impressionType = impressionType;
        this.impressionOwner = owner;
        if (owner2 == null) {
            this.mediaEventsOwner = Owner.NONE;
        } else {
            this.mediaEventsOwner = owner2;
        }
        this.isolateVerificationScripts = z10;
    }

    public static AdSessionConfiguration createAdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z10) {
        e.a(creativeType, "CreativeType is null");
        e.a(impressionType, "ImpressionType is null");
        e.a(owner, "Impression owner is null");
        e.a(owner, creativeType, impressionType);
        return new AdSessionConfiguration(creativeType, impressionType, owner, owner2, z10);
    }

    public boolean isNativeImpressionOwner() {
        if (Owner.NATIVE == this.impressionOwner) {
            return true;
        }
        return false;
    }

    public boolean isNativeMediaEventsOwner() {
        if (Owner.NATIVE == this.mediaEventsOwner) {
            return true;
        }
        return false;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, "impressionOwner", this.impressionOwner);
        b.a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
        b.a(jSONObject, ContentRecord.CREATIVE_TYPE, this.creativeType);
        b.a(jSONObject, "impressionType", this.impressionType);
        b.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }
}
