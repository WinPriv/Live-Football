package ka;

import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class t7 extends b3.c {

    /* renamed from: b, reason: collision with root package name */
    public final b3.c f31873b;

    /* renamed from: c, reason: collision with root package name */
    public final ThreadPoolExecutor f31874c;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ u7 f31875s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f31876t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f31877u;

        public a(u7 u7Var, int i10, String str) {
            this.f31875s = u7Var;
            this.f31876t = i10;
            this.f31877u = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String simpleName;
            String str;
            try {
                t7.this.f31873b.b(this.f31875s, this.f31876t, this.f31877u);
            } catch (RuntimeException e10) {
                simpleName = e10.getClass().getSimpleName();
                str = "log run ";
                Log.w("LogExecutor", str.concat(simpleName));
            } catch (Throwable th) {
                simpleName = th.getClass().getSimpleName();
                str = "log run ex: ";
                Log.w("LogExecutor", str.concat(simpleName));
            }
        }
    }

    public t7(m7 m7Var) {
        super(2);
        this.f31874c = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ti("FileLog", 5));
        this.f31873b = m7Var;
    }

    @Override // b3.c
    public final b3.c a(String str, String str2) {
        this.f31874c.execute(new s7(this, str, str2));
        b3.c cVar = (b3.c) this.f2858a;
        if (cVar != null) {
            cVar.a(str, str2);
        }
        return this;
    }

    @Override // b3.c
    public final void b(u7 u7Var, int i10, String str) {
        this.f31874c.execute(new a(u7Var, i10, str));
        b3.c cVar = (b3.c) this.f2858a;
        if (cVar != null) {
            cVar.b(u7Var, i10, str);
        }
    }
}
