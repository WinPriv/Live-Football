package com.applovin.exoplayer2.m;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.l.v;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f16381a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16382b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16383c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16384d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16385e;
    public final String f;

    private a(List<byte[]> list, int i10, int i11, int i12, float f, String str) {
        this.f16381a = list;
        this.f16382b = i10;
        this.f16383c = i11;
        this.f16384d = i12;
        this.f16385e = f;
        this.f = str;
    }

    public static a a(y yVar) throws ai {
        int i10;
        int i11;
        float f;
        String str;
        try {
            yVar.e(4);
            int h10 = (yVar.h() & 3) + 1;
            if (h10 != 3) {
                ArrayList arrayList = new ArrayList();
                int h11 = yVar.h() & 31;
                for (int i12 = 0; i12 < h11; i12++) {
                    arrayList.add(b(yVar));
                }
                int h12 = yVar.h();
                for (int i13 = 0; i13 < h12; i13++) {
                    arrayList.add(b(yVar));
                }
                if (h11 > 0) {
                    v.b a10 = v.a((byte[]) arrayList.get(0), h10, ((byte[]) arrayList.get(0)).length);
                    int i14 = a10.f16347e;
                    int i15 = a10.f;
                    float f10 = a10.f16348g;
                    str = com.applovin.exoplayer2.l.e.a(a10.f16343a, a10.f16344b, a10.f16345c);
                    i10 = i14;
                    i11 = i15;
                    f = f10;
                } else {
                    i10 = -1;
                    i11 = -1;
                    f = 1.0f;
                    str = null;
                }
                return new a(arrayList, h10, i10, i11, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ai.b("Error parsing AVC config", e10);
        }
    }

    private static byte[] b(y yVar) {
        int i10 = yVar.i();
        int c10 = yVar.c();
        yVar.e(i10);
        return com.applovin.exoplayer2.l.e.a(yVar.d(), c10, i10);
    }
}
