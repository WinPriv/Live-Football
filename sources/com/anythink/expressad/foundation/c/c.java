package com.anythink.expressad.foundation.c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f9427a;

    private c(Context context) {
        super(context);
    }

    public static c a(Context context) {
        if (f9427a == null) {
            synchronized (c.class) {
                if (f9427a == null) {
                    f9427a = new c(context.getApplicationContext());
                }
            }
        }
        return f9427a;
    }

    @Override // com.anythink.expressad.foundation.c.b
    public final void b(SQLiteDatabase sQLiteDatabase) {
        c(sQLiteDatabase);
    }

    @Override // com.anythink.expressad.foundation.c.b
    public final String c() {
        return "anythink_expressad.db";
    }

    @Override // com.anythink.expressad.foundation.c.b
    public final int d() {
        return 67;
    }

    private static void c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'campaign'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'frequence'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'campaignclick'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'click_time'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'load_stat'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'fq_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dailyplaycap'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'display_resource_type'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'unit_id'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'c_replace_temp'");
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.foundation.c.b
    public final void a(SQLiteDatabase sQLiteDatabase) {
        c(sQLiteDatabase);
    }

    private static void f() {
    }

    @Override // com.anythink.expressad.foundation.c.b
    public final void e() {
    }
}
