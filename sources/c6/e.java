package c6;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: BandwidthMeter.java */
/* loaded from: classes2.dex */
public interface e {

    /* compiled from: BandwidthMeter.java */
    /* loaded from: classes2.dex */
    public interface a {

        /* compiled from: BandwidthMeter.java */
        /* renamed from: c6.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0040a {

            /* renamed from: a, reason: collision with root package name */
            public final CopyOnWriteArrayList<C0041a> f3324a = new CopyOnWriteArrayList<>();

            /* compiled from: BandwidthMeter.java */
            /* renamed from: c6.e$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0041a {

                /* renamed from: a, reason: collision with root package name */
                public final Handler f3325a;

                /* renamed from: b, reason: collision with root package name */
                public final a f3326b;

                /* renamed from: c, reason: collision with root package name */
                public boolean f3327c;

                public C0041a(Handler handler, l4.a aVar) {
                    this.f3325a = handler;
                    this.f3326b = aVar;
                }
            }

            public final void a(l4.a aVar) {
                CopyOnWriteArrayList<C0041a> copyOnWriteArrayList = this.f3324a;
                Iterator<C0041a> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    C0041a next = it.next();
                    if (next.f3326b == aVar) {
                        next.f3327c = true;
                        copyOnWriteArrayList.remove(next);
                    }
                }
            }
        }

        void G(int i10, long j10, long j11);
    }

    void c(Handler handler, l4.a aVar);

    void d(l4.a aVar);

    p e();

    long h();
}
