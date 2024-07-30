package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.anythink.expressad.video.module.a.a;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.8K, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8K {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"Qr1EFu0kx1tI01867m6ODqfSZ9SwtWDI", "3TYgkAWbIjP9kMvunjr7VwfmqgOZ7ZQ4", "kyx9q1x7DLL5BxK3faNs604Sw4dxbCMr", "cJW9lkVABx2P1Kp63XktrUnlRFV2zQAL", "nhxLXaLaMxGTsXNVJcvnwyCHZZV2RS3H", "y9xLyKazRl3zNBUnfIZmAOMjGK0AXhl4", "DTEqb4TbXnNBCaxA5atVnYK0pSb9DMUi", "fZvghiN"};
    public static final AtomicBoolean A03;
    public static final AtomicReference<String> A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A01 = new byte[]{76, 55, 42, 46, 45, 34, 67, 45, Ascii.EM, 8, 5, 9, 2, Ascii.SI, 9, 34, 9, Ascii.CAN, Ascii.ESC, 3, Ascii.RS, 7, 42, 3, Ascii.RS, 45, 2, 8, Ascii.RS, 3, 5, 8, 87, 42, 46, 63, 34, 67, 71, 87, 42, 46, 45, 58, 67, 81, 44, 40, 40, 60, 69, 101, Ascii.CAN, Ascii.FS, Ascii.DC2, Ascii.GS, 113, Ascii.RS, 99, 103, 118, 115, 10, 32, 36, 39, 36, 73, Ascii.DLE, Ascii.DC4, 0, 5, 121, 94, 71, 81, 64, 91, 66, 66, Ascii.DC4, 47, 42, 47, 46, 54, 47, 1, Ascii.CAN, Ascii.DC4, Ascii.SYN, 85, Ascii.GS, Ascii.SUB, Ascii.CAN, Ascii.RS, Ascii.EM, Ascii.DC4, Ascii.DC4, Ascii.DLE, 85, Ascii.SUB, Ascii.US, 8, 85, Ascii.DC2, Ascii.NAK, Ascii.SI, Ascii.RS, 9, Ascii.NAK, Ascii.SUB, Ascii.ETB, 85, Ascii.SO, Ascii.SUB, 53, 55, 60, 55, 32, 59, 49, 49, 45, 45, 41, 119, 56, 62, 60, 55, 45, 38, 32, 54, 33, Ascii.FF, 50, 52, 54, 61, 39, 60, 58, 44, 59, Ascii.SYN, 40, 46, 44, 39, 61, Ascii.SYN, 37, 40, 58, 61, Ascii.SYN, 59, 44, 47, 59, 44, 58, 33, 48, 34, 37, Ascii.CAN, 49, 46, 34, 48};
    }

    static {
        A08();
        A00 = A00(80, 7, 82);
        A03 = new AtomicBoolean();
        A04 = new AtomicReference<>();
    }

    @TargetApi(17)
    @VisibleForTesting
    public static String A01(C7G c7g) {
        return WebSettings.getDefaultUserAgent(c7g);
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static String A02(final C7G c7g) {
        FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.facebook.ads.redexgen.X.8J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final String call() {
                AtomicReference atomicReference;
                AtomicReference atomicReference2;
                atomicReference = C8K.A04;
                String browserUserAgent = (String) atomicReference.get();
                if (browserUserAgent != null) {
                    return browserUserAgent;
                }
                WebView webView = new WebView(C7G.this.getApplicationContext());
                webView.setWebViewClient(new WebViewClient() { // from class: com.facebook.ads.redexgen.X.8I
                    @Override // android.webkit.WebViewClient
                    @RequiresApi(api = 26)
                    public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                        AbstractC1070Ms.A02(C06977l.A2g);
                        return true;
                    }
                });
                String userAgentString = webView.getSettings().getUserAgentString();
                webView.destroy();
                if (userAgentString != null) {
                    atomicReference2 = C8K.A04;
                    atomicReference2.set(userAgentString);
                }
                return userAgentString;
            }
        });
        for (int i10 = 0; i10 < 3; i10++) {
            L8.A00(futureTask);
            try {
                return (String) futureTask.get();
            } catch (Throwable th) {
                A09(c7g, th);
                SystemClock.sleep(500L);
            }
        }
        return null;
    }

    public static String A03(C7G c7g, C07077v c07077v) {
        String A07 = c07077v.A07();
        if (TextUtils.isEmpty(A07)) {
            boolean andSet = A03.getAndSet(true);
            String[] strArr = A02;
            if (strArr[4].charAt(26) != strArr[3].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "SlGltdwaGCQXXY2U2bjZ1NfeES9SOW6r";
            strArr2[0] = "AnJMWH4pc3dV3Xqon1tLsffrk7nZCcYt";
            if (!andSet) {
                InterfaceC06967k A06 = c7g.A06();
                int i10 = C06977l.A1Z;
                String bundle = A00(73, 7, 29);
                C06987m c06987m = new C06987m(bundle);
                String bundle2 = A00(116, 7, 65);
                A06.A8u(bundle2, i10, c06987m);
            }
        }
        return A07;
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static String A04(C7G c7g, boolean z10) {
        if (c7g == null) {
            return A00;
        }
        if (z10) {
            return System.getProperty(A00(123, 10, 74));
        }
        String str = A04.get();
        if (str != null) {
            return str;
        }
        long spUserAgentRefresh = IC.A01(c7g);
        String A002 = A00(143, 23, 90);
        String A003 = A00(133, 10, 64);
        String A004 = A00(88, 28, 104);
        if (spUserAgentRefresh > 0) {
            String browserUserAgent = ProcessUtils.getProcessSpecificName(A004, c7g);
            SharedPreferences sharedPreferences = c7g.getSharedPreferences(browserUserAgent, 0);
            String string = sharedPreferences.getString(A003, null);
            long j10 = sharedPreferences.getLong(A002, 0L);
            if (!TextUtils.isEmpty(string) && System.currentTimeMillis() - j10 < spUserAgentRefresh) {
                A04.set(string);
                return string;
            }
        }
        String str2 = null;
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                str2 = A01(c7g);
                A04.set(str2);
            } catch (Throwable th) {
                A09(c7g, th);
            }
        }
        if (str2 == null) {
            str2 = A02(c7g);
        }
        if (str2 == null) {
            return A00;
        }
        String[] strArr = A02;
        String str3 = strArr[4];
        String browserUserAgent2 = strArr[3];
        if (str3.charAt(26) != browserUserAgent2.charAt(26)) {
            throw new RuntimeException();
        }
        A02[7] = "Kvz6zSF";
        if (spUserAgentRefresh > 0) {
            SharedPreferences sharedPreferences2 = c7g.getSharedPreferences(ProcessUtils.getProcessSpecificName(A004, c7g), 0);
            sharedPreferences2.edit().putString(A003, A04.get()).apply();
            sharedPreferences2.edit().putLong(A002, System.currentTimeMillis()).apply();
        }
        return str2;
    }

    public static String A05(C07077v c07077v, C7G c7g) {
        if (IC.A04(c7g)) {
            return A00(63, 5, 117) + A03(c7g, c07077v) + A00(39, 6, a.R) + c07077v.A06() + A00(45, 6, 121) + c07077v.A04() + A00(38, 1, 111);
        }
        return A00(0, 0, 40);
    }

    public static String A06(C07077v c07077v, C7G c7g, boolean z10) {
        return A04(c7g, z10) + A00(0, 38, a.R) + c7g.A03().A7k() + A00(57, 6, 54) + C07077v.A03 + A00(38, 1, 111) + A05(c07077v, c7g) + A00(68, 5, 69) + c7g.A03().A7l() + A00(51, 6, 77) + Locale.getDefault().toString() + A00(87, 1, 79);
    }

    public static void A09(C7G c7g, Throwable th) {
        c7g.A06().A8u(A00(166, 8, 84), C06977l.A2f, new C06987m(th));
    }
}
