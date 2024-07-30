package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import d6.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r5.a;

/* loaded from: classes2.dex */
public final class SubtitleView extends FrameLayout {
    public a A;
    public View B;

    /* renamed from: s, reason: collision with root package name */
    public List<r5.a> f20312s;

    /* renamed from: t, reason: collision with root package name */
    public b f20313t;

    /* renamed from: u, reason: collision with root package name */
    public int f20314u;

    /* renamed from: v, reason: collision with root package name */
    public float f20315v;

    /* renamed from: w, reason: collision with root package name */
    public float f20316w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20317x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public int f20318z;

    /* loaded from: classes2.dex */
    public interface a {
        void a(List<r5.a> list, b bVar, float f, int i10, float f10);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20312s = Collections.emptyList();
        this.f20313t = b.f20336g;
        this.f20314u = 0;
        this.f20315v = 0.0533f;
        this.f20316w = 0.08f;
        this.f20317x = true;
        this.y = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.A = canvasSubtitleOutput;
        this.B = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.f20318z = 1;
    }

    private List<r5.a> getCuesWithStylingPreferencesApplied() {
        if (this.f20317x && this.y) {
            return this.f20312s;
        }
        ArrayList arrayList = new ArrayList(this.f20312s.size());
        for (int i10 = 0; i10 < this.f20312s.size(); i10++) {
            r5.a aVar = this.f20312s.get(i10);
            aVar.getClass();
            a.C0471a c0471a = new a.C0471a(aVar);
            if (!this.f20317x) {
                c0471a.f34913n = false;
                CharSequence charSequence = c0471a.f34901a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        c0471a.f34901a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = c0471a.f34901a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof v5.b)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                h.a(c0471a);
            } else if (!this.y) {
                h.a(c0471a);
            }
            arrayList.add(c0471a.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (g0.f27302a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private b getUserCaptionStyle() {
        CaptioningManager captioningManager;
        b bVar;
        int i10;
        int i11;
        int i12;
        int i13 = g0.f27302a;
        b bVar2 = b.f20336g;
        if (i13 >= 19 && !isInEditMode() && (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            if (i13 >= 21) {
                int i14 = -1;
                if (userStyle.hasForegroundColor()) {
                    i10 = userStyle.foregroundColor;
                } else {
                    i10 = -1;
                }
                if (userStyle.hasBackgroundColor()) {
                    i11 = userStyle.backgroundColor;
                } else {
                    i11 = -16777216;
                }
                int i15 = i11;
                int i16 = 0;
                if (userStyle.hasWindowColor()) {
                    i12 = userStyle.windowColor;
                } else {
                    i12 = 0;
                }
                if (userStyle.hasEdgeType()) {
                    i16 = userStyle.edgeType;
                }
                int i17 = i16;
                if (userStyle.hasEdgeColor()) {
                    i14 = userStyle.edgeColor;
                }
                bVar = new b(i10, i15, i12, i17, i14, userStyle.getTypeface());
            } else {
                bVar = new b(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
            }
            return bVar;
        }
        return bVar2;
    }

    private <T extends View & a> void setView(T t10) {
        removeView(this.B);
        View view = this.B;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).f20330t.destroy();
        }
        this.B = t10;
        this.A = t10;
        addView(t10);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.A.a(getCuesWithStylingPreferencesApplied(), this.f20313t, this.f20315v, this.f20314u, this.f20316w);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.y = z10;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f20317x = z10;
        c();
    }

    public void setBottomPaddingFraction(float f) {
        this.f20316w = f;
        c();
    }

    public void setCues(List<r5.a> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f20312s = list;
        c();
    }

    public void setFractionalTextSize(float f) {
        this.f20314u = 0;
        this.f20315v = f;
        c();
    }

    public void setStyle(b bVar) {
        this.f20313t = bVar;
        c();
    }

    public void setViewType(int i10) {
        if (this.f20318z == i10) {
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                setView(new WebViewSubtitleOutput(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            setView(new CanvasSubtitleOutput(getContext()));
        }
        this.f20318z = i10;
    }
}
