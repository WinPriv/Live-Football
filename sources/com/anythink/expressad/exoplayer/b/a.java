package com.anythink.expressad.exoplayer.b;

import com.anythink.expressad.foundation.h.m;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7317a = 16;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7318b = 10;

    /* renamed from: c, reason: collision with root package name */
    private static final int f7319c = 256;

    /* renamed from: d, reason: collision with root package name */
    private static final int f7320d = 1536;

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f7321e = {1, 2, 3, 6};
    private static final int[] f = {48000, 44100, 32000};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f7322g = {24000, 22050, 16000};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f7323h = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f7324i = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, m.a.f10162a, 512, 576, 640};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f7325j = {69, 87, 104, 121, 139, 174, 208, 243, com.anythink.expressad.foundation.g.a.aS, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: com.anythink.expressad.exoplayer.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0095a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f7326a = -1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f7327b = 0;

        /* renamed from: c, reason: collision with root package name */
        public static final int f7328c = 1;

        /* renamed from: d, reason: collision with root package name */
        public static final int f7329d = 2;

        /* renamed from: e, reason: collision with root package name */
        public final String f7330e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final int f7331g;

        /* renamed from: h, reason: collision with root package name */
        public final int f7332h;

        /* renamed from: i, reason: collision with root package name */
        public final int f7333i;

        /* renamed from: j, reason: collision with root package name */
        public final int f7334j;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.anythink.expressad.exoplayer.b.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public @interface InterfaceC0096a {
        }

        public /* synthetic */ C0095a(String str, int i10, int i11, int i12, int i13, int i14, byte b10) {
            this(str, i10, i11, i12, i13, i14);
        }

        private C0095a(String str, int i10, int i11, int i12, int i13, int i14) {
            this.f7330e = str;
            this.f = i10;
            this.f7332h = i11;
            this.f7331g = i12;
            this.f7333i = i13;
            this.f7334j = i14;
        }
    }

    private a() {
    }

    public static int a() {
        return f7320d;
    }

    public static com.anythink.expressad.exoplayer.m b(com.anythink.expressad.exoplayer.k.s sVar, String str, String str2, com.anythink.expressad.exoplayer.d.e eVar) {
        sVar.d(2);
        int i10 = f[(sVar.d() & 192) >> 6];
        int d10 = sVar.d();
        int i11 = f7323h[(d10 & 14) >> 1];
        if ((d10 & 1) != 0) {
            i11++;
        }
        if (((sVar.d() & 30) >> 1) > 0 && (2 & sVar.d()) != 0) {
            i11 += 2;
        }
        return com.anythink.expressad.exoplayer.m.a(str, (sVar.a() <= 0 || (sVar.d() & 1) == 0) ? com.anythink.expressad.exoplayer.k.o.A : com.anythink.expressad.exoplayer.k.o.B, null, -1, i11, i10, null, eVar, str2);
    }

    public static com.anythink.expressad.exoplayer.m a(com.anythink.expressad.exoplayer.k.s sVar, String str, String str2, com.anythink.expressad.exoplayer.d.e eVar) {
        int i10 = f[(sVar.d() & 192) >> 6];
        int d10 = sVar.d();
        int i11 = f7323h[(d10 & 56) >> 3];
        if ((d10 & 4) != 0) {
            i11++;
        }
        return com.anythink.expressad.exoplayer.m.a(str, com.anythink.expressad.exoplayer.k.o.f9090z, null, -1, i11, i10, null, eVar, str2);
    }

    private static C0095a a(com.anythink.expressad.exoplayer.k.r rVar) {
        int a10;
        int i10;
        int i11;
        String str;
        int i12;
        int c10;
        int i13;
        int i14;
        int b10 = rVar.b();
        rVar.b(40);
        boolean z10 = rVar.c(5) == 16;
        rVar.a(b10);
        int i15 = -1;
        if (z10) {
            rVar.b(16);
            int c11 = rVar.c(2);
            if (c11 == 0) {
                i15 = 0;
            } else if (c11 == 1) {
                i15 = 1;
            } else if (c11 == 2) {
                i15 = 2;
            }
            rVar.b(3);
            a10 = (rVar.c(11) + 1) * 2;
            int c12 = rVar.c(2);
            if (c12 == 3) {
                i13 = 6;
                i10 = f7322g[rVar.c(2)];
                c10 = 3;
            } else {
                c10 = rVar.c(2);
                i13 = f7321e[c10];
                i10 = f[c12];
            }
            i12 = i13 * 256;
            int c13 = rVar.c(3);
            boolean d10 = rVar.d();
            i11 = f7323h[c13] + (d10 ? 1 : 0);
            rVar.b(10);
            if (rVar.d()) {
                rVar.b(8);
            }
            if (c13 == 0) {
                rVar.b(5);
                if (rVar.d()) {
                    rVar.b(8);
                }
            }
            if (i15 == 1 && rVar.d()) {
                rVar.b(16);
            }
            if (rVar.d()) {
                if (c13 > 2) {
                    rVar.b(2);
                }
                if ((c13 & 1) != 0 && c13 > 2) {
                    rVar.b(6);
                }
                if ((c13 & 4) != 0) {
                    rVar.b(6);
                }
                if (d10 && rVar.d()) {
                    rVar.b(5);
                }
                if (i15 == 0) {
                    if (rVar.d()) {
                        rVar.b(6);
                    }
                    if (c13 == 0 && rVar.d()) {
                        rVar.b(6);
                    }
                    if (rVar.d()) {
                        rVar.b(6);
                    }
                    int c14 = rVar.c(2);
                    if (c14 == 1) {
                        rVar.b(5);
                    } else if (c14 == 2) {
                        rVar.b(12);
                    } else if (c14 == 3) {
                        int c15 = rVar.c(5);
                        if (rVar.d()) {
                            rVar.b(5);
                            if (rVar.d()) {
                                rVar.b(4);
                            }
                            if (rVar.d()) {
                                rVar.b(4);
                            }
                            if (rVar.d()) {
                                rVar.b(4);
                            }
                            if (rVar.d()) {
                                rVar.b(4);
                            }
                            if (rVar.d()) {
                                rVar.b(4);
                            }
                            if (rVar.d()) {
                                rVar.b(4);
                            }
                            if (rVar.d()) {
                                rVar.b(4);
                            }
                            if (rVar.d()) {
                                if (rVar.d()) {
                                    rVar.b(4);
                                }
                                if (rVar.d()) {
                                    rVar.b(4);
                                }
                            }
                        }
                        if (rVar.d()) {
                            rVar.b(5);
                            if (rVar.d()) {
                                rVar.b(7);
                                if (rVar.d()) {
                                    rVar.b(8);
                                }
                            }
                        }
                        rVar.b((c15 + 2) * 8);
                        rVar.e();
                    }
                    if (c13 < 2) {
                        if (rVar.d()) {
                            rVar.b(14);
                        }
                        if (c13 == 0 && rVar.d()) {
                            rVar.b(14);
                        }
                    }
                    if (rVar.d()) {
                        if (c10 == 0) {
                            rVar.b(5);
                        } else {
                            for (int i16 = 0; i16 < i13; i16++) {
                                if (rVar.d()) {
                                    rVar.b(5);
                                }
                            }
                        }
                    }
                }
            }
            if (rVar.d()) {
                rVar.b(5);
                if (c13 == 2) {
                    rVar.b(4);
                }
                if (c13 >= 6) {
                    rVar.b(2);
                }
                if (rVar.d()) {
                    rVar.b(8);
                }
                if (c13 == 0 && rVar.d()) {
                    rVar.b(8);
                }
                i14 = 3;
                if (c12 < 3) {
                    rVar.c();
                }
            } else {
                i14 = 3;
            }
            if (i15 == 0 && c10 != i14) {
                rVar.c();
            }
            if (i15 == 2 && (c10 == i14 || rVar.d())) {
                rVar.b(6);
            }
            str = (rVar.d() && rVar.c(6) == 1 && rVar.c(8) == 1) ? com.anythink.expressad.exoplayer.k.o.B : com.anythink.expressad.exoplayer.k.o.A;
        } else {
            rVar.b(32);
            int c16 = rVar.c(2);
            a10 = a(c16, rVar.c(6));
            rVar.b(8);
            int c17 = rVar.c(3);
            if ((c17 & 1) != 0 && c17 != 1) {
                rVar.b(2);
            }
            if ((c17 & 4) != 0) {
                rVar.b(2);
            }
            if (c17 == 2) {
                rVar.b(2);
            }
            i10 = f[c16];
            i11 = f7323h[c17] + (rVar.d() ? 1 : 0);
            str = com.anythink.expressad.exoplayer.k.o.f9090z;
            i12 = f7320d;
        }
        return new C0095a(str, i15, i11, i10, a10, i12, (byte) 0);
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i10 = position; i10 <= limit; i10++) {
            if ((byteBuffer.getInt(i10 + 4) & (-16777217)) == -1167101192) {
                return i10 - position;
            }
        }
        return -1;
    }

    private static int b(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                return 40 << ((bArr[(b10 & DefaultClassResolver.NAME) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    private static int a(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        byte b10 = bArr[4];
        return a((b10 & 192) >> 6, b10 & 63);
    }

    public static int a(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? f7321e[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    public static int a(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & DefaultClassResolver.NAME) == 187 ? 9 : 8)) >> 4) & 7);
    }

    private static int a(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f7325j;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return ((i11 % 2) + iArr2[i12]) * 2;
        }
        int i14 = f7324i[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }
}
