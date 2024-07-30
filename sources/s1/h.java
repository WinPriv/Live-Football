package s1;

import androidx.work.impl.WorkDatabase;
import f1.h;

/* compiled from: WorkDatabase.java */
/* loaded from: classes.dex */
public final class h extends h.b {
    @Override // f1.h.b
    public final void a(k1.a aVar) {
        aVar.b();
        try {
            int i10 = WorkDatabase.f2619k;
            aVar.d("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f2618j) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            aVar.g();
        } finally {
            aVar.c();
        }
    }
}
