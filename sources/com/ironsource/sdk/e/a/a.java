package com.ironsource.sdk.e.a;

import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;
import s.f;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f26451a = Omid.getVersion();

    /* renamed from: b, reason: collision with root package name */
    public final Partner f26452b = Partner.createPartner("Ironsrc", "7");

    /* renamed from: d, reason: collision with root package name */
    public boolean f26454d = false;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, AdSession> f26453c = new HashMap<>();

    /* renamed from: com.ironsource.sdk.e.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0341a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f26455a;

        /* renamed from: b, reason: collision with root package name */
        public Owner f26456b;

        /* renamed from: c, reason: collision with root package name */
        public Owner f26457c;

        /* renamed from: d, reason: collision with root package name */
        public String f26458d;

        /* renamed from: e, reason: collision with root package name */
        public ImpressionType f26459e;
        public CreativeType f;

        /* renamed from: g, reason: collision with root package name */
        public String f26460g;

        public static C0341a a(JSONObject jSONObject) {
            C0341a c0341a = new C0341a();
            c0341a.f26455a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String optString = jSONObject.optString("impressionOwner", "");
            if (!TextUtils.isEmpty(optString)) {
                try {
                    c0341a.f26456b = Owner.valueOf(optString.toUpperCase());
                    String optString2 = jSONObject.optString("videoEventsOwner", "");
                    if (!TextUtils.isEmpty(optString)) {
                        try {
                            c0341a.f26457c = Owner.valueOf(optString2.toUpperCase());
                            c0341a.f26458d = jSONObject.optString("customReferenceData", "");
                            String optString3 = jSONObject.optString(ContentRecord.CREATIVE_TYPE, "");
                            if (!TextUtils.isEmpty(optString3)) {
                                for (CreativeType creativeType : CreativeType.values()) {
                                    if (optString3.equalsIgnoreCase(creativeType.toString())) {
                                        c0341a.f = creativeType;
                                        String optString4 = jSONObject.optString("impressionType", "");
                                        if (!TextUtils.isEmpty(optString4)) {
                                            for (ImpressionType impressionType : ImpressionType.values()) {
                                                if (optString4.equalsIgnoreCase(impressionType.toString())) {
                                                    c0341a.f26459e = impressionType;
                                                    String optString5 = jSONObject.optString("adViewId", "");
                                                    if (!TextUtils.isEmpty(optString5)) {
                                                        c0341a.f26460g = optString5;
                                                        String optString6 = jSONObject.optString("videoEventsOwner", "");
                                                        Owner owner = Owner.NATIVE;
                                                        try {
                                                            Owner.valueOf(optString6.toUpperCase());
                                                        } catch (IllegalArgumentException unused) {
                                                        }
                                                        return c0341a;
                                                    }
                                                    throw new IllegalArgumentException(f.b("Missing adview id in OMID params", optString5));
                                                }
                                            }
                                            throw new IllegalArgumentException(f.b("Missing OMID creativeType", optString4));
                                        }
                                        throw new IllegalArgumentException(f.b("Missing OMID creativeType", optString4));
                                    }
                                }
                                throw new IllegalArgumentException(f.b("Missing OMID creativeType", optString3));
                            }
                            throw new IllegalArgumentException(f.b("Missing OMID creativeType", optString3));
                        } catch (IllegalArgumentException unused2) {
                            throw new IllegalArgumentException(f.b("Invalid OMID videoEventsOwner ", optString2));
                        }
                    }
                    throw new IllegalArgumentException("Missing OMID videoEventsOwner");
                } catch (IllegalArgumentException unused3) {
                    throw new IllegalArgumentException(f.b("Invalid OMID impressionOwner ", optString));
                }
            }
            throw new IllegalArgumentException("Missing OMID impressionOwner");
        }
    }

    public final com.ironsource.sdk.g.f a() {
        com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f();
        fVar.a("omidVersion", SDKUtils.encodeString(f26451a));
        fVar.a("omidPartnerName", SDKUtils.encodeString("Ironsrc"));
        fVar.a("omidPartnerVersion", SDKUtils.encodeString("7"));
        fVar.a("omidActiveAdSessions", SDKUtils.encodeString(Arrays.toString(this.f26453c.keySet().toArray())));
        return fVar;
    }

    public void a(JSONObject jSONObject) {
        if (!this.f26454d) {
            throw new IllegalStateException("OMID has not been activated");
        }
        if (jSONObject == null) {
            throw new IllegalStateException("OMID Session has not started");
        }
    }
}
