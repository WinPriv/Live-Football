package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.huawei.hms.ads.gl;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class JF extends ImageView implements InterfaceC1122Ot {
    public static byte[] A05;
    public static String[] A06 = {"CZ6R6baQKTb1E5sAmpDqVkfMXF7zVnG4", "nQZGX73N3q5NRRZlZyP90gUTrDeeLYBu", "LfCM6PYFJNbwOvLH4thVDQon3h1Zk2zk", "bpUakkTElIOqaP65ISNG9oh", "gJtMODfbj2e7z8MJG7ZRKfD", "8rYwk9o7IGDDsMQbyUTj4ra1LUt9E6qX", "3WiLQHXTUUJ8WctEatoRQ", "Xo7nIXQ5hsw2R0tzDjIU8fyfjH4jtFIR"};
    public static final int A07;

    @Nullable
    public P1 A00;
    public final Paint A01;
    public final C1316Wj A02;
    public final C0954Ib A03;
    public final JP A04;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{101, 93, 92, 77, 8, 105, 76};
    }

    static {
        A06();
        A07 = (int) (Kd.A02 * 4.0f);
    }

    public JF(C1316Wj c1316Wj, C0954Ib c0954Ib) {
        super(c1316Wj);
        this.A04 = new JP() { // from class: com.facebook.ads.redexgen.X.6a
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(JQ jq) {
                JF.this.A09();
            }
        };
        this.A03 = c0954Ib;
        this.A02 = c1316Wj;
        this.A01 = new Paint();
        this.A01.setColor(-1728053248);
        setColorFilter(-1);
        int i10 = A07;
        setPadding(i10, i10, i10, i10);
        setContentDescription(A03(0, 7, 59));
        A05();
        setOnClickListener(new P7(this));
    }

    private void A04() {
        setImageBitmap(LN.A01(LM.SOUND_OFF));
    }

    private void A05() {
        setImageBitmap(LN.A01(LM.SOUND_ON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A07() {
        P1 p12 = this.A00;
        if (p12 != null) {
            float volume = p12.getVolume();
            String[] strArr = A06;
            if (strArr[5].charAt(12) == strArr[1].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[3] = "7LwdJMyLjSlNEKSwxkcw7Q3";
            strArr2[6] = "d5nTRpYYugpReKnwSxkEX";
            if (volume == gl.Code) {
                return true;
            }
        }
        return false;
    }

    public final void A09() {
        if (this.A00 == null) {
            return;
        }
        if (A07()) {
            A04();
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1122Ot
    public final void A8l(P1 p12) {
        this.A00 = p12;
        P1 p13 = this.A00;
        if (p13 != null) {
            p13.getEventBus().A05(this.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1122Ot
    public final void AF5(P1 p12) {
        P1 p13 = this.A00;
        if (p13 != null) {
            p13.getEventBus().A06(this.A04);
        }
        this.A00 = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int y = getWidth() / 2;
        int x10 = getHeight() / 2;
        canvas.drawCircle(y, x10, Math.min(y, x10), this.A01);
        super.onDraw(canvas);
    }
}
