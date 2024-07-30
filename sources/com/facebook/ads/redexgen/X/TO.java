package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import com.huawei.hms.ads.gl;

/* loaded from: assets/audience_network.dex */
public final class TO implements II {
    public static String[] A02 = {"AMQNzlG2eGPOJo74lPpddO6twtMEce", "8uZuLGh3CZSzV4eSaK74M9a8aAW81o1g", "CYs8BZmCr6kO5jRRUq4laItl384RlovT", "PO4hUmmCpilEicL1R3sLdD9hI0Kiey5Z", "WmgRsP13YsLJamj9MMjVCco3tjnpIVCq", "0ErvOAeoLZJf3MJzf6jF5Cw5BrHPqp", "S0kgbIpbc64QMPj8XCJtTK8zDrzNpUnW", "MO6xPizLQkqntlkNHRrNVg7dZ2stU5UP"};
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private boolean A01(C1407a3<IJ, IO> c1407a3, InterfaceC1396Zs interfaceC1396Zs) {
        float f = -1.0f;
        try {
            f = interfaceC1396Zs.A7p(c1407a3);
        } catch (IllegalStateException unused) {
        }
        if (f > gl.Code && A00(c1407a3)) {
            return true;
        }
        if (c1407a3.A01.A00().getGlobalVisibleRect(this.A01) && this.A01.bottom - this.A01.top > 0 && A00(c1407a3)) {
            return true;
        }
        interfaceC1396Zs.A7o(this.A00);
        interfaceC1396Zs.A6h(c1407a3, this.A01);
        return (this.A00.bottom - this.A00.top > 0 && this.A01.bottom - this.A00.top > 0) && A00(c1407a3);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a3 != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public static boolean A00(C1407a3<IJ, IO> c1407a3) {
        if (c1407a3.A01.A05()) {
            return c1407a3.A02.A07();
        }
        if (!c1407a3.A01.A06()) {
            return true;
        }
        IO io2 = c1407a3.A02;
        String[] strArr = A02;
        if (strArr[3].charAt(7) != strArr[2].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "8O0EOVeCMdEJdeSbYPFIeNjJXhTUSITs";
        strArr2[2] = "Km62DwbCV8Ma1ecjtuIU72b1y8KakI9d";
        return io2.A06();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.a3 != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public final void A02(C1407a3<IJ, IO> c1407a3, InterfaceC1396Zs interfaceC1396Zs) {
        if (c1407a3.A02.A04() && A01(c1407a3, interfaceC1396Zs)) {
            c1407a3.A02.A01();
            c1407a3.A01.A02().A9B(c1407a3.A01.A03(), c1407a3.A01.A04());
        }
        if (c1407a3.A02.A05() && ID.A18(c1407a3.A01.A01())) {
            c1407a3.A02.A02();
            c1407a3.A01.A02().A91(c1407a3.A01.A03(), c1407a3.A01.A04());
        }
    }
}
