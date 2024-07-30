package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.b.f;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class m extends l {

    /* renamed from: d, reason: collision with root package name */
    private int[] f13440d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f13441e;

    public void a(int[] iArr) {
        this.f13440d = iArr;
    }

    @Override // com.applovin.exoplayer2.b.l
    public f.a b(f.a aVar) throws f.b {
        boolean z10;
        boolean z11;
        int[] iArr = this.f13440d;
        if (iArr == null) {
            return f.a.f13381a;
        }
        if (aVar.f13384d == 2) {
            if (aVar.f13383c != iArr.length) {
                z10 = true;
            } else {
                z10 = false;
            }
            for (int i10 = 0; i10 < iArr.length; i10++) {
                int i11 = iArr[i10];
                if (i11 < aVar.f13383c) {
                    if (i11 != i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10 |= z11;
                } else {
                    throw new f.b(aVar);
                }
            }
            if (z10) {
                return new f.a(aVar.f13382b, iArr.length, 2);
            }
            return f.a.f13381a;
        }
        throw new f.b(aVar);
    }

    @Override // com.applovin.exoplayer2.b.l
    public void i() {
        this.f13441e = this.f13440d;
    }

    @Override // com.applovin.exoplayer2.b.l
    public void j() {
        this.f13441e = null;
        this.f13440d = null;
    }

    @Override // com.applovin.exoplayer2.b.f
    public void a(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) com.applovin.exoplayer2.l.a.b(this.f13441e);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer a10 = a(((limit - position) / this.f13434b.f13385e) * this.f13435c.f13385e);
        while (position < limit) {
            for (int i10 : iArr) {
                a10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f13434b.f13385e;
        }
        byteBuffer.position(limit);
        a10.flip();
    }
}
