package com.anythink.expressad.foundation.g.f.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9991a = -2;

    /* renamed from: b, reason: collision with root package name */
    public static final int f9992b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f9993c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9994d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f9995e = 4;
    public static final int f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final int f9996g = 6;

    /* renamed from: h, reason: collision with root package name */
    public static final int f9997h = 7;

    /* renamed from: i, reason: collision with root package name */
    public static final int f9998i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final int f9999j = 9;

    /* renamed from: k, reason: collision with root package name */
    public static final int f10000k = 10;

    /* renamed from: l, reason: collision with root package name */
    public static final int f10001l = 11;

    /* renamed from: m, reason: collision with root package name */
    public static final int f10002m = 12;

    /* renamed from: n, reason: collision with root package name */
    public static final int f10003n = 13;
    public static final int o = 14;

    /* renamed from: p, reason: collision with root package name */
    public static final int f10004p = 15;

    public static String a(com.anythink.expressad.foundation.g.f.a.a aVar) {
        int i10;
        if (aVar != null) {
            try {
                int i11 = aVar.f9900a;
                com.anythink.expressad.foundation.g.f.f.c cVar = aVar.f9901b;
                if (cVar != null) {
                    i10 = cVar.f9987a;
                } else {
                    i10 = 0;
                }
                if (i11 != -2) {
                    if (i11 != 1) {
                        switch (i11) {
                            case 3:
                                return "Network error,timeout exception";
                            case 4:
                                return "Network unknown error";
                            case 5:
                                return "Network error，https is not work,please check your phone time";
                            case 6:
                                if (i10 != 0) {
                                    return "Network error,please check state code".concat(String.valueOf(i10));
                                }
                                return "Network error,please check ";
                            case 7:
                                if (i10 != 0) {
                                    return "The server returns an exception state code ".concat(String.valueOf(i10));
                                }
                                return "The server returns an exception ";
                            case 8:
                                return "Cast exception, return data can't be casted correctly";
                            case 9:
                            case 12:
                                return "Network error,disconnected network exception";
                            case 10:
                                return "Network error,socket timeout exception";
                            case 11:
                                return "Network error，sslp exception";
                            default:
                                return "Network error,I/O exception";
                        }
                    }
                } else {
                    return "Network is canceled";
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return "Network error,Load failed";
    }
}
