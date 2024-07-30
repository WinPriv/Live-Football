package z4;

import java.util.Arrays;

/* compiled from: NalUnitTargetBuffer.java */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f37248a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f37249b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f37250c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f37251d;

    /* renamed from: e, reason: collision with root package name */
    public int f37252e;

    public r(int i10) {
        this.f37248a = i10;
        byte[] bArr = new byte[131];
        this.f37251d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (!this.f37249b) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.f37251d;
        int length = bArr2.length;
        int i13 = this.f37252e;
        if (length < i13 + i12) {
            this.f37251d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, this.f37251d, this.f37252e, i12);
        this.f37252e += i12;
    }

    public final boolean b(int i10) {
        if (!this.f37249b) {
            return false;
        }
        this.f37252e -= i10;
        this.f37249b = false;
        this.f37250c = true;
        return true;
    }

    public final void c() {
        this.f37249b = false;
        this.f37250c = false;
    }

    public final void d(int i10) {
        boolean z10 = true;
        d6.a.d(!this.f37249b);
        if (i10 != this.f37248a) {
            z10 = false;
        }
        this.f37249b = z10;
        if (z10) {
            this.f37252e = 3;
            this.f37250c = false;
        }
    }
}
