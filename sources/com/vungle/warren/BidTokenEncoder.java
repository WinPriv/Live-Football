package com.vungle.warren;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.openalliance.ad.constant.w;
import com.vungle.warren.PrivacyManager;
import com.vungle.warren.locale.LocaleInfo;
import com.vungle.warren.model.BidTokenV3;
import com.vungle.warren.model.Cookie;
import com.vungle.warren.model.GdprCookie;
import com.vungle.warren.model.token.AndroidInfo;
import com.vungle.warren.model.token.Ccpa;
import com.vungle.warren.model.token.Consent;
import com.vungle.warren.model.token.Coppa;
import com.vungle.warren.model.token.Device;
import com.vungle.warren.model.token.Extension;
import com.vungle.warren.model.token.Gdpr;
import com.vungle.warren.model.token.Request;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.utility.SDKExecutors;
import com.vungle.warren.utility.TimeoutProvider;
import com.vungle.warren.utility.platform.Platform;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import m8.i;

/* loaded from: classes2.dex */
public class BidTokenEncoder {
    private Cookie ccpaCookie;
    private String configExtension;
    private Cookie gdprCookie;
    private final i gson;
    private final LocaleInfo localeInfo;
    private final Platform platform;
    private final Repository repository;
    private final TimeoutProvider timeoutProvider;

    public BidTokenEncoder(Repository repository, TimeoutProvider timeoutProvider, LocaleInfo localeInfo, Platform platform, i iVar, SDKExecutors sDKExecutors) {
        this.gson = iVar;
        this.timeoutProvider = timeoutProvider;
        this.repository = repository;
        this.localeInfo = localeInfo;
        this.platform = platform;
        PrivacyManager.getInstance().init(sDKExecutors.getBackgroundExecutor(), repository);
    }

    private String V3BidToken(String str, int i10, int i11) {
        String constructV3Token = constructV3Token(str, i10, i11);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(constructV3Token.length());
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(constructV3Token.getBytes());
            gZIPOutputStream.close();
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            byteArrayOutputStream.close();
            return "3:" + encodeToString;
        } catch (IOException unused) {
            return null;
        }
    }

    private String constructV3Token(String str, int i10, int i11) {
        AndroidInfo androidInfo;
        AndroidInfo androidInfo2;
        String str2;
        if (this.ccpaCookie == null) {
            this.ccpaCookie = (Cookie) this.repository.load(Cookie.CCPA_COOKIE, Cookie.class).get(this.timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS);
        }
        Consent consent = new Consent(new Ccpa(getCCPAStatus(this.ccpaCookie)), getGdpr(), getCoppa());
        Extension extension = new Extension(Boolean.valueOf(this.platform.getIsSideloaded()), Boolean.valueOf(this.platform.getIsSDCardPresent()), Boolean.valueOf(this.platform.getIsSoundEnabled()));
        boolean equals = Platform.MANUFACTURER_AMAZON.equals(Build.MANUFACTURER);
        String str3 = null;
        if (equals) {
            androidInfo = null;
        } else {
            androidInfo = new AndroidInfo();
        }
        if (equals) {
            androidInfo2 = new AndroidInfo();
        } else {
            androidInfo2 = null;
        }
        if (PrivacyManager.getInstance().shouldSendAdIds()) {
            str3 = this.platform.getAdvertisingInfo().advertisingId;
            if (TextUtils.isEmpty(str3)) {
                str2 = this.platform.getAndroidId();
            } else {
                str2 = "";
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = str2;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (equals) {
                    androidInfo2.android_id = str2;
                } else {
                    androidInfo.android_id = str2;
                }
            }
        }
        String str4 = str3;
        if (equals) {
            androidInfo2.app_set_id = this.platform.getAppSetId();
        } else {
            androidInfo.app_set_id = this.platform.getAppSetId();
        }
        return this.gson.j(new BidTokenV3(new Device(Boolean.valueOf(this.platform.getIsBatterySaverEnabled()), this.localeInfo.getLanguage(), this.localeInfo.getTimeZoneId(), Double.valueOf(this.platform.getVolumeLevel()), str4, androidInfo2, androidInfo, extension), new Request(getConfigExtension(), Integer.valueOf(i11), getAvailableBidTokens(str, i10, i11), VungleApiClient.getHeaderUa()), consent));
    }

    private List<String> getAvailableBidTokens(String str, int i10, int i11) {
        if (i10 <= 0) {
            i10 = 2147483646;
        }
        return this.repository.getAvailableBidTokens(str, getAvailableSizeForHBT(i10, "2", Integer.toString(i11)), ",".getBytes().length).get();
    }

    public static int getAvailableSizeForHBT(int i10, String str, String str2) {
        return (int) Math.max(Math.round(((int) (((Math.floor(((i10 - str.getBytes().length) - w.bE.getBytes().length) / 4) * 3.0d) - w.bE.getBytes().length) - str2.getBytes().length)) / 4.0d) * 4, 0L);
    }

    private static String getCCPAStatus(Cookie cookie) {
        if (cookie == null || !"opted_out".equals(cookie.getString(Cookie.CCPA_CONSENT_STATUS))) {
            return "opted_in";
        }
        return "opted_out";
    }

    private String getConfigExtension() {
        Cookie cookie;
        if (TextUtils.isEmpty(this.configExtension) && (cookie = (Cookie) this.repository.load(Cookie.CONFIG_EXTENSION, Cookie.class).get(this.timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS)) != null) {
            this.configExtension = cookie.getString(Cookie.CONFIG_EXTENSION);
        }
        return this.configExtension;
    }

    private Coppa getCoppa() {
        PrivacyManager.COPPA coppaStatus = PrivacyManager.getInstance().getCoppaStatus();
        if (coppaStatus == PrivacyManager.COPPA.COPPA_NOTSET) {
            return null;
        }
        return new Coppa(coppaStatus.getValue());
    }

    private Gdpr getGdpr() {
        GdprCookie gdprCookie;
        Cookie cookie = this.gdprCookie;
        if (cookie == null) {
            gdprCookie = new GdprCookie(this.repository, this.timeoutProvider);
            if (!"unknown".equals(gdprCookie.getConsentStatus())) {
                this.gdprCookie = gdprCookie.getCookie();
            }
        } else {
            gdprCookie = new GdprCookie(cookie);
        }
        String source = gdprCookie.getSource();
        return new Gdpr(gdprCookie.getConsentStatus(), source, gdprCookie.getMessageVersion(), gdprCookie.getTimeStamp());
    }

    public String encode(String str, int i10, int i11) {
        return V3BidToken(str, i10, i11);
    }

    public void updateCCPACookie(Cookie cookie) {
        if (cookie != null) {
            this.ccpaCookie = cookie;
        }
    }

    public void updateConfigExtension(String str) {
        this.configExtension = str;
    }

    public void updateGDPRCookie(Cookie cookie) {
        if (cookie != null) {
            this.gdprCookie = cookie;
        }
    }
}
