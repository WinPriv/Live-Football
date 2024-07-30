package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.UserManager;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.HwTelephonyManager;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.anythink.expressad.exoplayer.k.p;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import mb.a;

/* loaded from: classes2.dex */
public class NetworkUtil {
    private static final int INVALID_RSSI = -127;
    private static final String STR_NSA = "5G_NSA";
    private static final String STR_SA = "5G_SA";
    private static final String TAG = "NetworkUtil";
    private static final int TYPE_WIFI_P2P = 13;
    public static final int UNAVAILABLE = Integer.MAX_VALUE;

    /* loaded from: classes2.dex */
    public static final class NetType {
        public static final int TYPE_2G = 2;
        public static final int TYPE_3G = 3;
        public static final int TYPE_4G = 4;
        public static final int TYPE_4G_NSA = 7;
        public static final int TYPE_5G = 5;
        public static final int TYPE_5G_SA = 8;
        public static final int TYPE_MOBILE = 6;
        public static final int TYPE_NO_NETWORK = -1;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WIFI = 1;
    }

    /* loaded from: classes2.dex */
    public static final class SignalType {
        public static final String LTE_CQI = "lteCqi";
        public static final String LTE_DBM = "lteDbm";
        public static final String LTE_RSRP = "lteRsrp";
        public static final String LTE_RSRQ = "lteRsrq";
        public static final String LTE_RSSI = "lteRssi";
        public static final String LTE_RSSNR = "lteRssnr";
        public static final String NR_CSIRSRP = "nrCSIRsrp";
        public static final String NR_CSIRSRQ = "nrCSIRsrq";
        public static final String NR_CSISINR = "nrCSISinr";
        public static final String NR_DBM = "nrDbm";
        public static final String NR_SSRSRP = "nrSSRsrp";
        public static final String NR_SSRSRQ = "nrSSRsrq";
        public static final String NR_SSSINR = "nrSSSinr";
    }

    public static String getDnsServerIps(Context context) {
        return Arrays.toString(getDnsServerIpsFromConnectionManager(context));
    }

