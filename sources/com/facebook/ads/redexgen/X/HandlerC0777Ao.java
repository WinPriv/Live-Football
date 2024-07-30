package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.facebook.ads.redexgen.X.Ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class HandlerC0777Ao extends Handler {
    public final /* synthetic */ C1291Vk A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                this.A00.A0B(obj, obj2);
            } else {
                if (i10 != 1) {
                    return;
                }
                this.A00.A0A(obj, obj2);
            }
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ao != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostResponseHandler */
    public HandlerC0777Ao(C1291Vk c1291Vk, Looper looper) {
        super(looper);
        this.A00 = c1291Vk;
    }
}
