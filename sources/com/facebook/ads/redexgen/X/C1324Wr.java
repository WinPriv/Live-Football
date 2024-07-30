package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Wr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1324Wr implements AnonymousClass62 {
    public final Map<String, AnonymousClass60> A00 = new HashMap();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass62
    public final synchronized String ADv() {
        StringBuilder sb2;
        sb2 = new StringBuilder();
        Iterator<AnonymousClass60> it = this.A00.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
            sb2.append('\n');
        }
        return sb2.toString();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass62
    public final synchronized void reset() {
        this.A00.clear();
    }
}
