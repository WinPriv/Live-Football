package com.ironsource.environment;

import com.huawei.openalliance.ad.constant.av;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList<String> f24698a = new ArrayList<>(Arrays.asList("applicationUserAgeGroup", "uAge", "advId", "appKey", "mCar", "medV", "connT", "dWidth", "dHeight", "dModel", "cTime", "sDepRV", "sDepIS", "sId", "plType", "dOSV", "dOSVF", "dOS", "dMake", "dAPI", "bId", "appV", "usId", "bat", "root", "diskFS", "dLang", "MD", "uGen", "advType", "isLAT", "dVol", av.O, "dHeight", "dWidth", "dScrenScle", "auid", "UA", "asid"));

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap<String, String> f24699b = new a();

    /* loaded from: classes2.dex */
    public static class a extends HashMap<String, String> {
        public a() {
            put("omidVersion", "omidV");
            put("omidPartnerVersion", "omidPV");
            put("immersiveMode", "imm");
            put("appOrientation", "appOr");
            put("SDKVersion", "sdkV");
            put("deviceScreenScale", "dScrenScle");
            put("phoneType", "pType");
            put("simOperator", "simOp");
            put("lastUpdateTime", "lUpdateT");
            put("firstInstallTime", "fInstallT");
            put("displaySizeWidth", "dWidth");
            put("displaySizeHeight", "dHeight");
            put("cellularNetworkType", "cellNetT");
            put("hasVPN", "vpn");
            put("deviceVolume", "dVol");
            put("sdCardAvailable", "sdCrdAvail");
            put("isCharging", "isCharge");
            put("chargingType", "chargeT");
            put("airplaneMode", "airM");
            put("stayOnWhenPluggedIn", "onWhnPlugIn");
            put("totalDeviceRAM", "dRAM");
            put("installerPackageName", "iPckgN");
            put("timezoneOffset", "tzOff");
            put("chinaCDN", "cnaCDN");
            put("deviceOs", "dOS");
            put("localTime", "cTime");
            put("deviceIds[AID]", "advId");
            put("applicationUserAge", "uAge");
            put("advertisingId", "advId");
            put("advIdType", "advType");
            put("deviceWidth", "dWidth");
            put("deviceHeight", "dHeight");
            put("deviceOS", "dOS");
            put("clientTimestamp", "cTime");
            put("sessionDepthRV", "sDepRV");
            put("sessionDepthIS", "sDepIS");
            put("sessionId", "sId");
            put("MedSDKVersion", "medV");
            put("deviceMake", "dMake");
            put("applicationUserGender", "uGen");
            put("batteryLevel", "bat");
            put("unLocked", "root");
            put("deviceOSVersion", "dOSV");
            put("bundleId", "bId");
            put("mobileCarrier", "mCar");
            put("connectionType", "connT");
            put("appVersion", "appV");
            put("applicationKey", "appKey");
            put("applicationUserId", "usId");
            put("isLimitAdTrackingEnabled", "isLAT");
            put("metadata", "MD");
            put("deviceModel", "dModel");
            put("SDKPluginType", "plType");
            put("deviceApiLevel", "dAPI");
            put("diskFreeSize", "diskFS");
            put("deviceLanguage", "dLang");
            put("deviceOEM", "dMake");
            put("deviceOSVersionFull", "dOSVF");
        }
    }
}
