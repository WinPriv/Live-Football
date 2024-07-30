package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f14915a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14916b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14917c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14918d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14919e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14920g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14921h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14922i;

    /* renamed from: j, reason: collision with root package name */
    public final long f14923j;

    /* renamed from: k, reason: collision with root package name */
    public final a f14924k;

    /* renamed from: l, reason: collision with root package name */
    private final com.applovin.exoplayer2.g.a f14925l;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f14926a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f14927b;

        public a(long[] jArr, long[] jArr2) {
            this.f14926a = jArr;
            this.f14927b = jArr2;
        }
    }

    public p(byte[] bArr, int i10) {
        com.applovin.exoplayer2.l.x xVar = new com.applovin.exoplayer2.l.x(bArr);
        xVar.a(i10 * 8);
        this.f14915a = xVar.c(16);
        this.f14916b = xVar.c(16);
        this.f14917c = xVar.c(24);
        this.f14918d = xVar.c(24);
        int c10 = xVar.c(20);
        this.f14919e = c10;
        this.f = a(c10);
        this.f14920g = xVar.c(3) + 1;
        int c11 = xVar.c(5) + 1;
        this.f14921h = c11;
        this.f14922i = b(c11);
        this.f14923j = xVar.d(36);
        this.f14924k = null;
        this.f14925l = null;
    }

    private static int a(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static int b(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    public long a() {
        long j10 = this.f14923j;
        return j10 == 0 ? com.anythink.expressad.exoplayer.b.f7291b : (j10 * 1000000) / this.f14919e;
    }

    public long b() {
        long j10;
        long j11;
        int i10 = this.f14918d;
        if (i10 > 0) {
            j10 = (i10 + this.f14917c) / 2;
            j11 = 1;
        } else {
            int i11 = this.f14915a;
            j10 = ((((i11 != this.f14916b || i11 <= 0) ? 4096L : i11) * this.f14920g) * this.f14921h) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public long a(long j10) {
        return ai.a((j10 * this.f14919e) / 1000000, 0L, this.f14923j - 1);
    }

    public com.applovin.exoplayer2.v a(byte[] bArr, com.applovin.exoplayer2.g.a aVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f14918d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new v.a().f(com.anythink.expressad.exoplayer.k.o.K).f(i10).k(this.f14920g).l(this.f14919e).a(Collections.singletonList(bArr)).a(a(aVar)).a();
    }

    public p b(List<com.applovin.exoplayer2.g.c.a> list) {
        return new p(this.f14915a, this.f14916b, this.f14917c, this.f14918d, this.f14919e, this.f14920g, this.f14921h, this.f14923j, this.f14924k, a(a((List<String>) Collections.emptyList(), list)));
    }

    private p(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, com.applovin.exoplayer2.g.a aVar2) {
        this.f14915a = i10;
        this.f14916b = i11;
        this.f14917c = i12;
        this.f14918d = i13;
        this.f14919e = i14;
        this.f = a(i14);
        this.f14920g = i15;
        this.f14921h = i16;
        this.f14922i = b(i16);
        this.f14923j = j10;
        this.f14924k = aVar;
        this.f14925l = aVar2;
    }

    public com.applovin.exoplayer2.g.a a(com.applovin.exoplayer2.g.a aVar) {
        com.applovin.exoplayer2.g.a aVar2 = this.f14925l;
        return aVar2 == null ? aVar : aVar2.a(aVar);
    }

    public p a(a aVar) {
        return new p(this.f14915a, this.f14916b, this.f14917c, this.f14918d, this.f14919e, this.f14920g, this.f14921h, this.f14923j, aVar, this.f14925l);
    }

    public p a(List<String> list) {
        return new p(this.f14915a, this.f14916b, this.f14917c, this.f14918d, this.f14919e, this.f14920g, this.f14921h, this.f14923j, this.f14924k, a(a(list, (List<com.applovin.exoplayer2.g.c.a>) Collections.emptyList())));
    }

    private static com.applovin.exoplayer2.g.a a(List<String> list, List<com.applovin.exoplayer2.g.c.a> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] b10 = ai.b(str, ContainerUtils.KEY_VALUE_DELIMITER);
            if (b10.length != 2) {
                a3.l.D("Failed to parse Vorbis comment: ", str, "FlacStreamMetadata");
            } else {
                arrayList.add(new com.applovin.exoplayer2.g.c.b(b10[0], b10[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.applovin.exoplayer2.g.a(arrayList);
    }
}
