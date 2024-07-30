package com.esotericsoftware.kryo.serializers;

import a3.k;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.InputChunked;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.io.OutputChunked;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.esotericsoftware.minlog.Log;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public class TaggedFieldSerializer<T> extends FieldSerializer<T> {
    private static final Comparator<FieldSerializer.CachedField> TAGGED_VALUE_COMPARATOR = new Comparator<FieldSerializer.CachedField>() { // from class: com.esotericsoftware.kryo.serializers.TaggedFieldSerializer.1
        @Override // java.util.Comparator
        public int compare(FieldSerializer.CachedField cachedField, FieldSerializer.CachedField cachedField2) {
            return ((Tag) cachedField.getField().getAnnotation(Tag.class)).value() - ((Tag) cachedField2.getField().getAnnotation(Tag.class)).value();
        }
    };
    private boolean[] annexed;
    private boolean[] deprecated;
    private int[] tags;
    private int writeFieldCount;

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface Tag {
        boolean annexed() default false;

        int value();
    }

    public TaggedFieldSerializer(Kryo kryo, Class cls) {
        super(kryo, cls, null, kryo.getTaggedFieldSerializerConfig().mo2clone());
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer
    public void initializeCachedFields() {
        FieldSerializer.CachedField[] fields = getFields();
        int length = fields.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (fields[i10].getField().getAnnotation(Tag.class) == null) {
                if (Log.TRACE) {
                    Log.trace("kryo", "Ignoring field without tag: " + fields[i10]);
                }
                super.removeField(fields[i10]);
            }
        }
        FieldSerializer.CachedField[] fields2 = getFields();
        this.tags = new int[fields2.length];
        this.deprecated = new boolean[fields2.length];
        this.annexed = new boolean[fields2.length];
        this.writeFieldCount = fields2.length;
        Arrays.sort(fields2, TAGGED_VALUE_COMPARATOR);
        int length2 = fields2.length;
        for (int i11 = 0; i11 < length2; i11++) {
            Field field = fields2[i11].getField();
            this.tags[i11] = ((Tag) field.getAnnotation(Tag.class)).value();
            if (i11 > 0) {
                int[] iArr = this.tags;
                int i12 = i11 - 1;
                if (iArr[i11] == iArr[i12]) {
                    throw new KryoException(String.format("The fields [%s] and [%s] both have a Tag value of %d.", field, fields2[i12].getField(), Integer.valueOf(this.tags[i11])));
                }
            }
            if (field.getAnnotation(Deprecated.class) != null) {
                this.deprecated[i11] = true;
                this.writeFieldCount--;
            }
            if (((Tag) field.getAnnotation(Tag.class)).annexed()) {
                this.annexed[i11] = true;
            }
        }
        this.removedFields.clear();
    }

    @Deprecated
    public boolean isIgnoreUnkownTags() {
        return false;
    }

    public boolean isSkipUnknownTags() {
        return ((TaggedFieldSerializerConfig) this.config).isSkipUnknownTags();
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer, com.esotericsoftware.kryo.Serializer
    public T read(Kryo kryo, Input input, Class<T> cls) {
        FieldSerializer.CachedField cachedField;
        boolean z10;
        T create = create(kryo, input, cls);
        kryo.reference(create);
        int readVarInt = input.readVarInt(true);
        int[] iArr = this.tags;
        FieldSerializer.CachedField[] fields = getFields();
        InputChunked inputChunked = null;
        for (int i10 = 0; i10 < readVarInt; i10++) {
            int readVarInt2 = input.readVarInt(true);
            int length = iArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (iArr[i11] == readVarInt2) {
                        cachedField = fields[i11];
                        z10 = this.annexed[i11];
                        break;
                    }
                    i11++;
                } else {
                    cachedField = null;
                    z10 = false;
                    break;
                }
            }
            if (cachedField == null) {
                if (isSkipUnknownTags()) {
                    if (inputChunked == null) {
                        inputChunked = new InputChunked(input, 1024);
                    }
                    inputChunked.nextChunks();
                    if (Log.TRACE) {
                        Log.trace(String.format("Unknown field tag: %d (%s) encountered. Assuming a future annexed tag with chunked encoding and skipping.", Integer.valueOf(readVarInt2), getType().getName()));
                    }
                } else {
                    StringBuilder n10 = k.n("Unknown field tag: ", readVarInt2, " (");
                    n10.append(getType().getName());
                    n10.append(")");
                    throw new KryoException(n10.toString());
                }
            } else if (z10) {
                if (inputChunked == null) {
                    inputChunked = new InputChunked(input, 1024);
                }
                cachedField.read(inputChunked, create);
                inputChunked.nextChunks();
            } else {
                cachedField.read(input, create);
            }
        }
        return create;
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer
    public void removeField(String str) {
        super.removeField(str);
        initializeCachedFields();
    }

    public void setSkipUnknownTags(boolean z10) {
        ((TaggedFieldSerializerConfig) this.config).setSkipUnknownTags(z10);
        rebuildCachedFields();
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer, com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, T t10) {
        FieldSerializer.CachedField[] fields = getFields();
        output.writeVarInt(this.writeFieldCount, true);
        int length = fields.length;
        OutputChunked outputChunked = null;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.deprecated[i10]) {
                output.writeVarInt(this.tags[i10], true);
                if (this.annexed[i10]) {
                    if (outputChunked == null) {
                        outputChunked = new OutputChunked(output, 1024);
                    }
                    fields[i10].write(outputChunked, t10);
                    outputChunked.endChunks();
                } else {
                    fields[i10].write(output, t10);
                }
            }
        }
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer
    public void removeField(FieldSerializer.CachedField cachedField) {
        super.removeField(cachedField);
        initializeCachedFields();
    }

    @Deprecated
    public void setIgnoreUnknownTags(boolean z10) {
    }
}
