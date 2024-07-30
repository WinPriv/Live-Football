package kc;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes2.dex */
public class d extends b3.c {

    /* renamed from: b, reason: collision with root package name */
    public static d f32285b;

    public d(c cVar) {
        super(cVar);
    }

    public static d j(c cVar) {
        if (f32285b == null) {
            f32285b = new d(cVar);
        }
        return f32285b;
    }

    @Override // b3.c
    public final boolean c(String str) {
        SQLiteDatabase readableDatabase;
        synchronized (this) {
            readableDatabase = ((a) this.f2858a).f32281a.getReadableDatabase();
        }
        Cursor query = readableDatabase.query("il", new String[]{"id"}, "id = ? ", new String[]{str}, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.close();
            return true;
        }
        if (query != null) {
            query.close();
        }
        return false;
    }

    public synchronized void i(lc.c cVar) {
        if (d() != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", cVar.f32601s);
                contentValues.put("value", cVar.f32602t);
                contentValues.put("time", Long.valueOf(cVar.f32603u));
                if (c(cVar.f32601s)) {
                    d().update("il", contentValues, "id = ? ", new String[]{cVar.f32601s});
                } else {
                    d().insert("il", null, contentValues);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final synchronized void k(lc.c cVar) {
        if (d() != null && cVar != null) {
            try {
                d().delete("il", "id= ?", new String[]{cVar.f32601s});
            } catch (Throwable unused) {
            }
        }
    }
}
