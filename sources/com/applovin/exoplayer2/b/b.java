package com.applovin.exoplayer2.b;

import com.anythink.expressad.foundation.h.m;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f13336a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f13337b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f13338c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f13339d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f13340e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, m.a.f10162a, 512, 576, 640};
    private static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, com.anythink.expressad.foundation.g.a.aS, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f13341a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13342b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13343c;

        /* renamed from: d, reason: collision with root package name */
        public final int f13344d;

        /* renamed from: e, reason: collision with root package name */
        public final int f13345e;
        public final int f;

        private a(String str, int i10, int i11, int i12, int i13, int i14) {
            this.f13341a = str;
            this.f13342b = i10;
            this.f13344d = i11;
            this.f13343c = i12;
            this.f13345e = i13;
            this.f = i14;
        }
    }

    public static com.applovin.exoplayer2.v a(com.applovin.exoplayer2.l.y yVar, String str, String str2, com.applovin.exoplayer2.d.e eVar) {
        int i10 = f13337b[(yVar.h() & 192) >> 6];
        int h10 = yVar.h();
        int i11 = f13339d[(h10 & 56) >> 3];
        if ((h10 & 4) != 0) {
            i11++;
        }
        return new v.a().a(str).f(com.anythink.expressad.exoplayer.k.o.f9090z).k(i11).l(i10).a(eVar).c(str2).a();
    }

    public static com.applovin.exoplayer2.v b(com.applovin.exoplayer2.l.y yVar, String str, String str2, com.applovin.exoplayer2.d.e eVar) {
        yVar.e(2);
        int i10 = f13337b[(yVar.h() & 192) >> 6];
        int h10 = yVar.h();
        int i11 = f13339d[(h10 & 14) >> 1];
        if ((h10 & 1) != 0) {
            i11++;
        }
        if (((yVar.h() & 30) >> 1) > 0 && (2 & yVar.h()) != 0) {
            i11 += 2;
        }
        return new v.a().a(str).f((yVar.a() <= 0 || (yVar.h() & 1) == 0) ? com.anythink.expressad.exoplayer.k.o.A : com.anythink.expressad.exoplayer.k.o.B).k(i11).l(i10).a(eVar).c(str2).a();
    }

    public static a a(com.applovin.exoplayer2.l.x xVar) {
        int a10;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int c10;
        int i14;
        int i15;
        int i16;
        int i17;
        int b10 = xVar.b();
        xVar.b(40);
        boolean z10 = xVar.c(5) > 10;
        xVar.a(b10);
        int i18 = -1;
        if (z10) {
            xVar.b(16);
            int c11 = xVar.c(2);
            if (c11 == 0) {
                i18 = 0;
            } else if (c11 == 1) {
                i18 = 1;
            } else if (c11 == 2) {
                i18 = 2;
            }
            xVar.b(3);
            a10 = (xVar.c(11) + 1) * 2;
            int c12 = xVar.c(2);
            if (c12 == 3) {
                i10 = f13338c[xVar.c(2)];
                i14 = 6;
                c10 = 3;
            } else {
                c10 = xVar.c(2);
                i14 = f13336a[c10];
                i10 = f13337b[c12];
            }
            i12 = i14 * 256;
            int c13 = xVar.c(3);
            boolean e10 = xVar.e();
            i11 = f13339d[c13] + (e10 ? 1 : 0);
            xVar.b(10);
            if (xVar.e()) {
                xVar.b(8);
            }
            if (c13 == 0) {
                xVar.b(5);
                if (xVar.e()) {
                    xVar.b(8);
                }
            }
            if (i18 == 1 && xVar.e()) {
                xVar.b(16);
            }
            if (xVar.e()) {
                if (c13 > 2) {
                    xVar.b(2);
                }
                if ((c13 & 1) == 0 || c13 <= 2) {
                    i16 = 6;
                } else {
                    i16 = 6;
                    xVar.b(6);
                }
                if ((c13 & 4) != 0) {
                    xVar.b(i16);
                }
                if (e10 && xVar.e()) {
                    xVar.b(5);
                }
                if (i18 == 0) {
                    if (xVar.e()) {
                        i17 = 6;
                        xVar.b(6);
                    } else {
                        i17 = 6;
                    }
                    if (c13 == 0 && xVar.e()) {
                        xVar.b(i17);
                    }
                    if (xVar.e()) {
                        xVar.b(i17);
                    }
                    int c14 = xVar.c(2);
                    if (c14 == 1) {
                        xVar.b(5);
                    } else if (c14 == 2) {
                        xVar.b(12);
                    } else if (c14 == 3) {
                        int c15 = xVar.c(5);
                        if (xVar.e()) {
                            xVar.b(5);
                            if (xVar.e()) {
                                xVar.b(4);
                            }
                            if (xVar.e()) {
                                xVar.b(4);
                            }
                            if (xVar.e()) {
                                xVar.b(4);
                            }
                            if (xVar.e()) {
                                xVar.b(4);
                            }
                            if (xVar.e()) {
                                xVar.b(4);
                            }
                            if (xVar.e()) {
                                xVar.b(4);
                            }
                            if (xVar.e()) {
                                xVar.b(4);
                            }
                            if (xVar.e()) {
                                if (xVar.e()) {
                                    xVar.b(4);
                                }
                                if (xVar.e()) {
                                    xVar.b(4);
                                }
                            }
                        }
                        if (xVar.e()) {
                            xVar.b(5);
                            if (xVar.e()) {
                                xVar.b(7);
                                if (xVar.e()) {
                                    xVar.b(8);
                                }
                            }
                        }
                        xVar.b((c15 + 2) * 8);
                        xVar.f();
                    }
                    if (c13 < 2) {
                        if (xVar.e()) {
                            xVar.b(14);
                        }
                        if (c13 == 0 && xVar.e()) {
                            xVar.b(14);
                        }
                    }
                    if (xVar.e()) {
                        if (c10 == 0) {
                            xVar.b(5);
                        } else {
                            for (int i19 = 0; i19 < i14; i19++) {
                                if (xVar.e()) {
                                    xVar.b(5);
                                }
                            }
                        }
                    }
                }
            }
            if (xVar.e()) {
                xVar.b(5);
                if (c13 == 2) {
                    xVar.b(4);
                }
                if (c13 >= 6) {
                    xVar.b(2);
                }
                if (xVar.e()) {
                    xVar.b(8);
                }
                if (c13 == 0 && xVar.e()) {
                    xVar.b(8);
                }
                if (c12 < 3) {
                    xVar.d();
                }
            }
            if (i18 == 0 && c10 != 3) {
                xVar.d();
            }
            if (i18 == 2 && (c10 == 3 || xVar.e())) {
                i15 = 6;
                xVar.b(6);
            } else {
                i15 = 6;
            }
            str = (xVar.e() && xVar.c(i15) == 1 && xVar.c(8) == 1) ? com.anythink.expressad.exoplayer.k.o.B : com.anythink.expressad.exoplayer.k.o.A;
            i13 = i18;
        } else {
            xVar.b(32);
            int c16 = xVar.c(2);
            String str2 = c16 == 3 ? null : com.anythink.expressad.exoplayer.k.o.f9090z;
            a10 = a(c16, xVar.c(6));
            xVar.b(8);
            int c17 = xVar.c(3);
            if ((c17 & 1) != 0 && c17 != 1) {
                xVar.b(2);
            }
            if ((c17 & 4) != 0) {
                xVar.b(2);
            }
            if (c17 == 2) {
                xVar.b(2);
            }
            int[] iArr = f13337b;
            i10 = c16 < iArr.length ? iArr[c16] : -1;
            i11 = f13339d[c17] + (xVar.e() ? 1 : 0);
            i12 = 1536;
            i13 = -1;
            str = str2;
        }
        return new a(str, i13, i11, i10, a10, i12);
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i10 = position; i10 <= limit; i10++) {
            if ((ai.a(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - position;
            }
        }
        return -1;
    }

    public static int b(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                return 40 << ((bArr[(b10 & DefaultClassResolver.NAME) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & DefaultClassResolver.NAME) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return a((b10 & 192) >> 6, b10 & 63);
    }

    public static int a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f13336a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int a(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & DefaultClassResolver.NAME) == 187 ? 9 : 8)) >> 4) & 7);
    }

    private static int a(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f13337b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return ((i11 % 2) + iArr2[i12]) * 2;
        }
        int i14 = f13340e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }
}
