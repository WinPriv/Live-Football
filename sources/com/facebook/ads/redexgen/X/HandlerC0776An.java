package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.facebook.ads.redexgen.X.An, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class HandlerC0776An extends Handler {
    public final /* synthetic */ C1291Vk A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private boolean A01(Message message) {
        int i10;
        if (!(message.arg1 == 1)) {
            return false;
        }
        int i11 = message.arg2 + 1;
        i10 = this.A00.A0D;
        if (i11 > i10) {
            return false;
        }
        Message obtain = Message.obtain(message);
        obtain.arg2 = i11;
        sendMessageDelayed(obtain, A00(i11));
        return true;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 8
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
            Object obj = message.obj;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    e = this.A00.A0B.executeProvisionRequest(this.A00.A0C, (BE) obj);
                } else {
                    if (i10 != 1) {
                        throw new RuntimeException();
                    }
                    Pair pair = (Pair) obj;
                    e = this.A00.A0B.executeKeyRequest(this.A00.A0C, (BA) pair.first, (String) pair.second);
                }
            } catch (Exception e10) {
                e = e10;
                if (A01(message)) {
                    return;
                }
            }
            this.A00.A0A.obtainMessage(message.what, Pair.create(obj, e)).sendToTarget();
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.An != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostRequestHandler */
    public HandlerC0776An(C1291Vk c1291Vk, Looper looper) {
        super(looper);
        this.A00 = c1291Vk;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.An != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostRequestHandler */
    private long A00(int i10) {
        return Math.min((i10 - 1) * 1000, 5000);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.An != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T>$PostRequestHandler */
    public final void A02(int i10, Object obj, boolean z10) {
        obtainMessage(i10, z10 ? 1 : 0, 0, obj).sendToTarget();
    }
}
