package androidx.work.impl.background.systemalarm;

import a2.g;
import a2.o;
import a2.q;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import r1.h;
import r1.i;
import s1.j;

/* compiled from: CommandHandler.java */
/* loaded from: classes.dex */
public final class a implements s1.a {

    /* renamed from: v, reason: collision with root package name */
    public static final String f2645v = h.e("CommandHandler");

    /* renamed from: s, reason: collision with root package name */
    public final Context f2646s;

    /* renamed from: t, reason: collision with root package name */
    public final HashMap f2647t = new HashMap();

    /* renamed from: u, reason: collision with root package name */
    public final Object f2648u = new Object();

    public a(Context context) {
        this.f2646s = context;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // s1.a
    public final void b(String str, boolean z10) {
        synchronized (this.f2648u) {
            s1.a aVar = (s1.a) this.f2647t.remove(str);
            if (aVar != null) {
                aVar.b(str, z10);
            }
        }
    }

    public final void d(int i10, Intent intent, d dVar) {
        boolean z10;
        boolean z11;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            h.c().a(f2645v, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            b bVar = new b(this.f2646s, i10, dVar);
            ArrayList e10 = ((q) dVar.f2664w.f35074c.n()).e();
            String str = ConstraintProxy.f2636a;
            Iterator it = e10.iterator();
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            while (it.hasNext()) {
                r1.b bVar2 = ((o) it.next()).f64j;
                z12 |= bVar2.f34804d;
                z13 |= bVar2.f34802b;
                z14 |= bVar2.f34805e;
                if (bVar2.f34801a != i.NOT_REQUIRED) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z15 |= z11;
                if (z12 && z13 && z14 && z15) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f2637a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = bVar.f2650a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z13).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z14).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z15);
            context.sendBroadcast(intent2);
            w1.d dVar2 = bVar.f2652c;
            dVar2.b(e10);
            ArrayList arrayList = new ArrayList(e10.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = e10.iterator();
            while (it2.hasNext()) {
                o oVar = (o) it2.next();
                String str3 = oVar.f56a;
                if (currentTimeMillis >= oVar.a() && (!oVar.b() || dVar2.a(str3))) {
                    arrayList.add(oVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String str4 = ((o) it3.next()).f56a;
                Intent a10 = a(context, str4);
                h.c().a(b.f2649d, String.format("Creating a delay_met command for workSpec with id (%s)", str4), new Throwable[0]);
                dVar.e(new d.b(bVar.f2651b, a10, dVar));
            }
            dVar2.c();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            h.c().a(f2645v, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
            dVar.f2664w.e();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            h.c().b(f2645v, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
            String str5 = f2645v;
            h.c().a(str5, String.format("Handling schedule work for %s", string), new Throwable[0]);
            WorkDatabase workDatabase = dVar.f2664w.f35074c;
            workDatabase.c();
            try {
                o i11 = ((q) workDatabase.n()).i(string);
                if (i11 == null) {
                    h.c().f(str5, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                } else if (i11.f57b.k()) {
                    h.c().f(str5, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                } else {
                    long a11 = i11.a();
                    boolean b10 = i11.b();
                    Context context2 = this.f2646s;
                    j jVar = dVar.f2664w;
                    if (!b10) {
                        h.c().a(str5, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a11)), new Throwable[0]);
                        u1.a.b(context2, jVar, string, a11);
                    } else {
                        h.c().a(str5, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a11)), new Throwable[0]);
                        u1.a.b(context2, jVar, string, a11);
                        Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                        dVar.e(new d.b(i10, intent3, dVar));
                    }
                    workDatabase.h();
                }
                return;
            } finally {
                workDatabase.f();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            Bundle extras2 = intent.getExtras();
            synchronized (this.f2648u) {
                String string2 = extras2.getString("KEY_WORKSPEC_ID");
                h c10 = h.c();
                String str6 = f2645v;
                c10.a(str6, String.format("Handing delay met for %s", string2), new Throwable[0]);
                if (!this.f2647t.containsKey(string2)) {
                    c cVar = new c(this.f2646s, i10, string2, dVar);
                    this.f2647t.put(string2, cVar);
                    cVar.f();
                } else {
                    h.c().a(str6, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2), new Throwable[0]);
                }
            }
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
            h.c().a(f2645v, String.format("Handing stopWork work for %s", string3), new Throwable[0]);
            dVar.f2664w.g(string3);
            String str7 = u1.a.f35751a;
            a2.i iVar = (a2.i) dVar.f2664w.f35074c.k();
            g a12 = iVar.a(string3);
            if (a12 != null) {
                u1.a.a(this.f2646s, a12.f45b, string3);
                h.c().a(u1.a.f35751a, String.format("Removing SystemIdInfo for workSpecId (%s)", string3), new Throwable[0]);
                iVar.b(string3);
            }
            dVar.b(string3, false);
            return;
        }
        if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            Bundle extras3 = intent.getExtras();
            String string4 = extras3.getString("KEY_WORKSPEC_ID");
            boolean z16 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
            h.c().a(f2645v, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
            b(string4, z16);
            return;
        }
        h.c().f(f2645v, String.format("Ignoring intent %s", intent), new Throwable[0]);
    }
}
