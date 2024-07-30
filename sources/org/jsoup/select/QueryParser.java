package org.jsoup.select;

import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.openalliance.ad.constant.w;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.TokenQueue;
import org.jsoup.select.CombiningEvaluator;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.jsoup.select.a;

/* loaded from: classes2.dex */
public class QueryParser {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f34209d = {",", ">", "+", "~", " "};

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f34210e = {ContainerUtils.KEY_VALUE_DELIMITER, "!=", "^=", "$=", "*=", "~="};
    public static final Pattern f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f34211g = Pattern.compile("([+-])?(\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final TokenQueue f34212a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34213b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f34214c = new ArrayList();

    public QueryParser(String str) {
        Validate.notEmpty(str);
        String trim = str.trim();
        this.f34213b = trim;
        this.f34212a = new TokenQueue(trim);
    }

    public static Evaluator parse(String str) {
        try {
            return new QueryParser(str).i();
        } catch (IllegalArgumentException e10) {
            throw new Selector.SelectorParseException(e10.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(char r11) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.QueryParser.a(char):void");
    }

    public final int b() {
        String trim = this.f34212a.chompTo(")").trim();
        Validate.isTrue(StringUtil.isNumeric(trim), "Index must be numeric");
        return Integer.parseInt(trim);
    }

    public final void c(boolean z10) {
        String str;
        Evaluator containsText;
        if (z10) {
            str = ":containsOwn";
        } else {
            str = ":contains";
        }
        TokenQueue tokenQueue = this.f34212a;
        tokenQueue.consume(str);
        String unescape = TokenQueue.unescape(tokenQueue.chompBalanced('(', ')'));
        Validate.notEmpty(unescape, str.concat("(text) query must not be empty"));
        ArrayList arrayList = this.f34214c;
        if (z10) {
            containsText = new Evaluator.ContainsOwnText(unescape);
        } else {
            containsText = new Evaluator.ContainsText(unescape);
        }
        arrayList.add(containsText);
    }

    public final void d(boolean z10) {
        String str;
        Evaluator containsWholeText;
        if (z10) {
            str = ":containsWholeOwnText";
        } else {
            str = ":containsWholeText";
        }
        TokenQueue tokenQueue = this.f34212a;
        tokenQueue.consume(str);
        String unescape = TokenQueue.unescape(tokenQueue.chompBalanced('(', ')'));
        Validate.notEmpty(unescape, str.concat("(text) query must not be empty"));
        ArrayList arrayList = this.f34214c;
        if (z10) {
            containsWholeText = new Evaluator.ContainsWholeOwnText(unescape);
        } else {
            containsWholeText = new Evaluator.ContainsWholeText(unescape);
        }
        arrayList.add(containsWholeText);
    }

    public final void e(boolean z10, boolean z11) {
        int i10;
        String normalize = Normalizer.normalize(this.f34212a.chompTo(")"));
        Matcher matcher = f.matcher(normalize);
        Matcher matcher2 = f34211g.matcher(normalize);
        int i11 = 2;
        int i12 = 1;
        if (!"odd".equals(normalize)) {
            if ("even".equals(normalize)) {
                i12 = 0;
            } else if (matcher.matches()) {
                if (matcher.group(3) != null) {
                    i10 = Integer.parseInt(matcher.group(1).replaceFirst("^\\+", ""));
                } else {
                    i10 = 1;
                }
                if (matcher.group(4) != null) {
                    i12 = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", ""));
                } else {
                    i12 = 0;
                }
                i11 = i10;
            } else if (matcher2.matches()) {
                i12 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i11 = 0;
            } else {
                throw new Selector.SelectorParseException("Could not parse nth-index '%s': unexpected format", normalize);
            }
        }
        ArrayList arrayList = this.f34214c;
        if (z11) {
            if (z10) {
                arrayList.add(new Evaluator.IsNthLastOfType(i11, i12));
                return;
            } else {
                arrayList.add(new Evaluator.IsNthOfType(i11, i12));
                return;
            }
        }
        if (z10) {
            arrayList.add(new Evaluator.IsNthLastChild(i11, i12));
        } else {
            arrayList.add(new Evaluator.IsNthChild(i11, i12));
        }
    }

    public final void f() {
        TokenQueue tokenQueue = this.f34212a;
        boolean matchChomp = tokenQueue.matchChomp("#");
        ArrayList arrayList = this.f34214c;
        if (matchChomp) {
            String consumeCssIdentifier = tokenQueue.consumeCssIdentifier();
            Validate.notEmpty(consumeCssIdentifier);
            arrayList.add(new Evaluator.Id(consumeCssIdentifier));
            return;
        }
        if (tokenQueue.matchChomp(".")) {
            String consumeCssIdentifier2 = tokenQueue.consumeCssIdentifier();
            Validate.notEmpty(consumeCssIdentifier2);
            arrayList.add(new Evaluator.Class(consumeCssIdentifier2.trim()));
            return;
        }
        if (!tokenQueue.matchesWord() && !tokenQueue.matches("*|")) {
            boolean matches = tokenQueue.matches("[");
            String str = this.f34213b;
            if (matches) {
                TokenQueue tokenQueue2 = new TokenQueue(tokenQueue.chompBalanced('[', ']'));
                String consumeToAny = tokenQueue2.consumeToAny(f34210e);
                Validate.notEmpty(consumeToAny);
                tokenQueue2.consumeWhitespace();
                if (tokenQueue2.isEmpty()) {
                    if (consumeToAny.startsWith("^")) {
                        arrayList.add(new Evaluator.AttributeStarting(consumeToAny.substring(1)));
                        return;
                    } else {
                        arrayList.add(new Evaluator.Attribute(consumeToAny));
                        return;
                    }
                }
                if (tokenQueue2.matchChomp(ContainerUtils.KEY_VALUE_DELIMITER)) {
                    arrayList.add(new Evaluator.AttributeWithValue(consumeToAny, tokenQueue2.remainder()));
                    return;
                }
                if (tokenQueue2.matchChomp("!=")) {
                    arrayList.add(new Evaluator.AttributeWithValueNot(consumeToAny, tokenQueue2.remainder()));
                    return;
                }
                if (tokenQueue2.matchChomp("^=")) {
                    arrayList.add(new Evaluator.AttributeWithValueStarting(consumeToAny, tokenQueue2.remainder()));
                    return;
                }
                if (tokenQueue2.matchChomp("$=")) {
                    arrayList.add(new Evaluator.AttributeWithValueEnding(consumeToAny, tokenQueue2.remainder()));
                    return;
                } else if (tokenQueue2.matchChomp("*=")) {
                    arrayList.add(new Evaluator.AttributeWithValueContaining(consumeToAny, tokenQueue2.remainder()));
                    return;
                } else {
                    if (tokenQueue2.matchChomp("~=")) {
                        arrayList.add(new Evaluator.AttributeWithValueMatching(consumeToAny, Pattern.compile(tokenQueue2.remainder())));
                        return;
                    }
                    throw new Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", str, tokenQueue2.remainder());
                }
            }
            if (tokenQueue.matchChomp("*")) {
                arrayList.add(new Evaluator.AllElements());
                return;
            }
            if (tokenQueue.matchChomp(":lt(")) {
                arrayList.add(new Evaluator.IndexLessThan(b()));
                return;
            }
            if (tokenQueue.matchChomp(":gt(")) {
                arrayList.add(new Evaluator.IndexGreaterThan(b()));
                return;
            }
            if (tokenQueue.matchChomp(":eq(")) {
                arrayList.add(new Evaluator.IndexEquals(b()));
                return;
            }
            if (tokenQueue.matches(":has(")) {
                tokenQueue.consume(":has");
                String chompBalanced = tokenQueue.chompBalanced('(', ')');
                Validate.notEmpty(chompBalanced, ":has(selector) sub-select must not be empty");
                arrayList.add(new a.C0456a(parse(chompBalanced)));
                return;
            }
            if (tokenQueue.matches(":contains(")) {
                c(false);
                return;
            }
            if (tokenQueue.matches(":containsOwn(")) {
                c(true);
                return;
            }
            if (tokenQueue.matches(":containsWholeText(")) {
                d(false);
                return;
            }
            if (tokenQueue.matches(":containsWholeOwnText(")) {
                d(true);
                return;
            }
            if (tokenQueue.matches(":containsData(")) {
                tokenQueue.consume(":containsData");
                String unescape = TokenQueue.unescape(tokenQueue.chompBalanced('(', ')'));
                Validate.notEmpty(unescape, ":containsData(text) query must not be empty");
                arrayList.add(new Evaluator.ContainsData(unescape));
                return;
            }
            if (tokenQueue.matches(":matches(")) {
                g(false);
                return;
            }
            if (tokenQueue.matches(":matchesOwn(")) {
                g(true);
                return;
            }
            if (tokenQueue.matches(":matchesWholeText(")) {
                h(false);
                return;
            }
            if (tokenQueue.matches(":matchesWholeOwnText(")) {
                h(true);
                return;
            }
            if (tokenQueue.matches(":not(")) {
                tokenQueue.consume(":not");
                String chompBalanced2 = tokenQueue.chompBalanced('(', ')');
                Validate.notEmpty(chompBalanced2, ":not(selector) subselect must not be empty");
                arrayList.add(new a.d(parse(chompBalanced2)));
                return;
            }
            if (tokenQueue.matchChomp(":nth-child(")) {
                e(false, false);
                return;
            }
            if (tokenQueue.matchChomp(":nth-last-child(")) {
                e(true, false);
                return;
            }
            if (tokenQueue.matchChomp(":nth-of-type(")) {
                e(false, true);
                return;
            }
            if (tokenQueue.matchChomp(":nth-last-of-type(")) {
                e(true, true);
                return;
            }
            if (tokenQueue.matchChomp(":first-child")) {
                arrayList.add(new Evaluator.IsFirstChild());
                return;
            }
            if (tokenQueue.matchChomp(":last-child")) {
                arrayList.add(new Evaluator.IsLastChild());
                return;
            }
            if (tokenQueue.matchChomp(":first-of-type")) {
                arrayList.add(new Evaluator.IsFirstOfType());
                return;
            }
            if (tokenQueue.matchChomp(":last-of-type")) {
                arrayList.add(new Evaluator.IsLastOfType());
                return;
            }
            if (tokenQueue.matchChomp(":only-child")) {
                arrayList.add(new Evaluator.IsOnlyChild());
                return;
            }
            if (tokenQueue.matchChomp(":only-of-type")) {
                arrayList.add(new Evaluator.IsOnlyOfType());
                return;
            }
            if (tokenQueue.matchChomp(":empty")) {
                arrayList.add(new Evaluator.IsEmpty());
                return;
            } else if (tokenQueue.matchChomp(":root")) {
                arrayList.add(new Evaluator.IsRoot());
                return;
            } else {
                if (tokenQueue.matchChomp(":matchText")) {
                    arrayList.add(new Evaluator.MatchText());
                    return;
                }
                throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", str, tokenQueue.remainder());
            }
        }
        String normalize = Normalizer.normalize(tokenQueue.consumeElementSelector());
        Validate.notEmpty(normalize);
        if (normalize.startsWith("*|")) {
            arrayList.add(new CombiningEvaluator.Or(new Evaluator.Tag(normalize.substring(2)), new Evaluator.TagEndsWith(normalize.replace("*|", w.bE))));
            return;
        }
        if (normalize.contains(com.anythink.expressad.foundation.g.a.bQ)) {
            normalize = normalize.replace(com.anythink.expressad.foundation.g.a.bQ, w.bE);
        }
        arrayList.add(new Evaluator.Tag(normalize));
    }

    public final void g(boolean z10) {
        String str;
        Evaluator matches;
        if (z10) {
            str = ":matchesOwn";
        } else {
            str = ":matches";
        }
        TokenQueue tokenQueue = this.f34212a;
        tokenQueue.consume(str);
        String chompBalanced = tokenQueue.chompBalanced('(', ')');
        Validate.notEmpty(chompBalanced, str.concat("(regex) query must not be empty"));
        ArrayList arrayList = this.f34214c;
        if (z10) {
            matches = new Evaluator.MatchesOwn(Pattern.compile(chompBalanced));
        } else {
            matches = new Evaluator.Matches(Pattern.compile(chompBalanced));
        }
        arrayList.add(matches);
    }

    public final void h(boolean z10) {
        String str;
        Evaluator matchesWholeText;
        if (z10) {
            str = ":matchesWholeOwnText";
        } else {
            str = ":matchesWholeText";
        }
        TokenQueue tokenQueue = this.f34212a;
        tokenQueue.consume(str);
        String chompBalanced = tokenQueue.chompBalanced('(', ')');
        Validate.notEmpty(chompBalanced, str.concat("(regex) query must not be empty"));
        ArrayList arrayList = this.f34214c;
        if (z10) {
            matchesWholeText = new Evaluator.MatchesWholeOwnText(Pattern.compile(chompBalanced));
        } else {
            matchesWholeText = new Evaluator.MatchesWholeText(Pattern.compile(chompBalanced));
        }
        arrayList.add(matchesWholeText);
    }

    public final Evaluator i() {
        TokenQueue tokenQueue = this.f34212a;
        tokenQueue.consumeWhitespace();
        String[] strArr = f34209d;
        boolean matchesAny = tokenQueue.matchesAny(strArr);
        ArrayList arrayList = this.f34214c;
        if (matchesAny) {
            arrayList.add(new a.g());
            a(tokenQueue.consume());
        } else {
            f();
        }
        while (!tokenQueue.isEmpty()) {
            boolean consumeWhitespace = tokenQueue.consumeWhitespace();
            if (tokenQueue.matchesAny(strArr)) {
                a(tokenQueue.consume());
            } else if (consumeWhitespace) {
                a(' ');
            } else {
                f();
            }
        }
        if (arrayList.size() == 1) {
            return (Evaluator) arrayList.get(0);
        }
        return new CombiningEvaluator.And(arrayList);
    }

    public String toString() {
        return this.f34213b;
    }
}
