package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3O, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3O {
    public static byte[] A00;
    public static final C3N A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 64);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{115, 114, 82, 121, 111, 104, 121, 120, 76, 110, 121, 79, Ascii.DEL, 110, 115, 112, 112, 6, 7, 39, Ascii.FF, Ascii.SUB, Ascii.GS, Ascii.FF, Ascii.CR, 58, 10, Ascii.ESC, 6, 5, 5, 119, 118, 86, 125, 107, 108, 125, 124, 75, 123, 106, 119, 116, 116, 89, 123, 123, 125, 104, 108, 125, 124, 126, Ascii.DEL, 66, 101, 126, 97, 95, 116, 98, 101, 116, 117, 66, 114, 99, 126, 125, 125};
    }

    static {
        A01();
        if (Build.VERSION.SDK_INT >= 21) {
            A01 = new E4();
        } else if (Build.VERSION.SDK_INT >= 19) {
            A01 = new C1352Xt();
        } else {
            A01 = new C3N();
        }
    }

    public static void A02(ViewParent viewParent, View view, int i10) {
        if (viewParent instanceof InterfaceC1356Xy) {
            throw new NullPointerException(A00(53, 18, 81));
        }
        if (i10 == 0) {
            A01.A03(viewParent, view);
        }
    }

    public static void A03(ViewParent viewParent, View view, int i10, int i11, int i12, int i13, int i14) {
        if (viewParent instanceof InterfaceC1356Xy) {
            throw new NullPointerException(A00(17, 14, 41));
        }
        if (i14 == 0) {
            A01.A04(viewParent, view, i10, i11, i12, i13);
        }
    }

    public static void A04(ViewParent viewParent, View view, int i10, int i11, int[] iArr, int i12) {
        if (viewParent instanceof InterfaceC1356Xy) {
            throw new NullPointerException(A00(0, 17, 92));
        }
        if (i12 == 0) {
            A01.A05(viewParent, view, i10, i11, iArr);
        }
    }

    public static void A05(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (viewParent instanceof InterfaceC1356Xy) {
            throw new NullPointerException(A00(31, 22, 88));
        }
        if (i11 == 0) {
            A01.A06(viewParent, view, view2, i10);
        }
    }

    public static boolean A06(ViewParent viewParent, View view, float f, float f10) {
        return A01.A07(viewParent, view, f, f10);
    }

    public static boolean A07(ViewParent viewParent, View view, float f, float f10, boolean z10) {
        return A01.A08(viewParent, view, f, f10, z10);
    }

    public static boolean A08(ViewParent viewParent, View view, View view2, int i10, int i11) {
        if (viewParent instanceof InterfaceC1356Xy) {
            return ((InterfaceC1356Xy) viewParent).onStartNestedScroll(view, view2, i10, i11);
        }
        if (i11 == 0) {
            return A01.A09(viewParent, view, view2, i10);
        }
        return false;
    }
}
