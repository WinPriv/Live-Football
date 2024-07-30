package q3;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.activity.n;
import com.hamkho.livefoot.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewTarget.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class h<T extends View, Z> extends q3.a<Z> {

    /* renamed from: s, reason: collision with root package name */
    public final T f34628s;

    /* renamed from: t, reason: collision with root package name */
    public final a f34629t;

    /* compiled from: ViewTarget.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static Integer f34630d;

        /* renamed from: a, reason: collision with root package name */
        public final View f34631a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f34632b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public ViewTreeObserverOnPreDrawListenerC0461a f34633c;

        /* compiled from: ViewTarget.java */
        /* renamed from: q3.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ViewTreeObserverOnPreDrawListenerC0461a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: s, reason: collision with root package name */
            public final WeakReference<a> f34634s;

            public ViewTreeObserverOnPreDrawListenerC0461a(a aVar) {
                this.f34634s = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean z10;
                boolean z11;
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f34634s.get();
                if (aVar != null) {
                    ArrayList arrayList = aVar.f34632b;
                    if (!arrayList.isEmpty()) {
                        int c10 = aVar.c();
                        int b10 = aVar.b();
                        boolean z12 = false;
                        if (c10 <= 0 && c10 != Integer.MIN_VALUE) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            if (b10 <= 0 && b10 != Integer.MIN_VALUE) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            if (z11) {
                                z12 = true;
                            }
                        }
                        if (z12) {
                            Iterator it = new ArrayList(arrayList).iterator();
                            while (it.hasNext()) {
                                ((f) it.next()).b(c10, b10);
                            }
                            ViewTreeObserver viewTreeObserver = aVar.f34631a.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(aVar.f34633c);
                            }
                            aVar.f34633c = null;
                            arrayList.clear();
                        }
                    }
                }
                return true;
            }
        }

        public a(View view) {
            this.f34631a = view;
        }

        public final int a(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            View view = this.f34631a;
            if (!view.isLayoutRequested() && i11 == -2) {
                if (Log.isLoggable("ViewTarget", 4)) {
                    Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
                }
                Context context = view.getContext();
                if (f34630d == null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    n.n0(windowManager);
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getSize(point);
                    f34630d = Integer.valueOf(Math.max(point.x, point.y));
                }
                return f34630d.intValue();
            }
            return 0;
        }

        public final int b() {
            int i10;
            View view = this.f34631a;
            int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                i10 = layoutParams.height;
            } else {
                i10 = 0;
            }
            return a(view.getHeight(), i10, paddingBottom);
        }

        public final int c() {
            int i10;
            View view = this.f34631a;
            int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                i10 = layoutParams.width;
            } else {
                i10 = 0;
            }
            return a(view.getWidth(), i10, paddingRight);
        }
    }

    public h(T t10) {
        n.n0(t10);
        this.f34628s = t10;
        this.f34629t = new a(t10);
    }

    @Override // q3.g
    public final void b(f fVar) {
        this.f34629t.f34632b.remove(fVar);
    }

    @Override // q3.g
    public final void d(p3.d dVar) {
        this.f34628s.setTag(R.id.glide_custom_view_target_tag, dVar);
    }

    @Override // q3.g
    public final p3.d f() {
        Object tag = this.f34628s.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof p3.d) {
                return (p3.d) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // q3.g
    public void g(Drawable drawable) {
        a aVar = this.f34629t;
        ViewTreeObserver viewTreeObserver = aVar.f34631a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.f34633c);
        }
        aVar.f34633c = null;
        aVar.f34632b.clear();
    }

    @Override // q3.g
    public final void h(f fVar) {
        boolean z10;
        boolean z11;
        a aVar = this.f34629t;
        int c10 = aVar.c();
        int b10 = aVar.b();
        boolean z12 = false;
        if (c10 <= 0 && c10 != Integer.MIN_VALUE) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (b10 <= 0 && b10 != Integer.MIN_VALUE) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                z12 = true;
            }
        }
        if (z12) {
            fVar.b(c10, b10);
            return;
        }
        ArrayList arrayList = aVar.f34632b;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
        if (aVar.f34633c == null) {
            ViewTreeObserver viewTreeObserver = aVar.f34631a.getViewTreeObserver();
            a.ViewTreeObserverOnPreDrawListenerC0461a viewTreeObserverOnPreDrawListenerC0461a = new a.ViewTreeObserverOnPreDrawListenerC0461a(aVar);
            aVar.f34633c = viewTreeObserverOnPreDrawListenerC0461a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0461a);
        }
    }

    public final String toString() {
        return "Target for: " + this.f34628s;
    }
}
