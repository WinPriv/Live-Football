package androidx.appcompat.app;

/* compiled from: TwilightCalculator.java */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static u f704d;

    /* renamed from: a, reason: collision with root package name */
    public long f705a;

    /* renamed from: b, reason: collision with root package name */
    public long f706b;

    /* renamed from: c, reason: collision with root package name */
    public int f707c;

    public final void a(double d10, double d11, long j10) {
        double d12 = (0.01720197f * (((float) (j10 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d12) * 0.0053d) + ((float) Math.round((r3 - 9.0E-4f) - r7)) + 9.0E-4f + ((-d11) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d13 = 0.01745329238474369d * d10;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d13))) / (Math.cos(asin) * Math.cos(d13));
        if (sin3 >= 1.0d) {
            this.f707c = 1;
            this.f705a = -1L;
            this.f706b = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f707c = 0;
                this.f705a = -1L;
                this.f706b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f705a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f706b = round;
            if (round < j10 && this.f705a > j10) {
                this.f707c = 0;
            } else {
                this.f707c = 1;
            }
        }
    }
}
