package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NotificationBundleProcessor.java */
/* loaded from: classes2.dex */
public final class e0 {

    /* compiled from: NotificationBundleProcessor.java */
    /* loaded from: classes2.dex */
    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f26734a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f26735b;

        public a(d dVar, c cVar) {
            this.f26734a = dVar;
            this.f26735b = cVar;
        }
    }

    /* compiled from: NotificationBundleProcessor.java */
    /* loaded from: classes2.dex */
    public interface b {
    }

    /* compiled from: NotificationBundleProcessor.java */
    /* loaded from: classes2.dex */
    public interface c {
        void a(d dVar);
    }

    /* compiled from: NotificationBundleProcessor.java */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f26736a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f26737b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f26738c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f26739d;

        public final boolean a() {
            if (this.f26736a && !this.f26737b && !this.f26738c && !this.f26739d) {
                return false;
            }
            return true;
        }
    }

    public static JSONObject a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                jSONObject.put(str, bundle.get(str));
            } catch (JSONException e10) {
                e3.b(3, "bundleAsJSONObject error for key: " + str, e10);
            }
        }
        return jSONObject;
    }

    public static boolean b(Bundle bundle, String str) {
        String trim = bundle.getString(str, "").trim();
        if (!trim.startsWith("http://") && !trim.startsWith("https://")) {
            return false;
        }
        return true;
    }

    public static void c(z1 z1Var) {
        if (!z1Var.f27216e) {
            return;
        }
        e3.b(6, "Marking restored or disabled notifications as dismissed: " + z1Var.toString(), null);
        String str = "android_notification_id = " + z1Var.a();
        p3 c10 = p3.c(z1Var.f27213b);
        ContentValues contentValues = new ContentValues();
        contentValues.put("dismissed", (Integer) 1);
        c10.m("notification", contentValues, str, null);
        h.b(z1Var.f27213b);
    }

    public static void d(Context context, Bundle bundle, c cVar) {
        JSONObject jSONObject;
        String str;
        String str2;
        boolean z10;
        boolean z11;
        boolean z12;
        d dVar = new d();
        if (!c3.m(bundle)) {
            cVar.a(dVar);
            return;
        }
        dVar.f26736a = true;
        String str3 = "n";
        if (bundle.containsKey("o")) {
            try {
                JSONObject jSONObject2 = new JSONObject(bundle.getString("custom"));
                if (jSONObject2.has("a")) {
                    jSONObject = jSONObject2.getJSONObject("a");
                } else {
                    jSONObject = new JSONObject();
                }
                JSONArray jSONArray = new JSONArray(bundle.getString("o"));
                bundle.remove("o");
                int i10 = 0;
                while (i10 < jSONArray.length()) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    String string = jSONObject3.getString(str3);
                    jSONObject3.remove(str3);
                    if (jSONObject3.has(com.anythink.basead.d.i.f3957a)) {
                        String string2 = jSONObject3.getString(com.anythink.basead.d.i.f3957a);
                        jSONObject3.remove(com.anythink.basead.d.i.f3957a);
                        str = str3;
                        str2 = string2;
                    } else {
                        str = str3;
                        str2 = string;
                    }
                    jSONObject3.put("id", str2);
                    jSONObject3.put(com.anythink.expressad.exoplayer.k.o.f9070c, string);
                    if (jSONObject3.has(com.anythink.core.common.g.c.W)) {
                        jSONObject3.put("icon", jSONObject3.getString(com.anythink.core.common.g.c.W));
                        jSONObject3.remove(com.anythink.core.common.g.c.W);
                    }
                    i10++;
                    str3 = str;
                }
                jSONObject.put("actionButtons", jSONArray);
                jSONObject.put("actionId", "__DEFAULT__");
                if (!jSONObject2.has("a")) {
                    jSONObject2.put("a", jSONObject);
                }
                bundle.putString("custom", jSONObject2.toString());
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        JSONObject a10 = a(bundle);
        String l10 = c3.l(a10);
        if (l10 != null) {
            if (e3.f26767n && e3.o) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                e3.n().x(l10);
            } else {
                z1 z1Var = new z1(context, a10);
                p.n(z1Var.f27213b);
                p.p(z1Var);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            dVar.f26738c = true;
            cVar.a(dVar);
            return;
        }
        a aVar = new a(dVar, cVar);
        JSONObject a11 = a(bundle);
        e3.f26775w.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        boolean z13 = bundle.getBoolean("is_restoring", false);
        if (Integer.parseInt(bundle.getString("pri", "0")) > 9) {
            z11 = true;
        } else {
            z11 = false;
        }
        e3.D(context, a11, new f0(z13, context, bundle, aVar, a11, currentTimeMillis, z11, dVar));
    }

    public static int e(u1 u1Var, boolean z10) {
        boolean z11;
        e3.b(6, "Starting processJobForDisplay opened: false fromBackgroundLogic: " + z10, null);
        z1 z1Var = u1Var.f27097a;
        if (!z1Var.f27215d && z1Var.f27214c.has("collapse_key") && !"do_not_collapse".equals(z1Var.f27214c.optString("collapse_key"))) {
            Cursor i10 = p3.c(z1Var.f27213b).i("notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{z1Var.f27214c.optString("collapse_key")}, null);
            if (i10.moveToFirst()) {
                z1Var.f27212a.f27069b = i10.getInt(i10.getColumnIndex("android_notification_id"));
            }
            i10.close();
        }
        int intValue = z1Var.a().intValue();
        z1Var.f27212a.getClass();
        if (!TextUtils.isEmpty(z1Var.f27214c.optString("alert"))) {
            z1Var.f27216e = true;
            if (z10) {
                if (!e3.o) {
                    e3.b(5, "App is in background, show notification", null);
                } else {
                    e3.b(5, "No NotificationWillShowInForegroundHandler setup, show notification", null);
                }
            }
            p.n(z1Var.f27213b);
            if (!OSUtils.o()) {
                p.f26963d = 2;
                z11 = p.p(z1Var);
            } else {
                throw new x2("Process for showing a notification should never been done on Main Thread!");
            }
        } else {
            z11 = false;
        }
        if (!z1Var.f27215d) {
            f(z1Var, false, z11);
            String g6 = c3.g(z1Var.f27214c);
            Set<String> set = OSNotificationWorkManager.f26613a;
            if (!TextUtils.isEmpty(g6)) {
                OSNotificationWorkManager.f26613a.remove(g6);
            }
            e3.w(z1Var);
        }
        return intValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(com.onesignal.z1 r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.e0.f(com.onesignal.z1, boolean, boolean):void");
    }
}
