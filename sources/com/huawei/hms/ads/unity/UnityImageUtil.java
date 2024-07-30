package com.huawei.hms.ads.unity;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.ads.annotation.AllApi;
import com.huawei.hms.ads.bw;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.nativead.NativeAd;
import com.huawei.openalliance.ad.beans.inner.SourceParam;
import com.huawei.openalliance.ad.inter.data.e;
import com.huawei.openalliance.ad.inter.data.h;
import gb.j;
import gb.w0;

@AllApi
/* loaded from: classes2.dex */
public class UnityImageUtil {
    private static UnityImageUtil I;
    private static final byte[] V = new byte[0];

    /* renamed from: com.huawei.hms.ads.unity.UnityImageUtil$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] Code;

        static {
            int[] iArr = new int[UnityImageType.values().length];
            Code = iArr;
            try {
                iArr[UnityImageType.ICON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Code[UnityImageType.IMAGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Code[UnityImageType.CHOICESINFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private UnityImageUtil() {
    }

    private h Code(e eVar, String str, UnityImageType unityImageType) {
        int i10 = AnonymousClass2.Code[unityImageType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            for (h hVar : eVar.Z()) {
                if (TextUtils.equals(str, hVar.f22260s)) {
                    return hVar;
                }
            }
            return null;
        }
        h I2 = eVar.I();
        if (!TextUtils.equals(str, I2.f22260s)) {
            return null;
        }
        return I2;
    }

    @AllApi
    public static UnityImageUtil getInstance() {
        UnityImageUtil unityImageUtil;
        synchronized (V) {
            if (I == null) {
                I = new UnityImageUtil();
            }
            unityImageUtil = I;
        }
        return unityImageUtil;
    }

    @AllApi
    public void unityLoadImage(final UnityImageDelegate unityImageDelegate, Context context, NativeAd nativeAd, UnityImageType unityImageType) {
        if (unityImageDelegate != null && unityImageDelegate.getUri() != null) {
            Uri uri = unityImageDelegate.getUri();
            SourceParam sourceParam = new SourceParam();
            sourceParam.i(uri.toString());
            sourceParam.b();
            sourceParam.h();
            if (nativeAd != null && (nativeAd instanceof bw)) {
                e Code = ((bw) nativeAd).Code();
                final h Code2 = Code(Code, uri.toString(), unityImageType);
                if (Code2 == null) {
                    ex.Code("UnityImageUtil", "illegal image");
                    return;
                }
                sourceParam.k(Code2.f22263v);
                sourceParam.l(Code2.f22264w);
                if (Code != null) {
                    w0.f(context, sourceParam, new j() { // from class: com.huawei.hms.ads.unity.UnityImageUtil.1
                        @Override // gb.j
                        public void Code() {
                            ex.I("UnityImageUtil", "unity load image fail");
                        }

                        @Override // gb.j
                        public void Code(String str, Drawable drawable) {
                            h hVar = Code2;
                            if (hVar == null || !TextUtils.equals(str, hVar.f22260s)) {
                                return;
                            }
                            ex.Code("UnityImageUtil", "unity load image success");
                            unityImageDelegate.setDrawable(drawable);
                        }
                    }, Code.L(), Code.n());
                }
            }
        }
    }
}
