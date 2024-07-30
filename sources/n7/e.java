package n7;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import q.h;
import s7.j;
import s7.p;

/* compiled from: FirebaseApp.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f33456j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final q.b f33457k = new q.b();

    /* renamed from: a, reason: collision with root package name */
    public final Context f33458a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33459b;

    /* renamed from: c, reason: collision with root package name */
    public final g f33460c;

    /* renamed from: d, reason: collision with root package name */
    public final j f33461d;

    /* renamed from: g, reason: collision with root package name */
    public final p<h8.a> f33463g;

    /* renamed from: h, reason: collision with root package name */
    public final c8.a<a8.f> f33464h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f33462e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f33465i = new CopyOnWriteArrayList();

    /* compiled from: FirebaseApp.java */
    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface a {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z10);
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(14)
    /* loaded from: classes2.dex */
    public static class b implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public static final AtomicReference<b> f33466a = new AtomicReference<>();

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void onBackgroundStateChanged(boolean z10) {
            synchronized (e.f33456j) {
                Iterator it = new ArrayList(e.f33457k.values()).iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (eVar.f33462e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = eVar.f33465i.iterator();
                        while (it2.hasNext()) {
                            ((a) it2.next()).onBackgroundStateChanged(z10);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(24)
    /* loaded from: classes2.dex */
    public static class c extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        public static final AtomicReference<c> f33467b = new AtomicReference<>();

        /* renamed from: a, reason: collision with root package name */
        public final Context f33468a;

        public c(Context context) {
            this.f33468a = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (e.f33456j) {
                Iterator it = ((h.e) e.f33457k.values()).iterator();
                while (it.hasNext()) {
                    ((e) it.next()).d();
                }
            }
            this.f33468a.unregisterReceiver(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cb A[LOOP:0: B:10:0x00c5->B:12:0x00cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0080  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(final android.content.Context r9, n7.g r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.e.<init>(android.content.Context, n7.g, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e b() {
        e eVar;
        synchronized (f33456j) {
            eVar = (e) f33457k.getOrDefault("[DEFAULT]", null);
            if (eVar != null) {
                eVar.f33464h.get().c();
            } else {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return eVar;
    }

    public static e e(Context context) {
        synchronized (f33456j) {
            if (f33457k.containsKey("[DEFAULT]")) {
                return b();
            }
            g a10 = g.a(context);
            if (a10 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return f(context, a10, "[DEFAULT]");
        }
    }

    public static e f(Context context, g gVar, String str) {
        e eVar;
        boolean z10;
        AtomicReference<b> atomicReference = b.f33466a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<b> atomicReference2 = b.f33466a;
            if (atomicReference2.get() == null) {
                b bVar = new b();
                while (true) {
                    if (atomicReference2.compareAndSet(null, bVar)) {
                        z10 = true;
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(bVar);
                }
            }
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f33456j) {
            q.b bVar2 = f33457k;
            Preconditions.checkState(true ^ bVar2.containsKey(trim), "FirebaseApp name " + trim + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            eVar = new e(context, gVar, trim);
            bVar2.put(trim, eVar);
        }
        eVar.d();
        return eVar;
    }

    public final void a() {
        Preconditions.checkState(!this.f.get(), "FirebaseApp was deleted");
    }

    @KeepForSdk
    public final String c() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(Base64Utils.encodeUrlSafeNoPadding(this.f33459b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(Base64Utils.encodeUrlSafeNoPadding(this.f33460c.f33470b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void d() {
        HashMap hashMap;
        boolean z10 = true;
        if (!j0.j.a(this.f33458a)) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(this.f33459b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.f33458a;
            AtomicReference<c> atomicReference = c.f33467b;
            if (atomicReference.get() == null) {
                c cVar = new c(context);
                while (true) {
                    if (atomicReference.compareAndSet(null, cVar)) {
                        break;
                    } else if (atomicReference.get() != null) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(this.f33459b);
        Log.i("FirebaseApp", sb3.toString());
        j jVar = this.f33461d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f33459b);
        AtomicReference<Boolean> atomicReference2 = jVar.f35235e;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                break;
            } else if (atomicReference2.get() != null) {
                z10 = false;
                break;
            }
        }
        if (z10) {
            synchronized (jVar) {
                hashMap = new HashMap(jVar.f35231a);
            }
            jVar.g(hashMap, equals);
        }
        this.f33464h.get().c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        eVar.a();
        return this.f33459b.equals(eVar.f33459b);
    }

    public final int hashCode() {
        return this.f33459b.hashCode();
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("name", this.f33459b).add("options", this.f33460c).toString();
    }
}
