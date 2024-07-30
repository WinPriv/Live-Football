package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes2.dex */
public class CrashProvider extends ContentProvider {

    /* renamed from: s, reason: collision with root package name */
    public Context f24619s;

    /* renamed from: t, reason: collision with root package name */
    public String f24620t;

    /* renamed from: u, reason: collision with root package name */
    public final UriMatcher f24621u = new UriMatcher(-1);

    /* renamed from: v, reason: collision with root package name */
    public String f24622v;

    /* renamed from: w, reason: collision with root package name */
    public String f24623w;

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int match = this.f24621u.match(uri);
        if (match != 1) {
            if (match == 2) {
                return this.f24623w;
            }
            throw new IllegalArgumentException("Invalid URI: " + uri);
        }
        return this.f24622v;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f24619s = getContext();
        new f(this.f24619s);
        this.f24620t = this.f24619s.getPackageName();
        Uri.parse("content://" + this.f24620t + "/REPORTS");
        this.f24622v = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.f24623w = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int match = this.f24621u.match(uri);
        if (match != 1) {
            if (match == 2) {
                return f.a(Integer.parseInt(uri.getLastPathSegment()));
            }
            throw new IllegalArgumentException("Invalid URI: " + uri);
        }
        return f.b();
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
