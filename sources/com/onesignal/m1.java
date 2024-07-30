package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageRepository.java */
/* loaded from: classes2.dex */
public final class m1 extends JSONObject {
    public m1(String str, String str2, String str3, int i10) throws JSONException {
        put("app_id", str);
        put("player_id", str2);
        put("variant_id", str3);
        put("device_type", i10);
        put("first_impression", true);
    }
}
