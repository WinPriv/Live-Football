package com.huawei.openalliance.ad.views;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.huawei.hms.ads.ed;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.gl;
import gb.r0;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class PPSBaseTwistView extends PPSBaseStyleView {

    /* renamed from: w, reason: collision with root package name */
    public ImageView f23812w;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PPSBaseTwistView pPSBaseTwistView = PPSBaseTwistView.this;
            ex.V(pPSBaseTwistView.getViewTag(), "imageView %s %s", Integer.valueOf(pPSBaseTwistView.f23812w.getWidth()), Integer.valueOf(pPSBaseTwistView.f23812w.getHeight()));
            pPSBaseTwistView.f23812w.setPivotX(r1.getWidth() / 2.0f);
            pPSBaseTwistView.f23812w.setPivotY(r0.i(pPSBaseTwistView.getContext(), 80.0f) + r1.getHeight());
            if (pPSBaseTwistView.f23812w != null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setInterpolator(new ed(0.33f, gl.Code, 0.67f, 1.0f));
                ArrayList arrayList = new ArrayList(4);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pPSBaseTwistView.f23812w, "rotation", gl.Code, -7.0f);
                ofFloat.setDuration(150L);
                arrayList.add(ofFloat);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pPSBaseTwistView.f23812w, "rotation", -7.0f, 7.0f);
                ofFloat2.setDuration(400L);
                arrayList.add(ofFloat2);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(pPSBaseTwistView.f23812w, "rotation", 7.0f, -4.5f);
                ofFloat3.setDuration(350L);
                arrayList.add(ofFloat3);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(pPSBaseTwistView.f23812w, "rotation", -4.5f, 2.0f);
                ofFloat4.setDuration(350L);
                arrayList.add(ofFloat4);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(pPSBaseTwistView.f23812w, "rotation", 2.0f, gl.Code);
                ofFloat5.setDuration(250L);
                arrayList.add(ofFloat5);
                pPSBaseTwistView.f23812w.invalidate();
                animatorSet.playSequentially(arrayList);
                animatorSet.start();
            }
        }
    }

    public PPSBaseTwistView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public String getViewTag() {
        return "PPSBaseStyleView";
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ex.V(getViewTag(), "w=%s, h=%s, oldw=%s, oldh=%s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        this.f23812w.post(new a());
    }
}
