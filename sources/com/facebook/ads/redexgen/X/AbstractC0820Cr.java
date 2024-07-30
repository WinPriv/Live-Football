package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Cr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0820Cr implements W1, InterfaceC07449g {
    public int A00;
    public int A01;
    public long A02;
    public C07459h A03;
    public InterfaceC0860Eh A04;
    public boolean A05 = true;
    public boolean A06;
    public Format[] A07;
    public final int A08;

    public AbstractC0820Cr(int i10) {
        this.A08 = i10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.B8 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<?> */
    public static boolean A0x(@Nullable B8<?> b82, @Nullable DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (b82 == null) {
            return false;
        }
        return b82.A3x(drmInitData);
    }

    public final int A0y() {
        return this.A00;
    }

    public final int A0z(long j10) {
        return this.A04.AEj(j10 - this.A02);
    }

    public final int A10(C9L c9l, C1294Vn c1294Vn, boolean z10) {
        int ADT = this.A04.ADT(c9l, c1294Vn, z10);
        if (ADT == -4) {
            if (c1294Vn.A04()) {
                this.A05 = true;
                return this.A06 ? -4 : -3;
            }
            c1294Vn.A00 += this.A02;
        } else if (ADT == -5) {
            Format format = c9l.A00;
            if (format.A0G != Long.MAX_VALUE) {
                c9l.A00 = format.A0H(format.A0G + this.A02);
            }
        }
        return ADT;
    }

    public final C07459h A11() {
        return this.A03;
    }

    public void A12() {
    }

    public void A13() throws AnonymousClass98 {
    }

    public void A14() throws AnonymousClass98 {
    }

    public void A15(long j10, boolean z10) throws AnonymousClass98 {
    }

    public void A16(boolean z10) throws AnonymousClass98 {
    }

    public void A17(Format[] formatArr, long j10) throws AnonymousClass98 {
    }

    public final boolean A18() {
        return this.A05 ? this.A06 : this.A04.A8Z();
    }

    public final Format[] A19() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final void A4n() {
        H6.A04(this.A01 == 1);
        this.A01 = 0;
        this.A04 = null;
        this.A07 = null;
        this.A06 = false;
        A12();
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final void A59(C07459h c07459h, Format[] formatArr, InterfaceC0860Eh interfaceC0860Eh, long j10, boolean z10, long j11) throws AnonymousClass98 {
        H6.A04(this.A01 == 0);
        this.A03 = c07459h;
        this.A01 = 1;
        A16(z10);
        ADu(formatArr, interfaceC0860Eh, j11);
        A15(j10, z10);
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final InterfaceC07449g A5w() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public HM A6u() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final int A7U() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final InterfaceC0860Eh A7Z() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.W1, com.facebook.ads.redexgen.X.InterfaceC07449g
    public final int A7g() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07419d
    public void A7x(int i10, Object obj) throws AnonymousClass98 {
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final boolean A82() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final boolean A8M() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final void A9U() throws IOException {
        this.A04.A9R();
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final void ADu(Format[] formatArr, InterfaceC0860Eh interfaceC0860Eh, long j10) throws AnonymousClass98 {
        H6.A04(!this.A06);
        this.A04 = interfaceC0860Eh;
        this.A05 = false;
        this.A07 = formatArr;
        this.A02 = j10;
        A17(formatArr, j10);
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final void AE4(long j10) throws AnonymousClass98 {
        this.A06 = false;
        this.A05 = false;
        A15(j10, false);
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final void AEP() {
        this.A06 = true;
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final void AER(int i10) {
        this.A00 = i10;
    }

    public int AF0() throws AnonymousClass98 {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final void start() throws AnonymousClass98 {
        H6.A04(this.A01 == 1);
        this.A01 = 2;
        A13();
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final void stop() throws AnonymousClass98 {
        H6.A04(this.A01 == 2);
        this.A01 = 1;
        A14();
    }
}
