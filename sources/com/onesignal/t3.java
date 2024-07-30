package com.onesignal;

import com.google.android.gms.measurement.AppMeasurement;
import com.onesignal.s3;
import org.json.JSONObject;

/* compiled from: OneSignalRemoteParams.java */
/* loaded from: classes2.dex */
public final class t3 extends s3.e {
    public t3(JSONObject jSONObject) {
        Boolean valueOf;
        Boolean valueOf2;
        Boolean valueOf3;
        Boolean valueOf4;
        jSONObject.optBoolean("enterp", false);
        jSONObject.optBoolean("require_email_auth", false);
        jSONObject.optBoolean("require_user_id_auth", false);
        this.f27044b = jSONObject.optJSONArray("chnl_lst");
        this.f27045c = jSONObject.optBoolean("fba", false);
        this.f27046d = jSONObject.optBoolean("restore_ttl_filter", true);
        this.f27043a = jSONObject.optString("android_sender_id", null);
        this.f27047e = jSONObject.optBoolean("clear_group_on_summary_click", true);
        this.f = jSONObject.optBoolean("receive_receipts_enable", false);
        if (!jSONObject.has("disable_gms_missing_prompt")) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(jSONObject.optBoolean("disable_gms_missing_prompt", false));
        }
        this.f27048g = valueOf;
        if (!jSONObject.has("unsubscribe_on_notifications_disabled")) {
            valueOf2 = null;
        } else {
            valueOf2 = Boolean.valueOf(jSONObject.optBoolean("unsubscribe_on_notifications_disabled", true));
        }
        this.f27049h = valueOf2;
        if (!jSONObject.has("location_shared")) {
            valueOf3 = null;
        } else {
            valueOf3 = Boolean.valueOf(jSONObject.optBoolean("location_shared", true));
        }
        this.f27050i = valueOf3;
        if (!jSONObject.has("requires_user_privacy_consent")) {
            valueOf4 = null;
        } else {
            valueOf4 = Boolean.valueOf(jSONObject.optBoolean("requires_user_privacy_consent", false));
        }
        this.f27051j = valueOf4;
        this.f27052k = new s3.d();
        if (jSONObject.has("outcomes")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("outcomes");
            s3.d dVar = this.f27052k;
            if (optJSONObject.has("v2_enabled")) {
                dVar.f27042h = optJSONObject.optBoolean("v2_enabled");
            }
            if (optJSONObject.has("direct")) {
                dVar.f27040e = optJSONObject.optJSONObject("direct").optBoolean("enabled");
            }
            if (optJSONObject.has("indirect")) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("indirect");
                dVar.f = optJSONObject2.optBoolean("enabled");
                if (optJSONObject2.has("notification_attribution")) {
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject("notification_attribution");
                    dVar.f27036a = optJSONObject3.optInt("minutes_since_displayed", 1440);
                    dVar.f27037b = optJSONObject3.optInt("limit", 10);
                }
                if (optJSONObject2.has("in_app_message_attribution")) {
                    JSONObject optJSONObject4 = optJSONObject2.optJSONObject("in_app_message_attribution");
                    dVar.f27038c = optJSONObject4.optInt("minutes_since_displayed", 1440);
                    dVar.f27039d = optJSONObject4.optInt("limit", 10);
                }
            }
            if (optJSONObject.has("unattributed")) {
                dVar.f27041g = optJSONObject.optJSONObject("unattributed").optBoolean("enabled");
            }
        }
        this.f27053l = new s3.c();
        if (jSONObject.has(AppMeasurement.FCM_ORIGIN)) {
            JSONObject optJSONObject5 = jSONObject.optJSONObject(AppMeasurement.FCM_ORIGIN);
            this.f27053l.f27035c = optJSONObject5.optString("api_key", null);
            this.f27053l.f27034b = optJSONObject5.optString("app_id", null);
            this.f27053l.f27033a = optJSONObject5.optString("project_id", null);
        }
    }
}
