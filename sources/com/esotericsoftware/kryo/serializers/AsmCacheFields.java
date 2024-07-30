package com.esotericsoftware.kryo.serializers;

import a3.k;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.esotericsoftware.reflectasm.FieldAccess;

/* loaded from: classes.dex */
class AsmCacheFields {

    /* loaded from: classes.dex */
    public static final class AsmBooleanField extends AsmCachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i10 = this.accessIndex;
            fieldAccess.setBoolean(obj2, i10, fieldAccess.getBoolean(obj, i10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            this.access.setBoolean(obj, this.accessIndex, input.readBoolean());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            output.writeBoolean(this.access.getBoolean(obj, this.accessIndex));
        }
    }

    /* loaded from: classes.dex */
    public static final class AsmByteField extends AsmCachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i10 = this.accessIndex;
            fieldAccess.setByte(obj2, i10, fieldAccess.getByte(obj, i10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            this.access.setByte(obj, this.accessIndex, input.readByte());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            output.writeByte(this.access.getByte(obj, this.accessIndex));
        }
    }

    /* loaded from: classes.dex */
    public static abstract class AsmCachedField extends FieldSerializer.CachedField {
    }

    /* loaded from: classes.dex */
    public static final class AsmCharField extends AsmCachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i10 = this.accessIndex;
            fieldAccess.setChar(obj2, i10, fieldAccess.getChar(obj, i10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            this.access.setChar(obj, this.accessIndex, input.readChar());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            output.writeChar(this.access.getChar(obj, this.accessIndex));
        }
    }

    /* loaded from: classes.dex */
    public static final class AsmDoubleField extends AsmCachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i10 = this.accessIndex;
            fieldAccess.setDouble(obj2, i10, fieldAccess.getDouble(obj, i10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            this.access.setDouble(obj, this.accessIndex, input.readDouble());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            output.writeDouble(this.access.getDouble(obj, this.accessIndex));
        }
    }

    /* loaded from: classes.dex */
    public static final class AsmFloatField extends AsmCachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i10 = this.accessIndex;
            fieldAccess.setFloat(obj2, i10, fieldAccess.getFloat(obj, i10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            this.access.setFloat(obj, this.accessIndex, input.readFloat());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            output.writeFloat(this.access.getFloat(obj, this.accessIndex));
        }
    }

    /* loaded from: classes.dex */
    public static final class AsmIntField extends AsmCachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i10 = this.accessIndex;
            fieldAccess.setInt(obj2, i10, fieldAccess.getInt(obj, i10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            if (this.varIntsEnabled) {
                this.access.setInt(obj, this.accessIndex, input.readInt(false));
            } else {
                this.access.setInt(obj, this.accessIndex, input.readInt());
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            if (this.varIntsEnabled) {
                output.writeInt(this.access.getInt(obj, this.accessIndex), false);
            } else {
                output.writeInt(this.access.getInt(obj, this.accessIndex));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class AsmLongField extends AsmCachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i10 = this.accessIndex;
            fieldAccess.setLong(obj2, i10, fieldAccess.getLong(obj, i10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            if (this.varIntsEnabled) {
                this.access.setLong(obj, this.accessIndex, input.readLong(false));
            } else {
                this.access.setLong(obj, this.accessIndex, input.readLong());
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            if (this.varIntsEnabled) {
                output.writeLong(this.access.getLong(obj, this.accessIndex), false);
            } else {
                output.writeLong(this.access.getLong(obj, this.accessIndex));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class AsmObjectField extends ObjectField {
        public AsmObjectField(FieldSerializer fieldSerializer) {
            super(fieldSerializer);
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            try {
                int i10 = this.accessIndex;
                if (i10 != -1) {
                    FieldAccess fieldAccess = this.access;
                    fieldAccess.set(obj2, i10, this.kryo.copy(fieldAccess.get(obj, i10)));
                    return;
                }
                throw new KryoException("Unknown acess index");
            } catch (KryoException e10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this);
                sb2.append(" (");
                k.r(this.type, sb2, ")", e10);
                throw e10;
            } catch (RuntimeException e11) {
                KryoException kryoException = new KryoException(e11);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this);
                sb3.append(" (");
                k.r(this.type, sb3, ")", kryoException);
                throw kryoException;
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField
        public Object getField(Object obj) throws IllegalArgumentException, IllegalAccessException {
            int i10 = this.accessIndex;
            if (i10 != -1) {
                return this.access.get(obj, i10);
            }
            throw new KryoException("Unknown acess index");
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField
        public void setField(Object obj, Object obj2) throws IllegalArgumentException, IllegalAccessException {
            int i10 = this.accessIndex;
            if (i10 != -1) {
                this.access.set(obj, i10, obj2);
                return;
            }
            throw new KryoException("Unknown acess index");
        }
    }

    /* loaded from: classes.dex */
    public static final class AsmShortField extends AsmCachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i10 = this.accessIndex;
            fieldAccess.setShort(obj2, i10, fieldAccess.getShort(obj, i10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            this.access.setShort(obj, this.accessIndex, input.readShort());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            output.writeShort(this.access.getShort(obj, this.accessIndex));
        }
    }

    /* loaded from: classes.dex */
    public static final class AsmStringField extends AsmCachedField {
        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            FieldAccess fieldAccess = this.access;
            int i10 = this.accessIndex;
            fieldAccess.set(obj2, i10, fieldAccess.getString(obj, i10));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            this.access.set(obj, this.accessIndex, input.readString());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            output.writeString(this.access.getString(obj, this.accessIndex));
        }
    }
}
