package h3;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: FitCenter.java */
/* loaded from: classes.dex */
public final class q extends f {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f28721b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(y2.e.f36561a);

    @Override // y2.e
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f28721b);
    }

    @Override // h3.f
    public final Bitmap c(b3.d dVar, Bitmap bitmap, int i10, int i11) {
        return x.b(dVar, bitmap, i10, i11);
    }

    @Override // y2.e
    public final boolean equals(Object obj) {
        return obj instanceof q;
    }

    @Override // y2.e
    public final int hashCode() {
        return 1572326941;
    }
}
