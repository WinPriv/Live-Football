package f7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: SnackbarManager.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static a f28146b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f28147a = new Object();

    /* compiled from: SnackbarManager.java */
    /* renamed from: f7.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0378a implements Handler.Callback {
        public C0378a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a aVar = a.this;
            b bVar = (b) message.obj;
            synchronized (aVar.f28147a) {
                if (bVar == null || bVar == null) {
                    bVar.getClass();
                    throw null;
                }
            }
            return true;
        }
    }

    /* compiled from: SnackbarManager.java */
    /* loaded from: classes2.dex */
    public static class b {
    }

    public a() {
        new Handler(Looper.getMainLooper(), new C0378a());
    }

    public static a a() {
        if (f28146b == null) {
            f28146b = new a();
        }
        return f28146b;
    }
}
