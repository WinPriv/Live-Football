package gb;

import gb.c0;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f28612a = 0;

    public static <RESULT> RESULT a(Callable<RESULT> callable, RESULT result) {
        return (RESULT) b(callable, result, 1L, TimeUnit.SECONDS);
    }

    public static <RESULT> RESULT b(Callable<RESULT> callable, RESULT result, long j10, TimeUnit timeUnit) {
        if (callable == null) {
            return result;
        }
        try {
            return (RESULT) ((ExecutorService) c0.f28551a.get(c0.a.SYNC_CALL)).submit(callable).get(j10, timeUnit);
        } catch (InterruptedException e10) {
            e0.i.q(e10, "call ", com.anythink.expressad.foundation.d.c.bj);
            return result;
        }
    }
}
