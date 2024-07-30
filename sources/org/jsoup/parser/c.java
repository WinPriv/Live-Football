package org.jsoup.parser;

import org.jsoup.nodes.DocumentType;
import org.jsoup.parser.Token;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TokeniserState.java */
/* loaded from: classes2.dex */
public abstract class c {
    public static final o1 A;
    public static final b1 A0;
    public static final a B;
    public static final d1 B0;
    public static final b C;
    public static final e1 C0;
    public static final C0455c D;
    public static final f1 D0;
    public static final d E;
    public static final g1 E0;
    public static final e F;
    public static final h1 F0;
    public static final f G;
    public static final i1 G0;
    public static final g H;
    public static final j1 H0;
    public static final h I;
    public static final k1 I0;
    public static final i J;
    public static final char[] J0;
    public static final j K;
    public static final char[] K0;
    public static final l L;
    public static final String L0;
    public static final m M;
    public static final /* synthetic */ c[] M0;
    public static final n N;
    public static final o O;
    public static final p P;
    public static final q Q;
    public static final r R;
    public static final s S;
    public static final t T;
    public static final u U;
    public static final w V;
    public static final x W;
    public static final y X;
    public static final z Y;
    public static final a0 Z;

    /* renamed from: c0, reason: collision with root package name */
    public static final b0 f34126c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final c0 f34127d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final d0 f34128e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final e0 f34129f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final f0 f34130g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final h0 f34131h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final i0 f34132i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final j0 f34133j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final k0 f34134k0;

    /* renamed from: l0, reason: collision with root package name */
    public static final l0 f34135l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final m0 f34136m0;

    /* renamed from: n0, reason: collision with root package name */
    public static final n0 f34137n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final o0 f34138o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final p0 f34139p0;

    /* renamed from: q0, reason: collision with root package name */
    public static final q0 f34140q0;

    /* renamed from: r0, reason: collision with root package name */
    public static final s0 f34141r0;

    /* renamed from: s, reason: collision with root package name */
    public static final k f34142s;

    /* renamed from: s0, reason: collision with root package name */
    public static final t0 f34143s0;

    /* renamed from: t, reason: collision with root package name */
    public static final v f34144t;

    /* renamed from: t0, reason: collision with root package name */
    public static final u0 f34145t0;

    /* renamed from: u, reason: collision with root package name */
    public static final g0 f34146u;

    /* renamed from: u0, reason: collision with root package name */
    public static final v0 f34147u0;

    /* renamed from: v, reason: collision with root package name */
    public static final r0 f34148v;

    /* renamed from: v0, reason: collision with root package name */
    public static final w0 f34149v0;

    /* renamed from: w, reason: collision with root package name */
    public static final c1 f34150w;

    /* renamed from: w0, reason: collision with root package name */
    public static final x0 f34151w0;

    /* renamed from: x, reason: collision with root package name */
    public static final l1 f34152x;

    /* renamed from: x0, reason: collision with root package name */
    public static final y0 f34153x0;
    public static final m1 y;
    public static final z0 y0;

    /* renamed from: z, reason: collision with root package name */
    public static final n1 f34154z;

