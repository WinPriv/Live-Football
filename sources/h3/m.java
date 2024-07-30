package h3;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser;
import h3.l;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;

/* compiled from: Downsampler.java */
/* loaded from: classes.dex */
public final class m {
    public static final y2.f<y2.b> f = y2.f.a(y2.b.PREFER_ARGB_8888, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* renamed from: g, reason: collision with root package name */
    public static final y2.f<y2.h> f28708g = new y2.f<>("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, y2.f.f36562e);

    /* renamed from: h, reason: collision with root package name */
    public static final y2.f<Boolean> f28709h;

    /* renamed from: i, reason: collision with root package name */
    public static final y2.f<Boolean> f28710i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f28711j;

    /* renamed from: k, reason: collision with root package name */
    public static final ArrayDeque f28712k;

    /* renamed from: a, reason: collision with root package name */
    public final b3.d f28713a;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f28714b;

    /* renamed from: c, reason: collision with root package name */
    public final b3.b f28715c;

    /* renamed from: d, reason: collision with root package name */
    public final List<ImageHeaderParser> f28716d;

    /* renamed from: e, reason: collision with root package name */
    public final r f28717e;

    /* compiled from: Downsampler.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(Bitmap bitmap, b3.d dVar) throws IOException;
    }

    static {
        l.e eVar = l.f28702a;
        Boolean bool = Boolean.FALSE;
        f28709h = y2.f.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f28710i = y2.f.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f28711j = new a();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = t3.l.f35429a;
        f28712k = new ArrayDeque(0);
    }

    public m(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, b3.d dVar, b3.b bVar) {
        if (r.f28725j == null) {
            synchronized (r.class) {
                if (r.f28725j == null) {
                    r.f28725j = new r();
                }
            }
        }
        this.f28717e = r.f28725j;
        this.f28716d = list;
        androidx.activity.n.n0(displayMetrics);
        this.f28714b = displayMetrics;
        androidx.activity.n.n0(dVar);
        this.f28713a = dVar;
        androidx.activity.n.n0(bVar);
        this.f28715c = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(h3.s r5, android.graphics.BitmapFactory.Options r6, h3.m.b r7, b3.d r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.a()
            r5.c()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = h3.x.f28755b
            r4.lock()
            android.graphics.Bitmap r5 = r5.b(r6)     // Catch: java.lang.Throwable -> L1f java.lang.IllegalArgumentException -> L21
            r4.unlock()
            return r5
        L1f:
            r5 = move-exception
            goto L48
        L21:
            r4 = move-exception
            java.io.IOException r1 = e(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L1f
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L32
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L1f
        L32:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L47
            r8.d(r0)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L46
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L46
            android.graphics.Bitmap r5 = c(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L46
            java.util.concurrent.locks.Lock r6 = h3.x.f28755b
            r6.unlock()
            return r5
        L46:
            throw r1     // Catch: java.lang.Throwable -> L1f
        L47:
            throw r1     // Catch: java.lang.Throwable -> L1f
        L48:
            java.util.concurrent.locks.Lock r6 = h3.x.f28755b
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.m.c(h3.s, android.graphics.BitmapFactory$Options, h3.m$b, b3.d):android.graphics.Bitmap");
    }

    @TargetApi(19)
    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        StringBuilder r10 = a3.l.r("Exception decoding bitmap, outWidth: ", i10, ", outHeight: ", i11, ", outMimeType: ");
        r10.append(str);
        r10.append(", inBitmap: ");
        r10.append(d(options.inBitmap));
        return new IOException(r10.toString(), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final e a(s sVar, int i10, int i11, y2.g gVar, b bVar) throws IOException {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        boolean z10;
        byte[] bArr = (byte[]) this.f28715c.c(byte[].class, com.anythink.expressad.exoplayer.b.aX);
        synchronized (m.class) {
            arrayDeque = f28712k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        y2.b bVar2 = (y2.b) gVar.c(f);
        y2.h hVar = (y2.h) gVar.c(f28708g);
        l lVar = (l) gVar.c(l.f);
        boolean booleanValue = ((Boolean) gVar.c(f28709h)).booleanValue();
        y2.f<Boolean> fVar = f28710i;
        if (gVar.c(fVar) != null && ((Boolean) gVar.c(fVar)).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            e b10 = e.b(b(sVar, options2, lVar, bVar2, hVar, z10, i10, i11, booleanValue, bVar), this.f28713a);
            f(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            this.f28715c.put(bArr);
            return b10;
        } catch (Throwable th) {
            f(options2);
            ArrayDeque arrayDeque2 = f28712k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f28715c.put(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0312 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0387 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0481  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(h3.s r35, android.graphics.BitmapFactory.Options r36, h3.l r37, y2.b r38, y2.h r39, boolean r40, int r41, int r42, boolean r43, h3.m.b r44) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.m.b(h3.s, android.graphics.BitmapFactory$Options, h3.l, y2.b, y2.h, boolean, int, int, boolean, h3.m$b):android.graphics.Bitmap");
    }

    /* compiled from: Downsampler.java */
    /* loaded from: classes.dex */
    public class a implements b {
        @Override // h3.m.b
        public final void a() {
        }

        @Override // h3.m.b
        public final void b(Bitmap bitmap, b3.d dVar) {
        }
    }
}
