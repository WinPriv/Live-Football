package com.facebook.ads.redexgen.X;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: com.facebook.ads.redexgen.X.Ab, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0764Ab implements UD {
    public static String[] A06 = {"xrToQ1M30eypgaiDt2KcbeXQSJmH4zEy", "FOMm0GJvPogulFgRKU73d9QQGInBRxBZ", "DAifx7fz7Oznb", "tEspMkbIuGZVzgapMfnbK02RMeMH6P5b", "hnmT", "jbKY175w2AZdEkpyONR9SNFucMTvW6Vd", "vt70xpgsPpIXmuxmiV", "wsDuhCL"};
    public long A00;
    public long A01;
    public AnonymousClass30 A02;
    public final ArrayDeque<AnonymousClass30> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC0772Aj> A04;
    public final PriorityQueue<AnonymousClass30> A05;

    public abstract FK A0L();

    public abstract void A0P(C0774Al c0774Al);

    public abstract boolean A0R();

    public AbstractC0764Ab() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.A03.add(new AnonymousClass30());
        }
        this.A04 = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.A04.add(new C05932z(this));
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0K(AnonymousClass30 anonymousClass30) {
        anonymousClass30.A07();
        this.A03.add(anonymousClass30);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0770Ah
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public C0774Al A4k() throws FL {
        H6.A04(this.A02 == null);
        if (this.A03.isEmpty()) {
            return null;
        }
        this.A02 = this.A03.pollFirst();
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0770Ah
    /* renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public AbstractC0772Aj A4l() throws FL {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (!this.A05.isEmpty() && ((C1294Vn) this.A05.peek()).A00 <= this.A00) {
            AnonymousClass30 poll = this.A05.poll();
            if (poll.A04()) {
                AbstractC0772Aj pollFirst = this.A04.pollFirst();
                pollFirst.A00(4);
                if (A06[6].length() != 18) {
                    throw new RuntimeException();
                }
                A06[4] = "hAEA";
                A0K(poll);
                return pollFirst;
            }
            A0P(poll);
            if (A0R()) {
                FK A0L = A0L();
                if (!poll.A03()) {
                    AbstractC0772Aj pollFirst2 = this.A04.pollFirst();
                    pollFirst2.A09(((C1294Vn) poll).A00, A0L, Long.MAX_VALUE);
                    A0K(poll);
                    return pollFirst2;
                }
            }
            A0K(poll);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0770Ah
    /* renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public void ADP(C0774Al c0774Al) throws FL {
        H6.A03(c0774Al == this.A02);
        if (c0774Al.A03()) {
            AnonymousClass30 anonymousClass30 = this.A02;
            String[] strArr = A06;
            if (strArr[5].charAt(10) != strArr[3].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[5] = "0mhI93daunZi59PwiuGO0KbLyKVCPwQH";
            strArr2[3] = "r2E3xZENv7Zr1SQt92aJBQoSxSc5nrbU";
            A0K(anonymousClass30);
        } else {
            AnonymousClass30 anonymousClass302 = this.A02;
            long j10 = this.A01;
            this.A01 = 1 + j10;
            anonymousClass302.A00 = j10;
            this.A05.add(this.A02);
        }
        this.A02 = null;
    }

    public final void A0Q(AbstractC0772Aj abstractC0772Aj) {
        abstractC0772Aj.A07();
        this.A04.add(abstractC0772Aj);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0770Ah
    public void ADf() {
    }

    @Override // com.facebook.ads.redexgen.X.UD
    public void AEY(long j10) {
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0770Ah
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0K(this.A05.poll());
        }
        AnonymousClass30 anonymousClass30 = this.A02;
        if (anonymousClass30 != null) {
            A0K(anonymousClass30);
            this.A02 = null;
        }
    }
}
