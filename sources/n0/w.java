package n0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* compiled from: PointerIconCompat.java */
/* loaded from: classes.dex */
public final class w {
    public static PointerIcon a(Bitmap bitmap, float f, float f10) {
        return PointerIcon.create(bitmap, f, f10);
    }

    public static PointerIcon b(Context context, int i10) {
        return PointerIcon.getSystemIcon(context, i10);
    }

    public static PointerIcon c(Resources resources, int i10) {
        return PointerIcon.load(resources, i10);
    }
}
