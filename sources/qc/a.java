package qc;

/* loaded from: classes2.dex */
public final class a implements CharSequence {

    /* renamed from: s, reason: collision with root package name */
    public final CharSequence f34753s;

    public a(CharSequence charSequence) {
        this.f34753s = charSequence;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        if (!Thread.currentThread().isInterrupted()) {
            return this.f34753s.charAt(i10);
        }
        throw new RuntimeException("Interrupted!");
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f34753s.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return new a(this.f34753s.subSequence(i10, i11));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f34753s.toString();
    }
}
