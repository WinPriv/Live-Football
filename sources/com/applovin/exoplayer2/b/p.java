package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.b.f;
import com.applovin.exoplayer2.l.ai;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.huawei.hms.ads.gl;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class p extends l {

    /* renamed from: d, reason: collision with root package name */
    private static final int f13495d = Float.floatToIntBits(Float.NaN);

    @Override // com.applovin.exoplayer2.b.f
    public void a(ByteBuffer byteBuffer) {
        ByteBuffer a10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f13434b.f13384d;
        if (i11 == 536870912) {
            a10 = a((i10 / 3) * 4);
            while (position < limit) {
                a(((byteBuffer.get(position) & DefaultClassResolver.NAME) << 8) | ((byteBuffer.get(position + 1) & DefaultClassResolver.NAME) << 16) | ((byteBuffer.get(position + 2) & DefaultClassResolver.NAME) << 24), a10);
                position += 3;
            }
        } else if (i11 == 805306368) {
            a10 = a(i10);
            while (position < limit) {
                a((byteBuffer.get(position) & DefaultClassResolver.NAME) | ((byteBuffer.get(position + 1) & DefaultClassResolver.NAME) << 8) | ((byteBuffer.get(position + 2) & DefaultClassResolver.NAME) << 16) | ((byteBuffer.get(position + 3) & DefaultClassResolver.NAME) << 24), a10);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        a10.flip();
    }

    @Override // com.applovin.exoplayer2.b.l
    public f.a b(f.a aVar) throws f.b {
        int i10 = aVar.f13384d;
        if (ai.e(i10)) {
            if (i10 != 4) {
                return new f.a(aVar.f13382b, aVar.f13383c, 4);
            }
            return f.a.f13381a;
        }
        throw new f.b(aVar);
    }

    private static void a(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == f13495d) {
            floatToIntBits = Float.floatToIntBits(gl.Code);
        }
        byteBuffer.putInt(floatToIntBits);
    }
}
