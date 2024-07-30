package com.anythink.expressad.foundation.g.g;

import android.annotation.SuppressLint;
import android.content.Context;
import com.anythink.expressad.foundation.g.g.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    ThreadPoolExecutor f10079a;

    /* renamed from: b, reason: collision with root package name */
    HashMap<Long, a> f10080b;

    /* renamed from: c, reason: collision with root package name */
    WeakReference<Context> f10081c;

    @SuppressLint({"UseSparseArrays"})
    public c(Context context, int i10) {
        if (i10 == 0) {
            this.f10079a = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        } else {
            this.f10079a = new ThreadPoolExecutor(i10, (i10 * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        }
        this.f10079a.allowCoreThreadTimeOut(true);
        this.f10080b = new HashMap<>();
        this.f10081c = new WeakReference<>(context);
    }

    private synchronized void b(a aVar) {
        if (aVar != null) {
            if (this.f10080b.containsKey(Long.valueOf(a.e()))) {
                a aVar2 = this.f10080b.get(Long.valueOf(a.e()));
                if (aVar2 != null) {
                    aVar2.f();
                }
                this.f10080b.remove(Long.valueOf(a.e()));
            }
        }
    }

    public final synchronized void a() {
        try {
            Iterator<Map.Entry<Long, a>> it = this.f10080b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().f();
            }
            this.f10080b.clear();
        } catch (Exception unused) {
        }
    }

    private synchronized void b(final a aVar, final a.b bVar) {
        this.f10080b.put(Long.valueOf(a.e()), aVar);
        aVar.f10069d = new a.b() { // from class: com.anythink.expressad.foundation.g.g.c.1
            @Override // com.anythink.expressad.foundation.g.g.a.b
            public final void a(a.EnumC0123a enumC0123a) {
                if (enumC0123a == a.EnumC0123a.CANCEL) {
                    c.this.f10080b.remove(Long.valueOf(a.e()));
                } else if (enumC0123a == a.EnumC0123a.FINISH) {
                    c.this.f10080b.remove(Long.valueOf(a.e()));
                } else if (enumC0123a == a.EnumC0123a.RUNNING && c.this.f10081c.get() == null) {
                    c.this.a();
                }
                a.b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(enumC0123a);
                }
            }
        };
    }

    @SuppressLint({"UseSparseArrays"})
    public c(Context context) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.f10079a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f10080b = new HashMap<>();
        this.f10081c = new WeakReference<>(context);
    }

    public final void a(a aVar) {
        b(aVar, null);
        this.f10079a.execute(aVar);
    }

    public final void a(a aVar, a.b bVar) {
        b(aVar, bVar);
        this.f10079a.execute(aVar);
    }

    private void b() {
        Iterator<Map.Entry<Long, a>> it = this.f10080b.entrySet().iterator();
        while (it.hasNext()) {
            a value = it.next().getValue();
            a.EnumC0123a enumC0123a = value.f10068c;
            if (enumC0123a == a.EnumC0123a.PAUSE) {
                value.g();
            } else if (enumC0123a == a.EnumC0123a.READY) {
                this.f10079a.execute(value);
            }
        }
    }

    @SuppressLint({"UseSparseArrays"})
    private c(Context context, byte b10) {
        int availableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 1L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.f10079a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f10080b = new HashMap<>();
        this.f10081c = new WeakReference<>(context);
    }
}
