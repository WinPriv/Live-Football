package org.jsoup.parser;

import com.huawei.openalliance.ad.constant.ag;
import java.util.Arrays;
import javax.annotation.Nullable;
import org.jsoup.helper.Validate;
import org.jsoup.parser.Token;

/* compiled from: Tokeniser.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: u, reason: collision with root package name */
    public static final char[] f34106u;

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f34107v = {8364, com.anythink.expressad.video.module.a.a.T, 8218, ag.f22000k, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* renamed from: a, reason: collision with root package name */
    public final CharacterReader f34108a;

    /* renamed from: b, reason: collision with root package name */
    public final ParseErrorList f34109b;

    /* renamed from: c, reason: collision with root package name */
    public c f34110c = c.f34142s;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public Token f34111d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f34112e = false;

    @Nullable
    public String f = null;

    /* renamed from: g, reason: collision with root package name */
    public final StringBuilder f34113g = new StringBuilder(1024);

    /* renamed from: h, reason: collision with root package name */
    public final StringBuilder f34114h = new StringBuilder(1024);

    /* renamed from: i, reason: collision with root package name */
    public final Token.g f34115i;

    /* renamed from: j, reason: collision with root package name */
    public final Token.f f34116j;

    /* renamed from: k, reason: collision with root package name */
    public Token.h f34117k;

    /* renamed from: l, reason: collision with root package name */
    public final Token.b f34118l;

    /* renamed from: m, reason: collision with root package name */
    public final Token.d f34119m;

    /* renamed from: n, reason: collision with root package name */
    public final Token.c f34120n;

    @Nullable
    public String o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public String f34121p;

    /* renamed from: q, reason: collision with root package name */
    public int f34122q;

    /* renamed from: r, reason: collision with root package name */
    public int f34123r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f34124s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f34125t;

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f34106u = cArr;
        Arrays.sort(cArr);
    }

    public b(CharacterReader characterReader, ParseErrorList parseErrorList) {
        Token.g gVar = new Token.g();
        this.f34115i = gVar;
        this.f34116j = new Token.f();
        this.f34117k = gVar;
        this.f34118l = new Token.b();
        this.f34119m = new Token.d();
        this.f34120n = new Token.c();
        this.f34123r = -1;
        this.f34124s = new int[1];
        this.f34125t = new int[2];
        this.f34108a = characterReader;
        this.f34109b = parseErrorList;
    }

    public final void a(String str, Object... objArr) {
        ParseErrorList parseErrorList = this.f34109b;
        if (parseErrorList.p()) {
            parseErrorList.add(new ParseError(this.f34108a, String.format("Invalid character reference: ".concat(str), objArr)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x01c9, code lost:
    
        if (r1.o('=', '-', '_') == false) goto L126;
     */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] b(@javax.annotation.Nullable java.lang.Character r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.b.b(java.lang.Character, boolean):int[]");
    }

    public final Token.h c(boolean z10) {
        Token.h hVar;
        if (z10) {
            hVar = this.f34115i;
            hVar.f();
        } else {
            hVar = this.f34116j;
            hVar.f();
        }
        this.f34117k = hVar;
        return hVar;
    }

    public final void d() {
        Token.g(this.f34114h);
    }

    public final void e(char c10) {
        if (this.f == null) {
            this.f = String.valueOf(c10);
        } else {
            StringBuilder sb2 = this.f34113g;
            if (sb2.length() == 0) {
                sb2.append(this.f);
            }
            sb2.append(c10);
        }
        Token.b bVar = this.f34118l;
        bVar.f34052b = this.f34123r;
        bVar.f34053c = this.f34108a.pos();
    }

    public final void f(String str) {
        if (this.f == null) {
            this.f = str;
        } else {
            StringBuilder sb2 = this.f34113g;
            if (sb2.length() == 0) {
                sb2.append(this.f);
            }
            sb2.append(str);
        }
        Token.b bVar = this.f34118l;
        bVar.f34052b = this.f34123r;
        bVar.f34053c = this.f34108a.pos();
    }

    public final void g(StringBuilder sb2) {
        if (this.f == null) {
            this.f = sb2.toString();
        } else {
            StringBuilder sb3 = this.f34113g;
            if (sb3.length() == 0) {
                sb3.append(this.f);
            }
            sb3.append((CharSequence) sb2);
        }
        Token.b bVar = this.f34118l;
        bVar.f34052b = this.f34123r;
        bVar.f34053c = this.f34108a.pos();
    }

    public final void h(Token token) {
        Validate.isFalse(this.f34112e);
        this.f34111d = token;
        this.f34112e = true;
        token.f34052b = this.f34122q;
        CharacterReader characterReader = this.f34108a;
        token.f34053c = characterReader.pos();
        this.f34123r = -1;
        Token.TokenType tokenType = token.f34051a;
        if (tokenType == Token.TokenType.StartTag) {
            this.o = ((Token.g) token).f34062d;
            this.f34121p = null;
        } else if (tokenType == Token.TokenType.EndTag) {
            Token.f fVar = (Token.f) token;
            if (fVar.l()) {
                Object[] objArr = {fVar.f34063e};
                ParseErrorList parseErrorList = this.f34109b;
                if (parseErrorList.p()) {
                    parseErrorList.add(new ParseError(characterReader, "Attributes incorrectly present on end tag [/%s]", objArr));
                }
            }
        }
    }

    public final void i() {
        h(this.f34120n);
    }

    public final void j() {
        h(this.f34119m);
    }

    public final void k() {
        Token.h hVar = this.f34117k;
        if (hVar.f34065h) {
            hVar.o();
        }
        h(this.f34117k);
    }

    public final void l(c cVar) {
        ParseErrorList parseErrorList = this.f34109b;
        if (parseErrorList.p()) {
            parseErrorList.add(new ParseError(this.f34108a, "Unexpectedly reached end of file (EOF) in input state [%s]", cVar));
        }
    }

    public final void m(c cVar) {
        ParseErrorList parseErrorList = this.f34109b;
        if (parseErrorList.p()) {
            CharacterReader characterReader = this.f34108a;
            parseErrorList.add(new ParseError(characterReader, "Unexpected character '%s' in input state [%s]", Character.valueOf(characterReader.current()), cVar));
        }
    }

    public final boolean n() {
        if (this.o != null && this.f34117k.m().equalsIgnoreCase(this.o)) {
            return true;
        }
        return false;
    }

    public final void o(c cVar) {
        int ordinal = cVar.ordinal();
        CharacterReader characterReader = this.f34108a;
        if (ordinal != 0) {
            if (ordinal == 7) {
                this.f34122q = characterReader.pos();
            }
        } else if (this.f34123r == -1) {
            this.f34123r = characterReader.pos();
        }
        this.f34110c = cVar;
    }
}
