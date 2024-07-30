package u0;

import android.view.View;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import u0.a;
import u0.b;
import y6.h;

/* compiled from: DynamicAnimation.java */
/* loaded from: classes.dex */
public abstract class b<T extends b<T>> implements a.b {

    /* renamed from: l, reason: collision with root package name */
    public static final C0492b f35720l = new C0492b();

    /* renamed from: m, reason: collision with root package name */
    public static final c f35721m = new c();

    /* renamed from: n, reason: collision with root package name */
    public static final d f35722n = new d();
    public static final e o = new e();

    /* renamed from: p, reason: collision with root package name */
    public static final f f35723p = new f();

    /* renamed from: q, reason: collision with root package name */
    public static final a f35724q = new a();

    /* renamed from: a, reason: collision with root package name */
    public float f35725a;

    /* renamed from: b, reason: collision with root package name */
    public float f35726b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f35727c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f35728d;

    /* renamed from: e, reason: collision with root package name */
    public final u0.c f35729e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final float f35730g;

    /* renamed from: h, reason: collision with root package name */
    public long f35731h;

    /* renamed from: i, reason: collision with root package name */
    public final float f35732i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList<h> f35733j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList<i> f35734k;

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class a extends j {
        public a() {
            super("alpha");
        }

        @Override // u0.c
        public final float d(Object obj) {
            return ((View) obj).getAlpha();
        }

        @Override // u0.c
        public final void e(Object obj, float f) {
            ((View) obj).setAlpha(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: u0.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0492b extends j {
        public C0492b() {
            super("scaleX");
        }

        @Override // u0.c
        public final float d(Object obj) {
            return ((View) obj).getScaleX();
        }

        @Override // u0.c
        public final void e(Object obj, float f) {
            ((View) obj).setScaleX(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class c extends j {
        public c() {
            super("scaleY");
        }

        @Override // u0.c
        public final float d(Object obj) {
            return ((View) obj).getScaleY();
        }

        @Override // u0.c
        public final void e(Object obj, float f) {
            ((View) obj).setScaleY(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class d extends j {
        public d() {
            super("rotation");
        }

        @Override // u0.c
        public final float d(Object obj) {
            return ((View) obj).getRotation();
        }

        @Override // u0.c
        public final void e(Object obj, float f) {
            ((View) obj).setRotation(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class e extends j {
        public e() {
            super("rotationX");
        }

        @Override // u0.c
        public final float d(Object obj) {
            return ((View) obj).getRotationX();
        }

        @Override // u0.c
        public final void e(Object obj, float f) {
            ((View) obj).setRotationX(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class f extends j {
        public f() {
            super("rotationY");
        }

        @Override // u0.c
        public final float d(Object obj) {
            return ((View) obj).getRotationY();
        }

        @Override // u0.c
        public final void e(Object obj, float f) {
            ((View) obj).setRotationY(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public float f35735a;

        /* renamed from: b, reason: collision with root package name */
        public float f35736b;
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public interface h {
        void a();
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public interface i {
        void a();
    }

    /* compiled from: DynamicAnimation.java */
    /* loaded from: classes.dex */
    public static abstract class j extends u0.c {
        public j(String str) {
            super(str, 0);
        }
    }

    public b(Object obj) {
        h.a aVar = y6.h.I;
        this.f35725a = gl.Code;
        this.f35726b = Float.MAX_VALUE;
        this.f35727c = false;
        this.f = false;
        this.f35730g = -3.4028235E38f;
        this.f35731h = 0L;
        this.f35733j = new ArrayList<>();
        this.f35734k = new ArrayList<>();
        this.f35728d = obj;
        this.f35729e = aVar;
        if (aVar != f35722n && aVar != o && aVar != f35723p) {
            if (aVar == f35724q) {
                this.f35732i = 0.00390625f;
                return;
            } else if (aVar != f35720l && aVar != f35721m) {
                this.f35732i = 1.0f;
                return;
            } else {
                this.f35732i = 0.00390625f;
                return;
            }
        }
        this.f35732i = 0.1f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ec  */
    @Override // u0.a.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(long r26) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.b.a(long):boolean");
    }

    public final void b(float f10) {
        ArrayList<i> arrayList;
        this.f35729e.e(this.f35728d, f10);
        int i10 = 0;
        while (true) {
            arrayList = this.f35734k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                arrayList.get(i10).a();
            }
            i10++;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            } else {
                return;
            }
        }
    }
}
