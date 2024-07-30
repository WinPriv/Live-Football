package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.Nullable;
import com.anythink.core.common.g.c;
import com.applovin.exoplayer2.common.base.Ascii;
import com.huawei.hms.ads.gl;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Zx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1401Zx {

    @Nullable
    public InterfaceC1404a0 A00;

    @Nullable
    public InterfaceC1402Zy A01;
    public C1389Zl A02;
    public final InterfaceC1411a7 A03;

    @Nullable
    public final InterfaceC1403Zz A04;

    public C1401Zx(InterfaceC1411a7 interfaceC1411a7, @Nullable InterfaceC1403Zz interfaceC1403Zz) {
        this.A03 = interfaceC1411a7;
        this.A04 = interfaceC1403Zz;
    }

    public static C1401Zx A00() {
        return new C1401Zx(new FB(), null);
    }

    private void A01(AbstractC1405a1 abstractC1405a1, InterfaceC1409a5 interfaceC1409a5, F9 f92) {
        this.A02 = C1389Zl.A00(abstractC1405a1, interfaceC1409a5, f92);
        InterfaceC1404a0 interfaceC1404a0 = this.A00;
        if (interfaceC1404a0 != null) {
            this.A02.A03(interfaceC1404a0);
        }
        InterfaceC1402Zy interfaceC1402Zy = this.A01;
        if (interfaceC1402Zy != null) {
            this.A02.A04(interfaceC1402Zy);
        }
    }

    public final void A02(View view) {
        this.A02.A01(view);
    }

    public final void A03(View view, C1407a3 c1407a3) {
        this.A02.A02(view, c1407a3);
    }

    public final void A04(AbstractC1405a1 abstractC1405a1, View view) {
        FA fa2 = new FA(view, this.A03);
        final InterfaceC1403Zz interfaceC1403Zz = this.A04;
        A01(abstractC1405a1, fa2, new F9(interfaceC1403Zz) { // from class: com.facebook.ads.redexgen.X.3g
            public static byte[] A08;
            public static String[] A09 = {"okBgSYhQGmV0QyU32992deBLR6XrdaZQ", "E", "ZDdZ5rthnspWTI3gzSJHBR7aYCyAxUsq", "EsXM2pc2I6J3hYC1V9OQRTCtALa8wmqB", "DKA0ex9266tXplnV6PUb8C0vdYHWYjG4", "tBgdKBpc94v7LWesC8aTGIaQqZdJYwjy", "iZindrm9v6DBRttH7DMzAa7", "d9237vu9oQoOcpvZwewcjFUDz74P7MIA"};
            public static final String A0A;
            public long A00;

            @Nullable
            public InterfaceC1404a0 A01;

            @Nullable
            public final InterfaceC1403Zz A02;
            public final Map<String, C1393Zp> A06 = new HashMap();
            public final C1394Zq A04 = new C1394Zq();
            public final C1394Zq A03 = new C1394Zq();
            public final List<Rect> A05 = new ArrayList(1);
            public final boolean A07 = false;

            public static String A02(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
                for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                    copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 91);
                }
                return new String(copyOfRange);
            }

            public static void A03() {
                A08 = new byte[]{41, Ascii.NAK, Ascii.DC4, Ascii.SO, 93, Ascii.VT, Ascii.DC4, Ascii.CAN, 10, Ascii.CR, Ascii.DC2, Ascii.DC4, 19, 9, 93, Ascii.NAK, Ascii.FS, Ascii.SO, 93, 19, Ascii.DC2, 9, 93, Ascii.US, Ascii.CAN, Ascii.CAN, 19, 93, Ascii.DLE, Ascii.CAN, Ascii.FS, Ascii.SO, 8, Ascii.SI, Ascii.CAN, Ascii.EM, 93, Ascii.DC2, Ascii.SI, 93, Ascii.DC4, Ascii.SO, 93, Ascii.FS, 93, Ascii.SUB, Ascii.SI, Ascii.DC2, 8, Ascii.CR, 93, 10, Ascii.NAK, Ascii.DC4, Ascii.RS, Ascii.NAK, 93, 10, Ascii.DC4, 17, 17, 93, 19, Ascii.CAN, Ascii.VT, Ascii.CAN, Ascii.SI, 93, Ascii.SI, Ascii.CAN, 9, 8, Ascii.SI, 19, 93, Ascii.FS, 93, Ascii.DLE, Ascii.CAN, Ascii.FS, Ascii.SO, 8, Ascii.SI, Ascii.CAN, Ascii.DLE, Ascii.CAN, 19, 9, 93, Ascii.SO, Ascii.DC4, 19, Ascii.RS, Ascii.CAN, 93, Ascii.DC4, 9, 90, Ascii.SO, 93, Ascii.DLE, Ascii.FS, Ascii.EM, Ascii.CAN, 93, 8, Ascii.CR, 93, Ascii.DC2, Ascii.ESC, 93, Ascii.SO, 8, Ascii.US, Ascii.VT, Ascii.DC4, Ascii.CAN, 10, Ascii.SO, 93, 9, Ascii.NAK, Ascii.FS, 9, 93, Ascii.RS, Ascii.DC2, 8, 17, Ascii.EM, 93, Ascii.US, Ascii.CAN, 93, Ascii.DC2, Ascii.ESC, Ascii.ESC, Ascii.SO, Ascii.RS, Ascii.SI, Ascii.CAN, Ascii.CAN, 19, 118, 125, 111, 75, 123, 121, 118, 63, 36, 61, 61, 113, 39, 56, 52, 38, 113, 33, 35, 62, 33, 52, 35, 37, 40, 113, 55, 62, 35, 113, 35, 52, 60, 62, 39, 52, 53, 113, 56, 37, 52, 60, 113, 125, 97, 104, 122, 92, 107, 126, 97, 124, 122};
            }

            static {
                A03();
                A0A = C05993g.class.getSimpleName();
            }

            {
                this.A02 = interfaceC1403Zz;
            }

            public static Rect A00(@Nullable C1393Zp c1393Zp) {
                Rect rect;
                Rect rect2;
                Rect rect3;
                Rect rect4;
                Rect rect5;
                if (c1393Zp != null) {
                    rect = c1393Zp.A02;
                    if (rect.top != Integer.MIN_VALUE) {
                        rect2 = c1393Zp.A02;
                        if (rect2.left != Integer.MIN_VALUE) {
                            rect3 = c1393Zp.A02;
                            String[] strArr = A09;
                            if (strArr[1].length() == strArr[6].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A09;
                            strArr2[1] = c.W;
                            strArr2[6] = "Kr6mbDoiLKwWSgNyXDF2oJW";
                            if (rect3.right != Integer.MIN_VALUE) {
                                rect4 = c1393Zp.A02;
                                if (rect4.bottom != Integer.MIN_VALUE) {
                                    rect5 = c1393Zp.A02;
                                    return rect5;
                                }
                            }
                        }
                    }
                }
                throw new IllegalStateException(A02(0, 143, 38));
            }

            private C1393Zp A01(C1407a3 c1407a3, Rect rect, Rect rect2) {
                boolean A06;
                Rect rect3;
                List list;
                C1393Zp c1393Zp = this.A06.get(c1407a3.A03);
                A06 = this.A04.A06(c1407a3);
                if (A06) {
                    if (c1393Zp != null) {
                        c1393Zp.A01 = EnumC1397Zt.A04;
                    } else {
                        c1393Zp = C1393Zp.A03(this.A00);
                        this.A06.put(c1407a3.A03, c1393Zp);
                    }
                }
                rect3 = c1393Zp.A02;
                rect3.set(rect2);
                list = c1393Zp.A03;
                list.add(new Rect(rect));
                return c1393Zp;
            }

            private void A04(C1394Zq c1394Zq) {
                Collection<C1407a3> A01;
                List list;
                A01 = c1394Zq.A01();
                for (C1407a3 c1407a3 : A01) {
                    C1393Zp c1393Zp = this.A06.get(c1407a3.A03);
                    if (c1393Zp == null) {
                        if (this.A02 != null) {
                            String str = A02(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 36, 10) + c1407a3.A03;
                            throw new NullPointerException(A02(186, 10, 85));
                        }
                    } else {
                        c1393Zp.A01 = EnumC1397Zt.A03;
                        list = c1393Zp.A03;
                        list.clear();
                        c1407a3.A03(this);
                        if (this.A07) {
                            Map<String, C1393Zp> map = this.A06;
                            String[] strArr = A09;
                            if (strArr[0].charAt(8) == strArr[2].charAt(8)) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A09;
                            strArr2[0] = "dCpYPRypiVOHB4OlkAqBqk8EySqTLE1k";
                            strArr2[2] = "r3sjB169HJX8vOmMpko73ANLsggTEmi2";
                            map.remove(c1393Zp);
                        } else {
                            continue;
                        }
                    }
                }
            }

            private void A05(C1394Zq c1394Zq) {
                Collection A00;
                A00 = c1394Zq.A00();
                Iterator it = A00.iterator();
                while (it.hasNext()) {
                    ((C1407a3) it.next()).A03(this);
                }
            }

            @Override // com.facebook.ads.redexgen.X.F9
            public final void A3J(C1407a3 c1407a3, Rect rect, Rect rect2) {
                boolean A06;
                List list;
                Rect rect3;
                List list2;
                A01(c1407a3, rect, rect2);
                C1407a3 c1407a32 = c1407a3.A00;
                C1407a3 parentViewpointData = C1407a3.A06;
                if (c1407a32 == parentViewpointData) {
                    return;
                }
                A06 = this.A03.A06(c1407a32);
                C1393Zp parentViewProperties = this.A06.get(c1407a32.A03);
                if (A06) {
                    if (parentViewProperties == null) {
                        parentViewProperties = C1393Zp.A03(this.A00);
                        rect3 = parentViewProperties.A02;
                        rect3.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                        this.A06.put(c1407a32.A03, parentViewProperties);
                    } else {
                        list2 = parentViewProperties.A03;
                        list2.clear();
                        parentViewProperties.A01 = EnumC1397Zt.A04;
                    }
                }
                list = parentViewProperties.A03;
                list.add(new Rect(rect));
            }

            @Override // com.facebook.ads.redexgen.X.F9
            public final void A3q(long j10, List<Rect> viewportRects) {
                Collection A01;
                Collection A012;
                List list;
                this.A00 = j10;
                this.A05.clear();
                Iterator<Rect> it = viewportRects.iterator();
                while (it.hasNext()) {
                    this.A05.add(new Rect(it.next()));
                }
                A01 = this.A04.A01();
                Iterator it2 = A01.iterator();
                while (it2.hasNext()) {
                    this.A06.remove(((C1407a3) it2.next()).A03);
                }
                A012 = this.A03.A01();
                Iterator it3 = A012.iterator();
                while (it3.hasNext()) {
                    this.A06.remove(((C1407a3) it3.next()).A03);
                }
                Iterator<C1393Zp> it4 = this.A06.values().iterator();
                while (it4.hasNext()) {
                    list = it4.next().A03;
                    list.clear();
                }
                this.A04.A04();
                this.A03.A04();
            }

            @Override // com.facebook.ads.redexgen.X.F9
            public final void A5D() {
                Collection A00;
                Collection A002;
                A05(this.A04);
                A04(this.A04);
                A05(this.A03);
                A04(this.A03);
                if (this.A01 != null) {
                    String obj = toString();
                    List<Rect> list = this.A05;
                    A00 = this.A04.A00();
                    A002 = this.A03.A00();
                    new C1392Zo(obj, this, list, A00, A002);
                    throw new NullPointerException(A02(143, 7, 67));
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1396Zs
            public final void A6h(C1407a3 c1407a3, Rect rect) {
                List list;
                rect.setEmpty();
                list = this.A06.get(c1407a3.A03).A03;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    rect.union((Rect) it.next());
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1396Zs
            public final EnumC1397Zt A7m(C1407a3 c1407a3) {
                EnumC1397Zt enumC1397Zt;
                enumC1397Zt = this.A06.get(c1407a3.A03).A01;
                return enumC1397Zt;
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1396Zs
            public final void A7o(Rect rect) {
                rect.setEmpty();
                Iterator<Rect> it = this.A05.iterator();
                while (it.hasNext()) {
                    rect.union(it.next());
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1396Zs
            public final float A7p(C1407a3 c1407a3) {
                List<Rect> list;
                C1393Zp c1393Zp = this.A06.get(c1407a3.A03);
                if (c1393Zp != null) {
                    Rect A00 = A00(c1393Zp);
                    int height = A00.height() * A00.width();
                    int totalVisibleArea = 0;
                    list = c1393Zp.A03;
                    for (Rect rect : list) {
                        totalVisibleArea += rect.height() * rect.width();
                    }
                    return totalVisibleArea / height;
                }
                return gl.Code;
            }

            @Override // com.facebook.ads.redexgen.X.F9
            public final void AEc(@Nullable InterfaceC1404a0 interfaceC1404a0) {
                this.A01 = interfaceC1404a0;
            }
        });
    }
}
