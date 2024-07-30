package t7;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import r.a;

/* compiled from: DelegatingScheduledFuture.java */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public final class h<V> extends r.a<V> implements ScheduledFuture<V> {

    /* renamed from: z, reason: collision with root package name */
    public final ScheduledFuture<?> f35541z;

    /* compiled from: DelegatingScheduledFuture.java */
    /* loaded from: classes2.dex */
    public class a implements b<V> {
        public a() {
        }

        public final void a(Exception exc) {
            h hVar = h.this;
            hVar.getClass();
            if (r.a.f34756x.b(hVar, null, new a.c(exc))) {
                r.a.d(hVar);
            }
        }
    }

    /* compiled from: DelegatingScheduledFuture.java */
    /* loaded from: classes2.dex */
    public interface b<T> {
    }

    /* compiled from: DelegatingScheduledFuture.java */
    /* loaded from: classes2.dex */
    public interface c<T> {
        ScheduledFuture a(a aVar);
    }

    public h(c<V> cVar) {
        this.f35541z = cVar.a(new a());
    }

    @Override // r.a
    public final void c() {
        boolean z10;
        ScheduledFuture<?> scheduledFuture = this.f35541z;
        Object obj = this.f34757s;
        if ((obj instanceof a.b) && ((a.b) obj).f34762a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f35541z.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f35541z.getDelay(timeUnit);
    }
}
