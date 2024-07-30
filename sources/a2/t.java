package a2;

import android.database.Cursor;
import java.util.ArrayList;

/* compiled from: WorkTagDao_Impl.java */
/* loaded from: classes.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    public final f1.h f84a;

    /* renamed from: b, reason: collision with root package name */
    public final a f85b;

    /* compiled from: WorkTagDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends f1.b<r> {
        public a(f1.h hVar) {
            super(hVar);
        }

        @Override // f1.l
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // f1.b
        public final void d(k1.e eVar, r rVar) {
            r rVar2 = rVar;
            String str = rVar2.f82a;
            if (str == null) {
                eVar.e(1);
            } else {
                eVar.f(1, str);
            }
            String str2 = rVar2.f83b;
            if (str2 == null) {
                eVar.e(2);
            } else {
                eVar.f(2, str2);
            }
        }
    }

    public t(f1.h hVar) {
        this.f84a = hVar;
        this.f85b = new a(hVar);
    }

    public final ArrayList a(String str) {
        f1.j c10 = f1.j.c(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            c10.e(1);
        } else {
            c10.f(1, str);
        }
        f1.h hVar = this.f84a;
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
}
