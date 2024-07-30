package com.esotericsoftware.kryo.serializers;

import a3.k;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.io.UnsafeMemoryOutput;
import com.esotericsoftware.kryo.io.UnsafeOutput;
import com.esotericsoftware.kryo.serializers.FieldSerializer;
import com.esotericsoftware.kryo.util.UnsafeUtil;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
class UnsafeCacheFields {

    /* loaded from: classes.dex */
    public static final class UnsafeBooleanField extends UnsafeCachedField {
        public UnsafeBooleanField(Field field) {
            super(UnsafeUtil.unsafe().objectFieldOffset(field));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            UnsafeUtil.unsafe().putBoolean(obj2, this.offset, UnsafeUtil.unsafe().getBoolean(obj, this.offset));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            UnsafeUtil.unsafe().putBoolean(obj, this.offset, input.readBoolean());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            output.writeBoolean(UnsafeUtil.unsafe().getBoolean(obj, this.offset));
        }
    }

    /* loaded from: classes.dex */
    public static final class UnsafeByteField extends UnsafeCachedField {
        public UnsafeByteField(Field field) {
            super(UnsafeUtil.unsafe().objectFieldOffset(field));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            UnsafeUtil.unsafe().putByte(obj2, this.offset, UnsafeUtil.unsafe().getByte(obj, this.offset));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            UnsafeUtil.unsafe().putByte(obj, this.offset, input.readByte());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            output.writeByte(UnsafeUtil.unsafe().getByte(obj, this.offset));
        }
    }

    /* loaded from: classes.dex */
    public static abstract class UnsafeCachedField extends FieldSerializer.CachedField {
        public UnsafeCachedField(long j10) {
            this.offset = j10;
        }
    }

    /* loaded from: classes.dex */
    public static final class UnsafeCharField extends UnsafeCachedField {
        public UnsafeCharField(Field field) {
            super(UnsafeUtil.unsafe().objectFieldOffset(field));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            UnsafeUtil.unsafe().putChar(obj2, this.offset, UnsafeUtil.unsafe().getChar(obj, this.offset));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            UnsafeUtil.unsafe().putChar(obj, this.offset, input.readChar());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            output.writeChar(UnsafeUtil.unsafe().getChar(obj, this.offset));
        }
    }

    /* loaded from: classes.dex */
    public static final class UnsafeDoubleField extends UnsafeCachedField {
        public UnsafeDoubleField(Field field) {
            super(UnsafeUtil.unsafe().objectFieldOffset(field));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            UnsafeUtil.unsafe().putDouble(obj2, this.offset, UnsafeUtil.unsafe().getDouble(obj, this.offset));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            UnsafeUtil.unsafe().putDouble(obj, this.offset, input.readDouble());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            output.writeDouble(UnsafeUtil.unsafe().getDouble(obj, this.offset));
        }
    }

    /* loaded from: classes.dex */
    public static final class UnsafeFloatField extends UnsafeCachedField {
        public UnsafeFloatField(Field field) {
            super(UnsafeUtil.unsafe().objectFieldOffset(field));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            UnsafeUtil.unsafe().putFloat(obj2, this.offset, UnsafeUtil.unsafe().getFloat(obj, this.offset));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            UnsafeUtil.unsafe().putFloat(obj, this.offset, input.readFloat());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            output.writeFloat(UnsafeUtil.unsafe().getFloat(obj, this.offset));
        }
    }

