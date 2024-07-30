package com.ironsource.lifecycle;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes2.dex */
public class IronsourceLifecycleProvider extends ContentProvider {

    /* renamed from: s, reason: collision with root package name */
    public static boolean f24701s = false;

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Application application;
        f24701s = true;
        d a10 = d.a();
        Context context = getContext();
        if (d.B.compareAndSet(false, true) && (application = (Application) context.getApplicationContext()) != null) {
            application.registerActivityLifecycleCallbacks(a10);
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
