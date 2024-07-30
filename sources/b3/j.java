package b3;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import t3.l;

/* compiled from: LruBitmapPool.java */
/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: j, reason: collision with root package name */
    public static final Bitmap.Config f2873j = Bitmap.Config.ARGB_8888;

    /* renamed from: a, reason: collision with root package name */
    public final k f2874a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<Bitmap.Config> f2875b;

    /* renamed from: c, reason: collision with root package name */
    public final a f2876c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2877d;

    /* renamed from: e, reason: collision with root package name */
    public long f2878e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f2879g;

    /* renamed from: h, reason: collision with root package name */
    public int f2880h;

    /* renamed from: i, reason: collision with root package name */
    public int f2881i;

    /* compiled from: LruBitmapPool.java */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public j(long j10) {
        Bitmap.Config config;
        m mVar = new m();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f2877d = j10;
        this.f2874a = mVar;
        this.f2875b = unmodifiableSet;
        this.f2876c = new a();
    }

    @Override // b3.d
    @SuppressLint({"InlinedApi"})
    public final void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 < 40 && i10 < 20) {
            if (i10 >= 20 || i10 == 15) {
                h(this.f2877d / 2);
                return;
            }
            return;
        }
        b();
    }

    @Override // b3.d
    public final void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        h(0L);
    }

    @Override // b3.d
    public final Bitmap c(int i10, int i11, Bitmap.Config config) {
        Bitmap g6 = g(i10, i11, config);
        if (g6 == null) {
            if (config == null) {
                config = f2873j;
            }
            return Bitmap.createBitmap(i10, i11, config);
        }
        return g6;
    }

    @Override // b3.d
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        ((m) this.f2874a).getClass();
                        if (t3.l.c(bitmap) <= this.f2877d && this.f2875b.contains(bitmap.getConfig())) {
                            ((m) this.f2874a).getClass();
                            int c10 = t3.l.c(bitmap);
                            ((m) this.f2874a).f(bitmap);
                            this.f2876c.getClass();
                            this.f2880h++;
                            this.f2878e += c10;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                Log.v("LruBitmapPool", "Put bitmap in pool=" + ((m) this.f2874a).e(bitmap));
                            }
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                f();
                            }
                            h(this.f2877d);
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + ((m) this.f2874a).e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f2875b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // b3.d
    public final Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap g6 = g(i10, i11, config);
        if (g6 != null) {
            g6.eraseColor(0);
            return g6;
        }
        if (config == null) {
            config = f2873j;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public final void f() {
        Log.v("LruBitmapPool", "Hits=" + this.f + ", misses=" + this.f2879g + ", puts=" + this.f2880h + ", evictions=" + this.f2881i + ", currentSize=" + this.f2878e + ", maxSize=" + this.f2877d + "\nStrategy=" + this.f2874a);
    }

    public final synchronized Bitmap g(int i10, int i11, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap b10;
        Bitmap.Config config4;
        Bitmap.Config config5;
        int i12;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                config2 = Bitmap.Config.HARDWARE;
                if (config == config2) {
                    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                }
            }
            k kVar = this.f2874a;
            if (config != null) {
                config3 = config;
            } else {
                config3 = f2873j;
            }
            b10 = ((m) kVar).b(i10, i11, config3);
            int i13 = 8;
            if (b10 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder("Missing bitmap=");
                    ((m) this.f2874a).getClass();
                    char[] cArr = t3.l.f35429a;
                    int i14 = i10 * i11;
                    if (config == null) {
                        config5 = Bitmap.Config.ARGB_8888;
                    } else {
                        config5 = config;
                    }
                    int i15 = l.a.f35432a[config5.ordinal()];
                    if (i15 != 1) {
                        if (i15 != 2 && i15 != 3) {
                            if (i15 != 4) {
                                i12 = 4;
                            } else {
                                i12 = 8;
                            }
                        } else {
                            i12 = 2;
                        }
                    } else {
                        i12 = 1;
                    }
                    sb2.append(m.c(i12 * i14, config));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                this.f2879g++;
            } else {
                this.f++;
                long j10 = this.f2878e;
                ((m) this.f2874a).getClass();
                this.f2878e = j10 - t3.l.c(b10);
                this.f2876c.getClass();
                b10.setHasAlpha(true);
                b10.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder("Get bitmap=");
                ((m) this.f2874a).getClass();
                char[] cArr2 = t3.l.f35429a;
                int i16 = i10 * i11;
                if (config == null) {
                    config4 = Bitmap.Config.ARGB_8888;
                } else {
                    config4 = config;
                }
                int i17 = l.a.f35432a[config4.ordinal()];
                if (i17 != 1) {
                    if (i17 != 2 && i17 != 3) {
                        if (i17 != 4) {
                            i13 = 4;
                        }
                    } else {
                        i13 = 2;
                    }
                } else {
                    i13 = 1;
                }
                sb3.append(m.c(i13 * i16, config));
                Log.v("LruBitmapPool", sb3.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b10;
    }

    public final synchronized void h(long j10) {
        while (this.f2878e > j10) {
            m mVar = (m) this.f2874a;
            Bitmap c10 = mVar.f2887b.c();
            if (c10 != null) {
                mVar.a(Integer.valueOf(t3.l.c(c10)), c10);
            }
            if (c10 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    f();
                }
                this.f2878e = 0L;
                return;
            }
            this.f2876c.getClass();
            long j11 = this.f2878e;
            ((m) this.f2874a).getClass();
            this.f2878e = j11 - t3.l.c(c10);
            this.f2881i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + ((m) this.f2874a).e(c10));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                f();
            }
            c10.recycle();
        }
    }
}
