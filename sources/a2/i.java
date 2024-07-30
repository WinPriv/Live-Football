package a2;

import android.database.Cursor;

/* compiled from: SystemIdInfoDao_Impl.java */
/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final f1.h f46a;

    /* renamed from: b, reason: collision with root package name */
    public final a f47b;

    /* renamed from: c, reason: collision with root package name */
    public final b f48c;

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends f1.b<g> {
        public a(f1.h hVar) {
            super(hVar);
        }

        @Override // f1.l
        public final String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // f1.b
        public final void d(k1.e eVar, g gVar) {
            String str = gVar.f44a;
            if (str == null) {
                eVar.e(1);
            } else {
                eVar.f(1, str);
            }
            eVar.d(2, r4.f45b);
        }
    }

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: classes.dex */
    public class b extends f1.l {
        public b(f1.h hVar) {
            super(hVar);
        }

        @Override // f1.l
        public final String b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(f1.h hVar) {
        this.f46a = hVar;
        this.f47b = new a(hVar);
        this.f48c = new b(hVar);
    }

    public final g a(String str) {
        g gVar;
        f1.j c10 = f1.j.c(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            c10.e(1);
        } else {
            c10.f(1, str);
        }
        f1.h hVar = this.f46a;
        hVar.b();
        Cursor g6 = hVar.g(c10);
        try {
            int M0 = a0.a.M0(g6, "work_spec_id");
            int M02 = a0.a.M0(g6, "system_id");
            if (g6.moveToFirst()) {
                gVar = new g(g6.getString(M0), g6.getInt(M02));
            } else {
                gVar = null;
            }
            return gVar;
        } finally {
            g6.close();
            c10.release();
        }
    }

    public final void b(String str) {
        f1.h hVar = this.f46a;
        hVar.b();
        b bVar = this.f48c;
        k1.e a10 = bVar.a();
        if (str == null) {
            a10.e(1);
        } else {
            a10.f(1, str);
        }
        hVar.c();
        try {
            a10.g();
            hVar.h();
        } finally {
            hVar.f();
            bVar.c(a10);
        }
    }
}
