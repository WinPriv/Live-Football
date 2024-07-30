package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.esotericsoftware.minlog.Log;

/* loaded from: classes.dex */
public class FieldSerializerConfig implements Cloneable {
    private boolean fixedFieldTypes;
    private boolean fieldsCanBeNull = true;
    private boolean setFieldsAsAccessible = true;
    private boolean ignoreSyntheticFields = true;
    private boolean copyTransient = true;
    private boolean serializeTransient = false;
    private boolean optimizedGenerics = false;
    private FieldSerializer.CachedFieldNameStrategy cachedFieldNameStrategy = FieldSerializer.CachedFieldNameStrategy.DEFAULT;
    private boolean useAsm = true ^ FieldSerializer.unsafeAvailable;

    public FieldSerializerConfig() {
        if (Log.TRACE) {
            Log.trace("kryo.FieldSerializerConfig", "useAsm: " + this.useAsm);
        }
    }

    public FieldSerializer.CachedFieldNameStrategy getCachedFieldNameStrategy() {
        return this.cachedFieldNameStrategy;
    }

    public boolean isCopyTransient() {
        return this.copyTransient;
    }

    public boolean isFieldsCanBeNull() {
        return this.fieldsCanBeNull;
    }

    public boolean isFixedFieldTypes() {
        return this.fixedFieldTypes;
    }

    public boolean isIgnoreSyntheticFields() {
        return this.ignoreSyntheticFields;
    }

    public boolean isOptimizedGenerics() {
        return this.optimizedGenerics;
    }

    public boolean isSerializeTransient() {
        return this.serializeTransient;
    }

    public boolean isSetFieldsAsAccessible() {
        return this.setFieldsAsAccessible;
    }

    public boolean isUseAsm() {
        return this.useAsm;
    }

    public void setCachedFieldNameStrategy(FieldSerializer.CachedFieldNameStrategy cachedFieldNameStrategy) {
        this.cachedFieldNameStrategy = cachedFieldNameStrategy;
        if (Log.TRACE) {
            Log.trace("kryo.FieldSerializerConfig", "CachedFieldNameStrategy: " + cachedFieldNameStrategy);
        }
    }

    public void setCopyTransient(boolean z10) {
        this.copyTransient = z10;
    }

    public void setFieldsAsAccessible(boolean z10) {
        this.setFieldsAsAccessible = z10;
        if (Log.TRACE) {
            Log.trace("kryo.FieldSerializerConfig", "setFieldsAsAccessible: " + z10);
        }
    }

    public void setFieldsCanBeNull(boolean z10) {
        this.fieldsCanBeNull = z10;
        if (Log.TRACE) {
            Log.trace("kryo.FieldSerializerConfig", "setFieldsCanBeNull: " + z10);
        }
    }

    public void setFixedFieldTypes(boolean z10) {
        this.fixedFieldTypes = z10;
        if (Log.TRACE) {
            Log.trace("kryo.FieldSerializerConfig", "setFixedFieldTypes: " + z10);
        }
    }

    public void setIgnoreSyntheticFields(boolean z10) {
        this.ignoreSyntheticFields = z10;
        if (Log.TRACE) {
            Log.trace("kryo.FieldSerializerConfig", "setIgnoreSyntheticFields: " + z10);
        }
    }

    public void setOptimizedGenerics(boolean z10) {
        this.optimizedGenerics = z10;
        if (Log.TRACE) {
            Log.trace("kryo.FieldSerializerConfig", "setOptimizedGenerics: " + z10);
        }
    }

    public void setSerializeTransient(boolean z10) {
        this.serializeTransient = z10;
    }

    public void setUseAsm(boolean z10) {
        this.useAsm = z10;
        if (!z10 && !FieldSerializer.unsafeAvailable) {
            this.useAsm = true;
            if (Log.TRACE) {
                Log.trace("kryo.FieldSerializerConfig", "sun.misc.Unsafe is unavailable, using ASM.");
            }
        }
        if (Log.TRACE) {
            Log.trace("kryo.FieldSerializerConfig", "setUseAsm: " + z10);
        }
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public FieldSerializerConfig mo2clone() {
        try {
            return (FieldSerializerConfig) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
