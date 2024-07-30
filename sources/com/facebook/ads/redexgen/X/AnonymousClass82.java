package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.82, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass82 extends AbstractC1042Lp {
    public static byte[] A01;
    public final /* synthetic */ C1092No A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-78, -65, -65, -68, -65};
    }

    public AnonymousClass82(C1092No c1092No) {
        this.A00 = c1092No;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8O
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(C1043Lq c1043Lq) {
        InterfaceC1091Nn interfaceC1091Nn;
        JSONObject A03;
        new Handler(Looper.getMainLooper()).post(new RunnableC1090Nm(this));
        interfaceC1091Nn = this.A00.A0B;
        A03 = this.A00.A03();
        interfaceC1091Nn.ACd(A00(0, 5, 60), A03);
    }
}
