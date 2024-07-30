package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1066Mo extends WebChromeClient {
    public static byte[] A03;
    public static String[] A04 = {"YcV2lPdb1GD", "n5DgX5QSw4FQX59vcvxBmCs4C4mD4", "EksZFw55Ld98qazTViJtw6pSuONG6", "FQxvmp8vruM", "8OOSEuFQ7OrFhHkYKSo1UtYVyasxVGnA", "3ltH6wFp1GB97FT9l8RHOrWs4kHkX0iG", "Qgk2ZsNAH7VHvpqjGWkwA7olVBMIpezg", "lYuGhUBeP576iz9ihjd4qaMvDoX6gejl"};
    public final WeakReference<C1316Wj> A00;
    public final WeakReference<InterfaceC1064Mm> A01;
    public final WeakReference<C1061Mj> A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] - i12) - 79;
            if (A04[5].charAt(31) != 'G') {
                throw new RuntimeException();
            }
            A04[4] = "SJN5rebrF3WLAsOm1fkdotQMSgQRMUzH";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-108, -103, -108, 5, 40, 43, 36, -33, 2, 39, 46, 46, 50, 36, 49, -21, -8, -18, -4, -7, -13, -18, -72, -13, -8, -2, -17, -8, -2, -72, -21, -19, -2, -13, -7, -8, -72, -47, -49, -34, -23, -51, -39, -40, -34, -49, -40, -34, -53, -40, -50, -36, -39, -45, -50, -104, -45, -40, -34, -49, -40, -34, -104, -51, -53, -34, -49, -47, -39, -36, -29, -104, -71, -70, -81, -72, -85, -84, -74, -81, Ascii.FF, -6, -9, -12, Ascii.VT, -2, -6, Ascii.FF};
    }

    static {
        A01();
    }

    public C1066Mo(WeakReference<C1316Wj> weakReference, WeakReference<InterfaceC1064Mm> weakReference2, WeakReference<C1061Mj> weakReference3) {
        this.A00 = weakReference;
        this.A01 = weakReference2;
        this.A02 = weakReference3;
    }

    @SuppressLint({"CatchGeneralException"})
    private boolean A02(ValueCallback valueCallback) {
        boolean z10;
        ValueCallback valueCallback2;
        ValueCallback valueCallback3;
        C1316Wj c1316Wj = this.A00.get();
        if (c1316Wj != null && c1316Wj.A0C() != null) {
            z10 = C1206Rz.A09;
            if (z10) {
                valueCallback2 = C1206Rz.A08;
                if (valueCallback2 != null) {
                    valueCallback3 = C1206Rz.A08;
                    valueCallback3.onReceiveValue(null);
                    ValueCallback unused = C1206Rz.A08 = null;
                }
                ValueCallback unused2 = C1206Rz.A08 = valueCallback;
                try {
                    Intent intent = new Intent(A00(15, 33, 59));
                    intent.addCategory(A00(48, 32, 27));
                    intent.setType(A00(0, 3, 27));
                    c1316Wj.A0C().startActivityForResult(Intent.createChooser(intent, A00(3, 12, 112)), 1001);
                    return true;
                } catch (Exception e10) {
                    c1316Wj.A06().A8v(A00(80, 8, 70), C06977l.A2a, new C06987m(e10));
                    ValueCallback unused3 = C1206Rz.A08 = null;
                    return false;
                }
            }
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        C1061Mj c1061Mj = this.A02.get();
        if (!TextUtils.isEmpty(message) && consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.LOG && c1061Mj != null) {
            c1061Mj.A04(message);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        C1061Mj timingLogger = this.A02.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        InterfaceC1064Mm interfaceC1064Mm = this.A01.get();
        if (interfaceC1064Mm != null) {
            interfaceC1064Mm.ABt(i10);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        InterfaceC1064Mm listener = this.A01.get();
        if (listener != null) {
            listener.ABy(str);
        }
    }

    @Override // android.webkit.WebChromeClient
    @RequiresApi(api = 21)
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return A02(filePathCallback);
    }
}
