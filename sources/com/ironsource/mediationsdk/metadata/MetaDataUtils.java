package com.ironsource.mediationsdk.metadata;

import com.huawei.hms.ads.ep;
import com.ironsource.mediationsdk.metadata.MetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class MetaDataUtils {
    public static String checkMetaDataKeyValidity(String str) {
        if (str != null && str.length() <= 64 && str.matches("[A-Za-z0-9_\\-.]+")) {
            return "";
        }
        return "The MetaData key you entered is invalid. Please enter a key of maximum 64 characters that consists of only letters, digits and the following characters: . - _";
    }

    public static String checkMetaDataValueValidity(List<String> list) {
        if (list.size() == 0) {
            return "The MetaData list should include at least one element.";
        }
        for (String str : list) {
            if (str == null || str.length() > 64 || !str.matches("[A-Za-z0-9_\\-.]+")) {
                return "The MetaData value(s) you entered is invalid. Please enter a value of maximum 64 characters that consists of only letters, digits and the following characters: . - _";
            }
        }
        return "";
    }

    public static MetaData formatMetaData(String str, List<String> list) {
        if (!isKnownKey(str)) {
            return new MetaData(str, list);
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : list) {
            MetaData.MetaDataValueTypes valueTypeForKey = getValueTypeForKey(lowerCase);
            String formatValueForType = formatValueForType(str2, valueTypeForKey);
            arrayList.add(valueTypeForKey);
            arrayList2.add(formatValueForType);
        }
        return new MetaData(lowerCase, arrayList2, arrayList);
    }

    public static String formatValueForType(String str, MetaData.MetaDataValueTypes metaDataValueTypes) {
        if (metaDataValueTypes == MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN) {
            String str2 = ep.Code;
            if (!str.equalsIgnoreCase(ep.Code) && !str.equalsIgnoreCase("yes")) {
                str2 = ep.V;
                if (!str.equalsIgnoreCase(ep.V) && !str.equalsIgnoreCase("no")) {
                    return "";
                }
            }
            return str2;
        }
        return str;
    }

    public static boolean getMetaDataBooleanValue(String str) {
        if (str.equals(ep.V)) {
            return false;
        }
        return true;
    }

    public static MetaData.MetaDataValueTypes getValueTypeForKey(String str) {
        if (!str.equalsIgnoreCase("do_not_sell") && !str.equalsIgnoreCase("is_child_directed") && !str.equalsIgnoreCase("is_deviceid_optout")) {
            return MetaData.MetaDataValueTypes.META_DATA_VALUE_STRING;
        }
        return MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN;
    }

    public static boolean isKnownKey(String str) {
        if (!str.equalsIgnoreCase("do_not_sell") && !str.equalsIgnoreCase("is_child_directed") && !str.equalsIgnoreCase("is_deviceid_optout")) {
            return false;
        }
        return true;
    }

    public static boolean isMediationKeysBeforeInit(String str) {
        if (str.equalsIgnoreCase("is_deviceid_optout")) {
            return true;
        }
        return false;
    }

    public static boolean isMediationOnlyKey(String str) {
        if (!str.equalsIgnoreCase("is_child_directed") && !str.equalsIgnoreCase("is_deviceid_optout")) {
            return false;
        }
        return true;
    }

    public static boolean isValidCCPAMetaData(String str, String str2) {
        if (str.equals("do_not_sell") && str2.length() > 0) {
            return true;
        }
        return false;
    }
}
