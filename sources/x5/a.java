package x5;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r5.f;

/* compiled from: SubripDecoder.java */
/* loaded from: classes2.dex */
public final class a extends f {
    public static final Pattern o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f36477p = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: m, reason: collision with root package name */
    public final StringBuilder f36478m = new StringBuilder();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList<String> f36479n = new ArrayList<>();

    public static long h(Matcher matcher, int i10) {
        long j10;
        String group = matcher.group(i10 + 1);
        if (group != null) {
            j10 = Long.parseLong(group) * 60 * 60 * 1000;
        } else {
            j10 = 0;
        }
        String group2 = matcher.group(i10 + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60 * 1000) + j10;
        String group3 = matcher.group(i10 + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i10 + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:49:0x0120. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:67:0x0190. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021e  */
    @Override // r5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r5.g g(byte[] r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.a.g(byte[], int, boolean):r5.g");
    }
}
