package l4;

import android.media.metrics.LogSessionId;
import d6.g0;

/* compiled from: PlayerId.java */
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final a f32481a;

    /* compiled from: PlayerId.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f32482b = 0;

        /* renamed from: a, reason: collision with root package name */
        public final LogSessionId f32483a;

        static {
            LogSessionId unused;
            unused = LogSessionId.LOG_SESSION_ID_NONE;
        }

        public a(LogSessionId logSessionId) {
            this.f32483a = logSessionId;
        }
    }

    static {
        if (g0.f27302a < 31) {
            new w();
        } else {
            int i10 = a.f32482b;
        }
    }

    public w() {
        this((a) null);
        d6.a.d(g0.f27302a < 31);
    }

    public w(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    public w(a aVar) {
        this.f32481a = aVar;
    }
}
