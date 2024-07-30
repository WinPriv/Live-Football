package com.huawei.openalliance.ad.ppskit.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import java.lang.ref.WeakReference;
import ka.a6;

/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: b, reason: collision with root package name */
    public static r0 f23004b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f23005c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public a f23006a;

    /* loaded from: classes2.dex */
    public class a extends LruCache<String, WeakReference<Drawable>> {
        public a(int i10) {
            super(i10);
        }

        @Override // android.util.LruCache
        public final int sizeOf(String str, WeakReference<Drawable> weakReference) {
            Drawable drawable;
            WeakReference<Drawable> weakReference2 = weakReference;
            if (weakReference2 != null && (drawable = weakReference2.get()) != null) {
                if (drawable instanceof BitmapDrawable) {
                    Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                    if (bitmap != null) {
                        return bitmap.getByteCount();
                    }
                } else if (drawable instanceof a6) {
                    a6 a6Var = (a6) drawable;
                    int intrinsicHeight = a6Var.getIntrinsicHeight() * a6Var.getIntrinsicWidth() * (a6Var.A.size() + a6Var.B.size()) * 4;
                    if (intrinsicHeight > 0) {
                        return intrinsicHeight;
                    }
                }
            }
            return 1;
        }
    }

    public r0() {
        a();
    }

    public final void a() {
        int i10;
        int maxMemory = (int) Runtime.getRuntime().maxMemory();
        if (maxMemory > 0) {
            i10 = maxMemory / 4;
        } else {
            i10 = 31457280;
        }
        this.f23006a = new a(Math.min(31457280, i10));
    }
}
