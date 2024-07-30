package com.bumptech.glide;

import com.bumptech.glide.p;
import r3.a;

/* compiled from: TransitionOptions.java */
/* loaded from: classes.dex */
public abstract class p<CHILD extends p<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: s, reason: collision with root package name */
    public final a.C0469a f19846s = r3.a.f34850a;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            return t3.l.b(this.f19846s, ((p) obj).f19846s);
        }
        return false;
    }

    public int hashCode() {
        a.C0469a c0469a = this.f19846s;
        if (c0469a != null) {
            return c0469a.hashCode();
        }
        return 0;
    }
}
