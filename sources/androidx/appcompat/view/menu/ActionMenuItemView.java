package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.q0;
import androidx.appcompat.widget.z;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements n.a, View.OnClickListener, ActionMenuView.a {
    public CharSequence A;
    public Drawable B;
    public h.b C;
    public a D;
    public b E;
    public boolean F;
    public boolean G;
    public final int H;
    public int I;
    public final int J;

    /* renamed from: z, reason: collision with root package name */
    public j f742z;

    /* loaded from: classes.dex */
    public class a extends z {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.z
        public final p b() {
            ActionMenuPresenter.a aVar;
            b bVar = ActionMenuItemView.this.E;
            if (bVar == null || (aVar = ActionMenuPresenter.this.M) == null) {
                return null;
            }
            return aVar.a();
        }

        @Override // androidx.appcompat.widget.z
        public final boolean c() {
            p b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            h.b bVar = actionMenuItemView.C;
            if (bVar == null || !bVar.a(actionMenuItemView.f742z) || (b10 = b()) == null || !b10.a()) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.F = m();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.E, 0, 0);
        this.H = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.J = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.I = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean a() {
        return l();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean b() {
        if (l() && this.f742z.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public final void c(j jVar) {
        int i10;
        this.f742z = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitleCondensed());
        setId(jVar.f841a);
        if (jVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.D == null) {
            this.D = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public j getItemData() {
        return this.f742z;
    }

    public final boolean l() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean m() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (i10 < 480 && ((i10 < 640 || i11 < 480) && configuration.orientation != 2)) {
            return false;
        }
        return true;
    }

    public final void n() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z10;
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.A);
        if (this.B != null) {
            if ((this.f742z.y & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || (!this.F && !this.G)) {
                z11 = false;
            }
        }
        boolean z13 = z12 & z11;
        CharSequence charSequence3 = null;
        if (z13) {
            charSequence = this.A;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.f742z.f855q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z13) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f742z.f845e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.f742z.f856r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z13) {
                charSequence3 = this.f742z.f845e;
            }
            q0.a(this, charSequence3);
            return;
        }
        q0.a(this, charSequence5);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h.b bVar = this.C;
        if (bVar != null) {
            bVar.a(this.f742z);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.F = m();
        n();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean l10 = l();
        if (l10 && (i13 = this.I) >= 0) {
            super.setPadding(i13, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i14 = this.H;
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(size, i14);
        } else {
            i12 = i14;
        }
        if (mode != 1073741824 && i14 > 0 && measuredWidth < i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }
        if (!l10 && this.B != null) {
            super.setPadding((getMeasuredWidth() - this.B.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f742z.hasSubMenu() && (aVar = this.D) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            j jVar = this.f742z;
            if (jVar != null) {
                h hVar = jVar.f853n;
                hVar.f825k = true;
                hVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.B = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.J;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        n();
    }

    public void setItemInvoker(h.b bVar) {
        this.C = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.I = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.E = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.A = charSequence;
        n();
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }
}
