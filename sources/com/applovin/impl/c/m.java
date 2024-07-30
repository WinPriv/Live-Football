package com.applovin.impl.c;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.t;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.huawei.hms.framework.common.ExceptionCode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static final DateFormat f17445a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* renamed from: b, reason: collision with root package name */
    private static final Random f17446b = new Random(System.currentTimeMillis());

    public static void a(e eVar, AppLovinAdLoadListener appLovinAdLoadListener, f fVar, int i10, p pVar) {
        if (pVar != null) {
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i10);
            }
            a(a(eVar, pVar), fVar, pVar);
            return;
        }
        throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
    }

    public static boolean b(a aVar) {
        n aO;
        List<o> a10;
        return (aVar == null || (aO = aVar.aO()) == null || (a10 = aO.a()) == null || a10.isEmpty()) ? false : true;
    }

    public static boolean c(a aVar) {
        d aQ;
        i b10;
        if (aVar == null || (aQ = aVar.aQ()) == null || (b10 = aQ.b()) == null) {
            return false;
        }
        if (b10.b() == null && !StringUtils.isValidString(b10.c())) {
            return false;
        }
        return true;
    }

    public static f a(a aVar) {
        if (b(aVar) || c(aVar)) {
            return null;
        }
        return f.GENERAL_WRAPPER_ERROR;
    }

    private static String b() {
        DateFormat dateFormat = f17445a;
        dateFormat.setTimeZone(TimeZone.getDefault());
        return dateFormat.format(new Date());
    }

    public static boolean b(t tVar) {
        if (tVar != null) {
            return tVar.c("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    public static Uri a(String str, long j10, Uri uri, f fVar, p pVar) {
        if (URLUtil.isValidUrl(str)) {
            try {
                String num = Integer.toString(fVar.a());
                String replace = str.replace("[ERRORCODE]", num).replace("[REASON]", num);
                if (j10 >= 0) {
                    replace = replace.replace("[CONTENTPLAYHEAD]", a(j10));
                }
                if (uri != null) {
                    replace = replace.replace("[ASSETURI]", uri.toString());
                }
                return Uri.parse(replace.replace("[CACHEBUSTING]", a()).replace("[TIMESTAMP]", b()));
            } catch (Throwable th) {
                pVar.L();
                if (y.a()) {
                    pVar.L().b("VastUtils", "Unable to replace macros in URL string " + str, th);
                }
                return null;
            }
        }
        pVar.L();
        if (y.a()) {
            pVar.L().e("VastUtils", "Unable to replace macros in invalid URL string.");
        }
        return null;
    }

    private static String a(long j10) {
        if (j10 <= 0) {
            return "00:00:00.000";
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long hours = timeUnit.toHours(j10);
        long minutes = timeUnit.toMinutes(j10);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        return String.format(Locale.US, "%02d:%02d:%02d.000", Long.valueOf(hours), Long.valueOf(minutes % timeUnit2.toSeconds(1L)), Long.valueOf(j10 % timeUnit2.toSeconds(1L)));
    }

    private static String a() {
        return Integer.toString(f17446b.nextInt(89999999) + ExceptionCode.CRASH_EXCEPTION);
    }

    public static void a(Set<k> set, p pVar) {
        a(set, -1L, (Uri) null, f.UNSPECIFIED, pVar);
    }

    public static void a(Set<k> set, f fVar, p pVar) {
        a(set, -1L, (Uri) null, fVar, pVar);
    }

    public static void a(Set<k> set, long j10, Uri uri, f fVar, p pVar) {
        if (pVar != null) {
            if (set == null || set.isEmpty()) {
                return;
            }
            Iterator<k> it = set.iterator();
            while (it.hasNext()) {
                Uri a10 = a(it.next().b(), j10, uri, fVar, pVar);
                if (a10 != null) {
                    pVar.al().a(com.applovin.impl.sdk.network.j.o().c(a10.toString()).a(false).a(), false);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
    }

    public static void a(t tVar, Map<String, Set<k>> map, e eVar, p pVar) {
        List<t> a10;
        if (pVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (tVar == null) {
            pVar.L();
            if (y.a()) {
                pVar.L().e("VastUtils", "Unable to render event trackers; null node provided");
                return;
            }
            return;
        }
        if (map == null) {
            pVar.L();
            if (y.a()) {
                pVar.L().e("VastUtils", "Unable to render event trackers; null event trackers provided");
                return;
            }
            return;
        }
        t b10 = tVar.b("TrackingEvents");
        if (b10 == null || (a10 = b10.a("Tracking")) == null) {
            return;
        }
        for (t tVar2 : a10) {
            String str = tVar2.b().get("event");
            if (StringUtils.isValidString(str)) {
                k a11 = k.a(tVar2, eVar, pVar);
                if (a11 != null) {
                    Set<k> set = map.get(str);
                    if (set != null) {
                        set.add(a11);
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.add(a11);
                        map.put(str, hashSet);
                    }
                }
            } else {
                pVar.L();
                if (y.a()) {
                    pVar.L().e("VastUtils", "Could not find event for tracking node = " + tVar2);
                }
            }
        }
    }

    public static void a(List<t> list, Set<k> set, e eVar, p pVar) {
        if (pVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            pVar.L();
            if (y.a()) {
                pVar.L().e("VastUtils", "Unable to render trackers; null nodes provided");
                return;
            }
            return;
        }
        if (set == null) {
            pVar.L();
            if (y.a()) {
                pVar.L().e("VastUtils", "Unable to render trackers; null trackers provided");
                return;
            }
            return;
        }
        Iterator<t> it = list.iterator();
        while (it.hasNext()) {
            k a10 = k.a(it.next(), eVar, pVar);
            if (a10 != null) {
                set.add(a10);
            }
        }
    }

    public static boolean a(t tVar) {
        if (tVar != null) {
            return tVar.c("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    public static String a(e eVar) {
        t c10;
        if (eVar != null) {
            List<t> b10 = eVar.b();
            int size = eVar.b().size();
            if (size <= 0 || (c10 = b10.get(size - 1).c("VASTAdTagURI")) == null) {
                return null;
            }
            return c10.c();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    public static String a(t tVar, String str, String str2) {
        t b10 = tVar.b(str);
        if (b10 != null) {
            String c10 = b10.c();
            if (StringUtils.isValidString(c10)) {
                return c10;
            }
        }
        return str2;
    }

    private static Set<k> a(e eVar, p pVar) {
        if (eVar == null) {
            return null;
        }
        List<t> b10 = eVar.b();
        Set<k> hashSet = new HashSet<>(b10.size());
        for (t tVar : b10) {
            t c10 = tVar.c("Wrapper");
            if (c10 == null) {
                c10 = tVar.c("InLine");
            }
            if (c10 != null) {
                hashSet = a(hashSet, c10.a("Error"), eVar, pVar);
            } else {
                hashSet = a(hashSet, tVar.a("Error"), eVar, pVar);
            }
        }
        pVar.L();
        if (y.a()) {
            pVar.L().b("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        }
        return hashSet;
    }

    private static Set<k> a(Set<k> set, List<t> list, e eVar, p pVar) {
        if (list != null) {
            Iterator<t> it = list.iterator();
            while (it.hasNext()) {
                k a10 = k.a(it.next(), eVar, pVar);
                if (a10 != null) {
                    set.add(a10);
                }
            }
        }
        return set;
    }
}
