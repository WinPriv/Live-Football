package a2;

import android.database.Cursor;

/* compiled from: PreferenceDao_Impl.java */
/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final f1.h f42a;

    /* renamed from: b, reason: collision with root package name */
    public final a f43b;

    /* compiled from: PreferenceDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends f1.b<d> {
        public a(f1.h hVar) {
            super(hVar);
        }

        @Override // f1.l
        public final String b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // f1.b
        public final void d(k1.e eVar, d dVar) {
            d dVar2 = dVar;
            String str = dVar2.f40a;
            if (str == null) {
                eVar.e(1);
            } else {
                eVar.f(1, str);
            }
            Long l10 = dVar2.f41b;
            if (l10 == null) {
                eVar.e(2);
            } else {
                eVar.d(2, l10.longValue());
            }
        }
    }

    public f(f1.h hVar) {
        this.f42a = hVar;
        this.f43b = new a(hVar);
    }

    public final Long a(String str) {
        Long l10;
        f1.j c10 = f1.j.c(1, "SELECT long_value FROM Preference where `key`=?");
        c10.f(1, str);
        f1.h hVar = this.f42a;
        hVar.b();
        Cursor g6 = hVar.g(c10);
        try {
            if (g6.moveToFirst() && !g6.isNull(0)) {
                l10 = Long.valueOf(g6.getLong(0));
                return l10;
            }
            l10 = null;
            return l10;
        } finally {
            g6.close();
            c10.release();
        }
    }

    public final void b(d dVar) {
        f1.h hVar = this.f42a;
        hVar.b();
        hVar.c();
        try {
            this.f43b.e(dVar);
            hVar.h();
        } finally {
            hVar.f();
        }
    }
}
