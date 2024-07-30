package org.jsoup.parser;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ParseErrorList extends ArrayList<ParseError> {

    /* renamed from: s, reason: collision with root package name */
    public final int f34036s;

    /* renamed from: t, reason: collision with root package name */
    public final int f34037t;

    public ParseErrorList(int i10, int i11) {
        super(i10);
        this.f34036s = i10;
        this.f34037t = i11;
    }

    public static ParseErrorList noTracking() {
        return new ParseErrorList(0, 0);
    }

    public static ParseErrorList tracking(int i10) {
        return new ParseErrorList(16, i10);
    }

    @Override // java.util.ArrayList
    public Object clone() {
        return super.clone();
    }

    public final boolean p() {
        if (size() < this.f34037t) {
            return true;
        }
        return false;
    }
}
