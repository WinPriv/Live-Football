package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.anythink.expressad.video.module.a.a;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;
import com.facebook.ads.RewardedInterstitialAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdCompanionViewApi;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import com.facebook.ads.internal.api.AdSettingsApi;
import com.facebook.ads.internal.api.AdSizeApi;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.api.AudienceNetworkAdsApi;
import com.facebook.ads.internal.api.BidderTokenProviderApi;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.InitApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.api.NativeAdLayoutApi;
import com.facebook.ads.internal.api.NativeAdScrollViewApi;
import com.facebook.ads.internal.api.NativeAdViewApi;
import com.facebook.ads.internal.api.NativeAdViewAttributesApi;
import com.facebook.ads.internal.api.NativeAdViewTypeApi;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import com.facebook.ads.internal.api.NativeBannerAdApi;
import com.facebook.ads.internal.api.NativeBannerAdViewApi;
import com.facebook.ads.internal.api.NativeComponentTagApi;
import com.facebook.ads.internal.api.RewardedInterstitialAdApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.redexgen.X.AnonymousClass51;
import com.facebook.ads.redexgen.X.AnonymousClass54;
import com.facebook.ads.redexgen.X.AnonymousClass59;
import com.facebook.ads.redexgen.X.AnonymousClass89;
import com.facebook.ads.redexgen.X.C06455b;
import com.facebook.ads.redexgen.X.C0970Ir;
import com.facebook.ads.redexgen.X.C0971Is;
import com.facebook.ads.redexgen.X.C0972It;
import com.facebook.ads.redexgen.X.C1228Sw;
import com.facebook.ads.redexgen.X.C5F;
import com.facebook.ads.redexgen.X.C5G;
import com.facebook.ads.redexgen.X.C5I;
import com.facebook.ads.redexgen.X.C5L;
import com.facebook.ads.redexgen.X.C5M;
import com.facebook.ads.redexgen.X.C5N;
import com.facebook.ads.redexgen.X.C5Q;
import com.facebook.ads.redexgen.X.C5X;
import com.facebook.ads.redexgen.X.J4;
import com.facebook.ads.redexgen.X.J6;
import com.facebook.ads.redexgen.X.KR;
import com.facebook.ads.redexgen.X.T8;
import com.facebook.ads.redexgen.X.XB;
import com.facebook.ads.redexgen.X.XC;
import com.facebook.ads.redexgen.X.XS;
import com.facebook.ads.redexgen.X.XT;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class DynamicLoaderImpl implements DynamicLoader {
    public static AdSettingsApi A00;
    public static AudienceNetworkAdsApi A01;
    public static NativeAdViewApi A02;
    public static NativeBannerAdViewApi A03;
    public static C5F A04;
    public static String[] A05 = {"", "hl0DpOFqxM1jfK98LJTADvCdgffrETQN", "QW5nZBv4w8ebawOaJAju5UC6DpXIEYNP", "lDXIr49IIqC5d9soZ9ZlhOdK7Sq4PNcS", "1TLrXBQAGAxZIydv1bacR9cCDSxOiDhT", "HKpyy44hPf1TiYKwXHdFJYATCyhvdc4i", "5Vop4gtsdytJgHep4xjnsMChzM034SFi", "0HGMkPnlBdCz3NKZQL2lJn"};
    public static final InitApi A06 = new InitApi() { // from class: com.facebook.ads.redexgen.X.5H
        @Override // com.facebook.ads.internal.api.InitApi
        public final void initialize(Context context, @Nullable MultithreadedBundleWrapper multithreadedBundleWrapper, @Nullable AudienceNetworkAds.InitListener initListener, int i10) {
            AnonymousClass89.A0G(C5G.A07(context), multithreadedBundleWrapper, initListener, i10);
        }

        @Override // com.facebook.ads.internal.api.InitApi
        public final boolean isInitialized() {
            return AnonymousClass89.A0H();
        }

        @Override // com.facebook.ads.internal.api.InitApi
        public final void onAdLoadInvoked(Context context) {
            AnonymousClass89.A08(C5G.A07(context));
        }

        @Override // com.facebook.ads.internal.api.InitApi
        public final void onContentProviderCreated(Context context) {
            AnonymousClass89.A09(C5G.A07(context));
        }
    };

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdCompanionViewApi createAdCompanionViewApi() {
        return new XT();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdOptionsViewApi createAdOptionsView(Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout, AdOptionsView.Orientation orientation, int i10, AdOptionsView adOptionsView) {
        return new XS(context, nativeAdBase, nativeAdLayout, orientation, i10, adOptionsView);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdOptionsViewApi createAdOptionsView(Context context, NativeAdBase nativeAdBase, @Nullable NativeAdLayout nativeAdLayout, AdOptionsView adOptionsView) {
        return new XS(context, nativeAdBase, nativeAdLayout, adOptionsView);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdSettingsApi createAdSettingsApi() {
        if (A00 == null) {
            A00 = new AdSettingsApi() { // from class: com.facebook.ads.redexgen.X.53
                public static byte[] A00;
                public static String[] A01 = {"TFkOB7WAPr6F4oSDAD2lBM3orjMmpCql", "qm70b4Ur0FRBuwfAT3tN36vqG0Nf4UFd", "zPpQ1cnfbXvczPvVr", "8IvLkkrNdMNEKNCoxjkf6IUs19Br2Jri", "GW45NL8mXfcvSmeq7", "yk6fztNbTNbTdYOeWP4a4qU6KiJuVBGT", "Yi7aT5eKgI7tScmdPed7vydq7f2NoqCT", "ldtlhzHQs0POAzCz5K2SoOIZIeNjlq2l"};
                public static final String A02;
                public static final Collection<String> A03;
                public static volatile boolean A04;

                public static String A00(int i10, int i11, int i12) {
                    byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
                    for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                        copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 48);
                    }
                    return new String(copyOfRange);
                }

                public static void A01() {
                    A00 = new byte[]{124, 119, 101, 8, Ascii.SI, 9, 4, Ascii.US, Ascii.RS, Ascii.CR, Ascii.DC2, Ascii.CAN, Ascii.RS, 4, Ascii.DC2, Ascii.US, 4, 19, Ascii.SUB, 8, 19, 4, Ascii.DLE, Ascii.RS, 2, 107, 90, 76, 75, Ascii.US, 82, 80, 91, 90, Ascii.US, 91, 90, 73, 86, 92, 90, Ascii.US, 87, 94, 76, 87, 5, Ascii.US, 45, Ascii.DC2, Ascii.US, Ascii.DC4, 90, Ascii.SO, Ascii.US, 9, Ascii.SO, 19, Ascii.DC4, Ascii.GS, 90, 3, Ascii.NAK, Ascii.SI, 8, 90, Ascii.ESC, 10, 10, 90, Ascii.CR, 19, Ascii.SO, Ascii.DC2, 90, 60, Ascii.ESC, Ascii.EM, Ascii.US, Ascii.CAN, Ascii.NAK, Ascii.NAK, 17, 93, 9, 90, Ascii.ESC, Ascii.RS, 90, Ascii.SI, Ascii.DC4, 19, Ascii.SO, 9, 90, 3, Ascii.NAK, Ascii.SI, 90, Ascii.ETB, Ascii.SI, 9, Ascii.SO, 90, 9, 10, Ascii.US, Ascii.EM, 19, Ascii.FS, 3, 90, Ascii.SO, Ascii.DC2, Ascii.US, 90, Ascii.RS, Ascii.US, Ascii.FF, 19, Ascii.EM, Ascii.US, 90, Ascii.DC2, Ascii.ESC, 9, Ascii.DC2, Ascii.US, Ascii.RS, 90, 51, 62, 90, Ascii.SO, Ascii.NAK, 90, Ascii.US, Ascii.DC4, 9, Ascii.SI, 8, Ascii.US, 90, Ascii.SO, Ascii.DC2, Ascii.US, 90, Ascii.RS, Ascii.US, Ascii.SYN, 19, Ascii.FF, Ascii.US, 8, 3, 90, Ascii.NAK, Ascii.FS, 90, Ascii.SO, Ascii.US, 9, Ascii.SO, 90, Ascii.ESC, Ascii.RS, 9, 86, 90, Ascii.ESC, Ascii.RS, Ascii.RS, 90, Ascii.SO, Ascii.DC2, Ascii.US, 90, Ascii.FS, Ascii.NAK, Ascii.SYN, Ascii.SYN, Ascii.NAK, Ascii.CR, 19, Ascii.DC4, Ascii.GS, 90, Ascii.EM, Ascii.NAK, Ascii.RS, Ascii.US, 90, Ascii.CAN, Ascii.US, Ascii.FS, Ascii.NAK, 8, Ascii.US, 90, Ascii.SYN, Ascii.NAK, Ascii.ESC, Ascii.RS, 19, Ascii.DC4, Ascii.GS, 90, Ascii.ESC, Ascii.DC4, 90, Ascii.ESC, Ascii.RS, 64, 90, 59, Ascii.RS, 41, Ascii.US, Ascii.SO, Ascii.SO, 19, Ascii.DC4, Ascii.GS, 9, 84, Ascii.ESC, Ascii.RS, Ascii.RS, 46, Ascii.US, 9, Ascii.SO, 62, Ascii.US, Ascii.FF, 19, Ascii.EM, Ascii.US, 82, 88, Ascii.SUB, Ascii.ESC, 8, Ascii.ETB, Ascii.GS, Ascii.ESC, 55, Ascii.SUB, 54, Ascii.US, Ascii.CR, Ascii.SYN, 60, 52, 52, 60, 55, 62, 4, 40, 63, 48, 114, 101, 106, 102, 114, Ascii.DEL, 104, 40, 38, 96, 41, 61, 48, 39, 103, 105, 43, 47};
                }

                static {
                    A01();
                    A02 = AdInternalSettings.class.getSimpleName();
                    A03 = new HashSet();
                    A03.add(A00(262, 3, 49));
                    A03.add(A00(252, 10, 107));
                    A03.add(A00(265, 7, 32));
                    A03.add(A00(272, 8, 111));
                    A04 = false;
                }

                public static void A02(String str) {
                    if (A04) {
                        return;
                    }
                    A04 = true;
                    Log.i(A02, A00(25, 23, 15) + str);
                    Log.i(A02, A00(48, 192, 74) + str + A00(0, 3, 110));
                }

                @Override // com.facebook.ads.internal.api.AdSettingsApi
                public final boolean isTestMode(Context context) {
                    if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isExplicitTestMode() || A03.contains(Build.PRODUCT)) {
                        return true;
                    }
                    MultithreadedBundleWrapper multithreadedBundleWrapper = AdInternalSettings.sSettingsBundle;
                    String A002 = A00(3, 22, 107);
                    String string = multithreadedBundleWrapper.getString(A002, null);
                    if (string == null) {
                        SharedPreferences A003 = C0983Jf.A00(context);
                        String A004 = A00(240, 12, 78);
                        string = A003.getString(A004, null);
                        if (TextUtils.isEmpty(string)) {
                            UUID randomUUID = UUID.randomUUID();
                            if (A01[6].charAt(4) == 'r') {
                                throw new RuntimeException();
                            }
                            String[] strArr = A01;
                            strArr[4] = "ACuTT9OHS44wxpENU";
                            strArr[2] = "rDA9ItLQjR7JTNF9w";
                            string = randomUUID.toString();
                            A003.edit().putString(A004, string).apply();
                        }
                        AdInternalSettings.sSettingsBundle.putString(A002, string);
                    }
                    if (AdInternalSettings.getTestDevicesList().contains(string)) {
                        return true;
                    }
                    A02(string);
                    return false;
                }

                @Override // com.facebook.ads.internal.api.AdSettingsApi
                public final void turnOnDebugger() {
                    JH.A02();
                }
            };
        }
        AdSettingsApi adSettingsApi = A00;
        String[] strArr = A05;
        if (strArr[5].charAt(22) == strArr[3].charAt(22)) {
            throw new RuntimeException();
        }
        A05[7] = "zPBUQH";
        return adSettingsApi;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdSizeApi createAdSizeApi(int i10) {
        final J6 A022 = KR.A02(i10);
        return new AdSizeApi() { // from class: com.facebook.ads.redexgen.X.86
            @Override // com.facebook.ads.internal.api.AdSizeApi
            public final int getHeight() {
                return A022.A02();
            }

            @Override // com.facebook.ads.internal.api.AdSizeApi
            public final int getWidth() {
                return A022.A03();
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdViewApi createAdViewApi(Context context, String str, AdSize adSize, AdViewParentApi adViewParentApi, AdView adView) {
        return (AdViewApi) AnonymousClass51.A00(new AnonymousClass54(context, str, adSize, adViewParentApi, adView), AdViewApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdViewApi createAdViewApi(Context context, String str, String str2, AdViewParentApi adViewParentApi, AdView adView) throws Exception {
        try {
            return (AdViewApi) AnonymousClass51.A00(new AnonymousClass54(context, str, str2, adViewParentApi, adView), AdViewApi.class);
        } catch (J4 e10) {
            throw new Exception(e10.A01());
        }
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AudienceNetworkActivityApi createAudienceNetworkActivity(final AudienceNetworkActivity audienceNetworkActivity, final AudienceNetworkActivityApi audienceNetworkActivityApi) {
        final AnonymousClass59 anonymousClass59 = new AnonymousClass59(audienceNetworkActivity, audienceNetworkActivityApi);
        return new AudienceNetworkActivityApi(audienceNetworkActivity, audienceNetworkActivityApi, anonymousClass59) { // from class: com.facebook.ads.redexgen.X.5A
            public static byte[] A03;
            public static String[] A04 = {"kVVxbIvKBpFLpNMn249evg7U1t5DMrkR", "HNBIISUKPJt5lzvo", "tha", "s0U2IqORDUirQkjYFZUhzDbmHPDS66DK", "4XQ6Ra6x1CsG5mP0jlsGo4Oc8x5GsOh7", "mYQ1yQiLRLlGaSwEYEmmcgt3b9ncmm6M", "URRMMekVjcz4ECsO2XmiMnA4WEVCe5QQ", "lW2qNIOuJVr9bvm7hZsN45J1F7Bnv3JY"};
            public boolean A00;
            public final AudienceNetworkActivityApi A01;
            public final AnonymousClass59 A02;

            public static String A00(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
                for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                    copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 71);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A03 = new byte[]{Ascii.FF, 8, 7, 59, 42, 47, 43, 52, 41, 43, Ascii.DC4, 43, 58, 61, 53, 56, 49, 19, 44, 35, 54, 46, 35, 33, 50, 35, 34, -34, 35, 54, 33, 35, 46, 50, 39, 45, 44, -20, -70, -57, -72, -70, -68, -51, -62, -49, -62, -51, -46};
            }

            static {
                A01();
            }

            {
                this.A01 = audienceNetworkActivityApi;
                this.A02 = anonymousClass59;
            }

            private void A02(Throwable th) {
                this.A00 = true;
                this.A02.A0J();
                finish(8);
                C7G logContext = this.A02.A0I();
                if (logContext != null) {
                    logContext.A06().A8u(A00(38, 11, 18), C06977l.A0C, new C06987m(th));
                    return;
                }
                String A002 = A00(0, 17, a.R);
                if (A04[3].charAt(1) != '0') {
                    throw new RuntimeException();
                }
                A04[6] = "roakWe6n8CepWvGQKms2st32sM0MtJhe";
                Log.e(A002, A00(17, 21, 119), th);
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
                try {
                    if (this.A00) {
                        this.A01.dump(str, fileDescriptor, printWriter, strArr);
                    } else {
                        this.A02.dump(str, fileDescriptor, printWriter, strArr);
                    }
                } catch (Throwable t10) {
                    A02(t10);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void finish(int i10) {
                this.A02.finish(i10);
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onActivityResult(int i10, int i11, Intent intent) {
                try {
                } catch (Throwable t10) {
                    A02(t10);
                }
                if (this.A00) {
                    this.A01.onActivityResult(i10, i11, intent);
                } else {
                    this.A02.onActivityResult(i10, i11, intent);
                    this.A01.onActivityResult(i10, i11, intent);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onBackPressed() {
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onBackPressed();
                } catch (Throwable th) {
                    String[] strArr = A04;
                    if (strArr[4].charAt(24) == strArr[5].charAt(24)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[7] = "o2QAVIvbVP3X0FiUaWNt1f6t7dHcTRBl";
                    strArr2[0] = "vmYtMIbIQwew4451MpW2UPrO9wIbxS87";
                    A02(th);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onConfigurationChanged(Configuration configuration) {
                try {
                } catch (Throwable t10) {
                    A02(t10);
                }
                if (this.A00) {
                    this.A01.onConfigurationChanged(configuration);
                } else {
                    this.A02.onConfigurationChanged(configuration);
                    this.A01.onConfigurationChanged(configuration);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onCreate(Bundle bundle) {
                this.A01.onCreate(bundle);
                try {
                    this.A02.onCreate(bundle);
                } catch (Throwable t10) {
                    A02(t10);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onDestroy() {
                try {
                } catch (Throwable t10) {
                    A02(t10);
                }
                if (this.A00) {
                    this.A01.onDestroy();
                } else {
                    this.A02.onDestroy();
                    this.A01.onDestroy();
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onPause() {
                try {
                } catch (Throwable t10) {
                    A02(t10);
                }
                if (this.A00) {
                    this.A01.onPause();
                } else {
                    this.A02.onPause();
                    this.A01.onPause();
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onResume() {
                this.A01.onResume();
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onResume();
                } catch (Throwable t10) {
                    A02(t10);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onSaveInstanceState(Bundle bundle) {
                this.A01.onSaveInstanceState(bundle);
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onSaveInstanceState(bundle);
                } catch (Throwable th) {
                    String[] strArr = A04;
                    if (strArr[4].charAt(24) == strArr[5].charAt(24)) {
                        throw new RuntimeException();
                    }
                    A04[6] = "46sQaeWUXFUhhsRkoBzMlxezgaVtku4l";
                    A02(th);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onStart() {
                this.A01.onStart();
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onStart();
                } catch (Throwable t10) {
                    A02(t10);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final void onStop() {
                this.A01.onStop();
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onStop();
                } catch (Throwable t10) {
                    A02(t10);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            @SuppressLint({"CatchGeneralException"})
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                try {
                } catch (Throwable t10) {
                    A02(t10);
                }
                if (this.A00) {
                    return this.A01.onTouchEvent(motionEvent);
                }
                this.A02.onTouchEvent(motionEvent);
                return this.A01.onTouchEvent(motionEvent);
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AudienceNetworkAdsApi createAudienceNetworkAdsApi() {
        if (A01 == null) {
            A01 = new AudienceNetworkAdsApi() { // from class: com.facebook.ads.redexgen.X.5C
                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final int getAdFormatForPlacement(String str) {
                    return C0990Jm.A02(this) ? 0 : 0;
                }

                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final void initialize(Context context, @Nullable MultithreadedBundleWrapper initSettings, @Nullable AudienceNetworkAds.InitListener initListener) {
                    if (C0990Jm.A02(this)) {
                        return;
                    }
                    if (initListener == null) {
                        try {
                            initListener = new AudienceNetworkAds.InitListener() { // from class: com.facebook.ads.redexgen.X.5B
                                @Override // com.facebook.ads.AudienceNetworkAds.InitListener
                                public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
                                }
                            };
                        } catch (Throwable th) {
                            C0990Jm.A00(th, this);
                            return;
                        }
                    }
                    DynamicLoaderFactory.makeLoader(context).getInitApi().initialize(context, initSettings, initListener, 1);
                }

                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final boolean isInitialized() {
                    if (C0990Jm.A02(this)) {
                        return false;
                    }
                    try {
                        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
                        if (dynamicLoader == null) {
                            return false;
                        }
                        return dynamicLoader.getInitApi().isInitialized();
                    } catch (Throwable th) {
                        C0990Jm.A00(th, this);
                        return false;
                    }
                }

                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final void onContentProviderCreated(Context context) {
                    if (C0990Jm.A02(this)) {
                        return;
                    }
                    try {
                        DynamicLoaderFactory.makeLoader(context).getInitApi().onContentProviderCreated(context);
                    } catch (Throwable th) {
                        C0990Jm.A00(th, this);
                    }
                }
            };
        }
        return A01;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public BidderTokenProviderApi createBidderTokenProviderApi() {
        return getBidderTokenProviderApi();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public DefaultMediaViewVideoRendererApi createDefaultMediaViewVideoRendererApi() {
        return new T8();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public InterstitialAdApi createInterstitialAd(Context context, String str, InterstitialAd interstitialAd) {
        return (InterstitialAdApi) AnonymousClass51.A00(new C5I(context, str, interstitialAd), InterstitialAdApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public MediaViewApi createMediaViewApi() {
        return new XC();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public MediaViewVideoRendererApi createMediaViewVideoRendererApi() {
        return new C5L();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public C5M createNativeAdApi(NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        return new C5M(nativeAd, nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public C5M createNativeAdApi(NativeAdBase nativeAdBase, NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        return new C5M(nativeAdBase, nativeAd, nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdBaseApi createNativeAdBaseApi(Context context, String str) {
        return new C1228Sw(context, str, C1228Sw.A0K(), false);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdBaseApi createNativeAdBaseApi(NativeAdBaseApi nativeAdBaseApi) {
        return new C1228Sw((C1228Sw) nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdBase createNativeAdBaseFromBidPayload(Context context, String str, String str2) throws Exception {
        try {
            return C1228Sw.A0A(context, str, str2);
        } catch (J4 e10) {
            throw new Exception(e10.A01());
        }
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    @Nullable
    public NativeAdImageApi createNativeAdImageApi(JSONObject jSONObject) {
        return C0970Ir.A00(jSONObject);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdLayoutApi createNativeAdLayoutApi() {
        return new XB();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    @Nullable
    public C0971Is createNativeAdRatingApi(JSONObject jSONObject) {
        return C0971Is.A00(jSONObject);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdScrollViewApi createNativeAdScrollViewApi(NativeAdScrollView nativeAdScrollView, Context context, NativeAdsManager nativeAdsManager, @Nullable NativeAdScrollView.AdViewProvider adViewProvider, int i10, @Nullable NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i11) {
        return new C5N(nativeAdScrollView, context, nativeAdsManager, adViewProvider, i10, type, nativeAdViewAttributes, i11);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdViewApi createNativeAdViewApi() {
        if (A02 == null) {
            A02 = new NativeAdViewApi() { // from class: com.facebook.ads.redexgen.X.5O
                public static String[] A00 = {"4lhDSJeQx8ImoxNIMYyIsOpW4XJuQDgf", "lqCKp7vrLkXGNxXrvc6I3m7c", "zCZ5ygsfQGVhB3Y237HbJ1q9o76yX", "bq9vw23WcXUY1kk1BWsR1Wz1yPOY5uBm", "", "Hv6Nwq3QZSzEF0Nb8JqXMZqCHWYzLqUn", "tYYpfGiIizklMQ8", "46C5bVFnHWUcfGRcMiONp8ja9wt0MV54"};

                public static View A00(C1316Wj c1316Wj, NativeAd nativeAd, NativeAdView.Type type, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    if (nativeAdViewAttributes == null) {
                        nativeAdViewAttributes = new NativeAdViewAttributes();
                    }
                    C0972It c0972It = (C0972It) nativeAdViewAttributes.getInternalAttributes();
                    C1228Sw internalNativeAd = C1228Sw.A0L(nativeAd.getInternalNativeAd());
                    internalNativeAd.A1X(EnumC0973Iu.A00(type.getEnumCode()));
                    internalNativeAd.A1W(c0972It);
                    DZ dz = new DZ();
                    NativeAdLayout mediumRectTemplateLayout = new NativeAdLayout(c1316Wj, dz);
                    dz.A04(mediumRectTemplateLayout, c1316Wj, nativeAd, c0972It);
                    mediumRectTemplateLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (Kd.A02 * type.getHeight())));
                    return mediumRectTemplateLayout;
                }

                public static View A01(C1316Wj c1316Wj, NativeAd nativeAd, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    if (nativeAdViewAttributes == null) {
                        nativeAdViewAttributes = new NativeAdViewAttributes();
                    }
                    C1228Sw A0L = C1228Sw.A0L(nativeAd.getInternalNativeAd());
                    C0972It c0972It = (C0972It) nativeAdViewAttributes.getInternalAttributes();
                    A0L.A1X(EnumC0973Iu.A0B);
                    A0L.A1W(c0972It);
                    DZ dz = new DZ();
                    NativeAdLayout nativeAdLayout = new NativeAdLayout(c1316Wj, dz);
                    dz.A04(nativeAdLayout, c1316Wj, nativeAd, c0972It);
                    return nativeAdLayout;
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                public final View render(Context context, NativeAd nativeAd) {
                    return render(context, nativeAd, (NativeAdViewAttributes) null);
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type) {
                    return render(context, nativeAd, type, null);
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                @SuppressLint({"CatchGeneralException"})
                public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    try {
                        return A00(C5G.A02(context), nativeAd, type, nativeAdViewAttributes);
                    } catch (Throwable th) {
                        C1316Wj A022 = C5G.A02(context);
                        if (A00[1].length() == 17) {
                            Throwable t10 = new RuntimeException();
                            throw t10;
                        }
                        String[] strArr = A00;
                        strArr[0] = "2CJ6YuIajjVObDWBrmgwGQhi0qiA6kO3";
                        strArr[3] = "BzZMljeHsN6l5z4UR6G3olqVRWzg5ScF";
                        return C1039Lm.A00(A022, th);
                    }
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                @SuppressLint({"CatchGeneralException"})
                public final View render(Context context, NativeAd nativeAd, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    C1316Wj contextWrapper;
                    try {
                        if (context instanceof C1316Wj) {
                            contextWrapper = (C1316Wj) context;
                        } else {
                            contextWrapper = C5G.A02(context);
                        }
                        return A01(contextWrapper, nativeAd, nativeAdViewAttributes);
                    } catch (Throwable th) {
                        return C1039Lm.A00(C5G.A02(context), th);
                    }
                }
            };
        }
        return A02;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdViewAttributesApi createNativeAdViewAttributesApi() {
        return new C0972It();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdViewTypeApi createNativeAdViewTypeApi(final int i10) {
        return new NativeAdViewTypeApi(i10) { // from class: com.facebook.ads.redexgen.X.5P
            public final EnumC0973Iu A00;

            {
                this.A00 = EnumC0973Iu.A00(i10);
            }

            @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
            public final int getHeight() {
                return this.A00.A03();
            }

            @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
            public final int getValue() {
                return this.A00.A04();
            }

            @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
            public final int getWidth() {
                return this.A00.A05();
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdsManagerApi createNativeAdsManagerApi(Context context, String str, int i10) {
        return (NativeAdsManagerApi) AnonymousClass51.A00(new C5Q(context, str, i10), NativeAdsManagerApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeBannerAdApi createNativeBannerAdApi(NativeBannerAd nativeBannerAd, NativeAdBaseApi nativeAdBaseApi) {
        return new NativeBannerAdApi(nativeAdBaseApi) { // from class: com.facebook.ads.redexgen.X.5U
            public static byte[] A01;
            public static String[] A02 = {"GHtEJsCBxF6ZG8G1CCL5RBmKmDCxDlHG", "8TFtHG5", "ovYsObbmHQ4MgJZYSDt7UbSE4I8Jd3xL", "OStrwIklzSQSoVp6y3SnTe0L", "CizBuXx6tKQSK5P8xVf5ORSYZ1", "CxGaKpsxgS6bhWDX5B71lG4aeRzyf4w9", "ZUquOnXGk9BCY4cqa0yz5KxW6oH5Pvvn", "wvrH4lpYI8UyLhNBrrW8XGK9bs66R2Pk"};
            public final C1228Sw A00;

            public static String A00(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                    copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 40);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{43, 47, 44, Ascii.CAN, 9, 4, 8, 3, Ascii.SO, 8, 35, 8, Ascii.EM, Ascii.SUB, 2, Ascii.US, 6};
                String[] strArr = A02;
                if (strArr[3].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                A02[1] = "g9VMJ7KVDiHxjzY4mov6XPU8OVFxG";
            }

            static {
                A01();
            }

            {
                this.A00 = C1228Sw.A0L(nativeAdBaseApi);
                this.A00.A1Y(J8.A04);
            }

            private void A02(ImageView imageView, NativeAdBaseApi nativeAdBaseApi2) {
                C1228Sw A0L = C1228Sw.A0L(nativeAdBaseApi2);
                X4 x42 = new X4(this, imageView, A0L);
                C0970Ir adIcon = A0L.getAdIcon();
                if (adIcon != null) {
                    Bitmap preloadedBitmap = A0L.A10().A0M(adIcon.getUrl());
                    C1316Wj A022 = C5G.A02(imageView.getContext());
                    if (preloadedBitmap != null) {
                        Drawable A052 = C1228Sw.A05(A022, preloadedBitmap, A0L.A1d(), A0L.A1C());
                        C1228Sw.A0e(A052, imageView);
                        imageView.post(new X3(this, A0L, A052));
                        return;
                    } else {
                        X4 x43 = null;
                        C5R loadImageTask = new C5R(A022, x42, A0L.A1d(), x43);
                        loadImageTask.execute(new C5T(adIcon.getUrl(), A0L.A1C(), x43));
                        return;
                    }
                }
                InterfaceC1227Sv A15 = A0L.A15();
                AdErrorType adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
                A0L.A11().A0D().A2a(-1L, adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
                if (A15 != null) {
                    A15.AAc(J3.A00(adErrorType));
                }
                Log.e(A00(0, 17, 69), adErrorType.getDefaultErrorMessage());
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, ImageView imageView) {
                registerViewForInteraction(view, imageView, (List<View>) null);
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, ImageView imageView, @Nullable List<View> clickableViews) {
                if (imageView != null) {
                    A02(imageView, this.A00);
                }
                if (clickableViews != null) {
                    this.A00.A1M(view, imageView, clickableViews);
                } else {
                    this.A00.A1L(view, imageView);
                }
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, MediaView mediaView) {
                registerViewForInteraction(view, mediaView, (List<View>) null);
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, MediaView mediaView, @Nullable List<View> list) {
                if (mediaView != null) {
                    XC xc2 = (XC) mediaView.getMediaViewApi();
                    C1228Sw c1228Sw = this.A00;
                    String[] strArr = A02;
                    if (strArr[3].length() == strArr[4].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A02;
                    strArr2[2] = "js1TYeoyNOBe6miaJaLofzAsC6CsUfwk";
                    strArr2[0] = "W1hafLFlhK2580scubVHArACmFSZlS1F";
                    xc2.A0M(c1228Sw, true);
                }
                if (list != null) {
                    this.A00.A1O(view, mediaView, list);
                } else {
                    this.A00.A1N(view, mediaView);
                }
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeBannerAdViewApi createNativeBannerAdViewApi() {
        if (A03 == null) {
            A03 = new NativeBannerAdViewApi() { // from class: com.facebook.ads.redexgen.X.5V
                public static View A00(C1316Wj c1316Wj, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    if (nativeAdViewAttributes == null) {
                        nativeAdViewAttributes = new NativeAdViewAttributes();
                    }
                    C1228Sw.A0L(nativeBannerAd.getInternalNativeAd()).A1X(EnumC0973Iu.A00(type.getEnumCode()));
                    Dt bannerTemplateLayoutApi = new Dt();
                    NativeAdLayout nativeAdLayout = new NativeAdLayout(c1316Wj, bannerTemplateLayoutApi);
                    bannerTemplateLayoutApi.A04(c1316Wj, nativeBannerAd, (C0972It) nativeAdViewAttributes.getInternalAttributes(), nativeAdLayout);
                    nativeAdLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (Kd.A02 * type.getHeight())));
                    return nativeAdLayout;
                }

                @Override // com.facebook.ads.internal.api.NativeBannerAdViewApi
                public final View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type) {
                    return render(context, nativeBannerAd, type, null);
                }

                @Override // com.facebook.ads.internal.api.NativeBannerAdViewApi
                @SuppressLint({"CatchGeneralException"})
                public final View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type, @Nullable NativeAdViewAttributes nativeAdViewAttributes) {
                    try {
                        return A00(C5G.A02(context), nativeBannerAd, type, nativeAdViewAttributes);
                    } catch (Throwable th) {
                        return C1039Lm.A00(C5G.A02(context), th);
                    }
                }
            };
        }
        return A03;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeComponentTagApi createNativeComponentTagApi() {
        return new NativeComponentTagApi() { // from class: com.facebook.ads.redexgen.X.5W
            @Override // com.facebook.ads.internal.api.NativeComponentTagApi
            public final void tagView(View view, NativeAdBase.NativeComponentTag nativeComponentTag) {
                if (view != null && nativeComponentTag != null) {
                    EnumC1009Ki.A03(view, nativeComponentTag);
                }
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public RewardedInterstitialAdApi createRewardedInterstitialAd(Context context, String str, RewardedInterstitialAd rewardedInterstitialAd) {
        return (RewardedInterstitialAdApi) AnonymousClass51.A00(new C5X(context, str, rewardedInterstitialAd), RewardedInterstitialAdApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public RewardedVideoAdApi createRewardedVideoAd(Context context, String str, RewardedVideoAd rewardedVideoAd) {
        return (RewardedVideoAdApi) AnonymousClass51.A00(new C06455b(context, str, rewardedVideoAd), RewardedVideoAdApi.class);
    }

    public static C5F getBidderTokenProviderApi() {
        if (A04 == null) {
            A04 = new C5F();
        }
        C5F c5f = A04;
        if (A05[0].length() == 2) {
            throw new RuntimeException();
        }
        A05[6] = "wbYWwuhs42I1eIPNPpozWjfLzFT5vnXv";
        return c5f;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public InitApi getInitApi() {
        return A06;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public void maybeInitInternally(Context context) {
        AnonymousClass89.A0A(C5G.A07(context));
    }
}
