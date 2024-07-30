package com.esotericsoftware.kryo.serializers;

import a3.k;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Registration;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.esotericsoftware.minlog.Log;
import com.esotericsoftware.reflectasm.FieldAccess;
import java.lang.reflect.Field;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ObjectField extends FieldSerializer.CachedField {
    final FieldSerializer fieldSerializer;
    public Class[] generics;
    final Kryo kryo;
    final Class type;

    /* loaded from: classes.dex */
    public static final class ObjectBooleanField extends ObjectField {
        public ObjectBooleanField(FieldSerializer fieldSerializer) {
            super(fieldSerializer);
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setBoolean(obj2, field.getBoolean(obj));
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField
        public Object getField(Object obj) throws IllegalArgumentException, IllegalAccessException {
            return Boolean.valueOf(this.field.getBoolean(obj));
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            try {
                this.field.setBoolean(obj, input.readBoolean());
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            try {
                output.writeBoolean(this.field.getBoolean(obj));
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class ObjectByteField extends ObjectField {
        public ObjectByteField(FieldSerializer fieldSerializer) {
            super(fieldSerializer);
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setByte(obj2, field.getByte(obj));
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField
        public Object getField(Object obj) throws IllegalArgumentException, IllegalAccessException {
            return Byte.valueOf(this.field.getByte(obj));
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            try {
                this.field.setByte(obj, input.readByte());
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            try {
                output.writeByte(this.field.getByte(obj));
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class ObjectCharField extends ObjectField {
        public ObjectCharField(FieldSerializer fieldSerializer) {
            super(fieldSerializer);
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setChar(obj2, field.getChar(obj));
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField
        public Object getField(Object obj) throws IllegalArgumentException, IllegalAccessException {
            return Character.valueOf(this.field.getChar(obj));
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            try {
                this.field.setChar(obj, input.readChar());
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            try {
                output.writeChar(this.field.getChar(obj));
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class ObjectDoubleField extends ObjectField {
        public ObjectDoubleField(FieldSerializer fieldSerializer) {
            super(fieldSerializer);
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setDouble(obj2, field.getDouble(obj));
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField
        public Object getField(Object obj) throws IllegalArgumentException, IllegalAccessException {
            return Double.valueOf(this.field.getDouble(obj));
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            try {
                this.field.setDouble(obj, input.readDouble());
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            try {
                output.writeDouble(this.field.getDouble(obj));
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class ObjectFloatField extends ObjectField {
        public ObjectFloatField(FieldSerializer fieldSerializer) {
            super(fieldSerializer);
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setFloat(obj2, field.getFloat(obj));
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField
        public Object getField(Object obj) throws IllegalArgumentException, IllegalAccessException {
            return Float.valueOf(this.field.getFloat(obj));
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            try {
                this.field.setFloat(obj, input.readFloat());
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            try {
                output.writeFloat(this.field.getFloat(obj));
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class ObjectIntField extends ObjectField {
        public ObjectIntField(FieldSerializer fieldSerializer) {
            super(fieldSerializer);
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setInt(obj2, field.getInt(obj));
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField
        public Object getField(Object obj) throws IllegalArgumentException, IllegalAccessException {
            return Integer.valueOf(this.field.getInt(obj));
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            try {
                if (this.varIntsEnabled) {
                    this.field.setInt(obj, input.readInt(false));
                } else {
                    this.field.setInt(obj, input.readInt());
                }
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            try {
                if (this.varIntsEnabled) {
                    output.writeInt(this.field.getInt(obj), false);
                } else {
                    output.writeInt(this.field.getInt(obj));
                }
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class ObjectLongField extends ObjectField {
        public ObjectLongField(FieldSerializer fieldSerializer) {
            super(fieldSerializer);
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setLong(obj2, field.getLong(obj));
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField
        public Object getField(Object obj) throws IllegalArgumentException, IllegalAccessException {
            return Long.valueOf(this.field.getLong(obj));
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            try {
                if (this.varIntsEnabled) {
                    this.field.setLong(obj, input.readLong(false));
                } else {
                    this.field.setLong(obj, input.readLong());
                }
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            try {
                if (this.varIntsEnabled) {
                    output.writeLong(this.field.getLong(obj), false);
                } else {
                    output.writeLong(this.field.getLong(obj));
                }
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class ObjectShortField extends ObjectField {
        public ObjectShortField(FieldSerializer fieldSerializer) {
            super(fieldSerializer);
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            try {
                Field field = this.field;
                field.setShort(obj2, field.getShort(obj));
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField
        public Object getField(Object obj) throws IllegalArgumentException, IllegalAccessException {
            return Short.valueOf(this.field.getShort(obj));
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            try {
                this.field.setShort(obj, input.readShort());
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            try {
                output.writeShort(this.field.getShort(obj));
            } catch (Exception e10) {
                KryoException kryoException = new KryoException(e10);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", kryoException);
                throw kryoException;
            }
        }
    }

    public ObjectField(FieldSerializer fieldSerializer) {
        this.fieldSerializer = fieldSerializer;
        this.kryo = fieldSerializer.kryo;
        this.type = fieldSerializer.type;
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
    public void copy(Object obj, Object obj2) {
        try {
            int i10 = this.accessIndex;
            if (i10 != -1) {
                FieldAccess fieldAccess = (FieldAccess) this.fieldSerializer.access;
                fieldAccess.set(obj2, i10, this.kryo.copy(fieldAccess.get(obj, i10)));
            } else {
                setField(obj2, this.kryo.copy(getField(obj)));
            }
        } catch (KryoException e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this);
            sb2.append(" (");
            k.r(this.type, sb2, ")", e10);
            throw e10;
        } catch (IllegalAccessException e11) {
            throw new KryoException("Error accessing field: " + this + " (" + this.type.getName() + ")", e11);
        } catch (RuntimeException e12) {
            KryoException kryoException = new KryoException(e12);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this);
            sb3.append(" (");
            k.r(this.type, sb3, ")", kryoException);
            throw kryoException;
        }
    }

    public Object getField(Object obj) throws IllegalArgumentException, IllegalAccessException {
        return this.field.get(obj);
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
    public void read(Input input, Object obj) {
        Object readObject;
        try {
            try {
                if (Log.TRACE) {
                    Log.trace("kryo", "Read field: " + this + " (" + this.type.getName() + ") pos=" + input.position());
                }
                Class cls = this.valueClass;
                Serializer serializer = this.serializer;
                if (cls == null) {
                    Registration readClass = this.kryo.readClass(input);
                    if (readClass == null) {
                        readObject = null;
                    } else {
                        if (serializer == null) {
                            serializer = readClass.getSerializer();
                        }
                        serializer.setGenerics(this.kryo, this.generics);
                        readObject = this.kryo.readObject(input, readClass.getType(), serializer);
                    }
                } else {
                    if (serializer == null) {
                        serializer = this.kryo.getSerializer(cls);
                        this.serializer = serializer;
                    }
                    serializer.setGenerics(this.kryo, this.generics);
                    if (this.canBeNull) {
                        readObject = this.kryo.readObjectOrNull(input, cls, serializer);
                    } else {
                        readObject = this.kryo.readObject(input, cls, serializer);
                    }
                }
                setField(obj, readObject);
            } catch (IllegalAccessException e10) {
                throw new KryoException("Error accessing field: " + this + " (" + this.type.getName() + ")", e10);
            }
        } catch (KryoException e11) {
            e11.addTrace(this + " (" + this.type.getName() + ")");
            throw e11;
        } catch (RuntimeException e12) {
            KryoException kryoException = new KryoException(e12);
            kryoException.addTrace(this + " (" + this.type.getName() + ")");
            throw kryoException;
        }
    }

    public void setField(Object obj, Object obj2) throws IllegalArgumentException, IllegalAccessException {
        this.field.set(obj, obj2);
    }

    @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
    public void write(Output output, Object obj) {
        try {
            if (Log.TRACE) {
                Log.trace("kryo", "Write field: " + this + " (" + obj.getClass().getName() + ") pos=" + output.position());
            }
            Object field = getField(obj);
            Serializer serializer = this.serializer;
            Class cls = this.valueClass;
            if (cls == null) {
                if (field == null) {
                    this.kryo.writeClass(output, null);
                    return;
                }
                Registration writeClass = this.kryo.writeClass(output, field.getClass());
                if (serializer == null) {
                    serializer = writeClass.getSerializer();
                }
                serializer.setGenerics(this.kryo, this.generics);
                this.kryo.writeObject(output, field, serializer);
                return;
            }
            if (serializer == null) {
                serializer = this.kryo.getSerializer(cls);
                this.serializer = serializer;
            }
            serializer.setGenerics(this.kryo, this.generics);
            if (this.canBeNull) {
                this.kryo.writeObjectOrNull(output, field, serializer);
                return;
            }
            if (field != null) {
                this.kryo.writeObject(output, field, serializer);
                return;
            }
            throw new KryoException("Field value is null but canBeNull is false: " + this + " (" + obj.getClass().getName() + ")");
        } catch (KryoException e10) {
            e10.addTrace(this + " (" + obj.getClass().getName() + ")");
            throw e10;
        } catch (IllegalAccessException e11) {
            throw new KryoException("Error accessing field: " + this + " (" + obj.getClass().getName() + ")", e11);
        } catch (RuntimeException e12) {
            KryoException kryoException = new KryoException(e12);
            kryoException.addTrace(this + " (" + obj.getClass().getName() + ")");
            throw kryoException;
        }
    }
}
