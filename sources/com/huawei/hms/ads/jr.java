package com.huawei.hms.ads;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;

/* loaded from: classes2.dex */
public class jr {
    public static int Code(MotionEvent motionEvent) {
        return motionEvent.getAction() & com.anythink.expressad.exoplayer.k.p.f9095b;
    }

    public static boolean V(View view, MotionEvent motionEvent) {
        int[] Code;
        if (view == null || motionEvent == null) {
            return true;
        }
        if ((view instanceof ImageView) && (Code = Code(view)) != null) {
            float x10 = motionEvent.getX();
            float y = motionEvent.getY();
            int width = view.getWidth();
            int height = view.getHeight();
            int i10 = Code[0];
            int i11 = Code[1];
            float abs = Math.abs((width / 2) - x10) - (i10 / 2);
            float abs2 = Math.abs((height / 2) - y) - (i11 / 2);
            if (abs > gl.Code || abs2 > gl.Code) {
                return true;
            }
        }
        return false;
    }

    public static MaterialClickInfo Code(View view, MotionEvent motionEvent) {
        if (view == null || motionEvent == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int width = view.getWidth();
        int height = view.getHeight();
        float x10 = motionEvent.getX();
        float y = motionEvent.getY();
        if (view instanceof ImageView) {
            int[] Code = Code(view);
            if (Code == null) {
                return null;
            }
            int i10 = Code[0];
            x10 -= (width - i10) / 2;
            y -= (height - r6) / 2;
            height = Code[1];
            width = i10;
        }
        sb2.append(width);
        sb2.append("*");
        sb2.append(height);
        return new MaterialClickInfo(Integer.valueOf((int) x10), Integer.valueOf((int) y), sb2.toString());
    }

    public static void Code(View view, MotionEvent motionEvent, Integer num, MaterialClickInfo materialClickInfo) {
        MaterialClickInfo Code;
        if (materialClickInfo == null || view == null || motionEvent == null) {
            return;
        }
        materialClickInfo.d(Float.valueOf(gb.z.l(view.getContext())));
        if (num != null) {
            materialClickInfo.e(num);
        }
        if (materialClickInfo.k() == null) {
            materialClickInfo.e(com.huawei.openalliance.ad.constant.w.cW);
        }
        if (materialClickInfo.k() != com.huawei.openalliance.ad.constant.w.cW || (Code = Code(view, motionEvent)) == null) {
            return;
        }
        materialClickInfo.j(Code.c());
        materialClickInfo.g(Code.i());
    }

    private static int[] Code(View view) {
        if (!(view instanceof ImageView)) {
            return null;
        }
        ImageView imageView = (ImageView) view;
        if (imageView.getDrawable() == null) {
            return null;
        }
        int width = imageView.getDrawable().getBounds().width();
        int height = imageView.getDrawable().getBounds().height();
        float[] fArr = new float[10];
        imageView.getImageMatrix().getValues(fArr);
        return new int[]{(int) (width * fArr[0]), (int) (height * fArr[4])};
    }
}
