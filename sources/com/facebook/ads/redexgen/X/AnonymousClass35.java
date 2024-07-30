package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.35, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass35 extends AbstractC0820Cr implements Handler.Callback {
    public static String[] A0B = {"03Bqi0KbTszfVpZRuJU3ds8C", "k1GP5ixeRS7AgIgDUeTgx", "4NCpljRKbMpI7nrSCbEL8iNDtCMdRKX", "14neR4MzrfGB8mqjKcaUOPf9qenZk", "2yEqk33zpOnAOPOYE0N2JJzqUjZjGZ3w", "pyvhSQAAYlr5mafzJ0Hik2RvaYh4S", "eoJA2AjfdFBVMgfGYGogvo8ECKzj9gDa", "xUrUxSkwRZIOD3qEvYK8t45D"};
    public int A00;
    public int A01;
    public D2 A02;
    public boolean A03;
    public final Handler A04;
    public final C9L A05;
    public final D4 A06;
    public final C9 A07;
    public final D5 A08;
    public final long[] A09;
    public final Metadata[] A0A;

    public AnonymousClass35(D5 d52, Looper looper) {
        this(d52, looper, D4.A00);
    }

    public AnonymousClass35(D5 d52, Looper looper, D4 d42) {
        super(4);
        this.A08 = (D5) H6.A01(d52);
        this.A04 = looper == null ? null : new Handler(looper, this);
        this.A06 = (D4) H6.A01(d42);
        this.A05 = new C9L();
        this.A07 = new C9();
        this.A0A = new Metadata[5];
        this.A09 = new long[5];
    }

    private void A00() {
        Arrays.fill(this.A0A, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
    }

    private void A01(Metadata metadata) {
        Handler handler = this.A04;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            A02(metadata);
        }
    }

    private void A02(Metadata metadata) {
        this.A08.ABS(metadata);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0820Cr
    public final void A12() {
        A00();
        this.A02 = null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0820Cr
    public final void A15(long j10, boolean z10) {
        A00();
        this.A03 = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0820Cr
    public final void A17(Format[] formatArr, long j10) throws AnonymousClass98 {
        this.A02 = this.A06.A4F(formatArr[0]);
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final boolean A8P() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final boolean A8Z() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final void ADs(long j10, long j11) throws AnonymousClass98 {
        if (!this.A03 && this.A00 < 5) {
            this.A07.A07();
            if (A10(this.A05, this.A07, false) == -4) {
                if (this.A07.A04()) {
                    this.A03 = true;
                } else if (!this.A07.A03()) {
                    C9 c92 = this.A07;
                    String[] strArr = A0B;
                    if (strArr[0].length() != strArr[7].length()) {
                        String[] strArr2 = A0B;
                        strArr2[6] = "oJNy7wvRq4TsnN4Ik7JOHneCelTjV3TM";
                        strArr2[4] = "4f5lGS7X1G5JYf6Usji5tJWLoKljCGYJ";
                        c92.A00 = this.A05.A00.A0G;
                        this.A07.A08();
                    } else {
                        String[] strArr3 = A0B;
                        strArr3[0] = "JrbxqibW71vJtGIxmKNzu0gc";
                        strArr3[7] = "aBslXCcOqyoFcXReLJb0k0eg";
                        c92.A00 = this.A05.A00.A0G;
                        this.A07.A08();
                    }
                    try {
                        int index = (this.A01 + this.A00) % 5;
                        this.A0A[index] = this.A02.A4h(this.A07);
                        this.A09[index] = ((C1294Vn) this.A07).A00;
                        this.A00++;
                    } catch (D3 e10) {
                        throw AnonymousClass98.A01(e10, A0y());
                    }
                }
            }
        }
        int index2 = this.A00;
        String[] strArr4 = A0B;
        if (strArr4[0].length() != strArr4[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr5 = A0B;
        strArr5[2] = "FI5ou6JhGKfNQASG6lr2Dh53KdKmMJ1";
        strArr5[1] = "8nK6Ac79BLzTFAHCrRK9v";
        if (index2 > 0) {
            long[] jArr = this.A09;
            int index3 = this.A01;
            if (jArr[index3] <= j10) {
                A01(this.A0A[index3]);
                Metadata[] metadataArr = this.A0A;
                int i10 = this.A01;
                metadataArr[i10] = null;
                this.A01 = (i10 + 1) % 5;
                this.A00--;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07449g
    public final int AEy(Format format) {
        if (this.A06.AEz(format)) {
            return AbstractC0820Cr.A0x(null, format.A0H) ? 4 : 2;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            A02((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
}
