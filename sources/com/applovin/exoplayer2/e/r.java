package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.ai;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f14929c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f14930a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f14931b = -1;

    public boolean a(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 <= 0 && i12 <= 0) {
            return false;
        }
        this.f14930a = i11;
        this.f14931b = i12;
        return true;
    }

    public boolean a(com.applovin.exoplayer2.g.a aVar) {
        for (int i10 = 0; i10 < aVar.a(); i10++) {
            a.InterfaceC0172a a10 = aVar.a(i10);
            if (a10 instanceof com.applovin.exoplayer2.g.e.e) {
                com.applovin.exoplayer2.g.e.e eVar = (com.applovin.exoplayer2.g.e.e) a10;
                if ("iTunSMPB".equals(eVar.f15151b) && a(eVar.f15152c)) {
                    return true;
                }
            } else if (a10 instanceof com.applovin.exoplayer2.g.e.i) {
                com.applovin.exoplayer2.g.e.i iVar = (com.applovin.exoplayer2.g.e.i) a10;
                if ("com.apple.iTunes".equals(iVar.f15162a) && "iTunSMPB".equals(iVar.f15163b) && a(iVar.f15164c)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private boolean a(String str) {
        Matcher matcher = f14929c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) ai.a(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) ai.a(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f14930a = parseInt;
            this.f14931b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f14930a == -1 || this.f14931b == -1) ? false : true;
    }
}
