package k0;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: RequestExecutor.java */
/* loaded from: classes.dex */
public final class o<T> implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final Callable<T> f30282s;

    /* renamed from: t, reason: collision with root package name */
    public final m0.a<T> f30283t;

    /* renamed from: u, reason: collision with root package name */
    public final Handler f30284u;

    /* compiled from: RequestExecutor.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ m0.a f30285s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Object f30286t;

        public a(m0.a aVar, Object obj) {
            this.f30285s = aVar;
            this.f30286t = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f30285s.accept(this.f30286t);
        }
    }

    public o(Handler handler, i iVar, j jVar) {
        this.f30282s = iVar;
        this.f30283t = jVar;
        this.f30284u = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T t10;
        try {
            t10 = this.f30282s.call();
        } catch (Exception unused) {
            t10 = null;
        }
        this.f30284u.post(new a(this.f30283t, t10));
    }
}
