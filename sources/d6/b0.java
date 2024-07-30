package d6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d6.m;
import java.util.ArrayList;

/* compiled from: SystemHandlerWrapper.java */
/* loaded from: classes2.dex */
public final class b0 implements m {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f27280b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f27281a;

    /* compiled from: SystemHandlerWrapper.java */
    /* loaded from: classes2.dex */
    public static final class a implements m.a {

        /* renamed from: a, reason: collision with root package name */
        public Message f27282a;

        public final void a() {
            Message message = this.f27282a;
            message.getClass();
            message.sendToTarget();
            this.f27282a = null;
            ArrayList arrayList = b0.f27280b;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            }
        }
    }

    public b0(Handler handler) {
        this.f27281a = handler;
    }

    public static a l() {
        a aVar;
        ArrayList arrayList = f27280b;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                aVar = new a();
            } else {
                aVar = (a) arrayList.remove(arrayList.size() - 1);
            }
        }
        return aVar;
    }

    @Override // d6.m
    public final boolean a() {
        return this.f27281a.hasMessages(0);
    }

    @Override // d6.m
    public final a b(int i10, int i11, int i12) {
        a l10 = l();
        l10.f27282a = this.f27281a.obtainMessage(i10, i11, i12);
        return l10;
    }

    @Override // d6.m
    public final boolean c(Runnable runnable) {
        return this.f27281a.post(runnable);
    }

    @Override // d6.m
    public final a d(int i10) {
        a l10 = l();
        l10.f27282a = this.f27281a.obtainMessage(i10);
        return l10;
    }

    @Override // d6.m
    public final void e() {
        this.f27281a.removeCallbacksAndMessages(null);
    }

    @Override // d6.m
    public final boolean f(long j10) {
        return this.f27281a.sendEmptyMessageAtTime(2, j10);
    }

    @Override // d6.m
    public final boolean g(int i10) {
        return this.f27281a.sendEmptyMessage(i10);
    }

    @Override // d6.m
    public final boolean h(m.a aVar) {
        a aVar2 = (a) aVar;
        Message message = aVar2.f27282a;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = this.f27281a.sendMessageAtFrontOfQueue(message);
        aVar2.f27282a = null;
        ArrayList arrayList = f27280b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(aVar2);
            }
        }
        return sendMessageAtFrontOfQueue;
    }

    @Override // d6.m
    public final void i(int i10) {
        this.f27281a.removeMessages(i10);
    }

    @Override // d6.m
    public final a j(int i10, Object obj) {
        a l10 = l();
        l10.f27282a = this.f27281a.obtainMessage(i10, obj);
        return l10;
    }

    @Override // d6.m
    public final Looper k() {
        return this.f27281a.getLooper();
    }
}
