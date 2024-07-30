package gb;

/* loaded from: classes2.dex */
public final class v implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public Runnable f28638s;

    public v(Runnable runnable) {
        this.f28638s = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f28638s;
        if (runnable != null) {
            try {
                runnable.run();
            } finally {
                try {
                } finally {
                }
            }
        }
    }
}
