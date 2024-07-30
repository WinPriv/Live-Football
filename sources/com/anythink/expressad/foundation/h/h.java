package com.anythink.expressad.foundation.h;

import com.huawei.hms.ads.jsb.constant.Constant;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10122a = "JSONUtils";

    public static ArrayList<String> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList<String> arrayList = new ArrayList<>(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(jSONArray.optString(i10));
        }
        return arrayList;
    }

    public static String a(int i10, int i11, int i12, int i13, int i14) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put("code", 0);
                jSONObject.put(CrashHianalyticsData.MESSAGE, "Sucess");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("rotateAngle", i10);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("left", i11);
                jSONObject3.put("right", i12);
                jSONObject3.put(Constant.MAP_KEY_TOP, i13);
                jSONObject3.put("bottom", i14);
                jSONObject2.put("cutoutInfo", jSONObject3);
                jSONObject.put("data", jSONObject2);
            } catch (Exception e10) {
                o.d(f10122a, e10.getMessage());
            }
        } catch (Throwable th) {
            o.d(f10122a, th.getMessage());
            try {
                jSONObject.put("code", 1);
                jSONObject.put(CrashHianalyticsData.MESSAGE, "Fail");
            } catch (JSONException e11) {
                o.d(f10122a, e11.getMessage());
            }
        }
        return jSONObject.toString();
    }
}
