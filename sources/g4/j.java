package g4;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import g4.o;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements o.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f28490s = 1;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f28491t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f28492u;

    public /* synthetic */ j(long j10, z3.s sVar) {
        this.f28491t = j10;
        this.f28492u = sVar;
    }

    @Override // g4.o.a
    public final Object apply(Object obj) {
        int i10 = this.f28490s;
        long j10 = this.f28491t;
        Object obj2 = this.f28492u;
        switch (i10) {
            case 0:
                o oVar = (o) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                oVar.getClass();
                String[] strArr = {String.valueOf(j10)};
                o.k(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new m(oVar, 0));
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            default:
                z3.s sVar = (z3.s) obj2;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j10));
                if (sQLiteDatabase2.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{sVar.b(), String.valueOf(j4.a.a(sVar.d()))}) < 1) {
                    contentValues.put("backend_name", sVar.b());
                    contentValues.put("priority", Integer.valueOf(j4.a.a(sVar.d())));
                    sQLiteDatabase2.insert("transport_contexts", null, contentValues);
                }
                return null;
        }
    }

    public /* synthetic */ j(o oVar, long j10) {
        this.f28492u = oVar;
        this.f28491t = j10;
    }
}
