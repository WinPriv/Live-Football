package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.Fh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0884Fh {
    public static byte[] A0B;
    public static String[] A0C = {"tlVw39Ohl0PVI8fV0YPCcQegL80HNmMX", "3PVmbccCk3TYNa4naZfa0", "qupmPShVTMJhVfYkOYpITScBpcljJSOb", "vJlbAlf6aMAaV2lo2oeuySGVP617mKUN", "wib00gU5k9UeC7KFMR3e95wgyYt7DknS", "DUfNRVSmHsUyVjEYzj4oHSrvl1jpEWvG", "VaOanHTtNfMSjEnVOScoKyOAyIQNDQyO", "uu1yNZ48dLzKD2dAjoiHYwXYoxLcRzCz"};
    public List<C0884Fh> A00;
    public final long A01;
    public final long A02;
    public final C0890Fn A03;
    public final String A04;

    @Nullable
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final HashMap<String, Integer> A08;
    public final HashMap<String, Integer> A09;
    public final String[] A0A;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        byte[] bArr = {54, 38, 101, 109, 124, 105, 108, 105, 124, 105, 46};
        if (A0C[4].charAt(11) == 'K') {
            throw new RuntimeException();
        }
        A0C[1] = "AmdkI9Q8sE";
        A0B = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A08(long j10, Map<String, C0890Fn> map, Map<String, SpannableStringBuilder> map2) {
        if (A0C(j10)) {
            for (Map.Entry<String, Integer> entry : this.A08.entrySet()) {
                String key = entry.getKey();
                int intValue = this.A09.containsKey(key) ? this.A09.get(key).intValue() : 0;
                int intValue2 = entry.getValue().intValue();
                if (intValue != intValue2) {
                    A0A(map, map2.get(key), intValue, intValue2);
                }
            }
            for (int i10 = 0; i10 < A00(); i10++) {
                A03(i10).A08(j10, map, map2);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final List<FJ> A0D(long j10, Map<String, C0890Fn> map, Map<String, C0885Fi> map2) {
        TreeMap treeMap = new TreeMap();
        A09(j10, false, this.A04, treeMap);
        A08(j10, map, treeMap);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.entrySet()) {
            C0885Fi c0885Fi = map2.get(entry.getKey());
            arrayList.add(new FJ(A01((SpannableStringBuilder) entry.getValue()), (Layout.Alignment) null, c0885Fi.A00, c0885Fi.A05, c0885Fi.A04, c0885Fi.A01, Integer.MIN_VALUE, c0885Fi.A03, c0885Fi.A06, c0885Fi.A02));
        }
        return arrayList;
    }

    static {
        A07();
    }

    public C0884Fh(@Nullable String str, String str2, long j10, long j11, C0890Fn c0890Fn, String[] strArr, String str3) {
        this.A05 = str;
        this.A06 = str2;
        this.A03 = c0890Fn;
        this.A0A = strArr;
        this.A07 = str2 != null;
        this.A02 = j10;
        this.A01 = j11;
        this.A04 = (String) H6.A01(str3);
        this.A09 = new HashMap<>();
        this.A08 = new HashMap<>();
    }

    private final int A00() {
        List<C0884Fh> list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX WARN: Incorrect condition in loop: B:28:0x0042 */
    /* JADX WARN: Incorrect condition in loop: B:50:0x0088 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0015 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.text.SpannableStringBuilder A01(android.text.SpannableStringBuilder r7) {
        /*
            r6 = this;
            int r3 = r7.length()
            r2 = 0
        L5:
            r5 = 32
            if (r2 >= r3) goto L2e
            char r0 = r7.charAt(r2)
            if (r0 != r5) goto L2b
            int r1 = r2 + 1
        L11:
            int r0 = r7.length()
            if (r1 >= r0) goto L20
            char r0 = r7.charAt(r1)
            if (r0 != r5) goto L20
            int r1 = r1 + 1
            goto L11
        L20:
            int r0 = r2 + 1
            int r1 = r1 - r0
            if (r1 <= 0) goto L2b
            int r0 = r2 + r1
            r7.delete(r2, r0)
            int r3 = r3 - r1
        L2b:
            int r2 = r2 + 1
            goto L5
        L2e:
            if (r3 <= 0) goto L3d
            r1 = 0
            char r0 = r7.charAt(r1)
            if (r0 != r5) goto L3d
            r0 = 1
            r7.delete(r1, r0)
            int r3 = r3 + (-1)
        L3d:
            r2 = 0
        L3e:
            int r0 = r3 + (-1)
            r4 = 10
            if (r2 >= r0) goto L5e
            char r0 = r7.charAt(r2)
            if (r0 != r4) goto L5b
            int r0 = r2 + 1
            char r0 = r7.charAt(r0)
            if (r0 != r5) goto L5b
            int r1 = r2 + 1
            int r0 = r2 + 2
            r7.delete(r1, r0)
            int r3 = r3 + (-1)
        L5b:
            int r2 = r2 + 1
            goto L3e
        L5e:
            if (r3 <= 0) goto L85
            int r0 = r3 + (-1)
            char r0 = r7.charAt(r0)
            if (r0 != r5) goto L85
            int r0 = r3 + (-1)
            r7.delete(r0, r3)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0884Fh.A0C
            r0 = 4
            r1 = r1[r0]
            r0 = 11
            char r1 = r1.charAt(r0)
            r0 = 75
            if (r1 == r0) goto Lb2
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0884Fh.A0C
            java.lang.String r1 = "6UN1wY1Jt9AyUvakQ5bJnJbUcnBDq6Nx"
            r0 = 7
            r2[r0] = r1
            int r3 = r3 + (-1)
        L85:
            r1 = 0
        L86:
            int r0 = r3 + (-1)
            if (r1 >= r0) goto La2
            char r0 = r7.charAt(r1)
            if (r0 != r5) goto L9f
            int r0 = r1 + 1
            char r0 = r7.charAt(r0)
            if (r0 != r4) goto L9f
            int r0 = r1 + 1
            r7.delete(r1, r0)
            int r3 = r3 + (-1)
        L9f:
            int r1 = r1 + 1
            goto L86
        La2:
            if (r3 <= 0) goto Lb1
            int r0 = r3 + (-1)
            char r0 = r7.charAt(r0)
            if (r0 != r4) goto Lb1
            int r0 = r3 + (-1)
            r7.delete(r0, r3)
        Lb1:
            return r7
        Lb2:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0884Fh.A01(android.text.SpannableStringBuilder):android.text.SpannableStringBuilder");
    }

    public static SpannableStringBuilder A02(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        SpannableStringBuilder spannableStringBuilder = map.get(str);
        String[] strArr = A0C;
        if (strArr[3].charAt(21) != strArr[2].charAt(21)) {
            throw new RuntimeException();
        }
        A0C[7] = "hg6ickUmYbVaq8iUWn6QMVEg4prIKgzg";
        return spannableStringBuilder;
    }

    private final C0884Fh A03(int i10) {
        List<C0884Fh> list = this.A00;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public static C0884Fh A04(String str) {
        return new C0884Fh(null, C0886Fj.A02(str), b.f7291b, b.f7291b, null, null, A06(0, 0, 104));
    }

    public static C0884Fh A05(String str, long j10, long j11, C0890Fn c0890Fn, String[] strArr, String str2) {
        return new C0884Fh(str, null, j10, j11, c0890Fn, strArr, str2);
    }

    private void A09(long j10, boolean z10, String str, Map<String, SpannableStringBuilder> regionOutputs) {
        Iterator<Map.Entry<String, SpannableStringBuilder>> it;
        String str2 = str;
        this.A09.clear();
        this.A08.clear();
        if (A06(2, 8, 48).equals(this.A05)) {
            return;
        }
        if (!A06(0, 0, 104).equals(this.A04)) {
            str2 = this.A04;
        }
        if (this.A07 && z10) {
            SpannableStringBuilder A02 = A02(str2, regionOutputs);
            String resolvedRegionId = this.A06;
            A02.append((CharSequence) resolvedRegionId);
            return;
        }
        String str3 = this.A05;
        String resolvedRegionId2 = A06(0, 2, 108);
        if (resolvedRegionId2.equals(str3) && z10) {
            SpannableStringBuilder A022 = A02(str2, regionOutputs);
            String resolvedRegionId3 = A0C[1];
            if (resolvedRegionId3.length() == 9) {
                throw new RuntimeException();
            }
            A0C[7] = "inqcH2t7hqDFIF9gj0D4l0zfPZYOosXl";
            A022.append('\n');
            return;
        }
        if (!A0C(j10)) {
            return;
        }
        for (Map.Entry<String, SpannableStringBuilder> entry : regionOutputs.entrySet()) {
            this.A09.put(entry.getKey(), Integer.valueOf(entry.getValue().length()));
        }
        String str4 = this.A05;
        String resolvedRegionId4 = A06(10, 1, 102);
        boolean equals = resolvedRegionId4.equals(str4);
        for (int i10 = 0; i10 < A00(); i10++) {
            A03(i10).A09(j10, z10 || equals, str2, regionOutputs);
        }
        if (equals) {
            C0886Fj.A04(A02(str2, regionOutputs));
        }
        Set<Map.Entry<String, SpannableStringBuilder>> entrySet = regionOutputs.entrySet();
        String resolvedRegionId5 = A0C[1];
        if (resolvedRegionId5.length() != 9) {
            String[] strArr = A0C;
            strArr[6] = "QrQQAjHGp3kEYII6CI1ou0mbB1drVem5";
            strArr[5] = "7rYOvQpYviXrBnOHlwWo10NGfxdLsgiT";
            it = entrySet.iterator();
        } else {
            it = entrySet.iterator();
        }
        while (it.hasNext()) {
            Map.Entry<String, SpannableStringBuilder> next = it.next();
            this.A08.put(next.getKey(), Integer.valueOf(next.getValue().length()));
        }
    }

    private void A0A(Map<String, C0890Fn> map, SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        C0890Fn resolvedStyle = C0886Fj.A00(this.A03, this.A0A, map);
        if (resolvedStyle != null) {
            C0886Fj.A05(spannableStringBuilder, i10, i11, resolvedStyle);
        }
    }

    private void A0B(TreeSet<Long> out, boolean z10) {
        boolean equals = A06(10, 1, 102).equals(this.A05);
        if (z10 || equals) {
            long j10 = this.A02;
            if (A0C[1].length() == 9) {
                throw new RuntimeException();
            }
            A0C[1] = "LOAziX4ZrknWSY3Fjl";
            if (j10 != b.f7291b) {
                out.add(Long.valueOf(j10));
            }
            long j11 = this.A01;
            if (j11 != b.f7291b) {
                Long valueOf = Long.valueOf(j11);
                if (A0C[0].charAt(29) != 'm') {
                    throw new RuntimeException();
                }
                A0C[1] = "dzTKJn1Q9f1wWrnlDp9SVW8wMEk";
                out.add(valueOf);
            }
        }
        if (this.A00 == null) {
            return;
        }
        for (int i10 = 0; i10 < this.A00.size(); i10++) {
            C0884Fh c0884Fh = this.A00.get(i10);
            boolean isPNode = z10 || equals;
            c0884Fh.A0B(out, isPNode);
        }
    }

    private final boolean A0C(long j10) {
        return (this.A02 == b.f7291b && this.A01 == b.f7291b) || (this.A02 <= j10 && this.A01 == b.f7291b) || ((this.A02 == b.f7291b && j10 < this.A01) || (this.A02 <= j10 && j10 < this.A01));
    }

    public final void A0E(C0884Fh c0884Fh) {
        if (this.A00 == null) {
            this.A00 = new ArrayList();
        }
        this.A00.add(c0884Fh);
    }

    public final long[] A0F() {
        TreeSet<Long> treeSet = new TreeSet<>();
        A0B(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        int i10 = 0;
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }
}
