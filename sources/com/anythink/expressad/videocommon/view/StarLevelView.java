package com.anythink.expressad.videocommon.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.anythink.expressad.foundation.h.i;

/* loaded from: classes.dex */
public class StarLevelView extends LinearLayout {
    public StarLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
    }

    public void initScore(double d10) {
        for (int i10 = 0; i10 < ((int) d10); i10++) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(i.a(getContext(), "anythink_video_common_full_star", i.f10125c));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i10 != 0) {
                layoutParams.setMargins(5, 0, 5, 0);
            }
            addView(imageView, layoutParams);
        }
        int i11 = (int) (50.0d - (d10 * 10.0d));
        if (i11 <= 0) {
            return;
        }
        if (i11 > 1 && i11 < 10) {
            if (i11 > 0 && i11 < 5) {
                ImageView imageView2 = new ImageView(getContext());
                imageView2.setImageResource(i.a(getContext(), "anythink_video_common_full_star", i.f10125c));
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.setMargins(5, 0, 5, 0);
                addView(imageView2, layoutParams2);
            } else {
                ImageView imageView3 = new ImageView(getContext());
                imageView3.setImageResource(i.a(getContext(), "anythink_video_common_full_star", i.f10125c));
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams3.setMargins(5, 0, 5, 0);
                addView(imageView3, layoutParams3);
            }
        }
        int i12 = i11 / 10;
        if (i12 > 0) {
            int i13 = i11 % (i12 * 10);
            if (i13 > 0 && i13 < 5) {
                ImageView imageView4 = new ImageView(getContext());
                imageView4.setImageResource(i.a(getContext(), "anythink_video_common_full_while_star", i.f10125c));
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams4.setMargins(5, 0, 5, 0);
                addView(imageView4, layoutParams4);
            } else if (i13 >= 5 && i13 <= 9) {
                ImageView imageView5 = new ImageView(getContext());
                imageView5.setImageResource(i.a(getContext(), "anythink_video_common_half_star", i.f10125c));
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams5.setMargins(5, 0, 5, 0);
                addView(imageView5, layoutParams5);
            }
            for (int i14 = 0; i14 < i12; i14++) {
                ImageView imageView6 = new ImageView(getContext());
                imageView6.setImageResource(i.a(getContext(), "anythink_video_common_full_while_star", i.f10125c));
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams6.setMargins(5, 0, 5, 0);
                addView(imageView6, layoutParams6);
            }
        }
    }

    public StarLevelView(Context context) {
        super(context);
        setOrientation(0);
    }

    @SuppressLint({"NewApi"})
    public StarLevelView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setOrientation(0);
    }
}
