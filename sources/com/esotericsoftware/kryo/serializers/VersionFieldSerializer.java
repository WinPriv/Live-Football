package com.esotericsoftware.kryo.serializers;

import a3.k;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.esotericsoftware.minlog.Log;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes.dex */
public class VersionFieldSerializer<T> extends FieldSerializer<T> {
    private boolean compatible;
    private int[] fieldVersion;
    private int typeVersion;

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface Since {
        int value() default 0;
    }

    public VersionFieldSerializer(Kryo kryo, Class cls) {
        super(kryo, cls);
        this.typeVersion = 0;
        this.compatible = true;
        initializeCachedFields();
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer
    public void initializeCachedFields() {
        FieldSerializer.CachedField[] fields = getFields();
        this.fieldVersion = new int[fields.length];
        int length = fields.length;
        for (int i10 = 0; i10 < length; i10++) {
            Since since = (Since) fields[i10].getField().getAnnotation(Since.class);
            if (since != null) {
                this.fieldVersion[i10] = since.value();
                this.typeVersion = Math.max(this.fieldVersion[i10], this.typeVersion);
            } else {
                this.fieldVersion[i10] = 0;
            }
        }
        this.removedFields.clear();
        if (Log.DEBUG) {
            Log.debug("Version for type " + getType().getName() + " is " + this.typeVersion);
        }
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer, com.esotericsoftware.kryo.Serializer
    public T read(Kryo kryo, Input input, Class<T> cls) {
        T create = create(kryo, input, cls);
        kryo.reference(create);
        int readVarInt = input.readVarInt(true);
        if (!this.compatible && readVarInt != this.typeVersion) {
            StringBuilder n10 = k.n("Version not compatible: ", readVarInt, " <-> ");
            n10.append(this.typeVersion);
            throw new KryoException(n10.toString());
        }
        FieldSerializer.CachedField[] fields = getFields();
        int length = fields.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.fieldVersion[i10] > readVarInt) {
                if (Log.DEBUG) {
                    Log.debug("Skip field " + fields[i10].getField().getName());
                }
            } else {
                fields[i10].read(input, create);
            }
        }
        return create;
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer
    public void removeField(String str) {
        super.removeField(str);
        initializeCachedFields();
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer, com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, T t10) {
        FieldSerializer.CachedField[] fields = getFields();
        output.writeVarInt(this.typeVersion, true);
        for (FieldSerializer.CachedField cachedField : fields) {
            cachedField.write(output, t10);
        }
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer
    public void removeField(FieldSerializer.CachedField cachedField) {
        super.removeField(cachedField);
        initializeCachedFields();
    }

    public VersionFieldSerializer(Kryo kryo, Class cls, boolean z10) {
        this(kryo, cls);
        this.compatible = z10;
    }
}
