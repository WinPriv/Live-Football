package com.applovin.exoplayer2.m;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.l.v;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.l.z;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f16461a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16462b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16463c;

    private f(List<byte[]> list, int i10, String str) {
        this.f16461a = list;
        this.f16462b = i10;
        this.f16463c = str;
    }

    public static f a(y yVar) throws ai {
        List singletonList;
        try {
            yVar.e(21);
            int h10 = yVar.h() & 3;
            int h11 = yVar.h();
            int c10 = yVar.c();
            int i10 = 0;
            for (int i11 = 0; i11 < h11; i11++) {
                yVar.e(1);
                int i12 = yVar.i();
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = yVar.i();
                    i10 += i14 + 4;
                    yVar.e(i14);
                }
            }
            yVar.d(c10);
            byte[] bArr = new byte[i10];
            int i15 = 0;
            String str = null;
            for (int i16 = 0; i16 < h11; i16++) {
                int h12 = yVar.h() & com.anythink.expressad.video.module.a.a.R;
                int i17 = yVar.i();
                for (int i18 = 0; i18 < i17; i18++) {
                    int i19 = yVar.i();
                    byte[] bArr2 = v.f16336a;
                    System.arraycopy(bArr2, 0, bArr, i15, bArr2.length);
                    int length = i15 + bArr2.length;
                    System.arraycopy(yVar.d(), yVar.c(), bArr, length, i19);
                    if (h12 == 33 && i18 == 0) {
                        str = com.applovin.exoplayer2.l.e.a(new z(bArr, length, length + i19));
                    }
                    i15 = length + i19;
                    yVar.e(i19);
                }
            }
            if (i10 == 0) {
                singletonList = null;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new f(singletonList, h10 + 1, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ai.b("Error parsing HEVC config", e10);
        }
    }
}
