package g4;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import c4.c;
import com.applovin.exoplayer2.a0;
import d6.o;
import g4.o;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements o.a, o.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f28496s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f28497t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f28498u;

    public /* synthetic */ l(Object obj, Object obj2, long j10) {
        this.f28497t = obj;
        this.f28498u = obj2;
        this.f28496s = j10;
    }

    @Override // g4.o.a
    public final Object apply(Object obj) {
        String str = (String) this.f28497t;
        c.a aVar = (c.a) this.f28498u;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        boolean booleanValue = ((Boolean) o.k(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(aVar.f3274s)}), new a0(13))).booleanValue();
        long j10 = this.f28496s;
        int i10 = aVar.f3274s;
        if (!booleanValue) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i10));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL(a3.l.k("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", j10, " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i10)});
        }
        return null;
    }

    @Override // d6.o.a
    public final void invoke(Object obj) {
        ((l4.b) obj).getClass();
    }
}
