package u4;

import p4.i;

/* compiled from: StartOffsetExtractorInput.java */
/* loaded from: classes2.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final i f35771a;

    /* renamed from: b, reason: collision with root package name */
    public final long f35772b;

    public c(p4.e eVar, long j10) {
        boolean z10;
        this.f35771a = eVar;
        if (eVar.f34314d >= j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        d6.a.a(z10);
        this.f35772b = j10;
    }

    @Override // p4.i
    public final boolean a(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f35771a.a(bArr, i10, i11, z10);
    }

    @Override // p4.i
    public final boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f35771a.c(bArr, i10, i11, z10);
    }

    @Override // p4.i
    public final long d() {
        return this.f35771a.d() - this.f35772b;
    }

    @Override // p4.i
    public final void e(int i10) {
        this.f35771a.e(i10);
    }

    @Override // p4.i
    public final long getLength() {
        return this.f35771a.getLength() - this.f35772b;
    }

    @Override // p4.i
    public final long getPosition() {
        return this.f35771a.getPosition() - this.f35772b;
    }

    @Override // p4.i
    public final void h() {
        this.f35771a.h();
    }

    @Override // p4.i
    public final void i(int i10) {
        this.f35771a.i(i10);
    }

    @Override // p4.i
    public final void j(byte[] bArr, int i10, int i11) {
        this.f35771a.j(bArr, i10, i11);
    }

    @Override // p4.i, c6.h
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f35771a.read(bArr, i10, i11);
    }

    @Override // p4.i
    public final void readFully(byte[] bArr, int i10, int i11) {
        this.f35771a.readFully(bArr, i10, i11);
    }
}
