package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class FQ {
    public static String[] A08 = {"cHi9U0Pg", "VGea8qk0EPS8OqQ4obSD5aeRlTRdn39K", "J", "J", "UkvFMUtno93mVTdlP0lNSPxeQZ", "4fCjFf2htdfAP", "I6h5KAyxQwYPDLtwjcMWBd", "QYcuKDWzo7FBs229Db5R79YAEK36tHpY"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final List<FP> A06 = new ArrayList();
    public final List<SpannableString> A07 = new ArrayList();
    public final StringBuilder A05 = new StringBuilder();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final FJ A05() {
        float f;
        int i10;
        int i11;
        int i12;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i13 = 0; i13 < this.A07.size(); i13++) {
            SpannableString spannableString = this.A07.get(i13);
            String[] strArr = A08;
            if (strArr[7].charAt(17) != strArr[1].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[4] = "JfGeCXNtH9OkzyiNPcVTkTkkVF";
            strArr2[5] = "U8fcuMPJKIItC";
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append((CharSequence) A00());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i14 = this.A02 + this.A04;
        int length = (32 - i14) - spannableStringBuilder.length();
        int i15 = i14 - length;
        if (this.A00 == 2 && (Math.abs(i15) < 3 || length < 0)) {
            f = 0.5f;
            i10 = 1;
        } else if (this.A00 != 2 || i15 <= 0) {
            f = (0.8f * (i14 / 32.0f)) + 0.1f;
            i10 = 0;
        } else {
            f = (0.8f * ((32 - length) / 32.0f)) + 0.1f;
            i10 = 2;
        }
        if (this.A00 == 1 || this.A03 > 7) {
            i11 = 2;
            i12 = (this.A03 - 15) - 2;
        } else {
            i11 = 0;
            i12 = this.A03;
        }
        return new FJ(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, i12, 1, i11, f, i10, Float.MIN_VALUE);
    }

    public FQ(int i10, int i11) {
        A09(i10);
        A0A(i11);
    }

    private final SpannableString A00() {
        int i10;
        int[] iArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A05);
        int i11 = spannableStringBuilder.length();
        int i12 = -1;
        int color = -1;
        int colorStartPosition = 0;
        int italicStartPosition = -1;
        boolean z10 = false;
        int i13 = -1;
        for (int underlineStartPosition = 0; underlineStartPosition < this.A06.size(); underlineStartPosition++) {
            FP fp = this.A06.get(underlineStartPosition);
            boolean z11 = fp.A02;
            int length = fp.A01;
            if (length != 8) {
                z10 = length == 7;
                if (length != 7) {
                    iArr = AnonymousClass32.A0K;
                    i13 = iArr[length];
                }
            }
            int length2 = fp.A00;
            if (underlineStartPosition + 1 < this.A06.size()) {
                i10 = this.A06.get(underlineStartPosition + 1).A00;
            } else {
                i10 = i11;
            }
            if (length2 != i10) {
                if (i12 != -1 && !z11) {
                    A02(spannableStringBuilder, i12, length2);
                    i12 = -1;
                } else if (i12 == -1 && z11) {
                    i12 = length2;
                }
                String[] strArr = A08;
                if (strArr[4].length() == strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[4] = "lr4TMFgGLuEdpqEBom9kPNzU6S";
                strArr2[5] = "0zdhGbgYXkwlZ";
                if (color != -1 && !z10) {
                    A01(spannableStringBuilder, color, length2);
                    color = -1;
                } else if (color == -1 && z10) {
                    color = length2;
                }
                if (i13 != italicStartPosition) {
                    A03(spannableStringBuilder, colorStartPosition, length2, italicStartPosition);
                    italicStartPosition = i13;
                    colorStartPosition = length2;
                }
            }
        }
        if (i12 != -1 && i12 != i11) {
            A02(spannableStringBuilder, i12, i11);
        }
        if (color != -1 && color != i11) {
            A01(spannableStringBuilder, color, i11);
        }
        if (colorStartPosition != i11) {
            A03(spannableStringBuilder, colorStartPosition, i11, italicStartPosition);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public static void A01(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
    }

    public static void A02(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
    }

    public static void A03(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
        if (i12 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
    }

    public final int A04() {
        return this.A03;
    }

    public final void A06() {
        int length = this.A05.length();
        if (length > 0) {
            int length2 = length - 1;
            this.A05.delete(length2, length);
            int length3 = this.A06.size();
            for (int i10 = length3 - 1; i10 >= 0; i10--) {
                List<FP> list = this.A06;
                String[] strArr = A08;
                String str = strArr[2];
                String str2 = strArr[3];
                int i11 = str.length();
                int length4 = str2.length();
                if (i11 != length4) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[0] = "cQse4OX3";
                strArr2[6] = "MGHTHr2HMLcimDeu5sZkGF";
                FP fp = list.get(i10);
                int length5 = fp.A00;
                if (length5 == length) {
                    int length6 = fp.A00;
                    fp.A00 = length6 - 1;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0022 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07() {
        /*
            r3 = this;
            java.util.List<android.text.SpannableString> r1 = r3.A07
            android.text.SpannableString r0 = r3.A00()
            r1.add(r0)
            java.lang.StringBuilder r0 = r3.A05
            r2 = 0
            r0.setLength(r2)
            java.util.List<com.facebook.ads.redexgen.X.FP> r0 = r3.A06
            r0.clear()
            int r1 = r3.A01
            int r0 = r3.A03
            int r1 = java.lang.Math.min(r1, r0)
        L1c:
            java.util.List<android.text.SpannableString> r0 = r3.A07
            int r0 = r0.size()
            if (r0 < r1) goto L2a
            java.util.List<android.text.SpannableString> r0 = r3.A07
            r0.remove(r2)
            goto L1c
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.FQ.A07():void");
    }

    public final void A08(char c10) {
        this.A05.append(c10);
    }

    public final void A09(int i10) {
        this.A00 = i10;
        this.A06.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
    }

    public final void A0A(int i10) {
        this.A01 = i10;
    }

    public final void A0B(int i10) {
        this.A02 = i10;
    }

    public final void A0C(int i10) {
        this.A03 = i10;
    }

    public final void A0D(int i10) {
        this.A04 = i10;
    }

    public final void A0E(int i10, boolean z10) {
        this.A06.add(new FP(i10, z10, this.A05.length()));
    }

    public final boolean A0F() {
        if (this.A06.isEmpty() && this.A07.isEmpty()) {
            StringBuilder sb2 = this.A05;
            String[] strArr = A08;
            if (strArr[0].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[7] = "ONSLHBaiVChTiCDyCbz7MeGvMb5ZJwv8";
            strArr2[1] = "WV9KVve3dIDV1UZxgbczLfOjx2KW4DPJ";
            if (sb2.length() == 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.A05.toString();
    }
}
