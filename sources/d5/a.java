package d5;

import c5.c;
import c5.e;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import d6.v;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: AppInfoTableDecoder.java */
/* loaded from: classes2.dex */
public final class a extends e {
    @Override // c5.e
    public final Metadata g(c cVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 116) {
            return null;
        }
        v vVar = new v(byteBuffer.array(), byteBuffer.limit());
        vVar.m(12);
        int d10 = (vVar.d() + vVar.g(12)) - 4;
        vVar.m(44);
        vVar.n(vVar.g(12));
        vVar.m(16);
        ArrayList arrayList = new ArrayList();
        while (vVar.d() < d10) {
            vVar.m(48);
            int g6 = vVar.g(8);
            vVar.m(4);
            int d11 = vVar.d() + vVar.g(12);
            String str = null;
            String str2 = null;
            while (vVar.d() < d11) {
                int g10 = vVar.g(8);
                int g11 = vVar.g(8);
                int d12 = vVar.d() + g11;
                if (g10 == 2) {
                    int g12 = vVar.g(16);
                    vVar.m(8);
                    if (g12 != 3) {
                    }
                    while (vVar.d() < d12) {
                        int g13 = vVar.g(8);
                        Charset charset = i7.c.f29200a;
                        byte[] bArr = new byte[g13];
                        vVar.i(bArr, g13);
                        str = new String(bArr, charset);
                        int g14 = vVar.g(8);
                        for (int i10 = 0; i10 < g14; i10++) {
                            vVar.n(vVar.g(8));
                        }
                    }
                } else if (g10 == 21) {
                    Charset charset2 = i7.c.f29200a;
                    byte[] bArr2 = new byte[g11];
                    vVar.i(bArr2, g11);
                    str2 = new String(bArr2, charset2);
                }
                vVar.k(d12 * 8);
            }
            vVar.k(d11 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new AppInfoTable(g6, str.concat(str2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}
