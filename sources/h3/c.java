package h3;

import android.graphics.Bitmap;

/* compiled from: BitmapEncoder.java */
/* loaded from: classes.dex */
public final class c implements y2.j<Bitmap> {

    /* renamed from: t, reason: collision with root package name */
    public static final y2.f<Integer> f28685t = y2.f.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: u, reason: collision with root package name */
    public static final y2.f<Bitmap.CompressFormat> f28686u = new y2.f<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, y2.f.f36562e);

    /* renamed from: s, reason: collision with root package name */
    public final b3.b f28687s;

    public c(b3.b bVar) {
        this.f28687s = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #6 {, blocks: (B:9:0x0028, B:18:0x0056, B:21:0x0071, B:23:0x0077, B:48:0x00ba, B:46:0x00bd, B:41:0x006c), top: B:8:0x0028 }] */
    @Override // y2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(java.lang.Object r10, java.io.File r11, y2.g r12) {
        /*
            r9 = this;
            a3.x r10 = (a3.x) r10
            java.lang.String r0 = "BitmapEncoder"
            java.lang.String r1 = "Compressed with type: "
            java.lang.Object r10 = r10.get()
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            y2.f<android.graphics.Bitmap$CompressFormat> r2 = h3.c.f28686u
            java.lang.Object r3 = r12.c(r2)
            android.graphics.Bitmap$CompressFormat r3 = (android.graphics.Bitmap.CompressFormat) r3
            if (r3 == 0) goto L17
            goto L22
        L17:
            boolean r3 = r10.hasAlpha()
            if (r3 == 0) goto L20
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.PNG
            goto L22
        L20:
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG
        L22:
            r10.getWidth()
            r10.getHeight()
            int r4 = t3.h.f35419b     // Catch: java.lang.Throwable -> Lbe
            long r4 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> Lbe
            y2.f<java.lang.Integer> r6 = h3.c.f28685t     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r6 = r12.c(r6)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> Lbe
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> Lbe
            r7 = 0
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            b3.b r11 = r9.f28687s
            if (r11 == 0) goto L4f
            com.bumptech.glide.load.data.c r7 = new com.bumptech.glide.load.data.c     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4c
            r7.<init>(r8, r11)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4c
            goto L50
        L4a:
            r10 = move-exception
            goto Lb8
        L4c:
            r11 = move-exception
            r7 = r8
            goto L5e
        L4f:
            r7 = r8
        L50:
            r10.compress(r3, r6, r7)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            r7.close()     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            r7.close()     // Catch: java.io.IOException -> L59 java.lang.Throwable -> Lbe
        L59:
            r11 = 1
            goto L70
        L5b:
            r10 = move-exception
            goto Lb7
        L5d:
            r11 = move-exception
        L5e:
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r0, r6)     // Catch: java.lang.Throwable -> L5b
            if (r6 == 0) goto L6a
            java.lang.String r6 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r6, r11)     // Catch: java.lang.Throwable -> L5b
        L6a:
            if (r7 == 0) goto L6f
            r7.close()     // Catch: java.io.IOException -> L6f java.lang.Throwable -> Lbe
        L6f:
            r11 = 0
        L70:
            r6 = 2
            boolean r6 = android.util.Log.isLoggable(r0, r6)     // Catch: java.lang.Throwable -> Lbe
            if (r6 == 0) goto Lb6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbe
            r6.<init>(r1)     // Catch: java.lang.Throwable -> Lbe
            r6.append(r3)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = " of size "
            r6.append(r1)     // Catch: java.lang.Throwable -> Lbe
            int r1 = t3.l.c(r10)     // Catch: java.lang.Throwable -> Lbe
            r6.append(r1)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = " in "
            r6.append(r1)     // Catch: java.lang.Throwable -> Lbe
            double r3 = t3.h.a(r4)     // Catch: java.lang.Throwable -> Lbe
            r6.append(r3)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r1 = ", options format: "
            r6.append(r1)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r12 = r12.c(r2)     // Catch: java.lang.Throwable -> Lbe
            r6.append(r12)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r12 = ", hasAlpha: "
            r6.append(r12)     // Catch: java.lang.Throwable -> Lbe
            boolean r10 = r10.hasAlpha()     // Catch: java.lang.Throwable -> Lbe
            r6.append(r10)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r10 = r6.toString()     // Catch: java.lang.Throwable -> Lbe
            android.util.Log.v(r0, r10)     // Catch: java.lang.Throwable -> Lbe
        Lb6:
            return r11
        Lb7:
            r8 = r7
        Lb8:
            if (r8 == 0) goto Lbd
            r8.close()     // Catch: java.io.IOException -> Lbd java.lang.Throwable -> Lbe
        Lbd:
            throw r10     // Catch: java.lang.Throwable -> Lbe
        Lbe:
            r10 = move-exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.c.g(java.lang.Object, java.io.File, y2.g):boolean");
    }

    @Override // y2.j
    public final y2.c h(y2.g gVar) {
        return y2.c.TRANSFORMED;
    }
}
