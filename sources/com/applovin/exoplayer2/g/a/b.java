package com.applovin.exoplayer2.g.a;

import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.g.d;
import com.applovin.exoplayer2.g.g;
import com.applovin.exoplayer2.l.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b extends g {
    @Override // com.applovin.exoplayer2.g.g
    public com.applovin.exoplayer2.g.a a(d dVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return a(new x(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }

    private static com.applovin.exoplayer2.g.a a(x xVar) {
        xVar.b(12);
        int c10 = (xVar.c() + xVar.c(12)) - 4;
        xVar.b(44);
        xVar.e(xVar.c(12));
        xVar.b(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (xVar.c() >= c10) {
                break;
            }
            xVar.b(48);
            int c11 = xVar.c(8);
            xVar.b(4);
            int c12 = xVar.c() + xVar.c(12);
            String str2 = null;
            while (xVar.c() < c12) {
                int c13 = xVar.c(8);
                int c14 = xVar.c(8);
                int c15 = xVar.c() + c14;
                if (c13 == 2) {
                    int c16 = xVar.c(16);
                    xVar.b(8);
                    if (c16 != 3) {
                    }
                    while (xVar.c() < c15) {
                        str = xVar.a(xVar.c(8), Charsets.US_ASCII);
                        int c17 = xVar.c(8);
                        for (int i10 = 0; i10 < c17; i10++) {
                            xVar.e(xVar.c(8));
                        }
                    }
                } else if (c13 == 21) {
                    str2 = xVar.a(c14, Charsets.US_ASCII);
                }
                xVar.a(c15 * 8);
            }
            xVar.a(c12 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new a(c11, str.concat(str2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.applovin.exoplayer2.g.a(arrayList);
    }
}
