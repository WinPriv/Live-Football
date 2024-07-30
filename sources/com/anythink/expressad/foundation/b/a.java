package com.anythink.expressad.foundation.b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9397a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f9398b;

    /* renamed from: c, reason: collision with root package name */
    private Context f9399c;

    /* renamed from: d, reason: collision with root package name */
    private String f9400d;

    /* renamed from: e, reason: collision with root package name */
    private String f9401e;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f9402g;

    /* renamed from: i, reason: collision with root package name */
    private boolean f9404i;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference<Context> f9405j;

    /* renamed from: k, reason: collision with root package name */
    private WeakReference<Activity> f9406k;
    private int f = 0;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9403h = false;

    private a() {
    }

    public static a b() {
        if (f9398b == null) {
            synchronized (a.class) {
                if (f9398b == null) {
                    f9398b = new a();
                }
            }
        }
        return f9398b;
    }

    public final String a() {
        try {
            Context context = this.f9399c;
            if (context != null) {
                return context.getPackageName();
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final void c() {
        if (this.f9403h) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            this.f9402g = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public final Context d() {
        return this.f9399c;
    }

    public final String e() {
        if (!TextUtils.isEmpty(this.f9400d)) {
            return this.f9400d;
        }
        return "";
    }

    public final String f() {
        if (!TextUtils.isEmpty(this.f9401e)) {
            return this.f9401e;
        }
        return "";
    }

    public final Context g() {
        WeakReference<Context> weakReference = this.f9405j;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final int h() {
        return this.f;
    }

    public final JSONObject i() {
        return this.f9402g;
    }

    public final void a(Context context) {
        this.f9399c = context;
    }

    public final void a(String str) {
        this.f9400d = str;
    }

    private void a(int i10) {
        this.f = i10;
    }

    private void a(JSONObject jSONObject) {
        this.f9402g = jSONObject;
    }

    public final void b(String str) {
        this.f9401e = str;
    }

    public final void b(Context context) {
        this.f9405j = new WeakReference<>(context);
    }
}
