package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class NX implements View.OnTouchListener {
    public static String[] A01 = {"0HsLQMHMjdf9XxY0FoFJM6DI5mSYk5cq", "dhr4behIProWKSykj", "GE701vnHE9lzBn3SwA4tW4e1BtUaptEm", "cLSMigQ4cfHVDaX8bfW4FJ5X08fXhUZC", "1xDVph1vyW65p7zSnZeJ5giXq27He7tX", "cas2Jd68DEdp6", "xZiGDxwVLZDgesSRv509BK1mAeaT2HFq", "7L9x50qsEvVQf3Iy1"};
    public final /* synthetic */ RX A00;

    public NX(RX rx) {
        this.A00 = rx;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getActionMasked();
        if (action != 0) {
            if (action == 1) {
                float y = motionEvent.getY();
                f = this.A00.A00;
                String[] strArr = A01;
                if (strArr[1].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[1] = "l6HJRtuhNtCgLlDek";
                strArr2[7] = "Xh4l6Kh17owsVyOO9";
                if (f < y) {
                    this.A00.A0P(false);
                }
            }
        } else {
            this.A00.A00 = motionEvent.getY();
        }
        return true;
    }
}
