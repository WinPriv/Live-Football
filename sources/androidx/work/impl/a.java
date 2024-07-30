package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: WorkDatabaseMigrations.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0025a f2628a = new C0025a();

    /* renamed from: b, reason: collision with root package name */
    public static final b f2629b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final c f2630c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final d f2631d = new d();

    /* renamed from: e, reason: collision with root package name */
    public static final e f2632e = new e();
    public static final f f = new f();

    /* renamed from: g, reason: collision with root package name */
    public static final g f2633g = new g();

    /* compiled from: WorkDatabaseMigrations.java */
    /* renamed from: androidx.work.impl.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0025a extends g1.a {
        public C0025a() {
            super(1, 2);
        }

        @Override // g1.a
        public final void a(k1.a aVar) {
            aVar.d("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.d("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            aVar.d("DROP TABLE IF EXISTS alarmInfo");
            aVar.d("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class b extends g1.a {
        public b() {
            super(3, 4);
        }

        @Override // g1.a
        public final void a(k1.a aVar) {
            aVar.d("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class c extends g1.a {
        public c() {
            super(4, 5);
        }

        @Override // g1.a
        public final void a(k1.a aVar) {
            aVar.d("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            aVar.d("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class d extends g1.a {
        public d() {
            super(6, 7);
        }

        @Override // g1.a
        public final void a(k1.a aVar) {
            aVar.d("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class e extends g1.a {
        public e() {
            super(7, 8);
        }

        @Override // g1.a
        public final void a(k1.a aVar) {
            aVar.d("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class f extends g1.a {
        public f() {
            super(8, 9);
        }

        @Override // g1.a
        public final void a(k1.a aVar) {
            aVar.d("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class g extends g1.a {
        public g() {
            super(11, 12);
        }

        @Override // g1.a
        public final void a(k1.a aVar) {
            aVar.d("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public static class h extends g1.a {

        /* renamed from: c, reason: collision with root package name */
        public final Context f2634c;

        public h(Context context, int i10, int i11) {
            super(i10, i11);
            this.f2634c = context;
        }

        @Override // g1.a
        public final void a(k1.a aVar) {
            if (this.f28355b >= 10) {
                aVar.f30288s.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f2634c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public static class i extends g1.a {

        /* renamed from: c, reason: collision with root package name */
        public final Context f2635c;

        public i(Context context) {
            super(9, 10);
            this.f2635c = context;
        }

        @Override // g1.a
        public final void a(k1.a aVar) {
            aVar.d("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            Context context = this.f2635c;
            SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
            boolean contains = sharedPreferences.contains("reschedule_needed");
            SQLiteDatabase sQLiteDatabase = aVar.f30288s;
            if (contains || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j10 = 0;
                long j11 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                    j10 = 1;
                }
                aVar.b();
                try {
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j11)});
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j10)});
                    sharedPreferences.edit().clear().apply();
                    aVar.g();
                } finally {
                }
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i10 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i11 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                aVar.b();
                try {
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                    sharedPreferences2.edit().clear().apply();
                    aVar.g();
                } finally {
                }
            }
        }
    }
}
