package s1;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c2.c f35083s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f35084t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m f35085u;

    public l(m mVar, c2.c cVar, String str) {
        this.f35085u = mVar;
        this.f35083s = cVar;
        this.f35084t = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public final void run() {
        String str = this.f35084t;
        m mVar = this.f35085u;
        try {
            try {
                ListenableWorker.a aVar = (ListenableWorker.a) this.f35083s.get();
                if (aVar == null) {
                    r1.h.c().b(m.K, String.format("%s returned a null result. Treating it as a failure.", mVar.f35089v.f58c), new Throwable[0]);
                } else {
                    r1.h.c().a(m.K, String.format("%s returned a %s result.", mVar.f35089v.f58c, aVar), new Throwable[0]);
                    mVar.y = aVar;
                }
            } catch (InterruptedException e10) {
                e = e10;
                r1.h.c().b(m.K, String.format("%s failed because it threw an exception/error", str), e);
            } catch (CancellationException e11) {
                r1.h.c().d(m.K, String.format("%s was cancelled", str), e11);
            } catch (ExecutionException e12) {
                e = e12;
                r1.h.c().b(m.K, String.format("%s failed because it threw an exception/error", str), e);
            }
        } finally {
            mVar.c();
        }
    }
}
