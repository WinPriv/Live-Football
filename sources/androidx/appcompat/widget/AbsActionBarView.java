package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.hamkho.livefoot.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class AbsActionBarView extends ViewGroup {

    /* renamed from: s, reason: collision with root package name */
    public final a f889s;

    /* renamed from: t, reason: collision with root package name */
    public final Context f890t;

    /* renamed from: u, reason: collision with root package name */
    public ActionMenuView f891u;

    /* renamed from: v, reason: collision with root package name */
    public ActionMenuPresenter f892v;

    /* renamed from: w, reason: collision with root package name */
    public int f893w;

    /* renamed from: x, reason: collision with root package name */
    public n0.l0 f894x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f895z;

    /* loaded from: classes.dex */
    public class a implements n0.m0 {

        /* renamed from: s, reason: collision with root package name */
        public boolean f896s = false;

        /* renamed from: t, reason: collision with root package name */
        public int f897t;

        public a() {
        }

        @Override // n0.m0
        public final void a() {
            if (this.f896s) {
                return;
            }
            AbsActionBarView absActionBarView = AbsActionBarView.this;
            absActionBarView.f894x = null;
            AbsActionBarView.super.setVisibility(this.f897t);
        }

        @Override // n0.m0
        public final void b(View view) {
            this.f896s = true;
        }

        @Override // n0.m0
        public final void c() {
            AbsActionBarView.super.setVisibility(0);
            this.f896s = false;
        }
    }

    public AbsActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int c(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - 0);
    }

    public static int d(int i10, int i11, int i12, View view, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        if (z10) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public int getAnimatedVisibility() {
        if (this.f894x != null) {
            return this.f889s.f897t;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f893w;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, a0.a.C, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f892v;
        if (actionMenuPresenter != null) {
            Configuration configuration2 = actionMenuPresenter.f777t.getResources().getConfiguration();
            int i11 = configuration2.screenWidthDp;
            int i12 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i11 <= 600 && ((i11 <= 960 || i12 <= 720) && (i11 <= 720 || i12 <= 960))) {
                if (i11 < 500 && ((i11 <= 640 || i12 <= 480) && (i11 <= 480 || i12 <= 640))) {
                    if (i11 >= 360) {
                        i10 = 3;
                    } else {
                        i10 = 2;
                    }
                } else {
                    i10 = 4;
                }
            } else {
                i10 = 5;
            }
            actionMenuPresenter.I = i10;
            androidx.appcompat.view.menu.h hVar = actionMenuPresenter.f778u;
            if (hVar != null) {
                hVar.p(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f895z = false;
        }
        if (!this.f895z) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f895z = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f895z = false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.y = false;
        }
        if (!this.y) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.y = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.y = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f893w = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            n0.l0 l0Var = this.f894x;
            if (l0Var != null) {
                l0Var.b();
            }
            super.setVisibility(i10);
        }
    }

    public AbsActionBarView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f889s = new a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f890t = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f890t = context;
        }
    }
}