    /* loaded from: classes.dex */
    public static final class UnsafeIntField extends UnsafeCachedField {
        public UnsafeIntField(Field field) {
            super(UnsafeUtil.unsafe().objectFieldOffset(field));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            UnsafeUtil.unsafe().putInt(obj2, this.offset, UnsafeUtil.unsafe().getInt(obj, this.offset));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            if (this.varIntsEnabled) {
                UnsafeUtil.unsafe().putInt(obj, this.offset, input.readInt(false));
            } else {
                UnsafeUtil.unsafe().putInt(obj, this.offset, input.readInt());
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            if (this.varIntsEnabled) {
                output.writeInt(UnsafeUtil.unsafe().getInt(obj, this.offset), false);
            } else {
                output.writeInt(UnsafeUtil.unsafe().getInt(obj, this.offset));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class UnsafeLongField extends UnsafeCachedField {
        public UnsafeLongField(Field field) {
            super(UnsafeUtil.unsafe().objectFieldOffset(field));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            UnsafeUtil.unsafe().putLong(obj2, this.offset, UnsafeUtil.unsafe().getLong(obj, this.offset));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            if (this.varIntsEnabled) {
                UnsafeUtil.unsafe().putLong(obj, this.offset, input.readLong(false));
            } else {
                UnsafeUtil.unsafe().putLong(obj, this.offset, input.readLong());
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            if (this.varIntsEnabled) {
                output.writeLong(UnsafeUtil.unsafe().getLong(obj, this.offset), false);
            } else {
                output.writeLong(UnsafeUtil.unsafe().getLong(obj, this.offset));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class UnsafeObjectField extends ObjectField {
        public UnsafeObjectField(FieldSerializer fieldSerializer) {
            super(fieldSerializer);
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField, com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            try {
                if (this.offset != -1) {
                    UnsafeUtil.unsafe().putObject(obj2, this.offset, this.kryo.copy(UnsafeUtil.unsafe().getObject(obj, this.offset)));
                    return;
                }
                throw new KryoException("Unknown offset");
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
            if (this.offset >= 0) {
                return UnsafeUtil.unsafe().getObject(obj, this.offset);
            }
            throw new KryoException("Unknown offset");
        }

        @Override // com.esotericsoftware.kryo.serializers.ObjectField
        public void setField(Object obj, Object obj2) throws IllegalArgumentException, IllegalAccessException {
            if (this.offset != -1) {
                UnsafeUtil.unsafe().putObject(obj, this.offset, obj2);
                return;
            }
            throw new KryoException("Unknown offset");
        }
    }

    /* loaded from: classes.dex */
    public static final class UnsafeRegionField extends UnsafeCachedField {
        static final boolean bulkReadsSupported = false;
        final long len;

        public UnsafeRegionField(long j10, long j11) {
            super(j10);
            this.len = j11;
        }

        private void readSlow(Input input, Object obj) {
            long j10;
            long j11;
            Unsafe unsafe = UnsafeUtil.unsafe();
            long j12 = this.offset;
            while (true) {
                j10 = this.offset;
                j11 = this.len;
                if (j12 >= (j10 + j11) - 8) {
                    break;
                }
                unsafe.putLong(obj, j12, input.readLong());
                j12 += 8;
            }
            if (j12 < j10 + j11) {
                while (j12 < this.offset + this.len) {
                    unsafe.putByte(obj, j12, input.readByte());
                    j12++;
                }
            }
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            Unsafe unsafe = UnsafeUtil.unsafe();
            long j10 = this.offset;
            unsafe.copyMemory(obj, j10, obj2, j10, this.len);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void read(Input input, Object obj) {
            readSlow(input, obj);
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public final void write(Output output, Object obj) {
            long j10;
            long j11;
            if (output instanceof UnsafeOutput) {
                ((UnsafeOutput) output).writeBytes(obj, this.offset, this.len);
                return;
            }
            if (output instanceof UnsafeMemoryOutput) {
                ((UnsafeMemoryOutput) output).writeBytes(obj, this.offset, this.len);
                return;
            }
            Unsafe unsafe = UnsafeUtil.unsafe();
            long j12 = this.offset;
            while (true) {
                j10 = this.offset;
                j11 = this.len;
                if (j12 >= (j10 + j11) - 8) {
                    break;
                }
                output.writeLong(unsafe.getLong(obj, j12));
                j12 += 8;
            }
            if (j12 < j10 + j11) {
                while (j12 < this.offset + this.len) {
                    output.write(unsafe.getByte(obj, j12));
                    j12++;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class UnsafeShortField extends UnsafeCachedField {
        public UnsafeShortField(Field field) {
            super(UnsafeUtil.unsafe().objectFieldOffset(field));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            UnsafeUtil.unsafe().putShort(obj2, this.offset, UnsafeUtil.unsafe().getShort(obj, this.offset));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            UnsafeUtil.unsafe().putShort(obj, this.offset, input.readShort());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            output.writeShort(UnsafeUtil.unsafe().getShort(obj, this.offset));
        }
    }

    /* loaded from: classes.dex */
    public static final class UnsafeStringField extends UnsafeCachedField {
        public UnsafeStringField(Field field) {
            super(UnsafeUtil.unsafe().objectFieldOffset(field));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void copy(Object obj, Object obj2) {
            UnsafeUtil.unsafe().putObject(obj2, this.offset, UnsafeUtil.unsafe().getObject(obj, this.offset));
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void read(Input input, Object obj) {
            UnsafeUtil.unsafe().putObject(obj, this.offset, input.readString());
        }

        @Override // com.esotericsoftware.kryo.serializers.FieldSerializer.CachedField
        public void write(Output output, Object obj) {
            output.writeString((String) UnsafeUtil.unsafe().getObject(obj, this.offset));
        }
    }
}
