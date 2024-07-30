package com.anythink.core.common.c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private a f5275a;

    /* loaded from: classes.dex */
    public class a extends SQLiteOpenHelper {
        public a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 9);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            b.this.a(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            b.this.b(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            b.this.a(sQLiteDatabase, i10, i11);
        }
    }

    public b(Context context) {
        this.f5275a = new a(context, c());
    }

    public final SQLiteDatabase a() {
        return this.f5275a.getReadableDatabase();
    }

    public abstract void a(SQLiteDatabase sQLiteDatabase);

    public abstract void a(SQLiteDatabase sQLiteDatabase, int i10, int i11);

    public final synchronized SQLiteDatabase b() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f5275a.getWritableDatabase();
        } catch (Exception unused) {
            sQLiteDatabase = null;
        }
        return sQLiteDatabase;
    }

    public abstract void b(SQLiteDatabase sQLiteDatabase);

    public abstract String c();

    public abstract int d();
}
