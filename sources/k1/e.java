package k1;

import android.database.sqlite.SQLiteStatement;

/* compiled from: FrameworkSQLiteStatement.java */
/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: t, reason: collision with root package name */
    public final SQLiteStatement f30302t;

    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f30302t = sQLiteStatement;
    }

    public final int g() {
        return this.f30302t.executeUpdateDelete();
    }
}
