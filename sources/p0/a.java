package p0;

import android.graphics.Path;
import android.view.animation.PathInterpolator;

/* compiled from: PathInterpolatorCompat.java */
/* loaded from: classes.dex */
public final class a {
    public static PathInterpolator a(float f, float f10) {
        return new PathInterpolator(f, f10);
    }

    public static PathInterpolator b(float f, float f10, float f11, float f12) {
        return new PathInterpolator(f, f10, f11, f12);
    }

    public static PathInterpolator c(Path path) {
        return new PathInterpolator(path);
    }
}
