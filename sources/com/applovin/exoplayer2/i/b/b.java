package com.applovin.exoplayer2.i.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.anythink.expressad.exoplayer.k.p;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f15620a = {0, 7, 8, Ascii.SI};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f15621b = {0, 119, -120, -1};

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f15622c = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: d, reason: collision with root package name */
    private final Paint f15623d;

    /* renamed from: e, reason: collision with root package name */
    private final Paint f15624e;
    private final Canvas f;

    /* renamed from: g, reason: collision with root package name */
    private final C0179b f15625g;

    /* renamed from: h, reason: collision with root package name */
    private final a f15626h;

    /* renamed from: i, reason: collision with root package name */
    private final h f15627i;

    /* renamed from: j, reason: collision with root package name */
    private Bitmap f15628j;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f15629a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f15630b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f15631c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f15632d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f15629a = i10;
            this.f15630b = iArr;
            this.f15631c = iArr2;
            this.f15632d = iArr3;
        }
    }

    /* renamed from: com.applovin.exoplayer2.i.b.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0179b {

        /* renamed from: a, reason: collision with root package name */
        public final int f15633a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15634b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15635c;

        /* renamed from: d, reason: collision with root package name */
        public final int f15636d;

        /* renamed from: e, reason: collision with root package name */
        public final int f15637e;
        public final int f;

        public C0179b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f15633a = i10;
            this.f15634b = i11;
            this.f15635c = i12;
            this.f15636d = i13;
            this.f15637e = i14;
            this.f = i15;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f15638a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f15639b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f15640c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f15641d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f15638a = i10;
            this.f15639b = z10;
            this.f15640c = bArr;
            this.f15641d = bArr2;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f15642a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15643b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15644c;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<e> f15645d;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f15642a = i10;
            this.f15643b = i11;
            this.f15644c = i12;
            this.f15645d = sparseArray;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f15646a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15647b;

        public e(int i10, int i11) {
            this.f15646a = i10;
            this.f15647b = i11;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f15648a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f15649b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15650c;

        /* renamed from: d, reason: collision with root package name */
        public final int f15651d;

        /* renamed from: e, reason: collision with root package name */
        public final int f15652e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final int f15653g;

        /* renamed from: h, reason: collision with root package name */
        public final int f15654h;

        /* renamed from: i, reason: collision with root package name */
        public final int f15655i;

        /* renamed from: j, reason: collision with root package name */
        public final int f15656j;

        /* renamed from: k, reason: collision with root package name */
        public final SparseArray<g> f15657k;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f15648a = i10;
            this.f15649b = z10;
            this.f15650c = i11;
            this.f15651d = i12;
            this.f15652e = i13;
            this.f = i14;
            this.f15653g = i15;
            this.f15654h = i16;
            this.f15655i = i17;
            this.f15656j = i18;
            this.f15657k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray<g> sparseArray = fVar.f15657k;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                this.f15657k.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f15658a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15659b;

        /* renamed from: c, reason: collision with root package name */
        public final int f15660c;

        /* renamed from: d, reason: collision with root package name */
        public final int f15661d;

        /* renamed from: e, reason: collision with root package name */
        public final int f15662e;
        public final int f;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f15658a = i10;
            this.f15659b = i11;
            this.f15660c = i12;
            this.f15661d = i13;
            this.f15662e = i14;
            this.f = i15;
        }
    }

    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f15663a;

        /* renamed from: b, reason: collision with root package name */
        public final int f15664b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f15665c = new SparseArray<>();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<a> f15666d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f15667e = new SparseArray<>();
        public final SparseArray<a> f = new SparseArray<>();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f15668g = new SparseArray<>();

        /* renamed from: h, reason: collision with root package name */
        public C0179b f15669h;

        /* renamed from: i, reason: collision with root package name */
        public d f15670i;

        public h(int i10, int i11) {
            this.f15663a = i10;
            this.f15664b = i11;
        }

        public void a() {
            this.f15665c.clear();
            this.f15666d.clear();
            this.f15667e.clear();
            this.f.clear();
            this.f15668g.clear();
            this.f15669h = null;
            this.f15670i = null;
        }
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f15623d = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f15624e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f = new Canvas();
        this.f15625g = new C0179b(719, 575, 0, 719, 0, 575);
        this.f15626h = new a(0, b(), c(), d());
        this.f15627i = new h(i10, i11);
    }

    private static int a(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static f b(x xVar, int i10) {
        int c10;
        int c11;
        int c12 = xVar.c(8);
        xVar.b(4);
        boolean e10 = xVar.e();
        xVar.b(3);
        int i11 = 16;
        int c13 = xVar.c(16);
        int c14 = xVar.c(16);
        int c15 = xVar.c(3);
        int c16 = xVar.c(3);
        int i12 = 2;
        xVar.b(2);
        int c17 = xVar.c(8);
        int c18 = xVar.c(8);
        int c19 = xVar.c(4);
        int c20 = xVar.c(2);
        xVar.b(2);
        int i13 = i10 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i13 > 0) {
            int c21 = xVar.c(i11);
            int c22 = xVar.c(i12);
            int c23 = xVar.c(i12);
            int c24 = xVar.c(12);
            int i14 = c20;
            xVar.b(4);
            int c25 = xVar.c(12);
            i13 -= 6;
            if (c22 == 1 || c22 == 2) {
                i13 -= 2;
                c10 = xVar.c(8);
                c11 = xVar.c(8);
            } else {
                c10 = 0;
                c11 = 0;
            }
            sparseArray.put(c21, new g(c22, c23, c24, c25, c10, c11));
            c20 = i14;
            i12 = 2;
            i11 = 16;
        }
        return new f(c12, e10, c13, c14, c15, c16, c17, c18, c19, c20, sparseArray);
    }

    private static a c(x xVar, int i10) {
        int c10;
        int i11;
        int c11;
        int i12;
        int i13;
        int i14 = 8;
        int c12 = xVar.c(8);
        xVar.b(8);
        int i15 = 2;
        int i16 = i10 - 2;
        int[] b10 = b();
        int[] c13 = c();
        int[] d10 = d();
        while (i16 > 0) {
            int c14 = xVar.c(i14);
            int c15 = xVar.c(i14);
            int i17 = i16 - 2;
            int[] iArr = (c15 & 128) != 0 ? b10 : (c15 & 64) != 0 ? c13 : d10;
            if ((c15 & 1) != 0) {
                i12 = xVar.c(i14);
                i13 = xVar.c(i14);
                c10 = xVar.c(i14);
                c11 = xVar.c(i14);
                i11 = i17 - 4;
            } else {
                int c16 = xVar.c(6) << i15;
                int c17 = xVar.c(4) << 4;
                c10 = xVar.c(4) << 4;
                i11 = i17 - 2;
                c11 = xVar.c(i15) << 6;
                i12 = c16;
                i13 = c17;
            }
            if (i12 == 0) {
                c11 = 255;
                i13 = 0;
                c10 = 0;
            }
            double d11 = i12;
            double d12 = i13 - 128;
            double d13 = c10 - 128;
            iArr[c14] = a((byte) (255 - (c11 & p.f9095b)), ai.a((int) ((1.402d * d12) + d11), 0, p.f9095b), ai.a((int) ((d11 - (0.34414d * d13)) - (d12 * 0.71414d)), 0, p.f9095b), ai.a((int) ((d13 * 1.772d) + d11), 0, p.f9095b));
            i16 = i11;
            c12 = c12;
            i14 = 8;
            i15 = 2;
        }
        return new a(c12, b10, c13, d10);
    }

    private static int[] d() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i28 = 0; i28 < 256; i28++) {
            int i29 = p.f9095b;
            if (i28 < 8) {
                if ((i28 & 1) != 0) {
                    i26 = 255;
                } else {
                    i26 = 0;
                }
                if ((i28 & 2) != 0) {
                    i27 = 255;
                } else {
                    i27 = 0;
                }
                if ((i28 & 4) == 0) {
                    i29 = 0;
                }
                iArr[i28] = a(63, i26, i27, i29);
            } else {
                int i30 = i28 & 136;
                int i31 = 170;
                int i32 = 85;
                if (i30 != 0) {
                    if (i30 != 8) {
                        int i33 = 43;
                        if (i30 != 128) {
                            if (i30 == 136) {
                                if ((i28 & 1) != 0) {
                                    i22 = 43;
                                } else {
                                    i22 = 0;
                                }
                                if ((i28 & 16) != 0) {
                                    i23 = 85;
                                } else {
                                    i23 = 0;
                                }
                                int i34 = i22 + i23;
                                if ((i28 & 2) != 0) {
                                    i24 = 43;
                                } else {
                                    i24 = 0;
                                }
                                if ((i28 & 32) != 0) {
                                    i25 = 85;
                                } else {
                                    i25 = 0;
                                }
                                int i35 = i24 + i25;
                                if ((i28 & 4) == 0) {
                                    i33 = 0;
                                }
                                if ((i28 & 64) == 0) {
                                    i32 = 0;
                                }
                                iArr[i28] = a(p.f9095b, i34, i35, i33 + i32);
                            }
                        } else {
                            if ((i28 & 1) != 0) {
                                i18 = 43;
                            } else {
                                i18 = 0;
                            }
                            int i36 = i18 + com.anythink.expressad.video.module.a.a.R;
                            if ((i28 & 16) != 0) {
                                i19 = 85;
                            } else {
                                i19 = 0;
                            }
                            int i37 = i36 + i19;
                            if ((i28 & 2) != 0) {
                                i20 = 43;
                            } else {
                                i20 = 0;
                            }
                            int i38 = i20 + com.anythink.expressad.video.module.a.a.R;
                            if ((i28 & 32) != 0) {
                                i21 = 85;
                            } else {
                                i21 = 0;
                            }
                            int i39 = i38 + i21;
                            if ((i28 & 4) == 0) {
                                i33 = 0;
                            }
                            int i40 = i33 + com.anythink.expressad.video.module.a.a.R;
                            if ((i28 & 64) == 0) {
                                i32 = 0;
                            }
                            iArr[i28] = a(p.f9095b, i37, i39, i40 + i32);
                        }
                    } else {
                        if ((i28 & 1) != 0) {
                            i14 = 85;
                        } else {
                            i14 = 0;
                        }
                        if ((i28 & 16) != 0) {
                            i15 = 170;
                        } else {
                            i15 = 0;
                        }
                        int i41 = i14 + i15;
                        if ((i28 & 2) != 0) {
                            i16 = 85;
                        } else {
                            i16 = 0;
                        }
                        if ((i28 & 32) != 0) {
                            i17 = 170;
                        } else {
                            i17 = 0;
                        }
                        int i42 = i16 + i17;
                        if ((i28 & 4) == 0) {
                            i32 = 0;
                        }
                        if ((i28 & 64) == 0) {
                            i31 = 0;
                        }
                        iArr[i28] = a(com.anythink.expressad.video.module.a.a.R, i41, i42, i32 + i31);
                    }
                } else {
                    if ((i28 & 1) != 0) {
                        i10 = 85;
                    } else {
                        i10 = 0;
                    }
                    if ((i28 & 16) != 0) {
                        i11 = 170;
                    } else {
                        i11 = 0;
                    }
                    int i43 = i10 + i11;
                    if ((i28 & 2) != 0) {
                        i12 = 85;
                    } else {
                        i12 = 0;
                    }
                    if ((i28 & 32) != 0) {
                        i13 = 170;
                    } else {
                        i13 = 0;
                    }
                    int i44 = i12 + i13;
                    if ((i28 & 4) == 0) {
                        i32 = 0;
                    }
                    if ((i28 & 64) == 0) {
                        i31 = 0;
                    }
                    iArr[i28] = a(p.f9095b, i43, i44, i32 + i31);
                }
            }
        }
        return iArr;
    }

    public void a() {
        this.f15627i.a();
    }

    public List<com.applovin.exoplayer2.i.a> a(byte[] bArr, int i10) {
        int i11;
        int i12;
        SparseArray<g> sparseArray;
        x xVar = new x(bArr, i10);
        while (xVar.a() >= 48 && xVar.c(8) == 15) {
            a(xVar, this.f15627i);
        }
        h hVar = this.f15627i;
        d dVar = hVar.f15670i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C0179b c0179b = hVar.f15669h;
        if (c0179b == null) {
            c0179b = this.f15625g;
        }
        Bitmap bitmap = this.f15628j;
        if (bitmap == null || c0179b.f15633a + 1 != bitmap.getWidth() || c0179b.f15634b + 1 != this.f15628j.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(c0179b.f15633a + 1, c0179b.f15634b + 1, Bitmap.Config.ARGB_8888);
            this.f15628j = createBitmap;
            this.f.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray2 = dVar.f15645d;
        for (int i13 = 0; i13 < sparseArray2.size(); i13++) {
            this.f.save();
            e valueAt = sparseArray2.valueAt(i13);
            f fVar = this.f15627i.f15665c.get(sparseArray2.keyAt(i13));
            int i14 = valueAt.f15646a + c0179b.f15635c;
            int i15 = valueAt.f15647b + c0179b.f15637e;
            this.f.clipRect(i14, i15, Math.min(fVar.f15650c + i14, c0179b.f15636d), Math.min(fVar.f15651d + i15, c0179b.f));
            a aVar = this.f15627i.f15666d.get(fVar.f15653g);
            if (aVar == null && (aVar = this.f15627i.f.get(fVar.f15653g)) == null) {
                aVar = this.f15626h;
            }
            SparseArray<g> sparseArray3 = fVar.f15657k;
            int i16 = 0;
            while (i16 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i16);
                g valueAt2 = sparseArray3.valueAt(i16);
                c cVar = this.f15627i.f15667e.get(keyAt);
                c cVar2 = cVar == null ? this.f15627i.f15668g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i12 = i16;
                    sparseArray = sparseArray3;
                    a(cVar2, aVar, fVar.f, valueAt2.f15660c + i14, i15 + valueAt2.f15661d, cVar2.f15639b ? null : this.f15623d, this.f);
                } else {
                    i12 = i16;
                    sparseArray = sparseArray3;
                }
                i16 = i12 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f15649b) {
                int i17 = fVar.f;
                if (i17 == 3) {
                    i11 = aVar.f15632d[fVar.f15654h];
                } else if (i17 == 2) {
                    i11 = aVar.f15631c[fVar.f15655i];
                } else {
                    i11 = aVar.f15630b[fVar.f15656j];
                }
                this.f15624e.setColor(i11);
                this.f.drawRect(i14, i15, fVar.f15650c + i14, fVar.f15651d + i15, this.f15624e);
            }
            arrayList.add(new a.C0175a().a(Bitmap.createBitmap(this.f15628j, i14, i15, fVar.f15650c, fVar.f15651d)).a(i14 / c0179b.f15633a).b(0).a(i15 / c0179b.f15634b, 0).a(0).b(fVar.f15650c / c0179b.f15633a).c(fVar.f15651d / c0179b.f15634b).e());
            this.f.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static int[] c() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = a(p.f9095b, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                int i11 = i10 & 1;
                int i12 = com.anythink.expressad.video.module.a.a.R;
                int i13 = i11 != 0 ? 127 : 0;
                int i14 = (i10 & 2) != 0 ? 127 : 0;
                if ((i10 & 4) == 0) {
                    i12 = 0;
                }
                iArr[i10] = a(p.f9095b, i13, i14, i12);
            }
        }
        return iArr;
    }

    private static int c(x xVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int c10;
        int i12 = i10;
        boolean z11 = false;
        while (true) {
            int c11 = xVar.c(8);
            if (c11 != 0) {
                z10 = z11;
                c10 = 1;
            } else if (!xVar.e()) {
                int c12 = xVar.c(7);
                if (c12 != 0) {
                    z10 = z11;
                    c10 = c12;
                    c11 = 0;
                } else {
                    z10 = true;
                    c11 = 0;
                    c10 = 0;
                }
            } else {
                z10 = z11;
                c10 = xVar.c(7);
                c11 = xVar.c(8);
            }
            if (c10 != 0 && paint != null) {
                if (bArr != null) {
                    c11 = bArr[c11];
                }
                paint.setColor(iArr[c11]);
                canvas.drawRect(i12, i11, i12 + c10, i11 + 1, paint);
            }
            i12 += c10;
            if (z10) {
                return i12;
            }
            z11 = z10;
        }
    }

    private static c b(x xVar) {
        byte[] bArr;
        int c10 = xVar.c(16);
        xVar.b(4);
        int c11 = xVar.c(2);
        boolean e10 = xVar.e();
        xVar.b(1);
        byte[] bArr2 = ai.f;
        if (c11 == 1) {
            xVar.b(xVar.c(8) * 16);
        } else if (c11 == 0) {
            int c12 = xVar.c(16);
            int c13 = xVar.c(16);
            if (c12 > 0) {
                bArr2 = new byte[c12];
                xVar.b(bArr2, 0, c12);
            }
            if (c13 > 0) {
                bArr = new byte[c13];
                xVar.b(bArr, 0, c13);
                return new c(c10, e10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(c10, e10, bArr2, bArr);
    }

    private static int[] b() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int b(x xVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int c10;
        int c11;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int c12 = xVar.c(4);
            if (c12 != 0) {
                z10 = z11;
                i12 = 1;
            } else if (!xVar.e()) {
                int c13 = xVar.c(3);
                if (c13 != 0) {
                    z10 = z11;
                    i12 = c13 + 2;
                    c12 = 0;
                } else {
                    z10 = true;
                    c12 = 0;
                    i12 = 0;
                }
            } else {
                if (!xVar.e()) {
                    c10 = xVar.c(2) + 4;
                    c11 = xVar.c(4);
                } else {
                    int c14 = xVar.c(2);
                    if (c14 == 0) {
                        z10 = z11;
                        i12 = 1;
                    } else if (c14 == 1) {
                        z10 = z11;
                        i12 = 2;
                    } else if (c14 == 2) {
                        c10 = xVar.c(4) + 9;
                        c11 = xVar.c(4);
                    } else if (c14 != 3) {
                        z10 = z11;
                        c12 = 0;
                        i12 = 0;
                    } else {
                        c10 = xVar.c(8) + 25;
                        c11 = xVar.c(4);
                    }
                    c12 = 0;
                }
                z10 = z11;
                i12 = c10;
                c12 = c11;
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    c12 = bArr[c12];
                }
                paint.setColor(iArr[c12]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z11 = z10;
        }
    }

    private static void a(x xVar, h hVar) {
        f fVar;
        int c10 = xVar.c(8);
        int c11 = xVar.c(16);
        int c12 = xVar.c(16);
        int c13 = xVar.c() + c12;
        if (c12 * 8 > xVar.a()) {
            q.c("DvbParser", "Data field length exceeds limit");
            xVar.b(xVar.a());
            return;
        }
        switch (c10) {
            case 16:
                if (c11 == hVar.f15663a) {
                    d dVar = hVar.f15670i;
                    d a10 = a(xVar, c12);
                    if (a10.f15644c != 0) {
                        hVar.f15670i = a10;
                        hVar.f15665c.clear();
                        hVar.f15666d.clear();
                        hVar.f15667e.clear();
                        break;
                    } else if (dVar != null && dVar.f15643b != a10.f15643b) {
                        hVar.f15670i = a10;
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f15670i;
                if (c11 == hVar.f15663a && dVar2 != null) {
                    f b10 = b(xVar, c12);
                    if (dVar2.f15644c == 0 && (fVar = hVar.f15665c.get(b10.f15648a)) != null) {
                        b10.a(fVar);
                    }
                    hVar.f15665c.put(b10.f15648a, b10);
                    break;
                }
                break;
            case 18:
                if (c11 == hVar.f15663a) {
                    a c14 = c(xVar, c12);
                    hVar.f15666d.put(c14.f15629a, c14);
                    break;
                } else if (c11 == hVar.f15664b) {
                    a c15 = c(xVar, c12);
                    hVar.f.put(c15.f15629a, c15);
                    break;
                }
                break;
            case 19:
                if (c11 == hVar.f15663a) {
                    c b11 = b(xVar);
                    hVar.f15667e.put(b11.f15638a, b11);
                    break;
                } else if (c11 == hVar.f15664b) {
                    c b12 = b(xVar);
                    hVar.f15668g.put(b12.f15638a, b12);
                    break;
                }
                break;
            case 20:
                if (c11 == hVar.f15663a) {
                    hVar.f15669h = a(xVar);
                    break;
                }
                break;
        }
        xVar.e(c13 - xVar.c());
    }

    private static C0179b a(x xVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        xVar.b(4);
        boolean e10 = xVar.e();
        xVar.b(3);
        int c10 = xVar.c(16);
        int c11 = xVar.c(16);
        if (e10) {
            int c12 = xVar.c(16);
            int c13 = xVar.c(16);
            int c14 = xVar.c(16);
            i13 = xVar.c(16);
            i12 = c13;
            i11 = c14;
            i10 = c12;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = c10;
            i13 = c11;
        }
        return new C0179b(c10, c11, i10, i12, i11, i13);
    }

    private static d a(x xVar, int i10) {
        int c10 = xVar.c(8);
        int c11 = xVar.c(4);
        int c12 = xVar.c(2);
        xVar.b(2);
        int i11 = i10 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i11 > 0) {
            int c13 = xVar.c(8);
            xVar.b(8);
            i11 -= 6;
            sparseArray.put(c13, new e(xVar.c(16), xVar.c(16)));
        }
        return new d(c10, c11, c12, sparseArray);
    }

    private static void a(c cVar, a aVar, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i10 == 3) {
            iArr = aVar.f15632d;
        } else if (i10 == 2) {
            iArr = aVar.f15631c;
        } else {
            iArr = aVar.f15630b;
        }
        int[] iArr2 = iArr;
        a(cVar.f15640c, iArr2, i10, i11, i12, paint, canvas);
        a(cVar.f15641d, iArr2, i10, i11, i12 + 1, paint, canvas);
    }

    private static void a(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        x xVar = new x(bArr);
        int i13 = i11;
        int i14 = i12;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (xVar.a() != 0) {
            int c10 = xVar.c(8);
            if (c10 != 240) {
                switch (c10) {
                    case 16:
                        if (i10 != 3) {
                            if (i10 == 2) {
                                bArr3 = bArr7 == null ? f15620a : bArr7;
                            } else {
                                bArr2 = null;
                                i13 = a(xVar, iArr, bArr2, i13, i14, paint, canvas);
                                xVar.f();
                                break;
                            }
                        } else {
                            bArr3 = bArr5 == null ? f15621b : bArr5;
                        }
                        bArr2 = bArr3;
                        i13 = a(xVar, iArr, bArr2, i13, i14, paint, canvas);
                        xVar.f();
                    case 17:
                        if (i10 == 3) {
                            bArr4 = bArr6 == null ? f15622c : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i13 = b(xVar, iArr, bArr4, i13, i14, paint, canvas);
                        xVar.f();
                        break;
                    case 18:
                        i13 = c(xVar, iArr, null, i13, i14, paint, canvas);
                        break;
                    default:
                        switch (c10) {
                            case 32:
                                bArr7 = a(4, 4, xVar);
                                break;
                            case 33:
                                bArr5 = a(4, 8, xVar);
                                break;
                            case 34:
                                bArr6 = a(16, 8, xVar);
                                break;
                        }
                }
            } else {
                i14 += 2;
                i13 = i11;
            }
        }
    }

    private static int a(x xVar, int[] iArr, byte[] bArr, int i10, int i11, Paint paint, Canvas canvas) {
        boolean z10;
        int i12;
        int c10;
        int c11;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int c12 = xVar.c(2);
            if (c12 != 0) {
                z10 = z11;
                i12 = 1;
            } else {
                if (xVar.e()) {
                    c10 = xVar.c(3) + 3;
                    c11 = xVar.c(2);
                } else {
                    if (xVar.e()) {
                        z10 = z11;
                        i12 = 1;
                    } else {
                        int c13 = xVar.c(2);
                        if (c13 == 0) {
                            z10 = true;
                        } else if (c13 == 1) {
                            z10 = z11;
                            i12 = 2;
                        } else if (c13 == 2) {
                            c10 = xVar.c(4) + 12;
                            c11 = xVar.c(2);
                        } else if (c13 != 3) {
                            z10 = z11;
                        } else {
                            c10 = xVar.c(8) + 29;
                            c11 = xVar.c(2);
                        }
                        c12 = 0;
                        i12 = 0;
                    }
                    c12 = 0;
                }
                z10 = z11;
                i12 = c10;
                c12 = c11;
            }
            if (i12 != 0 && paint != null) {
                if (bArr != null) {
                    c12 = bArr[c12];
                }
                paint.setColor(iArr[c12]);
                canvas.drawRect(i13, i11, i13 + i12, i11 + 1, paint);
            }
            i13 += i12;
            if (z10) {
                return i13;
            }
            z11 = z10;
        }
    }

    private static byte[] a(int i10, int i11, x xVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) xVar.c(i11);
        }
        return bArr;
    }
}
