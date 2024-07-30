package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageRepository.java */
/* loaded from: classes2.dex */
public final class k1 extends JSONObject {
    public k1(String str, String str2, String str3, int i10, String str4) throws JSONException {
        put("app_id", str);
        put("player_id", str2);
        put("variant_id", str3);
        put("device_type", i10);
        put("page_id", str4);
    }
}
