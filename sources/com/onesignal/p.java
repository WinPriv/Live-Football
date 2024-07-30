package com.onesignal;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.constant.bd;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GenerateNotification.java */
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static Resources f26960a;

    /* renamed from: b, reason: collision with root package name */
    public static Context f26961b;

    /* renamed from: c, reason: collision with root package name */
    public static String f26962c;

    /* renamed from: d, reason: collision with root package name */
    public static Integer f26963d;

    /* compiled from: GenerateNotification.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public b0.q f26964a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f26965b;
    }

    public static void a(JSONObject jSONObject, b0.q qVar) throws Throwable {
        Bitmap bitmap;
        JSONObject jSONObject2;
        String str;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            e3.b(7, "Cannot use background images in notifications for device on version: " + i10, null);
            return;
        }
        String optString = jSONObject.optString("bg_img", null);
        if (optString != null) {
            jSONObject2 = new JSONObject(optString);
            bitmap = h(jSONObject2.optString(bd.Code, null));
        } else {
            bitmap = null;
            jSONObject2 = null;
        }
        if (bitmap == null) {
            bitmap = i("onesignal_bgimage_default_image");
        }
        if (bitmap != null) {
            RemoteViews remoteViews = new RemoteViews(f26961b.getPackageName(), R.layout.onesignal_bgimage_notif_layout);
            CharSequence optString2 = jSONObject.optString("title", null);
            if (optString2 == null) {
                optString2 = f26961b.getPackageManager().getApplicationLabel(f26961b.getApplicationInfo());
            }
            remoteViews.setTextViewText(R.id.os_bgimage_notif_title, optString2);
            remoteViews.setTextViewText(R.id.os_bgimage_notif_body, jSONObject.optString("alert"));
            o(remoteViews, jSONObject2, R.id.os_bgimage_notif_title, "tc", "onesignal_bgimage_notif_title_color");
            o(remoteViews, jSONObject2, R.id.os_bgimage_notif_body, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject2 != null && jSONObject2.has("img_align")) {
                str = jSONObject2.getString("img_align");
            } else {
                int identifier = f26960a.getIdentifier("onesignal_bgimage_notif_image_align", com.anythink.expressad.foundation.h.i.f10128g, f26962c);
                if (identifier != 0) {
                    str = f26960a.getString(identifier);
                } else {
                    str = null;
                }
            }
            if ("right".equals(str)) {
                remoteViews.setViewPadding(R.id.os_bgimage_notif_bgimage_align_layout, -5000, 0, 0, 0);
                remoteViews.setImageViewBitmap(R.id.os_bgimage_notif_bgimage_right_aligned, bitmap);
                remoteViews.setViewVisibility(R.id.os_bgimage_notif_bgimage_right_aligned, 0);
                remoteViews.setViewVisibility(R.id.os_bgimage_notif_bgimage, 2);
            } else {
                remoteViews.setImageViewBitmap(R.id.os_bgimage_notif_bgimage, bitmap);
            }
            qVar.f2753v.contentView = remoteViews;
            qVar.g(null);
        }
    }

    public static void b(int i10, b0.q qVar, a4.j jVar, String str, JSONObject jSONObject) {
        int i11;
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
            if (!jSONObject2.has("a")) {
                return;
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("a");
            if (!jSONObject3.has("actionButtons")) {
                return;
            }
            JSONArray jSONArray = jSONObject3.getJSONArray("actionButtons");
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i12);
                JSONObject jSONObject4 = new JSONObject(jSONObject.toString());
                Intent m10 = jVar.m(i10);
                m10.setAction("" + i12);
                m10.putExtra("action_button", true);
                jSONObject4.put("actionId", optJSONObject.optString("id"));
                m10.putExtra("onesignalData", jSONObject4.toString());
                if (str != null) {
                    m10.putExtra("summary", str);
                } else if (jSONObject.has("grp")) {
                    m10.putExtra("grp", jSONObject.optString("grp"));
                }
                PendingIntent l10 = jVar.l(i10, m10);
                if (optJSONObject.has("icon")) {
                    i11 = l(optJSONObject.optString("icon"));
                } else {
                    i11 = 0;
                }
                qVar.f2735b.add(new b0.l(i11, optJSONObject.optString(com.anythink.expressad.exoplayer.k.o.f9070c), l10));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void c(a aVar, Notification notification) {
        if (!aVar.f26965b) {
            return;
        }
        try {
            Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
            Field declaredField = newInstance.getClass().getDeclaredField("customizedIcon");
            declaredField.setAccessible(true);
            declaredField.set(newInstance, Boolean.TRUE);
            Field field = notification.getClass().getField("extraNotification");
            field.setAccessible(true);
            field.set(notification, newInstance);
        } catch (Throwable unused) {
        }
    }

    public static void d(p3 p3Var, String str, int i10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("android_notification_id", Integer.valueOf(i10));
        contentValues.put("group_id", str);
        contentValues.put("is_summary", (Integer) 1);
        p3Var.g(contentValues);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|2|3|(1:5)(1:107)|6|7|8|9|(3:11|(5:12|(1:14)(6:88|(1:90)(1:97)|91|(1:93)|94|(3:96|16|(1:19)(1:18)))|15|16|(0)(0))|(9:22|23|24|(1:26)|(1:28)|29|(4:78|79|80|81)(14:34|(1:36)(1:74)|37|(1:39)(1:73)|40|41|42|(1:44)|45|(6:47|(1:49)|(1:51)|52|(1:54)|55)|56|(4:59|(3:61|62|63)(1:65)|64|57)|66|67)|68|69))(1:98)|87|24|(0)|(0)|29|(0)|78|79|80|81|68|69|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0122 A[LOOP:0: B:12:0x0090->B:18:0x0122, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0113 A[EDGE_INSN: B:19:0x0113->B:20:0x0113 BREAK  A[LOOP:0: B:12:0x0090->B:18:0x0122], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(com.onesignal.z1 r23, com.onesignal.p.a r24) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.p.e(com.onesignal.z1, com.onesignal.p$a):void");
    }

    public static BigInteger f(JSONObject jSONObject) {
        Bundle bundle;
        String str;
        try {
            if (jSONObject.has("bgac")) {
                return new BigInteger(jSONObject.optString("bgac", null), 16);
            }
        } catch (Throwable unused) {
        }
        try {
            String d10 = OSUtils.d(e3.f26748b, "onesignal_notification_accent_color", null);
            if (d10 != null) {
                return new BigInteger(d10, 16);
            }
        } catch (Throwable unused2) {
        }
        try {
            Context context = e3.f26748b;
            try {
                bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e10) {
                e3.b(3, "Manifest application info not found", e10);
                bundle = null;
            }
            if (bundle != null) {
                str = bundle.getString("com.onesignal.NotificationAccentColor.DEFAULT");
            } else {
                str = null;
            }
            if (str != null) {
                return new BigInteger(str, 16);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    public static a g(z1 z1Var) {
        b0.q qVar;
        Bitmap m10;
        boolean z10;
        int i10;
        JSONObject jSONObject = z1Var.f27214c;
        a aVar = new a();
        try {
            qVar = new b0.q(f26961b, g0.b(z1Var));
        } catch (Throwable unused) {
            qVar = new b0.q(f26961b, null);
        }
        String optString = jSONObject.optString("alert", null);
        boolean z11 = true;
        qVar.d(16, true);
        int l10 = l(jSONObject.optString("sicon", null));
        if (l10 == 0) {
            l10 = j();
        }
        qVar.f2753v.icon = l10;
        b0.p pVar = new b0.p();
        pVar.f2733e = b0.q.b(optString);
        qVar.g(pVar);
        qVar.f = b0.q.b(optString);
        qVar.f2753v.tickerText = b0.q.b(optString);
        if (!jSONObject.optString("title").equals("")) {
            CharSequence optString2 = jSONObject.optString("title", null);
            if (optString2 == null) {
                optString2 = f26961b.getPackageManager().getApplicationLabel(f26961b.getApplicationInfo());
            }
            qVar.f2738e = b0.q.b(optString2);
        }
        try {
            BigInteger f = f(jSONObject);
            if (f != null) {
                qVar.f2748q = f.intValue();
            }
        } catch (Throwable unused2) {
        }
        try {
            if (jSONObject.has("vis")) {
                i10 = Integer.parseInt(jSONObject.optString("vis"));
            } else {
                i10 = 1;
            }
            qVar.f2749r = i10;
        } catch (Throwable unused3) {
        }
        Bitmap h10 = h(jSONObject.optString("licon"));
        if (h10 == null) {
            h10 = i("ic_onesignal_large_icon_default");
        }
        if (h10 == null) {
            m10 = null;
        } else {
            m10 = m(h10);
        }
        if (m10 != null) {
            aVar.f26965b = true;
            qVar.e(m10);
        }
        Bitmap h11 = h(jSONObject.optString("bicon", null));
        if (h11 != null) {
            b0.m mVar = new b0.m();
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f1578b = h11;
            mVar.f2731e = iconCompat;
            mVar.f2758c = b0.q.b(optString);
            mVar.f2759d = true;
            qVar.g(mVar);
        }
        Long l11 = z1Var.f;
        if (l11 != null) {
            try {
                qVar.f2753v.when = l11.longValue() * 1000;
            } catch (Throwable unused4) {
            }
        }
        int optInt = jSONObject.optInt("pri", 6);
        int i11 = 2;
        int i12 = 4;
        if (optInt <= 9) {
            if (optInt > 7) {
                i11 = 1;
            } else if (optInt > 4) {
                i11 = 0;
            } else if (optInt > 2) {
                i11 = -1;
            } else {
                i11 = -2;
            }
        }
        qVar.f2742j = i11;
        if (i11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (jSONObject.has("ledc") && jSONObject.optInt("led", 1) == 1) {
                try {
                    int intValue = new BigInteger(jSONObject.optString("ledc"), 16).intValue();
                    Notification notification = qVar.f2753v;
                    notification.ledARGB = intValue;
                    notification.ledOnMS = 2000;
                    notification.ledOffMS = 5000;
                    notification.flags = (notification.flags & (-2)) | 1;
                    i12 = 0;
                } catch (Throwable unused5) {
                }
            }
            if (jSONObject.optInt("vib", 1) == 1) {
                if (jSONObject.has("vib_pt")) {
                    long[] r10 = OSUtils.r(jSONObject);
                    if (r10 != null) {
                        qVar.f2753v.vibrate = r10;
                    }
                } else {
                    i12 |= 2;
                }
            }
            String optString3 = jSONObject.optString("sound", null);
            if ("null".equals(optString3) || "nil".equals(optString3)) {
                z11 = false;
            }
            if (z11) {
                Uri e10 = OSUtils.e(f26961b, jSONObject.optString("sound", null));
                if (e10 != null) {
                    qVar.f(e10);
                } else {
                    i12 |= 1;
                }
            }
            qVar.c(i12);
        }
        aVar.f26964a = qVar;
        return aVar;
    }

    public static Bitmap h(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (!trim.startsWith("http://") && !trim.startsWith("https://")) {
            return i(str);
        }
        try {
            return BitmapFactory.decodeStream(new URL(trim).openConnection().getInputStream());
        } catch (Throwable th) {
            e3.b(4, "Could not download image!", th);
            return null;
        }
    }

    public static Bitmap i(String str) {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeStream(f26961b.getAssets().open(str));
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return bitmap;
        }
        try {
            for (String str2 : Arrays.asList(".png", ".webp", ".jpg", ".gif", ".bmp")) {
                try {
                    bitmap = BitmapFactory.decodeStream(f26961b.getAssets().open(str + str2));
                } catch (Throwable unused2) {
                }
                if (bitmap != null) {
                    return bitmap;
                }
            }
            int l10 = l(str);
            if (l10 != 0) {
                return BitmapFactory.decodeResource(f26960a, l10);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    public static int j() {
        int identifier = f26960a.getIdentifier("ic_stat_onesignal_default", com.anythink.expressad.foundation.h.i.f10125c, f26962c);
        if (identifier != 0) {
            return identifier;
        }
        int identifier2 = f26960a.getIdentifier("corona_statusbar_icon_default", com.anythink.expressad.foundation.h.i.f10125c, f26962c);
        if (identifier2 != 0) {
            return identifier2;
        }
        int identifier3 = f26960a.getIdentifier("ic_os_notification_fallback_white_24dp", com.anythink.expressad.foundation.h.i.f10125c, f26962c);
        if (identifier3 != 0) {
            return identifier3;
        }
        return android.R.drawable.ic_popup_reminder;
    }

    public static Intent k(int i10) {
        return new Intent(f26961b, (Class<?>) NotificationDismissReceiver.class).putExtra("androidNotificationId", i10).putExtra("dismissed", true);
    }

    public static int l(String str) {
        boolean z10;
        if (str == null) {
            return 0;
        }
        String trim = str.trim();
        if (trim != null && !trim.matches("^[0-9]")) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return 0;
        }
        int identifier = f26960a.getIdentifier(trim, com.anythink.expressad.foundation.h.i.f10125c, f26962c);
        if (identifier != 0) {
            return identifier;
        }
        try {
            return R.drawable.class.getField(str).getInt(null);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static Bitmap m(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int dimension = (int) f26960a.getDimension(android.R.dimen.notification_large_icon_height);
            int dimension2 = (int) f26960a.getDimension(android.R.dimen.notification_large_icon_width);
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            if (width > dimension2 || height > dimension) {
                if (height > width) {
                    dimension2 = (int) (dimension * (width / height));
                } else if (width > height) {
                    dimension = (int) (dimension2 * (height / width));
                }
                return Bitmap.createScaledBitmap(bitmap, dimension2, dimension, true);
            }
            return bitmap;
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    public static void n(Context context) {
        f26961b = context;
        f26962c = context.getPackageName();
        f26960a = f26961b.getResources();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o(android.widget.RemoteViews r1, org.json.JSONObject r2, int r3, java.lang.String r4, java.lang.String r5) {
        /*
            if (r2 == 0) goto L1c
            boolean r0 = r2.has(r4)     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1c
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = r2.optString(r4)     // Catch: java.lang.Throwable -> L1c
            r4 = 16
            r0.<init>(r2, r4)     // Catch: java.lang.Throwable -> L1c
            int r2 = r0.intValue()     // Catch: java.lang.Throwable -> L1c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1c
            goto L1d
        L1c:
            r2 = 0
        L1d:
            if (r2 == 0) goto L27
            int r2 = r2.intValue()
            r1.setTextColor(r3, r2)
            goto L3c
        L27:
            android.content.res.Resources r2 = com.onesignal.p.f26960a
            java.lang.String r4 = "color"
            java.lang.String r0 = com.onesignal.p.f26962c
            int r2 = r2.getIdentifier(r5, r4, r0)
            if (r2 == 0) goto L3c
            android.content.Context r4 = com.onesignal.p.f26961b
            int r2 = r4.getColor(r2)
            r1.setTextColor(r3, r2)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.p.o(android.widget.RemoteViews, org.json.JSONObject, int, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x02cb, code lost:
    
        r0 = ((android.app.NotificationManager) r2.getSystemService("notification")).getNotificationChannel(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02dd, code lost:
    
        if (r0 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x011d, code lost:
    
        if (r14.isClosed() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x013c, code lost:
    
        if (r14.isClosed() != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean p(com.onesignal.z1 r25) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.p.p(com.onesignal.z1):boolean");
    }
}
