package r0;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.huawei.hms.ads.gl;

/* compiled from: EdgeEffectCompat.java */
/* loaded from: classes.dex */
public final class d {

    /* compiled from: EdgeEffectCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(EdgeEffect edgeEffect, float f, float f10) {
            edgeEffect.onPull(f, f10);
        }
    }

    /* compiled from: EdgeEffectCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float b(EdgeEffect edgeEffect) {
            float distance;
            try {
                distance = edgeEffect.getDistance();
                return distance;
            } catch (Throwable unused) {
                return gl.Code;
            }
        }

        public static float c(EdgeEffect edgeEffect, float f, float f10) {
            float onPullDistance;
            try {
                onPullDistance = edgeEffect.onPullDistance(f, f10);
                return onPullDistance;
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f10);
                return gl.Code;
            }
        }
    }

    public static float a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.b(edgeEffect);
        }
        return gl.Code;
    }

    public static float b(EdgeEffect edgeEffect, float f, float f10) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.c(edgeEffect, f, f10);
        }
        a.a(edgeEffect, f, f10);
        return f;
    }
}
