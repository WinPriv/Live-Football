package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Sy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1230Sy implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, C7E {
    public static byte[] A02;
    public final C1316Wj A00;
    public final /* synthetic */ C1228Sw A01;

    static {
        A03();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{43, Ascii.SO, 74, 9, Ascii.VT, 4, 4, 5, Ascii.RS, 74, 8, Ascii.SI, 74, 9, 6, 3, 9, 1, Ascii.SI, Ascii.SO, 74, 8, Ascii.SI, Ascii.FF, 5, Ascii.CAN, Ascii.SI, 74, 3, Ascii.RS, 74, 3, Ascii.EM, 74, Ascii.FS, 3, Ascii.SI, Ascii.GS, Ascii.SI, Ascii.SO, 68, 66, 109, 104, 98, 106, 114, 33, 105, 96, 113, 113, 100, 111, 100, 101, 33, 117, 110, 110, 33, 103, 96, 114, 117, 47, Ascii.DC4, Ascii.DLE, 19, 39, 54, 59, 55, 60, 49, 55, Ascii.FS, 55, 38, 37, 61, 32, 57, 56, Ascii.EM, 86, 2, Ascii.EM, 3, Ascii.NAK, Ascii.RS, 86, Ascii.DC2, Ascii.ETB, 2, Ascii.ETB, 86, 4, 19, Ascii.NAK, Ascii.EM, 4, Ascii.DC2, 19, Ascii.DC2, 90, 86, 6, Ascii.SUB, 19, Ascii.ETB, 5, 19, 86, 19, Ascii.CAN, 5, 3, 4, 19, 86, 2, Ascii.EM, 3, Ascii.NAK, Ascii.RS, 86, 19, 0, 19, Ascii.CAN, 2, 5, 86, 4, 19, Ascii.ETB, Ascii.NAK, Ascii.RS, 86, 2, Ascii.RS, 19, 86, Ascii.ETB, Ascii.DC2, 86, 32, Ascii.US, 19, 1, 86, Ascii.DC4, Ascii.SI, 86, 4, 19, 2, 3, 4, Ascii.CAN, Ascii.US, Ascii.CAN, 17, 86, Ascii.DLE, Ascii.ETB, Ascii.SUB, 5, 19, 86, Ascii.US, Ascii.DLE, 86, Ascii.SI, Ascii.EM, 3, 86, Ascii.US, Ascii.CAN, 2, 19, 4, Ascii.NAK, 19, 6, 2, 86, 2, Ascii.RS, 19, 86, 19, 0, 19, Ascii.CAN, 2, 88, 33, 39, 60, 94, 68, 89};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        L6 l62;
        C1316Wj c1316Wj;
        L6 l63;
        C1316Wj c1316Wj2;
        C1316Wj c1316Wj3;
        L6 l64;
        L6 l65;
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            l62 = this.A01.A0f;
            boolean A08 = l62.A08();
            String A00 = A00(66, 17, 105);
            if (!A08) {
                Log.e(A00, A00(83, 115, 77));
            }
            c1316Wj = this.A01.A0c;
            int A0F = ID.A0F(c1316Wj);
            if (A0F >= 0) {
                l64 = this.A01.A0f;
                if (l64.A03() < A0F) {
                    l65 = this.A01.A0f;
                    if (l65.A07()) {
                        Log.e(A00, A00(41, 25, 58));
                        return;
                    } else {
                        Log.e(A00, A00(0, 41, 81));
                        return;
                    }
                }
            }
            l63 = this.A01.A0f;
            c1316Wj2 = this.A01.A0c;
            if (l63.A09(c1316Wj2)) {
                if (this.A01.A0a != null) {
                    this.A01.A0a.A0N(A01());
                    return;
                }
                return;
            }
            c1316Wj3 = this.A01.A0c;
            if (!ID.A16(c1316Wj3)) {
                A05(A01());
                return;
            }
            if (this.A01.A0a != null) {
                this.A01.A0a.A0Q(A01());
            }
            Kc.A00(new DialogInterfaceOnClickListenerC0966In(this), new DialogInterfaceOnClickListenerC0967Io(this), ActivityUtils.A00());
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }

    public ViewOnClickListenerC1230Sy(C1228Sw c1228Sw, C1316Wj c1316Wj) {
        this.A01 = c1228Sw;
        this.A00 = c1316Wj;
    }

    public /* synthetic */ ViewOnClickListenerC1230Sy(C1228Sw c1228Sw, C1316Wj c1316Wj, T7 t72) {
        this(c1228Sw, c1316Wj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01() {
        C1137Pi c1137Pi;
        L6 l62;
        EnumC0973Iu enumC0973Iu;
        boolean z10;
        boolean z11;
        EnumC0973Iu enumC0973Iu2;
        N2 n22 = new N2();
        c1137Pi = this.A01.A0R;
        N2 A03 = n22.A03(c1137Pi);
        l62 = this.A01.A0f;
        Map<String, String> A05 = A03.A02(l62).A05();
        enumC0973Iu = this.A01.A0I;
        if (enumC0973Iu != null) {
            enumC0973Iu2 = this.A01.A0I;
            A05.put(A00(201, 3, 11), String.valueOf(enumC0973Iu2.A04()));
        }
        z10 = this.A01.A0W;
        if (z10) {
            z11 = this.A01.A0W;
            A05.put(A00(198, 3, 116), String.valueOf(z11));
        }
        return A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(Map<String, String> extraData) {
        if (this.A01.A0a != null) {
            this.A01.A0a.A0M(extraData);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C7E
    public final C1316Wj A5Z() {
        return this.A00;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        N0 n02;
        N0 n03;
        View view3;
        View view4;
        N0 n04;
        N0 n05;
        view2 = this.A01.A04;
        if (view2 != null) {
            n02 = this.A01.A0L;
            if (n02 != null) {
                n03 = this.A01.A0L;
                view3 = this.A01.A04;
                int width = view3.getWidth();
                view4 = this.A01.A04;
                n03.setBounds(0, 0, width, view4.getHeight());
                n04 = this.A01.A0L;
                n05 = this.A01.A0L;
                n04.A0D(!n05.A0E());
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        L6 l62;
        C1316Wj c1316Wj;
        View view2;
        View.OnTouchListener onTouchListener;
        View.OnTouchListener onTouchListener2;
        l62 = this.A01.A0f;
        c1316Wj = this.A01.A0c;
        view2 = this.A01.A04;
        l62.A06(c1316Wj, motionEvent, view2, view);
        onTouchListener = this.A01.A02;
        if (onTouchListener != null) {
            onTouchListener2 = this.A01.A02;
            if (onTouchListener2.onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
