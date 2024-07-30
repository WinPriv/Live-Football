package com.ironsource.environment.g;

import com.ironsource.environment.g.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24681a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f24682b;

    /* renamed from: com.ironsource.environment.g.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0323a<T> {
        void a(String str);

        void a(List<b<T>> list, long j10);
    }

    public a(ExecutorService executorService) {
        this.f24682b = executorService;
    }

    public final void a(InterfaceC0323a<T> interfaceC0323a, long j10, TimeUnit timeUnit) {
        b.a aVar;
        ExecutorService executorService = this.f24682b;
        if (executorService.isShutdown()) {
            interfaceC0323a.a("can not start work, executor has been shut down");
            return;
        }
        ArrayList arrayList = this.f24681a;
        if (arrayList.isEmpty()) {
            interfaceC0323a.a("can not start work, callable list is empty");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList2 = new ArrayList();
        try {
            List<Future<T>> invokeAll = executorService.invokeAll(arrayList, j10, timeUnit);
            for (int i10 = 0; i10 < invokeAll.size(); i10++) {
                Future<T> future = invokeAll.get(i10);
                if (!future.isDone() || future.isCancelled()) {
                    aVar = new b.a((Callable) arrayList.get(i10));
                } else {
                    try {
                        arrayList2.add(new b.C0324b(future.get()));
                    } catch (InterruptedException e10) {
                        e = e10;
                        arrayList2.add(new b.c((Callable) arrayList.get(i10), e));
                    } catch (CancellationException unused) {
                        aVar = new b.a((Callable) arrayList.get(i10));
                    } catch (ExecutionException e11) {
                        e = e11;
                        arrayList2.add(new b.c((Callable) arrayList.get(i10), e));
                    }
                }
                arrayList2.add(aVar);
            }
            interfaceC0323a.a(arrayList2, System.currentTimeMillis() - currentTimeMillis);
            executorService.shutdownNow();
        } catch (Exception e12) {
            e12.printStackTrace();
            interfaceC0323a.a("failed to invoke callables, error= " + e12.getMessage());
            executorService.shutdownNow();
        }
    }

    public final void a(Callable<T> callable) {
        this.f24681a.add(callable);
    }
}
