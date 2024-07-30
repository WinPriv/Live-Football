package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.anythink.expressad.exoplayer.b;
import com.anythink.expressad.video.module.a.a;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.List;

@TargetApi(19)
/* renamed from: com.facebook.ads.redexgen.X.Me, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1056Me extends LinearLayout {
    public static byte[] A0A;
    public static String[] A0B = {"knq4crm7fvqQP", "POuWJNR6FFtqsTvB6KeDXgsqVDDrfXB5", "10LYd3PkBnL3JTlwXO74lkb8laVhyfxM", "yGvyB2PsIdOlgSHN7xWAdIyeKrkcUuSJ", "30OsfDGqNeLBXhmKwxFpv8WuoKRgKdOB", "v4mwmIuaROl", "LuFvPWZsJ2RrZ", "py7QobRXpH9AZVstdVJJOkEIejHuBaN9"};
    public static final int A0C;
    public static final int A0D;
    public static final Uri A0E;
    public static final View.OnTouchListener A0F;

    @Nullable
    public ImageView A00;
    public ImageView A01;

    @Nullable
    public ImageView A02;
    public ImageView A03;
    public InterfaceC1055Md A04;
    public C1062Mk A05;
    public String A06;
    public boolean A07;
    public final WebView A08;
    public final InterfaceC1065Mn A09;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            byte b10 = (byte) ((copyOfRange[i13] ^ i12) ^ 39);
            String[] strArr = A0B;
            if (strArr[3].charAt(13) == strArr[1].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[6] = "2vQcPj1ELj1bu";
            strArr2[0] = "7aOELiI6quiDs";
            copyOfRange[i13] = b10;
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{80, 115, 113, 121, Ascii.ESC, 52, 55, 43, 61, 39, Ascii.SO, 19, Ascii.SYN, 0, 19, 5, Ascii.SO, 49, 36, 47, 97, 47, 32, 53, 40, 55, 36, 97, 35, 51, 46, 54, 50, 36, 51, 5, 6, Ascii.VT, 17, Ascii.DLE, 94, 6, 8, 5, 10, Ascii.SI, Ascii.DC2, Ascii.GS, Ascii.ETB, 1, Ascii.FS, Ascii.SUB, Ascii.ETB, 93, Ascii.SUB, Ascii.GS, 7, Ascii.SYN, Ascii.GS, 7, 93, Ascii.DC2, Ascii.DLE, 7, Ascii.SUB, Ascii.FS, Ascii.GS, 93, 37, 58, 54, 36, Ascii.ESC, Ascii.ETB, Ascii.NAK, 86, Ascii.EM, Ascii.SYN, Ascii.FS, 10, Ascii.ETB, 17, Ascii.FS, 86, Ascii.ESC, Ascii.DLE, 10, Ascii.ETB, Ascii.NAK, Ascii.GS, 80, 76, 76, 72, 2, Ascii.ETB, Ascii.ETB, 79, 79, 79, Ascii.SYN, 94, 89, 91, 93, 90, 87, 87, 83, Ascii.SYN, 91, 87, 85};
    }

    static {
        A07();
        A0C = Color.rgb(224, 224, 224);
        A0E = KM.A00(A05(90, 23, 31));
        A0F = new MY();
        A0D = Color.argb(34, 0, 0, 0);
    }

    public C1056Me(C1316Wj c1316Wj, WebView webView) {
        super(c1316Wj);
        this.A09 = new S0(this);
        this.A08 = webView;
        this.A07 = IE.A06(c1316Wj);
        A08(c1316Wj);
    }

    private void A08(C1316Wj c1316Wj) {
        float density = 50.0f * getResources().getDisplayMetrics().density;
        int i10 = (int) density;
        LE.A0M(this, -1);
        setGravity(16);
        this.A01 = new ImageView(c1316Wj);
        this.A01.setContentDescription(A05(4, 5, a.R));
        ViewGroup.LayoutParams closeButtonParams = new LinearLayout.LayoutParams(i10, i10);
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setImageBitmap(LN.A01(LM.BROWSER_CLOSE));
        this.A01.setOnTouchListener(A0F);
        this.A01.setOnClickListener(new MZ(this));
        addView(this.A01, closeButtonParams);
        if (this.A07) {
            this.A00 = new ImageView(c1316Wj);
            this.A00.setEnabled(false);
            this.A00.setAlpha(0.3f);
            this.A00.setContentDescription(A05(0, 4, 53));
            ViewGroup.LayoutParams closeButtonParams2 = new LinearLayout.LayoutParams(i10, i10);
            this.A00.setScaleType(ImageView.ScaleType.CENTER);
            this.A00.setImageBitmap(LN.A01(LM.BACK_ARROW));
            this.A00.setOnTouchListener(A0F);
            this.A00.setOnClickListener(new ViewOnClickListenerC1052Ma(this));
            addView(this.A00, closeButtonParams2);
        }
        this.A05 = new C1062Mk(c1316Wj);
        LinearLayout.LayoutParams closeButtonParams3 = new LinearLayout.LayoutParams(0, -2);
        float density2 = this.A07 ? 0.5f : 1.0f;
        closeButtonParams3.weight = density2;
        this.A05.setGravity(17);
        addView(this.A05, closeButtonParams3);
        if (this.A07) {
            this.A02 = new ImageView(c1316Wj);
            this.A02.setEnabled(false);
            this.A02.setAlpha(0.3f);
            this.A02.setContentDescription(A05(9, 7, 70));
            ViewGroup.LayoutParams closeButtonParams4 = new LinearLayout.LayoutParams(i10, i10);
            this.A02.setScaleType(ImageView.ScaleType.CENTER);
            this.A02.setImageBitmap(LN.A02(LM.BACK_ARROW));
            this.A02.setOnTouchListener(A0F);
            this.A02.setOnClickListener(new ViewOnClickListenerC1053Mb(this));
            addView(this.A02, closeButtonParams4);
        }
        this.A03 = new ImageView(c1316Wj);
        ViewGroup.LayoutParams nativeButtonParams = new LinearLayout.LayoutParams(i10, i10);
        this.A03.setContentDescription(A05(16, 19, 102));
        this.A03.setScaleType(ImageView.ScaleType.CENTER);
        this.A03.setOnTouchListener(A0F);
        this.A03.setOnClickListener(new ViewOnClickListenerC1054Mc(this, c1316Wj));
        addView(this.A03, nativeButtonParams);
        setupDefaultNativeBrowser(c1316Wj);
    }

    public InterfaceC1065Mn getBrowserNavigationListener() {
        return this.A09;
    }

    public void setListener(InterfaceC1055Md interfaceC1055Md) {
        this.A04 = interfaceC1055Md;
    }

    public void setTitle(String str) {
        this.A05.setTitle(str);
    }

    public void setUrl(String str) {
        this.A06 = str;
        if (TextUtils.isEmpty(str) || A05(35, 11, 67).equals(str)) {
            this.A05.setSubtitle(null);
            this.A03.setEnabled(false);
            this.A03.setColorFilter(new PorterDuffColorFilter(A0C, PorterDuff.Mode.SRC_IN));
        } else {
            this.A05.setSubtitle(str);
            this.A03.setEnabled(true);
            this.A03.setColorFilter((ColorFilter) null);
        }
    }

    private void setupDefaultNativeBrowser(C1316Wj c1316Wj) {
        Bitmap A01;
        List<ResolveInfo> queryIntentActivities = c1316Wj.getPackageManager().queryIntentActivities(new Intent(A05(46, 26, 84), A0E), b.aX);
        if (queryIntentActivities.size() == 0) {
            this.A03.setVisibility(8);
            A01 = null;
        } else {
            if (queryIntentActivities.size() == 1) {
                if (A05(72, 18, 95).equals(queryIntentActivities.get(0).activityInfo.packageName)) {
                    LM lm = LM.BROWSER_LAUNCH_CHROME;
                    if (A0B[5].length() == 31) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0B;
                    strArr[6] = "ER9o4D5KfsgKq";
                    strArr[0] = "PVCMoHz4n3Ffn";
                    A01 = LN.A01(lm);
                }
            }
            A01 = LN.A01(LM.BROWSER_LAUNCH_NATIVE);
        }
        this.A03.setImageBitmap(A01);
    }
}
