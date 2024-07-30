package org.jsoup.parser;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.huawei.openalliance.ad.constant.av;
import com.vungle.warren.ui.contract.AdContract;
import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Token;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HtmlTreeBuilderState.java */
/* loaded from: classes2.dex */
public abstract class a {
    public static final y A;
    public static final C0454a B;
    public static final b C;
    public static final c D;
    public static final d E;
    public static final e F;
    public static final f G;
    public static final g H;
    public static final h I;
    public static final i J;
    public static final j K;
    public static final l L;
    public static final m M;
    public static final n N;
    public static final o O;
    public static final String P;
    public static final /* synthetic */ a[] Q;

    /* renamed from: s, reason: collision with root package name */
    public static final k f34075s;

    /* renamed from: t, reason: collision with root package name */
    public static final r f34076t;

    /* renamed from: u, reason: collision with root package name */
    public static final s f34077u;

    /* renamed from: v, reason: collision with root package name */
    public static final t f34078v;

    /* renamed from: w, reason: collision with root package name */
    public static final u f34079w;

    /* renamed from: x, reason: collision with root package name */
    public static final v f34080x;
    public static final w y;

    /* renamed from: z, reason: collision with root package name */
    public static final x f34081z;

    /* compiled from: HtmlTreeBuilderState.java */
    /* renamed from: org.jsoup.parser.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum C0454a extends a {
        public C0454a() {
            super("InTableText", 9);
        }

        @Override // org.jsoup.parser.a
        public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.f34051a == Token.TokenType.Character) {
                Token.b bVar = (Token.b) token;
                if (bVar.f34055d.equals(a.P)) {
                    htmlTreeBuilder.t(this);
                    return false;
                }
                htmlTreeBuilder.f34028u.add(bVar.f34055d);
                return true;
            }
            if (htmlTreeBuilder.f34028u.size() > 0) {
                Iterator it = htmlTreeBuilder.f34028u.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!StringUtil.isBlank(str)) {
                        htmlTreeBuilder.t(this);
                        boolean inSorted = StringUtil.inSorted(htmlTreeBuilder.a().normalName(), z.A);
                        a aVar = a.y;
                        if (inSorted) {
                            htmlTreeBuilder.f34031x = true;
                            Token.b bVar2 = new Token.b();
                            bVar2.f34055d = str;
                            htmlTreeBuilder.P(bVar2, aVar);
                            htmlTreeBuilder.f34031x = false;
                        } else {
                            Token.b bVar3 = new Token.b();
                            bVar3.f34055d = str;
                            htmlTreeBuilder.P(bVar3, aVar);
                        }
                    } else {
                        Token.b bVar4 = new Token.b();
                        bVar4.f34055d = str;
                        htmlTreeBuilder.E(bVar4);
                    }
                }
                htmlTreeBuilder.f34028u = new ArrayList();
            }
            htmlTreeBuilder.f34021m = htmlTreeBuilder.f34022n;
            return htmlTreeBuilder.i(token);
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum b extends a {
        public b() {
            super("InCaption", 10);
        }

        @Override // org.jsoup.parser.a
        public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.d()) {
                Token.f fVar = (Token.f) token;
                if (fVar.f34063e.equals("caption")) {
                    if (!htmlTreeBuilder.C(fVar.f34063e)) {
                        htmlTreeBuilder.t(this);
                        return false;
                    }
                    htmlTreeBuilder.v(false);
                    if (!htmlTreeBuilder.b("caption")) {
                        htmlTreeBuilder.t(this);
                    }
                    htmlTreeBuilder.N("caption");
                    htmlTreeBuilder.q();
                    htmlTreeBuilder.f34021m = a.A;
                    return true;
                }
            }
            if ((token.e() && StringUtil.inSorted(((Token.g) token).f34063e, z.y)) || (token.d() && ((Token.f) token).f34063e.equals("table"))) {
                htmlTreeBuilder.t(this);
                if (htmlTreeBuilder.j("caption")) {
                    return htmlTreeBuilder.i(token);
                }
                return true;
            }
            if (token.d() && StringUtil.inSorted(((Token.f) token).f34063e, z.J)) {
                htmlTreeBuilder.t(this);
                return false;
            }
            return htmlTreeBuilder.P(token, a.y);
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum c extends a {
        public c() {
            super("InColumnGroup", 11);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0084, code lost:
        
            if (r7.equals("html") == false) goto L37;
         */
        @Override // org.jsoup.parser.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean c(org.jsoup.parser.Token r11, org.jsoup.parser.HtmlTreeBuilder r12) {
            /*
                r10 = this;
                boolean r0 = org.jsoup.parser.a.a(r11)
                r1 = 1
                if (r0 == 0) goto Ld
                org.jsoup.parser.Token$b r11 = (org.jsoup.parser.Token.b) r11
                r12.E(r11)
                return r1
            Ld:
                int[] r0 = org.jsoup.parser.a.q.f34082a
                org.jsoup.parser.Token$TokenType r2 = r11.f34051a
                int r2 = r2.ordinal()
                r0 = r0[r2]
                if (r0 == r1) goto Lb5
                r2 = 2
                if (r0 == r2) goto Lb1
                org.jsoup.parser.a$t r3 = org.jsoup.parser.a.f34078v
                java.lang.String r4 = "template"
                r5 = 0
                java.lang.String r6 = "html"
                r7 = 3
                if (r0 == r7) goto L6e
                r2 = 4
                if (r0 == r2) goto L3d
                r2 = 6
                if (r0 == r2) goto L31
                boolean r11 = r10.d(r11, r12)
                return r11
            L31:
                boolean r0 = r12.b(r6)
                if (r0 == 0) goto L38
                return r1
            L38:
                boolean r11 = r10.d(r11, r12)
                return r11
            L3d:
                r0 = r11
                org.jsoup.parser.Token$f r0 = (org.jsoup.parser.Token.f) r0
                java.lang.String r0 = r0.f34063e
                r0.getClass()
                boolean r2 = r0.equals(r4)
                if (r2 != 0) goto L6a
                java.lang.String r2 = "colgroup"
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L58
                boolean r11 = r10.d(r11, r12)
                return r11
            L58:
                boolean r11 = r12.b(r0)
                if (r11 != 0) goto L62
                r12.t(r10)
                return r5
            L62:
                r12.M()
                org.jsoup.parser.a$y r11 = org.jsoup.parser.a.A
                r12.f34021m = r11
                goto Lba
            L6a:
                r12.P(r11, r3)
                goto Lba
            L6e:
                r0 = r11
                org.jsoup.parser.Token$g r0 = (org.jsoup.parser.Token.g) r0
                java.lang.String r7 = r0.f34063e
                r7.getClass()
                int r8 = r7.hashCode()
                r9 = -1
                switch(r8) {
                    case -1321546630: goto L92;
                    case 98688: goto L87;
                    case 3213227: goto L80;
                    default: goto L7e;
                }
            L7e:
                r2 = r9
                goto L9a
            L80:
                boolean r4 = r7.equals(r6)
                if (r4 != 0) goto L9a
                goto L7e
            L87:
                java.lang.String r2 = "col"
                boolean r2 = r7.equals(r2)
                if (r2 != 0) goto L90
                goto L7e
            L90:
                r2 = r1
                goto L9a
            L92:
                boolean r2 = r7.equals(r4)
                if (r2 != 0) goto L99
                goto L7e
            L99:
                r2 = r5
            L9a:
                switch(r2) {
                    case 0: goto Lad;
                    case 1: goto La9;
                    case 2: goto La2;
                    default: goto L9d;
                }
            L9d:
                boolean r11 = r10.d(r11, r12)
                return r11
            La2:
                org.jsoup.parser.a$w r0 = org.jsoup.parser.a.y
                boolean r11 = r12.P(r11, r0)
                return r11
            La9:
                r12.G(r0)
                goto Lba
            Lad:
                r12.P(r11, r3)
                goto Lba
            Lb1:
                r12.t(r10)
                goto Lba
            Lb5:
                org.jsoup.parser.Token$c r11 = (org.jsoup.parser.Token.c) r11
                r12.F(r11)
            Lba:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.a.c.c(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilder):boolean");
        }

        public final boolean d(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (!htmlTreeBuilder.b("colgroup")) {
                htmlTreeBuilder.t(this);
                return false;
            }
            htmlTreeBuilder.M();
            htmlTreeBuilder.f34021m = a.A;
            htmlTreeBuilder.i(token);
            return true;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum d extends a {
        public d() {
            super("InTableBody", 12);
        }

        @Override // org.jsoup.parser.a
        public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            int i10 = q.f34082a[token.f34051a.ordinal()];
            a aVar = a.A;
            if (i10 != 3) {
                if (i10 != 4) {
                    return htmlTreeBuilder.P(token, aVar);
                }
                String str = ((Token.f) token).f34063e;
                if (StringUtil.inSorted(str, z.H)) {
                    if (!htmlTreeBuilder.C(str)) {
                        htmlTreeBuilder.t(this);
                        return false;
                    }
                    htmlTreeBuilder.r("tbody", "tfoot", "thead", "template");
                    htmlTreeBuilder.M();
                    htmlTreeBuilder.f34021m = aVar;
                    return true;
                }
                if (str.equals("table")) {
                    return d(token, htmlTreeBuilder);
                }
                if (StringUtil.inSorted(str, z.C)) {
                    htmlTreeBuilder.t(this);
                    return false;
                }
                return htmlTreeBuilder.P(token, aVar);
            }
            Token.g gVar = (Token.g) token;
            String str2 = gVar.f34063e;
            if (str2.equals("tr")) {
                htmlTreeBuilder.r("tbody", "tfoot", "thead", "template");
                htmlTreeBuilder.D(gVar);
                htmlTreeBuilder.f34021m = a.F;
                return true;
            }
            if (StringUtil.inSorted(str2, z.f34102v)) {
                htmlTreeBuilder.t(this);
                htmlTreeBuilder.k("tr");
                return htmlTreeBuilder.i(gVar);
            }
            if (StringUtil.inSorted(str2, z.B)) {
                return d(token, htmlTreeBuilder);
            }
            return htmlTreeBuilder.P(token, aVar);
        }

        public final boolean d(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (!htmlTreeBuilder.C("tbody") && !htmlTreeBuilder.C("thead") && !htmlTreeBuilder.z("tfoot", null)) {
                htmlTreeBuilder.t(this);
                return false;
            }
            htmlTreeBuilder.r("tbody", "tfoot", "thead", "template");
            htmlTreeBuilder.j(htmlTreeBuilder.a().normalName());
            return htmlTreeBuilder.i(token);
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum e extends a {
        public e() {
            super("InRow", 13);
        }

        @Override // org.jsoup.parser.a
        public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            boolean e10 = token.e();
            y yVar = a.A;
            if (e10) {
                Token.g gVar = (Token.g) token;
                String str = gVar.f34063e;
                if (StringUtil.inSorted(str, z.f34102v)) {
                    htmlTreeBuilder.r("tr", "template");
                    htmlTreeBuilder.D(gVar);
                    htmlTreeBuilder.f34021m = a.G;
                    htmlTreeBuilder.f34026s.add(null);
                    return true;
                }
                if (StringUtil.inSorted(str, z.D)) {
                    if (!htmlTreeBuilder.j("tr")) {
                        return false;
                    }
                    return htmlTreeBuilder.i(token);
                }
                return htmlTreeBuilder.P(token, yVar);
            }
            if (token.d()) {
                String str2 = ((Token.f) token).f34063e;
                boolean equals = str2.equals("tr");
                d dVar = a.E;
                if (equals) {
                    if (!htmlTreeBuilder.C(str2)) {
                        htmlTreeBuilder.t(this);
                        return false;
                    }
                    htmlTreeBuilder.r("tr", "template");
                    htmlTreeBuilder.M();
                    htmlTreeBuilder.f34021m = dVar;
                    return true;
                }
                if (str2.equals("table")) {
                    if (!htmlTreeBuilder.j("tr")) {
                        return false;
                    }
                    return htmlTreeBuilder.i(token);
                }
                if (StringUtil.inSorted(str2, z.f34099s)) {
                    if (htmlTreeBuilder.C(str2) && htmlTreeBuilder.C("tr")) {
                        htmlTreeBuilder.r("tr", "template");
                        htmlTreeBuilder.M();
                        htmlTreeBuilder.f34021m = dVar;
                        return true;
                    }
                    htmlTreeBuilder.t(this);
                    return false;
                }
                if (StringUtil.inSorted(str2, z.E)) {
                    htmlTreeBuilder.t(this);
                    return false;
                }
                return htmlTreeBuilder.P(token, yVar);
            }
            return htmlTreeBuilder.P(token, yVar);
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum f extends a {
        public f() {
            super("InCell", 14);
        }

        @Override // org.jsoup.parser.a
        public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            boolean d10 = token.d();
            w wVar = a.y;
            if (d10) {
                String str = ((Token.f) token).f34063e;
                if (StringUtil.inSorted(str, z.f34102v)) {
                    boolean C = htmlTreeBuilder.C(str);
                    e eVar = a.F;
                    if (!C) {
                        htmlTreeBuilder.t(this);
                        htmlTreeBuilder.f34021m = eVar;
                        return false;
                    }
                    htmlTreeBuilder.v(false);
                    if (!htmlTreeBuilder.b(str)) {
                        htmlTreeBuilder.t(this);
                    }
                    htmlTreeBuilder.N(str);
                    htmlTreeBuilder.q();
                    htmlTreeBuilder.f34021m = eVar;
                    return true;
                }
                if (StringUtil.inSorted(str, z.f34103w)) {
                    htmlTreeBuilder.t(this);
                    return false;
                }
                if (StringUtil.inSorted(str, z.f34104x)) {
                    if (!htmlTreeBuilder.C(str)) {
                        htmlTreeBuilder.t(this);
                        return false;
                    }
                    if (htmlTreeBuilder.C("td")) {
                        htmlTreeBuilder.j("td");
                    } else {
                        htmlTreeBuilder.j("th");
                    }
                    return htmlTreeBuilder.i(token);
                }
                return htmlTreeBuilder.P(token, wVar);
            }
            if (token.e() && StringUtil.inSorted(((Token.g) token).f34063e, z.y)) {
                if (!htmlTreeBuilder.C("td") && !htmlTreeBuilder.C("th")) {
                    htmlTreeBuilder.t(this);
                    return false;
                }
                if (htmlTreeBuilder.C("td")) {
                    htmlTreeBuilder.j("td");
                } else {
                    htmlTreeBuilder.j("th");
                }
                return htmlTreeBuilder.i(token);
            }
            return htmlTreeBuilder.P(token, wVar);
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum g extends a {
        public g() {
            super("InSelect", 15);
        }

        @Override // org.jsoup.parser.a
        public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            int i10 = q.f34082a[token.f34051a.ordinal()];
            a aVar = a.f34078v;
            switch (i10) {
                case 1:
                    htmlTreeBuilder.F((Token.c) token);
                    return true;
                case 2:
                    htmlTreeBuilder.t(this);
                    return false;
                case 3:
                    Token.g gVar = (Token.g) token;
                    String str = gVar.f34063e;
                    if (str.equals("html")) {
                        return htmlTreeBuilder.P(gVar, a.y);
                    }
                    if (str.equals("option")) {
                        if (htmlTreeBuilder.b("option")) {
                            htmlTreeBuilder.j("option");
                        }
                        htmlTreeBuilder.D(gVar);
                    } else if (str.equals("optgroup")) {
                        if (htmlTreeBuilder.b("option")) {
                            htmlTreeBuilder.j("option");
                        }
                        if (htmlTreeBuilder.b("optgroup")) {
                            htmlTreeBuilder.j("optgroup");
                        }
                        htmlTreeBuilder.D(gVar);
                    } else {
                        if (str.equals("select")) {
                            htmlTreeBuilder.t(this);
                            return htmlTreeBuilder.j("select");
                        }
                        if (StringUtil.inSorted(str, z.F)) {
                            htmlTreeBuilder.t(this);
                            if (!htmlTreeBuilder.A("select")) {
                                return false;
                            }
                            htmlTreeBuilder.j("select");
                            return htmlTreeBuilder.i(gVar);
                        }
                        if (!str.equals("script") && !str.equals("template")) {
                            htmlTreeBuilder.t(this);
                            return false;
                        }
                        return htmlTreeBuilder.P(token, aVar);
                    }
                    return true;
                case 4:
                    String str2 = ((Token.f) token).f34063e;
                    str2.getClass();
                    char c10 = 65535;
                    switch (str2.hashCode()) {
                        case -1321546630:
                            if (str2.equals("template")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -1010136971:
                            if (str2.equals("option")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case -906021636:
                            if (str2.equals("select")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case -80773204:
                            if (str2.equals("optgroup")) {
                                c10 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            return htmlTreeBuilder.P(token, aVar);
                        case 1:
                            if (htmlTreeBuilder.b("option")) {
                                htmlTreeBuilder.M();
                            } else {
                                htmlTreeBuilder.t(this);
                            }
                            return true;
                        case 2:
                            if (!htmlTreeBuilder.A(str2)) {
                                htmlTreeBuilder.t(this);
                                return false;
                            }
                            htmlTreeBuilder.N(str2);
                            htmlTreeBuilder.U();
                            return true;
                        case 3:
                            if (htmlTreeBuilder.b("option") && htmlTreeBuilder.o(htmlTreeBuilder.a()) != null && htmlTreeBuilder.o(htmlTreeBuilder.a()).normalName().equals("optgroup")) {
                                htmlTreeBuilder.j("option");
                            }
                            if (htmlTreeBuilder.b("optgroup")) {
                                htmlTreeBuilder.M();
                            } else {
                                htmlTreeBuilder.t(this);
                            }
                            return true;
                        default:
                            htmlTreeBuilder.t(this);
                            return false;
                    }
                case 5:
                    Token.b bVar = (Token.b) token;
                    if (bVar.f34055d.equals(a.P)) {
                        htmlTreeBuilder.t(this);
                        return false;
                    }
                    htmlTreeBuilder.E(bVar);
                    return true;
                case 6:
                    if (!htmlTreeBuilder.b("html")) {
                        htmlTreeBuilder.t(this);
                    }
                    return true;
                default:
                    htmlTreeBuilder.t(this);
                    return false;
            }
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum h extends a {
        public h() {
            super("InSelectInTable", 16);
        }

        @Override // org.jsoup.parser.a
        public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            boolean e10 = token.e();
            String[] strArr = z.G;
            if (e10 && StringUtil.inSorted(((Token.g) token).f34063e, strArr)) {
                htmlTreeBuilder.t(this);
                htmlTreeBuilder.N("select");
                htmlTreeBuilder.U();
                return htmlTreeBuilder.i(token);
            }
            if (token.d()) {
                Token.f fVar = (Token.f) token;
                if (StringUtil.inSorted(fVar.f34063e, strArr)) {
                    htmlTreeBuilder.t(this);
                    if (htmlTreeBuilder.C(fVar.f34063e)) {
                        htmlTreeBuilder.N("select");
                        htmlTreeBuilder.U();
                        return htmlTreeBuilder.i(token);
                    }
                    return false;
                }
            }
            return htmlTreeBuilder.P(token, a.H);
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum i extends a {
        public i() {
            super("InTemplate", 17);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // org.jsoup.parser.a
        public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            int i10 = q.f34082a[token.f34051a.ordinal()];
            t tVar = a.f34078v;
            w wVar = a.y;
            switch (i10) {
                case 1:
                case 2:
                case 5:
                    htmlTreeBuilder.P(token, wVar);
                    return true;
                case 3:
                    String str = ((Token.g) token).f34063e;
                    if (StringUtil.inSorted(str, z.K)) {
                        htmlTreeBuilder.P(token, tVar);
                        return true;
                    }
                    if (StringUtil.inSorted(str, z.L)) {
                        htmlTreeBuilder.O();
                        y yVar = a.A;
                        htmlTreeBuilder.Q(yVar);
                        htmlTreeBuilder.f34021m = yVar;
                        return htmlTreeBuilder.i(token);
                    }
                    if (str.equals("col")) {
                        htmlTreeBuilder.O();
                        c cVar = a.D;
                        htmlTreeBuilder.Q(cVar);
                        htmlTreeBuilder.f34021m = cVar;
                        return htmlTreeBuilder.i(token);
                    }
                    if (str.equals("tr")) {
                        htmlTreeBuilder.O();
                        d dVar = a.E;
                        htmlTreeBuilder.Q(dVar);
                        htmlTreeBuilder.f34021m = dVar;
                        return htmlTreeBuilder.i(token);
                    }
                    if (!str.equals("td") && !str.equals("th")) {
                        htmlTreeBuilder.O();
                        htmlTreeBuilder.Q(wVar);
                        htmlTreeBuilder.f34021m = wVar;
                        return htmlTreeBuilder.i(token);
                    }
                    htmlTreeBuilder.O();
                    e eVar = a.F;
                    htmlTreeBuilder.Q(eVar);
                    htmlTreeBuilder.f34021m = eVar;
                    return htmlTreeBuilder.i(token);
                case 4:
                    if (((Token.f) token).f34063e.equals("template")) {
                        htmlTreeBuilder.P(token, tVar);
                        return true;
                    }
                    htmlTreeBuilder.t(this);
                    return false;
                case 6:
                    if (!htmlTreeBuilder.K("template")) {
                        return true;
                    }
                    htmlTreeBuilder.t(this);
                    htmlTreeBuilder.N("template");
                    htmlTreeBuilder.q();
                    htmlTreeBuilder.O();
                    htmlTreeBuilder.U();
                    if (htmlTreeBuilder.f34021m == a.J || htmlTreeBuilder.f34027t.size() >= 12) {
                        return true;
                    }
                    return htmlTreeBuilder.i(token);
                default:
                    return true;
            }
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum j extends a {
        public j() {
            super("AfterBody", 18);
        }

        @Override // org.jsoup.parser.a
        public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (a.a(token)) {
                htmlTreeBuilder.E((Token.b) token);
                return true;
            }
            if (token.a()) {
                htmlTreeBuilder.F((Token.c) token);
                return true;
            }
            if (token.b()) {
                htmlTreeBuilder.t(this);
                return false;
            }
            boolean e10 = token.e();
            w wVar = a.y;
            if (e10 && ((Token.g) token).f34063e.equals("html")) {
                return htmlTreeBuilder.P(token, wVar);
            }
            if (token.d() && ((Token.f) token).f34063e.equals("html")) {
                if (htmlTreeBuilder.y) {
                    htmlTreeBuilder.t(this);
                    return false;
                }
                if (htmlTreeBuilder.K("html")) {
                    htmlTreeBuilder.N("html");
                }
                htmlTreeBuilder.f34021m = a.N;
                return true;
            }
            if (token.c()) {
                return true;
            }
            htmlTreeBuilder.t(this);
            if (!htmlTreeBuilder.K("body")) {
                htmlTreeBuilder.f34160e.add(htmlTreeBuilder.f34159d.body());
            }
            htmlTreeBuilder.f34021m = wVar;
            return htmlTreeBuilder.i(token);
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum k extends a {
        public k() {
            super("Initial", 0);
        }

        @Override // org.jsoup.parser.a
        public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (a.a(token)) {
                return true;
            }
            if (token.a()) {
                htmlTreeBuilder.F((Token.c) token);
            } else {
                boolean b10 = token.b();
                r rVar = a.f34076t;
                if (b10) {
                    Token.d dVar = (Token.d) token;
                    DocumentType documentType = new DocumentType(htmlTreeBuilder.f34162h.normalizeTag(dVar.f34058d.toString()), dVar.f.toString(), dVar.f34060g.toString());
                    documentType.setPubSysKey(dVar.f34059e);
                    htmlTreeBuilder.f34159d.appendChild(documentType);
                    htmlTreeBuilder.n(documentType, token, true);
                    if (dVar.f34061h) {
                        htmlTreeBuilder.f34159d.quirksMode(Document.QuirksMode.quirks);
                    }
                    htmlTreeBuilder.f34021m = rVar;
                } else {
                    htmlTreeBuilder.f34021m = rVar;
                    return htmlTreeBuilder.i(token);
                }
            }
            return true;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum l extends a {
        public l() {
            super("InFrameset", 19);
        }

        @Override // org.jsoup.parser.a
        public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (a.a(token)) {
                htmlTreeBuilder.E((Token.b) token);
            } else if (token.a()) {
                htmlTreeBuilder.F((Token.c) token);
            } else {
                if (token.b()) {
                    htmlTreeBuilder.t(this);
                    return false;
                }
                if (token.e()) {
                    Token.g gVar = (Token.g) token;
                    String str = gVar.f34063e;
                    str.getClass();
                    char c10 = 65535;
                    switch (str.hashCode()) {
                        case -1644953643:
                            if (str.equals("frameset")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 3213227:
                            if (str.equals("html")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 97692013:
                            if (str.equals("frame")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 1192721831:
                            if (str.equals("noframes")) {
                                c10 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            htmlTreeBuilder.D(gVar);
                            break;
                        case 1:
                            return htmlTreeBuilder.P(gVar, a.y);
                        case 2:
                            htmlTreeBuilder.G(gVar);
                            break;
                        case 3:
                            return htmlTreeBuilder.P(gVar, a.f34078v);
                        default:
                            htmlTreeBuilder.t(this);
                            return false;
                    }
                } else if (token.d() && ((Token.f) token).f34063e.equals("frameset")) {
                    if (htmlTreeBuilder.b("html")) {
                        htmlTreeBuilder.t(this);
                        return false;
                    }
                    htmlTreeBuilder.M();
                    if (!htmlTreeBuilder.y && !htmlTreeBuilder.b("frameset")) {
                        htmlTreeBuilder.f34021m = a.M;
                    }
                } else if (token.c()) {
                    if (!htmlTreeBuilder.b("html")) {
                        htmlTreeBuilder.t(this);
                    }
                } else {
                    htmlTreeBuilder.t(this);
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum m extends a {
        public m() {
            super("AfterFrameset", 20);
        }

        @Override // org.jsoup.parser.a
        public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (a.a(token)) {
                htmlTreeBuilder.E((Token.b) token);
                return true;
            }
            if (token.a()) {
                htmlTreeBuilder.F((Token.c) token);
                return true;
            }
            if (token.b()) {
                htmlTreeBuilder.t(this);
                return false;
            }
            if (token.e() && ((Token.g) token).f34063e.equals("html")) {
                return htmlTreeBuilder.P(token, a.y);
            }
            if (token.d() && ((Token.f) token).f34063e.equals("html")) {
                htmlTreeBuilder.f34021m = a.O;
                return true;
            }
            if (token.e() && ((Token.g) token).f34063e.equals("noframes")) {
                return htmlTreeBuilder.P(token, a.f34078v);
            }
            if (token.c()) {
                return true;
            }
            htmlTreeBuilder.t(this);
            return false;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum n extends a {
        public n() {
            super("AfterAfterBody", 21);
        }

        @Override // org.jsoup.parser.a
        public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.a()) {
                htmlTreeBuilder.F((Token.c) token);
                return true;
            }
            boolean b10 = token.b();
            w wVar = a.y;
            if (!b10 && (!token.e() || !((Token.g) token).f34063e.equals("html"))) {
                if (a.a(token)) {
                    htmlTreeBuilder.E((Token.b) token);
                    return true;
                }
                if (token.c()) {
                    return true;
                }
                htmlTreeBuilder.t(this);
                if (!htmlTreeBuilder.K("body")) {
                    htmlTreeBuilder.f34160e.add(htmlTreeBuilder.f34159d.body());
                }
                htmlTreeBuilder.f34021m = wVar;
                return htmlTreeBuilder.i(token);
            }
            return htmlTreeBuilder.P(token, wVar);
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum o extends a {
        public o() {
            super("AfterAfterFrameset", 22);
        }

        @Override // org.jsoup.parser.a
        public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.a()) {
                htmlTreeBuilder.F((Token.c) token);
                return true;
            }
            if (!token.b() && !a.a(token) && (!token.e() || !((Token.g) token).f34063e.equals("html"))) {
                if (token.c()) {
                    return true;
                }
                if (token.e() && ((Token.g) token).f34063e.equals("noframes")) {
                    return htmlTreeBuilder.P(token, a.f34078v);
                }
                htmlTreeBuilder.t(this);
                return false;
            }
            return htmlTreeBuilder.P(token, a.y);
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class q {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34082a;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            f34082a = iArr;
            try {
                iArr[Token.TokenType.Comment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34082a[Token.TokenType.Doctype.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34082a[Token.TokenType.StartTag.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34082a[Token.TokenType.EndTag.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34082a[Token.TokenType.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34082a[Token.TokenType.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum r extends a {
        public r() {
            super("BeforeHtml", 1);
        }

        @Override // org.jsoup.parser.a
        public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.b()) {
                htmlTreeBuilder.t(this);
                return false;
            }
            if (token.a()) {
                htmlTreeBuilder.F((Token.c) token);
                return true;
            }
            if (a.a(token)) {
                htmlTreeBuilder.E((Token.b) token);
                return true;
            }
            if (token.e()) {
                Token.g gVar = (Token.g) token;
                if (gVar.f34063e.equals("html")) {
                    htmlTreeBuilder.D(gVar);
                    htmlTreeBuilder.f34021m = a.f34077u;
                    return true;
                }
            }
            if (token.d() && StringUtil.inSorted(((Token.f) token).f34063e, z.f34087e)) {
                return d(token, htmlTreeBuilder);
            }
            if (token.d()) {
                htmlTreeBuilder.t(this);
                return false;
            }
            return d(token, htmlTreeBuilder);
        }

        public final boolean d(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.getClass();
            Element element = new Element(htmlTreeBuilder.m("html", htmlTreeBuilder.f34162h), null);
            htmlTreeBuilder.J(element, null);
            htmlTreeBuilder.f34160e.add(element);
            htmlTreeBuilder.f34021m = a.f34077u;
            return htmlTreeBuilder.i(token);
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum s extends a {
        public s() {
            super("BeforeHead", 2);
        }

        @Override // org.jsoup.parser.a
        public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (a.a(token)) {
                htmlTreeBuilder.E((Token.b) token);
                return true;
            }
            if (token.a()) {
                htmlTreeBuilder.F((Token.c) token);
                return true;
            }
            if (token.b()) {
                htmlTreeBuilder.t(this);
                return false;
            }
            if (token.e() && ((Token.g) token).f34063e.equals("html")) {
                return a.y.c(token, htmlTreeBuilder);
            }
            if (token.e()) {
                Token.g gVar = (Token.g) token;
                if (gVar.f34063e.equals("head")) {
                    htmlTreeBuilder.f34023p = htmlTreeBuilder.D(gVar);
                    htmlTreeBuilder.f34021m = a.f34078v;
                    return true;
                }
            }
            if (token.d() && StringUtil.inSorted(((Token.f) token).f34063e, z.f34087e)) {
                htmlTreeBuilder.k("head");
                return htmlTreeBuilder.i(token);
            }
            if (token.d()) {
                htmlTreeBuilder.t(this);
                return false;
            }
            htmlTreeBuilder.k("head");
            return htmlTreeBuilder.i(token);
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum t extends a {
        public t() {
            super("InHead", 3);
        }

        @Override // org.jsoup.parser.a
        public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (a.a(token)) {
                htmlTreeBuilder.E((Token.b) token);
                return true;
            }
            int i10 = q.f34082a[token.f34051a.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            htmlTreeBuilder.j("head");
                            return htmlTreeBuilder.i(token);
                        }
                        String str = ((Token.f) token).f34063e;
                        if (str.equals("head")) {
                            htmlTreeBuilder.M();
                            htmlTreeBuilder.f34021m = a.f34080x;
                        } else {
                            if (StringUtil.inSorted(str, z.f34085c)) {
                                htmlTreeBuilder.j("head");
                                return htmlTreeBuilder.i(token);
                            }
                            if (str.equals("template")) {
                                if (!htmlTreeBuilder.K(str)) {
                                    htmlTreeBuilder.t(this);
                                } else {
                                    htmlTreeBuilder.v(true);
                                    if (!str.equals(htmlTreeBuilder.a().normalName())) {
                                        htmlTreeBuilder.t(this);
                                    }
                                    htmlTreeBuilder.N(str);
                                    htmlTreeBuilder.q();
                                    htmlTreeBuilder.O();
                                    htmlTreeBuilder.U();
                                }
                            } else {
                                htmlTreeBuilder.t(this);
                                return false;
                            }
                        }
                    } else {
                        Token.g gVar = (Token.g) token;
                        String str2 = gVar.f34063e;
                        if (str2.equals("html")) {
                            return a.y.c(token, htmlTreeBuilder);
                        }
                        if (StringUtil.inSorted(str2, z.f34083a)) {
                            Element G = htmlTreeBuilder.G(gVar);
                            if (str2.equals("base") && G.hasAttr("href") && !htmlTreeBuilder.o) {
                                String absUrl = G.absUrl("href");
                                if (absUrl.length() != 0) {
                                    htmlTreeBuilder.f = absUrl;
                                    htmlTreeBuilder.o = true;
                                    htmlTreeBuilder.f34159d.setBaseUri(absUrl);
                                }
                            }
                        } else if (str2.equals("meta")) {
                            htmlTreeBuilder.G(gVar);
                        } else {
                            boolean equals = str2.equals("title");
                            x xVar = a.f34081z;
                            if (equals) {
                                htmlTreeBuilder.f34158c.o(org.jsoup.parser.c.f34146u);
                                htmlTreeBuilder.f34022n = htmlTreeBuilder.f34021m;
                                htmlTreeBuilder.f34021m = xVar;
                                htmlTreeBuilder.D(gVar);
                            } else if (StringUtil.inSorted(str2, z.f34084b)) {
                                a.b(gVar, htmlTreeBuilder);
                            } else if (str2.equals("noscript")) {
                                htmlTreeBuilder.D(gVar);
                                htmlTreeBuilder.f34021m = a.f34079w;
                            } else if (str2.equals("script")) {
                                htmlTreeBuilder.f34158c.o(org.jsoup.parser.c.f34152x);
                                htmlTreeBuilder.f34022n = htmlTreeBuilder.f34021m;
                                htmlTreeBuilder.f34021m = xVar;
                                htmlTreeBuilder.D(gVar);
                            } else {
                                if (str2.equals("head")) {
                                    htmlTreeBuilder.t(this);
                                    return false;
                                }
                                if (str2.equals("template")) {
                                    htmlTreeBuilder.D(gVar);
                                    htmlTreeBuilder.f34026s.add(null);
                                    htmlTreeBuilder.f34030w = false;
                                    i iVar = a.J;
                                    htmlTreeBuilder.f34021m = iVar;
                                    htmlTreeBuilder.Q(iVar);
                                } else {
                                    htmlTreeBuilder.j("head");
                                    return htmlTreeBuilder.i(token);
                                }
                            }
                        }
                    }
                } else {
                    htmlTreeBuilder.t(this);
                    return false;
                }
            } else {
                htmlTreeBuilder.F((Token.c) token);
            }
            return true;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum u extends a {
        public u() {
            super("InHeadNoscript", 4);
        }

        @Override // org.jsoup.parser.a
        public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (token.b()) {
                htmlTreeBuilder.t(this);
            } else {
                if (token.e() && ((Token.g) token).f34063e.equals("html")) {
                    return htmlTreeBuilder.P(token, a.y);
                }
                boolean d10 = token.d();
                t tVar = a.f34078v;
                if (d10 && ((Token.f) token).f34063e.equals("noscript")) {
                    htmlTreeBuilder.M();
                    htmlTreeBuilder.f34021m = tVar;
                } else {
                    if (!a.a(token) && !token.a() && (!token.e() || !StringUtil.inSorted(((Token.g) token).f34063e, z.f))) {
                        if (token.d() && ((Token.f) token).f34063e.equals("br")) {
                            htmlTreeBuilder.t(this);
                            Token.b bVar = new Token.b();
                            bVar.f34055d = token.toString();
                            htmlTreeBuilder.E(bVar);
                            return true;
                        }
                        if ((token.e() && StringUtil.inSorted(((Token.g) token).f34063e, z.I)) || token.d()) {
                            htmlTreeBuilder.t(this);
                            return false;
                        }
                        htmlTreeBuilder.t(this);
                        Token.b bVar2 = new Token.b();
                        bVar2.f34055d = token.toString();
                        htmlTreeBuilder.E(bVar2);
                        return true;
                    }
                    return htmlTreeBuilder.P(token, tVar);
                }
            }
            return true;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum v extends a {
        public v() {
            super("AfterHead", 5);
        }

        @Override // org.jsoup.parser.a
        public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            if (a.a(token)) {
                htmlTreeBuilder.E((Token.b) token);
            } else if (token.a()) {
                htmlTreeBuilder.F((Token.c) token);
            } else if (token.b()) {
                htmlTreeBuilder.t(this);
            } else {
                boolean e10 = token.e();
                t tVar = a.f34078v;
                if (e10) {
                    Token.g gVar = (Token.g) token;
                    String str = gVar.f34063e;
                    boolean equals = str.equals("html");
                    w wVar = a.y;
                    if (equals) {
                        return htmlTreeBuilder.P(token, wVar);
                    }
                    if (str.equals("body")) {
                        htmlTreeBuilder.D(gVar);
                        htmlTreeBuilder.f34030w = false;
                        htmlTreeBuilder.f34021m = wVar;
                    } else if (str.equals("frameset")) {
                        htmlTreeBuilder.D(gVar);
                        htmlTreeBuilder.f34021m = a.L;
                    } else if (StringUtil.inSorted(str, z.f34088g)) {
                        htmlTreeBuilder.t(this);
                        Element element = htmlTreeBuilder.f34023p;
                        htmlTreeBuilder.f34160e.add(element);
                        htmlTreeBuilder.P(token, tVar);
                        htmlTreeBuilder.T(element);
                    } else {
                        if (str.equals("head")) {
                            htmlTreeBuilder.t(this);
                            return false;
                        }
                        htmlTreeBuilder.k("body");
                        htmlTreeBuilder.f34030w = true;
                        htmlTreeBuilder.i(token);
                    }
                } else if (token.d()) {
                    String str2 = ((Token.f) token).f34063e;
                    if (StringUtil.inSorted(str2, z.f34086d)) {
                        htmlTreeBuilder.k("body");
                        htmlTreeBuilder.f34030w = true;
                        htmlTreeBuilder.i(token);
                    } else if (str2.equals("template")) {
                        htmlTreeBuilder.P(token, tVar);
                    } else {
                        htmlTreeBuilder.t(this);
                        return false;
                    }
                } else {
                    htmlTreeBuilder.k("body");
                    htmlTreeBuilder.f34030w = true;
                    htmlTreeBuilder.i(token);
                }
            }
            return true;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum w extends a {
        public w() {
            super("InBody", 6);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Can't wrap try/catch for region: R(11:64|(6:67|(1:69)|70|(2:72|73)(1:(9:101|102|(2:104|(3:106|(1:108)|109)(3:110|(1:112)|113))|114|115|116|117|(2:119|120)(2:122|123)|121)(10:76|(1:78)(1:100)|79|(1:81)(1:99)|82|(3:84|(2:85|(2:87|(1:90)(1:89))(2:92|93))|91)|94|(1:96)|97|98))|74|65)|126|102|(0)|114|115|116|117|(0)(0)|121) */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x0408, code lost:
        
