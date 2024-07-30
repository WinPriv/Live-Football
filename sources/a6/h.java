package a6;

import d6.g0;
import d6.w;
import java.util.regex.Pattern;
import k4.z0;

/* compiled from: WebvttParserUtil.java */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f348a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(w wVar) {
        String e10 = wVar.e();
        if (e10 != null && e10.startsWith("WEBVTT")) {
            return true;
        }
        return false;
    }

    public static float b(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) throws NumberFormatException {
        int i10 = g0.f27302a;
        String[] split = str.split("\\.", 2);
        long j10 = 0;
        for (String str2 : split[0].split(com.huawei.openalliance.ad.constant.w.bE, -1)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (split.length == 2) {
            j11 += Long.parseLong(split[1]);
        }
        return j11 * 1000;
    }

    public static void d(w wVar) throws z0 {
        int i10 = wVar.f27385b;
        if (a(wVar)) {
            return;
        }
        wVar.E(i10);
        throw z0.a("Expected WEBVTT. Got " + wVar.e(), null);
    }
}
