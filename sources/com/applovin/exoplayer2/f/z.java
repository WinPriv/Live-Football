package com.applovin.exoplayer2.f;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import b5.k;
import com.applovin.exoplayer2.f.g;
import d6.g0;
import e6.g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15097b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15098c;

    public /* synthetic */ z(int i10, Object obj, Object obj2) {
        this.f15096a = i10;
        this.f15097b = obj;
        this.f15098c = obj2;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        int i10 = this.f15096a;
        Object obj = this.f15098c;
        Object obj2 = this.f15097b;
        switch (i10) {
            case 0:
                ((m) obj2).a((g.c) obj, mediaCodec, j10, j11);
                return;
            case 1:
                ((b5.c) obj2).getClass();
                g.c cVar = (g.c) ((k.c) obj);
                cVar.getClass();
                if (g0.f27302a < 30) {
                    Handler handler = cVar.f27808s;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j10 >> 32), (int) j10));
                    return;
                } else {
                    cVar.a(j10);
                    return;
                }
            default:
                ((b5.r) obj2).getClass();
                g.c cVar2 = (g.c) ((k.c) obj);
                cVar2.getClass();
                if (g0.f27302a < 30) {
                    Handler handler2 = cVar2.f27808s;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j10 >> 32), (int) j10));
                    return;
                } else {
                    cVar2.a(j10);
                    return;
                }
        }
    }
}
