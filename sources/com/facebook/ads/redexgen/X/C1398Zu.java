package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.Zu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1398Zu {
    public static byte[] A0C;
    public static String[] A0D = {"YcCIPLCDTe1wGTKdO7xqYhpFwQzvmXtt", "FfIdHaSVTal814YVh5tJNVr21T0wsSAo", "HLDls6wic6LzndIKtUvgWnGJ4QMP07cO", "ccYpD8PuArRKO9YkPTuVfhIh5pDN1br2", "LFFD576NBTVByEN649EglQB81U0zBBuc", "sO5gz1O188I9hNkbLLxzl8j4JWiDgVKK", "Hord6YvHX1lmSPmhXyMRW660HCYjcXOm", "5HbQDpK1pfSpB47EOovGOWVGJlrw1BSl"};

    @Nullable
    public InterfaceC1402Zy A00;
    public boolean A01;
    public final Rect A02;
    public final Rect A03;
    public final Handler A04;
    public final InterfaceC1177Qw A05;
    public final InterfaceC1409a5 A06;
    public final C1400Zw A07;
    public final F9 A08;
    public final Runnable A09;
    public final List<Rect> A0A;
    public final List<View> A0B;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 73);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{-4, -5, -32, -16, -18, -5, -46, -5, -15};
    }

    static {
        A04();
    }

    public C1398Zu(InterfaceC1409a5 interfaceC1409a5, InterfaceC1177Qw interfaceC1177Qw, F9 f92, C1400Zw c1400Zw, Handler handler) {
        this(interfaceC1409a5, interfaceC1177Qw, f92, c1400Zw, handler, 100);
    }

    public C1398Zu(InterfaceC1409a5 interfaceC1409a5, InterfaceC1177Qw interfaceC1177Qw, F9 f92, C1400Zw c1400Zw, Handler handler, int i10) {
        this.A03 = new Rect();
        this.A02 = new Rect();
        this.A0B = new ArrayList();
        this.A0A = new ArrayList();
        this.A01 = false;
        this.A06 = interfaceC1409a5;
        this.A05 = interfaceC1177Qw;
        this.A08 = f92;
        this.A07 = c1400Zw;
        this.A04 = handler;
        this.A09 = new RunnableC1399Zv(this, i10);
    }

    private void A05(long j10) {
        if (this.A0B.isEmpty()) {
            this.A06.A7q(this.A0A);
            this.A08.A3q(j10, this.A0A);
            this.A08.A5D();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(long j10) {
        this.A06.A7q(this.A0A);
        this.A08.A3q(j10, this.A0A);
        if (this.A0B.isEmpty()) {
            this.A07.A03(this.A0B);
            Iterator<View> it = this.A0B.iterator();
            loop0: while (true) {
                if (it.hasNext()) {
                    View next = it.next();
                    C1407a3 A00 = this.A07.A00(next);
                    Iterator<Rect> it2 = this.A0A.iterator();
                    while (it2.hasNext()) {
                        if (C1391Zn.A00(next, this.A03, this.A02, it2.next()) && A00 != C1407a3.A06) {
                            F9 f92 = this.A08;
                            Rect containerRect = this.A03;
                            Rect rect = this.A02;
                            if (A0D[0].charAt(21) != 'h') {
                                break loop0;
                            }
                            A0D[6] = "BhrT0c14O8Thrmtg3HRzOfRcpCyh5HNl";
                            f92.A3J(A00, containerRect, rect);
                        }
                    }
                } else {
                    this.A08.A5D();
                    if (this.A00 != null) {
                        throw new NullPointerException(A03(0, 9, 68));
                    }
                    this.A0B.clear();
                    String[] strArr = A0D;
                    if (strArr[1].charAt(9) != strArr[3].charAt(9)) {
                        String[] strArr2 = A0D;
                        strArr2[1] = "lmQ3TWUKEycrXTOUs6diKoA3HcDn9Pdd";
                        strArr2[3] = "T2sieqBmgvCwHjMtYcExspPM2F3LyLlD";
                        return;
                    }
                }
            }
            throw new RuntimeException();
        }
        throw new IllegalStateException();
    }

    public final void A09() {
        if (this.A01) {
            this.A04.removeCallbacks(this.A09);
            A05(this.A05.A9d());
        }
        this.A01 = false;
    }

    public final void A0A() {
        if (!this.A01) {
            this.A01 = true;
            this.A04.post(this.A09);
        }
    }

    public final void A0B(@Nullable InterfaceC1404a0 interfaceC1404a0) {
        this.A08.AEc(interfaceC1404a0);
    }

    public final void A0C(@Nullable InterfaceC1402Zy interfaceC1402Zy) {
        this.A00 = interfaceC1402Zy;
    }
}
