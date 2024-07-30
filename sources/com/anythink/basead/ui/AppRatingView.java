package com.anythink.basead.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AppRatingView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private Context f4075a;

    /* renamed from: b, reason: collision with root package name */
    private List<StarLevelView> f4076b;

    /* renamed from: c, reason: collision with root package name */
    private int f4077c;

    /* renamed from: d, reason: collision with root package name */
    private int f4078d;

    public AppRatingView(Context context) {
        this(context, null, 0);
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setRating(int i10) {
        for (int i11 = 0; i11 < this.f4076b.size(); i11++) {
            StarLevelView starLevelView = this.f4076b.get(i11);
            if (i11 < i10) {
                starLevelView.setState(true);
            } else {
                starLevelView.setState(false);
            }
        }
    }

    public void setStarMargin(int i10) {
        this.f4078d = i10;
    }

    public void setStarNum(int i10) {
        if (this.f4076b == null) {
            this.f4076b = new ArrayList();
        }
        this.f4076b.clear();
        removeAllViews();
        setOrientation(0);
        for (int i11 = 0; i11 < i10; i11++) {
            StarLevelView starLevelView = new StarLevelView(getContext());
            int i12 = this.f4077c;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i12, i12);
            if (i11 != i10 - 1) {
                layoutParams.setMargins(0, 0, dip2px(getContext(), this.f4078d), 0);
            }
            starLevelView.setLayoutParams(layoutParams);
            addView(starLevelView);
            this.f4076b.add(starLevelView);
        }
    }

    public void setStarSizeInDp(int i10) {
        this.f4077c = dip2px(this.f4075a, i10);
    }

    public AppRatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppRatingView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f4075a = context;
        setStarSizeInDp(17);
        setStarMargin(8);
    }
}
