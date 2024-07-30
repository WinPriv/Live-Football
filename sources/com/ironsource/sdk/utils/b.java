package com.ironsource.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ironsource.sdk.g.f;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static b f26567b;

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f26568a;

    public b(Context context) {
        this.f26568a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            bVar = f26567b;
        }
        return bVar;
    }

    public final List<String> b() {
        String string = this.f26568a.getString("search_keys", null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            f fVar = new f(string);
            if (fVar.a("searchKeys")) {
                try {
                    arrayList.addAll(fVar.a((JSONArray) fVar.c("searchKeys")));
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public static synchronized b a(Context context) {
        b bVar;
        synchronized (b.class) {
            if (f26567b == null) {
                f26567b = new b(context);
            }
            bVar = f26567b;
        }
        return bVar;
    }

    public static boolean b(String str) {
        return str.matches("^\\d+_\\d+$");
    }

    public final void a(String str) {
        if (this.f26568a.getString("version", "-1").equalsIgnoreCase(str)) {
            return;
        }
        SharedPreferences.Editor edit = this.f26568a.edit();
        edit.putString("version", str);
        edit.apply();
    }

    public final boolean a(String str, String str2, String str3) {
        String string = this.f26568a.getString("ssaUserData", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.isNull(str2)) {
                return false;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2.isNull(str3)) {
                return false;
            }
            jSONObject2.getJSONObject(str3).put("timestamp", str);
            SharedPreferences.Editor edit = this.f26568a.edit();
            edit.putString("ssaUserData", jSONObject.toString());
            edit.apply();
            return true;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
