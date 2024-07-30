package ka;

/* loaded from: classes2.dex */
public final class r8 {

    /* renamed from: a, reason: collision with root package name */
    public b f31742a = b.IDLE;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f31743b = new byte[0];

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31744a;

        static {
            int[] iArr = new int[b.values().length];
            f31744a = iArr;
            try {
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31744a[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31744a[7] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31744a[8] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        END(-2),
        ERROR(-1),
        IDLE(0),
        INITIALIZED(1),
        PREPARING(2),
        PREPARED(3),
        PLAYING(4),
        PAUSED(5),
        PLAYBACK_COMPLETED(6);


        /* renamed from: s, reason: collision with root package name */
        public final int f31751s;

        b(int i10) {
            this.f31751s = i10;
        }

        @Override // java.lang.Enum
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(name());
            sb2.append("(");
            return com.ironsource.adapters.facebook.a.i(sb2, this.f31751s, ")");
        }
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f31743b) {
            int i10 = a.f31744a[this.f31742a.ordinal()];
            z10 = true;
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean b(b bVar) {
        boolean z10;
        synchronized (this.f31743b) {
            if (this.f31742a == bVar) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean c(b bVar) {
        return !b(bVar);
    }

    public final void d(b bVar) {
        synchronized (this.f31743b) {
            if (this.f31742a != b.END) {
                n7.f("MediaState", "switchToState: %s", bVar);
                this.f31742a = bVar;
            }
        }
    }

    public final String toString() {
        String bVar;
        synchronized (this.f31743b) {
            bVar = this.f31742a.toString();
        }
        return bVar;
    }
}
