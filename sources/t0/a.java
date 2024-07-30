package t0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;
import o0.g;
import o0.h;
import o0.j;
import t0.b;

/* compiled from: ExploreByTouchHelper.java */
/* loaded from: classes.dex */
public abstract class a extends n0.a {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f35328n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final C0483a o = new C0483a();

    /* renamed from: p, reason: collision with root package name */
    public static final b f35329p = new b();

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f35333h;

    /* renamed from: i, reason: collision with root package name */
    public final View f35334i;

    /* renamed from: j, reason: collision with root package name */
    public c f35335j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f35330d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f35331e = new Rect();
    public final Rect f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f35332g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f35336k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f35337l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f35338m = Integer.MIN_VALUE;

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: t0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0483a implements b.a<g> {
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* loaded from: classes.dex */
    public class b {
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* loaded from: classes.dex */
    public class c extends h {
        public c() {
        }

        @Override // o0.h
        public final g a(int i10) {
            return new g(AccessibilityNodeInfo.obtain(a.this.n(i10).f33521a));
        }

        @Override // o0.h
        public final g b(int i10) {
            int i11;
            a aVar = a.this;
            if (i10 == 2) {
                i11 = aVar.f35336k;
            } else {
                i11 = aVar.f35337l;
            }
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i11);
        }

        @Override // o0.h
        public final boolean c(int i10, int i11, Bundle bundle) {
            int i12;
            a aVar = a.this;
            View view = aVar.f35334i;
            if (i10 != -1) {
                boolean z10 = true;
                if (i11 != 1) {
                    if (i11 != 2) {
                        boolean z11 = false;
                        if (i11 != 64) {
                            if (i11 != 128) {
                                Chip.b bVar = (Chip.b) aVar;
                                if (i11 == 16) {
                                    Chip chip = Chip.this;
                                    if (i10 == 0) {
                                        return chip.performClick();
                                    }
                                    if (i10 == 1) {
                                        chip.playSoundEffect(0);
                                        View.OnClickListener onClickListener = chip.f20607z;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                            z11 = true;
                                        }
                                        if (chip.K) {
                                            chip.J.q(1, 1);
                                        }
                                    }
                                }
                                return z11;
                            }
                            if (aVar.f35336k == i10) {
                                aVar.f35336k = Integer.MIN_VALUE;
                                view.invalidate();
                                aVar.q(i10, com.anythink.expressad.exoplayer.b.aX);
                            }
                            z10 = false;
                        } else {
                            AccessibilityManager accessibilityManager = aVar.f35333h;
                            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i12 = aVar.f35336k) != i10) {
                                if (i12 != Integer.MIN_VALUE) {
                                    aVar.f35336k = Integer.MIN_VALUE;
                                    aVar.f35334i.invalidate();
                                    aVar.q(i12, com.anythink.expressad.exoplayer.b.aX);
                                }
                                aVar.f35336k = i10;
                                view.invalidate();
                                aVar.q(i10, 32768);
                            }
                            z10 = false;
                        }
                        return z10;
                    }
                    return aVar.j(i10);
                }
                return aVar.p(i10);
            }
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            return c0.d.j(view, i11, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f35334i = view;
            this.f35333h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            if (c0.d.c(view) == 0) {
                c0.d.s(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // n0.a
    public final h b(View view) {
        if (this.f35335j == null) {
            this.f35335j = new c();
        }
        return this.f35335j;
    }

    @Override // n0.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // n0.a
    public final void d(View view, g gVar) {
        boolean z10;
        View.AccessibilityDelegate accessibilityDelegate = this.f33037a;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f33521a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = Chip.this;
        com.google.android.material.chip.a aVar = chip.f20605w;
        if (aVar != null && aVar.f20622k0) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        accessibilityNodeInfo.setClassName(chip.getAccessibilityClassName());
        gVar.j(chip.getText());
    }

    public final boolean j(int i10) {
        if (this.f35337l != i10) {
            return false;
        }
        this.f35337l = Integer.MIN_VALUE;
        Chip.b bVar = (Chip.b) this;
        if (i10 == 1) {
            Chip chip = Chip.this;
            chip.E = false;
            chip.refreshDrawableState();
        }
        q(i10, 8);
        return true;
    }

    public final g k(int i10) {
        boolean z10;
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        g gVar = new g(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = f35328n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        gVar.f33522b = -1;
        View view = this.f35334i;
        obtain.setParent(view);
        o(i10, gVar);
        if (gVar.e() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f35331e;
        gVar.d(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(view.getContext().getPackageName());
                    gVar.f33523c = i10;
                    obtain.setSource(view, i10);
                    boolean z11 = false;
                    if (this.f35336k == i10) {
                        obtain.setAccessibilityFocused(true);
                        gVar.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        gVar.a(64);
                    }
                    if (this.f35337l == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        gVar.a(2);
                    } else if (obtain.isFocusable()) {
                        gVar.a(1);
                    }
                    obtain.setFocused(z10);
                    int[] iArr = this.f35332g;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.f35330d;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        gVar.d(rect3);
                        if (gVar.f33522b != -1) {
                            g gVar2 = new g(AccessibilityNodeInfo.obtain());
                            int i11 = gVar.f33522b;
                            while (true) {
                                accessibilityNodeInfo = gVar2.f33521a;
                                if (i11 == -1) {
                                    break;
                                }
                                gVar2.f33522b = -1;
                                accessibilityNodeInfo.setParent(view, -1);
                                accessibilityNodeInfo.setBoundsInParent(rect);
                                o(i11, gVar2);
                                gVar2.d(rect2);
                                rect3.offset(rect2.left, rect2.top);
                                i11 = gVar2.f33522b;
                            }
                            accessibilityNodeInfo.recycle();
                        }
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.f;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            gVar.f33521a.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                                Object parent = view.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view2 = (View) parent;
                                        if (view2.getAlpha() <= gl.Code || view2.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view2.getParent();
                                    } else if (parent != null) {
                                        z11 = true;
                                    }
                                }
                            }
                            if (z11) {
                                obtain.setVisibleToUser(true);
                            }
                        }
                    }
                    return gVar;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0145, code lost:
    
        if (r14 < ((r15 * r15) + ((r13 * 13) * r13))) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.a.m(int, android.graphics.Rect):boolean");
    }

    public final g n(int i10) {
        if (i10 == -1) {
            View view = this.f35334i;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            g gVar = new g(obtain);
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            l(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                gVar.f33521a.addChild(view, ((Integer) arrayList.get(i11)).intValue());
            }
            return gVar;
        }
        return k(i10);
    }

    public abstract void o(int i10, g gVar);

    public final boolean p(int i10) {
        int i11;
        View view = this.f35334i;
        if ((!view.isFocused() && !view.requestFocus()) || (i11 = this.f35337l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            j(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f35337l = i10;
        Chip.b bVar = (Chip.b) this;
        if (i10 == 1) {
            Chip chip = Chip.this;
            chip.E = true;
            chip.refreshDrawableState();
        }
        q(i10, 8);
        return true;
    }

    public final void q(int i10, int i11) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i10 == Integer.MIN_VALUE || !this.f35333h.isEnabled() || (parent = (view = this.f35334i).getParent()) == null) {
            return;
        }
        if (i10 != -1) {
            obtain = AccessibilityEvent.obtain(i11);
            g n10 = n(i10);
            obtain.getText().add(n10.e());
            AccessibilityNodeInfo accessibilityNodeInfo = n10.f33521a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            j.a(obtain, view, i10);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i11);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
