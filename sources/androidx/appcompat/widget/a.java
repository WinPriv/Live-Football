package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* compiled from: ActionBarBackgroundDrawable.java */
/* loaded from: classes.dex */
public final class a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f1122a;

    public a(ActionBarContainer actionBarContainer) {
        this.f1122a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1122a;
        if (actionBarContainer.f905z) {
            Drawable drawable = actionBarContainer.y;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f903w;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f904x;
        if (drawable3 != null && actionBarContainer.A) {
            drawable3.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f1122a;
        if (actionBarContainer.f905z) {
            if (actionBarContainer.y != null) {
                actionBarContainer.f903w.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f903w;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
