package org.jsoup.parser;

/* loaded from: classes2.dex */
public class ParseError {

    /* renamed from: a, reason: collision with root package name */
    public final int f34033a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34034b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34035c;

    public ParseError(CharacterReader characterReader, String str) {
        this.f34033a = characterReader.pos();
        this.f34034b = characterReader.i();
        this.f34035c = str;
    }

    public String getCursorPos() {
        return this.f34034b;
    }

    public String getErrorMessage() {
        return this.f34035c;
    }

    public int getPosition() {
        return this.f34033a;
    }

    public String toString() {
        return "<" + this.f34034b + ">: " + this.f34035c;
    }

    public ParseError(CharacterReader characterReader, String str, Object... objArr) {
        this.f34033a = characterReader.pos();
        this.f34034b = characterReader.i();
        this.f34035c = String.format(str, objArr);
    }
}
