package v9;

import android.os.Looper;
import java.util.concurrent.ExecutionException;
import w9.f;

/* loaded from: classes2.dex */
public final class e {
    static {
        new f();
    }

    public static <TResult> TResult a(Task<TResult> task) throws ExecutionException, InterruptedException {
        boolean z10;
        Exception exc;
        Exception exc2;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            w9.d dVar = (w9.d) task;
            synchronized (dVar.f36175a) {
                z10 = dVar.f36176b;
            }
            if (z10) {
                if (task.d()) {
                    return task.c();
                }
                w9.d dVar2 = (w9.d) task;
                synchronized (dVar2.f36175a) {
                    exc2 = dVar2.f36178d;
                }
                throw new ExecutionException(exc2);
            }
            f.a aVar = new f.a();
            task.b(aVar);
            task.a(aVar);
            aVar.f36182a.await();
            if (task.d()) {
                return task.c();
            }
            w9.d dVar3 = (w9.d) task;
            synchronized (dVar3.f36175a) {
                exc = dVar3.f36178d;
            }
            throw new ExecutionException(exc);
        }
        throw new IllegalStateException("await must not be called on the UI thread");
    }
}
