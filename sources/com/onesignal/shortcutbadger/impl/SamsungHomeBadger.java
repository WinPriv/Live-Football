package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import androidx.activity.n;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import fc.a;
import fc.b;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class SamsungHomeBadger implements a {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f27055b = {pa.a.ID, "class"};

    /* renamed from: a, reason: collision with root package name */
    public final DefaultBadger f27056a = new DefaultBadger();

    public static ContentValues c(ComponentName componentName, int i10, boolean z10) {
        ContentValues contentValues = new ContentValues();
        if (z10) {
            contentValues.put(WiseOpenHianalyticsData.UNION_PACKAGE, componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i10));
        return contentValues;
    }

    @Override // fc.a
    public final List<String> a() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    @Override // fc.a
    public final void b(Context context, ComponentName componentName, int i10) throws b {
        DefaultBadger defaultBadger = this.f27056a;
        if (defaultBadger != null && n.l0(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE"))) {
            defaultBadger.b(context, componentName, i10);
            return;
        }
        Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(parse, f27055b, "package=?", new String[]{componentName.getPackageName()}, null);
            if (cursor != null) {
                String className = componentName.getClassName();
                boolean z10 = false;
                while (cursor.moveToNext()) {
                    contentResolver.update(parse, c(componentName, i10, false), "_id=?", new String[]{String.valueOf(cursor.getInt(0))});
                    if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    contentResolver.insert(parse, c(componentName, i10, true));
                }
            }
        } finally {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
        }
    }
}
