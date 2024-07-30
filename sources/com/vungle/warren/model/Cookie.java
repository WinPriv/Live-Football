package com.vungle.warren.model;

import com.vungle.warren.VungleLogger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class Cookie {
    public static final String APP_ID = "appId";
    public static final String APP_SET_ID = "appSetId";
    public static final String APP_SET_ID_COOKIE = "appSetIdCookie";
    public static final String CACHE_BUST_COOKIE = "cacheBustSettings";
    public static final String CCPA_CONSENT_STATUS = "ccpa_status";
    public static final String CCPA_COOKIE = "ccpaIsImportantToVungle";
    public static final String CONFIG_COOKIE = "configSettings";
    public static final String CONFIG_EXTENSION = "config_extension";
    public static final String CONSENT_COOKIE = "consentIsImportantToVungle";
    public static final String CONSENT_STATUS_OPTED_IN = "opted_in";
    public static final String CONSENT_STATUS_OPTED_OUT = "opted_out";
    public static final String COPPA_COOKIE = "coppa_cookie";
    public static final String COPPA_DISABLE_AD_ID = "disable_ad_id";
    public static final String COPPA_KEY = "coppa";
    public static final String COPPA_STATUS_KEY = "is_coppa";
    public static final String INCENTIVIZED_TEXT_COOKIE = "incentivizedTextSetByPub";
    public static final String IS_PLAY_SERVICE_AVAILABLE = "isPlaySvcAvailable";
    public static final String LAST_CACHE_BUST = "last_cache_bust";
    public static final String USER_AGENT_ID_COOKIE = "userAgent";
    String identifier;
    Map<String, String> strings = new ConcurrentHashMap();
    Map<String, Boolean> booleans = new ConcurrentHashMap();
    Map<String, Integer> integers = new ConcurrentHashMap();
    Map<String, Long> longs = new ConcurrentHashMap();

    public Cookie(String str) {
        this.identifier = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        Map<String, String> map = this.strings;
        if (map == null ? cookie.strings != null : !map.equals(cookie.strings)) {
            return false;
        }
        Map<String, Boolean> map2 = this.booleans;
        if (map2 == null ? cookie.booleans != null : !map2.equals(cookie.booleans)) {
            return false;
        }
        Map<String, Integer> map3 = this.integers;
        if (map3 == null ? cookie.integers != null : !map3.equals(cookie.integers)) {
            return false;
        }
        Map<String, Long> map4 = this.longs;
        if (map4 == null ? cookie.longs != null : !map4.equals(cookie.longs)) {
            return false;
        }
        String str = this.identifier;
        String str2 = cookie.identifier;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public Boolean getBoolean(String str) {
        boolean z10;
        if (this.booleans.get(str) != null && this.booleans.get(str).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public Boolean getBooleanOrNull(String str) {
        return this.booleans.get(str);
    }

    public String getId() {
        return this.identifier;
    }

    public Integer getInt(String str) {
        return this.integers.get(str);
    }

    public Long getLong(String str) {
        long j10;
        if (this.longs.get(str) != null) {
            j10 = this.longs.get(str).longValue();
        } else {
            j10 = 0;
        }
        return Long.valueOf(j10);
    }

    public String getString(String str) {
        return this.strings.get(str);
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        Map<String, String> map = this.strings;
        int i14 = 0;
        if (map != null) {
            i10 = map.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = i10 * 31;
        Map<String, Boolean> map2 = this.booleans;
        if (map2 != null) {
            i11 = map2.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        Map<String, Integer> map3 = this.integers;
        if (map3 != null) {
            i12 = map3.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        Map<String, Long> map4 = this.longs;
        if (map4 != null) {
            i13 = map4.hashCode();
        } else {
            i13 = 0;
        }
        int i18 = (i17 + i13) * 31;
        String str = this.identifier;
        if (str != null) {
            i14 = str.hashCode();
        }
        return i18 + i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void putValue(String str, T t10) {
        if (t10 == 0) {
            VungleLogger.critical(true, "Cookie", "putValue", String.format("Value for key \"%s\" should not be null", str));
            return;
        }
        if (t10 instanceof String) {
            this.strings.put(str, (String) t10);
            return;
        }
        if (t10 instanceof Boolean) {
            this.booleans.put(str, (Boolean) t10);
            return;
        }
        if (t10 instanceof Integer) {
            this.integers.put(str, (Integer) t10);
        } else if (t10 instanceof Long) {
            this.longs.put(str, (Long) t10);
        } else {
            VungleLogger.critical(true, "Cookie", "putValue", "Value type is not supported!");
        }
    }
}
