package androidx.work.impl.foreground;

import a2.o;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import b2.n;
import d2.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import r1.h;
import s1.j;
import w1.c;
import w1.d;
import z1.e;

/* compiled from: SystemForegroundDispatcher.java */
/* loaded from: classes.dex */
public final class a implements c, s1.a {
    public static final String B = h.e("SystemFgDispatcher");
    public InterfaceC0027a A;

    /* renamed from: s, reason: collision with root package name */
    public final j f2681s;

    /* renamed from: t, reason: collision with root package name */
    public final d2.a f2682t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f2683u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public String f2684v;

    /* renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f2685w;

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f2686x;
    public final HashSet y;

    /* renamed from: z, reason: collision with root package name */
    public final d f2687z;

    /* compiled from: SystemForegroundDispatcher.java */
    /* renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0027a {
    }

    public a(Context context) {
        j b10 = j.b(context);
        this.f2681s = b10;
        d2.a aVar = b10.f35075d;
        this.f2682t = aVar;
        this.f2684v = null;
        this.f2685w = new LinkedHashMap();
        this.y = new HashSet();
        this.f2686x = new HashMap();
        this.f2687z = new d(context, aVar, this);
        b10.f.a(this);
    }

    public static Intent a(Context context, String str, r1.d dVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", dVar.f34813a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", dVar.f34814b);
        intent.putExtra("KEY_NOTIFICATION", dVar.f34815c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str, r1.d dVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", dVar.f34813a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", dVar.f34814b);
        intent.putExtra("KEY_NOTIFICATION", dVar.f34815c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // s1.a
    public final void b(String str, boolean z10) {
        boolean z11;
        Map.Entry entry;
        synchronized (this.f2683u) {
            try {
                o oVar = (o) this.f2686x.remove(str);
                if (oVar != null) {
                    z11 = this.y.remove(oVar);
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.f2687z.b(this.y);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        r1.d dVar = (r1.d) this.f2685w.remove(str);
        if (str.equals(this.f2684v) && this.f2685w.size() > 0) {
            Iterator it = this.f2685w.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f2684v = (String) entry.getKey();
            if (this.A != null) {
                r1.d dVar2 = (r1.d) entry.getValue();
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.A;
                systemForegroundService.f2677t.post(new z1.c(systemForegroundService, dVar2.f34813a, dVar2.f34815c, dVar2.f34814b));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.A;
                systemForegroundService2.f2677t.post(new e(systemForegroundService2, dVar2.f34813a));
            }
        }
        InterfaceC0027a interfaceC0027a = this.A;
        if (dVar != null && interfaceC0027a != null) {
            h.c().a(B, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(dVar.f34813a), str, Integer.valueOf(dVar.f34814b)), new Throwable[0]);
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) interfaceC0027a;
            systemForegroundService3.f2677t.post(new e(systemForegroundService3, dVar.f34813a));
        }
    }

    @Override // w1.c
    public final void c(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                h.c().a(B, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
                j jVar = this.f2681s;
                ((b) jVar.f35075d).a(new n(jVar, str, true));
            }
        }
    }

    public final void f(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        h.c().a(B, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification != null && this.A != null) {
            r1.d dVar = new r1.d(intExtra, intExtra2, notification);
            LinkedHashMap linkedHashMap = this.f2685w;
            linkedHashMap.put(stringExtra, dVar);
            if (TextUtils.isEmpty(this.f2684v)) {
                this.f2684v = stringExtra;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.A;
                systemForegroundService.f2677t.post(new z1.c(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.A;
            systemForegroundService2.f2677t.post(new z1.d(systemForegroundService2, intExtra, notification));
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i10 |= ((r1.d) ((Map.Entry) it.next()).getValue()).f34814b;
                }
                r1.d dVar2 = (r1.d) linkedHashMap.get(this.f2684v);
                if (dVar2 != null) {
                    SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.A;
                    systemForegroundService3.f2677t.post(new z1.c(systemForegroundService3, dVar2.f34813a, dVar2.f34815c, i10));
                }
            }
        }
    }

    @Override // w1.c
    public final void e(List<String> list) {
    }
}
