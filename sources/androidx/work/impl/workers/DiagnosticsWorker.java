package androidx.work.impl.workers;

import a0.a;
import a2.g;
import a2.i;
import a2.k;
import a2.l;
import a2.o;
import a2.p;
import a2.q;
import a2.s;
import a2.t;
import a2.u;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import f1.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import r1.b;
import r1.h;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    public static final String y = h.e("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String h(k kVar, s sVar, a2.h hVar, ArrayList arrayList) {
        Integer num;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            g a10 = ((i) hVar).a(oVar.f56a);
            if (a10 != null) {
                num = Integer.valueOf(a10.f45b);
            } else {
                num = null;
            }
            String str = oVar.f56a;
            l lVar = (l) kVar;
            lVar.getClass();
            j c10 = j.c(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str == null) {
                c10.e(1);
            } else {
                c10.f(1, str);
            }
            f1.h hVar2 = lVar.f51a;
            hVar2.b();
            Cursor g6 = hVar2.g(c10);
            try {
                ArrayList arrayList2 = new ArrayList(g6.getCount());
                while (g6.moveToNext()) {
                    arrayList2.add(g6.getString(0));
                }
                g6.close();
                c10.release();
                sb2.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", oVar.f56a, oVar.f58c, num, oVar.f57b.name(), TextUtils.join(",", arrayList2), TextUtils.join(",", ((t) sVar).a(oVar.f56a))));
            } catch (Throwable th) {
                g6.close();
                c10.release();
                throw th;
            }
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a g() {
        j jVar;
        ArrayList arrayList;
        a2.h hVar;
        k kVar;
        s sVar;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        WorkDatabase workDatabase = s1.j.b(this.f2590s).f35074c;
        p n10 = workDatabase.n();
        k l10 = workDatabase.l();
        s o = workDatabase.o();
        a2.h k10 = workDatabase.k();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        q qVar = (q) n10;
        qVar.getClass();
        j c10 = j.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        c10.d(1, currentTimeMillis);
        f1.h hVar2 = qVar.f74a;
        hVar2.b();
        Cursor g6 = hVar2.g(c10);
        try {
            int M0 = a.M0(g6, "required_network_type");
            int M02 = a.M0(g6, "requires_charging");
            int M03 = a.M0(g6, "requires_device_idle");
            int M04 = a.M0(g6, "requires_battery_not_low");
            int M05 = a.M0(g6, "requires_storage_not_low");
            int M06 = a.M0(g6, "trigger_content_update_delay");
            int M07 = a.M0(g6, "trigger_max_content_delay");
            int M08 = a.M0(g6, "content_uri_triggers");
            int M09 = a.M0(g6, "id");
            int M010 = a.M0(g6, "state");
            int M011 = a.M0(g6, "worker_class_name");
            int M012 = a.M0(g6, "input_merger_class_name");
            int M013 = a.M0(g6, "input");
            int M014 = a.M0(g6, "output");
            jVar = c10;
            try {
                int M015 = a.M0(g6, "initial_delay");
                int M016 = a.M0(g6, "interval_duration");
                int M017 = a.M0(g6, "flex_duration");
                int M018 = a.M0(g6, "run_attempt_count");
                int M019 = a.M0(g6, "backoff_policy");
                int M020 = a.M0(g6, "backoff_delay_duration");
                int M021 = a.M0(g6, "period_start_time");
                int M022 = a.M0(g6, "minimum_retention_duration");
                int M023 = a.M0(g6, "schedule_requested_at");
                int M024 = a.M0(g6, "run_in_foreground");
                int M025 = a.M0(g6, "out_of_quota_policy");
                int i11 = M014;
                ArrayList arrayList2 = new ArrayList(g6.getCount());
                while (true) {
                    arrayList = arrayList2;
                    if (!g6.moveToNext()) {
                        break;
                    }
                    String string = g6.getString(M09);
                    String string2 = g6.getString(M011);
                    int i12 = M011;
                    b bVar = new b();
                    int i13 = M0;
                    bVar.f34801a = u.c(g6.getInt(M0));
                    if (g6.getInt(M02) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bVar.f34802b = z10;
                    if (g6.getInt(M03) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bVar.f34803c = z11;
                    if (g6.getInt(M04) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    bVar.f34804d = z12;
                    if (g6.getInt(M05) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    bVar.f34805e = z13;
                    int i14 = M09;
                    bVar.f = g6.getLong(M06);
                    bVar.f34806g = g6.getLong(M07);
                    bVar.f34807h = u.a(g6.getBlob(M08));
                    o oVar = new o(string, string2);
                    oVar.f57b = u.e(g6.getInt(M010));
                    oVar.f59d = g6.getString(M012);
                    oVar.f60e = androidx.work.b.a(g6.getBlob(M013));
                    int i15 = i11;
                    oVar.f = androidx.work.b.a(g6.getBlob(i15));
                    int i16 = M010;
                    i11 = i15;
                    int i17 = M015;
                    oVar.f61g = g6.getLong(i17);
                    int i18 = M012;
                    int i19 = M016;
                    oVar.f62h = g6.getLong(i19);
                    int i20 = M013;
                    int i21 = M017;
                    oVar.f63i = g6.getLong(i21);
                    int i22 = M018;
                    oVar.f65k = g6.getInt(i22);
                    int i23 = M019;
                    oVar.f66l = u.b(g6.getInt(i23));
                    M017 = i21;
                    int i24 = M020;
                    oVar.f67m = g6.getLong(i24);
                    int i25 = M021;
                    oVar.f68n = g6.getLong(i25);
                    M021 = i25;
                    int i26 = M022;
                    oVar.o = g6.getLong(i26);
                    M022 = i26;
                    int i27 = M023;
                    oVar.f69p = g6.getLong(i27);
                    int i28 = M024;
                    if (g6.getInt(i28) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    oVar.f70q = z14;
                    int i29 = M025;
                    oVar.f71r = u.d(g6.getInt(i29));
                    oVar.f64j = bVar;
                    arrayList.add(oVar);
                    M025 = i29;
                    M010 = i16;
                    M012 = i18;
                    M023 = i27;
                    M0 = i13;
                    arrayList2 = arrayList;
                    M024 = i28;
                    M015 = i17;
                    M011 = i12;
                    M09 = i14;
                    M020 = i24;
                    M013 = i20;
                    M016 = i19;
                    M018 = i22;
                    M019 = i23;
                }
                g6.close();
                jVar.release();
                ArrayList d10 = qVar.d();
                ArrayList b10 = qVar.b();
                boolean isEmpty = arrayList.isEmpty();
                String str = y;
                if (!isEmpty) {
                    i10 = 0;
                    h.c().d(str, "Recently completed work:\n\n", new Throwable[0]);
                    hVar = k10;
                    kVar = l10;
                    sVar = o;
                    h.c().d(str, h(kVar, sVar, hVar, arrayList), new Throwable[0]);
                } else {
                    hVar = k10;
                    kVar = l10;
                    sVar = o;
                    i10 = 0;
                }
                if (!d10.isEmpty()) {
                    h.c().d(str, "Running work:\n\n", new Throwable[i10]);
                    h.c().d(str, h(kVar, sVar, hVar, d10), new Throwable[i10]);
                }
                if (!b10.isEmpty()) {
                    h.c().d(str, "Enqueued work:\n\n", new Throwable[i10]);
                    h.c().d(str, h(kVar, sVar, hVar, b10), new Throwable[i10]);
                }
                return new ListenableWorker.a.c();
            } catch (Throwable th) {
                th = th;
                g6.close();
                jVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            jVar = c10;
        }
    }
}
