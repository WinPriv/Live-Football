package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.anythink.core.common.k.u;
import com.anythink.core.common.ui.component.RoundImageView;

/* loaded from: classes.dex */
public class WrapRoundImageView extends RoundImageView {
    public WrapRoundImageView(Context context) {
        super(context);
    }

    public int[] setBitmapAndResize(Bitmap bitmap, int i10, int i11) {
        setImageBitmap(bitmap);
        if (i10 > 0 && i11 > 0) {
            try {
                int[] a10 = u.a(i10, i11, bitmap.getWidth() / bitmap.getHeight());
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = a10[0];
                    layoutParams.height = a10[1];
                    setLayoutParams(layoutParams);
                    return a10;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public WrapRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
