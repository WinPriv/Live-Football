package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.huawei.hms.ads.gl;
import n0.v0;
import p.b;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f1302x = {R.attr.colorBackground};
    public static final v0 y = new v0();

    /* renamed from: s, reason: collision with root package name */
    public boolean f1303s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1304t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f1305u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f1306v;

    /* renamed from: w, reason: collision with root package name */
    public final a f1307w;

    /* loaded from: classes.dex */
    public class a implements p.a {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f1308a;

        public a() {
        }

        public final void a(int i10, int i11, int i12, int i13) {
            CardView cardView = CardView.this;
            cardView.f1306v.set(i10, i11, i12, i13);
            Rect rect = cardView.f1305u;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.hamkho.livefoot.R.attr.cardViewStyle);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1305u = rect;
        this.f1306v = new Rect();
        a aVar = new a();
        this.f1307w = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v0.f33133a, com.hamkho.livefoot.R.attr.cardViewStyle, com.hamkho.livefoot.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1302x);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.hamkho.livefoot.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.hamkho.livefoot.R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, gl.Code);
        float dimension2 = obtainStyledAttributes.getDimension(4, gl.Code);
        float dimension3 = obtainStyledAttributes.getDimension(5, gl.Code);
        this.f1303s = obtainStyledAttributes.getBoolean(7, false);
        this.f1304t = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        v0 v0Var = y;
        b bVar = new b(dimension, valueOf);
        aVar.f1308a = bVar;
        setBackgroundDrawable(bVar);
        setClipToOutline(true);
        setElevation(dimension2);
        v0Var.e(aVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((b) this.f1307w.f1308a).f34223h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f1305u.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1305u.left;
    }

    public int getContentPaddingRight() {
        return this.f1305u.right;
    }

    public int getContentPaddingTop() {
        return this.f1305u.top;
    }

    public float getMaxCardElevation() {
        return ((b) this.f1307w.f1308a).f34221e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f1304t;
    }

    public float getRadius() {
        return ((b) this.f1307w.f1308a).f34217a;
    }

    public boolean getUseCompatPadding() {
        return this.f1303s;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        b bVar = (b) this.f1307w.f1308a;
        bVar.b(valueOf);
        bVar.invalidateSelf();
    }

    public void setCardElevation(float f) {
        CardView.this.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        y.e(this.f1307w, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        super.setMinimumWidth(i10);
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f1304t) {
            this.f1304t = z10;
            v0 v0Var = y;
            a aVar = this.f1307w;
            v0Var.e(aVar, ((b) aVar.f1308a).f34221e);
        }
    }

    public void setRadius(float f) {
        b bVar = (b) this.f1307w.f1308a;
        if (f != bVar.f34217a) {
            bVar.f34217a = f;
            bVar.c(null);
            bVar.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f1303s != z10) {
            this.f1303s = z10;
            v0 v0Var = y;
            a aVar = this.f1307w;
            v0Var.e(aVar, ((b) aVar.f1308a).f34221e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        b bVar = (b) this.f1307w.f1308a;
        bVar.b(colorStateList);
        bVar.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }
}
