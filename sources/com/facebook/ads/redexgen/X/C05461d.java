package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1d, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05461d {
    public static byte[] A05;
    public static String[] A06 = {"jJreqFAWfQsm2UlBXjWleQZy51A8w9r3", "B5vxrqY9e1pfFDILbPSJEQZe5Zep9JAF", "7hwRhDIA2xM98ucsNVPICP0872", "8yYdfjKxcW1uK5E8nS4F9bT", "cwoTvwLLOWGZrFwonmn2qn9xu", "wuc4L", "VoE60CbUCih", "1JGxuEjawtyxaKItdz1AQ1lnM"};

    @Nullable
    public C6G A00;
    public N3 A01 = N3.A06;

    @Nullable
    @DoNotStrip
    public C1099Nw A02;
    public final C1375Ys A03;
    public final InterfaceC05451c A04;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A05 = new byte[]{-97, -39, -27, -34, -35, -81, -44, -38, -53, -40, -44, -57, -46, -122, -85, -40, -40, -43, -40, -122, -104, -106, -106, -100, -122, -35, -49, -38, -50, -43, -37, -38, -122, -57, -122, -36, -57, -46, -49, -54, -122, -89, -54, -81, -44, -52, -43, -108, Ascii.US, 34, Ascii.GS, 34, Ascii.US, 50, Ascii.US, Ascii.GS, 32, 51, 44, 34, 42, 35, -45, -30, -37, -53, -48, -42, -57, -44, -43, -42, -53, -42, -53, -61, -50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A09(C1316Wj c1316Wj, EnumSet<CacheFlag> enumSet) {
        boolean A0r = this.A03.A0r();
        C6G A04 = A04(c1316Wj);
        A04.A0d(new C0954Ib(this.A03.A0U(), c1316Wj.A08()));
        boolean z10 = ID.A1W(c1316Wj) && C06505g.A0A(this.A03.A0d());
        if (z10) {
            new C06505g(A04, this.A03.A0d(), this.A03.A0Y(), this.A03.A0Z(), z10, new C1369Ym(this, c1316Wj, A0r)).A0B();
            return;
        }
        String A062 = A06(65, 12, 2);
        if (A0r) {
            C6C c6c = new C6C(this.A03.A0V(), this.A03.A0Z(), A062);
            c6c.A04 = true;
            c6c.A03 = A06(0, 5, 17);
            A04.A0X(c6c);
        }
        A04.A0c(new C6E(this.A03.A0R().A01(), OL.A04, OL.A04, this.A03.A0Z(), A06(65, 12, 2)));
        boolean contains = enumSet.contains(CacheFlag.VIDEO);
        int i10 = 0;
        boolean A29 = ID.A29(c1316Wj, PS.A03());
        for (C1B c1b : this.A03.A0c()) {
            C6E c6e = new C6E(c1b.A0D().A07(), C05521j.A00(c1b.A0D()), C05521j.A01(c1b.A0D()), this.A03.A0Z(), A06(65, 12, 2));
            if (i10 == 0) {
                A04.A0b(c6e);
            } else {
                A04.A0c(c6e);
            }
            Iterator<String> it = c1b.A0G().A00().iterator();
            while (it.hasNext()) {
                A04.A0c(new C6E(it.next(), -1, -1, this.A03.A0Z(), A06(65, 12, 2)));
            }
            if (contains && !TextUtils.isEmpty(c1b.A0D().A08())) {
                C6C c6c2 = new C6C(c1b.A0D().A08(), this.A03.A0Z(), A06(65, 12, 2), c1b.A0D().A05());
                c6c2.A04 = false;
                if (i10 == 0) {
                    if (!A0r || A29) {
                        A04.A0a(c6c2);
                    } else {
                        A04.A0X(c6c2);
                    }
                } else if (!A0r || A29) {
                    A04.A0Z(c6c2);
                } else {
                    A04.A0Y(c6c2);
                }
            }
            i10++;
        }
        A04.A0W(new C1367Yk(this, c1316Wj, A0r), new AnonymousClass69(this.A03.A0Z(), A062));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A0H(C1316Wj c1316Wj, EnumSet<CacheFlag> enumSet) {
        AdError A00 = A00(c1316Wj);
        if (A00 != null) {
            this.A04.A9o(A00);
            return;
        }
        this.A04.ADc();
        if (A0C() == EnumC0981Jc.A09) {
            A08(c1316Wj);
        } else {
            A09(c1316Wj, enumSet);
        }
    }

    static {
        A07();
    }

    public C05461d(C1316Wj c1316Wj, C05591q c05591q, InterfaceC05451c interfaceC05451c, @Nullable String str) {
        JSONObject dataObject = c05591q.A03();
        this.A03 = A02(c1316Wj, c05591q, str, dataObject);
        this.A04 = interfaceC05451c;
    }

    @Nullable
    private AdError A00(C1316Wj c1316Wj) {
        if (this.A03.A0c().isEmpty()) {
            c1316Wj.A06().A8u(A06(62, 3, 18), C06977l.A0Z, new C06987m(A06(5, 43, 6)));
            return AdError.internalError(2006);
        }
        return null;
    }

    public static C1375Ys A02(C1316Wj c1316Wj, C05591q c05591q, @Nullable String str, JSONObject jSONObject) {
        C1375Ys A01 = C1375Ys.A01(jSONObject, c1316Wj);
        A01.A0i(str);
        AnonymousClass84 A012 = c05591q.A01();
        if (A012 != null) {
            A01.A0e(A012.A06());
        }
        return A01;
    }

    private C6G A04(C1316Wj c1316Wj) {
        C6G c6g = this.A00;
        return c6g != null ? c6g : new C6G(c1316Wj);
    }

    private void A08(C1316Wj c1316Wj) {
        C1W playableData = this.A03.A0O().A0D().A06();
        A0A(playableData != null ? playableData.A0A() : N3.A06);
        C1366Yj c1366Yj = new C1366Yj(this);
        C6G c6g = new C6G(c1316Wj);
        boolean z10 = ID.A1W(c1316Wj) && C06505g.A0A(this.A03.A0d());
        String[] strArr = A06;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[6] = "rsw451NGt86";
        strArr2[2] = "Yd4DtCWl7E1Fg10XBidxjBNo2K";
        if (z10) {
            C06505g c06505g = new C06505g(c6g, this.A03.A0d(), this.A03.A0Y(), this.A03.A0Z(), z10, new C1365Yi(this));
            c6g.A0d(new C0954Ib(this.A03.A0U(), c1316Wj.A08()));
            c06505g.A0B();
            return;
        }
        C1375Ys c1375Ys = this.A03;
        String[] strArr3 = A06;
        if (strArr3[1].charAt(24) != strArr3[0].charAt(24)) {
            C05561n.A02(c1316Wj, c1375Ys, true, c1366Yj);
            return;
        }
        String[] strArr4 = A06;
        strArr4[6] = "NvwaqOE8NtZ";
        strArr4[2] = "Mi75BUZiVIPk9FHJPOQQgiG4jh";
        C05561n.A02(c1316Wj, c1375Ys, true, c1366Yj);
    }

    private void A0A(N3 n32) {
        this.A01 = n32;
    }

    public final AnonymousClass18 A0B() {
        return this.A03;
    }

    public final EnumC0981Jc A0C() {
        if (this.A03.A0r()) {
            return EnumC0981Jc.A03;
        }
        int size = this.A03.A0c().size();
        String[] strArr = A06;
        if (strArr[6].length() != strArr[2].length()) {
            A06[3] = "f4kXngrP8CD5dz";
            if (size > 1) {
                return EnumC0981Jc.A07;
            }
            if (this.A03.A0O().A0D().A06() != null) {
                EnumC0981Jc enumC0981Jc = EnumC0981Jc.A09;
                String[] strArr2 = A06;
                if (strArr2[7].length() == strArr2[4].length()) {
                    A06[3] = "ny";
                    return enumC0981Jc;
                }
            } else {
                if (A0I()) {
                    EnumC0981Jc enumC0981Jc2 = EnumC0981Jc.A0A;
                    String[] strArr3 = A06;
                    if (strArr3[6].length() == strArr3[2].length()) {
                        throw new RuntimeException();
                    }
                    A06[3] = "JH";
                    return enumC0981Jc2;
                }
                EnumC0981Jc enumC0981Jc3 = EnumC0981Jc.A08;
                if (A06[3].length() == 32) {
                    A06[3] = "ySAy4b6nQ";
                    return enumC0981Jc3;
                }
                String[] strArr4 = A06;
                strArr4[1] = "93R6MUXHMTxUt8WfLt1oZ3ea5zubl3sl";
                strArr4[0] = "9xXPI1nVQC4CSUB4soKlPH985bh9DAt9";
                return enumC0981Jc3;
            }
        }
        throw new RuntimeException();
    }

    public final N3 A0D() {
        return this.A01;
    }

    public final String A0E() {
        return this.A03.A0U();
    }

    public final void A0F() {
        this.A04.AF6();
    }

    public final void A0G(Intent intent, RewardData rewardData, String str) {
        this.A03.A0g(rewardData);
        this.A03.A0k(str);
        intent.putExtra(A06(48, 14, 94), this.A03);
    }

    public final boolean A0I() {
        return !TextUtils.isEmpty(this.A03.A0O().A0D().A08());
    }

    public final boolean A0J() {
        return this.A03.A0o();
    }
}
