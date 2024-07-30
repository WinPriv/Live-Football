package okio;

import javax.annotation.Nullable;

/* compiled from: Segment.java */
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f33877a;

    /* renamed from: b, reason: collision with root package name */
    public int f33878b;

    /* renamed from: c, reason: collision with root package name */
    public int f33879c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f33880d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33881e;
    public v f;

    /* renamed from: g, reason: collision with root package name */
    public v f33882g;

    public v() {
        this.f33877a = new byte[8192];
        this.f33881e = true;
        this.f33880d = false;
    }

    @Nullable
    public final v a() {
        v vVar;
        v vVar2 = this.f;
        if (vVar2 != this) {
            vVar = vVar2;
        } else {
            vVar = null;
        }
        v vVar3 = this.f33882g;
        vVar3.f = vVar2;
        this.f.f33882g = vVar3;
        this.f = null;
        this.f33882g = null;
        return vVar;
    }

    public final void b(v vVar) {
        vVar.f33882g = this;
        vVar.f = this.f;
        this.f.f33882g = vVar;
        this.f = vVar;
    }

    public final v c() {
        this.f33880d = true;
        return new v(this.f33877a, this.f33878b, this.f33879c, true, false);
    }

    public final void d(v vVar, int i10) {
        if (vVar.f33881e) {
            int i11 = vVar.f33879c;
            int i12 = i11 + i10;
            byte[] bArr = vVar.f33877a;
            if (i12 > 8192) {
                if (!vVar.f33880d) {
                    int i13 = vVar.f33878b;
                    if ((i11 + i10) - i13 <= 8192) {
                        System.arraycopy(bArr, i13, bArr, 0, i11 - i13);
                        vVar.f33879c -= vVar.f33878b;
                        vVar.f33878b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f33877a, this.f33878b, bArr, vVar.f33879c, i10);
            vVar.f33879c += i10;
            this.f33878b += i10;
            return;
        }
        throw new IllegalArgumentException();
    }

    public v(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.f33877a = bArr;
        this.f33878b = i10;
        this.f33879c = i11;
        this.f33880d = z10;
        this.f33881e = z11;
    }
}
