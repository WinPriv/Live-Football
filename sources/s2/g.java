package s2;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import androidx.activity.n;
import com.huawei.hms.ads.gl;
import java.io.Closeable;

/* compiled from: Utils.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f35111a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final b f35112b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final c f35113c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final d f35114d = new d();

    /* renamed from: e, reason: collision with root package name */
    public static final float f35115e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* compiled from: Utils.java */
    /* loaded from: classes.dex */
    public class a extends ThreadLocal<PathMeasure> {
        @Override // java.lang.ThreadLocal
        public final PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* compiled from: Utils.java */
    /* loaded from: classes.dex */
    public class b extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    }

    /* compiled from: Utils.java */
    /* loaded from: classes.dex */
    public class c extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public final Path initialValue() {
            return new Path();
        }
    }

    /* compiled from: Utils.java */
    /* loaded from: classes.dex */
    public class d extends ThreadLocal<float[]> {
        @Override // java.lang.ThreadLocal
        public final float[] initialValue() {
            return new float[4];
        }
    }

    public static void a(Path path, float f, float f10, float f11) {
        PathMeasure pathMeasure = f35111a.get();
        Path path2 = f35112b.get();
        Path path3 = f35113c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f10 == gl.Code) {
            n.s0();
            return;
        }
        if (length >= 1.0f && Math.abs((f10 - f) - 1.0f) >= 0.01d) {
            float f12 = f * length;
            float f13 = f10 * length;
            float f14 = f11 * length;
            float min = Math.min(f12, f13) + f14;
            float max = Math.max(f12, f13) + f14;
            if (min >= length && max >= length) {
                min = f.c(min, length);
                max = f.c(max, length);
            }
            if (min < gl.Code) {
                min = f.c(min, length);
            }
            if (max < gl.Code) {
                max = f.c(max, length);
            }
            if (min == max) {
                path.reset();
                n.s0();
                return;
            }
            if (min >= max) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(gl.Code, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < gl.Code) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            n.s0();
            return;
        }
        n.s0();
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float d(Matrix matrix) {
        float[] fArr = f35114d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f35115e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }
}
