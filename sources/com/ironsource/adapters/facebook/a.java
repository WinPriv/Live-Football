package com.ironsource.adapters.facebook;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.ironsource.mediationsdk.logger.IronLog;
import d6.o;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import l4.b;
import p4.h;
import p4.l;
import s.f;
import s7.e;
import s7.p;
import s7.v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements o.a, l, e {
    public /* synthetic */ a() {
    }

    public static int[] _values() {
        return f.d(9);
    }

    public static boolean b(String str) {
        if (y1.h(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        if (!lowerCase.endsWith(".glb") && !lowerCase.endsWith(".gltf")) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean c(int i10) {
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return false;
        }
        if (i10 == 4 || i10 == 5) {
            return true;
        }
        throw null;
    }

    public static /* synthetic */ String e(int i10) {
        if (i10 == 1) {
            return "webview";
        }
        if (i10 == 2) {
            return "browser";
        }
        if (i10 == 3) {
            return "replacement";
        }
        throw null;
    }

    public static /* synthetic */ String f(int i10) {
        if (i10 == 1) {
            return "greater";
        }
        if (i10 == 2) {
            return "less";
        }
        if (i10 == 3) {
            return "equal";
        }
        if (i10 == 4) {
            return "not_equal";
        }
        if (i10 == 5) {
            return "less_or_equal";
        }
        if (i10 == 6) {
            return "greater_or_equal";
        }
        if (i10 == 7) {
            return "exists";
        }
        if (i10 == 8) {
            return "not_exists";
        }
        if (i10 == 9) {
            return "in";
        }
        throw null;
    }

    public static /* synthetic */ int g(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        throw null;
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static String i(StringBuilder sb2, int i10, String str) {
        sb2.append(i10);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder j(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static StringBuilder k(String str, long j10, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j10);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder l(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder m(StringBuilder sb2, String str, String str2, StringBuffer stringBuffer, String str3) {
        sb2.append(str);
        sb2.append(str2);
        stringBuffer.append(sb2.toString());
        return new StringBuilder(str3);
    }

    public static Map n(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static /* bridge */ /* synthetic */ void o(int i10, int i11, Class cls) {
        throw null;
    }

    public static /* bridge */ /* synthetic */ void p(Object obj) {
        throw null;
    }

    public static void q(String str, String str2, IronLog ironLog) {
        ironLog.verbose(str + str2);
    }

    public static void r(StringBuilder sb2, String str, String str2, IronLog ironLog) {
        sb2.append(str);
        sb2.append(str2);
        ironLog.verbose(sb2.toString());
    }

    public static /* synthetic */ String s(int i10) {
        if (i10 == 1) {
            return "GREATER_THAN";
        }
        if (i10 == 2) {
            return "LESS_THAN";
        }
        if (i10 == 3) {
            return "EQUAL_TO";
        }
        if (i10 == 4) {
            return "NOT_EQUAL_TO";
        }
        if (i10 == 5) {
            return "LESS_THAN_OR_EQUAL_TO";
        }
        if (i10 == 6) {
            return "GREATER_THAN_OR_EQUAL_TO";
        }
        if (i10 == 7) {
            return "EXISTS";
        }
        if (i10 == 8) {
            return "NOT_EXISTS";
        }
        if (i10 == 9) {
            return "CONTAINS";
        }
        return "null";
    }

    public static /* synthetic */ String t(int i10) {
        if (i10 == 1) {
            return "ATTEMPT_MIGRATION";
        }
        if (i10 == 2) {
            return "NOT_GENERATED";
        }
        if (i10 == 3) {
            return "UNREGISTERED";
        }
        if (i10 == 4) {
            return "REGISTERED";
        }
        if (i10 == 5) {
            return "REGISTER_ERROR";
        }
        return "null";
    }

    public static /* synthetic */ String u(int i10) {
        if (i10 == 1) {
            return "OK";
        }
        if (i10 == 2) {
            return "BAD_CONFIG";
        }
        return "null";
    }

    public static /* synthetic */ String v(int i10) {
        if (i10 == 1) {
            return "MERGE";
        }
        if (i10 == 2) {
            return "ADD";
        }
        if (i10 == 3) {
            return "SUBTRACT";
        }
        if (i10 == 4) {
            return "INTERSECT";
        }
        if (i10 == 5) {
            return "EXCLUDE_INTERSECTIONS";
        }
        return "null";
    }

    public static /* synthetic */ String w(int i10) {
        if (i10 == 1) {
            return "PRE_COMP";
        }
        if (i10 == 2) {
            return "SOLID";
        }
        if (i10 == 3) {
            return "IMAGE";
        }
        if (i10 == 4) {
            return "NULL";
        }
        if (i10 == 5) {
            return "SHAPE";
        }
        if (i10 == 6) {
            return "TEXT";
        }
        if (i10 == 7) {
            return "UNKNOWN";
        }
        return "null";
    }

    public static /* synthetic */ String x(int i10) {
        if (i10 == 1) {
            return "RUN_AS_NON_EXPEDITED_WORK_REQUEST";
        }
        if (i10 == 2) {
            return "DROP_WORK_REQUEST";
        }
        return "null";
    }

    public static /* synthetic */ String y(int i10) {
        if (i10 == 1) {
            return "BEGIN_ARRAY";
        }
        if (i10 == 2) {
            return "END_ARRAY";
        }
        if (i10 == 3) {
            return "BEGIN_OBJECT";
        }
        if (i10 == 4) {
            return "END_OBJECT";
        }
        if (i10 == 5) {
            return "NAME";
        }
        if (i10 == 6) {
            return "STRING";
        }
        if (i10 == 7) {
            return "NUMBER";
        }
        if (i10 == 8) {
            return "BOOLEAN";
        }
        if (i10 == 9) {
            return "NULL";
        }
        if (i10 == 10) {
            return "END_DOCUMENT";
        }
        return "null";
    }

    public static /* synthetic */ String z(int i10) {
        if (i10 == 1) {
            return "BEGIN_ARRAY";
        }
        if (i10 == 2) {
            return "END_ARRAY";
        }
        if (i10 == 3) {
            return "BEGIN_OBJECT";
        }
        if (i10 == 4) {
            return "END_OBJECT";
        }
        if (i10 == 5) {
            return "NAME";
        }
        if (i10 == 6) {
            return "STRING";
        }
        if (i10 == 7) {
            return "NUMBER";
        }
        if (i10 == 8) {
            return "BOOLEAN";
        }
        if (i10 == 9) {
            return "NULL";
        }
        if (i10 == 10) {
            return "END_DOCUMENT";
        }
        return "null";
    }

    @Override // p4.l
    public h[] createExtractors() {
        return new h[]{new q4.a()};
    }

    @Override // s7.e
    public Object d(v vVar) {
        p<ScheduledExecutorService> pVar = ExecutorsRegistrar.f21263a;
        return t7.l.f35552s;
    }

    @Override // d6.o.a
    public void invoke(Object obj) {
        ((b) obj).getClass();
    }

    public /* synthetic */ a(int i10, long j10, b.a aVar) {
    }
}
