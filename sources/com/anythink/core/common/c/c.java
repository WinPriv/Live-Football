package com.anythink.core.common.c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.anythink.core.common.c.d;
import com.anythink.core.common.c.e;
import com.anythink.core.common.c.f;
import com.anythink.core.common.c.g;
import com.anythink.core.common.c.h;
import com.anythink.core.common.c.i;
import com.anythink.core.common.c.j;
import com.anythink.core.common.c.k;
import com.anythink.core.common.c.l;
import com.anythink.core.common.c.m;

/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: a, reason: collision with root package name */
    private static c f5277a;

    private c(Context context) {
        super(context);
    }

    public static c a(Context context) {
        if (f5277a == null) {
            synchronized (c.class) {
                if (f5277a == null) {
                    f5277a = new c(context.getApplicationContext());
                }
            }
        }
        return f5277a;
    }

    private void e(SQLiteDatabase sQLiteDatabase) {
        d(sQLiteDatabase);
        c(sQLiteDatabase);
    }

    @Override // com.anythink.core.common.c.b
    public final void b(SQLiteDatabase sQLiteDatabase) {
        d(sQLiteDatabase);
        c(sQLiteDatabase);
    }

    @Override // com.anythink.core.common.c.b
    public final String c() {
        return "anythink.db";
    }

    @Override // com.anythink.core.common.c.b
    public final int d() {
        return 9;
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(d.a.f);
            sQLiteDatabase.execSQL(g.a.f5312i);
            a(sQLiteDatabase, 3, 9);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'sdkconfig'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'request_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'placement_ad_impression'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_action_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_data_cache'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dsp_offer_show_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dsp_offer_install_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'inspect_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'video_res_cache_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'notice_url_fail_info'");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.anythink.core.common.c.b
    public final void a(SQLiteDatabase sQLiteDatabase) {
        c(sQLiteDatabase);
    }

    @Override // com.anythink.core.common.c.b
    public final void a(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        while (i10 < i11) {
            switch (i10) {
                case 1:
                case 2:
                    d(sQLiteDatabase);
                    c(sQLiteDatabase);
                    break;
                case 3:
                    sQLiteDatabase.execSQL(l.a.f5358j);
                    break;
                case 4:
                    sQLiteDatabase.execSQL(j.a.f5340h);
                    sQLiteDatabase.execSQL(k.a.f);
                    break;
                case 5:
                    sQLiteDatabase.execSQL(f.a.f5301h);
                    sQLiteDatabase.execSQL(e.a.f);
                    break;
                case 6:
                    sQLiteDatabase.execSQL(h.a.f5319d);
                    break;
                case 7:
                    sQLiteDatabase.execSQL(m.a.f5367h);
                    break;
                case 8:
                    sQLiteDatabase.execSQL(i.b.f5331i);
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'request_info'");
                    sQLiteDatabase.execSQL(g.a.f5312i);
                    break;
            }
            i10++;
        }
    }
}
