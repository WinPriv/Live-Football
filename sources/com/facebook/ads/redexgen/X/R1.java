package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.VisibleForTesting;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import javax.annotation.Nullable;
import org.json.JSONObject;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: assets/audience_network.dex */
public final class R1 {
    public static byte[] A02;
    public static String[] A03 = {"VT4fMDut957REDv81Zf67ZRXVgx5T5a8", "r", "Z8Owoyb", "FnQ4OiwpcdZoDsiJ2m5WJ2Um26YCJsc9", "WRxJAxd2kL6ougEGyIG1Du6QramXeho", "YseYEaNGGUDDQ4eQqZOUPTvdjgKCIPcf", "c4hktFWkJWdy9he8EQ0DeAgF43U5wP0s", "DRA64HFd"};

    @VisibleForTesting
    public BlockingDeque<R2> A00 = new LinkedBlockingDeque();

    @Nullable
    public final String A01;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 104);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static String A05(List<Long> list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            A08(sb2, A00(it.next().longValue()));
        }
        return A03(sb2.toString());
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static String A06(Map<String, Object> map) {
        return new JSONObject(map).toString();
    }

    public static void A07() {
        A02 = new byte[]{92, 95, 94, 89, 88, 91, 90, 85, 84, 87, 86, 81, 80, 83, 82, 77, 76, 79, 78, 73, 72, 75, 74, 69, 68, 71, 124, Ascii.DEL, 126, 121, 120, 123, 122, 117, 116, 119, 118, 113, 112, 115, 114, 109, 108, 111, 110, 105, 104, 107, 106, 101, 100, 103, 45, 44, 47, 46, 41, 40, 43, 42, 37, 36, 54, 50, 48, 51, 33, 55, Ascii.SYN, 55, 62, 38, 51, 45, 123, 42, Ascii.CR, 57, 40, 37, 35, 57, 49, Ascii.FS, 6, 38, Ascii.SUB, 0, Ascii.ESC, 17, 58, Ascii.ESC, 10, Ascii.EM, Ascii.SO, Ascii.SI, Ascii.NAK, 19, Ascii.DC2, 109, 52, 115, 100, 100, 52, 44, 52, 69, 95, 76, 83, 73, 83, 78, 85, 83, 83, 82, 73, 91, 87, 78, 73, 85, 87, 70, 52, 107};
    }

    static {
        A07();
    }

    public R1(@Nullable String str) {
        this.A01 = str;
    }

    public static long A00(long j10) {
        return (j10 << 1) ^ (j10 >> 63);
    }

    public static long A01(List<R2> list) {
        HashMap hashMap = new HashMap();
        for (int i10 = 1; i10 < list.size(); i10++) {
            long A032 = list.get(i10).A03();
            long playerPts = list.get(i10).A01();
            if (hashMap.containsKey(Long.valueOf(A032))) {
                hashMap.put(Long.valueOf(A032), Integer.valueOf(((Integer) hashMap.get(Long.valueOf(A032))).intValue() + 1));
            } else {
                hashMap.put(Long.valueOf(A032), 1);
            }
            if (hashMap.containsKey(Long.valueOf(playerPts))) {
                hashMap.put(Long.valueOf(playerPts), Integer.valueOf(((Integer) hashMap.get(Long.valueOf(playerPts))).intValue() + 1));
            } else {
                Long valueOf = Long.valueOf(playerPts);
                String[] strArr = A03;
                String str = strArr[6];
                String str2 = strArr[0];
                int i11 = str.charAt(27);
                if (i11 != str2.charAt(27)) {
                    throw new RuntimeException();
                }
                A03[5] = "bvHx6KIUVUv7zPzX2p7QZTtdwWrhQsKz";
                hashMap.put(valueOf, 1);
            }
        }
        long j10 = 3333;
        int baseCountMax = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((Integer) entry.getValue()).intValue();
            if (baseCountMax < intValue) {
                baseCountMax = intValue;
                j10 = ((Long) entry.getKey()).longValue();
            }
        }
        for (int baseCountMax2 = 1; baseCountMax2 < list.size(); baseCountMax2++) {
            list.get(baseCountMax2).A08(list.get(baseCountMax2).A03() - j10);
            list.get(baseCountMax2).A06(list.get(baseCountMax2).A01() - j10);
        }
        return j10;
    }

    @SuppressLint({"BadMethodUse-java.lang.String.charAt"})
    public static String A03(String str) {
        String A022 = A02(0, 64, 117);
        StringBuilder sb2 = new StringBuilder(str);
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        int length = sb2.length() % 3;
        if (length > 0) {
            while (length < 3) {
                String[] strArr = A03;
                if (strArr[6].charAt(27) != strArr[0].charAt(27)) {
                    throw new RuntimeException();
                }
                A03[2] = "LfiGB0y4";
                sb4.append('=');
                sb2.append((char) 0);
                length++;
            }
        }
        for (int n42 = 0; n42 < sb2.length(); n42 += 3) {
            int charAt = (sb2.charAt(n42) << 16) + (sb2.charAt(n42 + 1) << '\b') + sb2.charAt(n42 + 2);
            int c10 = (charAt >> 18) & 63;
            sb3.append(A022.charAt(c10));
            sb3.append(A022.charAt((charAt >> 12) & 63));
            sb3.append(A022.charAt((charAt >> 6) & 63));
            sb3.append(A022.charAt(charAt & 63));
        }
        StringBuilder r10 = new StringBuilder();
        String base64chars = sb3.substring(0, sb3.length() - sb4.length());
        r10.append(base64chars);
        r10.append((Object) sb4);
        String base64chars2 = r10.toString();
        return base64chars2;
    }

    @Nullable
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public static String A04(@Nullable List<R2> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A02(73, 2, 35), list.get(0).A04());
        hashMap.put(A02(92, 7, 20), 1);
        boolean z10 = false;
        if (list.size() > 1) {
            A09(list);
            hashMap.put(A02(64, 9, 58), Long.valueOf(A01(list)));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 1; i10 < list.size(); i10++) {
                arrayList.add(Long.valueOf(list.get(i10).A03()));
                arrayList.add(Long.valueOf(list.get(i10).A01()));
                arrayList.add(Long.valueOf(list.get(i10).A02()));
                arrayList2.add(Long.valueOf(list.get(i10).A00()));
                if (list.get(i10).A00() != 0) {
                    z10 = true;
                }
            }
            hashMap.put(A02(81, 2, 55), A05(arrayList));
            hashMap.put(A02(75, 6, 36), A05(arrayList2));
            hashMap.put(A02(83, 9, 29), Boolean.valueOf(z10));
        }
        String A06 = A06(hashMap);
        if (A06.length() > 900000) {
            return A02(99, 29, 126);
        }
        return A06;
    }

    public static void A08(StringBuilder sb2, long j10) {
        while (j10 >= 128) {
            int b10 = 128 - 1;
            char c10 = (char) ((b10 & j10) | 128);
            j10 >>= 7;
            sb2.append(c10);
        }
        int b11 = (int) j10;
        char c11 = (char) b11;
        String[] strArr = A03;
        String str = strArr[6];
        String str2 = strArr[0];
        int charAt = str.charAt(27);
        int b12 = str2.charAt(27);
        if (charAt != b12) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[6] = "TgLp8xzira9J3G7G7T0jqPUigov5tglm";
        strArr2[0] = "pcTwByMvDCDs4QWUJjAKPoIFXFV5AKB6";
        sb2.append(c11);
    }

    public static void A09(List<R2> list) {
        long A00;
        for (int size = list.size() - 1; size > 0; size--) {
            int i10 = size - 1;
            list.get(size).A08(list.get(size).A03() - list.get(i10).A03());
            int i11 = size - 1;
            list.get(size).A06(list.get(size).A01() - list.get(i11).A01());
            int i12 = size - 1;
            list.get(size).A07(list.get(size).A02() - list.get(i12).A02());
            R2 r22 = list.get(size);
            int i13 = size - 1;
            if (list.get(i13).A00() == -1) {
                A00 = 0;
            } else {
                int i14 = size - 1;
                A00 = list.get(size).A00() - list.get(i14).A00();
            }
            r22.A05(A00);
            list.get(size).A07(list.get(size).A02() - list.get(size).A01());
        }
    }

    public final List<R2> A0A() {
        ArrayList arrayList = new ArrayList();
        this.A00.drainTo(arrayList);
        return arrayList;
    }

    public final void A0B(R2 r22) {
        R2 peekLast = this.A00.peekLast();
        if (peekLast != null) {
            long A032 = peekLast.A03();
            if (A03[7].length() == 7) {
                throw new RuntimeException();
            }
            A03[1] = "fQhMIvl";
            if (A032 == r22.A03() && peekLast.A01() == r22.A01()) {
                return;
            }
        }
        this.A00.add(r22);
    }
}