            r39.f34026s.add(r3);
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0153. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:287:0x04dd. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:293:0x07dc. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:104:0x03b7  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0419  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x041b  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0311 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x031d  */
        @Override // org.jsoup.parser.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean c(org.jsoup.parser.Token r38, org.jsoup.parser.HtmlTreeBuilder r39) {
            /*
                Method dump skipped, instructions count: 3954
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.a.w.c(org.jsoup.parser.Token, org.jsoup.parser.HtmlTreeBuilder):boolean");
        }

        public final boolean d(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            token.getClass();
            String str = ((Token.f) token).f34063e;
            ArrayList<Element> arrayList = htmlTreeBuilder.f34160e;
            if (htmlTreeBuilder.x(str) == null) {
                htmlTreeBuilder.t(this);
                return false;
            }
            int size = arrayList.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Element element = arrayList.get(size);
                if (element.normalName().equals(str)) {
                    htmlTreeBuilder.u(str);
                    if (!htmlTreeBuilder.b(str)) {
                        htmlTreeBuilder.t(this);
                    }
                    htmlTreeBuilder.N(str);
                } else {
                    if (StringUtil.inSorted(element.normalName(), HtmlTreeBuilder.H)) {
                        htmlTreeBuilder.t(this);
                        return false;
                    }
                    size--;
                }
            }
            return true;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum x extends a {
        public x() {
            super("Text", 7);
        }

        @Override // org.jsoup.parser.a
        public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            boolean z10;
            if (token.f34051a == Token.TokenType.Character) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                htmlTreeBuilder.E((Token.b) token);
            } else {
                if (token.c()) {
                    htmlTreeBuilder.t(this);
                    htmlTreeBuilder.M();
                    htmlTreeBuilder.f34021m = htmlTreeBuilder.f34022n;
                    return htmlTreeBuilder.i(token);
                }
                if (token.d()) {
                    htmlTreeBuilder.M();
                    htmlTreeBuilder.f34021m = htmlTreeBuilder.f34022n;
                }
            }
            return true;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public enum y extends a {
        public y() {
            super("InTable", 8);
        }

        @Override // org.jsoup.parser.a
        public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            boolean z10;
            if (token.f34051a == Token.TokenType.Character) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && StringUtil.inSorted(htmlTreeBuilder.a().normalName(), z.A)) {
                htmlTreeBuilder.f34028u = new ArrayList();
                htmlTreeBuilder.f34022n = htmlTreeBuilder.f34021m;
                htmlTreeBuilder.f34021m = a.B;
                return htmlTreeBuilder.i(token);
            }
            if (token.a()) {
                htmlTreeBuilder.F((Token.c) token);
                return true;
            }
            if (token.b()) {
                htmlTreeBuilder.t(this);
                return false;
            }
            boolean e10 = token.e();
            t tVar = a.f34078v;
            if (e10) {
                Token.g gVar = (Token.g) token;
                String str = gVar.f34063e;
                if (str.equals("caption")) {
                    htmlTreeBuilder.s();
                    htmlTreeBuilder.f34026s.add(null);
                    htmlTreeBuilder.D(gVar);
                    htmlTreeBuilder.f34021m = a.C;
                } else if (str.equals("colgroup")) {
                    htmlTreeBuilder.s();
                    htmlTreeBuilder.D(gVar);
                    htmlTreeBuilder.f34021m = a.D;
                } else {
                    if (str.equals("col")) {
                        htmlTreeBuilder.s();
                        htmlTreeBuilder.k("colgroup");
                        return htmlTreeBuilder.i(token);
                    }
                    if (StringUtil.inSorted(str, z.f34099s)) {
                        htmlTreeBuilder.s();
                        htmlTreeBuilder.D(gVar);
                        htmlTreeBuilder.f34021m = a.E;
                    } else {
                        if (StringUtil.inSorted(str, z.f34100t)) {
                            htmlTreeBuilder.s();
                            htmlTreeBuilder.k("tbody");
                            return htmlTreeBuilder.i(token);
                        }
                        if (str.equals("table")) {
                            htmlTreeBuilder.t(this);
                            if (!htmlTreeBuilder.C(str)) {
                                return false;
                            }
                            htmlTreeBuilder.N(str);
                            if (!htmlTreeBuilder.U()) {
                                htmlTreeBuilder.D(gVar);
                                return true;
                            }
                            return htmlTreeBuilder.i(token);
                        }
                        if (StringUtil.inSorted(str, z.f34101u)) {
                            return htmlTreeBuilder.P(token, tVar);
                        }
                        if (str.equals("input")) {
                            if (gVar.l() && gVar.f34071n.get("type").equalsIgnoreCase(CallMraidJS.f7006h)) {
                                htmlTreeBuilder.G(gVar);
                            } else {
                                d(token, htmlTreeBuilder);
                                return true;
                            }
                        } else if (str.equals("form")) {
                            htmlTreeBuilder.t(this);
                            if (htmlTreeBuilder.f34024q != null || htmlTreeBuilder.K("template")) {
                                return false;
                            }
                            htmlTreeBuilder.H(gVar, false, false);
                        } else {
                            d(token, htmlTreeBuilder);
                            return true;
                        }
                    }
                }
                return true;
            }
            if (token.d()) {
                String str2 = ((Token.f) token).f34063e;
                if (str2.equals("table")) {
                    if (!htmlTreeBuilder.C(str2)) {
                        htmlTreeBuilder.t(this);
                        return false;
                    }
                    htmlTreeBuilder.N("table");
                    htmlTreeBuilder.U();
                } else {
                    if (StringUtil.inSorted(str2, z.f34105z)) {
                        htmlTreeBuilder.t(this);
                        return false;
                    }
                    if (str2.equals("template")) {
                        htmlTreeBuilder.P(token, tVar);
                    } else {
                        d(token, htmlTreeBuilder);
                        return true;
                    }
                }
                return true;
            }
            if (token.c()) {
                if (htmlTreeBuilder.b("html")) {
                    htmlTreeBuilder.t(this);
                }
                return true;
            }
            d(token, htmlTreeBuilder);
            return true;
        }

        public final boolean d(Token token, HtmlTreeBuilder htmlTreeBuilder) {
            htmlTreeBuilder.t(this);
            htmlTreeBuilder.f34031x = true;
            htmlTreeBuilder.P(token, a.y);
            htmlTreeBuilder.f34031x = false;
            return true;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* loaded from: classes2.dex */
    public static final class z {

