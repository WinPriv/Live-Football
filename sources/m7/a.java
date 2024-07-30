package m7;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: ListenableFuture.java */
/* loaded from: classes2.dex */
public interface a<V> extends Future<V> {
    void a(Runnable runnable, Executor executor);
}
