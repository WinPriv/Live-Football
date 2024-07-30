package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

@SuppressLint({"HardcodedIPAddressUse"})
/* renamed from: com.facebook.ads.redexgen.X.Yb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1358Yb implements JV {
    public static byte[] A0D;
    public static String[] A0E = {"4yJhIog9RzpC9w4XHjq79o6hmz2pMXrt", "bLneqHgNlbzxjE", "P7gevZ65hMGDm5VmgpkLcWEi46YxYduR", "Pajg2XTKXpS0pN0AoGLcPnQoa2IWF6Z7", "YyJRdl3XxpBTstTmsw", "OvgbPt0JG7dlaj99kqPbJKVmb9CPKTVr", "21VbiQWRKHmC0d4xB3zoTsbqXtN2ZOxw", "Q3Y9mBD7X4l0uaedlY7FP5X0xCsXbtIX"};
    public static final Handler A0F;
    public static final C05350s A0G = null;

    @SuppressLint({"StaticFieldLeak"})
    public static final JW A0H = null;
    public static final String A0I;

    @Nullable
    public InterfaceC05300n A00;

    @Nullable
    public InterfaceC05300n A01;

    @Nullable
    public AnonymousClass83 A04;

    @Nullable
    public JT A05;

    @Nullable
    public AbstractC05310o A06;
    public final C05581p A07;
    public final IT A08;
    public final C05350s A09;
    public final JW A0A;
    public final C1316Wj A0B;
    public volatile boolean A0C;
    public long A03 = -1;

    @Nullable
    public String A02 = null;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{75, 110, 107, 122, 126, 111, 120, 42, 110, 101, 111, 121, 42, 100, 101, 126, 42, 111, 114, 99, 121, 126, 78, 107, 110, Ascii.DEL, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 96, 97, 47, 124, 123, 110, 125, 123, 78, 107, 54, Ascii.ETB, 88, Ascii.NAK, Ascii.ETB, 10, Ascii.GS, 88, Ascii.EM, Ascii.FS, 88, Ascii.ESC, Ascii.EM, Ascii.SYN, Ascii.FS, 17, Ascii.FS, Ascii.EM, Ascii.FF, Ascii.GS, Ascii.VT, 86, 59, Ascii.RS, 3, 2, Ascii.VT, 76, Ascii.CR, 8, Ascii.CR, Ascii.FS, Ascii.CAN, 9, Ascii.RS, 76, Ascii.CAN, Ascii.NAK, Ascii.FS, 9, 66, 110, 107, 47, 110, 99, 125, 106, 110, 107, 118, 47, 124, 123, 110, 125, 123, 106, 107, 42, 59, 34, 78, 89, 43, 46, 59, 46, 0, 45, 37, 42, 44, 59, 111, 38, 60, 111, 33, 58, 35, 35, 90, 81, 92, 77, 70, 79, 75, 90, 91, 96, 86, 91, 48, 59, 35, 60, 39, 58, 59, 56, 48, 59, 33, 117, 60, 38, 117, 48, 56, 37, 33, 44, Ascii.US, Ascii.VT, Ascii.FS, 8, Ascii.FF, Ascii.FS, Ascii.ETB, Ascii.SUB, 0, 38, Ascii.SUB, Ascii.CAN, 9, 9, Ascii.DLE, Ascii.ETB, Ascii.RS, 70, 65, 89, 78, 67, 70, 75, Ascii.SI, 95, 67, 78, 76, 74, 66, 74, 65, 91, Ascii.SI, 70, 65, Ascii.SI, 93, 74, 92, 95, 64, 65, 92, 74, 66, 65, 79, 74, 113, 90, 71, 67, 75, 113, 67, 93, 49, 38, 50, 54, 38, 48, 55, Ascii.FS, 42, 39};
    }

    public abstract void A0J();

    public abstract void A0L(InterfaceC05300n interfaceC05300n, AnonymousClass83 anonymousClass83, AnonymousClass81 anonymousClass81, C05591q c05591q);

    static {
        A07();
        LG.A02();
        A0I = AbstractC1358Yb.class.getSimpleName();
        A0F = new Handler(Looper.getMainLooper());
    }

    public AbstractC1358Yb(C1316Wj c1316Wj, C05581p c05581p) {
        this.A0B = c1316Wj;
        this.A07 = c05581p;
        JW jw = A0H;
        if (jw != null) {
            this.A0A = jw;
        } else {
            this.A0A = new JW(this.A0B);
        }
        this.A0A.A0P(this);
        C05350s c05350s = A0G;
        if (c05350s != null) {
            this.A09 = c05350s;
        } else {
            this.A09 = new C05350s();
        }
        DynamicLoaderFactory.makeLoader(this.A0B).getInitApi().onAdLoadInvoked(this.A0B);
        this.A08 = c1316Wj.A08();
        this.A0B.A0D().A4X();
    }

    private void A08(C1216Sj c1216Sj) {
        AnonymousClass83 placement = c1216Sj.A00();
        if (placement == null || placement.A05() == null) {
            String A06 = A06(179, 29, 39);
            J3 j32 = new J3(AdErrorType.NO_AD_PLACEMENT, A06);
            this.A0B.A0D().A4Z(j32.A03().getErrorCode(), A06);
            AbstractC05310o abstractC05310o = this.A06;
            if (abstractC05310o != null) {
                abstractC05310o.A0G(j32);
                return;
            }
            return;
        }
        this.A04 = placement;
        this.A00 = null;
        AnonymousClass83 anonymousClass83 = this.A04;
        AnonymousClass81 placementAd = anonymousClass83.A04();
        String A062 = A06(0, 0, 73);
        if (placementAd == null) {
            J3 A01 = J3.A01(AdErrorType.NO_FILL, A062);
            this.A0B.A0D().A4Z(A01.A03().getErrorCode(), A06(48, 22, 112));
            AbstractC05310o abstractC05310o2 = this.A06;
            if (abstractC05310o2 != null) {
                abstractC05310o2.A0G(A01);
                return;
            }
            return;
        }
        String A02 = placementAd.A02();
        InterfaceC05300n A00 = this.A09.A00(this.A0B, anonymousClass83.A05().A0D());
        if (A00 == null) {
            this.A0B.A06().A8u(A06(107, 3, 67), C06977l.A0a, new C06987m(A06(0, 22, 2), A02));
            AAc(J3.A00(AdErrorType.INTERNAL_ERROR));
            return;
        }
        if (this.A07.A00() != A00.A79()) {
            J3 A012 = J3.A01(AdErrorType.INTERNAL_ERROR, A062);
            this.A0B.A0D().A4Z(A012.A03().getErrorCode(), A06(70, 19, 100));
            AbstractC05310o abstractC05310o3 = this.A06;
            if (abstractC05310o3 != null) {
                abstractC05310o3.A0G(A012);
                return;
            }
            return;
        }
        this.A00 = A00;
        AnonymousClass84 A05 = anonymousClass83.A05();
        JSONObject A04 = placementAd.A04();
        if (A04 != null) {
            String optString = A04.optString(A06(220, 10, 75));
            this.A0B.A0D().AEZ(optString);
            this.A0B.A0B(optString);
            C1315Wi A002 = C7F.A00();
            if (A002 != null) {
                A002.A0B(optString);
            }
            A0A(A04.optJSONObject(A06(162, 17, 113)));
            C05591q c05591q = new C05591q(A04, A05, this.A07.A09, A05.A0C());
            if (this.A05 == null) {
                String A063 = A06(142, 20, 93);
                J3 A013 = J3.A01(AdErrorType.UNKNOWN_ERROR, A063);
                this.A0B.A0D().A4Z(A013.A03().getErrorCode(), A063);
                AbstractC05310o abstractC05310o4 = this.A06;
                if (abstractC05310o4 != null) {
                    abstractC05310o4.A0G(A013);
                    return;
                }
                return;
            }
            A0L(A00, anonymousClass83, placementAd, c05591q);
            if (A0E[6].charAt(21) == '6') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[4] = "m1l7KBFjFJZQKSNoNN";
            strArr[1] = "daOG7UEv1P6bC2";
            return;
        }
        String A064 = A06(112, 18, 71);
        J3 A014 = J3.A01(AdErrorType.UNKNOWN_ERROR, A064);
        this.A0B.A0D().A4Z(A014.A03().getErrorCode(), A064);
        AbstractC05310o abstractC05310o5 = this.A06;
        if (abstractC05310o5 != null) {
            abstractC05310o5.A0G(A014);
        }
    }

    private final void A09(@Nullable String str, @Nullable AdExperienceType adExperienceType) {
        this.A0B.A0D().A4a(str != null);
        this.A03 = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT < 17) {
            AAc(new J3(AdErrorType.API_NOT_SUPPORTED, A06(0, 0, 73)));
            return;
        }
        try {
            this.A05 = this.A07.A01(this.A0B, new JD(this.A0B, str, this.A07.A09, this.A07.A08), adExperienceType);
            if (A0E[6].charAt(21) == '6') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[4] = "3q2wB1pMY3UXfOrLgu";
            strArr[1] = "CsXqAZILgfX2KA";
            this.A0A.A0O(this.A05);
        } catch (J4 e10) {
            AAc(J3.A02(e10));
        }
    }

    private void A0A(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A02 = jSONObject.optString(A06(130, 12, 55));
            C05370u.A01(this.A0B).A0O(jSONObject);
        }
    }

    public final long A0B() {
        AnonymousClass83 anonymousClass83 = this.A04;
        if (anonymousClass83 != null) {
            return anonymousClass83.A03();
        }
        return -1L;
    }

    public final Handler A0C() {
        return A0F;
    }

    @Nullable
    public final AnonymousClass84 A0D() {
        AnonymousClass83 anonymousClass83 = this.A04;
        if (anonymousClass83 == null) {
            return null;
        }
        return anonymousClass83.A05();
    }

    @Nullable
    public final String A0E() {
        InterfaceC05300n interfaceC05300n = this.A01;
        if (interfaceC05300n == null) {
            return null;
        }
        return interfaceC05300n.A63();
    }

    public final void A0F() {
        String A63;
        this.A0B.A0D().A2e(L5.A01(this.A03));
        InterfaceC05300n interfaceC05300n = this.A01;
        if (interfaceC05300n == null || (A63 = interfaceC05300n.A63()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String A04 = L5.A04(this.A03);
        String clientToken = A06(208, 12, 38);
        hashMap.put(clientToken, A04);
        new C0954Ib(A63, this.A08).A02(EnumC0953Ia.A08, hashMap);
    }

    public final void A0G() {
        InterfaceC05300n interfaceC05300n = this.A01;
        String A06 = A06(107, 3, 67);
        if (interfaceC05300n == null) {
            String A062 = A06(22, 26, 7);
            this.A0B.A06().A8u(A06, C06977l.A0Q, new C06987m(A062));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0B.A0D().A4Z(adErrorType.getErrorCode(), A062);
            AbstractC05310o abstractC05310o = this.A06;
            if (abstractC05310o != null) {
                String errorMessage = adErrorType.getDefaultErrorMessage();
                abstractC05310o.A0G(J3.A01(adErrorType, errorMessage));
            }
            this.A0B.A0D().A4c();
            return;
        }
        if (this.A0C) {
            String A063 = A06(89, 18, 7);
            this.A0B.A06().A8u(A06, C06977l.A0M, new C06987m(A063));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0D().A4Z(adErrorType2.getErrorCode(), A063);
            AbstractC05310o abstractC05310o2 = this.A06;
            if (abstractC05310o2 != null) {
                String errorMessage2 = adErrorType2.getDefaultErrorMessage();
                abstractC05310o2.A0G(J3.A01(adErrorType2, errorMessage2));
            }
            this.A0B.A0D().A4b();
            return;
        }
        if (!TextUtils.isEmpty(this.A01.A63())) {
            this.A08.A9E(this.A01.A63());
        }
        this.A0B.A0D().A4d();
        this.A0C = true;
        A0J();
    }

    public final void A0H() {
        A0R(false);
    }

    public final void A0I() {
        if (this.A02 != null) {
            C05370u.A01(this.A0B).A0N(this.A02);
        }
    }

    public final void A0K(@Nullable InterfaceC05300n interfaceC05300n) {
        if (interfaceC05300n != null) {
            interfaceC05300n.onDestroy();
        }
    }

    public final void A0M(AbstractC05310o abstractC05310o) {
        this.A06 = abstractC05310o;
    }

    public final void A0N(C05591q c05591q) {
        this.A0B.A0D().A4W();
        String clientToken = c05591q.A03().optString(A06(110, 2, 37));
        if (!TextUtils.isEmpty(clientToken)) {
            C0954Ib funnelLoggingHandler = new C0954Ib(clientToken, this.A08);
            funnelLoggingHandler.A02(EnumC0953Ia.A04, null);
        }
    }

    public void A0O(@Nullable String str) {
        A09(str, null);
    }

    public final void A0P(@Nullable String str) {
        A0O(str);
    }

    public final void A0Q(@Nullable String str, @Nullable AdExperienceType adExperienceType) {
        A09(str, adExperienceType);
    }

    public void A0R(boolean z10) {
        if (!z10 && !this.A0C) {
            return;
        }
        this.A0B.A0D().A4e();
        A0K(this.A01);
        this.A0C = false;
    }

    public final boolean A0S() {
        AnonymousClass83 anonymousClass83 = this.A04;
        return anonymousClass83 == null || anonymousClass83.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.JV
    public final synchronized void AAc(J3 j32) {
        A0C().post(new C1359Yc(this, j32));
    }

    @Override // com.facebook.ads.redexgen.X.JV
    @SuppressLint({"CatchGeneralException"})
    public final synchronized void ACM(C1216Sj c1216Sj) {
        try {
            A08(c1216Sj);
        } catch (Exception e10) {
            this.A0B.A06().A8u(A06(107, 3, 67), C06977l.A0T, new C06987m(e10));
        }
    }
}
