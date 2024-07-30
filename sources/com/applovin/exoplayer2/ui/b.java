package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.ui.SubtitleView;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class b extends View implements SubtitleView.a {

    /* renamed from: a, reason: collision with root package name */
    private final List<i> f16698a;

    /* renamed from: b, reason: collision with root package name */
    private List<com.applovin.exoplayer2.i.a> f16699b;

    /* renamed from: c, reason: collision with root package name */
    private int f16700c;

    /* renamed from: d, reason: collision with root package name */
    private float f16701d;

    /* renamed from: e, reason: collision with root package name */
    private c f16702e;
    private float f;

    public b(Context context) {
        this(context, null);
    }

    @Override // com.applovin.exoplayer2.ui.SubtitleView.a
    public void a(List<com.applovin.exoplayer2.i.a> list, c cVar, float f, int i10, float f10) {
        this.f16699b = list;
        this.f16702e = cVar;
        this.f16701d = f;
        this.f16700c = i10;
        this.f = f10;
        while (this.f16698a.size() < list.size()) {
            this.f16698a.add(new i(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<com.applovin.exoplayer2.i.a> list = this.f16699b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom > paddingTop && width > paddingLeft) {
            int i10 = paddingBottom - paddingTop;
            float a10 = j.a(this.f16700c, this.f16701d, height, i10);
            if (a10 <= gl.Code) {
                return;
            }
            int size = list.size();
            int i11 = 0;
            while (i11 < size) {
                com.applovin.exoplayer2.i.a aVar = list.get(i11);
                if (aVar.f15520q != Integer.MIN_VALUE) {
                    aVar = a(aVar);
                }
                com.applovin.exoplayer2.i.a aVar2 = aVar;
                int i12 = paddingBottom;
                this.f16698a.get(i11).a(aVar2, this.f16702e, a10, j.a(aVar2.o, aVar2.f15519p, height, i10), this.f, canvas, paddingLeft, paddingTop, width, i12);
                i11++;
                size = size;
                i10 = i10;
                paddingBottom = i12;
                width = width;
            }
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16698a = new ArrayList();
        this.f16699b = Collections.emptyList();
        this.f16700c = 0;
        this.f16701d = 0.0533f;
        this.f16702e = c.f16703a;
        this.f = 0.08f;
    }

    private static com.applovin.exoplayer2.i.a a(com.applovin.exoplayer2.i.a aVar) {
        a.C0175a a10 = aVar.a().a(-3.4028235E38f).b(Integer.MIN_VALUE).a((Layout.Alignment) null);
        if (aVar.f15511g == 0) {
            a10.a(1.0f - aVar.f, 0);
        } else {
            a10.a((-aVar.f) - 1.0f, 1);
        }
        int i10 = aVar.f15512h;
        if (i10 == 0) {
            a10.a(2);
        } else if (i10 == 2) {
            a10.a(0);
        }
        return a10.e();
    }
}
