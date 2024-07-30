package com.vungle.warren.session;

/* loaded from: classes2.dex */
public enum SessionAttribute {
    PLACEMENT_ID,
    TIMESTAMP,
    SUCCESS,
    EVENT_ID,
    ORIENTATION,
    VIDEO_CACHED,
    USED,
    URL,
    MUTED,
    ENABLED,
    REASON;

    @Override // java.lang.Enum
    public String toString() {
        return name().toLowerCase();
    }
}
