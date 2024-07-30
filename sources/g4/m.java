package g4;

import android.database.Cursor;
import c4.c;
import g4.o;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements o.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f28499s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o f28500t;

    public /* synthetic */ m(o oVar, int i10) {
        this.f28499s = i10;
        this.f28500t = oVar;
    }

    @Override // g4.o.a
    public final Object apply(Object obj) {
        int i10 = this.f28499s;
        o oVar = this.f28500t;
        switch (i10) {
            case 0:
                Cursor cursor = (Cursor) obj;
                oVar.getClass();
                while (cursor.moveToNext()) {
                    oVar.c(cursor.getInt(0), c.a.MESSAGE_TOO_OLD, cursor.getString(1));
                }
                return null;
            default:
                Cursor cursor2 = (Cursor) obj;
                oVar.getClass();
                while (cursor2.moveToNext()) {
                    oVar.c(cursor2.getInt(0), c.a.MAX_RETRIES_REACHED, cursor2.getString(1));
                }
                return null;
        }
    }
}
