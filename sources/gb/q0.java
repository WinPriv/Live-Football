package gb;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.huawei.hms.ads.ex;
import gb.c0;

/* loaded from: classes2.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f28613a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f28614b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public final String f28615c;

    /* renamed from: d, reason: collision with root package name */
    public n0 f28616d;

    /* renamed from: e, reason: collision with root package name */
    public HandlerThread f28617e;
    public int f;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f28618a;

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f28619b;

        /* renamed from: c, reason: collision with root package name */
        public final String f28620c;

        /* renamed from: d, reason: collision with root package name */
        public final long f28621d;

        public a(int i10, Runnable runnable, String str, long j10) {
            this.f28618a = i10;
            this.f28619b = runnable;
            this.f28620c = str;
            this.f28621d = j10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CacheTask{taskType=");
            sb2.append(this.f28618a);
            sb2.append(", id='");
            return a3.l.p(sb2, this.f28620c, "'}");
        }
    }

    public q0(String str) {
        this.f28615c = TextUtils.isEmpty(str) ? "handler_exec_thread" : str;
    }

    public final n0 a() {
        n0 n0Var;
        synchronized (this.f28613a) {
            n0Var = this.f28616d;
        }
        return n0Var;
    }

    public final void b() {
        Handler handler;
        synchronized (this.f28613a) {
            this.f++;
            n0 a10 = a();
            if (a10 != null && (handler = a10.f28607a) != null) {
                handler.removeCallbacksAndMessages("handler_exec_release_task");
            }
            if (ex.Code()) {
                ex.Code("HandlerExecAgent", "acquire exec agent. ref count: %d", Integer.valueOf(this.f));
            }
        }
    }

    public final void c(Runnable runnable) {
        if (!e()) {
            return;
        }
        n0 a10 = a();
        if (a10 != null) {
            a10.a(runnable, null, 0L);
        } else {
            c0.b(new p0(this, new a(1, runnable, null, 0L)), c0.a.SEQUENCE);
        }
    }

    public final void d() {
        synchronized (this.f28613a) {
            if (!e()) {
                ex.V("HandlerExecAgent", "release exec agent - not working");
                return;
            }
            int i10 = this.f - 1;
            this.f = i10;
            if (i10 <= 0) {
                this.f = 0;
                n0 a10 = a();
                if (a10 != null) {
                    ex.V("HandlerExecAgent", "delay quit thread");
                    a10.a(new o0(this), "handler_exec_release_task", 60000L);
                }
            }
            if (ex.Code()) {
                ex.Code("HandlerExecAgent", "release exec agent - ref count: %d", Integer.valueOf(this.f));
            }
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f28613a) {
            if (this.f > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }
}
