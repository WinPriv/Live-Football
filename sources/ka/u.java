package ka;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.location.Address;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.inner.HttpConnection;
import com.huawei.openalliance.ad.ppskit.beans.metadata.BluetoothInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.GeoLocation;
import com.huawei.openalliance.ad.ppskit.constant.ErrorCode;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.utils.t2;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class u extends r {

    /* loaded from: classes2.dex */
    public static class a implements t2.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f31919a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f31920b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ke f31921c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f31922d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f31923e;

        public a(int i10, o oVar, ke keVar, String str, boolean z10) {
            this.f31919a = i10;
            this.f31920b = oVar;
            this.f31921c = keVar;
            this.f31922d = str;
            this.f31923e = z10;
        }
    }

    public u(Context context) {
        super(context);
    }

    public static long g(String str) {
        return Math.max(com.huawei.openalliance.ad.ppskit.utils.y1.a(str, 0L), 0L);
    }

    public static String h(int i10) {
        String str;
        Object obj;
        try {
            Integer valueOf = Integer.valueOf(i10);
            for (Field field : ErrorCode.class.getDeclaredFields()) {
                if (((~field.getModifiers()) & 24) == 0 && (obj = field.get(ErrorCode.class)) != null && obj.equals(valueOf)) {
                    str = field.getName().toLowerCase(Locale.ENGLISH);
                    break;
                }
            }
        } catch (Throwable th) {
            e0.i.p(th, "getVariableNameByValue:", "AnalysisReport");
        }
        str = null;
        if (!TextUtils.isEmpty(str)) {
            return str.replace("error_code_", "");
        }
        return str;
    }

    public static void i(Context context, int i10, o oVar, String str, ke keVar, boolean z10) {
        int i11;
        a aVar = new a(i10, oVar, keVar, str, z10);
        ArrayList arrayList = new ArrayList();
        if (context == null) {
            i11 = 4;
        } else {
            Context applicationContext = context.getApplicationContext();
            if (!com.huawei.openalliance.ad.ppskit.utils.p1.a(applicationContext, "android.permission.BLUETOOTH")) {
                n7.e("BluetoothUtils", "missing permissions");
                com.huawei.openalliance.ad.ppskit.utils.t2.a(aVar, arrayList, 1);
                return;
            }
            HashMap hashMap = new HashMap();
            try {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                int i12 = 2;
                if (defaultAdapter != null && defaultAdapter.isEnabled()) {
                    Set<BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
                    if (androidx.transition.n.M(bondedDevices)) {
                        com.huawei.openalliance.ad.ppskit.utils.t2.a(aVar, arrayList, 3);
                        return;
                    }
                    for (BluetoothDevice bluetoothDevice : bondedDevices) {
                        if (bluetoothDevice != null) {
                            BluetoothInfo bluetoothInfo = new BluetoothInfo();
                            bluetoothInfo.b(bluetoothDevice.getName());
                            bluetoothInfo.d(bluetoothDevice.getAddress());
                            arrayList.add(bluetoothInfo);
                            hashMap.put(bluetoothInfo.c(), bluetoothInfo);
                        }
                    }
                    if (defaultAdapter.getProfileConnectionState(2) != 2) {
                        if (defaultAdapter.getProfileConnectionState(1) == 2) {
                            i12 = 1;
                        } else {
                            i12 = -1;
                        }
                    }
                    n7.f("BluetoothUtils", "BluetoothProfile: %s", Integer.valueOf(i12));
                    if (i12 == -1) {
                        com.huawei.openalliance.ad.ppskit.utils.t2.b(aVar, arrayList);
                        return;
                    } else {
                        defaultAdapter.getProfileProxy(applicationContext, new com.huawei.openalliance.ad.ppskit.utils.s2(aVar, arrayList, hashMap, defaultAdapter), i12);
                        return;
                    }
                }
                n7.e("BluetoothUtils", "bluetooth service is unavailable");
                com.huawei.openalliance.ad.ppskit.utils.t2.a(aVar, arrayList, 2);
                return;
            } catch (Throwable th) {
                n7.h("BluetoothUtils", "getBondedBluetoothDevices exception: %s", th.getClass().getSimpleName());
                i11 = 5;
            }
        }
        com.huawei.openalliance.ad.ppskit.utils.t2.a(aVar, arrayList, i11);
    }

    public static void o(o oVar, HttpConnection httpConnection, String str) {
        if (httpConnection != null) {
            oVar.T0 = com.huawei.openalliance.ad.ppskit.utils.y1.n(httpConnection.a());
        }
        try {
            String host = Uri.parse(str).getHost();
            oVar.R0 = com.huawei.openalliance.ad.ppskit.utils.y1.n(host);
            oVar.S0 = com.huawei.openalliance.ad.ppskit.utils.y1.n(InetAddress.getByName(host).getHostAddress());
        } catch (Throwable th) {
            n7.h("AnalysisReport", "onAdResDownload parse url exception: %s", th.getClass().getSimpleName());
        }
        if (n7.d()) {
            n7.c("AnalysisReport", "onAdResDownload analysisType: %s, cdnDomain: %s, cdnIp: %s, dlFrom: %s", oVar.f31525a, com.huawei.openalliance.ad.ppskit.utils.y1.j(oVar.R0), com.huawei.openalliance.ad.ppskit.utils.y1.j(oVar.S0), oVar.T0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void p(ka.o r14, com.huawei.openalliance.ad.ppskit.net.http.Response r15, long r16) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.u.p(ka.o, com.huawei.openalliance.ad.ppskit.net.http.Response, long):void");
    }

    public final void j(String str, int i10, String str2, Long l10, Long l11, long j10, ContentRecord contentRecord, String str3, HttpConnection httpConnection) {
        Context context = this.f31722a;
        try {
            if (contentRecord == null) {
                n7.g("AnalysisReport", "onAdResDownloadFailed, contentRecord is null");
                return;
            }
            this.f31723b = contentRecord.n1();
            o f = f(contentRecord);
            if (f == null) {
                return;
            }
            f.f31525a = "2";
            f.f31563r = str;
            f.f31565s = "httpCode:" + i10 + ", reason:" + str2;
            f.L = i10;
            f.y = str2;
            if (!TextUtils.isEmpty(str3)) {
                f.D = str3;
            }
            if (l10 != null) {
                long longValue = j10 - l10.longValue();
                n7.c("AnalysisReport", "onAdResDownloadFailed - adReqToContentDownloadDuration: %d", Long.valueOf(longValue));
                f.f31571v = String.valueOf(longValue);
            }
            if (l11 != null) {
                long longValue2 = j10 - l11.longValue();
                n7.c("AnalysisReport", "onAdResDownloadFailed - contentDownloadDuration: %d", Long.valueOf(longValue2));
                f.f31573w = String.valueOf(longValue2);
            }
            String c10 = com.huawei.openalliance.ad.ppskit.utils.w1.c(context);
            if (!TextUtils.isEmpty(c10)) {
                f.f31535d0 = com.huawei.openalliance.ad.ppskit.utils.x.u(c10).longValue();
                f.f31538e0 = com.huawei.openalliance.ad.ppskit.utils.x.t(c10).longValue();
            }
            String d10 = com.huawei.openalliance.ad.ppskit.utils.w1.d(context);
            if (!TextUtils.isEmpty(d10)) {
                f.f31539f0 = com.huawei.openalliance.ad.ppskit.utils.x.u(d10).longValue();
                f.f31542g0 = com.huawei.openalliance.ad.ppskit.utils.x.t(d10).longValue();
            }
            f.E = contentRecord.m0();
            o(f, httpConnection, str);
            ke keVar = new ke(context, zh.a(contentRecord.z0(), context), null);
            keVar.f31382b = contentRecord;
            keVar.t(contentRecord.h1(), f, false, true);
        } catch (Throwable th) {
            e0.i.p(th, "onAdResDownloadFailed:", "AnalysisReport");
        }
    }

    public final void k(String str, ContentRecord contentRecord, String str2, HttpConnection httpConnection) {
        try {
            if (contentRecord == null) {
                n7.g("AnalysisReport", "onAdResDownload, contentRecord is null");
                return;
            }
            this.f31723b = contentRecord.n1();
            o f = f(contentRecord);
            if (f == null) {
                return;
            }
            f.f31525a = "72";
            f.f31563r = str;
            f.D = str2;
            f.E = contentRecord.m0();
            o(f, httpConnection, str);
            Context context = this.f31722a;
            ke keVar = new ke(context, zh.a(contentRecord.z0(), context), null);
            keVar.f31382b = contentRecord;
            keVar.t(contentRecord.h1(), f, false, true);
        } catch (Throwable th) {
            e0.i.p(th, "onAdResDownload:", "AnalysisReport");
        }
    }

    public final void l(String str, Long l10, Long l11, Long l12, Long l13, boolean z10, ContentRecord contentRecord, String str2, long j10, HttpConnection httpConnection) {
        try {
            if (contentRecord == null) {
                n7.g("AnalysisReport", "onAdResDownloadSuccess, contentRecord is null");
                return;
            }
            this.f31723b = contentRecord.n1();
            o f = f(contentRecord);
            if (f == null) {
                return;
            }
            f.f31525a = "5";
            f.f31565s = "isCached:" + z10;
            f.f31563r = str;
            if (!TextUtils.isEmpty(str2)) {
                f.D = str2;
            }
            Context context = this.f31722a;
            if (l12 != null) {
                if (l10 != null) {
                    long longValue = l12.longValue() - l10.longValue();
                    n7.c("AnalysisReport", "onAdResDownloadSuccess - adReqToContentDownloadDuration: %d", Long.valueOf(longValue));
                    f.f31571v = String.valueOf(longValue);
                }
                if (l11 != null) {
                    long longValue2 = l12.longValue() - l11.longValue();
                    n7.c("AnalysisReport", "onAdResDownloadSuccess - contentDownloadDuration: %d", Long.valueOf(longValue2));
                    f.f31573w = String.valueOf(longValue2);
                    if (longValue2 > 0 && j10 > 0) {
                        long j11 = (((j10 * 100) * 1000) / longValue2) / 100;
                        f.f31529b0 = j11;
                        if (n7.d()) {
                            n7.c("AnalysisReport", "onAdResDownloadSuccess - total download time: %d(ms) total download size: %d(bytes) avg. speed: %d(bytes/s)", Long.valueOf(longValue2), Long.valueOf(j10), Long.valueOf(j11));
                        }
                        o7 a10 = o7.a();
                        Object[] objArr = {Long.valueOf(longValue2), Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(com.huawei.openalliance.ad.ppskit.utils.k1.f(context))};
                        if (a10.f31596a != null) {
                            a10.b("AnalysisReport", String.format(Locale.ENGLISH, "onAdResDownloadSuccess - total download time: %d(ms) total download size: %d(bytes) avg. speed: %d(bytes/s), network type: %d", objArr));
                        }
                    }
                }
                if (l13 != null && !z10) {
                    long longValue3 = l13.longValue() - l12.longValue();
                    if (n7.d()) {
                        n7.c("AnalysisReport", "onAdResDownloadSuccess - fileOperateDuration: %s", Long.valueOf(longValue3));
                    }
                    f.B = longValue3;
                }
            }
            f.f31532c0 = j10;
            String c10 = com.huawei.openalliance.ad.ppskit.utils.w1.c(context);
            if (!TextUtils.isEmpty(c10)) {
                f.f31535d0 = com.huawei.openalliance.ad.ppskit.utils.x.u(c10).longValue();
                f.f31538e0 = com.huawei.openalliance.ad.ppskit.utils.x.t(c10).longValue();
            }
            String d10 = com.huawei.openalliance.ad.ppskit.utils.w1.d(context);
            if (!TextUtils.isEmpty(d10)) {
                f.f31539f0 = com.huawei.openalliance.ad.ppskit.utils.x.u(d10).longValue();
                f.f31542g0 = com.huawei.openalliance.ad.ppskit.utils.x.t(d10).longValue();
            }
            f.E = contentRecord.m0();
            o(f, httpConnection, str);
            ke keVar = new ke(context, zh.a(contentRecord.z0(), context), null);
            keVar.f31382b = contentRecord;
            keVar.t(contentRecord.h1(), f, false, true);
        } catch (Throwable th) {
            e0.i.p(th, "onAdResDownloadSuccess:", "AnalysisReport");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d7, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a6 A[Catch: all -> 0x02bd, TryCatch #2 {all -> 0x02bd, blocks: (B:4:0x0018, B:6:0x001f, B:13:0x0043, B:14:0x0048, B:16:0x0052, B:19:0x005b, B:21:0x0068, B:27:0x0075, B:28:0x007b, B:31:0x0083, B:32:0x0086, B:37:0x00bd, B:39:0x00c1, B:42:0x00da, B:44:0x00e0, B:55:0x011c, B:57:0x0133, B:58:0x0137, B:60:0x013e, B:61:0x0197, B:64:0x01a5, B:66:0x01ab, B:69:0x01b7, B:72:0x01c3, B:74:0x01c9, B:82:0x01eb, B:83:0x01f1, B:86:0x0206, B:88:0x020c, B:91:0x0224, B:92:0x0220, B:93:0x0235, B:95:0x0246, B:97:0x0258, B:99:0x025e, B:100:0x0263, B:102:0x0269, B:103:0x0270, B:112:0x0286, B:106:0x0299, B:108:0x02a6, B:116:0x0277, B:119:0x01e3, B:121:0x01d9, B:123:0x01b3, B:124:0x02b8, B:128:0x0115, B:143:0x0098, B:145:0x00a0, B:147:0x00a6, B:149:0x00ac, B:157:0x0038, B:162:0x0046, B:164:0x0014, B:105:0x027c, B:130:0x00f4, B:138:0x010f, B:51:0x0112), top: B:163:0x0014, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0277 A[Catch: all -> 0x02bd, TRY_LEAVE, TryCatch #2 {all -> 0x02bd, blocks: (B:4:0x0018, B:6:0x001f, B:13:0x0043, B:14:0x0048, B:16:0x0052, B:19:0x005b, B:21:0x0068, B:27:0x0075, B:28:0x007b, B:31:0x0083, B:32:0x0086, B:37:0x00bd, B:39:0x00c1, B:42:0x00da, B:44:0x00e0, B:55:0x011c, B:57:0x0133, B:58:0x0137, B:60:0x013e, B:61:0x0197, B:64:0x01a5, B:66:0x01ab, B:69:0x01b7, B:72:0x01c3, B:74:0x01c9, B:82:0x01eb, B:83:0x01f1, B:86:0x0206, B:88:0x020c, B:91:0x0224, B:92:0x0220, B:93:0x0235, B:95:0x0246, B:97:0x0258, B:99:0x025e, B:100:0x0263, B:102:0x0269, B:103:0x0270, B:112:0x0286, B:106:0x0299, B:108:0x02a6, B:116:0x0277, B:119:0x01e3, B:121:0x01d9, B:123:0x01b3, B:124:0x02b8, B:128:0x0115, B:143:0x0098, B:145:0x00a0, B:147:0x00a6, B:149:0x00ac, B:157:0x0038, B:162:0x0046, B:164:0x0014, B:105:0x027c, B:130:0x00f4, B:138:0x010f, B:51:0x0112), top: B:163:0x0014, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b3 A[Catch: all -> 0x02bd, TryCatch #2 {all -> 0x02bd, blocks: (B:4:0x0018, B:6:0x001f, B:13:0x0043, B:14:0x0048, B:16:0x0052, B:19:0x005b, B:21:0x0068, B:27:0x0075, B:28:0x007b, B:31:0x0083, B:32:0x0086, B:37:0x00bd, B:39:0x00c1, B:42:0x00da, B:44:0x00e0, B:55:0x011c, B:57:0x0133, B:58:0x0137, B:60:0x013e, B:61:0x0197, B:64:0x01a5, B:66:0x01ab, B:69:0x01b7, B:72:0x01c3, B:74:0x01c9, B:82:0x01eb, B:83:0x01f1, B:86:0x0206, B:88:0x020c, B:91:0x0224, B:92:0x0220, B:93:0x0235, B:95:0x0246, B:97:0x0258, B:99:0x025e, B:100:0x0263, B:102:0x0269, B:103:0x0270, B:112:0x0286, B:106:0x0299, B:108:0x02a6, B:116:0x0277, B:119:0x01e3, B:121:0x01d9, B:123:0x01b3, B:124:0x02b8, B:128:0x0115, B:143:0x0098, B:145:0x00a0, B:147:0x00a6, B:149:0x00ac, B:157:0x0038, B:162:0x0046, B:164:0x0014, B:105:0x027c, B:130:0x00f4, B:138:0x010f, B:51:0x0112), top: B:163:0x0014, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0098 A[Catch: all -> 0x02bd, TryCatch #2 {all -> 0x02bd, blocks: (B:4:0x0018, B:6:0x001f, B:13:0x0043, B:14:0x0048, B:16:0x0052, B:19:0x005b, B:21:0x0068, B:27:0x0075, B:28:0x007b, B:31:0x0083, B:32:0x0086, B:37:0x00bd, B:39:0x00c1, B:42:0x00da, B:44:0x00e0, B:55:0x011c, B:57:0x0133, B:58:0x0137, B:60:0x013e, B:61:0x0197, B:64:0x01a5, B:66:0x01ab, B:69:0x01b7, B:72:0x01c3, B:74:0x01c9, B:82:0x01eb, B:83:0x01f1, B:86:0x0206, B:88:0x020c, B:91:0x0224, B:92:0x0220, B:93:0x0235, B:95:0x0246, B:97:0x0258, B:99:0x025e, B:100:0x0263, B:102:0x0269, B:103:0x0270, B:112:0x0286, B:106:0x0299, B:108:0x02a6, B:116:0x0277, B:119:0x01e3, B:121:0x01d9, B:123:0x01b3, B:124:0x02b8, B:128:0x0115, B:143:0x0098, B:145:0x00a0, B:147:0x00a6, B:149:0x00ac, B:157:0x0038, B:162:0x0046, B:164:0x0014, B:105:0x027c, B:130:0x00f4, B:138:0x010f, B:51:0x0112), top: B:163:0x0014, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075 A[Catch: all -> 0x02bd, TryCatch #2 {all -> 0x02bd, blocks: (B:4:0x0018, B:6:0x001f, B:13:0x0043, B:14:0x0048, B:16:0x0052, B:19:0x005b, B:21:0x0068, B:27:0x0075, B:28:0x007b, B:31:0x0083, B:32:0x0086, B:37:0x00bd, B:39:0x00c1, B:42:0x00da, B:44:0x00e0, B:55:0x011c, B:57:0x0133, B:58:0x0137, B:60:0x013e, B:61:0x0197, B:64:0x01a5, B:66:0x01ab, B:69:0x01b7, B:72:0x01c3, B:74:0x01c9, B:82:0x01eb, B:83:0x01f1, B:86:0x0206, B:88:0x020c, B:91:0x0224, B:92:0x0220, B:93:0x0235, B:95:0x0246, B:97:0x0258, B:99:0x025e, B:100:0x0263, B:102:0x0269, B:103:0x0270, B:112:0x0286, B:106:0x0299, B:108:0x02a6, B:116:0x0277, B:119:0x01e3, B:121:0x01d9, B:123:0x01b3, B:124:0x02b8, B:128:0x0115, B:143:0x0098, B:145:0x00a0, B:147:0x00a6, B:149:0x00ac, B:157:0x0038, B:162:0x0046, B:164:0x0014, B:105:0x027c, B:130:0x00f4, B:138:0x010f, B:51:0x0112), top: B:163:0x0014, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1 A[Catch: all -> 0x02bd, TryCatch #2 {all -> 0x02bd, blocks: (B:4:0x0018, B:6:0x001f, B:13:0x0043, B:14:0x0048, B:16:0x0052, B:19:0x005b, B:21:0x0068, B:27:0x0075, B:28:0x007b, B:31:0x0083, B:32:0x0086, B:37:0x00bd, B:39:0x00c1, B:42:0x00da, B:44:0x00e0, B:55:0x011c, B:57:0x0133, B:58:0x0137, B:60:0x013e, B:61:0x0197, B:64:0x01a5, B:66:0x01ab, B:69:0x01b7, B:72:0x01c3, B:74:0x01c9, B:82:0x01eb, B:83:0x01f1, B:86:0x0206, B:88:0x020c, B:91:0x0224, B:92:0x0220, B:93:0x0235, B:95:0x0246, B:97:0x0258, B:99:0x025e, B:100:0x0263, B:102:0x0269, B:103:0x0270, B:112:0x0286, B:106:0x0299, B:108:0x02a6, B:116:0x0277, B:119:0x01e3, B:121:0x01d9, B:123:0x01b3, B:124:0x02b8, B:128:0x0115, B:143:0x0098, B:145:0x00a0, B:147:0x00a6, B:149:0x00ac, B:157:0x0038, B:162:0x0046, B:164:0x0014, B:105:0x027c, B:130:0x00f4, B:138:0x010f, B:51:0x0112), top: B:163:0x0014, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011c A[Catch: all -> 0x02bd, TryCatch #2 {all -> 0x02bd, blocks: (B:4:0x0018, B:6:0x001f, B:13:0x0043, B:14:0x0048, B:16:0x0052, B:19:0x005b, B:21:0x0068, B:27:0x0075, B:28:0x007b, B:31:0x0083, B:32:0x0086, B:37:0x00bd, B:39:0x00c1, B:42:0x00da, B:44:0x00e0, B:55:0x011c, B:57:0x0133, B:58:0x0137, B:60:0x013e, B:61:0x0197, B:64:0x01a5, B:66:0x01ab, B:69:0x01b7, B:72:0x01c3, B:74:0x01c9, B:82:0x01eb, B:83:0x01f1, B:86:0x0206, B:88:0x020c, B:91:0x0224, B:92:0x0220, B:93:0x0235, B:95:0x0246, B:97:0x0258, B:99:0x025e, B:100:0x0263, B:102:0x0269, B:103:0x0270, B:112:0x0286, B:106:0x0299, B:108:0x02a6, B:116:0x0277, B:119:0x01e3, B:121:0x01d9, B:123:0x01b3, B:124:0x02b8, B:128:0x0115, B:143:0x0098, B:145:0x00a0, B:147:0x00a6, B:149:0x00ac, B:157:0x0038, B:162:0x0046, B:164:0x0014, B:105:0x027c, B:130:0x00f4, B:138:0x010f, B:51:0x0112), top: B:163:0x0014, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0133 A[Catch: all -> 0x02bd, TryCatch #2 {all -> 0x02bd, blocks: (B:4:0x0018, B:6:0x001f, B:13:0x0043, B:14:0x0048, B:16:0x0052, B:19:0x005b, B:21:0x0068, B:27:0x0075, B:28:0x007b, B:31:0x0083, B:32:0x0086, B:37:0x00bd, B:39:0x00c1, B:42:0x00da, B:44:0x00e0, B:55:0x011c, B:57:0x0133, B:58:0x0137, B:60:0x013e, B:61:0x0197, B:64:0x01a5, B:66:0x01ab, B:69:0x01b7, B:72:0x01c3, B:74:0x01c9, B:82:0x01eb, B:83:0x01f1, B:86:0x0206, B:88:0x020c, B:91:0x0224, B:92:0x0220, B:93:0x0235, B:95:0x0246, B:97:0x0258, B:99:0x025e, B:100:0x0263, B:102:0x0269, B:103:0x0270, B:112:0x0286, B:106:0x0299, B:108:0x02a6, B:116:0x0277, B:119:0x01e3, B:121:0x01d9, B:123:0x01b3, B:124:0x02b8, B:128:0x0115, B:143:0x0098, B:145:0x00a0, B:147:0x00a6, B:149:0x00ac, B:157:0x0038, B:162:0x0046, B:164:0x0014, B:105:0x027c, B:130:0x00f4, B:138:0x010f, B:51:0x0112), top: B:163:0x0014, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013e A[Catch: all -> 0x02bd, TryCatch #2 {all -> 0x02bd, blocks: (B:4:0x0018, B:6:0x001f, B:13:0x0043, B:14:0x0048, B:16:0x0052, B:19:0x005b, B:21:0x0068, B:27:0x0075, B:28:0x007b, B:31:0x0083, B:32:0x0086, B:37:0x00bd, B:39:0x00c1, B:42:0x00da, B:44:0x00e0, B:55:0x011c, B:57:0x0133, B:58:0x0137, B:60:0x013e, B:61:0x0197, B:64:0x01a5, B:66:0x01ab, B:69:0x01b7, B:72:0x01c3, B:74:0x01c9, B:82:0x01eb, B:83:0x01f1, B:86:0x0206, B:88:0x020c, B:91:0x0224, B:92:0x0220, B:93:0x0235, B:95:0x0246, B:97:0x0258, B:99:0x025e, B:100:0x0263, B:102:0x0269, B:103:0x0270, B:112:0x0286, B:106:0x0299, B:108:0x02a6, B:116:0x0277, B:119:0x01e3, B:121:0x01d9, B:123:0x01b3, B:124:0x02b8, B:128:0x0115, B:143:0x0098, B:145:0x00a0, B:147:0x00a6, B:149:0x00ac, B:157:0x0038, B:162:0x0046, B:164:0x0014, B:105:0x027c, B:130:0x00f4, B:138:0x010f, B:51:0x0112), top: B:163:0x0014, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01eb A[Catch: all -> 0x02bd, TryCatch #2 {all -> 0x02bd, blocks: (B:4:0x0018, B:6:0x001f, B:13:0x0043, B:14:0x0048, B:16:0x0052, B:19:0x005b, B:21:0x0068, B:27:0x0075, B:28:0x007b, B:31:0x0083, B:32:0x0086, B:37:0x00bd, B:39:0x00c1, B:42:0x00da, B:44:0x00e0, B:55:0x011c, B:57:0x0133, B:58:0x0137, B:60:0x013e, B:61:0x0197, B:64:0x01a5, B:66:0x01ab, B:69:0x01b7, B:72:0x01c3, B:74:0x01c9, B:82:0x01eb, B:83:0x01f1, B:86:0x0206, B:88:0x020c, B:91:0x0224, B:92:0x0220, B:93:0x0235, B:95:0x0246, B:97:0x0258, B:99:0x025e, B:100:0x0263, B:102:0x0269, B:103:0x0270, B:112:0x0286, B:106:0x0299, B:108:0x02a6, B:116:0x0277, B:119:0x01e3, B:121:0x01d9, B:123:0x01b3, B:124:0x02b8, B:128:0x0115, B:143:0x0098, B:145:0x00a0, B:147:0x00a6, B:149:0x00ac, B:157:0x0038, B:162:0x0046, B:164:0x0014, B:105:0x027c, B:130:0x00f4, B:138:0x010f, B:51:0x0112), top: B:163:0x0014, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0220 A[Catch: all -> 0x02bd, TryCatch #2 {all -> 0x02bd, blocks: (B:4:0x0018, B:6:0x001f, B:13:0x0043, B:14:0x0048, B:16:0x0052, B:19:0x005b, B:21:0x0068, B:27:0x0075, B:28:0x007b, B:31:0x0083, B:32:0x0086, B:37:0x00bd, B:39:0x00c1, B:42:0x00da, B:44:0x00e0, B:55:0x011c, B:57:0x0133, B:58:0x0137, B:60:0x013e, B:61:0x0197, B:64:0x01a5, B:66:0x01ab, B:69:0x01b7, B:72:0x01c3, B:74:0x01c9, B:82:0x01eb, B:83:0x01f1, B:86:0x0206, B:88:0x020c, B:91:0x0224, B:92:0x0220, B:93:0x0235, B:95:0x0246, B:97:0x0258, B:99:0x025e, B:100:0x0263, B:102:0x0269, B:103:0x0270, B:112:0x0286, B:106:0x0299, B:108:0x02a6, B:116:0x0277, B:119:0x01e3, B:121:0x01d9, B:123:0x01b3, B:124:0x02b8, B:128:0x0115, B:143:0x0098, B:145:0x00a0, B:147:0x00a6, B:149:0x00ac, B:157:0x0038, B:162:0x0046, B:164:0x0014, B:105:0x027c, B:130:0x00f4, B:138:0x010f, B:51:0x0112), top: B:163:0x0014, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0246 A[Catch: all -> 0x02bd, TryCatch #2 {all -> 0x02bd, blocks: (B:4:0x0018, B:6:0x001f, B:13:0x0043, B:14:0x0048, B:16:0x0052, B:19:0x005b, B:21:0x0068, B:27:0x0075, B:28:0x007b, B:31:0x0083, B:32:0x0086, B:37:0x00bd, B:39:0x00c1, B:42:0x00da, B:44:0x00e0, B:55:0x011c, B:57:0x0133, B:58:0x0137, B:60:0x013e, B:61:0x0197, B:64:0x01a5, B:66:0x01ab, B:69:0x01b7, B:72:0x01c3, B:74:0x01c9, B:82:0x01eb, B:83:0x01f1, B:86:0x0206, B:88:0x020c, B:91:0x0224, B:92:0x0220, B:93:0x0235, B:95:0x0246, B:97:0x0258, B:99:0x025e, B:100:0x0263, B:102:0x0269, B:103:0x0270, B:112:0x0286, B:106:0x0299, B:108:0x02a6, B:116:0x0277, B:119:0x01e3, B:121:0x01d9, B:123:0x01b3, B:124:0x02b8, B:128:0x0115, B:143:0x0098, B:145:0x00a0, B:147:0x00a6, B:149:0x00ac, B:157:0x0038, B:162:0x0046, B:164:0x0014, B:105:0x027c, B:130:0x00f4, B:138:0x010f, B:51:0x0112), top: B:163:0x0014, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(java.lang.String r19, java.lang.String r20, int r21, long r22, com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam r24, com.huawei.openalliance.ad.ppskit.net.http.Response r25, java.lang.String r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.u.m(java.lang.String, java.lang.String, int, long, com.huawei.openalliance.ad.ppskit.beans.parameter.AdSlotParam, com.huawei.openalliance.ad.ppskit.net.http.Response, java.lang.String, boolean):void");
    }

    public final void n(String str, String str2, String str3, String str4, int i10, int i11, String str5) {
        try {
            o c10 = c(str, true);
            if (c10 == null) {
                return;
            }
            c10.f31525a = "81";
            c10.f31559p = str3;
            c10.f31567t = str2;
            c10.b(i10);
            c10.L = i11;
            c10.D = str4;
            c10.f31565s = str5;
            Context context = this.f31722a;
            new ke(context, zh.a(i10, context), null).p(c10.f31552l, c10, false, false);
        } catch (Throwable th) {
            e0.i.p(th, "onInnerError:", "AnalysisReport");
        }
    }

    public final void q(o oVar, Double d10, Double d11, int i10, String str) {
        Address w10;
        boolean z10;
        Context context = this.f31722a;
        boolean z11 = false;
        if (context != null) {
            com.huawei.openalliance.ad.ppskit.handlers.l d12 = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
            synchronized (d12.f22585a) {
                Map<String, String> K = d12.K(str, false);
                if (!a0.a.e0(K)) {
                    String str2 = K.get("clctAddressSwitch");
                    if (TextUtils.equals(str2, "1")) {
                        z10 = true;
                    } else {
                        TextUtils.equals(str2, "0");
                    }
                }
                z10 = false;
            }
            if (!z10) {
                n7.e("GeoLocationUtil", "collect geoinfo switch off");
            } else {
                z11 = true;
            }
        }
        if (!z11 || d10 == null || d11 == null || (w10 = a0.a.w(this.f31722a, d10.doubleValue(), d11.doubleValue(), Locale.getDefault())) == null) {
            return;
        }
        GeoLocation geoLocation = new GeoLocation();
        geoLocation.c(d10);
        geoLocation.d(d11);
        geoLocation.e(Long.valueOf(System.currentTimeMillis()));
        geoLocation.a(i10);
        com.huawei.openalliance.ad.ppskit.beans.metadata.Address address = new com.huawei.openalliance.ad.ppskit.beans.metadata.Address();
        address.a(w10.getCountryCode());
        address.b(com.huawei.openalliance.ad.ppskit.utils.y1.n(w10.getAdminArea()));
        address.c(com.huawei.openalliance.ad.ppskit.utils.y1.n(w10.getLocality()));
        address.d(com.huawei.openalliance.ad.ppskit.utils.y1.n(w10.getSubLocality()));
        address.e(com.huawei.openalliance.ad.ppskit.utils.y1.n(w10.getSubAdminArea()));
        address.f(com.huawei.openalliance.ad.ppskit.utils.y1.n(w10.getThoroughfare()));
        address.g(com.huawei.openalliance.ad.ppskit.utils.y1.n(w10.getSubThoroughfare()));
        address.h(com.huawei.openalliance.ad.ppskit.utils.y1.n(w10.getFeatureName()));
        address.i(w10.getLocale().toString());
        geoLocation.b(address);
        oVar.f31530b1 = com.huawei.openalliance.ad.ppskit.utils.y0.q(null, geoLocation);
    }

    public final void r(o oVar, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(this.f31722a);
        synchronized (d10.f22585a) {
            z10 = d10.f22601s;
            Map<String, String> K = d10.K(str, false);
            if (K != null && K.get("clctDyncData") != null) {
                if (TextUtils.equals("0", K.get("clctDyncData"))) {
                    z10 = false;
                } else if (TextUtils.equals("1", K.get("clctDyncData"))) {
                    z10 = true;
                }
            }
        }
        if (!z10) {
            n7.e("AnalysisReport", "clctDyncData is off");
            return;
        }
        long v3 = d10.v(str);
        n7.c("AnalysisReport", "DyncData interval is %s", Long.valueOf(v3));
        oVar.f31570u0 = String.valueOf(com.huawei.openalliance.ad.ppskit.utils.m.x(this.f31722a, v3));
        if (d10.I(5, str) && !com.huawei.openalliance.ad.ppskit.utils.m.Z(this.f31722a)) {
            Context context = this.f31722a;
            com.huawei.openalliance.ad.ppskit.utils.q1 m10 = com.huawei.openalliance.ad.ppskit.utils.q1.m(context);
            String a10 = m10.a();
            if (TextUtils.isEmpty(a10)) {
                a10 = com.huawei.openalliance.ad.ppskit.utils.m.Y(context, m10);
            } else if (com.huawei.openalliance.ad.ppskit.utils.c2.b("getGyro", v3)) {
                com.huawei.openalliance.ad.ppskit.utils.p2.g(new com.huawei.openalliance.ad.ppskit.utils.r(context, m10));
            }
            String str2 = null;
            if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, a10)) {
                a10 = null;
            }
            oVar.y0 = a10;
            oVar.f31578z0 = com.huawei.openalliance.ad.ppskit.utils.m.E(this.f31722a, v3);
            Context context2 = this.f31722a;
            com.huawei.openalliance.ad.ppskit.utils.q1 m11 = com.huawei.openalliance.ad.ppskit.utils.q1.m(context2);
            String b10 = m11.b();
            if (TextUtils.isEmpty(b10)) {
                b10 = com.huawei.openalliance.ad.ppskit.utils.m.c(context2, m11);
            } else if (com.huawei.openalliance.ad.ppskit.utils.c2.b("getMagnet", v3)) {
                com.huawei.openalliance.ad.ppskit.utils.p2.g(new com.huawei.openalliance.ad.ppskit.utils.s(context2, m11));
            }
            if (TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, b10)) {
                b10 = null;
            }
            oVar.A0 = b10;
            Context context3 = this.f31722a;
            com.huawei.openalliance.ad.ppskit.utils.q1 m12 = com.huawei.openalliance.ad.ppskit.utils.q1.m(context3);
            String c10 = m12.c();
            if (TextUtils.isEmpty(c10)) {
                c10 = com.huawei.openalliance.ad.ppskit.utils.m.d(context3, m12);
            } else if (com.huawei.openalliance.ad.ppskit.utils.c2.b("getBaro", v3)) {
                com.huawei.openalliance.ad.ppskit.utils.p2.g(new com.huawei.openalliance.ad.ppskit.utils.t(context3, m12));
            }
            if (!TextUtils.equals(com.huawei.openalliance.ad.constant.w.aU, c10)) {
                str2 = c10;
            }
            oVar.B0 = str2;
        }
        if (d10.I(6, str)) {
            oVar.C0 = com.huawei.openalliance.ad.ppskit.utils.m.H(this.f31722a, v3);
            oVar.D0 = com.huawei.openalliance.ad.ppskit.utils.m.J(this.f31722a, v3);
            Context context4 = this.f31722a;
            com.huawei.openalliance.ad.ppskit.utils.q1 m13 = com.huawei.openalliance.ad.ppskit.utils.q1.m(context4);
            if (m13.i() == null) {
                z11 = com.huawei.openalliance.ad.ppskit.utils.m.i(m13);
            } else {
                boolean booleanValue = m13.i().booleanValue();
                if (com.huawei.openalliance.ad.ppskit.utils.c2.b("getProxy", v3)) {
                    com.huawei.openalliance.ad.ppskit.utils.p2.g(new com.huawei.openalliance.ad.ppskit.utils.k(context4, m13));
                }
                z11 = booleanValue;
            }
            oVar.f31533c1 = Boolean.valueOf(z11);
            Context context5 = this.f31722a;
            com.huawei.openalliance.ad.ppskit.utils.q1 m14 = com.huawei.openalliance.ad.ppskit.utils.q1.m(context5);
            if (m14.j() == null) {
                z12 = com.huawei.openalliance.ad.ppskit.utils.m.j(context5, m14);
            } else {
                boolean booleanValue2 = m14.j().booleanValue();
                if (com.huawei.openalliance.ad.ppskit.utils.c2.b("getDebug", v3)) {
                    com.huawei.openalliance.ad.ppskit.utils.p2.g(new com.huawei.openalliance.ad.ppskit.utils.l(context5, m14));
                }
                z12 = booleanValue2;
            }
            oVar.f31536d1 = Boolean.valueOf(z12);
            Context context6 = this.f31722a;
            com.huawei.openalliance.ad.ppskit.utils.q1 m15 = com.huawei.openalliance.ad.ppskit.utils.q1.m(context6);
            if (m15.k() == null) {
                z13 = com.huawei.openalliance.ad.ppskit.utils.m.k(context6, m15);
            } else {
                boolean booleanValue3 = m15.k().booleanValue();
                if (com.huawei.openalliance.ad.ppskit.utils.c2.b("getUSB", v3)) {
                    com.huawei.openalliance.ad.ppskit.utils.p2.g(new com.huawei.openalliance.ad.ppskit.utils.n(context6, m15));
                }
                z13 = booleanValue3;
            }
            oVar.e1 = Boolean.valueOf(z13);
            Context context7 = this.f31722a;
            com.huawei.openalliance.ad.ppskit.utils.q1 m16 = com.huawei.openalliance.ad.ppskit.utils.q1.m(context7);
            if (m16.l() == null) {
                z14 = com.huawei.openalliance.ad.ppskit.utils.m.t(context7, m16, str);
            } else {
                boolean booleanValue4 = m16.l().booleanValue();
                if (com.huawei.openalliance.ad.ppskit.utils.c2.b("getEmulator", v3)) {
                    com.huawei.openalliance.ad.ppskit.utils.p2.g(new com.huawei.openalliance.ad.ppskit.utils.o(context7, m16, str));
                }
                z14 = booleanValue4;
            }
            oVar.f31540f1 = Boolean.valueOf(z14);
        }
    }

    public final void s(o oVar, String str) {
        boolean z10;
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(this.f31722a);
        synchronized (d10.f22585a) {
            z10 = d10.f22601s;
            Map<String, String> K = d10.K(str, false);
            if (K != null && K.get("clctStatData") != null) {
                if (TextUtils.equals("0", K.get("clctStatData"))) {
                    z10 = false;
                } else if (TextUtils.equals("1", K.get("clctStatData"))) {
                    z10 = true;
                }
            }
        }
        if (!z10) {
            n7.e("AnalysisReport", "clctStatData is off");
            return;
        }
        long v3 = d10.v(str);
        n7.c("AnalysisReport", "StatData interval is %s", Long.valueOf(v3));
        oVar.f31557n0 = com.huawei.openalliance.ad.ppskit.utils.y1.y(com.huawei.openalliance.ad.ppskit.utils.m.v(this.f31722a, v3));
        oVar.f31558o0 = com.huawei.openalliance.ad.ppskit.utils.m.N(this.f31722a);
        oVar.f31560p0 = com.huawei.openalliance.ad.ppskit.utils.m.O(this.f31722a);
        oVar.f31562q0 = com.huawei.openalliance.ad.ppskit.utils.m.P(this.f31722a);
        oVar.f31566s0 = String.valueOf(com.huawei.openalliance.ad.ppskit.utils.m.w(this.f31722a, v3));
        oVar.f31568t0 = String.valueOf(com.huawei.openalliance.ad.ppskit.utils.m.R(this.f31722a));
        oVar.f31572v0 = com.huawei.openalliance.ad.ppskit.utils.m.T(this.f31722a);
        oVar.f31574w0 = com.huawei.openalliance.ad.ppskit.utils.m.V(this.f31722a);
    }

    public final void t(o oVar, String str) {
        boolean z10;
        String str2;
        String str3;
        com.huawei.openalliance.ad.ppskit.handlers.l d10 = com.huawei.openalliance.ad.ppskit.handlers.l.d(this.f31722a);
        synchronized (d10.f22585a) {
            z10 = d10.f22601s;
            Map<String, String> K = d10.K(str, false);
            if (K != null && K.get("clctWifi") != null) {
                if (TextUtils.equals("0", K.get("clctWifi"))) {
                    z10 = false;
                } else if (TextUtils.equals("1", K.get("clctWifi"))) {
                    z10 = true;
                }
            }
        }
        if (!z10) {
            str2 = "AnalysisReport";
            str3 = "clctWifi is off";
        } else if (!d10.I(3, str)) {
            str2 = "AnalysisReport";
            str3 = "mediaColWifiSwitch is off";
        } else {
            oVar.f31555m0 = com.huawei.openalliance.ad.ppskit.utils.y1.y(com.huawei.openalliance.ad.ppskit.utils.m.n(this.f31722a, d10.v(str)));
            return;
        }
        n7.e(str2, str3);
    }
}
