package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import d0.a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Store.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f21297a;

    /* compiled from: Store.java */
    /* renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0239a {

        /* renamed from: d, reason: collision with root package name */
        public static final long f21298d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a, reason: collision with root package name */
        public final String f21299a;

        /* renamed from: b, reason: collision with root package name */
        public final String f21300b;

        /* renamed from: c, reason: collision with root package name */
        public final long f21301c;

        public C0239a(String str, String str2, long j10) {
            this.f21299a = str;
            this.f21300b = str2;
            this.f21301c = j10;
        }

        public static String a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY, str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
                return null;
            }
        }

        public static C0239a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new C0239a(jSONObject.getString(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e10) {
                    Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
                    return null;
                }
            }
            return new C0239a(str, null, 0L);
        }
    }

    public a(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f21297a = sharedPreferences;
        Object obj = d0.a.f27248a;
        File file = new File(a.c.c(context), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    synchronized (this) {
                        isEmpty = sharedPreferences.getAll().isEmpty();
                    }
                    if (!isEmpty) {
                        Log.i("FirebaseMessaging", "App restored, clearing state");
                        synchronized (this) {
                            sharedPreferences.edit().clear().commit();
                        }
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
                }
            }
        }
    }
}
