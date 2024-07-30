package com.anythink.expressad.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.anythink.expressad.foundation.g.d.b;
import com.anythink.expressad.foundation.g.d.c;

/* loaded from: classes.dex */
public class ATImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12510a = "at-widget-imageview";

    /* renamed from: b, reason: collision with root package name */
    private Bitmap f12511b;

    /* renamed from: c, reason: collision with root package name */
    private String f12512c;

    /* renamed from: com.anythink.expressad.widget.ATImageView$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements c {
        public AnonymousClass1() {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            ATImageView.this.setImageBitmap(bitmap);
        }
    }

    public ATImageView(Context context) {
        super(context);
        this.f12511b = null;
    }

    private void a() {
        if (getContext() != null) {
            b.a(getContext()).a(this.f12512c, new AnonymousClass1());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            Bitmap bitmap = this.f12511b;
            if (bitmap != null && bitmap.isRecycled()) {
                if (getContext() != null) {
                    b.a(getContext()).a(this.f12512c, new AnonymousClass1());
                    return;
                }
                return;
            }
            super.onDraw(canvas);
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f12511b = bitmap;
        if (bitmap != null && bitmap.isRecycled()) {
            this.f12511b = null;
            super.setImageBitmap(null);
        } else {
            super.setImageBitmap(bitmap);
        }
    }

    public void setImageUrl(String str) {
        this.f12512c = str;
    }

    public ATImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12511b = null;
    }

    public ATImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f12511b = null;
    }
}
