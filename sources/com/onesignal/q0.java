package com.onesignal;

import com.huawei.openalliance.ad.constant.av;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageAction.java */
/* loaded from: classes2.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26978a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26979b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26980c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f26981d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f26982e = new ArrayList();
    public final r1 f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26983g;

    public q0(JSONObject jSONObject) throws JSONException {
        int i10;
        this.f26978a = jSONObject.optString("id", null);
        jSONObject.optString("name", null);
        this.f26980c = jSONObject.optString("url", null);
        jSONObject.optString("pageId", null);
        String optString = jSONObject.optString("url_target", null);
        int[] d10 = s.f.d(3);
        int length = d10.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                i10 = d10[i11];
                if (com.ironsource.adapters.facebook.a.e(i10).equalsIgnoreCase(optString)) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i10 = 0;
                break;
            }
        }
        this.f26979b = i10;
        if (i10 == 0) {
            this.f26979b = 1;
        }
        jSONObject.optBoolean("close", true);
        if (jSONObject.has("outcomes")) {
            JSONArray jSONArray = jSONObject.getJSONArray("outcomes");
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                this.f26981d.add(new d1((JSONObject) jSONArray.get(i12)));
            }
        }
        if (jSONObject.has("tags")) {
            this.f = new r1(jSONObject.getJSONObject("tags"));
        }
        if (jSONObject.has("prompts")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("prompts");
            for (int i13 = 0; i13 < jSONArray2.length(); i13++) {
                String string = jSONArray2.getString(i13);
                string.getClass();
                boolean equals = string.equals("push");
                ArrayList arrayList = this.f26982e;
                if (!equals) {
                    if (string.equals(av.at)) {
                        arrayList.add(new c1());
                    }
                } else {
                    arrayList.add(new g1());
                }
            }
        }
    }
}
