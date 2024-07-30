package com.facebook.ads.redexgen.X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class IA implements ServiceConnection {
    public static byte[] A01;
    public static String[] A02 = {"gCE7yAWhZ11POJo", "8eM0H3liKB3nGBy13JLbaheObXzockOS", "SrGYKC1xYV5SoIQD7ZF53usJTscK0ftd", "oLip1OJDGHIgZvy2QUOX9qyG369fMg", "6uZfg75M38niEnOd8qY5oGvuLo0AhuLi", "uWwQwstOxxQOEnZtY9gGQbDlT6RzLRhG", "9XdBRAedcNLeI9uVxDe6AZ6PBdWknMtH", "4BOwR4x4EiTbHLOE844U0c6wT73UImO8"};
    public final /* synthetic */ IB A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{4, Ascii.SYN, 35, 39, Ascii.SUB, Ascii.DC4, Ascii.SYN, -47, Ascii.DC4, 32, Ascii.US, Ascii.US, Ascii.SYN, Ascii.DC4, 37, Ascii.SYN, Ascii.NAK, -23, -5, 8, Ascii.FF, -1, -7, -5, -74, -6, -1, 9, -7, 5, 4, 4, -5, -7, 10, -5, -6};
    }

    static {
        A01();
    }

    public IA(IB ib2) {
        this.A00 = ib2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Bundle A00;
        C1316Wj c1316Wj;
        Messenger messenger;
        this.A00.A08(C06977l.A1q, new C06987m(A00(0, 17, 51)));
        this.A00.A01 = true;
        this.A00.A00 = new Messenger(iBinder);
        Message obtain = Message.obtain((Handler) null, 1);
        A00 = this.A00.A00();
        obtain.setData(A00);
        try {
            messenger = this.A00.A00;
            messenger.send(obtain);
        } catch (RemoteException e10) {
            this.A00.A07(C06977l.A1p, new C06987m(e10));
        }
        c1316Wj = this.A00.A03;
        c1316Wj.unbindService(this);
        String[] strArr = A02;
        if (strArr[3].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[5] = "6rYpepdvoTPI6QzkC6GFRKhQTPWG03vn";
        strArr2[2] = "LXAj3j5RTtl8LiKDcCRVk7kWTLRj4LCr";
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1316Wj c1316Wj;
        this.A00.A08(C06977l.A1r, new C06987m(A00(17, 20, 24)));
        try {
            c1316Wj = this.A00.A03;
            c1316Wj.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.A00.A00 = null;
        this.A00.A01 = false;
    }
}
