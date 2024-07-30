package androidx.work.impl;

import a2.b;
import a2.c;
import a2.e;
import a2.f;
import a2.h;
import a2.i;
import a2.k;
import a2.l;
import a2.m;
import a2.n;
import a2.p;
import a2.q;
import a2.s;
import a2.t;
import android.content.Context;
import com.huawei.openalliance.ad.ppskit.db.bean.TemplateStyleRecord;
import f1.g;
import f1.i;
import h1.c;
import j1.c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f2620s = 0;

    /* renamed from: l, reason: collision with root package name */
    public volatile q f2621l;

    /* renamed from: m, reason: collision with root package name */
    public volatile c f2622m;

    /* renamed from: n, reason: collision with root package name */
    public volatile t f2623n;
    public volatile i o;

    /* renamed from: p, reason: collision with root package name */
    public volatile l f2624p;

    /* renamed from: q, reason: collision with root package name */
    public volatile n f2625q;

    /* renamed from: r, reason: collision with root package name */
    public volatile f f2626r;

    /* loaded from: classes.dex */
    public class a extends i.a {
        public a() {
        }

        @Override // f1.i.a
        public final void a(k1.a aVar) {
            aVar.d("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.d("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            aVar.d("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            aVar.d("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            aVar.d("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            aVar.d("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            aVar.d("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.d("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            aVar.d("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.d("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.d("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            aVar.d("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.d("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            aVar.d("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.d("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // f1.i.a
        public final i.b b(k1.a aVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new c.a(1, 1, "work_spec_id", "TEXT", true, null));
            hashMap.put("prerequisite_id", new c.a(2, 1, "prerequisite_id", "TEXT", true, null));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new c.d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), false));
            hashSet2.add(new c.d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), false));
            h1.c cVar = new h1.c("Dependency", hashMap, hashSet, hashSet2);
            h1.c a10 = h1.c.a(aVar, "Dependency");
            if (!cVar.equals(a10)) {
                return new i.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + cVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new c.a(1, 1, "id", "TEXT", true, null));
            hashMap2.put("state", new c.a(0, 1, "state", "INTEGER", true, null));
            hashMap2.put("worker_class_name", new c.a(0, 1, "worker_class_name", "TEXT", true, null));
            hashMap2.put("input_merger_class_name", new c.a(0, 1, "input_merger_class_name", "TEXT", false, null));
            hashMap2.put("input", new c.a(0, 1, "input", "BLOB", true, null));
            hashMap2.put("output", new c.a(0, 1, "output", "BLOB", true, null));
            hashMap2.put("initial_delay", new c.a(0, 1, "initial_delay", "INTEGER", true, null));
            hashMap2.put("interval_duration", new c.a(0, 1, "interval_duration", "INTEGER", true, null));
            hashMap2.put("flex_duration", new c.a(0, 1, "flex_duration", "INTEGER", true, null));
            hashMap2.put("run_attempt_count", new c.a(0, 1, "run_attempt_count", "INTEGER", true, null));
            hashMap2.put("backoff_policy", new c.a(0, 1, "backoff_policy", "INTEGER", true, null));
            hashMap2.put("backoff_delay_duration", new c.a(0, 1, "backoff_delay_duration", "INTEGER", true, null));
            hashMap2.put("period_start_time", new c.a(0, 1, "period_start_time", "INTEGER", true, null));
            hashMap2.put("minimum_retention_duration", new c.a(0, 1, "minimum_retention_duration", "INTEGER", true, null));
            hashMap2.put("schedule_requested_at", new c.a(0, 1, "schedule_requested_at", "INTEGER", true, null));
            hashMap2.put("run_in_foreground", new c.a(0, 1, "run_in_foreground", "INTEGER", true, null));
            hashMap2.put("out_of_quota_policy", new c.a(0, 1, "out_of_quota_policy", "INTEGER", true, null));
            hashMap2.put("required_network_type", new c.a(0, 1, "required_network_type", "INTEGER", false, null));
            hashMap2.put("requires_charging", new c.a(0, 1, "requires_charging", "INTEGER", true, null));
            hashMap2.put("requires_device_idle", new c.a(0, 1, "requires_device_idle", "INTEGER", true, null));
            hashMap2.put("requires_battery_not_low", new c.a(0, 1, "requires_battery_not_low", "INTEGER", true, null));
            hashMap2.put("requires_storage_not_low", new c.a(0, 1, "requires_storage_not_low", "INTEGER", true, null));
            hashMap2.put("trigger_content_update_delay", new c.a(0, 1, "trigger_content_update_delay", "INTEGER", true, null));
            hashMap2.put("trigger_max_content_delay", new c.a(0, 1, "trigger_max_content_delay", "INTEGER", true, null));
            hashMap2.put("content_uri_triggers", new c.a(0, 1, "content_uri_triggers", "BLOB", false, null));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new c.d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), false));
            hashSet4.add(new c.d("index_WorkSpec_period_start_time", Arrays.asList("period_start_time"), false));
            h1.c cVar2 = new h1.c("WorkSpec", hashMap2, hashSet3, hashSet4);
            h1.c a11 = h1.c.a(aVar, "WorkSpec");
            if (!cVar2.equals(a11)) {
                return new i.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + cVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put(TemplateStyleRecord.TAG, new c.a(1, 1, TemplateStyleRecord.TAG, "TEXT", true, null));
            hashMap3.put("work_spec_id", new c.a(2, 1, "work_spec_id", "TEXT", true, null));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new c.d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), false));
            h1.c cVar3 = new h1.c("WorkTag", hashMap3, hashSet5, hashSet6);
            h1.c a12 = h1.c.a(aVar, "WorkTag");
            if (!cVar3.equals(a12)) {
                return new i.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + cVar3 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new c.a(1, 1, "work_spec_id", "TEXT", true, null));
            hashMap4.put("system_id", new c.a(0, 1, "system_id", "INTEGER", true, null));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            h1.c cVar4 = new h1.c("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            h1.c a13 = h1.c.a(aVar, "SystemIdInfo");
            if (!cVar4.equals(a13)) {
                return new i.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + cVar4 + "\n Found:\n" + a13);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new c.a(1, 1, "name", "TEXT", true, null));
            hashMap5.put("work_spec_id", new c.a(2, 1, "work_spec_id", "TEXT", true, null));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new c.d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), false));
            h1.c cVar5 = new h1.c("WorkName", hashMap5, hashSet8, hashSet9);
            h1.c a14 = h1.c.a(aVar, "WorkName");
            if (!cVar5.equals(a14)) {
                return new i.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + cVar5 + "\n Found:\n" + a14);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new c.a(1, 1, "work_spec_id", "TEXT", true, null));
            hashMap6.put("progress", new c.a(0, 1, "progress", "BLOB", true, null));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            h1.c cVar6 = new h1.c("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            h1.c a15 = h1.c.a(aVar, "WorkProgress");
            if (!cVar6.equals(a15)) {
                return new i.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + cVar6 + "\n Found:\n" + a15);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new c.a(1, 1, "key", "TEXT", true, null));
            hashMap7.put("long_value", new c.a(0, 1, "long_value", "INTEGER", false, null));
            h1.c cVar7 = new h1.c("Preference", hashMap7, new HashSet(0), new HashSet(0));
            h1.c a16 = h1.c.a(aVar, "Preference");
            if (!cVar7.equals(a16)) {
                return new i.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + cVar7 + "\n Found:\n" + a16);
            }
            return new i.b(true, null);
        }
    }

    @Override // f1.h
    public final g d() {
        return new g(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // f1.h
    public final j1.c e(f1.a aVar) {
        f1.i iVar = new f1.i(aVar, new a());
        Context context = aVar.f27924b;
        if (context != null) {
            return aVar.f27923a.a(new c.b(context, aVar.f27925c, iVar, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    @Override // androidx.work.impl.WorkDatabase
    public final b i() {
        a2.c cVar;
        if (this.f2622m != null) {
            return this.f2622m;
        }
        synchronized (this) {
            if (this.f2622m == null) {
                this.f2622m = new a2.c(this);
            }
            cVar = this.f2622m;
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e j() {
        f fVar;
        if (this.f2626r != null) {
            return this.f2626r;
        }
        synchronized (this) {
            if (this.f2626r == null) {
                this.f2626r = new f(this);
            }
            fVar = this.f2626r;
        }
        return fVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final h k() {
        a2.i iVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new a2.i(this);
            }
            iVar = this.o;
        }
        return iVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final k l() {
        l lVar;
        if (this.f2624p != null) {
            return this.f2624p;
        }
        synchronized (this) {
            if (this.f2624p == null) {
                this.f2624p = new l(this);
            }
            lVar = this.f2624p;
        }
        return lVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final m m() {
        n nVar;
        if (this.f2625q != null) {
            return this.f2625q;
        }
        synchronized (this) {
            if (this.f2625q == null) {
                this.f2625q = new n(this);
            }
            nVar = this.f2625q;
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final p n() {
        q qVar;
        if (this.f2621l != null) {
            return this.f2621l;
        }
        synchronized (this) {
            if (this.f2621l == null) {
                this.f2621l = new q(this);
            }
            qVar = this.f2621l;
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s o() {
        t tVar;
        if (this.f2623n != null) {
            return this.f2623n;
        }
        synchronized (this) {
            if (this.f2623n == null) {
                this.f2623n = new t(this);
            }
            tVar = this.f2623n;
        }
        return tVar;
    }
}
