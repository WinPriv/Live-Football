package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import fc.a;
import fc.b;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class SonyHomeBadger implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f27057a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* renamed from: b, reason: collision with root package name */
    public gc.a f27058b;

    @Override // fc.a
    public final List<String> a() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }

    @Override // fc.a
    public final void b(Context context, ComponentName componentName, int i10) throws b {
        boolean z10;
        boolean z11 = false;
        if (context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 >= 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("badge_count", Integer.valueOf(i10));
                contentValues.put("package_name", componentName.getPackageName());
                contentValues.put("activity_name", componentName.getClassName());
                Looper myLooper = Looper.myLooper();
                Looper mainLooper = Looper.getMainLooper();
                Uri uri = this.f27057a;
                if (myLooper == mainLooper) {
                    if (this.f27058b == null) {
                        this.f27058b = new gc.a(context.getApplicationContext().getContentResolver());
                    }
                    this.f27058b.startInsert(0, null, uri, contentValues);
                    return;
                }
                context.getApplicationContext().getContentResolver().insert(uri, contentValues);
                return;
            }
            return;
        }
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i10));
        if (i10 > 0) {
            z11 = true;
        }
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z11);
        context.sendBroadcast(intent);
    }
}
