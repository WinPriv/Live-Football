package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public class HiProgressBar extends ImageView {

    /* renamed from: s, reason: collision with root package name */
    public final a f23121s;

    public HiProgressBar(Context context) {
        super(context);
        a aVar = new a();
        this.f23121s = aVar;
        setImageDrawable(aVar);
    }

    public final void a() {
        a aVar = this.f23121s;
        if (aVar != null) {
            aVar.f23125c = 0;
        }
    }

    public void setProgress(int i10) {
        a aVar = this.f23121s;
        if (aVar != null) {
            aVar.getClass();
            if (i10 > 100) {
                i10 = 100;
            }
            if (i10 >= aVar.f23125c) {
                aVar.f23125c = i10;
            }
            aVar.invalidateSelf();
        }
    }

    /* loaded from: classes2.dex */
    public static class a extends Drawable {

        /* renamed from: d, reason: collision with root package name */
        public static final int f23122d = Color.parseColor("#007DFF");

        /* renamed from: a, reason: collision with root package name */
        public final Paint f23123a;

        /* renamed from: b, reason: collision with root package name */
        public final Paint f23124b;

        /* renamed from: c, reason: collision with root package name */
        public int f23125c;

        public a() {
            Paint paint = new Paint();
            this.f23123a = paint;
            paint.setColor(-16777216);
            paint.setAlpha(26);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            Paint paint2 = new Paint();
            this.f23124b = paint2;
            paint2.setColor(f23122d);
            paint2.setAlpha(com.anythink.expressad.exoplayer.k.p.f9095b);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            canvas.drawRect(getBounds(), this.f23123a);
            float f = this.f23125c / 100.0f;
            if (getLayoutDirection() == 1) {
                canvas.rotate(180.0f, (getBounds().right / 2) - (getBounds().left / 2), (getBounds().bottom / 2) - (getBounds().top / 2));
            }
            canvas.drawRect(getBounds().left, getBounds().top, getBounds().right * f, getBounds().bottom, this.f23124b);
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
