package a3;

import androidx.recyclerview.widget.RecyclerView;
import com.applovin.mediation.MaxAdListener;
import com.esotericsoftware.kryo.KryoException;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.measurement.internal.zzgd;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k {
    public static /* synthetic */ String A(int i10) {
        if (i10 == 1) {
            return "INITIALIZE";
        }
        if (i10 == 2) {
            return "SWITCH_TO_SOURCE_SERVICE";
        }
        if (i10 == 3) {
            return "DECODE_DATA";
        }
        return "null";
    }

    public static /* synthetic */ String B(int i10) {
        if (i10 == 1) {
            return "OK";
        }
        if (i10 == 2) {
            return "TRANSIENT_ERROR";
        }
        if (i10 == 3) {
            return "FATAL_ERROR";
        }
        if (i10 == 4) {
            return "INVALID_PAYLOAD";
        }
        return "null";
    }

    public static /* synthetic */ String C(int i10) {
        if (i10 == 1) {
            return "NONE";
        }
        if (i10 == 2) {
            return "ADDING";
        }
        if (i10 == 3) {
            return "REMOVING";
        }
        return "null";
    }

    public static /* synthetic */ String D(int i10) {
        if (i10 == 1) {
            return "TIME_SINCE_LAST_IN_APP";
        }
        if (i10 == 2) {
            return "SESSION_TIME";
        }
        if (i10 == 3) {
            return "CUSTOM";
        }
        if (i10 == 4) {
            return "UNKNOWN";
        }
        return "null";
    }

    public static /* synthetic */ String E(int i10) {
        if (i10 == 1) {
            return "TOP_BANNER";
        }
        if (i10 == 2) {
            return "BOTTOM_BANNER";
        }
        if (i10 == 3) {
            return "CENTER_MODAL";
        }
        if (i10 == 4) {
            return "FULL_SCREEN";
        }
        return "null";
    }

    public static /* synthetic */ int F(String str) {
        if (str != null) {
            if (str.equals("TOP_BANNER")) {
                return 1;
            }
            if (str.equals("BOTTOM_BANNER")) {
                return 2;
            }
            if (str.equals("CENTER_MODAL")) {
                return 3;
            }
            if (str.equals("FULL_SCREEN")) {
                return 4;
            }
            throw new IllegalArgumentException("No enum constant com.onesignal.WebViewManager.Position.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }

    public static /* synthetic */ String a(int i10) {
        if (i10 == 1 || i10 == 2) {
            return "_id = ?";
        }
        if (i10 == 3 || i10 == 4) {
            return "time < ? and adType = ?";
        }
        if (i10 == 5) {
            return "_id = ?";
        }
        if (i10 == 6) {
            return "appPkgName=? and contentId=?";
        }
        if (i10 == 7) {
            return "appPkgName=? and contentId=? and slotId=?";
        }
        if (i10 == 8) {
            return "appPkgName=? and contentId=? and uniqueId=?";
        }
        if (i10 == 9) {
            return "appPkgName=? ";
        }
        if (i10 == 10) {
            return "contentId=?";
        }
        if (i10 == 11) {
            return "adType=?";
        }
        if (i10 == 12) {
            return "appPkgName=? and displayDate <> ?";
        }
        if (i10 == 13) {
            return "appPkgName=? and (creativeType == 12 or width <= height) and startTime <= ? and endTime >= ? and slotId = ? and lastShowTime < ? and fcCtrlDate <> ? and splashPreContentFlag <> 0 and adType=?";
        }
        if (i10 == 14) {
            return "appPkgName=? and (creativeType != 12 and width > height) and startTime <= ? and endTime >= ? and slotId = ? and lastShowTime < ? and fcCtrlDate <> ? and splashPreContentFlag <> 0 and adType=?";
        }
        if (i10 == 15) {
            return "appPkgName=? and dispTime <= ? and endTime >= ? and slotId = ? and adType=?";
        }
        if (i10 == 16) {
            return "appPkgName=? and endTime >= ? and slotId = ? and adType=?";
        }
        if (i10 == 17) {
            return "appPkgName=? and (creativeType == 12 or width <= height) and contentId = ? and slotId = ? and startTime <= ? and endTime >= ? and splashPreContentFlag <> 0";
        }
        if (i10 == 18) {
            return "appPkgName=? and (creativeType != 12 and width > height) and contentId = ? and slotId = ? and startTime <= ? and endTime >= ? and splashPreContentFlag <> 0";
        }
        if (i10 == 19) {
            return "endTime < ? and splashPreContentFlag <> ?";
        }
        if (i10 == 20) {
            return "endTime < ? or (invalidtime < ? and invalidtime <> 0 )";
        }
        if (i10 == 21) {
            return "appPkgName=? and adType = ?";
        }
        if (i10 == 22) {
            return "appPkgName=?";
        }
        if (i10 == 23) {
            return "appPkgName=? and taskId = ?";
        }
        if (i10 == 24) {
            return "requestId=? and slotId = ?";
        }
        if (i10 == 25) {
            return "lockTime < ?";
        }
        if (i10 == 26 || i10 == 27) {
            return "_id = ?";
        }
        if (i10 == 28) {
            return "templateId = ?";
        }
        if (i10 == 29) {
            return "appPkgName=? and timeStamp >= ? and timeStamp < ?";
        }
        if (i10 == 30) {
            return "timeStamp < ?";
        }
        if (i10 == 31) {
            return "adType = ?";
        }
        if (i10 == 32) {
            return "appPkgName=? and adType = ? and slotId = ?";
        }
        if (i10 == 33) {
            return "appPkgName=? and adType = ? and slotId = ? and xRInfoList != ? and xRInfoList != ?";
        }
        if (i10 == 34) {
            return "appPkgName=? and adType = ? and slotId = ? and invalidtime = ? and startTime < ? and endTime > ? and ((filterduplicate= 1 and displayCount = 0 ) or filterduplicate = 0 or filterduplicate =2)";
        }
        if (i10 == 35) {
            return "appPkgName=? and adType = ? and slotId = ? and invalidtime = ? and startTime < ? and endTime > ? and (filterduplicate = 2 or filterduplicate = 0 ) and updateTime >= ?";
        }
        if (i10 == 36) {
            return "appPkgName=? and adType = ? and slotId = ? and invalidtime = ? and startTime < ? and endTime > ? and filterduplicate = 1 and displayCount = 0 and updateTime >= ?";
        }
        if (i10 == 37) {
            return "packageName = ?";
        }
        if (i10 == 38) {
            return "deleted = ?";
        }
        if (i10 == 39) {
            return "fileName = ? and cacheType = ?";
        }
        if (i10 == 40) {
            return "cacheType = ?";
        }
        if (i10 == 41) {
            return "contentId = ?";
        }
        if (i10 == 42) {
            return "fileName = ? and contentId = ? and cacheType = ?";
        }
        if (i10 == 43) {
            return "eventId = ?";
        }
        if (i10 == 44) {
            return "addTime < ? and adType = ?";
        }
        if (i10 == 45) {
            return "appPkgName = ?";
        }
        if (i10 == 46) {
            return "appPkgName=? and adType = ? and updateTime < ?";
        }
        if (i10 == 47) {
            return "eventId = ?";
        }
        if (i10 == 48) {
            return "type= ? ";
        }
        if (i10 == 49) {
            return "time < ?";
        }
        if (i10 == 50) {
            return "slotId = ? and templateId = ?";
        }
        if (i10 == 51) {
            return "appPkg = ? and templateId = ?";
        }
        if (i10 == 52) {
            return "slotId = ? and tmpType <> 1";
        }
        if (i10 == 53) {
            return "slotId = ? and tmpType = 1";
        }
        if (i10 == 54) {
            return "appPkg = ?";
        }
        if (i10 == 55) {
            return "appPkg = ? and tmpType = 1";
        }
        if (i10 == 56) {
            return "appPkgName = ? and contentId = ? and templateId = ? and slotId = ? ";
        }
        if (i10 == 57) {
            return "appPkgName = ? and contentId = ? and templateId = ? ";
        }
        if (i10 == 58) {
            return "contentId =? ";
        }
        if (i10 == 59) {
            return "appPkgName = ?  and slotId = ?";
        }
        if (i10 == 60) {
            return "appPkgName = ?  and contentId = ? and templateId = ? and slotId = ? and startTime <= ? and endTime >= ? and splashPreContentFlag <> 0";
        }
        if (i10 == 61) {
            return "appPkgName = ?  and width <= height and startTime <= ? and endTime >= ? and slotId = ? and lastShowTime < ? and fcCtrlDate <> ?";
        }
        if (i10 == 62) {
            return "appPkgName = ?  and width > height and startTime <= ? and endTime >= ? and slotId = ? and lastShowTime < ? and fcCtrlDate <> ?";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i10) {
        if (i10 == 1) {
            return "data";
        }
        if (i10 == 2) {
            return "https";
        }
        if (i10 == 3) {
            return "http";
        }
        throw null;
    }

    public static /* synthetic */ String c(int i10) {
        if (i10 == 1) {
            return "min_time_since";
        }
        if (i10 == 2) {
            return "session_time";
        }
        if (i10 == 3) {
            return "custom";
        }
        if (i10 == 4) {
            return "unknown";
        }
        throw null;
    }

    public static float d(float f, float f10, float f11, float f12) {
        return ((f - f10) * f11) + f12;
    }

    public static com.anythink.core.c.b e() {
        return com.anythink.core.c.b.a(com.anythink.core.common.b.n.a().g());
    }

    public static com.anythink.expressad.foundation.g.d.b f() {
        return com.anythink.expressad.foundation.g.d.b.a(com.anythink.core.common.b.n.a().g());
    }

    public static com.applovin.impl.sdk.c.b g(TimeUnit timeUnit, long j10, String str) {
        return com.applovin.impl.sdk.c.b.a(str, Long.valueOf(timeUnit.toMillis(j10)));
    }

    public static Object h(zzbl zzblVar, int i10, List list, int i11) {
        zzh.zzh(zzblVar.name(), i10, list);
        return list.get(i11);
    }

    public static String i(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.exceptionLabel());
        return sb2.toString();
    }

    public static String j(String str, int i10, String str2, int i11) {
        return str + i10 + str2 + i11;
    }

    public static String k(String str, long j10) {
        return str + j10;
    }

    public static String l(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String m(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static StringBuilder n(String str, int i10, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder o(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static void p(int i10, HashMap hashMap, String str, int i11, String str2, int i12, String str3, int i13, String str4) {
        hashMap.put(str, Integer.valueOf(i10));
        hashMap.put(str2, Integer.valueOf(i11));
        hashMap.put(str3, Integer.valueOf(i12));
        hashMap.put(str4, Integer.valueOf(i13));
    }

    public static void q(zzgd zzgdVar, String str) {
        zzgdVar.zzaA().zzk().zza(str);
    }

    public static void r(Class cls, StringBuilder sb2, String str, KryoException kryoException) {
        sb2.append(cls.getName());
        sb2.append(str);
        kryoException.addTrace(sb2.toString());
    }

    public static void s(String str, int i10, String str2) {
        d6.p.f(str2, str + i10);
    }

    public static void t(String str, String str2, com.applovin.impl.sdk.y yVar, String str3) {
        yVar.b(str3, str + str2);
    }

    public static void u(StringBuilder sb2, MaxAdListener maxAdListener, com.applovin.impl.sdk.y yVar, String str) {
        sb2.append(maxAdListener);
        yVar.b(str, sb2.toString());
    }

    public static void v(StringBuilder sb2, String str, IronLog ironLog) {
        sb2.append(str);
        ironLog.verbose(sb2.toString());
    }

    public static void w(Throwable th, String str, String str2) {
        com.anythink.expressad.foundation.h.o.d(str2, str.concat(String.valueOf(th)));
    }

    public static void x(AtomicInteger atomicInteger, StringBuilder sb2, String str) {
        sb2.append(atomicInteger.get());
        sb2.append(str);
    }

    public static void y(String str, int i10, String str2) {
        com.applovin.exoplayer2.l.q.c(str2, str + i10);
    }

    public static /* synthetic */ String z(int i10) {
        if (i10 == 1) {
            return "NONE";
        }
        if (i10 == 2) {
            return "FATAL";
        }
        if (i10 == 3) {
            return "ERROR";
        }
        if (i10 == 4) {
            return "WARN";
        }
        if (i10 == 5) {
            return "INFO";
        }
        if (i10 == 6) {
            return "DEBUG";
        }
        if (i10 == 7) {
            return "VERBOSE";
        }
        throw null;
    }
}
