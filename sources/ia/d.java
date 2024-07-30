package ia;

/* loaded from: classes2.dex */
public enum d {
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
    public final int f29461s;

    d(int i10) {
        this.f29461s = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name());
        sb2.append("(");
        return com.ironsource.adapters.facebook.a.i(sb2, this.f29461s, ")");
    }
}
