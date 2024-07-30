package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.hamkho.livefoot.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DropDownListView extends ListView {
    public final boolean A;
    public boolean B;
    public r0.f C;
    public f D;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f1011s;

    /* renamed from: t, reason: collision with root package name */
    public int f1012t;

    /* renamed from: u, reason: collision with root package name */
    public int f1013u;

    /* renamed from: v, reason: collision with root package name */
    public int f1014v;

    /* renamed from: w, reason: collision with root package name */
    public int f1015w;

    /* renamed from: x, reason: collision with root package name */
    public int f1016x;
    public d y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1017z;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(View view, float f, float f10) {
            view.drawableHotspotChanged(f, f10);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final Method f1018a;

        /* renamed from: b, reason: collision with root package name */
        public static final Method f1019b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f1020c;

        /* renamed from: d, reason: collision with root package name */
        public static final boolean f1021d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f1018a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f1019b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f1020c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f1021d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends h.a {

        /* renamed from: t, reason: collision with root package name */
        public boolean f1022t;

        public d(Drawable drawable) {
            super(drawable);
            this.f1022t = true;
        }

        @Override // h.a, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.f1022t) {
                super.draw(canvas);
            }
        }

        @Override // h.a, android.graphics.drawable.Drawable
        public final void setHotspot(float f, float f10) {
            if (this.f1022t) {
                super.setHotspot(f, f10);
            }
        }

        @Override // h.a, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f1022t) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // h.a, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f1022t) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // h.a, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z10, boolean z11) {
            if (this.f1022t) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final Field f1023a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f1023a = field;
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.D = null;
            dropDownListView.drawableStateChanged();
        }
    }

    public DropDownListView(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f1011s = new Rect();
        this.f1012t = 0;
        this.f1013u = 0;
        this.f1014v = 0;
        this.f1015w = 0;
        this.A = z10;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z10) {
        d dVar = this.y;
        if (dVar != null) {
            dVar.f1022t = z10;
        }
    }

    public final int a(int i10, int i11) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i12 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i12;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i13 = 0;
        View view = null;
        for (int i14 = 0; i14 < count; i14++) {
            int itemViewType = adapter.getItemViewType(i14);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(i14, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            if (i15 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i10, makeMeasureSpec);
            view.forceLayout();
            if (i14 > 0) {
                i12 += dividerHeight;
            }
            i12 += view.getMeasuredHeight();
            if (i12 >= i11) {
                return i11;
            }
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0143 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.DropDownListView.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f1011s;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.D != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.B && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (!this.A && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (!this.A && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (!this.A && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if ((this.A && this.f1017z) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.D = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.D == null) {
            f fVar = new f();
            this.D = fVar;
            post(fVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 >= 30 && b.f1021d) {
                        try {
                            b.f1018a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            b.f1019b.invoke(this, Integer.valueOf(pointToPosition));
                            b.f1020c.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException e10) {
                            e10.printStackTrace();
                        } catch (InvocationTargetException e11) {
                            e11.printStackTrace();
                        }
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.B && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1016x = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.D;
        if (fVar != null) {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.D = null;
            dropDownListView.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f1017z = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar;
        if (drawable != null) {
            dVar = new d(drawable);
        } else {
            dVar = null;
        }
        this.y = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1012t = rect.left;
        this.f1013u = rect.top;
        this.f1014v = rect.right;
        this.f1015w = rect.bottom;
    }
}