    @SuppressLint({"MissingPermission"})
    private static String[] getDnsServerIpsFromConnectionManager(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo;
        LinkProperties linkProperties;
        LinkedList linkedList = new LinkedList();
        if (context != null && (connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, "connectivity")) != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    for (Network network : connectivityManager.getAllNetworks()) {
                        if (network != null && (networkInfo = connectivityManager.getNetworkInfo(network)) != null && networkInfo.getType() == activeNetworkInfo.getType() && (linkProperties = connectivityManager.getLinkProperties(network)) != null) {
                            Iterator<InetAddress> it = linkProperties.getDnsServers().iterator();
                            while (it.hasNext()) {
                                linkedList.add(it.next().getHostAddress());
                            }
                        }
                    }
                }
            } catch (SecurityException e10) {
                Logger.i(TAG, "getActiveNetworkInfo failed, exception:".concat(e10.getClass().getSimpleName()));
            } catch (RuntimeException e11) {
                Logger.i(TAG, "getActiveNetworkInfo failed, exception:".concat(e11.getClass().getSimpleName()));
            }
        }
        if (linkedList.isEmpty()) {
            return new String[0];
        }
        return (String[]) linkedList.toArray(new String[linkedList.size()]);
    }

    public static String getHost(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return a.a(str);
    }

    public static int getInfoWithReflect(SignalStrength signalStrength, String str) {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                final Method declaredMethod = SignalStrength.class.getDeclaredMethod(str, new Class[0]);
                AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.NetworkUtil.1
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        declaredMethod.setAccessible(true);
                        return null;
                    }
                });
                return ((Integer) declaredMethod.invoke(signalStrength, new Object[0])).intValue();
            }
            return Integer.MAX_VALUE;
        } catch (IllegalAccessException unused) {
            Logger.i(TAG, str + " : cannot access");
            return Integer.MAX_VALUE;
        } catch (NoSuchMethodException unused2) {
            Logger.i(TAG, str + " : function not found");
            return Integer.MAX_VALUE;
        } catch (InvocationTargetException unused3) {
            Logger.i(TAG, str + " : InvocationTargetException");
            return Integer.MAX_VALUE;
        } catch (Throwable th) {
            String str2 = TAG;
            StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str, " : throwable:");
            l10.append(th.getClass());
            Logger.i(str2, l10.toString());
            return Integer.MAX_VALUE;
        }
    }

    public static int getLteCqi(Context context) {
        List cellSignalStrengths;
        int cqi;
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return Integer.MAX_VALUE;
        }
        try {
        } catch (Throwable th) {
            Logger.i(TAG, "getLteCqi: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT > 28) {
            cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
            if (cellSignalStrengths.size() > 0) {
                cqi = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getCqi();
                return cqi;
            }
            return Integer.MAX_VALUE;
        }
        return getInfoWithReflect(signalStrength, "getLteCqi");
    }

    public static int getLteRsrp(Context context) {
        List cellSignalStrengths;
        int rsrp;
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return Integer.MAX_VALUE;
        }
        try {
        } catch (Throwable th) {
            Logger.i(TAG, "getLteRsrp: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT > 28) {
            cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
            if (cellSignalStrengths.size() > 0) {
                rsrp = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrp();
                return rsrp;
            }
            return Integer.MAX_VALUE;
        }
        return getInfoWithReflect(signalStrength, "getLteRsrp");
    }

    public static int getLteRsrq(Context context) {
        List cellSignalStrengths;
        int rsrq;
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return Integer.MAX_VALUE;
        }
        try {
        } catch (Throwable th) {
            Logger.i(TAG, "getLteRsrq: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT > 28) {
            cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
            if (cellSignalStrengths.size() > 0) {
                rsrq = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrq();
                return rsrq;
            }
            return Integer.MAX_VALUE;
        }
        return getInfoWithReflect(signalStrength, "getLteRsrq");
    }

    public static int getLteRssi(Context context) {
        List cellSignalStrengths;
        int rssi;
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return Integer.MAX_VALUE;
        }
        try {
            if (Build.VERSION.SDK_INT > 28) {
                cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths.size() > 0) {
                    rssi = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssi();
                    return rssi;
                }
            }
        } catch (Throwable th) {
            Logger.i(TAG, "getLteRssi: throwable:" + th.getClass());
        }
        return Integer.MAX_VALUE;
    }

    public static int getLteRssnr(Context context) {
        List cellSignalStrengths;
        int rssnr;
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return Integer.MAX_VALUE;
        }
        try {
        } catch (Throwable th) {
            Logger.i(TAG, "getLteRssnr: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT > 28) {
            cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
            if (cellSignalStrengths.size() > 0) {
                rssnr = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssnr();
                return rssnr;
            }
            return Integer.MAX_VALUE;
        }
        return getInfoWithReflect(signalStrength, "getLteRssnr");
    }

    public static Map<String, Integer> getLteSignalInfo(Context context) {
        List cellSignalStrengths;
        int rsrp;
        int rsrq;
        int rssnr;
        int cqi;
        int rssi;
        HashMap hashMap = new HashMap();
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return hashMap;
        }
        try {
            if (Build.VERSION.SDK_INT > 28) {
                cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths.size() > 0) {
                    hashMap.put(SignalType.LTE_DBM, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getDbm()));
                    rsrp = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrp();
                    hashMap.put(SignalType.LTE_RSRP, Integer.valueOf(rsrp));
                    rsrq = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrq();
                    hashMap.put(SignalType.LTE_RSRQ, Integer.valueOf(rsrq));
                    rssnr = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssnr();
                    hashMap.put(SignalType.LTE_RSSNR, Integer.valueOf(rssnr));
                    cqi = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getCqi();
                    hashMap.put(SignalType.LTE_CQI, Integer.valueOf(cqi));
                    rssi = ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssi();
                    hashMap.put(SignalType.LTE_RSSI, Integer.valueOf(rssi));
                }
            } else {
                hashMap.put(SignalType.LTE_DBM, Integer.valueOf(getInfoWithReflect(signalStrength, "getDbm")));
                hashMap.put(SignalType.LTE_RSRP, Integer.valueOf(getInfoWithReflect(signalStrength, "getLteRsrp")));
                hashMap.put(SignalType.LTE_RSRQ, Integer.valueOf(getInfoWithReflect(signalStrength, "getLteRsrq")));
                hashMap.put(SignalType.LTE_RSSNR, Integer.valueOf(getInfoWithReflect(signalStrength, "getLteRssnr")));
                hashMap.put(SignalType.LTE_CQI, Integer.valueOf(getInfoWithReflect(signalStrength, "getLteCqi")));
            }
        } catch (Throwable th) {
            Logger.i(TAG, "getLteRssi: throwable:" + th.getClass());
        }
        return hashMap;
    }

    public static String getMNC(Context context) {
        TelephonyManager telephonyManager;
        if (context == null || !isSimReady(context)) {
            return "unknown";
        }
        Object systemService = ContextCompat.getSystemService(context, "phone");
        if (systemService instanceof TelephonyManager) {
            telephonyManager = (TelephonyManager) systemService;
        } else {
            telephonyManager = null;
        }
        if (telephonyManager == null) {
            Logger.e(TAG, "getSubscriptionOperatorType: other error!");
            return "unknown";
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        if (!"46001".equals(networkOperator) && !"46006".equals(networkOperator) && !"46009".equals(networkOperator)) {
            if (!"46000".equals(networkOperator) && !"46002".equals(networkOperator) && !"46004".equals(networkOperator) && !"46007".equals(networkOperator)) {
                if (!"46003".equals(networkOperator) && !"46005".equals(networkOperator) && !"46011".equals(networkOperator)) {
                    return "other";
                }
                return "China_Telecom";
            }
            return "China_Mobile";
        }
        return "China_Unicom";
    }

    public static int getMobileRsrp(Context context) {
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return Integer.MAX_VALUE;
        }
        try {
            if (Build.VERSION.SDK_INT > 28) {
                return getMobileSingalStrengthUpPPlatfrom(context);
            }
            return getInfoWithReflect(signalStrength, "getDbm");
        } catch (Throwable th) {
            Logger.i(TAG, "getDbm: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    private static int getMobileSingalStrengthUpPPlatfrom(Context context) {
        SignalStrength signalStrength;
        List cellSignalStrengths;
        List cellSignalStrengths2;
        List cellSignalStrengths3;
        int dbm;
        List cellSignalStrengths4;
        List cellSignalStrengths5;
        int i10 = Integer.MAX_VALUE;
        if (Build.VERSION.SDK_INT <= 28 || (signalStrength = getSignalStrength(context)) == null) {
            return Integer.MAX_VALUE;
        }
        int networkType = getNetworkType(context);
        try {
            if (networkType == 3) {
                cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthCdma.class);
                if (cellSignalStrengths.size() <= 0) {
                    cellSignalStrengths2 = signalStrength.getCellSignalStrengths(CellSignalStrengthTdscdma.class);
                    if (cellSignalStrengths2.size() > 0) {
                        dbm = ((CellSignalStrengthTdscdma) cellSignalStrengths2.get(0)).getDbm();
                    } else {
                        cellSignalStrengths3 = signalStrength.getCellSignalStrengths(CellSignalStrengthWcdma.class);
                        if (cellSignalStrengths3.size() <= 0) {
                            return Integer.MAX_VALUE;
                        }
                        dbm = ((CellSignalStrengthWcdma) cellSignalStrengths3.get(0)).getDbm();
                    }
                } else {
                    dbm = ((CellSignalStrengthCdma) cellSignalStrengths.get(0)).getDbm();
                }
            } else if (networkType == 4) {
                cellSignalStrengths4 = signalStrength.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths4.size() <= 0) {
                    return Integer.MAX_VALUE;
                }
                dbm = ((CellSignalStrengthLte) cellSignalStrengths4.get(0)).getDbm();
            } else if (networkType == 5) {
                cellSignalStrengths5 = signalStrength.getCellSignalStrengths(CellSignalStrengthNr.class);
                if (cellSignalStrengths5.size() > 0) {
                    dbm = ((CellSignalStrengthNr) cellSignalStrengths5.get(0)).getDbm();
                } else {
                    return Integer.MAX_VALUE;
                }
            } else {
                return Integer.MAX_VALUE;
            }
            i10 = dbm;
            return i10;
        } catch (Throwable th) {
            Logger.i(TAG, "getMobileSingalStrength: throwable:" + th.getClass());
            return i10;
        }
    }

    public static String getNetWorkNSAorSA() {
        try {
            HwTelephonyManager hwTelephonyManager = HwTelephonyManager.getDefault();
            int default4GSlotId = hwTelephonyManager.getDefault4GSlotId();
            String str = TAG;
            Logger.v(str, "phoneId " + default4GSlotId);
            boolean isNsaState = hwTelephonyManager.isNsaState(default4GSlotId);
            Logger.v(str, "isNsa " + isNsaState);
            if (isNsaState) {
                return STR_NSA;
            }
            return STR_SA;
        } catch (Throwable unused) {
            Logger.v(TAG, "isNsaState error");
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static NetworkInfo getNetworkInfo(Context context) {
        ConnectivityManager connectivityManager;
        if (!ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, "connectivity")) == null) {
            return null;
        }
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (RuntimeException e10) {
            Logger.i(TAG, "getActiveNetworkInfo failed, exception:" + e10.getClass().getSimpleName() + e10.getMessage());
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static NetworkInfo.DetailedState getNetworkStatus(Context context) {
        NetworkInfo.DetailedState detailedState = NetworkInfo.DetailedState.IDLE;
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "connectivity");
            if (systemService instanceof ConnectivityManager) {
                try {
                    if (!ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                        return detailedState;
                    }
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        detailedState = activeNetworkInfo.getDetailedState();
                    } else {
                        Logger.i(TAG, "getNetworkStatus networkIsConnected netInfo is null!");
                    }
                } catch (RuntimeException e10) {
                    Logger.i(TAG, "getNetworkStatus exception" + e10.getClass().getSimpleName() + e10.getMessage());
                }
            } else {
                Logger.i(TAG, "getNetworkStatus ConnectivityManager is null!");
            }
        }
        return detailedState;
    }

    public static int getNetworkType(Context context) {
        if (context != null) {
            return getNetworkType(getNetworkInfo(context), context);
        }
        return 0;
    }

    public static int getNrCsiRsrp(Context context) {
        SignalStrength signalStrength;
        List cellSignalStrengths;
        int csiRsrp;
        try {
        } catch (Throwable th) {
            Logger.i(TAG, "getNrCsiRsrp: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrength = getSignalStrength(context)) == null) {
            return Integer.MAX_VALUE;
        }
        cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthNr.class);
        if (cellSignalStrengths.size() > 0) {
            csiRsrp = ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getCsiRsrp();
            return csiRsrp;
        }
        return Integer.MAX_VALUE;
    }

    public static int getNrCsiRsrq(Context context) {
        SignalStrength signalStrength;
        List cellSignalStrengths;
        int csiRsrq;
        try {
        } catch (Throwable th) {
            Logger.i(TAG, "getNrCsiRsrq: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrength = getSignalStrength(context)) == null) {
            return Integer.MAX_VALUE;
        }
        cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthNr.class);
        if (cellSignalStrengths.size() > 0) {
            csiRsrq = ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getCsiRsrq();
            return csiRsrq;
        }
        return Integer.MAX_VALUE;
    }

    public static int getNrCsiSinr(Context context) {
        SignalStrength signalStrength;
        List cellSignalStrengths;
        int csiSinr;
        try {
        } catch (Throwable th) {
            Logger.i(TAG, "getNrCsiSinr: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrength = getSignalStrength(context)) == null) {
            return Integer.MAX_VALUE;
        }
        cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthNr.class);
        if (cellSignalStrengths.size() > 0) {
            csiSinr = ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getCsiSinr();
            return csiSinr;
        }
        return Integer.MAX_VALUE;
    }

    public static Map<String, Integer> getNrSignalInfo(Context context) {
        List cellSignalStrengths;
        int dbm;
        int csiRsrp;
        int csiRsrq;
        int csiSinr;
        int ssRsrp;
        int ssRsrq;
        int ssSinr;
        HashMap hashMap = new HashMap();
        SignalStrength signalStrength = getSignalStrength(context);
        if (signalStrength == null) {
            return hashMap;
        }
        try {
            if (Build.VERSION.SDK_INT > 28) {
                cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthNr.class);
                if (cellSignalStrengths.size() > 0) {
                    dbm = ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getDbm();
                    hashMap.put(SignalType.NR_DBM, Integer.valueOf(dbm));
                    csiRsrp = ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getCsiRsrp();
                    hashMap.put(SignalType.NR_CSIRSRP, Integer.valueOf(csiRsrp));
                    csiRsrq = ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getCsiRsrq();
                    hashMap.put(SignalType.NR_CSIRSRQ, Integer.valueOf(csiRsrq));
                    csiSinr = ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getCsiSinr();
                    hashMap.put(SignalType.NR_CSISINR, Integer.valueOf(csiSinr));
                    ssRsrp = ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getSsRsrp();
                    hashMap.put(SignalType.NR_SSRSRP, Integer.valueOf(ssRsrp));
                    ssRsrq = ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getSsRsrq();
                    hashMap.put(SignalType.NR_SSRSRQ, Integer.valueOf(ssRsrq));
                    ssSinr = ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getSsSinr();
                    hashMap.put(SignalType.NR_SSSINR, Integer.valueOf(ssSinr));
                }
            }
        } catch (Throwable th) {
            Logger.i(TAG, "getLteRssi: throwable:" + th.getClass());
        }
        return hashMap;
    }

    public static int getNrSsRsrp(Context context) {
        SignalStrength signalStrength;
        List cellSignalStrengths;
        int ssRsrp;
        try {
        } catch (Throwable th) {
            Logger.i(TAG, "getNrSsRsrp: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrength = getSignalStrength(context)) == null) {
            return Integer.MAX_VALUE;
        }
        cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthNr.class);
        if (cellSignalStrengths.size() > 0) {
            ssRsrp = ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getSsRsrp();
            return ssRsrp;
        }
        return Integer.MAX_VALUE;
    }

    public static int getNrSsRsrq(Context context) {
        SignalStrength signalStrength;
        List cellSignalStrengths;
        int ssRsrq;
        try {
        } catch (Throwable th) {
            Logger.i(TAG, "getNrSsRsrq: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrength = getSignalStrength(context)) == null) {
            return Integer.MAX_VALUE;
        }
        cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthNr.class);
        if (cellSignalStrengths.size() > 0) {
            ssRsrq = ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getSsRsrq();
            return ssRsrq;
        }
        return Integer.MAX_VALUE;
    }

    public static int getNrSsSinr(Context context) {
        SignalStrength signalStrength;
        List cellSignalStrengths;
        int ssSinr;
        try {
        } catch (Throwable th) {
            Logger.i(TAG, "getNrSsSinr: throwable:" + th.getClass());
        }
        if (Build.VERSION.SDK_INT <= 28 || (signalStrength = getSignalStrength(context)) == null) {
            return Integer.MAX_VALUE;
        }
        cellSignalStrengths = signalStrength.getCellSignalStrengths(CellSignalStrengthNr.class);
        if (cellSignalStrengths.size() > 0) {
            ssSinr = ((CellSignalStrengthNr) cellSignalStrengths.get(0)).getSsSinr();
            return ssSinr;
        }
        return Integer.MAX_VALUE;
    }

    public static int getPrimaryNetworkType(Context context) {
        return groupNetworkType(getNetworkType(getNetworkInfo(context), context));
    }

    private static SignalStrength getSignalStrength(Context context) {
        SignalStrength signalStrength;
        if (context != null && Build.VERSION.SDK_INT >= 28) {
            signalStrength = getTrafficCardTelephonyManager(context).getSignalStrength();
            return signalStrength;
        }
        return null;
    }

    public static TelephonyManager getTrafficCardTelephonyManager(Context context) {
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "phone");
            if (systemService instanceof TelephonyManager) {
                return ((TelephonyManager) systemService).createForSubscriptionId(SubscriptionManager.getDefaultDataSubscriptionId());
            }
            return null;
        }
        return null;
    }

    public static String getWifiGatewayIp(Context context) {
        if (context == null) {
            return " ";
        }
        Object systemService = ContextCompat.getSystemService(context.getApplicationContext(), "wifi");
        if (!(systemService instanceof WifiManager)) {
            return " ";
        }
        try {
            int i10 = ((WifiManager) systemService).getDhcpInfo().gateway;
            return InetAddress.getByAddress(new byte[]{(byte) (i10 & p.f9095b), (byte) ((i10 >> 8) & p.f9095b), (byte) ((i10 >> 16) & p.f9095b), (byte) ((i10 >> 24) & p.f9095b)}).getHostAddress();
        } catch (RuntimeException | UnknownHostException e10) {
            Logger.i(TAG, "getWifiGatewayIp error!" + e10.getClass().getSimpleName() + e10.getMessage());
            return " ";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x002f, code lost:
    
        r5 = r5.getTransportInfo();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getWifiRssi(android.content.Context r7) {
        /*
            r0 = -127(0xffffffffffffff81, float:NaN)
            if (r7 == 0) goto La6
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            java.lang.String r3 = "getWifiRssiLevel did not has permission!"
            if (r1 < r2) goto L64
            android.content.Context r7 = r7.getApplicationContext()     // Catch: java.lang.RuntimeException -> L42
            java.lang.String r1 = "connectivity"
            java.lang.Object r7 = r7.getSystemService(r1)     // Catch: java.lang.RuntimeException -> L42
            android.net.ConnectivityManager r7 = (android.net.ConnectivityManager) r7     // Catch: java.lang.RuntimeException -> L42
            android.net.Network[] r1 = r7.getAllNetworks()     // Catch: java.lang.RuntimeException -> L42
            int r2 = r1.length     // Catch: java.lang.RuntimeException -> L42
            r4 = 0
        L1e:
            if (r4 >= r2) goto La6
            r5 = r1[r4]     // Catch: java.lang.RuntimeException -> L42
            android.net.NetworkCapabilities r5 = r7.getNetworkCapabilities(r5)     // Catch: java.lang.RuntimeException -> L42
            if (r5 == 0) goto L3f
            r6 = 1
            boolean r6 = r5.hasTransport(r6)     // Catch: java.lang.RuntimeException -> L42
            if (r6 == 0) goto L3f
            android.net.TransportInfo r5 = androidx.appcompat.widget.t.j(r5)     // Catch: java.lang.RuntimeException -> L42
            if (r5 == 0) goto L3f
            boolean r6 = r5 instanceof android.net.wifi.WifiInfo     // Catch: java.lang.RuntimeException -> L42
            if (r6 == 0) goto L3f
            android.net.wifi.WifiInfo r5 = (android.net.wifi.WifiInfo) r5     // Catch: java.lang.RuntimeException -> L42
            int r0 = r5.getRssi()     // Catch: java.lang.RuntimeException -> L42
        L3f:
            int r4 = r4 + 1
            goto L1e
        L42:
            r7 = move-exception
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            java.lang.Class r3 = r7.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r1, r7)
            goto La6
        L64:
            android.content.Context r7 = r7.getApplicationContext()
            java.lang.String r1 = "wifi"
            java.lang.Object r7 = com.huawei.hms.framework.common.ContextCompat.getSystemService(r7, r1)
            boolean r1 = r7 instanceof android.net.wifi.WifiManager
            if (r1 == 0) goto La6
            android.net.wifi.WifiManager r7 = (android.net.wifi.WifiManager) r7
            android.net.wifi.WifiInfo r7 = r7.getConnectionInfo()     // Catch: java.lang.RuntimeException -> L85
            if (r7 == 0) goto La6
            java.lang.String r1 = r7.getBSSID()     // Catch: java.lang.RuntimeException -> L85
            if (r1 == 0) goto La6
            int r0 = r7.getRssi()     // Catch: java.lang.RuntimeException -> L85
            goto La6
        L85:
            r7 = move-exception
            java.lang.String r1 = com.huawei.hms.framework.common.NetworkUtil.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            java.lang.Class r3 = r7.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            com.huawei.hms.framework.common.Logger.i(r1, r7)
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.common.NetworkUtil.getWifiRssi(android.content.Context):int");
    }

    public static int getWifiRssiLevel(Context context) {
        return WifiManager.calculateSignalLevel(getWifiRssi(context), 5);
    }

    private static int groupNetworkType(int i10) {
        if (i10 == -1) {
            return -1;
        }
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5) {
            return 0;
        }
        return 6;
    }

    public static boolean isChangeToConnected(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        if ((networkInfo == null || !networkInfo.isConnected()) && networkInfo2.isConnected()) {
            Logger.v(TAG, "Find network state changed to connected");
            return true;
        }
        return false;
    }

    public static boolean isConnectTypeChange(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        if (networkInfo != null && networkInfo.isConnected() && networkInfo2.isConnected() && getPrimaryNetworkType(networkInfo) != getPrimaryNetworkType(networkInfo2)) {
            Logger.v(TAG, "Find activity network changed");
            return true;
        }
        return false;
    }

    @Deprecated
    public static boolean isForeground(Context context) {
        return ActivityUtil.isForeground(context);
    }

    public static boolean isNetworkAvailable(Context context) {
        if (!ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo networkInfo = getNetworkInfo(context);
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public static boolean isSimReady(Context context) {
        TelephonyManager telephonyManager;
        Object systemService = ContextCompat.getSystemService(context, "phone");
        if (systemService instanceof TelephonyManager) {
            telephonyManager = (TelephonyManager) systemService;
        } else {
            telephonyManager = null;
        }
        if (telephonyManager != null && telephonyManager.getSimState() == 5) {
            return true;
        }
        return false;
    }

    public static boolean isUserUnlocked(Context context) {
        UserManager userManager = (UserManager) ContextCompat.getSystemService(context, "user");
        if (userManager != null) {
            try {
                return userManager.isUserUnlocked();
            } catch (RuntimeException e10) {
                Logger.e(TAG, "dealType rethrowFromSystemServer:", e10);
                return true;
            }
        }
        return true;
    }

    public static int netWork(Context context) {
        int networkType = getNetworkType(context);
        Logger.v(TAG, "newWorkType " + networkType);
        if (networkType == 4) {
            if (TextUtils.equals(STR_NSA, getNetWorkNSAorSA())) {
                return 7;
            }
            return networkType;
        }
        if (networkType == 5 && TextUtils.equals(STR_SA, getNetWorkNSAorSA())) {
            return 8;
        }
        return networkType;
    }

    @Deprecated
    public static NetworkInfo.DetailedState networkStatus(Context context) {
        return getNetworkStatus(context);
    }

    @SuppressLint({"MissingPermission"})
    public static int readDataSaverMode(Context context) {
        int i10 = 0;
        if (context != null && ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            Object systemService = ContextCompat.getSystemService(context, "connectivity");
            if (systemService instanceof ConnectivityManager) {
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                try {
                    if (connectivityManager.isActiveNetworkMetered()) {
                        i10 = connectivityManager.getRestrictBackgroundStatus();
                    } else {
                        Logger.v(TAG, "ConnectType is not Mobile Network!");
                    }
                } catch (RuntimeException e10) {
                    Logger.e(TAG, "SystemServer error:", e10);
                }
            }
        }
        return i10;
    }

    public static int getNetworkType(NetworkInfo networkInfo, Context context) {
        int i10;
        if (networkInfo == null || !networkInfo.isConnected()) {
            return -1;
        }
        int type = networkInfo.getType();
        if (1 == type || 13 == type) {
            return 1;
        }
        if (type != 0) {
            return 0;
        }
        int subtype = networkInfo.getSubtype();
        Logger.v(TAG, "getHwNetworkType return is: " + subtype);
        if (subtype == 0) {
            subtype = networkInfo.getSubtype();
        }
        if (subtype != 20) {
            switch (subtype) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    i10 = 2;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    i10 = 3;
                    break;
                case 13:
                    i10 = 4;
                    break;
                default:
                    i10 = 0;
                    break;
            }
        } else {
            i10 = 5;
        }
        if (i10 != 0 || Build.VERSION.SDK_INT < 25) {
            return i10;
        }
        if (subtype != 16) {
            return subtype != 17 ? 0 : 3;
        }
        return 2;
    }

    public static int getPrimaryNetworkType(NetworkInfo networkInfo) {
        return groupNetworkType(getNetworkType(networkInfo));
    }

    public static int getNetworkType(NetworkInfo networkInfo) {
        return getNetworkType(networkInfo, null);
    }
}