    /* renamed from: z0, reason: collision with root package name */
    public static final a1 f34155z0;

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum a extends c {
        public a() {
            super("TagName", 9);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            String str;
            char c10;
            characterReader.a();
            int i10 = characterReader.f34013e;
            int i11 = characterReader.f34011c;
            char[] cArr = characterReader.f34009a;
            int i12 = i10;
            while (i12 < i11 && (c10 = cArr[i12]) != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ' && c10 != '/' && c10 != '<' && c10 != '>') {
                i12++;
            }
            characterReader.f34013e = i12;
            if (i12 > i10) {
                str = CharacterReader.b(characterReader.f34009a, characterReader.f34015h, i10, i12 - i10);
            } else {
                str = "";
            }
            bVar.f34117k.k(str);
            char d10 = characterReader.d();
            if (d10 != 0) {
                if (d10 != ' ') {
                    if (d10 != '/') {
                        k kVar = c.f34142s;
                        if (d10 != '<') {
                            if (d10 != '>') {
                                if (d10 != 65535) {
                                    if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r') {
                                        Token.h hVar = bVar.f34117k;
                                        hVar.getClass();
                                        hVar.k(String.valueOf(d10));
                                        return;
                                    }
                                } else {
                                    bVar.l(this);
                                    bVar.o(kVar);
                                    return;
                                }
                            }
                        } else {
                            characterReader.u();
                            bVar.m(this);
                        }
                        bVar.k();
                        bVar.o(kVar);
                        return;
                    }
                    bVar.o(c.f34133j0);
                    return;
                }
                bVar.o(c.Z);
                return;
            }
            bVar.f34117k.k(c.L0);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum a0 extends c {
        public a0() {
            super("BeforeAttributeName", 33);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            b0 b0Var = c.f34126c0;
            if (d10 != 0) {
                if (d10 != ' ') {
                    if (d10 != '\"' && d10 != '\'') {
                        if (d10 != '/') {
                            k kVar = c.f34142s;
                            if (d10 != 65535) {
                                if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r') {
                                    switch (d10) {
                                        case '<':
                                            characterReader.u();
                                            bVar.m(this);
                                            break;
                                        case '=':
                                            break;
                                        case '>':
                                            break;
                                        default:
                                            bVar.f34117k.o();
                                            characterReader.u();
                                            bVar.o(b0Var);
                                            return;
                                    }
                                    bVar.k();
                                    bVar.o(kVar);
                                    return;
                                }
                                return;
                            }
                            bVar.l(this);
                            bVar.o(kVar);
                            return;
                        }
                        bVar.o(c.f34133j0);
                        return;
                    }
                    bVar.m(this);
                    bVar.f34117k.o();
                    Token.h hVar = bVar.f34117k;
                    hVar.f34065h = true;
                    String str = hVar.f34064g;
                    StringBuilder sb2 = hVar.f;
                    if (str != null) {
                        sb2.append(str);
                        hVar.f34064g = null;
                    }
                    sb2.append(d10);
                    bVar.o(b0Var);
                    return;
                }
                return;
            }
            characterReader.u();
            bVar.m(this);
            bVar.f34117k.o();
            bVar.o(b0Var);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum a1 extends c {
        public a1() {
            super("DoctypePublicIdentifier_singleQuoted", 57);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            Token.d dVar = bVar.f34119m;
            if (d10 != 0) {
                if (d10 != '\'') {
                    k kVar = c.f34142s;
                    if (d10 != '>') {
                        if (d10 != 65535) {
                            dVar.f.append(d10);
                            return;
                        }
                        bVar.l(this);
                        dVar.f34061h = true;
                        bVar.j();
                        bVar.o(kVar);
                        return;
                    }
                    bVar.m(this);
                    dVar.f34061h = true;
                    bVar.j();
                    bVar.o(kVar);
                    return;
                }
                bVar.o(c.A0);
                return;
            }
            bVar.m(this);
            dVar.f.append((char) 65533);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum b extends c {
        public b() {
            super("RcdataLessthanSign", 10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        
            if (r1 >= r8.f34013e) goto L30;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
        @Override // org.jsoup.parser.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void d(org.jsoup.parser.b r7, org.jsoup.parser.CharacterReader r8) {
            /*
                r6 = this;
                r0 = 47
                boolean r0 = r8.n(r0)
                if (r0 == 0) goto L17
                r7.d()
                org.jsoup.parser.c$c r8 = org.jsoup.parser.c.D
                r7.o(r8)
                org.jsoup.parser.CharacterReader r7 = r7.f34108a
                r7.advance()
                goto L97
            L17:
                boolean r0 = r8.p()
                if (r0 == 0) goto L8d
                java.lang.String r0 = r7.o
                if (r0 == 0) goto L8d
                java.lang.String r0 = r7.f34121p
                if (r0 != 0) goto L37
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "</"
                r0.<init>(r1)
                java.lang.String r1 = r7.o
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.f34121p = r0
            L37:
                java.lang.String r0 = r7.f34121p
                java.lang.String r1 = r8.f34019l
                boolean r1 = r0.equals(r1)
                r2 = 0
                r3 = 1
                r4 = -1
                if (r1 == 0) goto L4f
                int r1 = r8.f34020m
                if (r1 != r4) goto L4a
                r3 = r2
                goto L77
            L4a:
                int r5 = r8.f34013e
                if (r1 < r5) goto L4f
                goto L77
            L4f:
                r8.f34019l = r0
                java.util.Locale r1 = java.util.Locale.ENGLISH
                java.lang.String r5 = r0.toLowerCase(r1)
                int r5 = r8.r(r5)
                if (r5 <= r4) goto L63
                int r0 = r8.f34013e
                int r0 = r0 + r5
                r8.f34020m = r0
                goto L77
            L63:
                java.lang.String r0 = r0.toUpperCase(r1)
                int r0 = r8.r(r0)
                if (r0 <= r4) goto L6e
                goto L6f
            L6e:
                r3 = r2
            L6f:
                if (r3 == 0) goto L75
                int r1 = r8.f34013e
                int r4 = r1 + r0
            L75:
                r8.f34020m = r4
            L77:
                if (r3 != 0) goto L8d
                org.jsoup.parser.Token$h r8 = r7.c(r2)
                java.lang.String r0 = r7.o
                r8.n(r0)
                r7.f34117k = r8
                r7.k()
                org.jsoup.parser.c$n1 r8 = org.jsoup.parser.c.f34154z
                r7.o(r8)
                goto L97
            L8d:
                java.lang.String r8 = "<"
                r7.f(r8)
                org.jsoup.parser.c$g0 r8 = org.jsoup.parser.c.f34146u
                r7.o(r8)
            L97:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.c.b.d(org.jsoup.parser.b, org.jsoup.parser.CharacterReader):void");
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum b0 extends c {
        public b0() {
            super("AttributeName", 34);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            String h10 = characterReader.h(c.J0);
            Token.h hVar = bVar.f34117k;
            hVar.getClass();
            String replace = h10.replace((char) 0, (char) 65533);
            hVar.f34065h = true;
            String str = hVar.f34064g;
            StringBuilder sb2 = hVar.f;
            if (str != null) {
                sb2.append(str);
                hVar.f34064g = null;
            }
            if (sb2.length() == 0) {
                hVar.f34064g = replace;
            } else {
                sb2.append(replace);
            }
            char d10 = characterReader.d();
            if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r' && d10 != ' ') {
                if (d10 != '\"' && d10 != '\'') {
                    if (d10 != '/') {
                        k kVar = c.f34142s;
                        if (d10 != 65535) {
                            switch (d10) {
                                case '<':
                                    break;
                                case '=':
                                    bVar.o(c.f34128e0);
                                    return;
                                case '>':
                                    bVar.k();
                                    bVar.o(kVar);
                                    return;
                                default:
                                    Token.h hVar2 = bVar.f34117k;
                                    hVar2.f34065h = true;
                                    String str2 = hVar2.f34064g;
                                    StringBuilder sb3 = hVar2.f;
                                    if (str2 != null) {
                                        sb3.append(str2);
                                        hVar2.f34064g = null;
                                    }
                                    sb3.append(d10);
                                    return;
                            }
                        } else {
                            bVar.l(this);
                            bVar.o(kVar);
                            return;
                        }
                    } else {
                        bVar.o(c.f34133j0);
                        return;
                    }
                }
                bVar.m(this);
                Token.h hVar3 = bVar.f34117k;
                hVar3.f34065h = true;
                String str3 = hVar3.f34064g;
                StringBuilder sb4 = hVar3.f;
                if (str3 != null) {
                    sb4.append(str3);
                    hVar3.f34064g = null;
                }
                sb4.append(d10);
                return;
            }
            bVar.o(c.f34127d0);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum b1 extends c {
        public b1() {
            super("AfterDoctypePublicIdentifier", 58);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r' && d10 != ' ') {
                if (d10 != '\"') {
                    if (d10 != '\'') {
                        k kVar = c.f34142s;
                        if (d10 != '>') {
                            Token.d dVar = bVar.f34119m;
                            if (d10 != 65535) {
                                bVar.m(this);
                                dVar.f34061h = true;
                                bVar.o(c.H0);
                                return;
                            } else {
                                bVar.l(this);
                                dVar.f34061h = true;
                                bVar.j();
                                bVar.o(kVar);
                                return;
                            }
                        }
                        bVar.j();
                        bVar.o(kVar);
                        return;
                    }
                    bVar.m(this);
                    bVar.o(c.F0);
                    return;
                }
                bVar.m(this);
                bVar.o(c.E0);
                return;
            }
            bVar.o(c.B0);
        }
    }

    /* compiled from: TokeniserState.java */
    /* renamed from: org.jsoup.parser.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum C0455c extends c {
        public C0455c() {
            super("RCDATAEndTagOpen", 11);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            if (characterReader.p()) {
                bVar.c(false);
                Token.h hVar = bVar.f34117k;
                char current = characterReader.current();
                hVar.getClass();
                hVar.k(String.valueOf(current));
                bVar.f34114h.append(characterReader.current());
                bVar.o(c.E);
                bVar.f34108a.advance();
                return;
            }
            bVar.f("</");
            bVar.o(c.f34146u);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum c0 extends c {
        public c0() {
            super("AfterAttributeName", 35);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            b0 b0Var = c.f34126c0;
            if (d10 != 0) {
                if (d10 != ' ') {
                    if (d10 != '\"' && d10 != '\'') {
                        if (d10 != '/') {
                            k kVar = c.f34142s;
                            if (d10 != 65535) {
                                if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r') {
                                    switch (d10) {
                                        case '<':
                                            break;
                                        case '=':
                                            bVar.o(c.f34128e0);
                                            return;
                                        case '>':
                                            bVar.k();
                                            bVar.o(kVar);
                                            return;
                                        default:
                                            bVar.f34117k.o();
                                            characterReader.u();
                                            bVar.o(b0Var);
                                            return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                bVar.l(this);
                                bVar.o(kVar);
                                return;
                            }
                        } else {
                            bVar.o(c.f34133j0);
                            return;
                        }
                    }
                    bVar.m(this);
                    bVar.f34117k.o();
                    Token.h hVar = bVar.f34117k;
                    hVar.f34065h = true;
                    String str = hVar.f34064g;
                    StringBuilder sb2 = hVar.f;
                    if (str != null) {
                        sb2.append(str);
                        hVar.f34064g = null;
                    }
                    sb2.append(d10);
                    bVar.o(b0Var);
                    return;
                }
                return;
            }
            bVar.m(this);
            Token.h hVar2 = bVar.f34117k;
            hVar2.f34065h = true;
            String str2 = hVar2.f34064g;
            StringBuilder sb3 = hVar2.f;
            if (str2 != null) {
                sb3.append(str2);
                hVar2.f34064g = null;
            }
            sb3.append((char) 65533);
            bVar.o(b0Var);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum c1 extends c {
        public c1() {
            super("Rawtext", 4);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            c.a(bVar, characterReader, this, c.F);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum d extends c {
        public d() {
            super("RCDATAEndTagName", 12);
        }

        public static void e(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            bVar.f("</");
            bVar.g(bVar.f34114h);
            characterReader.u();
            bVar.o(c.f34146u);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            if (characterReader.p()) {
                String g6 = characterReader.g();
                bVar.f34117k.k(g6);
                bVar.f34114h.append(g6);
                return;
            }
            char d10 = characterReader.d();
            if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r' && d10 != ' ') {
                if (d10 != '/') {
                    if (d10 != '>') {
                        e(bVar, characterReader);
                        return;
                    } else if (bVar.n()) {
                        bVar.k();
                        bVar.o(c.f34142s);
                        return;
                    } else {
                        e(bVar, characterReader);
                        return;
                    }
                }
                if (bVar.n()) {
                    bVar.o(c.f34133j0);
                    return;
                } else {
                    e(bVar, characterReader);
                    return;
                }
            }
            if (bVar.n()) {
                bVar.o(c.Z);
            } else {
                e(bVar, characterReader);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum d0 extends c {
        public d0() {
            super("BeforeAttributeValue", 36);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            h0 h0Var = c.f34131h0;
            if (d10 != 0) {
                if (d10 != ' ') {
                    if (d10 != '\"') {
                        if (d10 != '`') {
                            k kVar = c.f34142s;
                            if (d10 != 65535) {
                                if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r') {
                                    if (d10 != '&') {
                                        if (d10 != '\'') {
                                            switch (d10) {
                                                case '<':
                                                case '=':
                                                    break;
                                                case '>':
                                                    bVar.m(this);
                                                    bVar.k();
                                                    bVar.o(kVar);
                                                    return;
                                                default:
                                                    characterReader.u();
                                                    bVar.o(h0Var);
                                                    return;
                                            }
                                        } else {
                                            bVar.o(c.f34130g0);
                                            return;
                                        }
                                    } else {
                                        characterReader.u();
                                        bVar.o(h0Var);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                bVar.l(this);
                                bVar.k();
                                bVar.o(kVar);
                                return;
                            }
                        }
                        bVar.m(this);
                        bVar.f34117k.h(d10);
                        bVar.o(h0Var);
                        return;
                    }
                    bVar.o(c.f34129f0);
                    return;
                }
                return;
            }
            bVar.m(this);
            bVar.f34117k.h((char) 65533);
            bVar.o(h0Var);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum d1 extends c {
        public d1() {
            super("BetweenDoctypePublicAndSystemIdentifiers", 59);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r' && d10 != ' ') {
                if (d10 != '\"') {
                    if (d10 != '\'') {
                        k kVar = c.f34142s;
                        if (d10 != '>') {
                            Token.d dVar = bVar.f34119m;
                            if (d10 != 65535) {
                                bVar.m(this);
                                dVar.f34061h = true;
                                bVar.o(c.H0);
                                return;
                            } else {
                                bVar.l(this);
                                dVar.f34061h = true;
                                bVar.j();
                                bVar.o(kVar);
                                return;
                            }
                        }
                        bVar.j();
                        bVar.o(kVar);
                        return;
                    }
                    bVar.m(this);
                    bVar.o(c.F0);
                    return;
                }
                bVar.m(this);
                bVar.o(c.E0);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum e extends c {
        public e() {
            super("RawtextLessthanSign", 13);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            if (characterReader.n('/')) {
                bVar.d();
                bVar.o(c.G);
                bVar.f34108a.advance();
            } else {
                bVar.e('<');
                bVar.o(c.f34150w);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum e0 extends c {
        public e0() {
            super("AttributeValue_doubleQuoted", 37);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            String e10 = characterReader.e(false);
            if (e10.length() > 0) {
                bVar.f34117k.i(e10);
            } else {
                bVar.f34117k.f34069l = true;
            }
            char d10 = characterReader.d();
            if (d10 != 0) {
                if (d10 != '\"') {
                    if (d10 != '&') {
                        if (d10 != 65535) {
                            bVar.f34117k.h(d10);
                            return;
                        } else {
                            bVar.l(this);
                            bVar.o(c.f34142s);
                            return;
                        }
                    }
                    int[] b10 = bVar.b('\"', true);
                    if (b10 != null) {
                        bVar.f34117k.j(b10);
                        return;
                    } else {
                        bVar.f34117k.h('&');
                        return;
                    }
                }
                bVar.o(c.f34132i0);
                return;
            }
            bVar.m(this);
            bVar.f34117k.h((char) 65533);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum e1 extends c {
        public e1() {
            super("AfterDoctypeSystemKeyword", 60);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r' && d10 != ' ') {
                if (d10 != '\"') {
                    if (d10 != '\'') {
                        k kVar = c.f34142s;
                        Token.d dVar = bVar.f34119m;
                        if (d10 != '>') {
                            if (d10 != 65535) {
                                bVar.m(this);
                                dVar.f34061h = true;
                                bVar.j();
                                return;
                            } else {
                                bVar.l(this);
                                dVar.f34061h = true;
                                bVar.j();
                                bVar.o(kVar);
                                return;
                            }
                        }
                        bVar.m(this);
                        dVar.f34061h = true;
                        bVar.j();
                        bVar.o(kVar);
                        return;
                    }
                    bVar.m(this);
                    bVar.o(c.F0);
                    return;
                }
                bVar.m(this);
                bVar.o(c.E0);
                return;
            }
            bVar.o(c.D0);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum f extends c {
        public f() {
            super("RawtextEndTagOpen", 14);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            g gVar = c.H;
            c1 c1Var = c.f34150w;
            if (characterReader.p()) {
                bVar.c(false);
                bVar.o(gVar);
            } else {
                bVar.f("</");
                bVar.o(c1Var);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum f0 extends c {
        public f0() {
            super("AttributeValue_singleQuoted", 38);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            String e10 = characterReader.e(true);
            if (e10.length() > 0) {
                bVar.f34117k.i(e10);
            } else {
                bVar.f34117k.f34069l = true;
            }
            char d10 = characterReader.d();
            if (d10 != 0) {
                if (d10 != 65535) {
                    if (d10 != '&') {
                        if (d10 != '\'') {
                            bVar.f34117k.h(d10);
                            return;
                        } else {
                            bVar.o(c.f34132i0);
                            return;
                        }
                    }
                    int[] b10 = bVar.b('\'', true);
                    if (b10 != null) {
                        bVar.f34117k.j(b10);
                        return;
                    } else {
                        bVar.f34117k.h('&');
                        return;
                    }
                }
                bVar.l(this);
                bVar.o(c.f34142s);
                return;
            }
            bVar.m(this);
            bVar.f34117k.h((char) 65533);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum f1 extends c {
        public f1() {
            super("BeforeDoctypeSystemIdentifier", 61);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r' && d10 != ' ') {
                if (d10 != '\"') {
                    if (d10 != '\'') {
                        k kVar = c.f34142s;
                        Token.d dVar = bVar.f34119m;
                        if (d10 != '>') {
                            if (d10 != 65535) {
                                bVar.m(this);
                                dVar.f34061h = true;
                                bVar.o(c.H0);
                                return;
                            } else {
                                bVar.l(this);
                                dVar.f34061h = true;
                                bVar.j();
                                bVar.o(kVar);
                                return;
                            }
                        }
                        bVar.m(this);
                        dVar.f34061h = true;
                        bVar.j();
                        bVar.o(kVar);
                        return;
                    }
                    bVar.o(c.F0);
                    return;
                }
                bVar.o(c.E0);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum g extends c {
        public g() {
            super("RawtextEndTagName", 15);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            c.b(bVar, characterReader, c.f34150w);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum g0 extends c {
        public g0() {
            super("Rcdata", 2);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current != 0) {
                CharacterReader characterReader2 = bVar.f34108a;
                if (current != '&') {
                    if (current != '<') {
                        if (current != 65535) {
                            bVar.f(characterReader.f());
                            return;
                        } else {
                            bVar.h(new Token.e());
                            return;
                        }
                    }
                    bVar.o(c.C);
                    characterReader2.advance();
                    return;
                }
                bVar.o(c.f34148v);
                characterReader2.advance();
                return;
            }
            bVar.m(this);
            characterReader.advance();
            bVar.e((char) 65533);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum g1 extends c {
        public g1() {
            super("DoctypeSystemIdentifier_doubleQuoted", 62);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            Token.d dVar = bVar.f34119m;
            if (d10 != 0) {
                if (d10 != '\"') {
                    k kVar = c.f34142s;
                    if (d10 != '>') {
                        if (d10 != 65535) {
                            dVar.f34060g.append(d10);
                            return;
                        }
                        bVar.l(this);
                        dVar.f34061h = true;
                        bVar.j();
                        bVar.o(kVar);
                        return;
                    }
                    bVar.m(this);
                    dVar.f34061h = true;
                    bVar.j();
                    bVar.o(kVar);
                    return;
                }
                bVar.o(c.G0);
                return;
            }
            bVar.m(this);
            dVar.f34060g.append((char) 65533);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum h extends c {
        public h() {
            super("ScriptDataLessthanSign", 16);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            if (d10 != '!') {
                if (d10 != '/') {
                    if (d10 != 65535) {
                        bVar.f("<");
                        characterReader.u();
                        bVar.o(c.f34152x);
                        return;
                    } else {
                        bVar.f("<");
                        bVar.l(this);
                        bVar.o(c.f34142s);
                        return;
                    }
                }
                bVar.d();
                bVar.o(c.J);
                return;
            }
            bVar.f("<!");
            bVar.o(c.L);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum h0 extends c {
        public h0() {
            super("AttributeValue_unquoted", 39);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            String h10 = characterReader.h(c.K0);
            if (h10.length() > 0) {
                bVar.f34117k.i(h10);
            }
            char d10 = characterReader.d();
            if (d10 != 0) {
                if (d10 != ' ') {
                    if (d10 != '\"' && d10 != '`') {
                        k kVar = c.f34142s;
                        if (d10 != 65535) {
                            if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r') {
                                if (d10 != '&') {
                                    if (d10 != '\'') {
                                        switch (d10) {
                                            case '<':
                                            case '=':
                                                break;
                                            case '>':
                                                bVar.k();
                                                bVar.o(kVar);
                                                return;
                                            default:
                                                bVar.f34117k.h(d10);
                                                return;
                                        }
                                    }
                                } else {
                                    int[] b10 = bVar.b('>', true);
                                    if (b10 != null) {
                                        bVar.f34117k.j(b10);
                                        return;
                                    } else {
                                        bVar.f34117k.h('&');
                                        return;
                                    }
                                }
                            }
                        } else {
                            bVar.l(this);
                            bVar.o(kVar);
                            return;
                        }
                    }
                    bVar.m(this);
                    bVar.f34117k.h(d10);
                    return;
                }
                bVar.o(c.Z);
                return;
            }
            bVar.m(this);
            bVar.f34117k.h((char) 65533);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum h1 extends c {
        public h1() {
            super("DoctypeSystemIdentifier_singleQuoted", 63);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            Token.d dVar = bVar.f34119m;
            if (d10 != 0) {
                if (d10 != '\'') {
                    k kVar = c.f34142s;
                    if (d10 != '>') {
                        if (d10 != 65535) {
                            dVar.f34060g.append(d10);
                            return;
                        }
                        bVar.l(this);
                        dVar.f34061h = true;
                        bVar.j();
                        bVar.o(kVar);
                        return;
                    }
                    bVar.m(this);
                    dVar.f34061h = true;
                    bVar.j();
                    bVar.o(kVar);
                    return;
                }
                bVar.o(c.G0);
                return;
            }
            bVar.m(this);
            dVar.f34060g.append((char) 65533);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum i extends c {
        public i() {
            super("ScriptDataEndTagOpen", 17);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            j jVar = c.K;
            l1 l1Var = c.f34152x;
            if (characterReader.p()) {
                bVar.c(false);
                bVar.o(jVar);
            } else {
                bVar.f("</");
                bVar.o(l1Var);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum i0 extends c {
        public i0() {
            super("AfterAttributeValue_quoted", 40);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            a0 a0Var = c.Z;
            if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r' && d10 != ' ') {
                if (d10 != '/') {
                    k kVar = c.f34142s;
                    if (d10 != '>') {
                        if (d10 != 65535) {
                            characterReader.u();
                            bVar.m(this);
                            bVar.o(a0Var);
                            return;
                        } else {
                            bVar.l(this);
                            bVar.o(kVar);
                            return;
                        }
                    }
                    bVar.k();
                    bVar.o(kVar);
                    return;
                }
                bVar.o(c.f34133j0);
                return;
            }
            bVar.o(a0Var);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum i1 extends c {
        public i1() {
            super("AfterDoctypeSystemIdentifier", 64);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r' && d10 != ' ') {
                k kVar = c.f34142s;
                if (d10 != '>') {
                    if (d10 != 65535) {
                        bVar.m(this);
                        bVar.o(c.H0);
                        return;
                    } else {
                        bVar.l(this);
                        bVar.f34119m.f34061h = true;
                        bVar.j();
                        bVar.o(kVar);
                        return;
                    }
                }
                bVar.j();
                bVar.o(kVar);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum j extends c {
        public j() {
            super("ScriptDataEndTagName", 18);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            c.b(bVar, characterReader, c.f34152x);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum j0 extends c {
        public j0() {
            super("SelfClosingStartTag", 41);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            k kVar = c.f34142s;
            if (d10 != '>') {
                if (d10 != 65535) {
                    characterReader.u();
                    bVar.m(this);
                    bVar.o(c.Z);
                    return;
                } else {
                    bVar.l(this);
                    bVar.o(kVar);
                    return;
                }
            }
            bVar.f34117k.f34070m = true;
            bVar.k();
            bVar.o(kVar);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum j1 extends c {
        public j1() {
            super("BogusDoctype", 65);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            k kVar = c.f34142s;
            if (d10 != '>') {
                if (d10 == 65535) {
                    bVar.j();
                    bVar.o(kVar);
                    return;
                }
                return;
            }
            bVar.j();
            bVar.o(kVar);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum k extends c {
        public k() {
            super("Data", 0);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current != 0) {
                CharacterReader characterReader2 = bVar.f34108a;
                if (current != '&') {
                    if (current != '<') {
                        if (current != 65535) {
                            bVar.f(characterReader.f());
                            return;
                        } else {
                            bVar.h(new Token.e());
                            return;
                        }
                    }
                    bVar.o(c.f34154z);
                    characterReader2.advance();
                    return;
                }
                bVar.o(c.f34144t);
                characterReader2.advance();
                return;
            }
            bVar.m(this);
            bVar.e(characterReader.d());
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum k0 extends c {
        public k0() {
            super("BogusComment", 42);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            bVar.f34120n.i(characterReader.consumeTo('>'));
            char current = characterReader.current();
            if (current == '>' || current == 65535) {
                characterReader.d();
                bVar.i();
                bVar.o(c.f34142s);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum k1 extends c {
        public k1() {
            super("CdataSection", 66);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            String b10;
            int r10 = characterReader.r("]]>");
            if (r10 != -1) {
                b10 = CharacterReader.b(characterReader.f34009a, characterReader.f34015h, characterReader.f34013e, r10);
                characterReader.f34013e += r10;
            } else {
                int i10 = characterReader.f34011c;
                int i11 = characterReader.f34013e;
                if (i10 - i11 < 3) {
                    characterReader.a();
                    char[] cArr = characterReader.f34009a;
                    String[] strArr = characterReader.f34015h;
                    int i12 = characterReader.f34013e;
                    b10 = CharacterReader.b(cArr, strArr, i12, characterReader.f34011c - i12);
                    characterReader.f34013e = characterReader.f34011c;
                } else {
                    int i13 = (i10 - 3) + 1;
                    b10 = CharacterReader.b(characterReader.f34009a, characterReader.f34015h, i11, i13 - i11);
                    characterReader.f34013e = i13;
                }
            }
            StringBuilder sb2 = bVar.f34114h;
            sb2.append(b10);
            if (characterReader.l("]]>") || characterReader.isEmpty()) {
                bVar.h(new Token.a(sb2.toString()));
                bVar.o(c.f34142s);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum l extends c {
        public l() {
            super("ScriptDataEscapeStart", 19);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            if (characterReader.n('-')) {
                bVar.e('-');
                bVar.o(c.M);
                bVar.f34108a.advance();
                return;
            }
            bVar.o(c.f34152x);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum l0 extends c {
        public l0() {
            super("MarkupDeclarationOpen", 43);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            boolean l10 = characterReader.l("--");
            Token.c cVar = bVar.f34120n;
            if (l10) {
                cVar.f();
                bVar.o(c.f34136m0);
                return;
            }
            if (characterReader.m("DOCTYPE")) {
                bVar.o(c.f34143s0);
                return;
            }
            if (characterReader.l("[CDATA[")) {
                bVar.d();
                bVar.o(c.I0);
            } else {
                bVar.m(this);
                cVar.f();
                cVar.f = true;
                bVar.o(c.f34134k0);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum l1 extends c {
        public l1() {
            super("ScriptData", 5);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            c.a(bVar, characterReader, this, c.I);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum m extends c {
        public m() {
            super("ScriptDataEscapeStartDash", 20);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            if (characterReader.n('-')) {
                bVar.e('-');
                bVar.o(c.P);
                bVar.f34108a.advance();
                return;
            }
            bVar.o(c.f34152x);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum m0 extends c {
        public m0() {
            super("CommentStart", 44);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            o0 o0Var = c.f34138o0;
            if (d10 != 0) {
                if (d10 != '-') {
                    k kVar = c.f34142s;
                    if (d10 != '>') {
                        if (d10 != 65535) {
                            characterReader.u();
                            bVar.o(o0Var);
                            return;
                        } else {
                            bVar.l(this);
                            bVar.i();
                            bVar.o(kVar);
                            return;
                        }
                    }
                    bVar.m(this);
                    bVar.i();
                    bVar.o(kVar);
                    return;
                }
                bVar.o(c.f34137n0);
                return;
            }
            bVar.m(this);
            bVar.f34120n.h((char) 65533);
            bVar.o(o0Var);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum m1 extends c {
        public m1() {
            super("PLAINTEXT", 6);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current != 0) {
                if (current != 65535) {
                    bVar.f(characterReader.consumeTo((char) 0));
                    return;
                } else {
                    bVar.h(new Token.e());
                    return;
                }
            }
            bVar.m(this);
            characterReader.advance();
            bVar.e((char) 65533);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum n extends c {
        public n() {
            super("ScriptDataEscaped", 21);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            if (characterReader.isEmpty()) {
                bVar.l(this);
                bVar.o(c.f34142s);
                return;
            }
            char current = characterReader.current();
            if (current != 0) {
                CharacterReader characterReader2 = bVar.f34108a;
                if (current != '-') {
                    if (current != '<') {
                        bVar.f(characterReader.consumeToAny('-', '<', 0));
                        return;
                    } else {
                        bVar.o(c.Q);
                        characterReader2.advance();
                        return;
                    }
                }
                bVar.e('-');
                bVar.o(c.O);
                characterReader2.advance();
                return;
            }
            bVar.m(this);
            characterReader.advance();
            bVar.e((char) 65533);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum n0 extends c {
        public n0() {
            super("CommentStartDash", 45);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            o0 o0Var = c.f34138o0;
            Token.c cVar = bVar.f34120n;
            if (d10 != 0) {
                if (d10 != '-') {
                    k kVar = c.f34142s;
                    if (d10 != '>') {
                        if (d10 != 65535) {
                            cVar.h(d10);
                            bVar.o(o0Var);
                            return;
                        } else {
                            bVar.l(this);
                            bVar.i();
                            bVar.o(kVar);
                            return;
                        }
                    }
                    bVar.m(this);
                    bVar.i();
                    bVar.o(kVar);
                    return;
                }
                bVar.o(c.f34140q0);
                return;
            }
            bVar.m(this);
            cVar.h((char) 65533);
            bVar.o(o0Var);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum n1 extends c {
        public n1() {
            super("TagOpen", 7);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char current = characterReader.current();
            CharacterReader characterReader2 = bVar.f34108a;
            if (current != '!') {
                if (current != '/') {
                    if (current != '?') {
                        if (characterReader.p()) {
                            bVar.c(true);
                            bVar.o(c.B);
                            return;
                        } else {
                            bVar.m(this);
                            bVar.e('<');
                            bVar.o(c.f34142s);
                            return;
                        }
                    }
                    Token.c cVar = bVar.f34120n;
                    cVar.f();
                    cVar.f = true;
                    bVar.o(c.f34134k0);
                    return;
                }
                bVar.o(c.A);
                characterReader2.advance();
                return;
            }
            bVar.o(c.f34135l0);
            characterReader2.advance();
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum o extends c {
        public o() {
            super("ScriptDataEscapedDash", 22);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            if (characterReader.isEmpty()) {
                bVar.l(this);
                bVar.o(c.f34142s);
                return;
            }
            char d10 = characterReader.d();
            n nVar = c.N;
            if (d10 != 0) {
                if (d10 != '-') {
                    if (d10 != '<') {
                        bVar.e(d10);
                        bVar.o(nVar);
                        return;
                    } else {
                        bVar.o(c.Q);
                        return;
                    }
                }
                bVar.e(d10);
                bVar.o(c.P);
                return;
            }
            bVar.m(this);
            bVar.e((char) 65533);
            bVar.o(nVar);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum o0 extends c {
        public o0() {
            super("Comment", 46);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char current = characterReader.current();
            Token.c cVar = bVar.f34120n;
            if (current != 0) {
                if (current != '-') {
                    if (current != 65535) {
                        cVar.i(characterReader.consumeToAny('-', 0));
                        return;
                    }
                    bVar.l(this);
                    bVar.i();
                    bVar.o(c.f34142s);
                    return;
                }
                bVar.o(c.f34139p0);
                bVar.f34108a.advance();
                return;
            }
            bVar.m(this);
            characterReader.advance();
            cVar.h((char) 65533);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum o1 extends c {
        public o1() {
            super("EndTagOpen", 8);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            boolean isEmpty = characterReader.isEmpty();
            k kVar = c.f34142s;
            if (isEmpty) {
                bVar.l(this);
                bVar.f("</");
                bVar.o(kVar);
                return;
            }
            if (characterReader.p()) {
                bVar.c(false);
                bVar.o(c.B);
                return;
            }
            if (characterReader.n('>')) {
                bVar.m(this);
                bVar.o(kVar);
                bVar.f34108a.advance();
            } else {
                bVar.m(this);
                Token.c cVar = bVar.f34120n;
                cVar.f();
                cVar.f = true;
                cVar.h('/');
                bVar.o(c.f34134k0);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum p extends c {
        public p() {
            super("ScriptDataEscapedDashDash", 23);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            if (characterReader.isEmpty()) {
                bVar.l(this);
                bVar.o(c.f34142s);
                return;
            }
            char d10 = characterReader.d();
            n nVar = c.N;
            if (d10 != 0) {
                if (d10 != '-') {
                    if (d10 != '<') {
                        if (d10 != '>') {
                            bVar.e(d10);
                            bVar.o(nVar);
                            return;
                        } else {
                            bVar.e(d10);
                            bVar.o(c.f34152x);
                            return;
                        }
                    }
                    bVar.o(c.Q);
                    return;
                }
                bVar.e(d10);
                return;
            }
            bVar.m(this);
            bVar.e((char) 65533);
            bVar.o(nVar);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum p0 extends c {
        public p0() {
            super("CommentEndDash", 47);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            o0 o0Var = c.f34138o0;
            Token.c cVar = bVar.f34120n;
            if (d10 != 0) {
                if (d10 != '-') {
                    if (d10 != 65535) {
                        cVar.h('-');
                        cVar.h(d10);
                        bVar.o(o0Var);
                        return;
                    } else {
                        bVar.l(this);
                        bVar.i();
                        bVar.o(c.f34142s);
                        return;
                    }
                }
                bVar.o(c.f34140q0);
                return;
            }
            bVar.m(this);
            cVar.h('-');
            cVar.h((char) 65533);
            bVar.o(o0Var);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum q extends c {
        public q() {
            super("ScriptDataEscapedLessthanSign", 24);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            boolean p10 = characterReader.p();
            CharacterReader characterReader2 = bVar.f34108a;
            if (p10) {
                bVar.d();
                bVar.f34114h.append(characterReader.current());
                bVar.f("<");
                bVar.e(characterReader.current());
                bVar.o(c.T);
                characterReader2.advance();
                return;
            }
            if (characterReader.n('/')) {
                bVar.d();
                bVar.o(c.R);
                characterReader2.advance();
            } else {
                bVar.e('<');
                bVar.o(c.N);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum q0 extends c {
        public q0() {
            super("CommentEnd", 48);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            o0 o0Var = c.f34138o0;
            Token.c cVar = bVar.f34120n;
            if (d10 != 0) {
                if (d10 != '!') {
                    if (d10 != '-') {
                        k kVar = c.f34142s;
                        if (d10 != '>') {
                            if (d10 != 65535) {
                                cVar.i("--");
                                cVar.h(d10);
                                bVar.o(o0Var);
                                return;
                            } else {
                                bVar.l(this);
                                bVar.i();
                                bVar.o(kVar);
                                return;
                            }
                        }
                        bVar.i();
                        bVar.o(kVar);
                        return;
                    }
                    cVar.h('-');
                    return;
                }
                bVar.o(c.f34141r0);
                return;
            }
            bVar.m(this);
            cVar.i("--");
            cVar.h((char) 65533);
            bVar.o(o0Var);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum r extends c {
        public r() {
            super("ScriptDataEscapedEndTagOpen", 25);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            if (characterReader.p()) {
                bVar.c(false);
                Token.h hVar = bVar.f34117k;
                char current = characterReader.current();
                hVar.getClass();
                hVar.k(String.valueOf(current));
                bVar.f34114h.append(characterReader.current());
                bVar.o(c.S);
                bVar.f34108a.advance();
                return;
            }
            bVar.f("</");
            bVar.o(c.N);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum r0 extends c {
        public r0() {
            super("CharacterReferenceInRcdata", 3);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            g0 g0Var = c.f34146u;
            int[] b10 = bVar.b(null, false);
            if (b10 == null) {
                bVar.e('&');
            } else {
                bVar.f(new String(b10, 0, b10.length));
            }
            bVar.o(g0Var);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum s extends c {
        public s() {
            super("ScriptDataEscapedEndTagName", 26);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            c.b(bVar, characterReader, c.N);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum s0 extends c {
        public s0() {
            super("CommentEndBang", 49);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            o0 o0Var = c.f34138o0;
            Token.c cVar = bVar.f34120n;
            if (d10 != 0) {
                if (d10 != '-') {
                    k kVar = c.f34142s;
                    if (d10 != '>') {
                        if (d10 != 65535) {
                            cVar.i("--!");
                            cVar.h(d10);
                            bVar.o(o0Var);
                            return;
                        } else {
                            bVar.l(this);
                            bVar.i();
                            bVar.o(kVar);
                            return;
                        }
                    }
                    bVar.i();
                    bVar.o(kVar);
                    return;
                }
                cVar.i("--!");
                bVar.o(c.f34139p0);
                return;
            }
            bVar.m(this);
            cVar.i("--!");
            cVar.h((char) 65533);
            bVar.o(o0Var);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum t extends c {
        public t() {
            super("ScriptDataDoubleEscapeStart", 27);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            c.c(bVar, characterReader, c.U, c.N);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum t0 extends c {
        public t0() {
            super("Doctype", 50);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            u0 u0Var = c.f34145t0;
            if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r' && d10 != ' ') {
                if (d10 != '>') {
                    if (d10 != 65535) {
                        bVar.m(this);
                        bVar.o(u0Var);
                        return;
                    }
                    bVar.l(this);
                }
                bVar.m(this);
                Token.d dVar = bVar.f34119m;
                dVar.f();
                dVar.f34061h = true;
                bVar.j();
                bVar.o(c.f34142s);
                return;
            }
            bVar.o(u0Var);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum u extends c {
        public u() {
            super("ScriptDataDoubleEscaped", 28);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char current = characterReader.current();
            if (current != 0) {
                CharacterReader characterReader2 = bVar.f34108a;
                if (current != '-') {
                    if (current != '<') {
                        if (current != 65535) {
                            bVar.f(characterReader.consumeToAny('-', '<', 0));
                            return;
                        } else {
                            bVar.l(this);
                            bVar.o(c.f34142s);
                            return;
                        }
                    }
                    bVar.e(current);
                    bVar.o(c.X);
                    characterReader2.advance();
                    return;
                }
                bVar.e(current);
                bVar.o(c.V);
                characterReader2.advance();
                return;
            }
            bVar.m(this);
            characterReader.advance();
            bVar.e((char) 65533);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum u0 extends c {
        public u0() {
            super("BeforeDoctypeName", 51);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            boolean p10 = characterReader.p();
            v0 v0Var = c.f34147u0;
            Token.d dVar = bVar.f34119m;
            if (p10) {
                dVar.f();
                bVar.o(v0Var);
                return;
            }
            char d10 = characterReader.d();
            if (d10 != 0) {
                if (d10 != ' ') {
                    if (d10 != 65535) {
                        if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r') {
                            dVar.f();
                            dVar.f34058d.append(d10);
                            bVar.o(v0Var);
                            return;
                        }
                        return;
                    }
                    bVar.l(this);
                    dVar.f();
                    dVar.f34061h = true;
                    bVar.j();
                    bVar.o(c.f34142s);
                    return;
                }
                return;
            }
            bVar.m(this);
            dVar.f();
            dVar.f34058d.append((char) 65533);
            bVar.o(v0Var);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum v extends c {
        public v() {
            super("CharacterReferenceInData", 1);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            k kVar = c.f34142s;
            int[] b10 = bVar.b(null, false);
            if (b10 == null) {
                bVar.e('&');
            } else {
                bVar.f(new String(b10, 0, b10.length));
            }
            bVar.o(kVar);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum v0 extends c {
        public v0() {
            super("DoctypeName", 52);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            boolean q10 = characterReader.q();
            Token.d dVar = bVar.f34119m;
            if (q10) {
                dVar.f34058d.append(characterReader.g());
                return;
            }
            char d10 = characterReader.d();
            if (d10 != 0) {
                if (d10 != ' ') {
                    k kVar = c.f34142s;
                    if (d10 != '>') {
                        if (d10 != 65535) {
                            if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r') {
                                dVar.f34058d.append(d10);
                                return;
                            }
                        } else {
                            bVar.l(this);
                            dVar.f34061h = true;
                            bVar.j();
                            bVar.o(kVar);
                            return;
                        }
                    } else {
                        bVar.j();
                        bVar.o(kVar);
                        return;
                    }
                }
                bVar.o(c.f34149v0);
                return;
            }
            bVar.m(this);
            dVar.f34058d.append((char) 65533);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum w extends c {
        public w() {
            super("ScriptDataDoubleEscapedDash", 29);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            u uVar = c.U;
            if (d10 != 0) {
                if (d10 != '-') {
                    if (d10 != '<') {
                        if (d10 != 65535) {
                            bVar.e(d10);
                            bVar.o(uVar);
                            return;
                        } else {
                            bVar.l(this);
                            bVar.o(c.f34142s);
                            return;
                        }
                    }
                    bVar.e(d10);
                    bVar.o(c.X);
                    return;
                }
                bVar.e(d10);
                bVar.o(c.W);
                return;
            }
            bVar.m(this);
            bVar.e((char) 65533);
            bVar.o(uVar);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum w0 extends c {
        public w0() {
            super("AfterDoctypeName", 53);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            boolean isEmpty = characterReader.isEmpty();
            k kVar = c.f34142s;
            Token.d dVar = bVar.f34119m;
            if (isEmpty) {
                bVar.l(this);
                dVar.f34061h = true;
                bVar.j();
                bVar.o(kVar);
                return;
            }
            if (characterReader.o('\t', '\n', '\r', '\f', ' ')) {
                characterReader.advance();
                return;
            }
            boolean n10 = characterReader.n('>');
            CharacterReader characterReader2 = bVar.f34108a;
            if (n10) {
                bVar.j();
                bVar.o(kVar);
                characterReader2.advance();
            } else if (characterReader.m(DocumentType.PUBLIC_KEY)) {
                dVar.f34059e = DocumentType.PUBLIC_KEY;
                bVar.o(c.f34151w0);
            } else if (characterReader.m(DocumentType.SYSTEM_KEY)) {
                dVar.f34059e = DocumentType.SYSTEM_KEY;
                bVar.o(c.C0);
            } else {
                bVar.m(this);
                dVar.f34061h = true;
                bVar.o(c.H0);
                characterReader2.advance();
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum x extends c {
        public x() {
            super("ScriptDataDoubleEscapedDashDash", 30);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            u uVar = c.U;
            if (d10 != 0) {
                if (d10 != '-') {
                    if (d10 != '<') {
                        if (d10 != '>') {
                            if (d10 != 65535) {
                                bVar.e(d10);
                                bVar.o(uVar);
                                return;
                            } else {
                                bVar.l(this);
                                bVar.o(c.f34142s);
                                return;
                            }
                        }
                        bVar.e(d10);
                        bVar.o(c.f34152x);
                        return;
                    }
                    bVar.e(d10);
                    bVar.o(c.X);
                    return;
                }
                bVar.e(d10);
                return;
            }
            bVar.m(this);
            bVar.e((char) 65533);
            bVar.o(uVar);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum x0 extends c {
        public x0() {
            super("AfterDoctypePublicKeyword", 54);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r' && d10 != ' ') {
                if (d10 != '\"') {
                    if (d10 != '\'') {
                        k kVar = c.f34142s;
                        Token.d dVar = bVar.f34119m;
                        if (d10 != '>') {
                            if (d10 != 65535) {
                                bVar.m(this);
                                dVar.f34061h = true;
                                bVar.o(c.H0);
                                return;
                            } else {
                                bVar.l(this);
                                dVar.f34061h = true;
                                bVar.j();
                                bVar.o(kVar);
                                return;
                            }
                        }
                        bVar.m(this);
                        dVar.f34061h = true;
                        bVar.j();
                        bVar.o(kVar);
                        return;
                    }
                    bVar.m(this);
                    bVar.o(c.f34155z0);
                    return;
                }
                bVar.m(this);
                bVar.o(c.y0);
                return;
            }
            bVar.o(c.f34153x0);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum y extends c {
        public y() {
            super("ScriptDataDoubleEscapedLessthanSign", 31);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            if (characterReader.n('/')) {
                bVar.e('/');
                bVar.d();
                bVar.o(c.Y);
                bVar.f34108a.advance();
                return;
            }
            bVar.o(c.U);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum y0 extends c {
        public y0() {
            super("BeforeDoctypePublicIdentifier", 55);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r' && d10 != ' ') {
                if (d10 != '\"') {
                    if (d10 != '\'') {
                        k kVar = c.f34142s;
                        Token.d dVar = bVar.f34119m;
                        if (d10 != '>') {
                            if (d10 != 65535) {
                                bVar.m(this);
                                dVar.f34061h = true;
                                bVar.o(c.H0);
                                return;
                            } else {
                                bVar.l(this);
                                dVar.f34061h = true;
                                bVar.j();
                                bVar.o(kVar);
                                return;
                            }
                        }
                        bVar.m(this);
                        dVar.f34061h = true;
                        bVar.j();
                        bVar.o(kVar);
                        return;
                    }
                    bVar.o(c.f34155z0);
                    return;
                }
                bVar.o(c.y0);
            }
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum z extends c {
        public z() {
            super("ScriptDataDoubleEscapeEnd", 32);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            c.c(bVar, characterReader, c.N, c.U);
        }
    }

    /* compiled from: TokeniserState.java */
    /* loaded from: classes2.dex */
    public enum z0 extends c {
        public z0() {
            super("DoctypePublicIdentifier_doubleQuoted", 56);
        }

        @Override // org.jsoup.parser.c
        public final void d(org.jsoup.parser.b bVar, CharacterReader characterReader) {
            char d10 = characterReader.d();
            Token.d dVar = bVar.f34119m;
            if (d10 != 0) {
                if (d10 != '\"') {
                    k kVar = c.f34142s;
                    if (d10 != '>') {
                        if (d10 != 65535) {
                            dVar.f.append(d10);
                            return;
                        }
                        bVar.l(this);
                        dVar.f34061h = true;
                        bVar.j();
                        bVar.o(kVar);
                        return;
                    }
                    bVar.m(this);
                    dVar.f34061h = true;
                    bVar.j();
                    bVar.o(kVar);
                    return;
                }
                bVar.o(c.A0);
                return;
            }
            bVar.m(this);
            dVar.f.append((char) 65533);
        }
    }

    static {
        k kVar = new k();
        f34142s = kVar;
        v vVar = new v();
        f34144t = vVar;
        g0 g0Var = new g0();
        f34146u = g0Var;
        r0 r0Var = new r0();
        f34148v = r0Var;
        c1 c1Var = new c1();
        f34150w = c1Var;
        l1 l1Var = new l1();
        f34152x = l1Var;
        m1 m1Var = new m1();
        y = m1Var;
        n1 n1Var = new n1();
        f34154z = n1Var;
        o1 o1Var = new o1();
        A = o1Var;
        a aVar = new a();
        B = aVar;
        b bVar = new b();
        C = bVar;
        C0455c c0455c = new C0455c();
        D = c0455c;
        d dVar = new d();
        E = dVar;
        e eVar = new e();
        F = eVar;
        f fVar = new f();
        G = fVar;
        g gVar = new g();
        H = gVar;
        h hVar = new h();
        I = hVar;
        i iVar = new i();
        J = iVar;
        j jVar = new j();
        K = jVar;
        l lVar = new l();
        L = lVar;
        m mVar = new m();
        M = mVar;
        n nVar = new n();
        N = nVar;
        o oVar = new o();
        O = oVar;
        p pVar = new p();
        P = pVar;
        q qVar = new q();
        Q = qVar;
        r rVar = new r();
        R = rVar;
        s sVar = new s();
        S = sVar;
        t tVar = new t();
        T = tVar;
        u uVar = new u();
        U = uVar;
        w wVar = new w();
        V = wVar;
        x xVar = new x();
        W = xVar;
        y yVar = new y();
        X = yVar;
        z zVar = new z();
        Y = zVar;
        a0 a0Var = new a0();
        Z = a0Var;
        b0 b0Var = new b0();
        f34126c0 = b0Var;
        c0 c0Var = new c0();
        f34127d0 = c0Var;
        d0 d0Var = new d0();
        f34128e0 = d0Var;
        e0 e0Var = new e0();
        f34129f0 = e0Var;
        f0 f0Var = new f0();
        f34130g0 = f0Var;
        h0 h0Var = new h0();
        f34131h0 = h0Var;
        i0 i0Var = new i0();
        f34132i0 = i0Var;
        j0 j0Var = new j0();
        f34133j0 = j0Var;
        k0 k0Var = new k0();
        f34134k0 = k0Var;
        l0 l0Var = new l0();
        f34135l0 = l0Var;
        m0 m0Var = new m0();
        f34136m0 = m0Var;
        n0 n0Var = new n0();
        f34137n0 = n0Var;
        o0 o0Var = new o0();
        f34138o0 = o0Var;
        p0 p0Var = new p0();
        f34139p0 = p0Var;
        q0 q0Var = new q0();
        f34140q0 = q0Var;
        s0 s0Var = new s0();
        f34141r0 = s0Var;
        t0 t0Var = new t0();
        f34143s0 = t0Var;
        u0 u0Var = new u0();
        f34145t0 = u0Var;
        v0 v0Var = new v0();
        f34147u0 = v0Var;
        w0 w0Var = new w0();
        f34149v0 = w0Var;
        x0 x0Var = new x0();
        f34151w0 = x0Var;
        y0 y0Var = new y0();
        f34153x0 = y0Var;
        z0 z0Var = new z0();
        y0 = z0Var;
        a1 a1Var = new a1();
        f34155z0 = a1Var;
        b1 b1Var = new b1();
        A0 = b1Var;
        d1 d1Var = new d1();
        B0 = d1Var;
        e1 e1Var = new e1();
        C0 = e1Var;
        f1 f1Var = new f1();
        D0 = f1Var;
        g1 g1Var = new g1();
        E0 = g1Var;
        h1 h1Var = new h1();
        F0 = h1Var;
        i1 i1Var = new i1();
        G0 = i1Var;
        j1 j1Var = new j1();
        H0 = j1Var;
        k1 k1Var = new k1();
        I0 = k1Var;
        M0 = new c[]{kVar, vVar, g0Var, r0Var, c1Var, l1Var, m1Var, n1Var, o1Var, aVar, bVar, c0455c, dVar, eVar, fVar, gVar, hVar, iVar, jVar, lVar, mVar, nVar, oVar, pVar, qVar, rVar, sVar, tVar, uVar, wVar, xVar, yVar, zVar, a0Var, b0Var, c0Var, d0Var, e0Var, f0Var, h0Var, i0Var, j0Var, k0Var, l0Var, m0Var, n0Var, o0Var, p0Var, q0Var, s0Var, t0Var, u0Var, v0Var, w0Var, x0Var, y0Var, z0Var, a1Var, b1Var, d1Var, e1Var, f1Var, g1Var, h1Var, i1Var, j1Var, k1Var};
        J0 = new char[]{'\t', '\n', '\f', '\r', ' ', '\"', '\'', '/', '<', '=', '>'};
        K0 = new char[]{0, '\t', '\n', '\f', '\r', ' ', '\"', '&', '\'', '<', '=', '>', '`'};
        L0 = String.valueOf((char) 65533);
    }

    public c() {
        throw null;
    }

    public c(String str, int i10) {
    }

    public static void a(org.jsoup.parser.b bVar, CharacterReader characterReader, c cVar, c cVar2) {
        String str;
        char current = characterReader.current();
        if (current != 0) {
            if (current != '<') {
                if (current != 65535) {
                    int i10 = characterReader.f34013e;
                    int i11 = characterReader.f34011c;
                    char[] cArr = characterReader.f34009a;
                    int i12 = i10;
                    while (i12 < i11) {
                        char c10 = cArr[i12];
                        if (c10 == 0 || c10 == '<') {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    characterReader.f34013e = i12;
                    if (i12 > i10) {
                        str = CharacterReader.b(characterReader.f34009a, characterReader.f34015h, i10, i12 - i10);
                    } else {
                        str = "";
                    }
                    bVar.f(str);
                    return;
                }
                bVar.h(new Token.e());
                return;
            }
            bVar.o(cVar2);
            bVar.f34108a.advance();
            return;
        }
        bVar.m(cVar);
        characterReader.advance();
        bVar.e((char) 65533);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(org.jsoup.parser.b r2, org.jsoup.parser.CharacterReader r3, org.jsoup.parser.c r4) {
        /*
            boolean r0 = r3.q()
            java.lang.StringBuilder r1 = r2.f34114h
            if (r0 == 0) goto L15
            java.lang.String r3 = r3.g()
            org.jsoup.parser.Token$h r2 = r2.f34117k
            r2.k(r3)
            r1.append(r3)
            goto L69
        L15:
            boolean r0 = r2.n()
            if (r0 == 0) goto L5b
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L5b
            char r3 = r3.d()
            r0 = 9
            if (r3 == r0) goto L54
            r0 = 10
            if (r3 == r0) goto L54
            r0 = 12
            if (r3 == r0) goto L54
            r0 = 13
            if (r3 == r0) goto L54
            r0 = 32
            if (r3 == r0) goto L54
            r0 = 47
            if (r3 == r0) goto L4e
            r0 = 62
            if (r3 == r0) goto L45
            r1.append(r3)
            goto L5b
        L45:
            r2.k()
            org.jsoup.parser.c$k r3 = org.jsoup.parser.c.f34142s
            r2.o(r3)
            goto L59
        L4e:
            org.jsoup.parser.c$j0 r3 = org.jsoup.parser.c.f34133j0
            r2.o(r3)
            goto L59
        L54:
            org.jsoup.parser.c$a0 r3 = org.jsoup.parser.c.Z
            r2.o(r3)
        L59:
            r3 = 0
            goto L5c
        L5b:
            r3 = 1
        L5c:
            if (r3 == 0) goto L69
            java.lang.String r3 = "</"
            r2.f(r3)
            r2.g(r1)
            r2.o(r4)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.c.b(org.jsoup.parser.b, org.jsoup.parser.CharacterReader, org.jsoup.parser.c):void");
    }

    public static void c(org.jsoup.parser.b bVar, CharacterReader characterReader, c cVar, c cVar2) {
        boolean q10 = characterReader.q();
        StringBuilder sb2 = bVar.f34114h;
        if (q10) {
            String g6 = characterReader.g();
            sb2.append(g6);
            bVar.f(g6);
            return;
        }
        char d10 = characterReader.d();
        if (d10 != '\t' && d10 != '\n' && d10 != '\f' && d10 != '\r' && d10 != ' ' && d10 != '/' && d10 != '>') {
            characterReader.u();
            bVar.o(cVar2);
        } else {
            if (sb2.toString().equals("script")) {
                bVar.o(cVar);
            } else {
                bVar.o(cVar2);
            }
            bVar.e(d10);
        }
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) M0.clone();
    }

    public abstract void d(org.jsoup.parser.b bVar, CharacterReader characterReader);
}
