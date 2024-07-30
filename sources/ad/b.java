package ad;

import java.util.NoSuchElementException;
import vc.g;

/* compiled from: ProgressionIterators.kt */
/* loaded from: classes2.dex */
public final class b extends g {

    /* renamed from: s, reason: collision with root package name */
    public final int f410s;

    /* renamed from: t, reason: collision with root package name */
    public final int f411t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f412u;

    /* renamed from: v, reason: collision with root package name */
    public int f413v;

    public b(int i10, int i11, int i12) {
        this.f410s = i12;
        this.f411t = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f412u = z10;
        this.f413v = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f412u;
    }

    @Override // vc.g
    public final int nextInt() {
        int i10 = this.f413v;
        if (i10 == this.f411t) {
            if (this.f412u) {
                this.f412u = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f413v = this.f410s + i10;
        }
        return i10;
    }
}
