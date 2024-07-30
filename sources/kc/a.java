package kc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final C0434a f32281a;

    public a(Context context) {
        this.f32281a = new C0434a(context);
    }

    /* renamed from: kc.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0434a extends SQLiteOpenHelper {
        public C0434a(Context context) {
            super(context, "tramini.db", (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            ((c) a.this).getClass();
            try {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS il(id TEXT ,value TEXT ,time INTEGER)");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS il_all(id TEXT ,value TEXT ,time INTEGER)");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            ((c) a.this).getClass();
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'il'");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'il_all'");
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            try {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS il(id TEXT ,value TEXT ,time INTEGER)");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS il_all(id TEXT ,value TEXT ,time INTEGER)");
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        }
    }
}
