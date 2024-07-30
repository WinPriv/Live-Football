package org.jsoup.parser;

import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Range;
import org.jsoup.parser.Token;

/* compiled from: TreeBuilder.java */
/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public Parser f34156a;

    /* renamed from: b, reason: collision with root package name */
    public CharacterReader f34157b;

    /* renamed from: c, reason: collision with root package name */
    public b f34158c;

    /* renamed from: d, reason: collision with root package name */
    public Document f34159d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<Element> f34160e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public Token f34161g;

    /* renamed from: h, reason: collision with root package name */
    public ParseSettings f34162h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f34163i;

    /* renamed from: j, reason: collision with root package name */
    public final Token.g f34164j = new Token.g();

    /* renamed from: k, reason: collision with root package name */
    public final Token.f f34165k = new Token.f();

    /* renamed from: l, reason: collision with root package name */
    public boolean f34166l;

    public final Element a() {
        int size = this.f34160e.size();
        if (size > 0) {
            return this.f34160e.get(size - 1);
        }
        return this.f34159d;
    }

    public final boolean b(String str) {
        Element a10;
        if (this.f34160e.size() == 0 || (a10 = a()) == null || !a10.normalName().equals(str)) {
            return false;
        }
        return true;
    }

    public abstract ParseSettings c();

    @ParametersAreNonnullByDefault
    public void d(Reader reader, String str, Parser parser) {
        boolean z10;
        Validate.notNullParam(reader, "input");
        Validate.notNullParam(str, "baseUri");
        Validate.notNull(parser);
        Document document = new Document(str);
        this.f34159d = document;
        document.parser(parser);
        this.f34156a = parser;
        this.f34162h = parser.settings();
        this.f34157b = new CharacterReader(reader);
        this.f34166l = parser.isTrackPosition();
        CharacterReader characterReader = this.f34157b;
        if (!parser.isTrackErrors() && !this.f34166l) {
            z10 = false;
        } else {
            z10 = true;
        }
        characterReader.trackNewlines(z10);
        this.f34161g = null;
        this.f34158c = new b(this.f34157b, parser.getErrors());
        this.f34160e = new ArrayList<>(32);
        this.f34163i = new HashMap();
        this.f = str;
    }

    public boolean e(String str) {
        return false;
    }

    public abstract d f();

    @ParametersAreNonnullByDefault
    public final Document g(Reader reader, String str, Parser parser) {
        d(reader, str, parser);
        l();
        this.f34157b.close();
        this.f34157b = null;
        this.f34158c = null;
        this.f34160e = null;
        this.f34163i = null;
        return this.f34159d;
    }

    public abstract List<Node> h(String str, Element element, String str2, Parser parser);

    public abstract boolean i(Token token);

    public final boolean j(String str) {
        Token token = this.f34161g;
        Token.f fVar = this.f34165k;
        if (token == fVar) {
            Token.f fVar2 = new Token.f();
            fVar2.n(str);
            return i(fVar2);
        }
        fVar.f();
        fVar.n(str);
        return i(fVar);
    }

    public final void k(String str) {
        Token token = this.f34161g;
        Token.g gVar = this.f34164j;
        if (token == gVar) {
            Token.g gVar2 = new Token.g();
            gVar2.n(str);
            i(gVar2);
        } else {
            gVar.f();
            gVar.n(str);
            i(gVar);
        }
    }

    public final void l() {
        Token token;
        b bVar = this.f34158c;
        Token.TokenType tokenType = Token.TokenType.EOF;
        while (true) {
            if (!bVar.f34112e) {
                bVar.f34110c.d(bVar, bVar.f34108a);
            } else {
                StringBuilder sb2 = bVar.f34113g;
                int length = sb2.length();
                Token.b bVar2 = bVar.f34118l;
                if (length != 0) {
                    String sb3 = sb2.toString();
                    sb2.delete(0, sb2.length());
                    bVar2.f34055d = sb3;
                    bVar.f = null;
                    token = bVar2;
                } else {
                    String str = bVar.f;
                    if (str != null) {
                        bVar2.f34055d = str;
                        bVar.f = null;
                        token = bVar2;
                    } else {
                        bVar.f34112e = false;
                        token = bVar.f34111d;
                    }
                }
                i(token);
                token.f();
                if (token.f34051a == tokenType) {
                    return;
                }
            }
        }
    }

    public final Tag m(String str, ParseSettings parseSettings) {
        Tag tag = (Tag) this.f34163i.get(str);
        if (tag == null) {
            Tag valueOf = Tag.valueOf(str, parseSettings);
            this.f34163i.put(str, valueOf);
            return valueOf;
        }
        return tag;
    }

    public final void n(Node node, @Nullable Token token, boolean z10) {
        int i10;
        if (!this.f34166l || token == null || (i10 = token.f34052b) == -1) {
            return;
        }
        Range.Position position = new Range.Position(i10, this.f34157b.k(i10), this.f34157b.c(i10));
        int i11 = token.f34053c;
        new Range(position, new Range.Position(i11, this.f34157b.k(i11), this.f34157b.c(i11))).track(node, z10);
    }

    public boolean processStartTag(String str, Attributes attributes) {
        Token token = this.f34161g;
        Token.g gVar = this.f34164j;
        if (token == gVar) {
            Token.g gVar2 = new Token.g();
            gVar2.f34062d = str;
            gVar2.f34071n = attributes;
            ParseSettings parseSettings = ParseSettings.htmlDefault;
            gVar2.f34063e = Normalizer.lowerCase(str.trim());
            return i(gVar2);
        }
        gVar.f();
        gVar.f34062d = str;
        gVar.f34071n = attributes;
        ParseSettings parseSettings2 = ParseSettings.htmlDefault;
        gVar.f34063e = Normalizer.lowerCase(str.trim());
        return i(gVar);
    }
}
