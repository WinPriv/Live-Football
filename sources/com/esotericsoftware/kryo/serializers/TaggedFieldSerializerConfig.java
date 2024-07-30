package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.minlog.Log;

/* loaded from: classes.dex */
public class TaggedFieldSerializerConfig extends FieldSerializerConfig {
    private boolean skipUnknownTags = false;

    @Deprecated
    public boolean isIgnoreUnknownTags() {
        return false;
    }

    public boolean isSkipUnknownTags() {
        return this.skipUnknownTags;
    }

    public void setSkipUnknownTags(boolean z10) {
        this.skipUnknownTags = z10;
        if (Log.TRACE) {
            Log.trace("kryo.TaggedFieldSerializerConfig", "setSkipUnknownTags: " + z10);
        }
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializerConfig
    /* renamed from: clone */
    public TaggedFieldSerializerConfig mo2clone() {
        return (TaggedFieldSerializerConfig) super.mo2clone();
    }

    @Deprecated
    public void setIgnoreUnknownTags(boolean z10) {
    }
}
