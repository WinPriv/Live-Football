package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: assets/audience_network.dex */
public final class JW {
    public static byte[] A07;
    public static final LH A08;
    public static final Executor A09;
    public long A00;

    @Nullable
    public JV A01;

    @Nullable
    public Map<String, String> A02;
    public final C2D A03;
    public final C1316Wj A04;
    public final JX A05;
    public final String A06;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 80);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{57, 57, 110, 57, 51, 62, 111, 61, 122, 105, 107, 119, 117, 78, 65, 68, 72, 67, 89, 82, 95, 72, 92, 88, 72, 94, 89, 82, 68, 73, 98, 88, Ascii.VT, 121, 101, 17, Ascii.VT, 100, 101, 10, 108, 99, 102, 102, 10, 88, 79, 73, 79, 67, 92, 79, 78, Ascii.DC4, 53, 122, Ascii.FS, 51, 54, 54, 122, 63, 40, 40, 53, 40, 122, 57, 53, 62, 63, 122, 1, Ascii.DEL, 41, 7, 122, Ascii.DEL, 41, Ascii.SI, Ascii.CR, 6, Ascii.CR, Ascii.SUB, 1, Ascii.VT, 81, 90, 75, 72, 80, 77, 84, 40, 41, 0, 47, 42, 42, Ascii.SO, 41, 41, 45};
    }

    static {
        A0A();
        A08 = new LH();
        A09 = Executors.newCachedThreadPool(A08);
    }

    public JW(C1316Wj c1316Wj) {
        this(c1316Wj, C2E.A00(c1316Wj.A00()));
    }

    public JW(C1316Wj c1316Wj, C2D c2d) {
        this.A00 = -1L;
        this.A04 = c1316Wj;
        this.A05 = JX.A00();
        this.A06 = C0979Ja.A01(c1316Wj);
        this.A03 = c2d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC1144Pp A03(long j10, JT jt) {
        return new Sm(this, jt, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        C1316Wj c1316Wj = this.A04;
        if (c1316Wj == null || !Q6.A0A(c1316Wj)) {
            return;
        }
        C06987m c06987m = new C06987m(A05(8, 5, 107));
        c06987m.A03(1);
        this.A04.A06().A8u(A05(86, 7, 111), C06977l.A1w, c06987m);
    }

    private void A0B(int i10, String str) {
        String A05 = A05(93, 10, 22);
        JH.A05(A05, A05(37, 16, 122), A05(0, 8, 90));
        JH.A04(A05, String.format(Locale.US, A05(53, 26, 10), Integer.valueOf(i10), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(J3 j32) {
        JV jv = this.A01;
        if (jv != null) {
            jv.AAc(j32);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(J3 j32) {
        L8.A00(new C1217Sk(this, j32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(C1216Sj c1216Sj) {
        JV jv = this.A01;
        if (jv != null) {
            jv.ACM(c1216Sj);
        }
    }

    private void A0L(C1216Sj c1216Sj) {
        C7M syncModule;
        L8.A00(new C1218Sl(this, c1216Sj));
        if (ID.A1o(this.A04) && (syncModule = this.A04.A04()) != null) {
            syncModule.A5S();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(String str, long j10, JT jt) {
        String clientChallenge;
        try {
            try {
                JZ A06 = this.A05.A06(this.A04, str, j10);
                AnonymousClass83 A00 = A06.A00();
                if (A00 != null) {
                    ID.A0P(this.A04).A2E(A00.A08());
                    this.A04.A06().A9Q();
                    this.A03.A0N(A00.A06());
                    JS.A05(A00.A05().A0B(), jt);
                    LS.A01(this.A04, A09, A00);
                    C06987m c06987m = new C06987m(A05(30, 7, 123) + C1005Ke.A02());
                    c06987m.A04(1);
                    c06987m.A08(false);
                    this.A04.A06().A9K(A05(79, 7, 56), C06977l.A1W, c06987m);
                }
                int i10 = JU.A00[A06.A01().ordinal()];
                if (i10 == 1) {
                    C1216Sj c1216Sj = (C1216Sj) A06;
                    if (A00 != null) {
                        if (A00.A05().A0E()) {
                            JS.A07(str, jt);
                        }
                        if (this.A02 != null) {
                            clientChallenge = this.A02.get(A05(13, 17, 93));
                        } else {
                            clientChallenge = null;
                        }
                        if (!TextUtils.isEmpty(A06.A02()) && !TextUtils.isEmpty(clientChallenge)) {
                            this.A04.A01().AE2(this.A04, clientChallenge, A06.A02());
                        }
                    }
                    this.A04.A0D().A2k(L5.A01(this.A00));
                    A0L(c1216Sj);
                    return;
                }
                if (i10 != 2) {
                    AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                    this.A04.A0D().A2j(L5.A01(this.A00), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                    A0D(J3.A01(adErrorType, str));
                    return;
                }
                C1215Si c1215Si = (C1215Si) A06;
                String A04 = c1215Si.A04();
                AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c1215Si.A03(), AdErrorType.ERROR_MESSAGE);
                A0B(c1215Si.A03(), A04);
                if (A04 == null) {
                    A04 = str;
                }
                this.A04.A0D().A2j(L5.A01(this.A00), adErrorTypeFromCode.getErrorCode(), A04, adErrorTypeFromCode.isPublicError());
                A0D(J3.A01(adErrorTypeFromCode, A04));
            } catch (Exception e10) {
                e = e10;
                String message = e.getMessage();
                AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
                this.A04.A0D().A2j(L5.A01(this.A00), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
                A0D(J3.A01(adErrorType2, message));
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(String str, long j10, JT jt) {
        A09.execute(new C1219Sn(this, str, j10, jt));
    }

    public final void A0O(JT jt) {
        this.A00 = System.currentTimeMillis();
        C07067u.A0B(this.A04);
        if (JS.A08(jt)) {
            LJ.A06.execute(new C1221Sp(this));
            String A02 = JS.A02(jt);
            if (A02 != null) {
                this.A04.A0D().AFB();
                A0N(A02, 0L, jt);
                return;
            } else {
                AdErrorType adErrorType = AdErrorType.LOAD_TOO_FREQUENTLY;
                this.A04.A0D().A2j(L5.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage(), adErrorType.isPublicError());
                A0D(J3.A01(adErrorType, null));
                return;
            }
        }
        A09.execute(new C1220So(this, jt));
    }

    public final void A0P(JV jv) {
        this.A01 = jv;
    }
}
