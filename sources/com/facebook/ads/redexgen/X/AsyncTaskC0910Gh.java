package com.facebook.ads.redexgen.X;

import android.os.AsyncTask;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Gh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class AsyncTaskC0910Gh extends AsyncTask<Q0, Void, InterfaceC1142Pn> implements InterfaceC1152Px {
    public static byte[] A04;
    public InterfaceC1144Pp A00;
    public GT A01;
    public Exception A02;
    public Executor A03;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final InterfaceC1142Pn A00(Q0... q0Arr) {
        if (C0990Jm.A02(this)) {
            return null;
        }
        try {
            if (q0Arr != null) {
                try {
                    if (q0Arr.length > 0) {
                        InterfaceC1142Pn A0J = this.A01.A0J(q0Arr[0]);
                        if (this.A01.A0K().A04() && A0J != null) {
                            String.format(Locale.US, A01(108, 21, 6), Integer.valueOf(A0J.A7Y()), A0J.getUrl(), A0J.A5n());
                        }
                        if (A0J != null) {
                            return A0J;
                        }
                        throw new IllegalStateException(A01(87, 21, 119));
                    }
                } catch (Exception e10) {
                    this.A02 = e10;
                    if (this.A01.A0K().A04()) {
                        String.format(Locale.US, A01(64, 23, 98), e10.getMessage());
                    }
                    cancel(true);
                    return null;
                }
            }
            throw new IllegalArgumentException(A01(0, 64, 69));
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
            return null;
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 101);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-18, Ascii.EM, -14, Ascii.RS, Ascii.RS, Ascii.SUB, -4, Ascii.SI, Ascii.ESC, Ascii.US, Ascii.SI, Ascii.GS, Ascii.RS, -2, Ascii.VT, Ascii.GS, Ascii.NAK, -54, Ascii.RS, Ascii.VT, Ascii.NAK, Ascii.SI, Ascii.GS, -54, Ascii.SI, 34, Ascii.VT, Ascii.CR, Ascii.RS, Ascii.SYN, 35, -54, Ascii.EM, Ascii.CAN, Ascii.SI, -54, Ascii.VT, Ascii.FS, 17, Ascii.US, Ascii.ETB, Ascii.SI, Ascii.CAN, Ascii.RS, -54, Ascii.EM, Ascii.DLE, -54, Ascii.RS, 35, Ascii.SUB, Ascii.SI, -54, -14, Ascii.RS, Ascii.RS, Ascii.SUB, -4, Ascii.SI, Ascii.ESC, Ascii.US, Ascii.SI, Ascii.GS, Ascii.RS, Ascii.SI, Ascii.ESC, Ascii.ESC, Ascii.ETB, -25, 57, 44, 56, 60, 44, 58, 59, -25, 45, 40, 48, 51, 44, 43, 1, -25, -20, 58, 36, 80, 80, 76, -4, 78, 65, 79, 76, 75, 74, 79, 65, -4, 69, 79, -4, 74, 81, 72, 72, -67, -48, -34, -37, -38, -39, -34, -48, -91, -117, -112, -49, -117, -109, -112, -34, -108, -91, 117, -112, -34};
    }

    public AsyncTaskC0910Gh(GT gt, InterfaceC1144Pp interfaceC1144Pp, Executor executor) {
        this.A01 = gt;
        this.A00 = interfaceC1144Pp;
        this.A03 = executor;
    }

    private final void A03(InterfaceC1142Pn result) {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            this.A00.AAG(result);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1152Px
    public final void A5G(Q0 q02) {
        super.executeOnExecutor(this.A03, q02);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ InterfaceC1142Pn doInBackground(Q0[] q0Arr) {
        if (C0990Jm.A02(this)) {
            return null;
        }
        try {
            return A00(q0Arr);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.A00.AAd(this.A02);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(InterfaceC1142Pn interfaceC1142Pn) {
        if (C0990Jm.A02(this)) {
            return;
        }
        try {
            A03(interfaceC1142Pn);
        } catch (Throwable th) {
            C0990Jm.A00(th, this);
        }
    }
}
