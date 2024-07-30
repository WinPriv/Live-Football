package d0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import j5.g0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;
import w9.d;

/* compiled from: UnusedAppRestrictionsBackportCallback.java */
/* loaded from: classes.dex */
public final class b implements g0 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f27250s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f27251t;

    public /* synthetic */ b(Object obj, int i10) {
        this.f27250s = i10;
        this.f27251t = obj;
    }

    public final void a(Exception exc) {
        d dVar = (d) this.f27251t;
        synchronized (dVar.f36175a) {
            if (!dVar.f36176b) {
                dVar.f36176b = true;
                dVar.f36178d = exc;
                dVar.f36175a.notifyAll();
                dVar.e();
            }
        }
    }

    @Override // j5.g0
    public final long b() {
        long j10 = Long.MAX_VALUE;
        for (g0 g0Var : (g0[]) this.f27251t) {
            long b10 = g0Var.b();
            if (b10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, b10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // j5.g0
    public final boolean c(long j10) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        do {
            long b10 = b();
            if (b10 == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (g0 g0Var : (g0[]) this.f27251t) {
                long b11 = g0Var.b();
                if (b11 != Long.MIN_VALUE && b11 <= j10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (b11 == b10 || z11) {
                    z10 |= g0Var.c(j10);
                }
            }
            z12 |= z10;
        } while (z10);
        return z12;
    }

    @Override // j5.g0
    public final long e() {
        long j10 = Long.MAX_VALUE;
        for (g0 g0Var : (g0[]) this.f27251t) {
            long e10 = g0Var.e();
            if (e10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, e10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // j5.g0
    public final void f(long j10) {
        for (g0 g0Var : (g0[]) this.f27251t) {
            g0Var.f(j10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(Object obj) {
        d dVar = (d) this.f27251t;
        synchronized (dVar.f36175a) {
            if (!dVar.f36176b) {
                dVar.f36176b = true;
                dVar.f36177c = obj;
                dVar.f36175a.notifyAll();
                dVar.e();
            }
        }
    }

    @Override // j5.g0
    public final boolean isLoading() {
        for (g0 g0Var : (g0[]) this.f27251t) {
            if (g0Var.isLoading()) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        switch (this.f27250s) {
            case 5:
                return "ImmutableJSONObject{jsonObject=" + ((JSONObject) this.f27251t) + '}';
            default:
                return super.toString();
        }
    }

    public b(int i10) {
        Handler handler;
        Handler handler2;
        this.f27250s = i10;
        if (i10 == 3) {
            this.f27251t = new d();
            return;
        }
        if (i10 == 4) {
            this.f27251t = new ConcurrentLinkedQueue();
            return;
        }
        if (i10 != 5) {
            Looper mainLooper = Looper.getMainLooper();
            if (Build.VERSION.SDK_INT >= 28) {
                handler2 = Handler.createAsync(mainLooper);
            } else {
                try {
                    handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                } catch (IllegalAccessException e10) {
                    e = e10;
                    Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                    handler = new Handler(mainLooper);
                    handler2 = handler;
                    this.f27251t = handler2;
                    return;
                } catch (InstantiationException e11) {
                    e = e11;
                    Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                    handler = new Handler(mainLooper);
                    handler2 = handler;
                    this.f27251t = handler2;
                    return;
                } catch (NoSuchMethodException e12) {
                    e = e12;
                    Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                    handler = new Handler(mainLooper);
                    handler2 = handler;
                    this.f27251t = handler2;
                    return;
                } catch (InvocationTargetException e13) {
                    Throwable cause = e13.getCause();
                    if (!(cause instanceof RuntimeException)) {
                        if (cause instanceof Error) {
                            throw ((Error) cause);
                        }
                        throw new RuntimeException(cause);
                    }
                    throw ((RuntimeException) cause);
                }
                handler2 = handler;
            }
            this.f27251t = handler2;
            return;
        }
        this.f27251t = new JSONObject();
    }
}
