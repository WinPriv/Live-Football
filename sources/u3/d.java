package u3;

/* compiled from: StateVerifier.java */
/* loaded from: classes.dex */
public abstract class d {

    /* compiled from: StateVerifier.java */
    /* loaded from: classes.dex */
    public static class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public volatile boolean f35756a;

        public final void a() {
            if (!this.f35756a) {
            } else {
                throw new IllegalStateException("Already released");
            }
        }
    }
}
