package n4;

/* compiled from: Buffer.java */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: s, reason: collision with root package name */
    public int f33298s;

    public final void e(int i10) {
        this.f33298s = i10 | this.f33298s;
    }

    public final boolean f(int i10) {
        if ((this.f33298s & i10) == i10) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        return f(Integer.MIN_VALUE);
    }
}
