package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ux, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1279Ux implements InterfaceC0810Ch {
    public static byte[] A02;
    public static String[] A03 = {"ggGLmhyInJSffjkfPU8VRn", "WisLA7DCjwWBxH7MqLlw8w9Z4gicIVYK", "baeaQjGS5RYnakDSUMD4HiL2ABi7hiKM", "QvfNkpkg0VH", "dkSLNeeU5ck3Twa6KyaCdOuwvlu7l8iW", "e6Ade", "C9ShSy7zMtGRXyHgR8PAzFWulvZi4KLP", "w2lskP6GH6NJyN70rzATNYjf2L9mjjHA"};
    public final int A00;
    public final List<Format> A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private C0806Cd A00(C0809Cg c0809Cg) {
        String A01;
        int i10;
        if (A03(32)) {
            return new C0806Cd(this.A01);
        }
        HV hv = new HV(c0809Cg.A03);
        List<Format> list = this.A01;
        while (true) {
            int A04 = hv.A04();
            String[] strArr = A03;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[6] = "9wGqNU4xey1NmHgGithGb88lbeAMl0Qa";
            strArr2[5] = "Me3yU";
            if (A04 <= 0) {
                return new C0806Cd(list);
            }
            int A0E = hv.A0E();
            int A06 = hv.A06() + hv.A0E();
            if (A0E == 134) {
                list = new ArrayList<>();
                int A0E2 = hv.A0E() & 31;
                for (int i11 = 0; i11 < A0E2; i11++) {
                    String A0S = hv.A0S(3);
                    int A0E3 = hv.A0E();
                    if ((A0E3 & 128) != 0) {
                        A01 = A01(19, 19, 39);
                        i10 = A0E3 & 63;
                    } else {
                        A01 = A01(0, 19, 33);
                        i10 = 1;
                    }
                    list.add(Format.A08(null, A01, null, -1, 0, A0S, i10, null));
                    hv.A0Z(2);
                }
            }
            hv.A0Y(A06);
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 6);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-120, -105, -105, -109, -112, -118, -120, -101, -112, -106, -107, 86, -118, -116, -120, 84, 93, 87, 95, -114, -99, -99, -103, -106, -112, -114, -95, -106, -100, -101, 92, -112, -110, -114, 90, 100, 93, 101};
    }

    static {
        A02();
    }

    public C1279Ux() {
        this(0);
    }

    public C1279Ux(int i10) {
        this(i10, Collections.emptyList());
    }

    public C1279Ux(int i10, List<Format> list) {
        this.A00 = i10;
        if (!A03(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.A00(null, A01(0, 19, 33), 0, null));
        }
        this.A01 = list;
    }

    private boolean A03(int i10) {
        return (this.A00 & i10) != 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0810Ch
    public final SparseArray<InterfaceC0812Cj> A4K() {
        return new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0810Ch
    public final InterfaceC0812Cj A4P(int i10, C0809Cg c0809Cg) {
        if (i10 == 2) {
            return new C1272Uo(new Uu());
        }
        if (i10 == 3 || i10 == 4) {
            return new C1272Uo(new C1273Up(c0809Cg.A01));
        }
        if (i10 == 15) {
            if (A03(2)) {
                return null;
            }
            return new C1272Uo(new Uy(false, c0809Cg.A01));
        }
        if (i10 == 17) {
            if (A03(2)) {
                return null;
            }
            return new C1272Uo(new C1274Uq(c0809Cg.A01));
        }
        if (i10 == 21) {
            return new C1272Uo(new C1275Ur());
        }
        if (i10 == 27) {
            if (A03(4)) {
                return null;
            }
            return new C1272Uo(new Ut(A00(c0809Cg), A03(1), A03(8)));
        }
        if (i10 == 36) {
            return new C1272Uo(new C1276Us(A00(c0809Cg)));
        }
        if (i10 != 89) {
            if (i10 != 138) {
                if (i10 != 129) {
                    if (i10 != 130) {
                        if (A03[7].charAt(7) != 'G') {
                            throw new RuntimeException();
                        }
                        A03[2] = "XLjLYE0qXOuIs9WeBuWhNfn9nKSLWrdd";
                        if (i10 == 134) {
                            if (A03(16)) {
                                return null;
                            }
                            return new C1269Ul(new C1268Uk());
                        }
                        if (i10 != 135) {
                            return null;
                        }
                    }
                }
                return new C1272Uo(new V1(c0809Cg.A01));
            }
            return new C1272Uo(new C1278Uw(c0809Cg.A01));
        }
        return new C1272Uo(new C1277Uv(c0809Cg.A02));
    }
}
