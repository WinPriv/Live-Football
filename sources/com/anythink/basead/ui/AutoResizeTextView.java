package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.huawei.hms.ads.gl;

/* loaded from: classes.dex */
public class AutoResizeTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private static final int f4089a = 1000;

    /* renamed from: b, reason: collision with root package name */
    private static final int f4090b = 5;

    /* renamed from: c, reason: collision with root package name */
    private TextPaint f4091c;

    /* renamed from: d, reason: collision with root package name */
    private float f4092d;

    /* renamed from: e, reason: collision with root package name */
    private float f4093e;
    private boolean f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4094g;

    public AutoResizeTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4092d = 1.0f;
        this.f4093e = gl.Code;
        this.f = false;
        this.f4094g = false;
        a();
    }

    private void a() {
        this.f4091c = new TextPaint();
    }

    private void b() {
        CharSequence text = getText();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width != 0 && height != 0 && !TextUtils.isEmpty(text)) {
            this.f4094g = true;
            int textSize = (int) getTextSize();
            while (textSize >= 5) {
                this.f4091c.setTextSize(textSize);
                int measureText = (int) this.f4091c.measureText(text, 0, text.length());
                int height2 = new StaticLayout(text, this.f4091c, width, Layout.Alignment.ALIGN_NORMAL, this.f4092d, this.f4093e, true).getHeight();
                if (measureText < width && height2 < height) {
                    break;
                } else {
                    textSize--;
                }
            }
            setTextSize(0, textSize);
            this.f4094g = false;
            this.f = false;
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f4094g) {
            return;
        }
        if (this.f) {
            CharSequence text = getText();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            if (width != 0 && height != 0 && !TextUtils.isEmpty(text)) {
                this.f4094g = true;
                int textSize = (int) getTextSize();
                while (textSize >= 5) {
                    this.f4091c.setTextSize(textSize);
                    int measureText = (int) this.f4091c.measureText(text, 0, text.length());
                    int height2 = new StaticLayout(text, this.f4091c, width, Layout.Alignment.ALIGN_NORMAL, this.f4092d, this.f4093e, true).getHeight();
                    if (measureText < width && height2 < height) {
                        break;
                    } else {
                        textSize--;
                    }
                }
                setTextSize(0, textSize);
                this.f4094g = false;
                this.f = false;
                invalidate();
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f = true;
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        this.f = true;
    }

    @Override // android.widget.TextView
    public void setLineSpacing(float f, float f10) {
        super.setLineSpacing(f, f10);
        this.f4092d = f10;
        this.f4093e = f;
    }

    private int a(CharSequence charSequence, int i10) {
        return new StaticLayout(charSequence, this.f4091c, i10, Layout.Alignment.ALIGN_NORMAL, this.f4092d, this.f4093e, true).getHeight();
    }

    public AutoResizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4092d = 1.0f;
        this.f4093e = gl.Code;
        this.f = false;
        this.f4094g = false;
        a();
    }

    public AutoResizeTextView(Context context) {
        super(context);
        this.f4092d = 1.0f;
        this.f4093e = gl.Code;
        this.f = false;
        this.f4094g = false;
        a();
    }
}
