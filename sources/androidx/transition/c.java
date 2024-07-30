package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* compiled from: ChangeBounds.java */
/* loaded from: classes.dex */
public final class c extends androidx.transition.i {
    public static final String[] P = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final b Q;
    public static final C0021c R;
    public static final d S;
    public static final e T;
    public static final f U;

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class a extends Property<Drawable, PointF> {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f2442a;

        public a() {
            super(PointF.class, "boundsOrigin");
            this.f2442a = new Rect();
        }

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            drawable.copyBounds(this.f2442a);
            return new PointF(r0.left, r0.top);
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            Rect rect = this.f2442a;
            drawable2.copyBounds(rect);
            rect.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(rect);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class b extends Property<i, PointF> {
        public b() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.f2445a = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f2446b = round;
            int i10 = iVar2.f + 1;
            iVar2.f = i10;
            if (i10 == iVar2.f2450g) {
                u.a(iVar2.f2449e, iVar2.f2445a, round, iVar2.f2447c, iVar2.f2448d);
                iVar2.f = 0;
                iVar2.f2450g = 0;
            }
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0021c extends Property<i, PointF> {
        public C0021c() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.f2447c = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f2448d = round;
            int i10 = iVar2.f2450g + 1;
            iVar2.f2450g = i10;
            if (iVar2.f == i10) {
                u.a(iVar2.f2449e, iVar2.f2445a, iVar2.f2446b, iVar2.f2447c, round);
                iVar2.f = 0;
                iVar2.f2450g = 0;
            }
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class d extends Property<View, PointF> {
        public d() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            u.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class e extends Property<View, PointF> {
        public e() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            u.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class f extends Property<View, PointF> {
        public f() {
            super(PointF.class, "position");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            u.a(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {
        private i mViewBounds;

        public g(i iVar) {
            this.mViewBounds = iVar;
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public class h extends l {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2443a = false;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2444b;

        public h(ViewGroup viewGroup) {
            this.f2444b = viewGroup;
        }

        @Override // androidx.transition.l, androidx.transition.i.d
        public final void a() {
            s.a(this.f2444b, false);
        }

        @Override // androidx.transition.l, androidx.transition.i.d
        public final void b() {
            s.a(this.f2444b, false);
            this.f2443a = true;
        }

        @Override // androidx.transition.i.d
        public final void c(androidx.transition.i iVar) {
            if (!this.f2443a) {
                s.a(this.f2444b, false);
            }
            iVar.v(this);
        }

        @Override // androidx.transition.l, androidx.transition.i.d
        public final void e() {
            s.a(this.f2444b, true);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public int f2445a;

        /* renamed from: b, reason: collision with root package name */
        public int f2446b;

        /* renamed from: c, reason: collision with root package name */
        public int f2447c;

        /* renamed from: d, reason: collision with root package name */
        public int f2448d;

        /* renamed from: e, reason: collision with root package name */
        public final View f2449e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f2450g;

        public i(View view) {
            this.f2449e = view;
        }
    }

    static {
        new a();
        Q = new b();
        R = new C0021c();
        S = new d();
        T = new e();
        U = new f();
    }

    public final void H(q qVar) {
        WeakHashMap<View, l0> weakHashMap = n0.c0.f33054a;
        View view = qVar.f2491b;
        if (c0.g.c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = qVar.f2490a;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", view.getParent());
        }
    }

    @Override // androidx.transition.i
    public final void d(q qVar) {
        H(qVar);
    }

    @Override // androidx.transition.i
    public final void g(q qVar) {
        H(qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.i
    public final Animator k(ViewGroup viewGroup, q qVar, q qVar2) {
        int i10;
        c cVar;
        ObjectAnimator ofObject;
        if (qVar != null && qVar2 != null) {
            HashMap hashMap = qVar.f2490a;
            HashMap hashMap2 = qVar2.f2490a;
            ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                int i11 = rect.left;
                int i12 = rect2.left;
                int i13 = rect.top;
                int i14 = rect2.top;
                int i15 = rect.right;
                int i16 = rect2.right;
                int i17 = rect.bottom;
                int i18 = rect2.bottom;
                int i19 = i15 - i11;
                int i20 = i17 - i13;
                int i21 = i16 - i12;
                int i22 = i18 - i14;
                Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                if ((i19 != 0 && i20 != 0) || (i21 != 0 && i22 != 0)) {
                    if (i11 == i12 && i13 == i14) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    if (i15 != i16 || i17 != i18) {
                        i10++;
                    }
                } else {
                    i10 = 0;
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i10++;
                }
                int i23 = i10;
                if (i23 > 0) {
                    View view = qVar2.f2491b;
                    u.a(view, i11, i13, i15, i17);
                    if (i23 == 2) {
                        if (i19 == i21 && i20 == i22) {
                            cVar = this;
                            ofObject = ObjectAnimator.ofObject(view, U, (TypeConverter) null, cVar.L.h(i11, i13, i12, i14));
                        } else {
                            cVar = this;
                            i iVar = new i(view);
                            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(iVar, Q, (TypeConverter) null, cVar.L.h(i11, i13, i12, i14));
                            ObjectAnimator ofObject3 = ObjectAnimator.ofObject(iVar, R, (TypeConverter) null, cVar.L.h(i15, i17, i16, i18));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(ofObject2, ofObject3);
                            animatorSet.addListener(new g(iVar));
                            ofObject = animatorSet;
                        }
                    } else {
                        cVar = this;
                        if (i11 == i12 && i13 == i14) {
                            ofObject = ObjectAnimator.ofObject(view, S, (TypeConverter) null, cVar.L.h(i15, i17, i16, i18));
                        } else {
                            ofObject = ObjectAnimator.ofObject(view, T, (TypeConverter) null, cVar.L.h(i11, i13, i12, i14));
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        s.a(viewGroup4, true);
                        cVar.a(new h(viewGroup4));
                    }
                    return ofObject;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // androidx.transition.i
    public final String[] p() {
        return P;
    }
}
