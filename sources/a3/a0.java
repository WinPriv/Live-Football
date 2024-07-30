package a3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: ResourceRecycler.java */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f87a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f88b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler.java */
    /* loaded from: classes.dex */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((x) message.obj).a();
                return true;
            }
            return false;
        }
    }

    public final synchronized void a(x<?> xVar, boolean z10) {
        if (!this.f87a && !z10) {
            this.f87a = true;
            xVar.a();
            this.f87a = false;
        }
        this.f88b.obtainMessage(1, xVar).sendToTarget();
    }
}
