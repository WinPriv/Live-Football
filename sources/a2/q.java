package a2;

import a2.o;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    public final f1.h f74a;

    /* renamed from: b, reason: collision with root package name */
    public final a f75b;

    /* renamed from: c, reason: collision with root package name */
    public final b f76c;

    /* renamed from: d, reason: collision with root package name */
    public final c f77d;

    /* renamed from: e, reason: collision with root package name */
    public final d f78e;
    public final e f;

    /* renamed from: g, reason: collision with root package name */
    public final f f79g;

    /* renamed from: h, reason: collision with root package name */
    public final g f80h;

    /* renamed from: i, reason: collision with root package name */
    public final h f81i;

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends f1.b<o> {
        public a(f1.h hVar) {
            super(hVar);
        }

        @Override // f1.l
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:45|46|47|48|(5:49|50|(2:53|51)|54|55)|57|58|59) */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x01b1, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x01c9, code lost:
        
            r0.printStackTrace();
         */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01d2  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01d8  */
        @Override // f1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void d(k1.e r17, a2.o r18) {
            /*
                Method dump skipped, instructions count: 530
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: a2.q.a.d(k1.e, java.lang.Object):void");
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class b extends f1.l {
        public b(f1.h hVar) {
            super(hVar);
        }

        @Override // f1.l
        public final String b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class c extends f1.l {
        public c(f1.h hVar) {
            super(hVar);
        }

        @Override // f1.l
        public final String b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class d extends f1.l {
        public d(f1.h hVar) {
            super(hVar);
        }

        @Override // f1.l
        public final String b() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class e extends f1.l {
        public e(f1.h hVar) {
            super(hVar);
        }

        @Override // f1.l
        public final String b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class f extends f1.l {
        public f(f1.h hVar) {
            super(hVar);
        }

        @Override // f1.l
        public final String b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class g extends f1.l {
        public g(f1.h hVar) {
            super(hVar);
        }

        @Override // f1.l
        public final String b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class h extends f1.l {
        public h(f1.h hVar) {
            super(hVar);
        }

        @Override // f1.l
        public final String b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public q(f1.h hVar) {
        this.f74a = hVar;
        this.f75b = new a(hVar);
        this.f76c = new b(hVar);
        this.f77d = new c(hVar);
        this.f78e = new d(hVar);
        this.f = new e(hVar);
        this.f79g = new f(hVar);
        this.f80h = new g(hVar);
        this.f81i = new h(hVar);
        new AtomicBoolean(false);
    }

    public final void a(String str) {
        f1.h hVar = this.f74a;
        hVar.b();
        b bVar = this.f76c;
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

    public final ArrayList b() {
        f1.j jVar;
        int M0;
        int M02;
        int M03;
        int M04;
        int M05;
        int M06;
        int M07;
        int M08;
        int M09;
        int M010;
        int M011;
        int M012;
        int M013;
        int M014;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        f1.j c10 = f1.j.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        c10.d(1, 200);
        f1.h hVar = this.f74a;
        hVar.b();
        Cursor g6 = hVar.g(c10);
        try {
            M0 = a0.a.M0(g6, "required_network_type");
            M02 = a0.a.M0(g6, "requires_charging");
            M03 = a0.a.M0(g6, "requires_device_idle");
            M04 = a0.a.M0(g6, "requires_battery_not_low");
            M05 = a0.a.M0(g6, "requires_storage_not_low");
            M06 = a0.a.M0(g6, "trigger_content_update_delay");
            M07 = a0.a.M0(g6, "trigger_max_content_delay");
            M08 = a0.a.M0(g6, "content_uri_triggers");
            M09 = a0.a.M0(g6, "id");
            M010 = a0.a.M0(g6, "state");
            M011 = a0.a.M0(g6, "worker_class_name");
            M012 = a0.a.M0(g6, "input_merger_class_name");
            M013 = a0.a.M0(g6, "input");
            M014 = a0.a.M0(g6, "output");
            jVar = c10;
        } catch (Throwable th) {
            th = th;
            jVar = c10;
        }
        try {
            int M015 = a0.a.M0(g6, "initial_delay");
            int M016 = a0.a.M0(g6, "interval_duration");
            int M017 = a0.a.M0(g6, "flex_duration");
            int M018 = a0.a.M0(g6, "run_attempt_count");
            int M019 = a0.a.M0(g6, "backoff_policy");
            int M020 = a0.a.M0(g6, "backoff_delay_duration");
            int M021 = a0.a.M0(g6, "period_start_time");
            int M022 = a0.a.M0(g6, "minimum_retention_duration");
            int M023 = a0.a.M0(g6, "schedule_requested_at");
            int M024 = a0.a.M0(g6, "run_in_foreground");
            int M025 = a0.a.M0(g6, "out_of_quota_policy");
            int i10 = M014;
            ArrayList arrayList = new ArrayList(g6.getCount());
            while (g6.moveToNext()) {
                String string = g6.getString(M09);
                int i11 = M09;
                String string2 = g6.getString(M011);
                int i12 = M011;
                r1.b bVar = new r1.b();
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
                int i14 = M02;
                int i15 = M03;
                bVar.f = g6.getLong(M06);
                bVar.f34806g = g6.getLong(M07);
                bVar.f34807h = u.a(g6.getBlob(M08));
                o oVar = new o(string, string2);
                oVar.f57b = u.e(g6.getInt(M010));
                oVar.f59d = g6.getString(M012);
                oVar.f60e = androidx.work.b.a(g6.getBlob(M013));
                int i16 = i10;
                oVar.f = androidx.work.b.a(g6.getBlob(i16));
                int i17 = M013;
                int i18 = M015;
                oVar.f61g = g6.getLong(i18);
                int i19 = M04;
                int i20 = M016;
                oVar.f62h = g6.getLong(i20);
                int i21 = M017;
                oVar.f63i = g6.getLong(i21);
                int i22 = M018;
                oVar.f65k = g6.getInt(i22);
                int i23 = M019;
                oVar.f66l = u.b(g6.getInt(i23));
                int i24 = M020;
                oVar.f67m = g6.getLong(i24);
                int i25 = M021;
                oVar.f68n = g6.getLong(i25);
                int i26 = M022;
                oVar.o = g6.getLong(i26);
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
                i10 = i16;
                M02 = i14;
                M015 = i18;
                M016 = i20;
                M020 = i24;
                M021 = i25;
                M024 = i28;
                M011 = i12;
                M0 = i13;
                M025 = i29;
                M023 = i27;
                M013 = i17;
                M09 = i11;
                M03 = i15;
                M022 = i26;
                M04 = i19;
                M017 = i21;
                M018 = i22;
                M019 = i23;
            }
            g6.close();
            jVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            g6.close();
            jVar.release();
            throw th;
        }
    }

    public final ArrayList c(int i10) {
        f1.j jVar;
        int M0;
        int M02;
        int M03;
        int M04;
        int M05;
        int M06;
        int M07;
        int M08;
        int M09;
        int M010;
        int M011;
        int M012;
        int M013;
        int M014;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        f1.j c10 = f1.j.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        c10.d(1, i10);
        f1.h hVar = this.f74a;
        hVar.b();
        Cursor g6 = hVar.g(c10);
        try {
            M0 = a0.a.M0(g6, "required_network_type");
            M02 = a0.a.M0(g6, "requires_charging");
            M03 = a0.a.M0(g6, "requires_device_idle");
            M04 = a0.a.M0(g6, "requires_battery_not_low");
            M05 = a0.a.M0(g6, "requires_storage_not_low");
            M06 = a0.a.M0(g6, "trigger_content_update_delay");
            M07 = a0.a.M0(g6, "trigger_max_content_delay");
            M08 = a0.a.M0(g6, "content_uri_triggers");
            M09 = a0.a.M0(g6, "id");
            M010 = a0.a.M0(g6, "state");
            M011 = a0.a.M0(g6, "worker_class_name");
            M012 = a0.a.M0(g6, "input_merger_class_name");
            M013 = a0.a.M0(g6, "input");
            M014 = a0.a.M0(g6, "output");
            jVar = c10;
        } catch (Throwable th) {
            th = th;
            jVar = c10;
        }
        try {
            int M015 = a0.a.M0(g6, "initial_delay");
            int M016 = a0.a.M0(g6, "interval_duration");
            int M017 = a0.a.M0(g6, "flex_duration");
            int M018 = a0.a.M0(g6, "run_attempt_count");
            int M019 = a0.a.M0(g6, "backoff_policy");
            int M020 = a0.a.M0(g6, "backoff_delay_duration");
            int M021 = a0.a.M0(g6, "period_start_time");
            int M022 = a0.a.M0(g6, "minimum_retention_duration");
            int M023 = a0.a.M0(g6, "schedule_requested_at");
            int M024 = a0.a.M0(g6, "run_in_foreground");
            int M025 = a0.a.M0(g6, "out_of_quota_policy");
            int i11 = M014;
            ArrayList arrayList = new ArrayList(g6.getCount());
            while (g6.moveToNext()) {
                String string = g6.getString(M09);
                int i12 = M09;
                String string2 = g6.getString(M011);
                int i13 = M011;
                r1.b bVar = new r1.b();
                int i14 = M0;
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
                int i15 = M02;
                int i16 = M03;
                bVar.f = g6.getLong(M06);
                bVar.f34806g = g6.getLong(M07);
                bVar.f34807h = u.a(g6.getBlob(M08));
                o oVar = new o(string, string2);
                oVar.f57b = u.e(g6.getInt(M010));
                oVar.f59d = g6.getString(M012);
                oVar.f60e = androidx.work.b.a(g6.getBlob(M013));
                int i17 = i11;
                oVar.f = androidx.work.b.a(g6.getBlob(i17));
                int i18 = M015;
                int i19 = M013;
                oVar.f61g = g6.getLong(i18);
                int i20 = M04;
                int i21 = M016;
                oVar.f62h = g6.getLong(i21);
                int i22 = M017;
                oVar.f63i = g6.getLong(i22);
                int i23 = M018;
                oVar.f65k = g6.getInt(i23);
                int i24 = M019;
                oVar.f66l = u.b(g6.getInt(i24));
                int i25 = M020;
                oVar.f67m = g6.getLong(i25);
                int i26 = M021;
                oVar.f68n = g6.getLong(i26);
                int i27 = M022;
                oVar.o = g6.getLong(i27);
                int i28 = M023;
                oVar.f69p = g6.getLong(i28);
                int i29 = M024;
                if (g6.getInt(i29) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                oVar.f70q = z14;
                int i30 = M025;
                oVar.f71r = u.d(g6.getInt(i30));
                oVar.f64j = bVar;
                arrayList.add(oVar);
                i11 = i17;
                M02 = i15;
                M024 = i29;
                M09 = i12;
                M011 = i13;
                M0 = i14;
                M025 = i30;
                M013 = i19;
                M015 = i18;
                M016 = i21;
                M020 = i25;
                M021 = i26;
                M023 = i28;
                M03 = i16;
                M022 = i27;
                M04 = i20;
                M017 = i22;
                M018 = i23;
                M019 = i24;
            }
            g6.close();
            jVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            g6.close();
            jVar.release();
            throw th;
        }
    }

    public final ArrayList d() {
        f1.j jVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        f1.j c10 = f1.j.c(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        f1.h hVar = this.f74a;
        hVar.b();
        Cursor g6 = hVar.g(c10);
        try {
            int M0 = a0.a.M0(g6, "required_network_type");
            int M02 = a0.a.M0(g6, "requires_charging");
            int M03 = a0.a.M0(g6, "requires_device_idle");
            int M04 = a0.a.M0(g6, "requires_battery_not_low");
            int M05 = a0.a.M0(g6, "requires_storage_not_low");
            int M06 = a0.a.M0(g6, "trigger_content_update_delay");
            int M07 = a0.a.M0(g6, "trigger_max_content_delay");
            int M08 = a0.a.M0(g6, "content_uri_triggers");
            int M09 = a0.a.M0(g6, "id");
            int M010 = a0.a.M0(g6, "state");
            int M011 = a0.a.M0(g6, "worker_class_name");
            int M012 = a0.a.M0(g6, "input_merger_class_name");
            int M013 = a0.a.M0(g6, "input");
            int M014 = a0.a.M0(g6, "output");
            jVar = c10;
            try {
                int M015 = a0.a.M0(g6, "initial_delay");
                int M016 = a0.a.M0(g6, "interval_duration");
                int M017 = a0.a.M0(g6, "flex_duration");
                int M018 = a0.a.M0(g6, "run_attempt_count");
                int M019 = a0.a.M0(g6, "backoff_policy");
                int M020 = a0.a.M0(g6, "backoff_delay_duration");
                int M021 = a0.a.M0(g6, "period_start_time");
                int M022 = a0.a.M0(g6, "minimum_retention_duration");
                int M023 = a0.a.M0(g6, "schedule_requested_at");
                int M024 = a0.a.M0(g6, "run_in_foreground");
                int M025 = a0.a.M0(g6, "out_of_quota_policy");
                int i10 = M014;
                ArrayList arrayList = new ArrayList(g6.getCount());
                while (g6.moveToNext()) {
                    String string = g6.getString(M09);
                    int i11 = M09;
                    String string2 = g6.getString(M011);
                    int i12 = M011;
                    r1.b bVar = new r1.b();
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
                    int i14 = M02;
                    int i15 = M03;
                    bVar.f = g6.getLong(M06);
                    bVar.f34806g = g6.getLong(M07);
                    bVar.f34807h = u.a(g6.getBlob(M08));
                    o oVar = new o(string, string2);
                    oVar.f57b = u.e(g6.getInt(M010));
                    oVar.f59d = g6.getString(M012);
                    oVar.f60e = androidx.work.b.a(g6.getBlob(M013));
                    int i16 = i10;
                    oVar.f = androidx.work.b.a(g6.getBlob(i16));
                    int i17 = M013;
                    int i18 = M015;
                    oVar.f61g = g6.getLong(i18);
                    int i19 = M04;
                    int i20 = M016;
                    oVar.f62h = g6.getLong(i20);
                    int i21 = M017;
                    oVar.f63i = g6.getLong(i21);
                    int i22 = M018;
                    oVar.f65k = g6.getInt(i22);
                    int i23 = M019;
                    oVar.f66l = u.b(g6.getInt(i23));
                    int i24 = M020;
                    oVar.f67m = g6.getLong(i24);
                    int i25 = M021;
                    oVar.f68n = g6.getLong(i25);
                    int i26 = M022;
                    oVar.o = g6.getLong(i26);
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
                    i10 = i16;
                    M02 = i14;
                    M015 = i18;
                    M016 = i20;
                    M020 = i24;
                    M021 = i25;
                    M024 = i28;
                    M011 = i12;
                    M0 = i13;
                    M025 = i29;
                    M023 = i27;
                    M013 = i17;
                    M09 = i11;
                    M03 = i15;
                    M022 = i26;
                    M04 = i19;
                    M017 = i21;
                    M018 = i22;
                    M019 = i23;
                }
                g6.close();
                jVar.release();
                return arrayList;
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

    public final ArrayList e() {
        f1.j jVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        f1.j c10 = f1.j.c(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        f1.h hVar = this.f74a;
        hVar.b();
        Cursor g6 = hVar.g(c10);
        try {
            int M0 = a0.a.M0(g6, "required_network_type");
            int M02 = a0.a.M0(g6, "requires_charging");
            int M03 = a0.a.M0(g6, "requires_device_idle");
            int M04 = a0.a.M0(g6, "requires_battery_not_low");
            int M05 = a0.a.M0(g6, "requires_storage_not_low");
            int M06 = a0.a.M0(g6, "trigger_content_update_delay");
            int M07 = a0.a.M0(g6, "trigger_max_content_delay");
            int M08 = a0.a.M0(g6, "content_uri_triggers");
            int M09 = a0.a.M0(g6, "id");
            int M010 = a0.a.M0(g6, "state");
            int M011 = a0.a.M0(g6, "worker_class_name");
            int M012 = a0.a.M0(g6, "input_merger_class_name");
            int M013 = a0.a.M0(g6, "input");
            int M014 = a0.a.M0(g6, "output");
            jVar = c10;
            try {
                int M015 = a0.a.M0(g6, "initial_delay");
                int M016 = a0.a.M0(g6, "interval_duration");
                int M017 = a0.a.M0(g6, "flex_duration");
                int M018 = a0.a.M0(g6, "run_attempt_count");
                int M019 = a0.a.M0(g6, "backoff_policy");
                int M020 = a0.a.M0(g6, "backoff_delay_duration");
                int M021 = a0.a.M0(g6, "period_start_time");
                int M022 = a0.a.M0(g6, "minimum_retention_duration");
                int M023 = a0.a.M0(g6, "schedule_requested_at");
                int M024 = a0.a.M0(g6, "run_in_foreground");
                int M025 = a0.a.M0(g6, "out_of_quota_policy");
                int i10 = M014;
                ArrayList arrayList = new ArrayList(g6.getCount());
                while (g6.moveToNext()) {
                    String string = g6.getString(M09);
                    int i11 = M09;
                    String string2 = g6.getString(M011);
                    int i12 = M011;
                    r1.b bVar = new r1.b();
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
                    int i14 = M02;
                    int i15 = M03;
                    bVar.f = g6.getLong(M06);
                    bVar.f34806g = g6.getLong(M07);
                    bVar.f34807h = u.a(g6.getBlob(M08));
                    o oVar = new o(string, string2);
                    oVar.f57b = u.e(g6.getInt(M010));
                    oVar.f59d = g6.getString(M012);
                    oVar.f60e = androidx.work.b.a(g6.getBlob(M013));
                    int i16 = i10;
                    oVar.f = androidx.work.b.a(g6.getBlob(i16));
                    int i17 = M013;
                    int i18 = M015;
                    oVar.f61g = g6.getLong(i18);
                    int i19 = M04;
                    int i20 = M016;
                    oVar.f62h = g6.getLong(i20);
                    int i21 = M017;
                    oVar.f63i = g6.getLong(i21);
                    int i22 = M018;
                    oVar.f65k = g6.getInt(i22);
                    int i23 = M019;
                    oVar.f66l = u.b(g6.getInt(i23));
                    int i24 = M020;
                    oVar.f67m = g6.getLong(i24);
                    int i25 = M021;
                    oVar.f68n = g6.getLong(i25);
                    int i26 = M022;
                    oVar.o = g6.getLong(i26);
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
                    i10 = i16;
                    M02 = i14;
                    M015 = i18;
                    M016 = i20;
                    M020 = i24;
                    M021 = i25;
                    M024 = i28;
                    M011 = i12;
                    M0 = i13;
                    M025 = i29;
                    M023 = i27;
                    M013 = i17;
                    M09 = i11;
                    M03 = i15;
                    M022 = i26;
                    M04 = i19;
                    M017 = i21;
                    M018 = i22;
                    M019 = i23;
                }
                g6.close();
                jVar.release();
                return arrayList;
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

    public final r1.l f(String str) {
        r1.l lVar;
        f1.j c10 = f1.j.c(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            c10.e(1);
        } else {
            c10.f(1, str);
        }
        f1.h hVar = this.f74a;
        hVar.b();
        Cursor g6 = hVar.g(c10);
        try {
            if (g6.moveToFirst()) {
                lVar = u.e(g6.getInt(0));
            } else {
                lVar = null;
            }
            return lVar;
        } finally {
            g6.close();
            c10.release();
        }
    }

    public final ArrayList g(String str) {
        f1.j c10 = f1.j.c(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            c10.e(1);
        } else {
            c10.f(1, str);
        }
        f1.h hVar = this.f74a;
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

    public final ArrayList h(String str) {
        f1.j c10 = f1.j.c(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            c10.e(1);
        } else {
            c10.f(1, str);
        }
        f1.h hVar = this.f74a;
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

    public final o i(String str) {
        f1.j jVar;
        o oVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        f1.j c10 = f1.j.c(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            c10.e(1);
        } else {
            c10.f(1, str);
        }
        f1.h hVar = this.f74a;
        hVar.b();
        Cursor g6 = hVar.g(c10);
        try {
            int M0 = a0.a.M0(g6, "required_network_type");
            int M02 = a0.a.M0(g6, "requires_charging");
            int M03 = a0.a.M0(g6, "requires_device_idle");
            int M04 = a0.a.M0(g6, "requires_battery_not_low");
            int M05 = a0.a.M0(g6, "requires_storage_not_low");
            int M06 = a0.a.M0(g6, "trigger_content_update_delay");
            int M07 = a0.a.M0(g6, "trigger_max_content_delay");
            int M08 = a0.a.M0(g6, "content_uri_triggers");
            int M09 = a0.a.M0(g6, "id");
            int M010 = a0.a.M0(g6, "state");
            int M011 = a0.a.M0(g6, "worker_class_name");
            int M012 = a0.a.M0(g6, "input_merger_class_name");
            int M013 = a0.a.M0(g6, "input");
            int M014 = a0.a.M0(g6, "output");
            jVar = c10;
            try {
                int M015 = a0.a.M0(g6, "initial_delay");
                int M016 = a0.a.M0(g6, "interval_duration");
                int M017 = a0.a.M0(g6, "flex_duration");
                int M018 = a0.a.M0(g6, "run_attempt_count");
                int M019 = a0.a.M0(g6, "backoff_policy");
                int M020 = a0.a.M0(g6, "backoff_delay_duration");
                int M021 = a0.a.M0(g6, "period_start_time");
                int M022 = a0.a.M0(g6, "minimum_retention_duration");
                int M023 = a0.a.M0(g6, "schedule_requested_at");
                int M024 = a0.a.M0(g6, "run_in_foreground");
                int M025 = a0.a.M0(g6, "out_of_quota_policy");
                if (g6.moveToFirst()) {
                    String string = g6.getString(M09);
                    String string2 = g6.getString(M011);
                    r1.b bVar = new r1.b();
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
                    bVar.f = g6.getLong(M06);
                    bVar.f34806g = g6.getLong(M07);
                    bVar.f34807h = u.a(g6.getBlob(M08));
                    oVar = new o(string, string2);
                    oVar.f57b = u.e(g6.getInt(M010));
                    oVar.f59d = g6.getString(M012);
                    oVar.f60e = androidx.work.b.a(g6.getBlob(M013));
                    oVar.f = androidx.work.b.a(g6.getBlob(M014));
                    oVar.f61g = g6.getLong(M015);
                    oVar.f62h = g6.getLong(M016);
                    oVar.f63i = g6.getLong(M017);
                    oVar.f65k = g6.getInt(M018);
                    oVar.f66l = u.b(g6.getInt(M019));
                    oVar.f67m = g6.getLong(M020);
                    oVar.f68n = g6.getLong(M021);
                    oVar.o = g6.getLong(M022);
                    oVar.f69p = g6.getLong(M023);
                    if (g6.getInt(M024) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    oVar.f70q = z14;
                    oVar.f71r = u.d(g6.getInt(M025));
                    oVar.f64j = bVar;
                } else {
                    oVar = null;
                }
                g6.close();
                jVar.release();
                return oVar;
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

    public final ArrayList j(String str) {
        f1.j c10 = f1.j.c(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            c10.e(1);
        } else {
            c10.f(1, str);
        }
        f1.h hVar = this.f74a;
        hVar.b();
        Cursor g6 = hVar.g(c10);
        try {
            int M0 = a0.a.M0(g6, "id");
            int M02 = a0.a.M0(g6, "state");
            ArrayList arrayList = new ArrayList(g6.getCount());
            while (g6.moveToNext()) {
                o.a aVar = new o.a();
                aVar.f72a = g6.getString(M0);
                aVar.f73b = u.e(g6.getInt(M02));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            g6.close();
            c10.release();
        }
    }

    public final int k(long j10, String str) {
        f1.h hVar = this.f74a;
        hVar.b();
        g gVar = this.f80h;
        k1.e a10 = gVar.a();
        a10.d(1, j10);
        if (str == null) {
            a10.e(2);
        } else {
            a10.f(2, str);
        }
        hVar.c();
        try {
            int g6 = a10.g();
            hVar.h();
            return g6;
        } finally {
            hVar.f();
            gVar.c(a10);
        }
    }

    public final void l(String str, androidx.work.b bVar) {
        f1.h hVar = this.f74a;
        hVar.b();
        c cVar = this.f77d;
        k1.e a10 = cVar.a();
        byte[] b10 = androidx.work.b.b(bVar);
        if (b10 == null) {
            a10.e(1);
        } else {
            a10.b(1, b10);
        }
        if (str == null) {
            a10.e(2);
        } else {
            a10.f(2, str);
        }
        hVar.c();
        try {
            a10.g();
            hVar.h();
        } finally {
            hVar.f();
            cVar.c(a10);
        }
    }

    public final void m(long j10, String str) {
        f1.h hVar = this.f74a;
        hVar.b();
        d dVar = this.f78e;
        k1.e a10 = dVar.a();
        a10.d(1, j10);
        if (str == null) {
            a10.e(2);
        } else {
            a10.f(2, str);
        }
        hVar.c();
        try {
            a10.g();
            hVar.h();
        } finally {
            hVar.f();
            dVar.c(a10);
        }
    }

    public final int n(r1.l lVar, String... strArr) {
        f1.h hVar = this.f74a;
        hVar.b();
        StringBuilder sb2 = new StringBuilder("UPDATE workspec SET state=? WHERE id IN (");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append("?");
            if (i10 < length - 1) {
                sb2.append(",");
            }
        }
        sb2.append(")");
        String sb3 = sb2.toString();
        hVar.a();
        hVar.b();
        SQLiteStatement compileStatement = ((k1.a) hVar.f27953c.H()).f30288s.compileStatement(sb3);
        compileStatement.bindLong(1, u.f(lVar));
        int i11 = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.bindNull(i11);
            } else {
                compileStatement.bindString(i11, str);
            }
            i11++;
        }
        hVar.c();
        try {
            int executeUpdateDelete = compileStatement.executeUpdateDelete();
            hVar.h();
            return executeUpdateDelete;
        } finally {
            hVar.f();
        }
    }
}
