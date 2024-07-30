package gb;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import com.huawei.hms.ads.dt;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class s0 extends LruCache<String, WeakReference<Drawable>> {
    public s0(int i10) {
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
            } else if (drawable instanceof dt) {
                return ((dt) drawable).I();
            }
        }
        return 1;
    }
}
