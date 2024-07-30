package p;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: RoundRectDrawable.java */
/* loaded from: classes.dex */
public final class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f34217a;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f34219c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f34220d;

    /* renamed from: e, reason: collision with root package name */
    public float f34221e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f34223h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f34224i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f34225j;
    public boolean f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f34222g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f34226k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f34218b = new Paint(5);

    public b(float f, ColorStateList colorStateList) {
        this.f34217a = f;
        b(colorStateList);
        this.f34219c = new RectF();
        this.f34220d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f34223h = colorStateList;
        this.f34218b.setColor(colorStateList.getColorForState(getState(), this.f34223h.getDefaultColor()));
    }

    public final void c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f34219c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f34220d;
        rect2.set(rect);
        if (this.f) {
            float a10 = c.a(this.f34221e, this.f34217a, this.f34222g);
            float f = this.f34221e;
            float f10 = this.f34217a;
            if (this.f34222g) {
                f = (float) (((1.0d - c.f34227a) * f10) + f);
            }
            rect2.inset((int) Math.ceil(f), (int) Math.ceil(a10));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f34218b;
        if (this.f34224i != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.f34224i);
            z10 = true;
        } else {
            z10 = false;
        }
        RectF rectF = this.f34219c;
        float f = this.f34217a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f34220d, this.f34217a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f34225j;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || (((colorStateList = this.f34223h) != null && colorStateList.isStateful()) || super.isStateful())) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f34223h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f34218b;
        if (colorForState != paint.getColor()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f34225j;
        if (colorStateList2 != null && (mode = this.f34226k) != null) {
            this.f34224i = a(colorStateList2, mode);
            return true;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f34218b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f34218b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f34225j = colorStateList;
        this.f34224i = a(colorStateList, this.f34226k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f34226k = mode;
        this.f34224i = a(this.f34225j, mode);
        invalidateSelf();
    }
}
