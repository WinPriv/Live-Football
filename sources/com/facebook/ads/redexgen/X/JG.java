package com.facebook.ads.redexgen.X;

import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.Handler;
import android.view.View;
import androidx.annotation.Nullable;
import com.huawei.hms.ads.gl;

@TargetApi(12)
/* loaded from: assets/audience_network.dex */
public final class JG implements InterfaceC1122Ot {
    public static String[] A0B = {"82Zz8oCZg8zkkbzw8opl2Yz4CtrF2SDp", "9Qv", "sj5N5SmrmBRQmWue5o8rJw6ys3alFtJa", "lBA7odrZYL425", "CSSBUKaIJSWMhqfJuWGnuyX4cipoTk5I", "IDQP5gLMbSSnC18VVbdsGZXvkzghwpNg", "Yf1MSxzKxHs57zUlY7hI2xykX4pHUq1P", "T3bn0lMwtbok5v0PvXD6574OGDOrX6LS"};
    public View A00;

    @Nullable
    public P1 A01;

    @Nullable
    public P5 A02;
    public boolean A03;
    public final Handler A04;
    public final AbstractC1044Lr A05;
    public final AbstractC1011Kk A06;
    public final K6 A07;
    public final AbstractC0980Jb A08;
    public final boolean A09;
    public final boolean A0A;

    public JG(View view, P5 p52, boolean z10) {
        this(view, p52, z10, false);
    }

    public JG(View view, @Nullable P5 p52, boolean z10, boolean z11) {
        this.A06 = new AbstractC1011Kk() { // from class: com.facebook.ads.redexgen.X.6g
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C06836s c06836s) {
                JG.this.A06(1, 0);
            }
        };
        this.A07 = new K6() { // from class: com.facebook.ads.redexgen.X.6d
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(KV kv) {
                boolean z12;
                P5 p53;
                boolean z13;
                z12 = JG.this.A03;
                if (!z12) {
                    return;
                }
                p53 = JG.this.A02;
                if (p53 != P5.A03) {
                    z13 = JG.this.A09;
                    if (!z13) {
                        JG.this.A06(0, 8);
                        return;
                    }
                }
                JG.this.A02 = null;
                JG.this.A05();
            }
        };
        this.A05 = new AbstractC1044Lr() { // from class: com.facebook.ads.redexgen.X.6c
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C8O
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C6v c6v) {
                P5 p53;
                View view2;
                View view3;
                p53 = JG.this.A02;
                if (p53 == P5.A04) {
                    return;
                }
                view2 = JG.this.A00;
                view2.setAlpha(1.0f);
                view3 = JG.this.A00;
                view3.setVisibility(0);
            }
        };
        this.A08 = new C06706b(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z10;
        this.A0A = z11;
        A08(view, p52);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(gl.Code).setDuration(500L).setListener(new P4(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(int i10, int i11) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i10);
        this.A00.setVisibility(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, P5 p52) {
        this.A02 = p52;
        this.A00 = view;
        this.A00.clearAnimation();
        if (p52 == P5.A04) {
            this.A00.setAlpha(gl.Code);
            String[] strArr = A0B;
            if (strArr[5].charAt(26) == strArr[0].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[5] = "3OWa54Sl5zOXBo6RskK22JrE4LW5JWKj";
            strArr2[0] = "lt7hksMEFpJVhV2333OBcIopOVPW9bfy";
            this.A00.setVisibility(8);
            return;
        }
        this.A00.setAlpha(1.0f);
        this.A00.setVisibility(0);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1122Ot
    public final void A8l(P1 p12) {
        this.A01 = p12;
        p12.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1122Ot
    public final void AF5(P1 p12) {
        A06(1, 0);
        p12.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
