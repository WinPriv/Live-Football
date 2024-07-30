package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout implements an.d {

    /* renamed from: a, reason: collision with root package name */
    private List<com.applovin.exoplayer2.i.a> f16686a;

    /* renamed from: b, reason: collision with root package name */
    private c f16687b;

    /* renamed from: c, reason: collision with root package name */
    private int f16688c;

    /* renamed from: d, reason: collision with root package name */
    private float f16689d;

    /* renamed from: e, reason: collision with root package name */
    private float f16690e;
    private boolean f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16691g;

    /* renamed from: h, reason: collision with root package name */
    private int f16692h;

    /* renamed from: i, reason: collision with root package name */
    private a f16693i;

    /* renamed from: j, reason: collision with root package name */
    private View f16694j;

    /* loaded from: classes.dex */
    public interface a {
        void a(List<com.applovin.exoplayer2.i.a> list, c cVar, float f, int i10, float f10);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    private void e() {
        this.f16693i.a(getCuesWithStylingPreferencesApplied(), this.f16687b, this.f16689d, this.f16688c, this.f16690e);
    }

    private List<com.applovin.exoplayer2.i.a> getCuesWithStylingPreferencesApplied() {
        if (this.f && this.f16691g) {
            return this.f16686a;
        }
        ArrayList arrayList = new ArrayList(this.f16686a.size());
        for (int i10 = 0; i10 < this.f16686a.size(); i10++) {
            arrayList.add(a(this.f16686a.get(i10)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (ai.f16274a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private c getUserCaptionStyle() {
        if (ai.f16274a >= 19 && !isInEditMode()) {
            CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
            if (captioningManager != null && captioningManager.isEnabled()) {
                return c.a(captioningManager.getUserStyle());
            }
            return c.f16703a;
        }
        return c.f16703a;
    }

    private <T extends View & a> void setView(T t10) {
        removeView(this.f16694j);
        View view = this.f16694j;
        if (view instanceof l) {
            ((l) view).a();
        }
        this.f16694j = t10;
        this.f16693i = t10;
        addView(t10);
    }

    @Override // com.applovin.exoplayer2.an.d
    public void a(List<com.applovin.exoplayer2.i.a> list) {
        setCues(list);
    }

    public void c() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void d() {
        setStyle(getUserCaptionStyle());
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f16691g = z10;
        e();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f = z10;
        e();
    }

    public void setBottomPaddingFraction(float f) {
        this.f16690e = f;
        e();
    }

    public void setCues(List<com.applovin.exoplayer2.i.a> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f16686a = list;
        e();
    }

    public void setFractionalTextSize(float f) {
        a(f, false);
    }

    public void setStyle(c cVar) {
        this.f16687b = cVar;
        e();
    }

    public void setViewType(int i10) {
        if (this.f16692h == i10) {
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                setView(new l(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            setView(new b(getContext()));
        }
        this.f16692h = i10;
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16686a = Collections.emptyList();
        this.f16687b = c.f16703a;
        this.f16688c = 0;
        this.f16689d = 0.0533f;
        this.f16690e = 0.08f;
        this.f = true;
        this.f16691g = true;
        b bVar = new b(context);
        this.f16693i = bVar;
        this.f16694j = bVar;
        addView(bVar);
        this.f16692h = 1;
    }

    public void a(float f, boolean z10) {
        a(z10 ? 1 : 0, f);
    }

    private void a(int i10, float f) {
        this.f16688c = i10;
        this.f16689d = f;
        e();
    }

    private com.applovin.exoplayer2.i.a a(com.applovin.exoplayer2.i.a aVar) {
        a.C0175a a10 = aVar.a();
        if (!this.f) {
            j.a(a10);
        } else if (!this.f16691g) {
            j.b(a10);
        }
        return a10.e();
    }
}
