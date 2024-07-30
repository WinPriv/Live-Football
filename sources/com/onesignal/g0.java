package com.onesignal;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NotificationChannelManager.java */
/* loaded from: classes2.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f26834a = Pattern.compile("^([A-Fa-f0-9]{8})$");

    /* JADX WARN: Can't wrap try/catch for region: R(29:1|(1:3)(1:75)|4|(1:6)|7|(2:9|(23:11|12|(1:(1:15)(1:(1:17)(1:(1:19)(1:(1:21)(1:22)))))|23|(1:25)|26|(4:28|(1:30)|31|32)|36|(1:38)(1:73)|39|(1:43)|44|(1:46)(1:72)|47|(2:49|(1:51)(2:52|(1:56)))|57|(1:59)(1:71)|60|(1:62)|63|64|65|66))|74|12|(0)|23|(0)|26|(0)|36|(0)(0)|39|(2:41|43)|44|(0)(0)|47|(0)|57|(0)(0)|60|(0)|63|64|65|66) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0164, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0165, code lost:
    
        r12.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r12, android.app.NotificationManager r13, org.json.JSONObject r14) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.g0.a(android.content.Context, android.app.NotificationManager, org.json.JSONObject):java.lang.String");
    }

    public static String b(z1 z1Var) {
        if (Build.VERSION.SDK_INT < 26) {
            return "fcm_fallback_notification_channel";
        }
        Context context = z1Var.f27213b;
        JSONObject jSONObject = z1Var.f27214c;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (z1Var.f27215d) {
            notificationManager.createNotificationChannel(new NotificationChannel("restored_OS_notifications", "Restored", 2));
            return "restored_OS_notifications";
        }
        if (jSONObject.has("oth_chnl")) {
            String optString = jSONObject.optString("oth_chnl");
            if (notificationManager.getNotificationChannel(optString) != null) {
                return optString;
            }
        }
        if (!jSONObject.has("chnl")) {
            NotificationChannel notificationChannel = new NotificationChannel("fcm_fallback_notification_channel", "Miscellaneous", 3);
            notificationChannel.enableLights(true);
            notificationChannel.enableVibration(true);
            notificationManager.createNotificationChannel(notificationChannel);
            return "fcm_fallback_notification_channel";
        }
        try {
            return a(context, notificationManager, jSONObject);
        } catch (JSONException e10) {
            e3.b(3, "Could not create notification channel due to JSON payload error!", e10);
            return "fcm_fallback_notification_channel";
        }
    }
}
