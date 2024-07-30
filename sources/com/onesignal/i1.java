package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageRepository.java */
/* loaded from: classes2.dex */
public final class i1 extends JSONObject {
    public i1(String str, int i10, String str2, String str3, String str4, boolean z10) throws JSONException {
        put("app_id", str);
        put("device_type", i10);
        put("player_id", str2);
        put("click_id", str3);
        put("variant_id", str4);
        if (z10) {
            put("first_click", true);
        }
    }
}
