package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.expressad.video.module.a.a;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.Fx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0900Fx {
    public static byte[] A01;
    public static String[] A02 = {"BH2zNHpX", "Dnuq9wFIL2", "vBkvmD9EAd5t9FTNthVuCuoibAfWrGUa", "Nhu3hv03L3KjBzyMucsPwsjdroL1", "9TVwE8RhMB8DaYr8DWqJ6OPYy1", "9JupfOkL4WUcaojH", "ecCz7RACP0dYyLgy5uflHn", "VPA8JBGLf77hbCQNqSGQ8FIxNIe4WZlE"};
    public static final Pattern A03;
    public static final Pattern A04;
    public final StringBuilder A00 = new StringBuilder();

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A01 = new byte[]{116, Ascii.SYN, 48, 76, 56, 55, 79, 91, 77, 94, 76, 56, 55, 79, 77, 66, 54, 42, 35, 4, Ascii.FS, Ascii.VT, 6, 3, Ascii.SO, 74, Ascii.VT, 6, 3, Ascii.CR, 4, 7, Ascii.SI, 4, Ascii.RS, 74, Ascii.FS, Ascii.VT, 6, Ascii.US, Ascii.SI, 80, 74, 106, 77, 85, 66, 79, 74, 71, 3, 66, 77, 64, 75, 76, 81, 3, 85, 66, 79, 86, 70, Ascii.EM, 3, 42, Ascii.DC2, Ascii.DLE, 9, 9, Ascii.DLE, Ascii.ETB, Ascii.RS, 89, Ascii.ESC, Ascii.CAN, Ascii.GS, 89, Ascii.SUB, Ascii.FF, Ascii.FS, 89, 10, Ascii.FS, Ascii.CR, Ascii.CR, Ascii.DLE, Ascii.ETB, Ascii.RS, 67, 89, 118, 78, 76, 85, 85, 76, 75, 66, 5, 70, 80, 64, 5, 82, 76, 81, 77, 5, 71, 68, 65, 5, 77, 64, 68, 65, 64, 87, Ascii.US, 5, Ascii.SYN, 45, 40, 45, 44, 52, 45, 99, 32, 54, 38, 99, 48, 38, 55, 55, 42, 45, 36, 99, 51, 1, 6, Ascii.DC2, Ascii.DLE, Ascii.DLE, 39, 17, 1, 52, 5, Ascii.SYN, Ascii.ETB, 1, Ascii.SYN, 36, 95, 35, 81, 34, 59, 77, 57, 54, 78, 76, 57, Ascii.SYN, 78, 72, 72, 91, 57, Ascii.SYN, 78, 77, 57, 54, 78, 76, 77, 75, 79, 76, 90, 65, 41, 36, 33, 47, 38, 120, 116, 105, 82, Ascii.DC2, 19, Ascii.NAK, Ascii.RS, 4, Ascii.NAK, 2, 91, 80, 90, 103, 116, 99, 56, 54, 63, 62, 35, 56, 63, 54, 113, 36, 63, 34, 36, 33, 33, 62, 35, 37, 52, 53, 113, 52, 63, 37, 56, 37, 40, 107, 113, 118, 119, 33, 44, 35, 42, 44, 37, 38, 52, Ascii.ETB, Ascii.DC2, Ascii.NAK, Ascii.RS, 49, 41, 74, 78, 67, 67, 75, 66, 7, Ascii.VT, Ascii.SUB, Ascii.EM, Ascii.VT, Ascii.DC4, 8, Ascii.DC2, Ascii.SI, Ascii.DC2, Ascii.DC4, Ascii.NAK, 67, 88, 86, 89, 69, 109, 119, 100, 123, 121, 126, 107, 120, 126, 99, 52};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A0C(String str, String str2, C0897Fu c0897Fu, List<C0895Fs> list) {
        C0898Fv c0898Fv;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < str2.length()) {
            char charAt = str2.charAt(i10);
            if (charAt == '&') {
                int indexOf = str2.indexOf(59, i10 + 1);
                int indexOf2 = str2.indexOf(32, i10 + 1);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    A07(str2.substring(i10 + 1, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) A03(1, 1, 110));
                    }
                    i10 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                    i10++;
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i10++;
            } else {
                int i11 = i10 + 1;
                int length = str2.length();
                if (A02[3].length() == 10) {
                    throw new RuntimeException();
                }
                A02[7] = "huABVhch9erSIKd70DjqaQjDgv4JUQcV";
                if (i11 >= length) {
                    i10++;
                } else {
                    int i12 = i10;
                    boolean z10 = str2.charAt(i12 + 1) == '/';
                    i10 = A01(str2, i12 + 1);
                    boolean z11 = str2.charAt(i10 + (-2)) == '/';
                    String substring = str2.substring((z10 ? 2 : 1) + i12, z11 ? i10 - 2 : i10 - 1);
                    String A042 = A04(substring);
                    if (A042 != null && A0E(A042)) {
                        if (z10) {
                            do {
                                boolean isEmpty = arrayDeque.isEmpty();
                                if (A02[5].length() != 16) {
                                    String[] strArr = A02;
                                    strArr[0] = "eUUkvlij";
                                    strArr[6] = "fkUA9DE8mZusd0jqihcBtc";
                                    if (isEmpty) {
                                        break;
                                    }
                                    c0898Fv = (C0898Fv) arrayDeque.pop();
                                    A0B(str, c0898Fv, spannableStringBuilder, list, arrayList);
                                } else {
                                    A02[7] = "xjA9LPEJe2T86ajW2mUni2naxM9TfZ4G";
                                    if (isEmpty) {
                                        break;
                                    }
                                    c0898Fv = (C0898Fv) arrayDeque.pop();
                                    A0B(str, c0898Fv, spannableStringBuilder, list, arrayList);
                                }
                            } while (!c0898Fv.A01.equals(A042));
                        } else if (!z11) {
                            arrayDeque.push(C0898Fv.A01(substring, spannableStringBuilder.length()));
                        }
                    }
                }
            }
        }
        while (!arrayDeque.isEmpty()) {
            A0B(str, (C0898Fv) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
        }
        A0B(str, C0898Fv.A00(), spannableStringBuilder, list, arrayList);
        c0897Fu.A0C(spannableStringBuilder);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final boolean A0G(HV hv, C0897Fu c0897Fu, List<C0895Fs> list) {
        String A0P = hv.A0P();
        if (A0P == null) {
            return false;
        }
        Matcher matcher = A03.matcher(A0P);
        if (matcher.matches()) {
            return A0F(null, matcher, hv, c0897Fu, this.A00, list);
        }
        String A0P2 = hv.A0P();
        if (A0P2 == null) {
            return false;
        }
        Matcher matcher2 = A03.matcher(A0P2);
        if (matcher2.matches()) {
            return A0F(A0P.trim(), matcher2, hv, c0897Fu, this.A00, list);
        }
        return false;
    }

    static {
        A05();
        A03 = Pattern.compile(A03(161, 26, 61));
        A04 = Pattern.compile(A03(3, 12, 60));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            r7 = 0
            r5 = 3
            r4 = 2
            r3 = 1
            switch(r0) {
                case -1364013995: goto L3d;
                case -1074341483: goto L4e;
                case 100571: goto L5f;
                case 109757538: goto L84;
                default: goto Lb;
            }
        Lb:
            r0 = -1
        Lc:
            if (r0 == 0) goto L98
            if (r0 == r3) goto L97
            if (r0 == r4) goto L97
            if (r0 == r5) goto L96
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 43
            r1 = 22
            r0 = 123(0x7b, float:1.72E-43)
            java.lang.String r0 = A03(r2, r1, r0)
            r3.append(r0)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r2 = 141(0x8d, float:1.98E-43)
            r1 = 15
            r0 = 60
            java.lang.String r0 = A03(r2, r1, r0)
            android.util.Log.w(r0, r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            return r0
        L3d:
            r2 = 197(0xc5, float:2.76E-43)
            r1 = 6
            r0 = 40
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lb
            r0 = 1
            goto Lc
        L4e:
            r2 = 254(0xfe, float:3.56E-43)
            r1 = 6
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lb
            r0 = 2
            goto Lc
        L5f:
            r2 = 203(0xcb, float:2.84E-43)
            r1 = 3
            r0 = 102(0x66, float:1.43E-43)
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r6 = r8.equals(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0900Fx.A02
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 10
            if (r1 == r0) goto L99
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0900Fx.A02
            java.lang.String r1 = "MJ40TcK0DidUTvS4"
            r0 = 5
            r2[r0] = r1
            if (r6 == 0) goto Lb
            r0 = 3
            goto Lc
        L84:
            r2 = 281(0x119, float:3.94E-43)
            r1 = 5
            r0 = 82
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lb
            r0 = 0
            goto Lc
        L96:
            return r4
        L97:
            return r3
        L98:
            return r7
        L99:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0900Fx.A00(java.lang.String):int");
    }

    public static int A01(String str, int i10) {
        int indexOf = str.indexOf(62, i10);
        if (indexOf == -1) {
            int index = str.length();
            return index;
        }
        int index2 = indexOf + 1;
        return index2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Layout.Alignment A02(String str) {
        char c10;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals(A03(197, 6, 40))) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1074341483:
                if (str.equals(A03(254, 6, a.R))) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 100571:
                if (str.equals(A03(203, 3, 102))) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 3317767:
                if (str.equals(A03(244, 4, 24))) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 108511772:
                if (str.equals(A03(272, 5, 105))) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 109757538:
                if (str.equals(A03(281, 5, 82))) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0 || c10 == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (c10 == 2 || c10 == 3) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (c10 != 4 && c10 != 5) {
            Log.w(A03(141, 15, 60), A03(18, 25, 50) + str);
            return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static String A04(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return C0940Hl.A0m(trim, A03(156, 5, 39))[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r4 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        r5.setSpan(new android.text.style.StrikethroughSpan(), r7, r8, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        if (r6.A0P() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        r5.setSpan(new android.text.style.UnderlineSpan(), r7, r8, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r6.A0N() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        r5.setSpan(new android.text.style.ForegroundColorSpan(r6.A06()), r7, r8, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        r4 = r6.A0M();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (com.facebook.ads.redexgen.X.C0900Fx.A02[2].charAt(8) == 'y') goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        com.facebook.ads.redexgen.X.C0900Fx.A02[3] = "V2wLbBmXpgkEOhtSXmoT1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        if (r4 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        r5.setSpan(new android.text.style.BackgroundColorSpan(r6.A05()), r7, r8, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        r4 = r6.A0H();
        r2 = com.facebook.ads.redexgen.X.C0900Fx.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
    
        if (r2[0].length() == r2[6].length()) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:
    
        com.facebook.ads.redexgen.X.C0900Fx.A02[3] = "i3U";
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
    
        if (r4 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:
    
        r5.setSpan(new android.text.style.TypefaceSpan(r6.A0H()), r7, r8, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cc, code lost:
    
        if (r6.A0A() == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
    
        r5.setSpan(new android.text.style.AlignmentSpan.Standard(r6.A0A()), r7, r8, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00da, code lost:
    
        r1 = r6.A07();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00df, code lost:
    
        if (r1 == 1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e2, code lost:
    
        if (r1 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e5, code lost:
    
        if (r1 == 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e8, code lost:
    
        r5.setSpan(new android.text.style.RelativeSizeSpan(r6.A04() / 100.0f), r7, r8, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
    
        r5.setSpan(new android.text.style.RelativeSizeSpan(r6.A04()), r7, r8, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0105, code lost:
    
        r5.setSpan(new android.text.style.AbsoluteSizeSpan((int) r6.A04(), true), r7, r8, 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0133, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0113, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C0900Fx.A02;
        r2[0] = "Zhb0mUGg";
        r2[6] = "DqzbmkeRFCAudTa8qvbD1E";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011f, code lost:
    
        if (r4 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012a, code lost:
    
        if (r4 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A06(android.text.SpannableStringBuilder r5, com.facebook.ads.redexgen.X.C0895Fs r6, int r7, int r8) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0900Fx.A06(android.text.SpannableStringBuilder, com.facebook.ads.redexgen.X.Fs, int, int):void");
    }

    public static void A07(String str, SpannableStringBuilder spannableStringBuilder) {
        char c10;
        int hashCode = str.hashCode();
        if (hashCode == 3309) {
            if (str.equals(A03(206, 2, 88))) {
                c10 = 1;
            }
            c10 = 65535;
        } else if (hashCode == 3464) {
            if (str.equals(A03(252, 2, 5))) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode != 96708) {
            if (hashCode == 3374865 && str.equals(A03(260, 4, 49))) {
                c10 = 2;
            }
            c10 = 65535;
        } else {
            if (str.equals(A03(192, 3, 65))) {
                c10 = 3;
            }
            c10 = 65535;
        }
        if (c10 == 0) {
            spannableStringBuilder.append('<');
            return;
        }
        if (c10 == 1) {
            spannableStringBuilder.append('>');
            return;
        }
        if (c10 == 2) {
            spannableStringBuilder.append(' ');
            return;
        }
        if (c10 != 3) {
            Log.w(A03(141, 15, 60), A03(209, 31, 9) + str + A03(16, 2, 85));
            return;
        }
        spannableStringBuilder.append('&');
    }

    public static void A08(String str, C0897Fu c0897Fu) {
        String A032 = A03(141, 15, 60);
        Matcher matcher = A04.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            try {
                if (A03(248, 4, 35).equals(group)) {
                    A09(group2, c0897Fu);
                } else if (A03(187, 5, 16).equals(group)) {
                    c0897Fu.A0B(A02(group2));
                } else if (A03(264, 8, 35).equals(group)) {
                    A0A(group2, c0897Fu);
                } else if (A03(277, 4, 70).equals(group)) {
                    c0897Fu.A05(C0901Fy.A00(group2));
                } else {
                    Log.w(A032, A03(121, 20, 27) + group + A03(15, 1, 32) + group2);
                }
            } catch (NumberFormatException unused) {
                Log.w(A032, A03(65, 26, 33) + matcher.group());
            }
        }
    }

    public static void A09(String str, C0897Fu c0897Fu) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            c0897Fu.A06(A00(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            c0897Fu.A06(Integer.MIN_VALUE);
        }
        if (str.endsWith(A03(2, 1, 77))) {
            c0897Fu.A03(C0901Fy.A00(str)).A07(0);
            return;
        }
        int commaIndex = Integer.parseInt(str);
        if (commaIndex < 0) {
            commaIndex--;
        }
        C0897Fu A032 = c0897Fu.A03(commaIndex);
        String[] strArr = A02;
        String str2 = strArr[0];
        String str3 = strArr[6];
        int lineNumber = str2.length();
        if (lineNumber == str3.length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "nfwpqDM6";
        strArr2[6] = "ldPC0GHiWge259aJMdVkFd";
        A032.A07(1);
    }

    public static void A0A(String str, C0897Fu c0897Fu) throws NumberFormatException {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            int commaIndex = indexOf + 1;
            c0897Fu.A08(A00(str.substring(commaIndex)));
            str = str.substring(0, indexOf);
        } else {
            c0897Fu.A08(Integer.MIN_VALUE);
        }
        c0897Fu.A04(C0901Fy.A00(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0124 A[LOOP:0: B:26:0x0122->B:27:0x0124, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0B(java.lang.String r11, com.facebook.ads.redexgen.X.C0898Fv r12, android.text.SpannableStringBuilder r13, java.util.List<com.facebook.ads.redexgen.X.C0895Fs> r14, java.util.List<com.facebook.ads.redexgen.X.C0899Fw> r15) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0900Fx.A0B(java.lang.String, com.facebook.ads.redexgen.X.Fv, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    public static void A0D(List<C0895Fs> list, String str, C0898Fv c0898Fv, List<C0899Fw> list2) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0895Fs c0895Fs = list.get(i10);
            int i11 = c0895Fs.A09(str, c0898Fv.A01, c0898Fv.A03, c0898Fv.A02);
            if (i11 > 0) {
                list2.add(new C0899Fw(i11, c0895Fs));
            }
        }
        Collections.sort(list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0E(java.lang.String r10) {
        /*
            int r1 = r10.hashCode()
            r0 = 98
            r9 = 0
            r7 = 5
            r6 = 4
            r5 = 3
            r4 = 2
            r3 = 1
            if (r1 == r0) goto L9f
            r0 = 99
            if (r1 == r0) goto L8e
            r0 = 105(0x69, float:1.47E-43)
            if (r1 == r0) goto L64
            r0 = 3314158(0x3291ee, float:4.644125E-39)
            if (r1 == r0) goto L53
            r0 = 117(0x75, float:1.64E-43)
            if (r1 == r0) goto L42
            r0 = 118(0x76, float:1.65E-43)
            if (r1 == r0) goto L31
        L23:
            r0 = -1
        L24:
            if (r0 == 0) goto Lb1
            if (r0 == r3) goto Lb1
            if (r0 == r4) goto Lb1
            if (r0 == r5) goto Lb1
            if (r0 == r6) goto Lb1
            if (r0 == r7) goto Lb1
            return r9
        L31:
            r2 = 287(0x11f, float:4.02E-43)
            r1 = 1
            r0 = 26
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L23
            r0 = 5
            goto L24
        L42:
            r2 = 286(0x11e, float:4.01E-43)
            r1 = 1
            r0 = 78
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L23
            r0 = 4
            goto L24
        L53:
            r2 = 240(0xf0, float:3.36E-43)
            r1 = 4
            r0 = 21
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L23
            r0 = 3
            goto L24
        L64:
            r2 = 208(0xd0, float:2.91E-43)
            r1 = 1
            r0 = 82
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r8 = r10.equals(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0900Fx.A02
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 10
            if (r1 == r0) goto Lb2
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0900Fx.A02
            java.lang.String r1 = "tlO5iwEB"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "pEnQwZlkHTTTq7cfdXWDKW"
            r0 = 6
            r2[r0] = r1
            if (r8 == 0) goto L23
            r0 = 2
            goto L24
        L8e:
            r2 = 196(0xc4, float:2.75E-43)
            r1 = 1
            r0 = 41
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L23
            r0 = 1
            goto L24
        L9f:
            r2 = 195(0xc3, float:2.73E-43)
            r1 = 1
            r0 = 104(0x68, float:1.46E-43)
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L23
            r0 = 0
            goto L24
        Lb1:
            return r3
        Lb2:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0900Fx.A0E(java.lang.String):boolean");
    }

    public static boolean A0F(String str, Matcher matcher, HV hv, C0897Fu c0897Fu, StringBuilder sb2, List<C0895Fs> list) {
        try {
            c0897Fu.A0A(C0901Fy.A01(matcher.group(1))).A09(C0901Fy.A01(matcher.group(2)));
            A08(matcher.group(3), c0897Fu);
            sb2.setLength(0);
            while (true) {
                String A0P = hv.A0P();
                if (!TextUtils.isEmpty(A0P)) {
                    if (sb2.length() > 0) {
                        sb2.append(A03(0, 1, 38));
                    }
                    sb2.append(A0P.trim());
                } else {
                    A0C(str, sb2.toString(), c0897Fu, list);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
            Log.w(A03(141, 15, 60), A03(91, 30, 125) + matcher.group());
            return false;
        }
    }
}
