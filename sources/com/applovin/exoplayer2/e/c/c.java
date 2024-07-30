package com.applovin.exoplayer2.e.c;

import com.applovin.exoplayer2.e.g;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: b, reason: collision with root package name */
    private long f14159b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f14160c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f14161d;

    public c() {
        super(new g());
        this.f14159b = com.anythink.expressad.exoplayer.b.f7291b;
        this.f14160c = new long[0];
        this.f14161d = new long[0];
    }

    private static Double d(y yVar) {
        return Double.valueOf(Double.longBitsToDouble(yVar.s()));
    }

    private static String e(y yVar) {
        int i10 = yVar.i();
        int c10 = yVar.c();
        yVar.e(i10);
        return new String(yVar.d(), c10, i10);
    }

    private static ArrayList<Object> f(y yVar) {
        int w10 = yVar.w();
        ArrayList<Object> arrayList = new ArrayList<>(w10);
        for (int i10 = 0; i10 < w10; i10++) {
            Object a10 = a(yVar, b(yVar));
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    private static HashMap<String, Object> g(y yVar) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String e10 = e(yVar);
            int b10 = b(yVar);
            if (b10 == 9) {
                return hashMap;
            }
            Object a10 = a(yVar, b10);
            if (a10 != null) {
                hashMap.put(e10, a10);
            }
        }
    }

    private static HashMap<String, Object> h(y yVar) {
        int w10 = yVar.w();
        HashMap<String, Object> hashMap = new HashMap<>(w10);
        for (int i10 = 0; i10 < w10; i10++) {
            String e10 = e(yVar);
            Object a10 = a(yVar, b(yVar));
            if (a10 != null) {
                hashMap.put(e10, a10);
            }
        }
        return hashMap;
    }

    private static Date i(y yVar) {
        Date date = new Date((long) d(yVar).doubleValue());
        yVar.e(2);
        return date;
    }

    @Override // com.applovin.exoplayer2.e.c.d
    public boolean a(y yVar) {
        return true;
    }

    public long[] b() {
        return this.f14160c;
    }

    public long[] c() {
        return this.f14161d;
    }

    private static int b(y yVar) {
        return yVar.h();
    }

    private static Boolean c(y yVar) {
        return Boolean.valueOf(yVar.h() == 1);
    }

    public long a() {
        return this.f14159b;
    }

    @Override // com.applovin.exoplayer2.e.c.d
    public boolean a(y yVar, long j10) {
        if (b(yVar) != 2 || !"onMetaData".equals(e(yVar)) || b(yVar) != 8) {
            return false;
        }
        HashMap<String, Object> h10 = h(yVar);
        Object obj = h10.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f14159b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = h10.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f14160c = new long[size];
                this.f14161d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.f14160c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f14161d[i10] = ((Double) obj5).longValue();
                    } else {
                        this.f14160c = new long[0];
                        this.f14161d = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }

    private static Object a(y yVar, int i10) {
        if (i10 == 0) {
            return d(yVar);
        }
        if (i10 == 1) {
            return c(yVar);
        }
        if (i10 == 2) {
            return e(yVar);
        }
        if (i10 == 3) {
            return g(yVar);
        }
        if (i10 == 8) {
            return h(yVar);
        }
        if (i10 == 10) {
            return f(yVar);
        }
        if (i10 != 11) {
            return null;
        }
        return i(yVar);
    }
}
