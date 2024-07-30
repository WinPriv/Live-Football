package com.applovin.impl.adview;

import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.y f17155a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f17156b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<b> f17157c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f17158d = new AtomicInteger();

    /* loaded from: classes.dex */
    public interface a {
        void a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f17162a;

        /* renamed from: b, reason: collision with root package name */
        private final a f17163b;

        /* renamed from: c, reason: collision with root package name */
        private final long f17164c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            String str = this.f17162a;
            String str2 = ((b) obj).f17162a;
            if (str != null) {
                return str.equalsIgnoreCase(str2);
            }
            if (str2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f17162a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f17162a + "', countdownStepMillis=" + this.f17164c + '}';
        }

        private b(String str, long j10, a aVar) {
            this.f17162a = str;
            this.f17164c = j10;
            this.f17163b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a() {
            return this.f17162a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return this.f17164c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a c() {
            return this.f17163b;
        }
    }

    public j(Handler handler, com.applovin.impl.sdk.p pVar) {
        if (handler != null) {
            if (pVar != null) {
                this.f17156b = handler;
                this.f17155a = pVar.L();
                return;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No handler specified.");
    }

    public void c() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f17155a.b("CountdownManager", "Stopping countdowns...");
        }
        this.f17158d.incrementAndGet();
        this.f17156b.removeCallbacksAndMessages(null);
    }

    public void b() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f17155a.b("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.f17157c.clear();
    }

    public void a() {
        HashSet hashSet = new HashSet(this.f17157c);
        if (com.applovin.impl.sdk.y.a()) {
            this.f17155a.b("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int incrementAndGet = this.f17158d.incrementAndGet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (com.applovin.impl.sdk.y.a()) {
                this.f17155a.b("CountdownManager", "Starting countdown: " + bVar.a() + " for generation " + incrementAndGet + "...");
            }
            a(bVar, incrementAndGet);
        }
    }

    public void a(String str, long j10, a aVar) {
        if (j10 > 0) {
            if (this.f17156b != null) {
                if (com.applovin.impl.sdk.y.a()) {
                    a3.k.t("Adding countdown: ", str, this.f17155a, "CountdownManager");
                }
                this.f17157c.add(new b(str, j10, aVar));
                return;
            }
            throw new IllegalArgumentException("No handler specified.");
        }
        throw new IllegalArgumentException("Invalid step specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final b bVar, final int i10) {
        this.f17156b.postDelayed(new Runnable() { // from class: com.applovin.impl.adview.j.1
            @Override // java.lang.Runnable
            public void run() {
                a c10 = bVar.c();
                if (!c10.b()) {
                    com.applovin.impl.sdk.y unused = j.this.f17155a;
                    if (com.applovin.impl.sdk.y.a()) {
                        j.this.f17155a.b("CountdownManager", "Ending countdown for " + bVar.a());
                        return;
                    }
                    return;
                }
                if (j.this.f17158d.get() != i10) {
                    com.applovin.impl.sdk.y unused2 = j.this.f17155a;
                    if (com.applovin.impl.sdk.y.a()) {
                        j.this.f17155a.d("CountdownManager", "Killing duplicate countdown from previous generation: " + bVar.a());
                        return;
                    }
                    return;
                }
                try {
                    c10.a();
                    j.this.a(bVar, i10);
                } catch (Throwable th) {
                    com.applovin.impl.sdk.y unused3 = j.this.f17155a;
                    if (com.applovin.impl.sdk.y.a()) {
                        j.this.f17155a.b("CountdownManager", "Encountered error on countdown step for: " + bVar.a(), th);
                    }
                    j.this.b();
                }
            }
        }, bVar.b());
    }
}
