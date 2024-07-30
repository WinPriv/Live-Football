package com.vungle.warren.locale;

import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class SystemLocaleInfo implements LocaleInfo {
    @Override // com.vungle.warren.locale.LocaleInfo
    public String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    @Override // com.vungle.warren.locale.LocaleInfo
    public String getTimeZoneId() {
        return TimeZone.getDefault().getID();
    }
}
