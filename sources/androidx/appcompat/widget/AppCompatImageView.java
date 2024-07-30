package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* renamed from: s, reason: collision with root package name */
    public final c f958s;

    /* renamed from: t, reason: collision with root package name */
    public final i f959t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f960u;

    public AppCompatImageView() {
        throw null;
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        c cVar = this.f958s;
        if (cVar != null) {
            cVar.a();
        }
        i iVar = this.f959t;
        if (iVar != null) {
            iVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        c cVar = this.f958s;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c cVar = this.f958s;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        k0 k0Var;
        i iVar = this.f959t;
        if (iVar == null || (k0Var = iVar.f1190b) == null) {
            return null;
        }
        return k0Var.f1196a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        k0 k0Var;
        i iVar = this.f959t;
        if (iVar == null || (k0Var = iVar.f1190b) == null) {
            return null;
        }
        return k0Var.f1197b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((!(this.f959t.f1189a.getBackground() instanceof RippleDrawable)) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c cVar = this.f958s;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        c cVar = this.f958s;
        if (cVar != null) {
            cVar.f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        i iVar = this.f959t;
        if (iVar != null) {
            iVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        i iVar = this.f959t;
        if (iVar != null && drawable != null && !this.f960u) {
            iVar.f1191c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (iVar != null) {
            iVar.a();
            if (!this.f960u) {
                ImageView imageView = iVar.f1189a;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(iVar.f1191c);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f960u = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        i iVar = this.f959t;
        if (iVar != null) {
            iVar.c(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        i iVar = this.f959t;
        if (iVar != null) {
            iVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        c cVar = this.f958s;
        if (cVar != null) {
            cVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        c cVar = this.f958s;
        if (cVar != null) {
            cVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        i iVar = this.f959t;
        if (iVar != null) {
            if (iVar.f1190b == null) {
                iVar.f1190b = new k0();
            }
            k0 k0Var = iVar.f1190b;
            k0Var.f1196a = colorStateList;
            k0Var.f1199d = true;
            iVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        i iVar = this.f959t;
        if (iVar != null) {
            if (iVar.f1190b == null) {
                iVar.f1190b = new k0();
            }
            k0 k0Var = iVar.f1190b;
            k0Var.f1197b = mode;
            k0Var.f1198c = true;
            iVar.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.a(context);
        this.f960u = false;
        h0.a(getContext(), this);
        c cVar = new c(this);
        this.f958s = cVar;
        cVar.d(attributeSet, i10);
        i iVar = new i(this);
        this.f959t = iVar;
        iVar.b(attributeSet, i10);
    }
}
