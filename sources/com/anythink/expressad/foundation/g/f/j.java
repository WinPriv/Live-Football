package com.anythink.expressad.foundation.g.f;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10052a = "j";

    /* renamed from: b, reason: collision with root package name */
    private Context f10053b;

    /* renamed from: d, reason: collision with root package name */
    private Set<i> f10055d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private ExecutorService f10056e = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());
    private AtomicInteger f = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    private c f10054c = new d(new Handler(Looper.getMainLooper()));

    /* loaded from: classes.dex */
    public interface a {
        boolean a(i<?> iVar);
    }

    public j(Context context) {
        this.f10053b = context.getApplicationContext();
    }

    private int a() {
        return this.f.incrementAndGet();
    }

    public final void b(i iVar) {
        synchronized (this) {
            this.f10055d.remove(iVar);
        }
    }

    private void a(a aVar) {
        synchronized (this) {
            for (i iVar : this.f10055d) {
                if (aVar.a(iVar)) {
                    iVar.e();
                }
            }
        }
    }

    private void a(final Object obj) {
        if (obj != null) {
            a(new a() { // from class: com.anythink.expressad.foundation.g.f.j.1
                @Override // com.anythink.expressad.foundation.g.f.j.a
                public final boolean a(i<?> iVar) {
                    if (iVar.b() == obj) {
                        return true;
                    }
                    return false;
                }
            });
            return;
        }
        throw new IllegalArgumentException("Cannot cancelAll with a null tag");
    }

    public final void a(final i iVar) {
        iVar.a(this);
        synchronized (this) {
            this.f10055d.add(iVar);
        }
        iVar.a(this.f.incrementAndGet());
        this.f10056e.execute(new Runnable() { // from class: com.anythink.expressad.foundation.g.f.j.2
            @Override // java.lang.Runnable
            public final void run() {
                Context unused = j.this.f10053b;
                new h(null, j.this.f10054c).a(iVar);
            }
        });
    }
}
