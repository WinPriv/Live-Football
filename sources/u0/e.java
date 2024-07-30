package u0;

import u0.b;

/* compiled from: SpringForce.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public double f35742a;

    /* renamed from: b, reason: collision with root package name */
    public double f35743b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f35744c;

    /* renamed from: d, reason: collision with root package name */
    public double f35745d;

    /* renamed from: e, reason: collision with root package name */
    public double f35746e;
    public double f;

    /* renamed from: g, reason: collision with root package name */
    public double f35747g;

    /* renamed from: h, reason: collision with root package name */
    public double f35748h;

    /* renamed from: i, reason: collision with root package name */
    public double f35749i;

    /* renamed from: j, reason: collision with root package name */
    public final b.g f35750j;

    public e() {
        this.f35742a = Math.sqrt(1500.0d);
        this.f35743b = 0.5d;
        this.f35744c = false;
        this.f35749i = Double.MAX_VALUE;
        this.f35750j = new b.g();
    }

    public final b.g a(double d10, double d11, long j10) {
        double cos;
        double d12;
        if (!this.f35744c) {
            if (this.f35749i != Double.MAX_VALUE) {
                double d13 = this.f35743b;
                if (d13 > 1.0d) {
                    double d14 = this.f35742a;
                    this.f = (Math.sqrt((d13 * d13) - 1.0d) * d14) + ((-d13) * d14);
                    double d15 = this.f35743b;
                    double d16 = this.f35742a;
                    this.f35747g = ((-d15) * d16) - (Math.sqrt((d15 * d15) - 1.0d) * d16);
                } else if (d13 >= 0.0d && d13 < 1.0d) {
                    this.f35748h = Math.sqrt(1.0d - (d13 * d13)) * this.f35742a;
                }
                this.f35744c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d17 = j10 / 1000.0d;
        double d18 = d10 - this.f35749i;
        double d19 = this.f35743b;
        if (d19 > 1.0d) {
            double d20 = this.f35747g;
            double d21 = this.f;
            double d22 = d18 - (((d20 * d18) - d11) / (d20 - d21));
            double d23 = ((d18 * d20) - d11) / (d20 - d21);
            d12 = (Math.pow(2.718281828459045d, this.f * d17) * d23) + (Math.pow(2.718281828459045d, d20 * d17) * d22);
            double d24 = this.f35747g;
            double pow = Math.pow(2.718281828459045d, d24 * d17) * d22 * d24;
            double d25 = this.f;
            cos = (Math.pow(2.718281828459045d, d25 * d17) * d23 * d25) + pow;
        } else if (d19 == 1.0d) {
            double d26 = this.f35742a;
            double d27 = (d26 * d18) + d11;
            double d28 = (d27 * d17) + d18;
            double pow2 = Math.pow(2.718281828459045d, (-d26) * d17) * d28;
            double pow3 = Math.pow(2.718281828459045d, (-this.f35742a) * d17) * d28;
            double d29 = this.f35742a;
            cos = (Math.pow(2.718281828459045d, (-d29) * d17) * d27) + (pow3 * (-d29));
            d12 = pow2;
        } else {
            double d30 = 1.0d / this.f35748h;
            double d31 = this.f35742a;
            double d32 = ((d19 * d31 * d18) + d11) * d30;
            double sin = ((Math.sin(this.f35748h * d17) * d32) + (Math.cos(this.f35748h * d17) * d18)) * Math.pow(2.718281828459045d, (-d19) * d31 * d17);
            double d33 = this.f35742a;
            double d34 = this.f35743b;
            double d35 = (-d33) * sin * d34;
            double pow4 = Math.pow(2.718281828459045d, (-d34) * d33 * d17);
            double d36 = this.f35748h;
            double sin2 = Math.sin(d36 * d17) * (-d36) * d18;
            double d37 = this.f35748h;
            cos = (((Math.cos(d37 * d17) * d32 * d37) + sin2) * pow4) + d35;
            d12 = sin;
        }
        float f = (float) (d12 + this.f35749i);
        b.g gVar = this.f35750j;
        gVar.f35735a = f;
        gVar.f35736b = (float) cos;
        return gVar;
    }

    public e(float f) {
        this.f35742a = Math.sqrt(1500.0d);
        this.f35743b = 0.5d;
        this.f35744c = false;
        this.f35750j = new b.g();
        this.f35749i = f;
    }
}
