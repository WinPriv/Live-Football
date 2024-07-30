package n0;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import com.hamkho.livefoot.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import n0.a;
import n0.c;
import n0.c0;
import n0.q0;
import o0.g;

/* compiled from: ViewCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap<View, l0> f33054a;

    /* renamed from: b, reason: collision with root package name */
    public static Field f33055b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f33056c;

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f33057d;

    /* renamed from: e, reason: collision with root package name */
    public static final x f33058e;
    public static final a f;

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static abstract class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f33060a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<T> f33061b;

        /* renamed from: c, reason: collision with root package name */
        public final int f33062c;

        /* renamed from: d, reason: collision with root package name */
        public final int f33063d;

        public b(int i10, Class<T> cls, int i11, int i12) {
            this.f33060a = i10;
            this.f33061b = cls;
            this.f33063d = i11;
            this.f33062c = i12;
        }

        public static boolean a(Boolean bool, Boolean bool2) {
            boolean z10;
            boolean z11;
            if (bool != null && bool.booleanValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bool2 != null && bool2.booleanValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 == z11) {
                return true;
            }
            return false;
        }

        public abstract T b(View view);

        public abstract void c(View view, T t10);

        public final T d(View view) {
            boolean z10;
            if (Build.VERSION.SDK_INT >= this.f33062c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return b(view);
            }
            T t10 = (T) view.getTag(this.f33060a);
            if (this.f33061b.isInstance(t10)) {
                return t10;
            }
            return null;
        }

        public final void e(View view, T t10) {
            boolean z10;
            n0.a aVar;
            if (Build.VERSION.SDK_INT >= this.f33062c) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                c(view, t10);
                return;
            }
            if (f(d(view), t10)) {
                View.AccessibilityDelegate c10 = c0.c(view);
                if (c10 == null) {
                    aVar = null;
                } else if (c10 instanceof a.C0442a) {
                    aVar = ((a.C0442a) c10).f33039a;
                } else {
                    aVar = new n0.a(c10);
                }
                if (aVar == null) {
                    aVar = new n0.a();
                }
                c0.l(view, aVar);
                view.setTag(this.f33060a, t10);
                c0.g(this.f33063d, view);
            }
        }

        public abstract boolean f(T t10, T t11);
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class d {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        public static void s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i10) {
            view.setLabelFor(i10);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        public static void k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class f {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class g {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        public static void f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class h {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class i {

        /* compiled from: ViewCompat.java */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public q0 f33064a = null;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f33065b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n0.s f33066c;

            public a(View view, n0.s sVar) {
                this.f33065b = view;
                this.f33066c = sVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                q0 g6 = q0.g(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                n0.s sVar = this.f33066c;
                if (i10 < 30) {
                    i.a(windowInsets, this.f33065b);
                    if (g6.equals(this.f33064a)) {
                        return sVar.a(view, g6).f();
                    }
                }
                this.f33064a = g6;
                q0 a10 = sVar.a(view, g6);
                if (i10 >= 30) {
                    return a10.f();
                }
                WeakHashMap<View, l0> weakHashMap = c0.f33054a;
                h.c(view);
                return a10.f();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static q0 b(View view, q0 q0Var, Rect rect) {
            WindowInsets f = q0Var.f();
            if (f != null) {
                return q0.g(view.computeSystemWindowInsets(f, rect), view);
            }
            rect.setEmpty();
            return q0Var;
        }

        public static boolean c(View view, float f, float f10, boolean z10) {
            return view.dispatchNestedFling(f, f10, z10);
        }

        public static boolean d(View view, float f, float f10) {
            return view.dispatchNestedPreFling(f, f10);
        }

        public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static q0 j(View view) {
            q0.e bVar;
            if (q0.a.f33103d && view.isAttachedToWindow()) {
                try {
                    Object obj = q0.a.f33100a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) q0.a.f33101b.get(obj);
                        Rect rect2 = (Rect) q0.a.f33102c.get(obj);
                        if (rect != null && rect2 != null) {
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 >= 30) {
                                bVar = new q0.d();
                            } else if (i10 >= 29) {
                                bVar = new q0.c();
                            } else {
                                bVar = new q0.b();
                            }
                            bVar.c(f0.b.a(rect.left, rect.top, rect.right, rect.bottom));
                            bVar.d(f0.b.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
                            q0 b10 = bVar.b();
                            b10.f33099a.p(b10);
                            b10.f33099a.d(view.getRootView());
                            return b10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f) {
            view.setElevation(f);
        }

        public static void t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        public static void u(View view, n0.s sVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, sVar);
            }
            if (sVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, sVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f) {
            view.setTranslationZ(f);
        }

        public static void x(View view, float f) {
            view.setZ(f);
        }

        public static boolean y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class j {
        public static q0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            q0 g6 = q0.g(rootWindowInsets, null);
            q0.k kVar = g6.f33099a;
            kVar.p(g6);
            kVar.d(view.getRootView());
            return g6;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        public static void d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class k {
        public static void a(View view) {
            view.cancelDragAndDrop();
        }

        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        public static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        public static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i10) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i10);
        }

        public static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class l {
        public static void a(View view, Collection<View> collection, int i10) {
            view.addKeyboardNavigationClusters(collection, i10);
        }

        public static int b(View view) {
            return n0.k.b(view);
        }

        public static int c(View view) {
            int nextClusterForwardId;
            nextClusterForwardId = view.getNextClusterForwardId();
            return nextClusterForwardId;
        }

        public static boolean d(View view) {
            return n0.k.q(view);
        }

        public static boolean e(View view) {
            return n0.k.p(view);
        }

        public static boolean f(View view) {
            return n0.k.o(view);
        }

        public static boolean g(View view) {
            boolean isKeyboardNavigationCluster;
            isKeyboardNavigationCluster = view.isKeyboardNavigationCluster();
            return isKeyboardNavigationCluster;
        }

        public static View h(View view, View view2, int i10) {
            View keyboardNavigationClusterSearch;
            keyboardNavigationClusterSearch = view.keyboardNavigationClusterSearch(view2, i10);
            return keyboardNavigationClusterSearch;
        }

        public static boolean i(View view) {
            return n0.k.m(view);
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z10) {
            n0.k.j(view, z10);
        }

        public static void l(View view, int i10) {
            view.setImportantForAutofill(i10);
        }

        public static void m(View view, boolean z10) {
            view.setKeyboardNavigationCluster(z10);
        }

        public static void n(View view, int i10) {
            n0.k.f(i10, view);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class m {
        /* JADX WARN: Type inference failed for: r0v1, types: [n0.f0, java.lang.Object] */
        public static void a(View view, final r rVar) {
            q.i iVar = (q.i) view.getTag(R.id.tag_unhandled_key_listeners);
            if (iVar == null) {
                iVar = new q.i();
                view.setTag(R.id.tag_unhandled_key_listeners, iVar);
            }
            Objects.requireNonNull(rVar);
            ?? r02 = new View.OnUnhandledKeyEventListener() { // from class: n0.f0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return c0.r.this.a();
                }
            };
            iVar.put(rVar, r02);
            view.addOnUnhandledKeyEventListener(r02);
        }

        public static CharSequence b(View view) {
            CharSequence accessibilityPaneTitle;
            accessibilityPaneTitle = view.getAccessibilityPaneTitle();
            return accessibilityPaneTitle;
        }

        public static boolean c(View view) {
            boolean isAccessibilityHeading;
            isAccessibilityHeading = view.isAccessibilityHeading();
            return isAccessibilityHeading;
        }

        public static boolean d(View view) {
            boolean isScreenReaderFocusable;
            isScreenReaderFocusable = view.isScreenReaderFocusable();
            return isScreenReaderFocusable;
        }

        public static void e(View view, r rVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            q.i iVar = (q.i) view.getTag(R.id.tag_unhandled_key_listeners);
            if (iVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) iVar.getOrDefault(rVar, null)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        public static <T> T f(View view, int i10) {
            KeyEvent.Callback requireViewById;
            requireViewById = view.requireViewById(i10);
            return (T) requireViewById;
        }

        public static void g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class n {
        public static View.AccessibilityDelegate a(View view) {
            View.AccessibilityDelegate accessibilityDelegate;
            accessibilityDelegate = view.getAccessibilityDelegate();
            return accessibilityDelegate;
        }

        public static List<Rect> b(View view) {
            List<Rect> systemGestureExclusionRects;
            systemGestureExclusionRects = view.getSystemGestureExclusionRects();
            return systemGestureExclusionRects;
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class o {
        public static CharSequence a(View view) {
            CharSequence stateDescription;
            stateDescription = view.getStateDescription();
            return stateDescription;
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static final class p {
        public static String[] a(View view) {
            String[] receiveContentMimeTypes;
            receiveContentMimeTypes = view.getReceiveContentMimeTypes();
            return receiveContentMimeTypes;
        }

        public static n0.c b(View view, n0.c cVar) {
            ContentInfo performReceiveContent;
            ContentInfo c10 = cVar.f33041a.c();
            Objects.requireNonNull(c10);
            performReceiveContent = view.performReceiveContent(c10);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == c10) {
                return cVar;
            }
            return new n0.c(new c.d(performReceiveContent));
        }

        public static void c(View view, String[] strArr, t tVar) {
            if (tVar != null) {
                view.setOnReceiveContentListener(strArr, new q(tVar));
            } else {
                view.setOnReceiveContentListener(strArr, null);
            }
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static final class q implements OnReceiveContentListener {

        /* renamed from: a, reason: collision with root package name */
        public final t f33067a;

        public q(t tVar) {
            this.f33067a = tVar;
        }

        @Override // android.view.OnReceiveContentListener
        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            n0.c cVar = new n0.c(new c.d(contentInfo));
            n0.c a10 = this.f33067a.a(view, cVar);
            if (a10 == null) {
                return null;
            }
            if (a10 == cVar) {
                return contentInfo;
            }
            ContentInfo c10 = a10.f33041a.c();
            Objects.requireNonNull(c10);
            return c10;
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public interface r {
        boolean a();
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class s {

        /* renamed from: d, reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f33068d = new ArrayList<>();

        /* renamed from: a, reason: collision with root package name */
        public WeakHashMap<View, Boolean> f33069a = null;

        /* renamed from: b, reason: collision with root package name */
        public SparseArray<WeakReference<View>> f33070b = null;

        /* renamed from: c, reason: collision with root package name */
        public WeakReference<KeyEvent> f33071c = null;

        public static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((r) arrayList.get(size)).a()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            View a10;
            WeakHashMap<View, Boolean> weakHashMap = this.f33069a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    do {
                        childCount--;
                        if (childCount >= 0) {
                            a10 = a(viewGroup.getChildAt(childCount), keyEvent);
                        }
                    } while (a10 == null);
                    return a10;
                }
                if (b(view, keyEvent)) {
                    return view;
                }
                return null;
            }
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [n0.x] */
    static {
        new AtomicInteger(1);
        f33054a = null;
        f33056c = false;
        f33057d = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        f33058e = new u() { // from class: n0.x
            @Override // n0.u
            public final c a(c cVar) {
                return cVar;
            }
        };
        f = new a();
    }

    public static l0 a(View view) {
        if (f33054a == null) {
            f33054a = new WeakHashMap<>();
        }
        l0 l0Var = f33054a.get(view);
        if (l0Var == null) {
            l0 l0Var2 = new l0(view);
            f33054a.put(view, l0Var2);
            return l0Var2;
        }
        return l0Var;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = s.f33068d;
        s sVar = (s) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (sVar == null) {
            sVar = new s();
            view.setTag(R.id.tag_unhandled_key_event_manager, sVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = sVar.f33069a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = s.f33068d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (sVar.f33069a == null) {
                        sVar.f33069a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = s.f33068d;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            sVar.f33069a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                sVar.f33069a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a10 = sVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a10 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (sVar.f33070b == null) {
                    sVar.f33070b = new SparseArray<>();
                }
                sVar.f33070b.put(keyCode, new WeakReference<>(a10));
            }
        }
        if (a10 == null) {
            return false;
        }
        return true;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return n.a(view);
        }
        if (f33056c) {
            return null;
        }
        if (f33055b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f33055b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f33056c = true;
                return null;
            }
        }
        try {
            Object obj = f33055b.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            f33056c = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        boolean z10;
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            tag = m.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static String[] f(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return p.a(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(int i10, View view) {
        boolean z10;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (d(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = 32;
        if (g.a(view) == 0 && !z10) {
            if (i10 == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                g.g(obtain, i10);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(d(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    g.e(view.getParent(), view, view, i10);
                    return;
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                    return;
                }
            }
            return;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z10) {
            i11 = 2048;
        }
        obtain2.setEventType(i11);
        g.g(obtain2, i10);
        if (z10) {
            obtain2.getText().add(d(view));
            if (d.c(view) == 0) {
                d.s(view, 1);
            }
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                }
                if (d.c((View) parent) == 4) {
                    d.s(view, 2);
                    break;
                }
                parent = parent.getParent();
            }
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static n0.c h(View view, n0.c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return p.b(view, cVar);
        }
        t tVar = (t) view.getTag(R.id.tag_on_receive_content_listener);
        u uVar = f33058e;
        if (tVar != null) {
            n0.c a10 = tVar.a(view, cVar);
            if (a10 == null) {
                return null;
            }
            if (view instanceof u) {
                uVar = (u) view;
            }
            return uVar.a(a10);
        }
        if (view instanceof u) {
            uVar = (u) view;
        }
        return uVar.a(cVar);
    }

    public static void i(int i10, View view) {
        ArrayList e10 = e(view);
        for (int i11 = 0; i11 < e10.size(); i11++) {
            if (((g.a) e10.get(i11)).a() == i10) {
                e10.remove(i11);
                return;
            }
        }
    }

    public static void j(View view, g.a aVar, o0.k kVar) {
        n0.a aVar2;
        if (kVar == null) {
            i(aVar.a(), view);
            g(0, view);
            return;
        }
        g.a aVar3 = new g.a(null, aVar.f33532b, null, kVar, aVar.f33533c);
        View.AccessibilityDelegate c10 = c(view);
        if (c10 == null) {
            aVar2 = null;
        } else if (c10 instanceof a.C0442a) {
            aVar2 = ((a.C0442a) c10).f33039a;
        } else {
            aVar2 = new n0.a(c10);
        }
        if (aVar2 == null) {
            aVar2 = new n0.a();
        }
        l(view, aVar2);
        i(aVar3.a(), view);
        e(view).add(aVar3);
        g(0, view);
    }

    public static void k(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            n.c(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void l(View view, n0.a aVar) {
        a.C0442a c0442a;
        if (aVar == null && (c(view) instanceof a.C0442a)) {
            aVar = new n0.a();
        }
        if (aVar == null) {
            c0442a = null;
        } else {
            c0442a = aVar.f33038b;
        }
        view.setAccessibilityDelegate(c0442a);
    }

    public static void m(View view, CharSequence charSequence) {
        boolean z10;
        new z().e(view, charSequence);
        a aVar = f;
        if (charSequence != null) {
            WeakHashMap<View, Boolean> weakHashMap = aVar.f33059s;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z10));
            view.addOnAttachStateChangeListener(aVar);
            if (g.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
                return;
            }
            return;
        }
        aVar.f33059s.remove(view);
        view.removeOnAttachStateChangeListener(aVar);
        d.o(view.getViewTreeObserver(), aVar);
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: s, reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f33059s = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            boolean z10;
            int i10;
            if (Build.VERSION.SDK_INT < 28) {
                WeakHashMap<View, Boolean> weakHashMap = this.f33059s;
                for (Map.Entry<View, Boolean> entry : weakHashMap.entrySet()) {
                    View key = entry.getKey();
                    boolean booleanValue = entry.getValue().booleanValue();
                    if (key.isShown() && key.getWindowVisibility() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (booleanValue != z10) {
                        if (z10) {
                            i10 = 16;
                        } else {
                            i10 = 32;
                        }
                        c0.g(i10, key);
                        weakHashMap.put(key, Boolean.valueOf(z10));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
