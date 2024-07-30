package com.anythink.expressad.exoplayer.l;

import com.anythink.expressad.exoplayer.k.p;
import com.anythink.expressad.exoplayer.k.s;
import com.anythink.expressad.exoplayer.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f9164a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9165b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9166c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9167d;

    /* renamed from: e, reason: collision with root package name */
    public final float f9168e;

    private a(List<byte[]> list, int i10, int i11, int i12, float f) {
        this.f9164a = list;
        this.f9165b = i10;
        this.f9166c = i11;
        this.f9167d = i12;
        this.f9168e = f;
    }

    public static a a(s sVar) {
        int i10;
        int i11;
        float f;
        try {
            sVar.d(4);
            int d10 = (sVar.d() & 3) + 1;
            if (d10 != 3) {
                ArrayList arrayList = new ArrayList();
                int d11 = sVar.d() & 31;
                for (int i12 = 0; i12 < d11; i12++) {
                    arrayList.add(b(sVar));
                }
                int d12 = sVar.d();
                for (int i13 = 0; i13 < d12; i13++) {
                    arrayList.add(b(sVar));
                }
                if (d11 > 0) {
                    p.b a10 = p.a((byte[]) arrayList.get(0), d10, ((byte[]) arrayList.get(0)).length);
                    int i14 = a10.f9106b;
                    int i15 = a10.f9107c;
                    f = a10.f9108d;
                    i10 = i14;
                    i11 = i15;
                } else {
                    i10 = -1;
                    i11 = -1;
                    f = 1.0f;
                }
                return new a(arrayList, d10, i10, i11, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new t("Error parsing AVC config", e10);
        }
    }

    private static byte[] b(s sVar) {
        int e10 = sVar.e();
        int c10 = sVar.c();
        sVar.d(e10);
        return com.anythink.expressad.exoplayer.k.d.a(sVar.f9123a, c10, e10);
    }
}
