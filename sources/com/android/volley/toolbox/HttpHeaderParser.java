package com.android.volley.toolbox;

import com.android.volley.Cache;
import com.android.volley.Header;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyLog;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.openalliance.ad.constant.w;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class HttpHeaderParser {
    private static final String DEFAULT_CONTENT_CHARSET = "ISO-8859-1";
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    private static final String RFC1123_OUTPUT_FORMAT = "EEE, dd MMM yyyy HH:mm:ss 'GMT'";
    private static final String RFC1123_PARSE_FORMAT = "EEE, dd MMM yyyy HH:mm:ss zzz";

    public static List<Header> combineHeaders(List<Header> list, Cache.Entry entry) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<Header> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().getName());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<Header> list2 = entry.allResponseHeaders;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (Header header : entry.allResponseHeaders) {
                    if (!treeSet.contains(header.getName())) {
                        arrayList.add(header);
                    }
                }
            }
        } else if (!entry.responseHeaders.isEmpty()) {
            for (Map.Entry<String, String> entry2 : entry.responseHeaders.entrySet()) {
                if (!treeSet.contains(entry2.getKey())) {
                    arrayList.add(new Header(entry2.getKey(), entry2.getValue()));
                }
            }
        }
        return arrayList;
    }

    public static String formatEpochAsRfc1123(long j10) {
        return newUsGmtFormatter(RFC1123_OUTPUT_FORMAT).format(new Date(j10));
    }

    public static Map<String, String> getCacheHeaders(Cache.Entry entry) {
        if (entry == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        String str = entry.etag;
        if (str != null) {
            hashMap.put("If-None-Match", str);
        }
        long j10 = entry.lastModified;
        if (j10 > 0) {
            hashMap.put("If-Modified-Since", formatEpochAsRfc1123(j10));
        }
        return hashMap;
    }

    private static SimpleDateFormat newUsGmtFormatter(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static Cache.Entry parseCacheHeaders(NetworkResponse networkResponse) {
        long j10;
        boolean z10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = networkResponse.headers;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        if (str != null) {
            j10 = parseDateAsEpoch(str);
        } else {
            j10 = 0;
        }
        String str2 = map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z10 = false;
            j11 = 0;
            j12 = 0;
            while (i10 < split.length) {
                String trim = split[i10].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j11 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j12 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z10 = true;
                }
                i10++;
            }
            i10 = 1;
        } else {
            z10 = false;
            j11 = 0;
            j12 = 0;
        }
        String str3 = map.get("Expires");
        if (str3 != null) {
            j13 = parseDateAsEpoch(str3);
        } else {
            j13 = 0;
        }
        String str4 = map.get("Last-Modified");
        if (str4 != null) {
            j14 = parseDateAsEpoch(str4);
        } else {
            j14 = 0;
        }
        String str5 = map.get("ETag");
        if (i10 != 0) {
            j16 = currentTimeMillis + (j11 * 1000);
            if (z10) {
                j17 = j16;
            } else {
                j17 = (j12 * 1000) + j16;
            }
            j15 = j17;
        } else {
            j15 = 0;
            if (j10 > 0 && j13 >= j10) {
                j16 = currentTimeMillis + (j13 - j10);
                j15 = j16;
            } else {
                j16 = 0;
            }
        }
        Cache.Entry entry = new Cache.Entry();
        entry.data = networkResponse.data;
        entry.etag = str5;
        entry.softTtl = j16;
        entry.ttl = j15;
        entry.serverDate = j10;
        entry.lastModified = j14;
        entry.responseHeaders = map;
        entry.allResponseHeaders = networkResponse.allHeaders;
        return entry;
    }

    public static String parseCharset(Map<String, String> map, String str) {
        String str2;
        if (map != null && (str2 = map.get("Content-Type")) != null) {
            String[] split = str2.split(w.aG, 0);
            for (int i10 = 1; i10 < split.length; i10++) {
                String[] split2 = split[i10].trim().split(ContainerUtils.KEY_VALUE_DELIMITER, 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    public static long parseDateAsEpoch(String str) {
        try {
            return newUsGmtFormatter(RFC1123_PARSE_FORMAT).parse(str).getTime();
        } catch (ParseException e10) {
            if (!"0".equals(str) && !"-1".equals(str)) {
                VolleyLog.e(e10, "Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            VolleyLog.v("Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static List<Header> toAllHeaderList(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new Header(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    public static Map<String, String> toHeaderMap(List<Header> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Header header : list) {
            treeMap.put(header.getName(), header.getValue());
        }
        return treeMap;
    }

    public static String parseCharset(Map<String, String> map) {
        return parseCharset(map, DEFAULT_CONTENT_CHARSET);
    }
}
