package gb;

/* loaded from: classes2.dex */
public final class t0 {

    /* renamed from: b, reason: collision with root package name */
    public static t0 f28628b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f28629c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public s0 f28630a;

    public t0() {
        int i10;
        int maxMemory = (int) Runtime.getRuntime().maxMemory();
        if (maxMemory > 0) {
            i10 = maxMemory / 4;
        } else {
            i10 = 31457280;
        }
        this.f28630a = new s0(Math.min(31457280, i10));
    }
}
