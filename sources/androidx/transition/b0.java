package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.i;
import java.util.HashMap;

/* compiled from: Visibility.java */
/* loaded from: classes.dex */
public abstract class b0 extends i {
    public static final String[] Q = {"android:visibility:visibility", "android:visibility:parent"};
    public int P = 3;

    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2437a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f2438b;

        /* renamed from: c, reason: collision with root package name */
        public int f2439c;

        /* renamed from: d, reason: collision with root package name */
        public int f2440d;

        /* renamed from: e, reason: collision with root package name */
        public ViewGroup f2441e;
        public ViewGroup f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.transition.b0.b I(androidx.transition.q r8, androidx.transition.q r9) {
        /*
            androidx.transition.b0$b r0 = new androidx.transition.b0$b
            r0.<init>()
            r1 = 0
            r0.f2437a = r1
            r0.f2438b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f2490a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f2439c = r7
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f2441e = r6
            goto L33
        L2f:
            r0.f2439c = r4
            r0.f2441e = r3
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f2490a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r3 = r6.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f2440d = r3
            java.lang.Object r2 = r6.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L56
        L52:
            r0.f2440d = r4
            r0.f = r3
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f2439c
            int r9 = r0.f2440d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f2441e
            android.view.ViewGroup r4 = r0.f
            if (r3 != r4) goto L68
            return r0
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f2438b = r1
            r0.f2437a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.f2438b = r2
            r0.f2437a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L81
            r0.f2438b = r1
            r0.f2437a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.f2441e
            if (r8 != 0) goto L9f
            r0.f2438b = r2
            r0.f2437a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f2440d
            if (r8 != 0) goto L95
            r0.f2438b = r2
            r0.f2437a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f2439c
            if (r8 != 0) goto L9f
            r0.f2438b = r1
            r0.f2437a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.b0.I(androidx.transition.q, androidx.transition.q):androidx.transition.b0$b");
    }

    public final void H(q qVar) {
        View view = qVar.f2491b;
        int visibility = view.getVisibility();
        HashMap hashMap = qVar.f2490a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    @Override // androidx.transition.i
    public final void d(q qVar) {
        H(qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (I(n(r3, false), q(r3, false)).f2437a != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01eb  */
    @Override // androidx.transition.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator k(android.view.ViewGroup r22, androidx.transition.q r23, androidx.transition.q r24) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.b0.k(android.view.ViewGroup, androidx.transition.q, androidx.transition.q):android.animation.Animator");
    }

    @Override // androidx.transition.i
    public final String[] p() {
        return Q;
    }

    @Override // androidx.transition.i
    public final boolean r(q qVar, q qVar2) {
        if (qVar == null && qVar2 == null) {
            return false;
        }
        if (qVar != null && qVar2 != null && qVar2.f2490a.containsKey("android:visibility:visibility") != qVar.f2490a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b I = I(qVar, qVar2);
        if (!I.f2437a) {
            return false;
        }
        if (I.f2439c != 0 && I.f2440d != 0) {
            return false;
        }
        return true;
    }

    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements i.d {

        /* renamed from: a, reason: collision with root package name */
        public final View f2432a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2433b;

        /* renamed from: c, reason: collision with root package name */
        public final ViewGroup f2434c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2436e;
        public boolean f = false;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f2435d = true;

        public a(View view, int i10) {
            this.f2432a = view;
            this.f2433b = i10;
            this.f2434c = (ViewGroup) view.getParent();
            f(true);
        }

        @Override // androidx.transition.i.d
        public final void a() {
            f(false);
        }

        @Override // androidx.transition.i.d
        public final void c(i iVar) {
            if (!this.f) {
                u.b(this.f2433b, this.f2432a);
                ViewGroup viewGroup = this.f2434c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
            iVar.v(this);
        }

        @Override // androidx.transition.i.d
        public final void e() {
            f(true);
        }

        public final void f(boolean z10) {
            ViewGroup viewGroup;
            if (this.f2435d && this.f2436e != z10 && (viewGroup = this.f2434c) != null) {
                this.f2436e = z10;
                s.a(viewGroup, z10);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f) {
                u.b(this.f2433b, this.f2432a);
                ViewGroup viewGroup = this.f2434c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            if (!this.f) {
                u.b(this.f2433b, this.f2432a);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            if (!this.f) {
                u.b(0, this.f2432a);
            }
        }

        @Override // androidx.transition.i.d
        public final void b() {
        }

        @Override // androidx.transition.i.d
        public final void d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
