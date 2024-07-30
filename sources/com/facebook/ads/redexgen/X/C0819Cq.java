package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.anythink.expressad.d.a.b;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.ads.redexgen.X.Cq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0819Cq implements W2 {
    public static byte[] A0M;
    public static String[] A0N = {"FdQu0fmyjo2y", "53g7H5tUmq98heWq", "c", "OWB4F6Jbct6Ly4JY", "NHyc4CVBcI41", "VuRuzyUBfoaB1KqcrIY9ro", b.dH, "Ea4pNsdJDJP"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;

    @Nullable
    public AnonymousClass98 A05;
    public C9S A06;
    public C9T A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final Handler A0D;
    public final C0818Cp A0E;
    public final C07489l A0F;
    public final C07499m A0G;
    public final GF A0H;
    public final GG A0I;
    public final ArrayDeque<C9C> A0J;
    public final CopyOnWriteArraySet<C9W> A0K;
    public final W1[] A0L;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0M, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0N[7].length() == 1) {
                throw new RuntimeException();
            }
            A0N[7] = "NVWBbKH";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 75);
            i13++;
        }
    }

    public static void A03() {
        A0M = new byte[]{108, Ascii.ETB, 126, 67, 84, 107, 87, 90, 66, 94, 73, 114, 86, 75, 87, 64, 125, 106, 85, 105, 100, 124, 96, 119, 73, 108, 103, 42, 55, 43, 61, 43, 49, 54, 17, Ascii.SYN, Ascii.VT, 95, Ascii.ESC, 44, 37, 44, 40, 58, 44, 105, 64, 72, 53, 78, 50, 36, 36, 42, Ascii.NAK, 46, 97, 40, 38, 47, 46, 51, 36, 37, 97, 35, 36, 34, 32, 52, 50, 36, 97, 32, 47, 97, 32, 37, 97, 40, 50, 97, 49, 45, 32, 56, 40, 47, 38};
    }

    static {
        A03();
    }

    @SuppressLint({"HandlerLeak"})
    public C0819Cq(W1[] w1Arr, GF gf, C9N c9n, H9 h92) {
        Log.i(A02(2, 13, 112), A02(33, 5, 52) + Integer.toHexString(System.identityHashCode(this)) + A02(0, 2, 7) + A02(15, 18, 78) + A02(47, 3, 94) + C0940Hl.A04 + A02(46, 1, 86));
        H6.A04(w1Arr.length > 0);
        this.A0L = (W1[]) H6.A01(w1Arr);
        this.A0H = (GF) H6.A01(gf);
        this.A0A = false;
        this.A03 = 0;
        this.A0B = false;
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0I = new GG(new C07459h[w1Arr.length], new GC[w1Arr.length], null);
        this.A0G = new C07499m();
        this.A0F = new C07489l();
        this.A07 = C9T.A04;
        final Looper myLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
        this.A0C = new Handler(myLooper) { // from class: com.facebook.ads.redexgen.X.9B
            @Override // android.os.Handler
            public final void handleMessage(Message msg) {
                if (C0990Jm.A02(this)) {
                    return;
                }
                try {
                    C0819Cq.this.A0A(msg);
                } catch (Throwable th) {
                    C0990Jm.A00(th, this);
                }
            }
        };
        this.A06 = new C9S(AbstractC07509n.A01, 0L, TrackGroupArray.A04, this.A0I);
        this.A0J = new ArrayDeque<>();
        this.A0E = new C0818Cp(w1Arr, gf, this.A0I, c9n, this.A0A, this.A03, this.A0B, this.A0C, this, h92);
        this.A0D = new Handler(this.A0E.A0w());
    }

    private long A00(long j10) {
        long A01 = AnonymousClass92.A01(j10);
        if (!this.A06.A04.A01()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            long positionMs = this.A0F.A08();
            return A01 + positionMs;
        }
        return A01;
    }

    private C9S A01(boolean z10, boolean z11, int i10) {
        if (z10) {
            this.A01 = 0;
            this.A00 = 0;
            this.A04 = 0L;
        } else {
            this.A01 = A6G();
            this.A00 = A07();
            this.A04 = A6D();
        }
        C9S c9s = new C9S(z11 ? AbstractC07509n.A01 : this.A06.A03, z11 ? null : this.A06.A07, this.A06.A04, this.A06.A02, this.A06.A01, i10, false, z11 ? TrackGroupArray.A04 : this.A06.A05, z11 ? this.A0I : this.A06.A06);
        String[] strArr = A0N;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        A0N[7] = "Xqr2ExcYOBi8j1Q";
        return c9s;
    }

    private void A04(C9S c9s, int i10, boolean z10, int i11) {
        int i12;
        C9S c9s2 = c9s;
        this.A02 -= i10;
        if (this.A02 == 0) {
            if (c9s2.A02 == com.anythink.expressad.exoplayer.b.f7291b) {
                c9s2 = c9s2.A04(c9s2.A04, 0L, c9s2.A01);
            }
            if (!this.A06.A03.A0E() || this.A08) {
                AbstractC07509n abstractC07509n = c9s2.A03;
                String[] strArr = A0N;
                if (strArr[1].length() == strArr[3].length()) {
                    A0N[7] = "oGDG41JiAsT7PCq0";
                    if (abstractC07509n.A0E()) {
                        this.A00 = 0;
                        this.A01 = 0;
                        String[] strArr2 = A0N;
                        if (strArr2[6].length() == strArr2[2].length()) {
                            String[] strArr3 = A0N;
                            strArr3[1] = "vrOcQin3pszluGLq";
                            strArr3[3] = "REI4M31lEJcbEC2a";
                            this.A04 = 0L;
                        }
                    }
                }
                throw new RuntimeException();
            }
            if (this.A08) {
                i12 = 0;
            } else {
                i12 = 2;
            }
            boolean z11 = this.A09;
            this.A08 = false;
            this.A09 = false;
            A05(c9s2, z10, i11, i12, z11, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A05(final C9S c9s, final boolean z10, final int i10, final int i11, final boolean z11, final boolean z12) {
        boolean isRunningRecursiveListenerNotification = !this.A0J.isEmpty();
        ArrayDeque<C9C> arrayDeque = this.A0J;
        final C9S c9s2 = this.A06;
        final CopyOnWriteArraySet<C9W> copyOnWriteArraySet = this.A0K;
        final GF gf = this.A0H;
        final boolean z13 = this.A0A;
        arrayDeque.addLast(new Object(c9s, c9s2, copyOnWriteArraySet, gf, z10, i10, i11, z11, z13, z12) { // from class: com.facebook.ads.redexgen.X.9C
            public static String[] A0C = {"WV1wdoH9jrQVDigahBrbrXyjnekpmiiE", "mIVo7Cnr72P7RKesjBWLJYV7ajvYF70D", "pH5vi4Kbi5SdF2Ft8jCp0yyfmrwCNJ93", "VAiIhwzGtJV", "mutijWrtbdTsRUOKFhZTpXzdiINxdKbV", "iAqM", "YM6GPYhzTMlO14HNxrpVvdDRlTI", "SmN7PcN3RYN"};
            public final int A00;
            public final int A01;
            public final C9S A02;
            public final GF A03;
            public final Set<C9W> A04;
            public final boolean A05;
            public final boolean A06;
            public final boolean A07;
            public final boolean A08;
            public final boolean A09;
            public final boolean A0A;
            public final boolean A0B;

            {
                this.A02 = c9s;
                this.A04 = copyOnWriteArraySet;
                this.A03 = gf;
                this.A08 = z10;
                this.A00 = i10;
                this.A01 = i11;
                this.A09 = z11;
                this.A06 = z13;
                this.A07 = z12 || c9s2.A00 != c9s.A00;
                this.A0A = (c9s2.A03 == c9s.A03 && c9s2.A07 == c9s.A07) ? false : true;
                this.A05 = c9s2.A08 != c9s.A08;
                this.A0B = c9s2.A06 != c9s.A06;
            }

            public final void A00() {
                if (this.A0A || this.A01 == 0) {
                    Iterator<C9W> it = this.A04.iterator();
                    while (it.hasNext()) {
                        it.next().ACQ(this.A02.A03, this.A02.A07, this.A01);
                    }
                }
                boolean z14 = this.A08;
                String[] strArr = A0C;
                if (strArr[1].charAt(12) == strArr[4].charAt(12)) {
                    String[] strArr2 = A0C;
                    strArr2[3] = "CSJCqnrxZvV";
                    strArr2[7] = "Hkj5q7ot6VH";
                    if (z14) {
                        Iterator<C9W> it2 = this.A04.iterator();
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            String[] strArr3 = A0C;
                            if (strArr3[0].charAt(22) == strArr3[2].charAt(22)) {
                                String[] strArr4 = A0C;
                                strArr4[1] = "CqJcwx9zuxyuReRUn3Ztwbm9rESV0hnU";
                                strArr4[4] = "BsXcrNWYLVI0RgolRvCIuekTJNQNO1r0";
                                if (!hasNext) {
                                    break;
                                }
                                C9W listener = it2.next();
                                listener.ABo(this.A00);
                            } else {
                                if (!hasNext) {
                                    break;
                                }
                                C9W listener2 = it2.next();
                                listener2.ABo(this.A00);
                            }
                        }
                    }
                    if (this.A0B) {
                        this.A03.A0U(this.A02.A06.A02);
                        Iterator<C9W> it3 = this.A04.iterator();
                        while (it3.hasNext()) {
                            it3.next().ACS(this.A02.A05, this.A02.A06.A01);
                        }
                    }
                    boolean z15 = this.A05;
                    String[] strArr5 = A0C;
                    if (strArr5[1].charAt(12) == strArr5[4].charAt(12)) {
                        String[] strArr6 = A0C;
                        strArr6[6] = "ZmCtUBpIkW4VOgBlZsMYRrBehzT";
                        strArr6[5] = "Qd2F";
                        if (z15) {
                            for (C9W listener3 : this.A04) {
                                listener3.ABH(this.A02.A08);
                            }
                        }
                        if (this.A07) {
                            Iterator<C9W> it4 = this.A04.iterator();
                            while (it4.hasNext()) {
                                it4.next().ABm(this.A06, this.A02.A00);
                            }
                        }
                        if (this.A09) {
                            Iterator<C9W> it5 = this.A04.iterator();
                            while (it5.hasNext()) {
                                it5.next().ACB();
                            }
                            return;
                        }
                        return;
                    }
                }
                throw new RuntimeException();
            }
        });
        this.A06 = c9s;
        if (isRunningRecursiveListenerNotification) {
            return;
        }
        while (!this.A0J.isEmpty()) {
            this.A0J.peekFirst().A00();
            this.A0J.removeFirst();
        }
    }

    private boolean A06() {
        return this.A06.A03.A0E() || this.A02 > 0;
    }

    public final int A07() {
        if (A06()) {
            return this.A00;
        }
        return this.A06.A04.A02;
    }

    public final void A08(int i10) {
        A09(i10, com.anythink.expressad.exoplayer.b.f7291b);
    }

    public final void A09(int i10, long j10) {
        long A00;
        AbstractC07509n abstractC07509n = this.A06.A03;
        if (i10 >= 0) {
            boolean A0E = abstractC07509n.A0E();
            if (A0N[5].length() == 22) {
                String[] strArr = A0N;
                strArr[6] = "k";
                strArr[2] = "F";
                if (A0E || i10 < abstractC07509n.A01()) {
                    this.A09 = true;
                    this.A02++;
                    boolean A0B = A0B();
                    if (A0N[7].length() != 1) {
                        String[] strArr2 = A0N;
                        strArr2[1] = "iOLxdGxzjtj8VTTv";
                        strArr2[3] = "k2rTYfByBhCiNj1b";
                        if (A0B) {
                            String A02 = A02(2, 13, 112);
                            String[] strArr3 = A0N;
                            if (strArr3[4].length() == strArr3[0].length()) {
                                A0N[7] = "fs0FIhTd6T569fWM98lB5KOUS";
                                Log.w(A02, A02(50, 39, 10));
                                this.A0C.obtainMessage(0, 1, -1, this.A06).sendToTarget();
                                return;
                            }
                        } else {
                            this.A01 = i10;
                            if (!abstractC07509n.A0E()) {
                                if (j10 == com.anythink.expressad.exoplayer.b.f7291b) {
                                    A00 = abstractC07509n.A0B(i10, this.A0G).A01();
                                } else {
                                    A00 = AnonymousClass92.A00(j10);
                                }
                                Pair<Integer, Long> A07 = abstractC07509n.A07(this.A0G, this.A0F, i10, A00);
                                this.A04 = AnonymousClass92.A01(A00);
                                this.A00 = ((Integer) A07.first).intValue();
                            } else {
                                if (A0N[7].length() == 1) {
                                    throw new RuntimeException();
                                }
                                A0N[5] = "dOqGbPzaS7jKfyvdUFqkQf";
                                this.A04 = j10 == com.anythink.expressad.exoplayer.b.f7291b ? 0L : j10;
                                this.A00 = 0;
                            }
                            this.A0E.A0y(abstractC07509n, i10, AnonymousClass92.A00(j10));
                            Iterator<C9W> it = this.A0K.iterator();
                            while (it.hasNext()) {
                                C9W next = it.next();
                                String[] strArr4 = A0N;
                                if (strArr4[4].length() != strArr4[0].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr5 = A0N;
                                strArr5[1] = "l5NWk5x9vooO50uu";
                                strArr5[3] = "FcAzQ8glamB386Jq";
                                next.ABo(1);
                            }
                            return;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        throw new C9M(abstractC07509n, i10, j10);
    }

    public final void A0A(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            A04((C9S) message.obj, message.arg1, message.arg2 != -1, message.arg2);
            return;
        }
        if (i10 != 1) {
            String[] strArr = A0N;
            if (strArr[4].length() == strArr[0].length()) {
                A0N[5] = "7KT5lT3IIkvardi0cOE285";
                if (i10 == 2) {
                    AnonymousClass98 anonymousClass98 = (AnonymousClass98) message.obj;
                    this.A05 = anonymousClass98;
                    Iterator<C9W> it = this.A0K.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        String[] strArr2 = A0N;
                        if (strArr2[4].length() != strArr2[0].length()) {
                            throw new RuntimeException();
                        }
                        A0N[7] = "lr70Wm3MPuK1";
                        if (hasNext) {
                            it.next().ABk(anonymousClass98);
                        } else {
                            return;
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } else {
            C9T c9t = (C9T) message.obj;
            C9T playbackParameters = this.A07;
            if (!playbackParameters.equals(c9t)) {
                this.A07 = c9t;
                CopyOnWriteArraySet<C9W> copyOnWriteArraySet = this.A0K;
                String[] strArr3 = A0N;
                if (strArr3[6].length() == strArr3[2].length()) {
                    String[] strArr4 = A0N;
                    strArr4[1] = "XPkhdR3hZ8JGZkbg";
                    strArr4[3] = "HitM1md97HqEAHyx";
                    Iterator<C9W> it2 = copyOnWriteArraySet.iterator();
                    while (it2.hasNext()) {
                        it2.next().ABi(c9t);
                    }
                    return;
                }
            } else {
                return;
            }
        }
        throw new RuntimeException();
    }

    public final boolean A0B() {
        return !A06() && this.A06.A04.A01();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07399b
    public final void A3E(C9W c9w) {
        this.A0K.add(c9w);
    }

    @Override // com.facebook.ads.redexgen.X.W2
    public final C07429e A4L(InterfaceC07419d interfaceC07419d) {
        return new C07429e(this.A0E, interfaceC07419d, this.A06.A03, A6G(), this.A0D);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07399b
    public final int A5p() {
        long A5q = A5q();
        long A6P = A6P();
        if (A5q != com.anythink.expressad.exoplayer.b.f7291b) {
            String[] strArr = A0N;
            if (strArr[6].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0N;
            strArr2[6] = "7";
            strArr2[2] = "n";
            if (A6P != com.anythink.expressad.exoplayer.b.f7291b) {
                String[] strArr3 = A0N;
                if (strArr3[4].length() != strArr3[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0N;
                strArr4[6] = "w";
                strArr4[2] = "D";
                if (A6P == 0) {
                    return 100;
                }
                return C0940Hl.A06((int) ((100 * A5q) / A6P), 0, 100);
            }
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07399b
    public final long A5q() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A09);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07399b
    public final long A68() {
        if (A0B()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            return this.A0F.A08() + AnonymousClass92.A01(this.A06.A01);
        }
        return A6D();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07399b
    public final int A6A() {
        if (A0B()) {
            return this.A06.A04.A00;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07399b
    public final int A6B() {
        if (A0B()) {
            return this.A06.A04.A01;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07399b
    public final long A6D() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A0A);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07399b
    public final AbstractC07509n A6F() {
        return this.A06.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07399b
    public final int A6G() {
        if (A06()) {
            return this.A01;
        }
        return this.A06.A03.A09(this.A06.A04.A02, this.A0F).A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07399b
    public final long A6P() {
        AbstractC07509n abstractC07509n = this.A06.A03;
        if (abstractC07509n.A0E()) {
            return com.anythink.expressad.exoplayer.b.f7291b;
        }
        if (A0B()) {
            EK ek = this.A06.A04;
            abstractC07509n.A09(ek.A02, this.A0F);
            return AnonymousClass92.A01(this.A0F.A0A(ek.A00, ek.A01));
        }
        return abstractC07509n.A0B(A6G(), this.A0G).A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07399b
    public final boolean A7B() {
        return this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.W2
    public final void ADA(EM em, boolean z10, boolean z11) {
        this.A05 = null;
        C9S A01 = A01(z10, z11, 2);
        this.A08 = true;
        this.A02++;
        this.A0E.A0z(em, z10, z11);
        A05(A01, false, 4, 1, false, false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07399b
    public final void ADf() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A02(38, 8, 2));
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(A02(0, 2, 7));
        sb2.append(A02(15, 18, 78));
        String A02 = A02(47, 3, 94);
        sb2.append(A02);
        sb2.append(C0940Hl.A04);
        sb2.append(A02);
        sb2.append(C9I.A00());
        sb2.append(A02(46, 1, 86));
        Log.i(A02(2, 13, 112), sb2.toString());
        this.A0E.A0x();
        this.A0C.removeCallbacksAndMessages(null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07399b
    public final void AEF(long j10) {
        A09(A6G(), j10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07399b
    public final void AEG() {
        A08(A6G());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07399b
    public final void AEW(boolean z10) {
        if (this.A0A != z10) {
            this.A0A = z10;
            this.A0E.A10(z10);
            A05(this.A06, false, 4, 1, false, true);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC07399b
    public final void AEv(boolean z10) {
        if (z10) {
            this.A05 = null;
        }
        C9S A01 = A01(z10, z10, 1);
        this.A02++;
        this.A0E.A11(z10);
        A05(A01, false, 4, 1, false, false);
    }
}
