package com.anythink.expressad.exoplayer.e;

import com.anythink.expressad.exoplayer.g.a;
import com.anythink.expressad.exoplayer.g.b.g;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    private static final String f7946d = "com.apple.iTunes";

    /* renamed from: e, reason: collision with root package name */
    private static final String f7947e = "iTunSMPB";

    /* renamed from: b, reason: collision with root package name */
    public int f7948b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f7949c = -1;

    /* renamed from: a, reason: collision with root package name */
    public static final g.a f7945a = new g.a() { // from class: com.anythink.expressad.exoplayer.e.i.1
        @Override // com.anythink.expressad.exoplayer.g.b.g.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            if (i11 == 67 && i12 == 79 && i13 == 77) {
                if (i14 == 77 || i10 == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
    };
    private static final Pattern f = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    private boolean a(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 <= 0 && i12 <= 0) {
            return false;
        }
        this.f7948b = i11;
        this.f7949c = i12;
        return true;
    }

    public final boolean a(com.anythink.expressad.exoplayer.g.a aVar) {
        for (int i10 = 0; i10 < aVar.a(); i10++) {
            a.InterfaceC0105a a10 = aVar.a(i10);
            if (a10 instanceof com.anythink.expressad.exoplayer.g.b.e) {
                com.anythink.expressad.exoplayer.g.b.e eVar = (com.anythink.expressad.exoplayer.g.b.e) a10;
                if (f7947e.equals(eVar.f8049c) && a(eVar.f8050d)) {
                    return true;
                }
            } else if (a10 instanceof com.anythink.expressad.exoplayer.g.b.i) {
                com.anythink.expressad.exoplayer.g.b.i iVar = (com.anythink.expressad.exoplayer.g.b.i) a10;
                if (f7946d.equals(iVar.f8076b) && f7947e.equals(iVar.f8077c) && a(iVar.f8078d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private boolean a(String str) {
        Matcher matcher = f.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1), 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f7948b = parseInt;
            this.f7949c = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean a() {
        return (this.f7948b == -1 || this.f7949c == -1) ? false : true;
    }
}
