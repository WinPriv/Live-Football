package a2;

import android.database.Cursor;
import java.util.ArrayList;

/* compiled from: DependencyDao_Impl.java */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final f1.h f38a;

    /* renamed from: b, reason: collision with root package name */
    public final a f39b;

    /* compiled from: DependencyDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends f1.b<a2.a> {
        public a(f1.h hVar) {
            super(hVar);
        }

        @Override // f1.l
        public final String b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // f1.b
        public final void d(k1.e eVar, a2.a aVar) {
            a2.a aVar2 = aVar;
            String str = aVar2.f36a;
            if (str == null) {
                eVar.e(1);
            } else {
                eVar.f(1, str);
            }
            String str2 = aVar2.f37b;
            if (str2 == null) {
                eVar.e(2);
            } else {
                eVar.f(2, str2);
            }
        }
    }

    public c(f1.h hVar) {
        this.f38a = hVar;
        this.f39b = new a(hVar);
    }

    public final ArrayList a(String str) {
        f1.j c10 = f1.j.c(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            c10.e(1);
        } else {
            c10.f(1, str);
        }
        f1.h hVar = this.f38a;
        hVar.b();
        Cursor g6 = hVar.g(c10);
        try {
            ArrayList arrayList = new ArrayList(g6.getCount());
            while (g6.moveToNext()) {
                arrayList.add(g6.getString(0));
            }
            return arrayList;
        } finally {
            g6.close();
            c10.release();
        }
    }

    public final boolean b(String str) {
        boolean z10 = true;
        f1.j c10 = f1.j.c(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            c10.e(1);
        } else {
            c10.f(1, str);
        }
        f1.h hVar = this.f38a;
        hVar.b();
        Cursor g6 = hVar.g(c10);
        try {
            boolean z11 = false;
            if (g6.moveToFirst()) {
                if (g6.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            g6.close();
            c10.release();
        }
    }
}
