package com.facebook.ads.redexgen.X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: assets/audience_network.dex */
public final class Y3<K, V> extends C05752g<K, V> implements Map<K, V> {
    public AbstractC05722d<K, V> A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        A0D(super.A00 + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.androidx.support.v4.util.ArrayMap<K, V> */
    private AbstractC05722d<K, V> A00() {
        if (this.A00 == null) {
            this.A00 = new Y4(this);
        }
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.androidx.support.v4.util.ArrayMap<K, V> */
    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return A00().A0B();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.androidx.support.v4.util.ArrayMap<K, V> */
    @Override // java.util.Map
    public final Set<K> keySet() {
        return A00().A0C();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.androidx.support.v4.util.ArrayMap<K, V> */
    @Override // java.util.Map
    public final Collection<V> values() {
        return A00().A09();
    }
}
