package com.applovin.exoplayer2.g.g;

import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c extends com.applovin.exoplayer2.g.g {

    /* renamed from: a, reason: collision with root package name */
    private final y f15205a = new y();

    /* renamed from: b, reason: collision with root package name */
    private final x f15206b = new x();

    /* renamed from: c, reason: collision with root package name */
    private ag f15207c;

    @Override // com.applovin.exoplayer2.g.g
    public com.applovin.exoplayer2.g.a a(com.applovin.exoplayer2.g.d dVar, ByteBuffer byteBuffer) {
        a.InterfaceC0172a eVar;
        ag agVar = this.f15207c;
        if (agVar == null || dVar.f != agVar.c()) {
            ag agVar2 = new ag(dVar.f13647d);
            this.f15207c = agVar2;
            agVar2.c(dVar.f13647d - dVar.f);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f15205a.a(array, limit);
        this.f15206b.a(array, limit);
        this.f15206b.b(39);
        long c10 = (this.f15206b.c(1) << 32) | this.f15206b.c(32);
        this.f15206b.b(20);
        int c11 = this.f15206b.c(12);
        int c12 = this.f15206b.c(8);
        this.f15205a.e(14);
        if (c12 != 0) {
            if (c12 != 255) {
                if (c12 != 4) {
                    if (c12 != 5) {
                        if (c12 != 6) {
                            eVar = null;
                        } else {
                            eVar = g.a(this.f15205a, c10, this.f15207c);
                        }
                    } else {
                        eVar = d.a(this.f15205a, c10, this.f15207c);
                    }
                } else {
                    eVar = f.a(this.f15205a);
                }
            } else {
                eVar = a.a(this.f15205a, c11, c10);
            }
        } else {
            eVar = new e();
        }
        if (eVar == null) {
            return new com.applovin.exoplayer2.g.a(new a.InterfaceC0172a[0]);
        }
        return new com.applovin.exoplayer2.g.a(eVar);
    }
}
