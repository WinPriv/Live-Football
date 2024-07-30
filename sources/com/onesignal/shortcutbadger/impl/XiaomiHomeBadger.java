package com.onesignal.shortcutbadger.impl;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import androidx.activity.n;
import fc.a;
import fc.b;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public class XiaomiHomeBadger implements a {

    /* renamed from: a, reason: collision with root package name */
    public ResolveInfo f27059a;

    @Override // fc.a
    public final List<String> a() {
        return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher");
    }

    @Override // fc.a
    public final void b(Context context, ComponentName componentName, int i10) throws b {
        Object valueOf;
        Object valueOf2;
        try {
            Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
            Field declaredField = newInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            if (i10 == 0) {
                valueOf2 = "";
            } else {
                try {
                    valueOf2 = Integer.valueOf(i10);
                } catch (Exception unused) {
                    declaredField.set(newInstance, Integer.valueOf(i10));
                }
            }
            declaredField.set(newInstance, String.valueOf(valueOf2));
        } catch (Exception unused2) {
            Intent intent = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
            intent.putExtra("android.intent.extra.update_application_component_name", componentName.getPackageName() + "/" + componentName.getClassName());
            if (i10 == 0) {
                valueOf = "";
            } else {
                valueOf = Integer.valueOf(i10);
            }
            intent.putExtra("android.intent.extra.update_application_message_text", String.valueOf(valueOf));
            if (n.l0(context, intent)) {
                context.sendBroadcast(intent);
            }
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            if (this.f27059a == null) {
                Intent intent2 = new Intent("android.intent.action.MAIN");
                intent2.addCategory("android.intent.category.HOME");
                this.f27059a = context.getPackageManager().resolveActivity(intent2, com.anythink.expressad.exoplayer.b.aX);
            }
            if (this.f27059a != null) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                Notification build = new Notification.Builder(context).setContentTitle("").setContentText("").setSmallIcon(this.f27059a.getIconResource()).build();
                try {
                    Object obj = build.getClass().getDeclaredField("extraNotification").get(build);
                    obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i10));
                    notificationManager.notify(0, build);
                } catch (Exception e10) {
                    throw new b("not able to set badge", e10);
                }
            }
        }
    }
}
