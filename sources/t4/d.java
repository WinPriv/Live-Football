package t4;

import d6.w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4.g;

/* compiled from: ScriptTagPayloadReader.java */
/* loaded from: classes2.dex */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    public long f35451b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f35452c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f35453d;

    public d() {
        super(new g());
        this.f35451b = com.anythink.expressad.exoplayer.b.f7291b;
        this.f35452c = new long[0];
        this.f35453d = new long[0];
    }

    public static Serializable b(int i10, w wVar) {
        if (i10 != 0) {
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 8) {
                            if (i10 != 10) {
                                if (i10 != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(wVar.m())).doubleValue());
                                wVar.F(2);
                                return date;
                            }
                            int w10 = wVar.w();
                            ArrayList arrayList = new ArrayList(w10);
                            for (int i11 = 0; i11 < w10; i11++) {
                                Serializable b10 = b(wVar.t(), wVar);
                                if (b10 != null) {
                                    arrayList.add(b10);
                                }
                            }
                            return arrayList;
                        }
                        return c(wVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String d10 = d(wVar);
                        int t10 = wVar.t();
                        if (t10 == 9) {
                            return hashMap;
                        }
                        Serializable b11 = b(t10, wVar);
                        if (b11 != null) {
                            hashMap.put(d10, b11);
                        }
                    }
                } else {
                    return d(wVar);
                }
            } else {
                if (wVar.t() != 1) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(wVar.m()));
        }
    }

    public static HashMap<String, Object> c(w wVar) {
        int w10 = wVar.w();
        HashMap<String, Object> hashMap = new HashMap<>(w10);
        for (int i10 = 0; i10 < w10; i10++) {
            String d10 = d(wVar);
            Serializable b10 = b(wVar.t(), wVar);
            if (b10 != null) {
                hashMap.put(d10, b10);
            }
        }
        return hashMap;
    }

    public static String d(w wVar) {
        int y = wVar.y();
        int i10 = wVar.f27385b;
        wVar.F(y);
        return new String(wVar.f27384a, i10, y);
    }

    public final boolean a(long j10, w wVar) {
        if (wVar.t() != 2 || !"onMetaData".equals(d(wVar)) || wVar.f27386c - wVar.f27385b == 0 || wVar.t() != 8) {
            return false;
        }
        HashMap<String, Object> c10 = c(wVar);
        Object obj = c10.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f35451b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = c10.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f35452c = new long[size];
                this.f35453d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.f35452c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f35453d[i10] = ((Double) obj5).longValue();
                    } else {
                        this.f35452c = new long[0];
                        this.f35453d = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }
}
