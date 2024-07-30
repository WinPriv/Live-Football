package com.onesignal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.onesignal.e3;
import org.json.JSONObject;

/* compiled from: OSNotificationController.java */
/* loaded from: classes2.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f27097a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27098b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27099c = true;

    public u1(z1 z1Var, boolean z10) {
        this.f27098b = z10;
        this.f27097a = z1Var;
    }

    public static void a(Context context) {
        Bundle bundle;
        String str;
        e3.t tVar;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e10) {
            e3.b(3, "Manifest application info not found", e10);
            bundle = null;
        }
        if (bundle != null) {
            str = bundle.getString("com.onesignal.NotificationServiceExtension");
        } else {
            str = null;
        }
        if (str == null) {
            e3.b(7, "No class found, not setting up OSRemoteNotificationReceivedHandler", null);
            return;
        }
        e3.b(7, "Found class: " + str + ", attempting to call constructor", null);
        try {
            Object newInstance = Class.forName(str).newInstance();
            if ((newInstance instanceof e3.t) && (tVar = e3.f26766m) == null) {
                e3.t tVar2 = (e3.t) newInstance;
                if (tVar == null) {
                    e3.f26766m = tVar2;
                }
            }
        } catch (ClassNotFoundException e11) {
            e11.printStackTrace();
        } catch (IllegalAccessException e12) {
            e12.printStackTrace();
        } catch (InstantiationException e13) {
            e13.printStackTrace();
        }
    }

    public final String toString() {
        return "OSNotificationController{notificationJob=" + this.f27097a + ", isRestoring=" + this.f27098b + ", isBackgroundLogic=" + this.f27099c + '}';
    }

    public u1(Context context, t1 t1Var, JSONObject jSONObject, boolean z10, Long l10) {
        this.f27098b = z10;
        z1 z1Var = new z1(context);
        z1Var.f27214c = jSONObject;
        z1Var.f = l10;
        z1Var.f27215d = z10;
        z1Var.b(t1Var);
        this.f27097a = z1Var;
    }
}
