package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class UX implements D2 {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.D2
    public final Metadata A4h(C9 c92) {
        ByteBuffer byteBuffer = c92.A01;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        HV hv = new HV(array, limit);
        String A0Q = hv.A0Q();
        String A0Q2 = hv.A0Q();
        long A0M = hv.A0M();
        return new Metadata(new EventMessage(A0Q, A0Q2, C0940Hl.A0F(hv.A0M(), 1000L, A0M), hv.A0M(), Arrays.copyOfRange(array, hv.A06(), limit), C0940Hl.A0F(hv.A0M(), 1000000L, A0M)));
    }
}
