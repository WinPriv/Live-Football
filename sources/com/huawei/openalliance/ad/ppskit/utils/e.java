package com.huawei.openalliance.ad.ppskit.utils;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import ka.n7;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final List<String> f22834a = Arrays.asList("CN");

    /* renamed from: b, reason: collision with root package name */
    public static final List<String> f22835b = Arrays.asList("AE", "AF", "AG", "AI", "AM", "AO", "AR", "AS", "AW", "AZ", "BB", "BD", "BF", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BR", "BS", "BT", "BW", "BY", "BZ", "CC", "CD", "CG", "CI", "CK", "CL", "CM", "CO", "CR", "CV", "CX", "DJ", "DM", "DO", "DZ", "EC", "EG", "ER", "ET", "FJ", "FM", "GA", "GD", "GE", "GF", "GH", "GM", "GN", "GP", "GQ", "GT", "GU", "GW", "GY", com.anythink.expressad.video.dynview.a.a.ae, "HN", "HT", "ID", "IN", "IQ", "JM", "JO", "KE", "KG", "KH", "KI", "KM", "KN", "KW", "KY", "KZ", "LA", "LB", "LC", "LK", "LR", "LS", "LY", "MA", "MG", "MH", "ML", "MM", "MN", "MO", "MP", "MQ", "MR", "MS", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NF", "NG", "NI", "NP", "NR", "NU", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PN", "PR", "PS", "PW", "PY", "QA", "RE", "RW", "SA", "SB", "SC", "SG", "SL", "SN", "SO", "SR", "SS", "ST", "SV", "SZ", "TC", "TD", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TT", "TV", com.anythink.expressad.video.dynview.a.a.f11380ad, "TZ", "UG", "UY", "UZ", "VG", "VI", "VN", "VU", "WF", "WS", "YT", "ZA", "ZM", "ZW", "JP", "KR");

    /* renamed from: c, reason: collision with root package name */
    public static final List<String> f22836c = Arrays.asList("AD", "AL", "AT", "AU", "BA", "BE", "BG", "BQ", "CA", "CH", "CY", "CZ", "DE", "DK", "EE", "ES", "FI", "FO", "FR", "GB", "GI", "GL", "GR", "HR", "HU", "IE", "IL", IronSourceConstants.INTERSTITIAL_EVENT_TYPE, "IT", "UA", "VC", "LI", "LT", "LU", "LV", "MC", "MD", "ME", "MK", "MT", "NL", "NO", "NZ", "PL", "PT", "RO", "RS", "SE", "SI", "SK", "SM", "SX", "TR");

    /* renamed from: d, reason: collision with root package name */
    public static final List<String> f22837d = Arrays.asList("RU");

    /* renamed from: e, reason: collision with root package name */
    public static final List<String> f22838e = Arrays.asList("AX", "AL", "DZ", "AS", "AD", "AI", "AG", "AR", "AM", "AW", "AU", "AT", "AZ", "BH", "BB", "BY", "BE", "BZ", "BD", "BJ", "BM", "BT", "BO", "BA", "BW", "BR", "BN", "BG", "BF", "BI", "KH", "CM", "CA", "KY", "CF", "TD", "CL", "CX", "CC", "CO", "KM", "CG", "CD", "CK", "CR", "CI", "HR", "CY", "CZ", "DK", "DJ", "DM", "EC", "EG", "SV", "GQ", "EE", "ET", "FK", "FO", "FI", "FR", "GF", "PF", "GA", "GM", "GE", "DE", "GH", "GI", "GR", "GL", "GD", "GP", "GU", "GT", "GG", "GN", "GW", "GY", "HT", "VA", "HN", "HU", IronSourceConstants.INTERSTITIAL_EVENT_TYPE, "IN", "ID", "IE", "IM", "IL", "IT", "JM", "JP", "JE", "JO", "KZ", "KE", "KI", "KR", "YK", "KW", "KG", "LA", "LV", "LB", "LS", "LR", "LI", "LT", "LU", "MG", "MW", "MY", "MV", "ML", "MT", "MH", "MQ", "MR", "MU", "YT", "MX", "FM", "MD", "MC", "MN", "ME", "MS", "MA", "MZ", "MM", "NA", "NR", "NP", "NL", "AN", "NC", "NZ", "NI", "NE", "NG", "NU", "NF", "MP", "NO", "OM", "PK", "PW", "PS", "PA", "PG", "PY", "PE", "PH", "PN", "PL", "PT", "PR", "QA", "RO", "RU", "RW", "BL", "SH", "KN", "LC", "MF", "VC", "WS", "SM", "ST", "SA", "SN", "RS", "SC", "SL", "SG", "SX", "SK", "SI", "SB", "SO", "ZA", "SS", "ES", "LK", "SR", "SZ", "SE", "CH", "TJ", "TZ", "TH", "BS", "AE", "TL", "TG", "TK", "TO", "TT", "TN", "TR", "TM", "TC", "TV", "UG", "UA", "GB", "UY", "UZ", "VU", "VE", "VN", "VG", "VI", "WF", "YE", "ZM", "ZW", "US", "AO", "AF", "LY", "IQ", "CV", "ER", com.anythink.expressad.video.dynview.a.a.ae, "MO", "MK", "PM", "SJ", com.anythink.expressad.video.dynview.a.a.f11380ad, "IC", "BQ", "RE", "EA", "FJ", "PM", "DO");

    public static boolean a(String str, String[] strArr, int i10, List<String> list) {
        if (TextUtils.isEmpty(str)) {
            n7.i("CountryConfig", "countryCode is empty");
            return false;
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        String str2 = null;
        if (strArr != null) {
            if (i10 >= strArr.length) {
                n7.i("CountryConfig", "index is out of array, index: " + i10);
            } else {
                str2 = strArr[i10];
            }
        }
        if (!y1.h(str2)) {
            list = Arrays.asList(str2.split(","));
        }
        if (!list.contains(upperCase)) {
            return false;
        }
        return true;
    }
}
