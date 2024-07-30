package com.anythink.expressad.exoplayer.g.c;

import com.anythink.expressad.exoplayer.g.a;
import com.anythink.expressad.exoplayer.k.ac;
import com.anythink.expressad.exoplayer.k.r;
import com.anythink.expressad.exoplayer.k.s;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c implements com.anythink.expressad.exoplayer.g.b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f8089a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f8090b = 4;

    /* renamed from: c, reason: collision with root package name */
    private static final int f8091c = 5;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8092d = 6;

    /* renamed from: e, reason: collision with root package name */
    private static final int f8093e = 255;
    private final s f = new s();

    /* renamed from: g, reason: collision with root package name */
    private final r f8094g = new r();

    /* renamed from: h, reason: collision with root package name */
    private ac f8095h;

    @Override // com.anythink.expressad.exoplayer.g.b
    public final com.anythink.expressad.exoplayer.g.a a(com.anythink.expressad.exoplayer.g.e eVar) {
        a.InterfaceC0105a eVar2;
        ac acVar = this.f8095h;
        if (acVar == null || eVar.f8127g != acVar.a()) {
            ac acVar2 = new ac(eVar.f);
            this.f8095h = acVar2;
            acVar2.b(eVar.f - eVar.f8127g);
        }
        ByteBuffer byteBuffer = eVar.f7594e;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f.a(array, limit);
        this.f8094g.a(array, limit);
        this.f8094g.b(39);
        long c10 = (this.f8094g.c(1) << 32) | this.f8094g.c(32);
        this.f8094g.b(20);
        int c11 = this.f8094g.c(12);
        int c12 = this.f8094g.c(8);
        this.f.d(14);
        if (c12 != 0) {
            if (c12 != 255) {
                if (c12 != 4) {
                    if (c12 != 5) {
                        if (c12 != 6) {
                            eVar2 = null;
                        } else {
                            eVar2 = g.a(this.f, c10, this.f8095h);
                        }
                    } else {
                        eVar2 = d.a(this.f, c10, this.f8095h);
                    }
                } else {
                    eVar2 = f.a(this.f);
                }
            } else {
                eVar2 = a.a(this.f, c11, c10);
            }
        } else {
            eVar2 = new e();
        }
        if (eVar2 == null) {
            return new com.anythink.expressad.exoplayer.g.a(new a.InterfaceC0105a[0]);
        }
        return new com.anythink.expressad.exoplayer.g.a(eVar2);
    }
}
