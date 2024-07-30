package b3;

import android.graphics.Bitmap;

/* compiled from: BitmapPoolAdapter.java */
/* loaded from: classes.dex */
public class e implements d {
    @Override // b3.d
    public final Bitmap c(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // b3.d
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // b3.d
    public final Bitmap e(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // b3.d
    public final void b() {
    }

    @Override // b3.d
    public final void a(int i10) {
    }
}
