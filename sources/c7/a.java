package c7;

import android.graphics.Paint;
import android.graphics.Path;
import com.huawei.hms.ads.gl;

/* compiled from: ShadowRenderer.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f3452i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f3453j = {gl.Code, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3454k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f3455l = {gl.Code, gl.Code, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f3456a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f3457b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f3458c;

    /* renamed from: d, reason: collision with root package name */
    public int f3459d;

    /* renamed from: e, reason: collision with root package name */
    public int f3460e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f3461g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f3462h;

    public a() {
        Paint paint = new Paint();
        this.f3462h = paint;
        this.f3456a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f3457b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f3458c = new Paint(paint2);
    }

    public final void a(int i10) {
        this.f3459d = f0.a.c(i10, 68);
        this.f3460e = f0.a.c(i10, 20);
        this.f = f0.a.c(i10, 0);
        this.f3456a.setColor(this.f3459d);
    }
}
