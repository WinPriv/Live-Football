package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.common.base.Splitter;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.g.f.c;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final Splitter f14429a = Splitter.on(':');

    /* renamed from: b, reason: collision with root package name */
    private static final Splitter f14430b = Splitter.on('*');

    /* renamed from: c, reason: collision with root package name */
    private final List<a> f14431c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private int f14432d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f14433e;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f14434a;

        /* renamed from: b, reason: collision with root package name */
        public final long f14435b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14436c;

        public a(int i10, long j10, int i11) {
            this.f14434a = i10;
            this.f14435b = j10;
            this.f14436c = i11;
        }
    }

    private void b(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        long d10 = iVar.d();
        int i10 = (this.f14433e - 12) - 8;
        y yVar = new y(i10);
        iVar.b(yVar.d(), 0, i10);
        for (int i11 = 0; i11 < i10 / 12; i11++) {
            yVar.e(2);
            short l10 = yVar.l();
            if (l10 != 2192 && l10 != 2816 && l10 != 2817 && l10 != 2819 && l10 != 2820) {
                yVar.e(8);
            } else {
                this.f14431c.add(new a(l10, (d10 - this.f14433e) - yVar.r(), yVar.r()));
            }
        }
        if (this.f14431c.isEmpty()) {
            uVar.f14937a = 0L;
        } else {
            this.f14432d = 3;
            uVar.f14937a = this.f14431c.get(0).f14435b;
        }
    }

    public void a() {
        this.f14431c.clear();
        this.f14432d = 0;
    }

    public int a(com.applovin.exoplayer2.e.i iVar, u uVar, List<a.InterfaceC0172a> list) throws IOException {
        int i10 = this.f14432d;
        long j10 = 0;
        if (i10 == 0) {
            long d10 = iVar.d();
            if (d10 != -1 && d10 >= 8) {
                j10 = d10 - 8;
            }
            uVar.f14937a = j10;
            this.f14432d = 1;
        } else if (i10 == 1) {
            a(iVar, uVar);
        } else if (i10 == 2) {
            b(iVar, uVar);
        } else if (i10 == 3) {
            a(iVar, list);
            uVar.f14937a = 0L;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    private void a(com.applovin.exoplayer2.e.i iVar, u uVar) throws IOException {
        y yVar = new y(8);
        iVar.b(yVar.d(), 0, 8);
        this.f14433e = yVar.r() + 8;
        if (yVar.q() != 1397048916) {
            uVar.f14937a = 0L;
        } else {
            uVar.f14937a = iVar.c() - (this.f14433e - 12);
            this.f14432d = 2;
        }
    }

    private void a(com.applovin.exoplayer2.e.i iVar, List<a.InterfaceC0172a> list) throws IOException {
        long c10 = iVar.c();
        int d10 = (int) ((iVar.d() - iVar.c()) - this.f14433e);
        y yVar = new y(d10);
        iVar.b(yVar.d(), 0, d10);
        for (int i10 = 0; i10 < this.f14431c.size(); i10++) {
            a aVar = this.f14431c.get(i10);
            yVar.d((int) (aVar.f14435b - c10));
            yVar.e(4);
            int r10 = yVar.r();
            int a10 = a(yVar.f(r10));
            int i11 = aVar.f14436c - (r10 + 8);
            if (a10 == 2192) {
                list.add(a(yVar, i11));
            } else if (a10 != 2816 && a10 != 2817 && a10 != 2819 && a10 != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static com.applovin.exoplayer2.g.f.c a(y yVar, int i10) throws ai {
        ArrayList arrayList = new ArrayList();
        List<String> splitToList = f14430b.splitToList(yVar.f(i10));
        for (int i11 = 0; i11 < splitToList.size(); i11++) {
            List<String> splitToList2 = f14429a.splitToList(splitToList.get(i11));
            if (splitToList2.size() == 3) {
                try {
                    arrayList.add(new c.a(Long.parseLong(splitToList2.get(0)), Long.parseLong(splitToList2.get(1)), 1 << (Integer.parseInt(splitToList2.get(2)) - 1)));
                } catch (NumberFormatException e10) {
                    throw ai.b(null, e10);
                }
            } else {
                throw ai.b(null, null);
            }
        }
        return new com.applovin.exoplayer2.g.f.c(arrayList);
    }

    private static int a(String str) throws ai {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c10 = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2192;
            case 1:
                return 2819;
            case 2:
                return 2816;
            case 3:
                return 2820;
            case 4:
                return 2817;
            default:
                throw ai.b("Invalid SEF name", null);
        }
    }
}