        /* renamed from: a, reason: collision with root package name */
        public static final String[] f34083a = {"base", "basefont", "bgsound", AdContract.AdvertisementBus.COMMAND, "link"};

        /* renamed from: b, reason: collision with root package name */
        public static final String[] f34084b = {"noframes", "style"};

        /* renamed from: c, reason: collision with root package name */
        public static final String[] f34085c = {"body", "br", "html"};

        /* renamed from: d, reason: collision with root package name */
        public static final String[] f34086d = {"body", "br", "html"};

        /* renamed from: e, reason: collision with root package name */
        public static final String[] f34087e = {"body", "br", "head", "html"};
        public static final String[] f = {"basefont", "bgsound", "link", "meta", "noframes", "style"};

        /* renamed from: g, reason: collision with root package name */
        public static final String[] f34088g = {"base", "basefont", "bgsound", AdContract.AdvertisementBus.COMMAND, "link", "meta", "noframes", "script", "style", "template", "title"};

        /* renamed from: h, reason: collision with root package name */
        public static final String[] f34089h = {"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", com.anythink.expressad.foundation.d.f.f9576j, "hgroup", "menu", "nav", "ol", com.anythink.core.common.g.c.W, "section", "summary", "ul"};

        /* renamed from: i, reason: collision with root package name */
        public static final String[] f34090i = {"h1", "h2", "h3", "h4", "h5", "h6"};

