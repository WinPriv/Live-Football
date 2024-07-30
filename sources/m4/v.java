package m4;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.huawei.hms.ads.gl;
import java.nio.ByteBuffer;
import m4.f;

/* compiled from: FloatResamplingAudioProcessor.java */
/* loaded from: classes2.dex */
public final class v extends p {

    /* renamed from: i, reason: collision with root package name */
    public static final int f32861i = Float.floatToIntBits(Float.NaN);

    @Override // m4.f
    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer j10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f32791b.f32736c;
        int i12 = f32861i;
        if (i11 != 536870912) {
            if (i11 == 805306368) {
                j10 = j(i10);
                while (position < limit) {
                    int floatToIntBits = Float.floatToIntBits((float) (((byteBuffer.get(position) & DefaultClassResolver.NAME) | ((byteBuffer.get(position + 1) & DefaultClassResolver.NAME) << 8) | ((byteBuffer.get(position + 2) & DefaultClassResolver.NAME) << 16) | ((byteBuffer.get(position + 3) & DefaultClassResolver.NAME) << 24)) * 4.656612875245797E-10d));
                    if (floatToIntBits == i12) {
                        floatToIntBits = Float.floatToIntBits(gl.Code);
                    }
                    j10.putInt(floatToIntBits);
                    position += 4;
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            j10 = j((i10 / 3) * 4);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) ((((byteBuffer.get(position) & DefaultClassResolver.NAME) << 8) | ((byteBuffer.get(position + 1) & DefaultClassResolver.NAME) << 16) | ((byteBuffer.get(position + 2) & DefaultClassResolver.NAME) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == i12) {
                    floatToIntBits2 = Float.floatToIntBits(gl.Code);
                }
                j10.putInt(floatToIntBits2);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        j10.flip();
    }

    @Override // m4.p
    public final f.a f(f.a aVar) throws f.b {
        boolean z10;
        int i10 = aVar.f32736c;
        if (i10 != 536870912 && i10 != 805306368 && i10 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (i10 != 4) {
                return new f.a(aVar.f32734a, aVar.f32735b, 4);
            }
            return f.a.f32733e;
        }
        throw new f.b(aVar);
    }
}
