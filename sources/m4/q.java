package m4;

import java.nio.ByteBuffer;
import m4.f;

/* compiled from: ChannelMappingAudioProcessor.java */
/* loaded from: classes2.dex */
public final class q extends p {

    /* renamed from: i, reason: collision with root package name */
    public int[] f32797i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f32798j;

    @Override // m4.f
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = this.f32798j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j10 = j(((limit - position) / this.f32791b.f32737d) * this.f32792c.f32737d);
        while (position < limit) {
            for (int i10 : iArr) {
                j10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f32791b.f32737d;
        }
        byteBuffer.position(limit);
        j10.flip();
    }

    @Override // m4.p
    public final f.a f(f.a aVar) throws f.b {
        boolean z10;
        boolean z11;
        int[] iArr = this.f32797i;
        if (iArr == null) {
            return f.a.f32733e;
        }
        if (aVar.f32736c == 2) {
            int length = iArr.length;
            int i10 = aVar.f32735b;
            if (i10 != length) {
                z10 = true;
            } else {
                z10 = false;
            }
            for (int i11 = 0; i11 < iArr.length; i11++) {
                int i12 = iArr[i11];
                if (i12 < i10) {
                    if (i12 != i11) {
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
                return new f.a(aVar.f32734a, iArr.length, 2);
            }
            return f.a.f32733e;
        }
        throw new f.b(aVar);
    }

    @Override // m4.p
    public final void g() {
        this.f32798j = this.f32797i;
    }

    @Override // m4.p
    public final void i() {
        this.f32798j = null;
        this.f32797i = null;
    }
}
