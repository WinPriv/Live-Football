package d7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.huawei.hms.ads.gl;

/* compiled from: ShapeAppearanceModel.java */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.activity.n f27431a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.activity.n f27432b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.activity.n f27433c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.activity.n f27434d;

    /* renamed from: e, reason: collision with root package name */
    public final c f27435e;
    public final c f;

    /* renamed from: g, reason: collision with root package name */
    public final c f27436g;

    /* renamed from: h, reason: collision with root package name */
    public final c f27437h;

    /* renamed from: i, reason: collision with root package name */
    public final e f27438i;

    /* renamed from: j, reason: collision with root package name */
    public final e f27439j;

    /* renamed from: k, reason: collision with root package name */
    public final e f27440k;

    /* renamed from: l, reason: collision with root package name */
    public final e f27441l;

    public j(a aVar) {
        this.f27431a = aVar.f27442a;
        this.f27432b = aVar.f27443b;
        this.f27433c = aVar.f27444c;
        this.f27434d = aVar.f27445d;
        this.f27435e = aVar.f27446e;
        this.f = aVar.f;
        this.f27436g = aVar.f27447g;
        this.f27437h = aVar.f27448h;
        this.f27438i = aVar.f27449i;
        this.f27439j = aVar.f27450j;
        this.f27440k = aVar.f27451k;
        this.f27441l = aVar.f27452l;
    }

    public static a a(Context context, int i10, int i11, d7.a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(androidx.activity.n.f505q0);
        try {
            int i12 = obtainStyledAttributes.getInt(0, 0);
            int i13 = obtainStyledAttributes.getInt(3, i12);
            int i14 = obtainStyledAttributes.getInt(4, i12);
            int i15 = obtainStyledAttributes.getInt(2, i12);
            int i16 = obtainStyledAttributes.getInt(1, i12);
            c c10 = c(obtainStyledAttributes, 5, aVar);
            c c11 = c(obtainStyledAttributes, 8, c10);
            c c12 = c(obtainStyledAttributes, 9, c10);
            c c13 = c(obtainStyledAttributes, 7, c10);
            c c14 = c(obtainStyledAttributes, 6, c10);
            a aVar2 = new a();
            androidx.activity.n p02 = androidx.activity.n.p0(i13);
            aVar2.f27442a = p02;
            float b10 = a.b(p02);
            if (b10 != -1.0f) {
                aVar2.f27446e = new d7.a(b10);
            }
            aVar2.f27446e = c11;
            androidx.activity.n p03 = androidx.activity.n.p0(i14);
            aVar2.f27443b = p03;
            float b11 = a.b(p03);
            if (b11 != -1.0f) {
                aVar2.f = new d7.a(b11);
            }
            aVar2.f = c12;
            androidx.activity.n p04 = androidx.activity.n.p0(i15);
            aVar2.f27444c = p04;
            float b12 = a.b(p04);
            if (b12 != -1.0f) {
                aVar2.f27447g = new d7.a(b12);
            }
            aVar2.f27447g = c13;
            androidx.activity.n p05 = androidx.activity.n.p0(i16);
            aVar2.f27445d = p05;
            float b13 = a.b(p05);
            if (b13 != -1.0f) {
                aVar2.f27448h = new d7.a(b13);
            }
            aVar2.f27448h = c14;
            return aVar2;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static a b(Context context, AttributeSet attributeSet, int i10, int i11) {
        d7.a aVar = new d7.a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.activity.n.f497i0, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i10, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        if (i11 == 5) {
            return new d7.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i11 == 6) {
            return new h(peekValue.getFraction(1.0f, 1.0f));
        }
        return cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f27441l.getClass().equals(e.class) && this.f27439j.getClass().equals(e.class) && this.f27438i.getClass().equals(e.class) && this.f27440k.getClass().equals(e.class)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float a10 = this.f27435e.a(rectF);
        if (this.f.a(rectF) == a10 && this.f27437h.a(rectF) == a10 && this.f27436g.a(rectF) == a10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((this.f27432b instanceof i) && (this.f27431a instanceof i) && (this.f27433c instanceof i) && (this.f27434d instanceof i)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 && z11 && z12) {
            return true;
        }
        return false;
    }

    public final j e(float f) {
        a aVar = new a(this);
        aVar.f27446e = new d7.a(f);
        aVar.f = new d7.a(f);
        aVar.f27447g = new d7.a(f);
        aVar.f27448h = new d7.a(f);
        return new j(aVar);
    }

    /* compiled from: ShapeAppearanceModel.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public androidx.activity.n f27442a;

        /* renamed from: b, reason: collision with root package name */
        public androidx.activity.n f27443b;

        /* renamed from: c, reason: collision with root package name */
        public androidx.activity.n f27444c;

        /* renamed from: d, reason: collision with root package name */
        public androidx.activity.n f27445d;

        /* renamed from: e, reason: collision with root package name */
        public c f27446e;
        public c f;

        /* renamed from: g, reason: collision with root package name */
        public c f27447g;

        /* renamed from: h, reason: collision with root package name */
        public c f27448h;

        /* renamed from: i, reason: collision with root package name */
        public final e f27449i;

        /* renamed from: j, reason: collision with root package name */
        public final e f27450j;

        /* renamed from: k, reason: collision with root package name */
        public e f27451k;

        /* renamed from: l, reason: collision with root package name */
        public final e f27452l;

        public a() {
            this.f27442a = new i();
            this.f27443b = new i();
            this.f27444c = new i();
            this.f27445d = new i();
            this.f27446e = new d7.a(gl.Code);
            this.f = new d7.a(gl.Code);
            this.f27447g = new d7.a(gl.Code);
            this.f27448h = new d7.a(gl.Code);
            this.f27449i = new e();
            this.f27450j = new e();
            this.f27451k = new e();
            this.f27452l = new e();
        }

        public static float b(androidx.activity.n nVar) {
            if (nVar instanceof i) {
                return ((i) nVar).J0;
            }
            if (nVar instanceof d) {
                return ((d) nVar).J0;
            }
            return -1.0f;
        }

        public final j a() {
            return new j(this);
        }

        public a(j jVar) {
            this.f27442a = new i();
            this.f27443b = new i();
            this.f27444c = new i();
            this.f27445d = new i();
            this.f27446e = new d7.a(gl.Code);
            this.f = new d7.a(gl.Code);
            this.f27447g = new d7.a(gl.Code);
            this.f27448h = new d7.a(gl.Code);
            this.f27449i = new e();
            this.f27450j = new e();
            this.f27451k = new e();
            this.f27452l = new e();
            this.f27442a = jVar.f27431a;
            this.f27443b = jVar.f27432b;
            this.f27444c = jVar.f27433c;
            this.f27445d = jVar.f27434d;
            this.f27446e = jVar.f27435e;
            this.f = jVar.f;
            this.f27447g = jVar.f27436g;
            this.f27448h = jVar.f27437h;
            this.f27449i = jVar.f27438i;
            this.f27450j = jVar.f27439j;
            this.f27451k = jVar.f27440k;
            this.f27452l = jVar.f27441l;
        }
    }

    public j() {
        this.f27431a = new i();
        this.f27432b = new i();
        this.f27433c = new i();
        this.f27434d = new i();
        this.f27435e = new d7.a(gl.Code);
        this.f = new d7.a(gl.Code);
        this.f27436g = new d7.a(gl.Code);
        this.f27437h = new d7.a(gl.Code);
        this.f27438i = new e();
        this.f27439j = new e();
        this.f27440k = new e();
        this.f27441l = new e();
    }
}
