package r5;

/* compiled from: SimpleSubtitleDecoder.java */
/* loaded from: classes2.dex */
public final class e extends l {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f34926w;

    public e(f fVar) {
        this.f34926w = fVar;
    }

    @Override // n4.h
    public final void h() {
        f fVar = this.f34926w;
        synchronized (fVar.f33334b) {
            boolean z10 = false;
            this.f33298s = 0;
            this.f34928u = null;
            int i10 = fVar.f33339h;
            fVar.f33339h = i10 + 1;
            fVar.f[i10] = this;
            if (!fVar.f33335c.isEmpty() && fVar.f33339h > 0) {
                z10 = true;
            }
            if (z10) {
                fVar.f33334b.notify();
            }
        }
    }
}
