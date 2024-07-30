package m4;

import android.media.AudioAttributes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import d6.g0;

/* compiled from: AudioAttributes.java */
/* loaded from: classes2.dex */
public final class d implements k4.f {
    public static final d y = new d(0, 0, 1, 1, 0);

    /* renamed from: s, reason: collision with root package name */
    public final int f32719s;

    /* renamed from: t, reason: collision with root package name */
    public final int f32720t;

    /* renamed from: u, reason: collision with root package name */
    public final int f32721u;

    /* renamed from: v, reason: collision with root package name */
    public final int f32722v;

    /* renamed from: w, reason: collision with root package name */
    public final int f32723w;

    /* renamed from: x, reason: collision with root package name */
    public c f32724x;

    /* compiled from: AudioAttributes.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    /* compiled from: AudioAttributes.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    /* compiled from: AudioAttributes.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributes f32725a;

        public c(d dVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(dVar.f32719s).setFlags(dVar.f32720t).setUsage(dVar.f32721u);
            int i10 = g0.f27302a;
            if (i10 >= 29) {
                a.a(usage, dVar.f32722v);
            }
            if (i10 >= 32) {
                b.a(usage, dVar.f32723w);
            }
            this.f32725a = usage.build();
        }
    }

    static {
        g0.F(0);
        g0.F(1);
        g0.F(2);
        g0.F(3);
        g0.F(4);
    }

    public d(int i10, int i11, int i12, int i13, int i14) {
        this.f32719s = i10;
        this.f32720t = i11;
        this.f32721u = i12;
        this.f32722v = i13;
        this.f32723w = i14;
    }

    public final c a() {
        if (this.f32724x == null) {
            this.f32724x = new c(this);
        }
        return this.f32724x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f32719s == dVar.f32719s && this.f32720t == dVar.f32720t && this.f32721u == dVar.f32721u && this.f32722v == dVar.f32722v && this.f32723w == dVar.f32723w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f32719s) * 31) + this.f32720t) * 31) + this.f32721u) * 31) + this.f32722v) * 31) + this.f32723w;
    }
}
