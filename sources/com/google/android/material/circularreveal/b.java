package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* compiled from: CircularRevealWidget.java */
/* loaded from: classes2.dex */
public interface b {

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes2.dex */
    public static class a implements TypeEvaluator<d> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f20637b = new a();

        /* renamed from: a, reason: collision with root package name */
        public final d f20638a = new d();

        @Override // android.animation.TypeEvaluator
        public final d evaluate(float f, d dVar, d dVar2) {
            d dVar3 = dVar;
            d dVar4 = dVar2;
            float f10 = dVar3.f20641a;
            float f11 = 1.0f - f;
            float f12 = (dVar4.f20641a * f) + (f10 * f11);
            float f13 = dVar3.f20642b;
            float f14 = (dVar4.f20642b * f) + (f13 * f11);
            float f15 = dVar3.f20643c;
            float f16 = (f * dVar4.f20643c) + (f11 * f15);
            d dVar5 = this.f20638a;
            dVar5.f20641a = f12;
            dVar5.f20642b = f14;
            dVar5.f20643c = f16;
            return dVar5;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: com.google.android.material.circularreveal.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0237b extends Property<b, d> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0237b f20639a = new C0237b();

        public C0237b() {
            super(d.class, "circularReveal");
        }

        @Override // android.util.Property
        public final d get(b bVar) {
            return bVar.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(b bVar, d dVar) {
            bVar.setRevealInfo(dVar);
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes2.dex */
    public static class c extends Property<b, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f20640a = new c();

        public c() {
            super(Integer.class, "circularRevealScrimColor");
        }

        @Override // android.util.Property
        public final Integer get(b bVar) {
            return Integer.valueOf(bVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(b bVar, Integer num) {
            bVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public float f20641a;

        /* renamed from: b, reason: collision with root package name */
        public float f20642b;

        /* renamed from: c, reason: collision with root package name */
        public float f20643c;

        public d() {
        }

        public d(float f, float f10, float f11) {
            this.f20641a = f;
            this.f20642b = f10;
            this.f20643c = f11;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(d dVar);
}
