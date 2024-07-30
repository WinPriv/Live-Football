package com.onesignal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.huawei.openalliance.ad.constant.av;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TrackFirebaseAnalytics.java */
/* loaded from: classes2.dex */
public final class m4 {

    /* renamed from: d, reason: collision with root package name */
    public static Class f26927d;

    /* renamed from: e, reason: collision with root package name */
    public static AtomicLong f26928e;
    public static AtomicLong f;

    /* renamed from: g, reason: collision with root package name */
    public static t1 f26929g;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26930a;

    /* renamed from: b, reason: collision with root package name */
    public Object f26931b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f26932c;

    public /* synthetic */ m4(Cloneable cloneable, Cloneable cloneable2, int i10) {
        this.f26930a = i10;
        this.f26931b = cloneable;
        this.f26932c = cloneable2;
    }

    public static String b(t1 t1Var) {
        if (!t1Var.f27071d.isEmpty() && !t1Var.f27072e.isEmpty()) {
            return t1Var.f27071d + " - " + t1Var.f27072e;
        }
        String str = t1Var.f;
        if (str != null) {
            return str.substring(0, Math.min(10, str.length()));
        }
        return "";
    }

    public static Method d(Class cls) {
        try {
            return cls.getMethod("logEvent", String.class, Bundle.class);
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final void a() {
        try {
            ((Class) this.f26932c).getMethod("connect", new Class[0]).invoke((GoogleApiClient) this.f26931b, new Object[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final Object c(Context context) {
        Method method;
        if (this.f26931b == null) {
            try {
                method = f26927d.getMethod("getInstance", Context.class);
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
                method = null;
            }
            try {
                this.f26931b = method.invoke(null, context);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return this.f26931b;
    }

    public final GoogleApiClient e() {
        return (GoogleApiClient) this.f26931b;
    }

    public final JSONObject f() {
        int i10 = this.f26930a;
        Object obj = this.f26932c;
        switch (i10) {
            case 2:
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("from", ((n0) this.f26931b).a());
                    jSONObject.put("to", ((n0) obj).a());
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                return jSONObject;
            default:
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("from", ((p2) this.f26931b).a());
                    jSONObject2.put("to", ((p2) obj).a());
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
                return jSONObject2;
        }
    }

    public final void g(b2 b2Var) {
        try {
            Object c10 = c((Context) this.f26932c);
            Method d10 = d(f26927d);
            Bundle bundle = new Bundle();
            bundle.putString(av.aq, "OneSignal");
            bundle.putString("medium", "notification");
            t1 t1Var = b2Var.f26680c;
            bundle.putString("notification_id", t1Var.f27070c);
            bundle.putString("campaign", b(t1Var));
            d10.invoke(c10, "os_notification_received", bundle);
            if (f26928e == null) {
                f26928e = new AtomicLong();
            }
            AtomicLong atomicLong = f26928e;
            e3.f26775w.getClass();
            atomicLong.set(System.currentTimeMillis());
            f26929g = t1Var;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final String toString() {
        switch (this.f26930a) {
            case 2:
                return f().toString();
            case 3:
                return f().toString();
            default:
                return super.toString();
        }
    }

    public m4(GoogleApiClient googleApiClient) {
        this.f26930a = 1;
        this.f26931b = googleApiClient;
        this.f26932c = googleApiClient.getClass();
    }

    public m4(Context context) {
        this.f26930a = 0;
        this.f26932c = context;
    }
}
