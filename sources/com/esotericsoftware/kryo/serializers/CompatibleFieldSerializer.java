package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.InputChunked;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.io.OutputChunked;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.esotericsoftware.kryo.util.ObjectMap;
import com.esotericsoftware.minlog.Log;

/* loaded from: classes.dex */
public class CompatibleFieldSerializer<T> extends FieldSerializer<T> {
    private static final int THRESHOLD_BINARY_SEARCH = 32;

    public CompatibleFieldSerializer(Kryo kryo, Class cls) {
        super(kryo, cls);
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer, com.esotericsoftware.kryo.Serializer
    public T read(Kryo kryo, Input input, Class<T> cls) {
        boolean z10;
        int i10;
        T create = create(kryo, input, cls);
        kryo.reference(create);
        ObjectMap graphContext = kryo.getGraphContext();
        FieldSerializer.CachedField[] cachedFieldArr = (FieldSerializer.CachedField[]) graphContext.get(this);
        if (cachedFieldArr == null) {
            int readVarInt = input.readVarInt(true);
            if (Log.TRACE) {
                Log.trace("kryo", "Read " + readVarInt + " field names.");
            }
            String[] strArr = new String[readVarInt];
            for (int i11 = 0; i11 < readVarInt; i11++) {
                strArr[i11] = input.readString();
            }
            FieldSerializer.CachedField[] cachedFieldArr2 = new FieldSerializer.CachedField[readVarInt];
            FieldSerializer.CachedField[] fields = getFields();
            if (readVarInt < 32) {
                for (int i12 = 0; i12 < readVarInt; i12++) {
                    String str = strArr[i12];
                    int length = fields.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 < length) {
                            if (getCachedFieldName(fields[i13]).equals(str)) {
                                cachedFieldArr2[i12] = fields[i13];
                                break;
                            }
                            i13++;
                        } else if (Log.TRACE) {
                            Log.trace("kryo", "Ignore obsolete field: " + str);
                        }
                    }
                }
            } else {
                if (fields.length > readVarInt) {
                    i10 = fields.length;
                } else {
                    i10 = readVarInt;
                }
                for (int i14 = 0; i14 < readVarInt; i14++) {
                    String str2 = strArr[i14];
                    int i15 = i10 - 1;
                    int i16 = 0;
                    while (true) {
                        if (i16 <= i15) {
                            int i17 = (i16 + i15) >>> 1;
                            int compareTo = str2.compareTo(getCachedFieldName(fields[i17]));
                            if (compareTo >= 0) {
                                if (compareTo > 0) {
                                    i16 = i17 + 1;
                                } else {
                                    cachedFieldArr2[i14] = fields[i17];
                                    break;
                                }
                            } else {
                                i15 = i17 - 1;
                            }
                        } else if (Log.TRACE) {
                            Log.trace("kryo", "Ignore obsolete field: " + str2);
                        }
                    }
                }
            }
            graphContext.put(this, cachedFieldArr2);
            cachedFieldArr = cachedFieldArr2;
        }
        InputChunked inputChunked = new InputChunked(input, 1024);
        if (getGenerics() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (FieldSerializer.CachedField cachedField : cachedFieldArr) {
            if (cachedField != null && z10) {
                cachedField = getField(getCachedFieldName(cachedField));
            }
            if (cachedField == null) {
                if (Log.TRACE) {
                    Log.trace("kryo", "Skip obsolete field.");
                }
                inputChunked.nextChunks();
            } else {
                cachedField.read(inputChunked, create);
                inputChunked.nextChunks();
            }
        }
        return create;
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer, com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, T t10) {
        FieldSerializer.CachedField[] fields = getFields();
        ObjectMap graphContext = kryo.getGraphContext();
        if (!graphContext.containsKey(this)) {
            graphContext.put(this, null);
            if (Log.TRACE) {
                Log.trace("kryo", "Write " + fields.length + " field names.");
            }
            output.writeVarInt(fields.length, true);
            for (FieldSerializer.CachedField cachedField : fields) {
                output.writeString(getCachedFieldName(cachedField));
            }
        }
        OutputChunked outputChunked = new OutputChunked(output, 1024);
        for (FieldSerializer.CachedField cachedField2 : fields) {
            cachedField2.write(outputChunked, t10);
            outputChunked.endChunks();
        }
    }
}
