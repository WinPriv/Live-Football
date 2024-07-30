package com.anythink.expressad.atsignalcommon.communication;

import android.text.TextUtils;
import android.util.Base64;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6996a = "a";

    /* renamed from: b, reason: collision with root package name */
    public static int f6997b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f6998c = 1;

    /* renamed from: com.anythink.expressad.atsignalcommon.communication.a$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f6999a;

        public AnonymousClass1(c cVar) {
            this.f6999a = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a.a(this.f6999a.K(), this.f6999a);
            } catch (Throwable th) {
                o.b(a.f6996a, th.getMessage(), th);
            }
        }
    }

    private static void a(Object obj, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                a(obj, "data is empty");
                return;
            }
            c b10 = c.b(optJSONObject);
            if (b10 == null) {
                a(obj, "data camapign is empty");
                return;
            }
            new Thread(new AnonymousClass1(b10)).start();
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", f6997b);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("id", "");
                jSONObject2.put("data", jSONObject3);
                j.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception e10) {
                a(obj, e10.getMessage());
                o.a(f6996a, e10.getMessage());
            }
        } catch (Throwable th) {
            a(obj, th.getMessage());
        }
    }

    private static void b(String str, c cVar) {
        if (f.f9825n == null || TextUtils.isEmpty(cVar.aZ())) {
            return;
        }
        f.a(str, cVar, f.f9817e);
    }

    private static void b(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f6997b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            a(obj, e10.getMessage());
            o.a(f6996a, e10.getMessage());
        }
    }

    private static void a(c cVar) {
        new Thread(new AnonymousClass1(cVar)).start();
    }

    private static String a(float f, float f10) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.anythink.expressad.foundation.g.a.f9775cc, t.a(com.anythink.expressad.foundation.b.a.b().d(), f));
            jSONObject2.put(com.anythink.expressad.foundation.g.a.f9776cd, t.a(com.anythink.expressad.foundation.b.a.b().d(), f10));
            jSONObject2.put(com.anythink.expressad.foundation.g.a.cf, 0);
            jSONObject2.put(com.anythink.expressad.foundation.g.a.cg, com.anythink.expressad.foundation.b.a.b().d().getResources().getConfiguration().orientation);
            jSONObject2.put(com.anythink.expressad.foundation.g.a.ch, t.c(com.anythink.expressad.foundation.b.a.b().d()));
            jSONObject.put(com.anythink.expressad.foundation.g.a.ce, jSONObject2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }

    private static String a(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String jSONObject2 = jSONObject.toString();
            return !TextUtils.isEmpty(jSONObject2) ? Base64.encodeToString(jSONObject2.getBytes(), 2) : "";
        } catch (Throwable unused) {
            o.d(f6996a, "code to string is error");
            return "";
        }
    }

    private static void a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f6998c);
            jSONObject.put(CrashHianalyticsData.MESSAGE, str);
            jSONObject.put("data", new JSONObject());
            j.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e10) {
            o.a(f6996a, e10.getMessage());
        }
    }

    public static /* synthetic */ void a(String str, c cVar) {
        if (f.f9825n == null || TextUtils.isEmpty(cVar.aZ())) {
            return;
        }
        f.a(str, cVar, f.f9817e);
    }
}
