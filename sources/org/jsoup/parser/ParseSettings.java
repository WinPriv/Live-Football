package org.jsoup.parser;

import org.jsoup.internal.Normalizer;

/* loaded from: classes2.dex */
public class ParseSettings {
    public static final ParseSettings htmlDefault = new ParseSettings(false, false);
    public static final ParseSettings preserveCase = new ParseSettings(true, true);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f34038a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34039b;

    public ParseSettings(boolean z10, boolean z11) {
        this.f34038a = z10;
        this.f34039b = z11;
    }

    public String normalizeAttribute(String str) {
        String trim = str.trim();
        if (!this.f34039b) {
            return Normalizer.lowerCase(trim);
        }
        return trim;
    }

    public String normalizeTag(String str) {
        String trim = str.trim();
        if (!this.f34038a) {
            return Normalizer.lowerCase(trim);
        }
        return trim;
    }

    public boolean preserveAttributeCase() {
        return this.f34039b;
    }

    public boolean preserveTagCase() {
        return this.f34038a;
    }
}