        /* renamed from: j, reason: collision with root package name */
        public static final String[] f34091j = {"address", "div", com.anythink.core.common.g.c.W};

        /* renamed from: k, reason: collision with root package name */
        public static final String[] f34092k = {"dd", "dt"};

        /* renamed from: l, reason: collision with root package name */
        public static final String[] f34093l = {"applet", "marquee", "object"};

        /* renamed from: m, reason: collision with root package name */
        public static final String[] f34094m = {"param", av.aq, "track"};

        /* renamed from: n, reason: collision with root package name */
        public static final String[] f34095n = {"action", "name", "prompt"};
        public static final String[] o = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: p, reason: collision with root package name */
        public static final String[] f34096p = {"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", com.anythink.expressad.foundation.d.f.f9576j, "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};

        /* renamed from: q, reason: collision with root package name */
        public static final String[] f34097q = {"a", "b", "big", "code", "em", "font", com.anythink.basead.d.i.f3957a, "nobr", "s", "small", "strike", "strong", "tt", "u"};

        /* renamed from: r, reason: collision with root package name */
        public static final String[] f34098r = {"table", "tbody", "tfoot", "thead", "tr"};

        /* renamed from: s, reason: collision with root package name */
        public static final String[] f34099s = {"tbody", "tfoot", "thead"};

        /* renamed from: t, reason: collision with root package name */
        public static final String[] f34100t = {"td", "th", "tr"};

        /* renamed from: u, reason: collision with root package name */
        public static final String[] f34101u = {"script", "style", "template"};

        /* renamed from: v, reason: collision with root package name */
        public static final String[] f34102v = {"td", "th"};

        /* renamed from: w, reason: collision with root package name */
        public static final String[] f34103w = {"body", "caption", "col", "colgroup", "html"};

        /* renamed from: x, reason: collision with root package name */
        public static final String[] f34104x = {"table", "tbody", "tfoot", "thead", "tr"};
        public static final String[] y = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};

