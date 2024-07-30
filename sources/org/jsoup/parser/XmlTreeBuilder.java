package org.jsoup.parser;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Token;

/* loaded from: classes2.dex */
public class XmlTreeBuilder extends d {

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34074a;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            f34074a = iArr;
            try {
                iArr[Token.TokenType.StartTag.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34074a[Token.TokenType.EndTag.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34074a[Token.TokenType.Comment.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34074a[Token.TokenType.Character.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34074a[Token.TokenType.Doctype.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34074a[Token.TokenType.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // org.jsoup.parser.d
    public final ParseSettings c() {
        return ParseSettings.preserveCase;
    }

    @Override // org.jsoup.parser.d
    @ParametersAreNonnullByDefault
    public final void d(Reader reader, String str, Parser parser) {
        super.d(reader, str, parser);
        this.f34160e.add(this.f34159d);
        this.f34159d.outputSettings().syntax(Document.OutputSettings.Syntax.xml).escapeMode(Entities.EscapeMode.xhtml).prettyPrint(false);
    }

    @Override // org.jsoup.parser.d
    public final d f() {
        return new XmlTreeBuilder();
    }

    @Override // org.jsoup.parser.d
    public final List<Node> h(String str, Element element, String str2, Parser parser) {
        d(new StringReader(str), str2, parser);
        l();
        return this.f34159d.childNodes();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0144, code lost:
    
        return true;
     */
    @Override // org.jsoup.parser.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(org.jsoup.parser.Token r9) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.XmlTreeBuilder.i(org.jsoup.parser.Token):boolean");
    }

    @Override // org.jsoup.parser.d
    public /* bridge */ /* synthetic */ boolean processStartTag(String str, Attributes attributes) {
        return super.processStartTag(str, attributes);
    }
}
