package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.33, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass33 extends AbstractC0820Cr implements Handler.Callback {
    public static String[] A0D = {"fagSsoac43UJSJG", "PL0Df5XObPsMjoFT3sU6Lp83XbviyP8R", "k75ap2fxOZvkqr2FjEQ9d3Y", "qEZm9kPptvCV49j1bDgJYwonF92a", "8QH8MqTnW7KMzd9bL", "CjrIcpNXno9M2QOeMZvTD2WdktHrPs5P", "AfT76Pf2kDJi2th", "sZbuEqgSWLt9Albo4x4yfDH"};
    public int A00;
    public int A01;
    public Format A02;
    public UD A03;
    public C0774Al A04;
    public AbstractC0772Aj A05;
    public AbstractC0772Aj A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final C9L A0A;
    public final FM A0B;
    public final FN A0C;

    public AnonymousClass33(FN fn, Looper looper) {
        this(fn, looper, FM.A00);
    }

    public AnonymousClass33(FN fn, Looper looper, FM fm) {
        super(3);
        this.A0C = (FN) H6.A01(fn);
        this.A09 = looper == null ? null : new Handler(looper, this);
        this.A0B = fm;
        this.A0A = new C9L();
    }

    private long A00() {
        int i10 = this.A01;
        if (i10 == -1 || i10 >= this.A06.A6a()) {
            return Long.MAX_VALUE;
        }
        return this.A06.A6Z(this.A01);
    }

    private void A01() {
        A06(Collections.emptyList());
    }

    private void A02() {
        this.A04 = null;
        this.A01 = -1;
        AbstractC0772Aj abstractC0772Aj = this.A06;
        if (abstractC0772Aj != null) {
            abstractC0772Aj.A08();
            this.A06 = null;
        }
        AbstractC0772Aj abstractC0772Aj2 = this.A05;
        if (abstractC0772Aj2 != null) {
            abstractC0772Aj2.A08();
            this.A05 = null;
        }
    }

    private void A03() {
        A02();
        this.A03.ADf();
        this.A03 = null;
        this.A00 = 0;
    }

    private void A04() {
        A03();
        this.A03 = this.A0B.A4G(this.A02);
    }

    private void A05(List<FJ> list) {
        this.A0C.AAM(list);
    }

    private void A06(List<FJ> list) {
        Handler handler = this.A09;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            A05(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0820Cr
    public final void A12() {
        this.A02 = null;
        A01();
        A03();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0820Cr
    public final void A15(long j10, boolean z10) {
        A01();
        this.A07 = false;
        this.A08 = false;
        if (this.A00 != 0) {
            A04();
            return;
        }
        A02();
        UD ud = this.A03;
        String[] strArr = A0D;
        if (strArr[2].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A0D[1] = "SIdEizz9oP1X0InrrFd2Zym6xF4ie8Hi";
        ud.flush();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0820Cr
    public final void A17(Format[] formatArr, long j10) throws AnonymousClass98 {
        this.A02 = formatArr[0];
        if (this.A03 != null) {
            this.A00 = 1;
        } else {
            this.A03 = this.A0B.A4G(this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final boolean A8P() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.W1
    public final boolean A8Z() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        if (r6 == 2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
    
        A02();
        r9.A08 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b8, code lost:
    
        if (r6 == 2) goto L34;
     */
    @Override // com.facebook.ads.redexgen.X.W1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ADs(long r10, long r12) throws com.facebook.ads.redexgen.X.AnonymousClass98 {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass33.ADs(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07449g
    public final int AEy(Format format) {
        if (this.A0B.AEz(format)) {
            return AbstractC0820Cr.A0x(null, format.A0H) ? 4 : 2;
        }
        if (HO.A0A(format.A0O)) {
            return 1;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            A05((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
}