        /* renamed from: z, reason: collision with root package name */
        public static final String[] f34105z = {"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        public static final String[] A = {"table", "tbody", "tfoot", "thead", "tr"};
        public static final String[] B = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
        public static final String[] C = {"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
        public static final String[] D = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
        public static final String[] E = {"body", "caption", "col", "colgroup", "html", "td", "th"};
        public static final String[] F = {"input", "keygen", "textarea"};
        public static final String[] G = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
        public static final String[] H = {"tbody", "tfoot", "thead"};
        public static final String[] I = {"head", "noscript"};
        public static final String[] J = {"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        public static final String[] K = {"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", "title"};
        public static final String[] L = {"caption", "colgroup", "tbody", "tfoot", "thead"};
    }

    static {
        k kVar = new k();
        f34075s = kVar;
        r rVar = new r();
        f34076t = rVar;
        s sVar = new s();
        f34077u = sVar;
        t tVar = new t();
        f34078v = tVar;
        u uVar = new u();
        f34079w = uVar;
        v vVar = new v();
        f34080x = vVar;
        w wVar = new w();
        y = wVar;
        x xVar = new x();
        f34081z = xVar;
        y yVar = new y();
        A = yVar;
        C0454a c0454a = new C0454a();
        B = c0454a;
        b bVar = new b();
        C = bVar;
        c cVar = new c();
        D = cVar;
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
        Q = new a[]{kVar, rVar, sVar, tVar, uVar, vVar, wVar, xVar, yVar, c0454a, bVar, cVar, dVar, eVar, fVar, gVar, hVar, iVar, jVar, lVar, mVar, nVar, oVar, new a() { // from class: org.jsoup.parser.a.p
            @Override // org.jsoup.parser.a
            public final boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder) {
                return true;
            }
        }};
        P = String.valueOf((char) 0);
    }

    public a() {
        throw null;
    }

    public a(String str, int i10) {
    }

    public static boolean a(Token token) {
        boolean z10;
        if (token.f34051a == Token.TokenType.Character) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return StringUtil.isBlank(((Token.b) token).f34055d);
    }

    public static void b(Token.g gVar, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.f34158c.o(org.jsoup.parser.c.f34150w);
        htmlTreeBuilder.f34022n = htmlTreeBuilder.f34021m;
        htmlTreeBuilder.f34021m = f34081z;
        htmlTreeBuilder.D(gVar);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) Q.clone();
    }

    public abstract boolean c(Token token, HtmlTreeBuilder htmlTreeBuilder);
}
