package d6;

/* compiled from: ConditionVariable.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f27296a;

    public e() {
    }

    public final synchronized boolean a() {
        if (this.f27296a) {
            return false;
        }
        this.f27296a = true;
        notifyAll();
        return true;
    }

    public e(int i10) {
    }
}
