package c4;

/* compiled from: LogEventDropped.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f3266a;

    /* renamed from: b, reason: collision with root package name */
    public final a f3267b;

    /* compiled from: LogEventDropped.java */
    /* loaded from: classes.dex */
    public enum a implements y7.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: s, reason: collision with root package name */
        public final int f3274s;

        a(int i10) {
            this.f3274s = i10;
        }

        @Override // y7.c
        public final int k() {
            return this.f3274s;
        }
    }

    public c(long j10, a aVar) {
        this.f3266a = j10;
        this.f3267b = aVar;
    }
}
