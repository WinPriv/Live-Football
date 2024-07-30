package com.facebook.ads.redexgen.X;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4C {
    public static String[] A01 = {"1CU3iw4Trc3qggngkxP7P26jEGLrLZaR", "qcH7HKgKdAybLTWn0rmK7JyCE0S9C8rn", "oNJ0dA1Zpt4CixMfeWT18n5RxX88Y0E3", "FZ8N3xW3PfzdZjJWrErZ2QIuE13XuJtD", "DvPOKoiXqOiYMgjx6IqCziqOSBLzEcJY", "MpMZeZ7xc490HXAXJonG5r1KTyiIoUHH", "NGMd8PbmdSzgSLgNcWdVjgLa", "jY1Ixh6DMe9BpV8yAbg842YJP45AQ2Eb"};
    public final C4B A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private int A00(List<C06073o> list) {
        boolean z10 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).A00 != 8) {
                z10 = true;
            } else if (z10) {
                return size;
            }
        }
        return -1;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A05(List<C06073o> list) {
        while (true) {
            int A00 = A00(list);
            if (A00 == -1) {
                return;
            } else {
                A01(list, A00, A00 + 1);
            }
        }
    }

    public C4C(C4B c4b) {
        this.A00 = c4b;
    }

    private void A01(List<C06073o> list, int i10, int i11) {
        C06073o c06073o = list.get(i10);
        C06073o nextOp = list.get(i11);
        int i12 = nextOp.A00;
        if (i12 != 1) {
            if (i12 == 2) {
                A03(list, i10, c06073o, i11, nextOp);
                return;
            } else {
                if (i12 == 4) {
                    A04(list, i10, c06073o, i11, nextOp);
                    return;
                }
                return;
            }
        }
        String[] strArr = A01;
        if (strArr[1].charAt(7) == strArr[5].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "aUQhN9RPINWHdtDS2haQB24BMlUHbr4B";
        strArr2[7] = "XOFwSchhjWWz78nEYYkf12AsjhBhdKRi";
        A02(list, i10, c06073o, i11, nextOp);
    }

    private void A02(List<C06073o> list, int i10, C06073o c06073o, int i11, C06073o c06073o2) {
        int i12 = 0;
        int i13 = c06073o.A01;
        int offset = c06073o2.A02;
        if (i13 < offset) {
            i12 = 0 - 1;
        }
        int i14 = c06073o.A02;
        int offset2 = c06073o2.A02;
        if (i14 < offset2) {
            i12++;
        }
        int i15 = c06073o2.A02;
        int offset3 = c06073o.A02;
        if (i15 <= offset3) {
            int i16 = c06073o.A02;
            int offset4 = c06073o2.A01;
            c06073o.A02 = i16 + offset4;
        }
        int i17 = c06073o2.A02;
        int offset5 = c06073o.A01;
        if (i17 <= offset5) {
            int i18 = c06073o.A01;
            int offset6 = c06073o2.A01;
            c06073o.A01 = i18 + offset6;
        }
        int offset7 = c06073o2.A02;
        c06073o2.A02 = offset7 + i12;
        list.set(i10, c06073o2);
        list.set(i11, c06073o);
    }

    private final void A03(List<C06073o> list, int i10, C06073o c06073o, int i11, C06073o c06073o2) {
        boolean z10;
        C06073o c06073o3 = null;
        boolean z11 = false;
        if (c06073o.A02 < c06073o.A01) {
            z10 = false;
            if (c06073o2.A02 == c06073o.A02 && c06073o2.A01 == c06073o.A01 - c06073o.A02) {
                z11 = true;
            }
        } else {
            z10 = true;
            if (c06073o2.A02 == c06073o.A01 + 1) {
                int remaining = c06073o2.A01;
                if (remaining == c06073o.A02 - c06073o.A01) {
                    z11 = true;
                }
            }
        }
        if (c06073o.A01 < c06073o2.A02) {
            c06073o2.A02--;
        } else {
            int remaining2 = c06073o.A01;
            if (remaining2 < c06073o2.A02 + c06073o2.A01) {
                c06073o2.A01--;
                c06073o.A00 = 2;
                c06073o.A01 = 1;
                int remaining3 = c06073o2.A01;
                if (A01[6].length() == 11) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[2] = "8AUTweiK2qHuqKAjuAP9RAHRjtqC9cI5";
                strArr[3] = "fxjAamJyQJjVOLb9u9QxKoC9co41mLuZ";
                if (remaining3 == 0) {
                    list.remove(i11);
                    this.A00.ADa(c06073o2);
                    return;
                }
                return;
            }
        }
        if (c06073o.A02 <= c06073o2.A02) {
            c06073o2.A02++;
        } else if (c06073o.A02 < c06073o2.A02 + c06073o2.A01) {
            int remaining4 = (c06073o2.A02 + c06073o2.A01) - c06073o.A02;
            c06073o3 = this.A00.A9h(2, c06073o.A02 + 1, remaining4, null);
            c06073o2.A01 = c06073o.A02 - c06073o2.A02;
        }
        if (z11) {
            list.set(i10, c06073o2);
            list.remove(i11);
            this.A00.ADa(c06073o);
            return;
        }
        if (z10) {
            if (c06073o3 != null) {
                if (c06073o.A02 > c06073o3.A02) {
                    c06073o.A02 -= c06073o3.A01;
                }
                if (c06073o.A01 > c06073o3.A02) {
                    c06073o.A01 -= c06073o3.A01;
                }
            }
            if (c06073o.A02 > c06073o2.A02) {
                c06073o.A02 -= c06073o2.A01;
            }
            if (c06073o.A01 > c06073o2.A02) {
                c06073o.A01 -= c06073o2.A01;
            }
        } else {
            if (c06073o3 != null) {
                if (c06073o.A02 >= c06073o3.A02) {
                    c06073o.A02 -= c06073o3.A01;
                }
                if (c06073o.A01 >= c06073o3.A02) {
                    c06073o.A01 -= c06073o3.A01;
                }
            }
            if (c06073o.A02 >= c06073o2.A02) {
                c06073o.A02 -= c06073o2.A01;
            }
            if (c06073o.A01 >= c06073o2.A02) {
                c06073o.A01 -= c06073o2.A01;
            }
        }
        list.set(i10, c06073o2);
        String[] strArr2 = A01;
        if (strArr2[1].charAt(7) == strArr2[5].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A01;
        strArr3[1] = "R1vl9Esi4EQuoIO0IEs3BYKA9Bp2yfIo";
        strArr3[5] = "ll7MLLjNdpT1F8Cd0W3dCYnGe1w6KT9M";
        if (c06073o.A02 != c06073o.A01) {
            list.set(i11, c06073o);
        } else {
            list.remove(i11);
        }
        if (c06073o3 != null) {
            list.add(i10, c06073o3);
        }
    }

    private final void A04(List<C06073o> list, int i10, C06073o c06073o, int i11, C06073o c06073o2) {
        C06073o c06073o3 = null;
        C06073o c06073o4 = null;
        if (c06073o.A01 < c06073o2.A02) {
            c06073o2.A02--;
        } else {
            int remaining = c06073o.A01;
            if (remaining < c06073o2.A02 + c06073o2.A01) {
                c06073o2.A01--;
                c06073o3 = this.A00.A9h(4, c06073o.A02, 1, c06073o2.A03);
            }
        }
        if (c06073o.A02 <= c06073o2.A02) {
            c06073o2.A02++;
        } else if (c06073o.A02 < c06073o2.A02 + c06073o2.A01) {
            int i12 = (c06073o2.A02 + c06073o2.A01) - c06073o.A02;
            c06073o4 = this.A00.A9h(4, c06073o.A02 + 1, i12, c06073o2.A03);
            c06073o2.A01 -= i12;
        }
        list.set(i11, c06073o);
        if (c06073o2.A01 > 0) {
            list.set(i10, c06073o2);
        } else {
            list.remove(i10);
            this.A00.ADa(c06073o2);
        }
        if (c06073o3 != null) {
            list.add(i10, c06073o3);
        }
        if (c06073o4 != null) {
            list.add(i10, c06073o4);
        }
    }
}
