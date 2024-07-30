package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.m0;
import com.hamkho.livefoot.R;
import java.util.WeakHashMap;
import n0.c0;
import n0.l0;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {
    public LinearLayout A;
    public final Drawable B;
    public final int C;
    public final Context D;
    public boolean E;
    public final Drawable F;
    public final boolean G;
    public LayoutInflater H;
    public boolean I;

    /* renamed from: s, reason: collision with root package name */
    public j f745s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView f746t;

    /* renamed from: u, reason: collision with root package name */
    public RadioButton f747u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f748v;

    /* renamed from: w, reason: collision with root package name */
    public CheckBox f749w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f750x;
    public ImageView y;

    /* renamed from: z, reason: collision with root package name */
    public ImageView f751z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m0 m10 = m0.m(getContext(), attributeSet, a0.a.T, R.attr.listMenuViewStyle);
        this.B = m10.e(5);
        this.C = m10.i(1, -1);
        this.E = m10.a(7, false);
        this.D = context;
        this.F = m10.e(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.G = obtainStyledAttributes.hasValue(0);
        m10.n();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.H == null) {
            this.H = LayoutInflater.from(getContext());
        }
        return this.H;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        int i10;
        ImageView imageView = this.y;
        if (imageView != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f751z;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f751z.getLayoutParams();
            rect.top = this.f751z.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    @Override // androidx.appcompat.view.menu.n.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(androidx.appcompat.view.menu.j r11) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(androidx.appcompat.view.menu.j):void");
    }

    @Override // androidx.appcompat.view.menu.n.a
    public j getItemData() {
        return this.f745s;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap<View, l0> weakHashMap = c0.f33054a;
        c0.d.q(this, this.B);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f748v = textView;
        int i10 = this.C;
        if (i10 != -1) {
            textView.setTextAppearance(this.D, i10);
        }
        this.f750x = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.y = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.F);
        }
        this.f751z = (ImageView) findViewById(R.id.group_divider);
        this.A = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f746t != null && this.E) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f746t.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        boolean z11;
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f747u == null && this.f749w == null) {
            return;
        }
        if ((this.f745s.f862x & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (this.f747u == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f747u = radioButton;
                LinearLayout linearLayout = this.A;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f747u;
            view = this.f749w;
        } else {
            if (this.f749w == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f749w = checkBox;
                LinearLayout linearLayout2 = this.A;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f749w;
            view = this.f747u;
        }
        if (z10) {
            compoundButton.setChecked(this.f745s.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.f749w;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f747u;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        boolean z11;
        CompoundButton compoundButton;
        if ((this.f745s.f862x & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (this.f747u == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f747u = radioButton;
                LinearLayout linearLayout = this.A;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f747u;
        } else {
            if (this.f749w == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f749w = checkBox;
                LinearLayout linearLayout2 = this.A;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f749w;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.I = z10;
        this.E = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        int i10;
        ImageView imageView = this.f751z;
        if (imageView != null) {
            if (!this.G && z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageView.setVisibility(i10);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f745s.f853n.getClass();
        boolean z10 = this.I;
        if (!z10 && !this.E) {
            return;
        }
        ImageView imageView = this.f746t;
        if (imageView == null && drawable == null && !this.E) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.f746t = imageView2;
            LinearLayout linearLayout = this.A;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.E) {
            this.f746t.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.f746t;
        if (!z10) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.f746t.getVisibility() != 0) {
            this.f746t.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f748v.setText(charSequence);
            if (this.f748v.getVisibility() != 0) {
                this.f748v.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f748v.getVisibility() != 8) {
            this.f748v.setVisibility(8);
        }
    }
}
