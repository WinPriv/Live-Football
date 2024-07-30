package kc;

import android.content.ContentValues;

/* loaded from: classes2.dex */
public final class b extends d {

    /* renamed from: c, reason: collision with root package name */
    public static b f32283c;

    public b(c cVar) {
        super(cVar);
    }

    @Override // kc.d
    public final synchronized void i(lc.c cVar) {
        if (d() != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", cVar.f32601s);
                contentValues.put("value", cVar.f32602t);
                contentValues.put("time", Long.valueOf(cVar.f32603u));
                if (c(cVar.f32601s)) {
                    d().update("il_all", contentValues, "id = ? ", new String[]{cVar.f32601s});
                } else {
                    d().insert("il_all", null, contentValues);
                }
            } catch (Exception unused) {
            }
        }
    }
}
