package com.onesignal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.ViewTreeObserver;
import com.huawei.openalliance.ad.constant.bj;
import com.onesignal.OSFocusHandler;
import com.onesignal.e3;
import com.onesignal.u2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import r1.b;
import r1.j;

/* compiled from: ActivityLifecycleHandler.java */
/* loaded from: classes2.dex */
public final class a implements u2.a {

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f26632d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f26633e = new ConcurrentHashMap();
    public static final ConcurrentHashMap f = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final OSFocusHandler f26634a;

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public Activity f26635b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26636c = false;

    /* compiled from: ActivityLifecycleHandler.java */
    /* renamed from: com.onesignal.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0346a extends Thread {
        public C0346a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            m m10 = e3.m();
            Long b10 = m10.b();
            ((c3) m10.f26911c).c("Application stopped focus time: " + m10.f26909a + " timeElapsed: " + b10);
            if (b10 != null) {
                Collection values = ((ConcurrentHashMap) e3.D.f27007a.f259t).values();
                zc.d.c(values, "trackers.values");
                ArrayList arrayList = new ArrayList();
                for (Object obj : values) {
                    if (!zc.d.a(((ac.a) obj).f(), zb.a.f37359a)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(vc.b.N0(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ac.a) it.next()).e());
                }
                m10.f26910b.b(arrayList2).f(b10.longValue(), arrayList2);
            }
            OSFocusHandler oSFocusHandler = a.this.f26634a;
            Context context = e3.f26748b;
            oSFocusHandler.getClass();
            zc.d.d(context, bj.f.o);
            b.a aVar = new b.a();
            aVar.f34808a = r1.i.CONNECTED;
            r1.b bVar = new r1.b(aVar);
            j.a aVar2 = new j.a(OSFocusHandler.OnLostFocusWorker.class);
            aVar2.f34838b.f64j = bVar;
            j.a b11 = aVar2.b(2000L, TimeUnit.MILLISECONDS);
            b11.f34839c.add("FOCUS_LOST_WORKER_TAG");
            c3.f(context).a("FOCUS_LOST_WORKER_TAG", b11.a());
        }
    }

    /* compiled from: ActivityLifecycleHandler.java */
    /* loaded from: classes2.dex */
    public static class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: s, reason: collision with root package name */
        public final u2.b f26638s;

        /* renamed from: t, reason: collision with root package name */
        public final u2.a f26639t;

        /* renamed from: u, reason: collision with root package name */
        public final String f26640u;

        public c(u2.a aVar, u2.b bVar, String str) {
            this.f26639t = aVar;
            this.f26638s = bVar;
            this.f26640u = str;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (!b3.f(new WeakReference(e3.i()))) {
                Activity activity = ((a) this.f26639t).f26635b;
                if (activity != null) {
                    activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                ConcurrentHashMap concurrentHashMap = a.f;
                String str = this.f26640u;
                concurrentHashMap.remove(str);
                a.f26633e.remove(str);
                this.f26638s.b();
            }
        }
    }

    public a(OSFocusHandler oSFocusHandler) {
        this.f26634a = oSFocusHandler;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        boolean z12;
        e3.b(6, "ActivityLifecycleHandler handleFocus, nextResumeIsFirstActivity: " + this.f26636c, null);
        OSFocusHandler oSFocusHandler = this.f26634a;
        oSFocusHandler.getClass();
        if (!OSFocusHandler.f26607c && !this.f26636c) {
            e3.b(6, "ActivityLifecycleHandler cancel background lost focus worker", null);
            Context context = e3.f26748b;
            zc.d.d(context, bj.f.o);
            s1.j f10 = c3.f(context);
            ((d2.b) f10.f35075d).a(new b2.b(f10));
            return;
        }
        e3.b(6, "ActivityLifecycleHandler reset background state, call app focus", null);
        this.f26636c = false;
        OSFocusHandler.f26606b = false;
        o0 o0Var = oSFocusHandler.f26609a;
        if (o0Var != null) {
            y2.b().a(o0Var);
        }
        OSFocusHandler.f26607c = false;
        e3.b(6, "OSFocusHandler running onAppFocus", null);
        e3.b(6, "Application on focus", null);
        boolean z13 = true;
        e3.o = true;
        e3.m mVar = e3.f26768p;
        e3.m mVar2 = e3.m.NOTIFICATION_CLICK;
        if (!mVar.equals(mVar2)) {
            e3.m mVar3 = e3.f26768p;
            Iterator it = new ArrayList(e3.f26746a).iterator();
            while (it.hasNext()) {
                ((e3.o) it.next()).a(mVar3);
            }
            if (!e3.f26768p.equals(mVar2)) {
                e3.f26768p = e3.m.APP_OPEN;
            }
        }
        synchronized (a0.f26644d) {
            new OSUtils();
            if (OSUtils.b() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && OSUtils.h()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                o.k();
            } else if (a0.f()) {
                r.k();
            }
        }
        if (j0.f26868b) {
            j0.f26868b = false;
            j0.c(OSUtils.a());
        }
        if (e3.f26752d != null) {
            z12 = false;
        } else {
            e3.b(5, "OneSignal was not initialized, ensure to always initialize OneSignal from the onCreate of your Application class.", null);
            z12 = true;
        }
        if (!z12) {
            if (e3.f26776x.f26958a == null) {
                z13 = false;
            }
            if (!z13) {
                e3.b(6, "Delay onAppFocus logic due to missing remote params", null);
                e3.C(e3.f26752d, e3.s(), false);
            } else {
                e3.E();
            }
        }
    }

    public final void b() {
        e3.b(6, "ActivityLifecycleHandler Handling lost focus", null);
        if (this.f26634a != null) {
            if (!OSFocusHandler.f26607c || OSFocusHandler.f26608d) {
                new C0346a().start();
            }
        }
    }

    public final void c() {
        String str;
        StringBuilder sb2 = new StringBuilder("curActivity is NOW: ");
        if (this.f26635b != null) {
            str = "" + this.f26635b.getClass().getName() + com.huawei.openalliance.ad.constant.w.bE + this.f26635b;
        } else {
            str = "null";
        }
        sb2.append(str);
        e3.b(6, sb2.toString(), null);
    }

    public final void d(Activity activity) {
        this.f26635b = activity;
        Iterator it = f26632d.entrySet().iterator();
        while (it.hasNext()) {
            ((b) ((Map.Entry) it.next()).getValue()).a(this.f26635b);
        }
        try {
            ViewTreeObserver viewTreeObserver = this.f26635b.getWindow().getDecorView().getViewTreeObserver();
            for (Map.Entry entry : f26633e.entrySet()) {
                c cVar = new c(this, (u2.b) entry.getValue(), (String) entry.getKey());
                viewTreeObserver.addOnGlobalLayoutListener(cVar);
                f.put((String) entry.getKey(), cVar);
            }
        } catch (RuntimeException e10) {
            e10.printStackTrace();
        }
    }

    /* compiled from: ActivityLifecycleHandler.java */
    /* loaded from: classes2.dex */
    public static abstract class b {
        public void a(Activity activity) {
        }

        public void b(Activity activity) {
        }
    }
}
