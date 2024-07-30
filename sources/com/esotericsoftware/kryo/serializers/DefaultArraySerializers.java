package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Registration;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.minlog.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public class DefaultArraySerializers {

    /* loaded from: classes.dex */
    public static class BooleanArraySerializer extends Serializer<boolean[]> {
        public BooleanArraySerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public boolean[] copy(Kryo kryo, boolean[] zArr) {
            int length = zArr.length;
            boolean[] zArr2 = new boolean[length];
            System.arraycopy(zArr, 0, zArr2, 0, length);
            return zArr2;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public boolean[] read(Kryo kryo, Input input, Class<boolean[]> cls) {
            int readVarInt = input.readVarInt(true);
            if (readVarInt == 0) {
                return null;
            }
            int i10 = readVarInt - 1;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                zArr[i11] = input.readBoolean();
            }
            return zArr;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, boolean[] zArr) {
            if (zArr == null) {
                output.writeVarInt(0, true);
                return;
            }
            output.writeVarInt(zArr.length + 1, true);
            for (boolean z10 : zArr) {
                output.writeBoolean(z10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class ByteArraySerializer extends Serializer<byte[]> {
        public ByteArraySerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public byte[] copy(Kryo kryo, byte[] bArr) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public byte[] read(Kryo kryo, Input input, Class<byte[]> cls) {
            int readVarInt = input.readVarInt(true);
            if (readVarInt == 0) {
                return null;
            }
            return input.readBytes(readVarInt - 1);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, byte[] bArr) {
            if (bArr == null) {
                output.writeVarInt(0, true);
            } else {
                output.writeVarInt(bArr.length + 1, true);
                output.writeBytes(bArr);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class CharArraySerializer extends Serializer<char[]> {
        public CharArraySerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public char[] copy(Kryo kryo, char[] cArr) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            System.arraycopy(cArr, 0, cArr2, 0, length);
            return cArr2;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public char[] read(Kryo kryo, Input input, Class<char[]> cls) {
            int readVarInt = input.readVarInt(true);
            if (readVarInt == 0) {
                return null;
            }
            return input.readChars(readVarInt - 1);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, char[] cArr) {
            if (cArr == null) {
                output.writeVarInt(0, true);
            } else {
                output.writeVarInt(cArr.length + 1, true);
                output.writeChars(cArr);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class DoubleArraySerializer extends Serializer<double[]> {
        public DoubleArraySerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public double[] copy(Kryo kryo, double[] dArr) {
            int length = dArr.length;
            double[] dArr2 = new double[length];
            System.arraycopy(dArr, 0, dArr2, 0, length);
            return dArr2;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public double[] read(Kryo kryo, Input input, Class<double[]> cls) {
            int readVarInt = input.readVarInt(true);
            if (readVarInt == 0) {
                return null;
            }
            return input.readDoubles(readVarInt - 1);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, double[] dArr) {
            if (dArr == null) {
                output.writeVarInt(0, true);
            } else {
                output.writeVarInt(dArr.length + 1, true);
                output.writeDoubles(dArr);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class FloatArraySerializer extends Serializer<float[]> {
        public FloatArraySerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public float[] copy(Kryo kryo, float[] fArr) {
            int length = fArr.length;
            float[] fArr2 = new float[length];
            System.arraycopy(fArr, 0, fArr2, 0, length);
            return fArr2;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public float[] read(Kryo kryo, Input input, Class<float[]> cls) {
            int readVarInt = input.readVarInt(true);
            if (readVarInt == 0) {
                return null;
            }
            return input.readFloats(readVarInt - 1);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, float[] fArr) {
            if (fArr == null) {
                output.writeVarInt(0, true);
            } else {
                output.writeVarInt(fArr.length + 1, true);
                output.writeFloats(fArr);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class IntArraySerializer extends Serializer<int[]> {
        public IntArraySerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public int[] copy(Kryo kryo, int[] iArr) {
            int length = iArr.length;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            return iArr2;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public int[] read(Kryo kryo, Input input, Class<int[]> cls) {
            int readVarInt = input.readVarInt(true);
            if (readVarInt == 0) {
                return null;
            }
            return input.readInts(readVarInt - 1, false);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, int[] iArr) {
            if (iArr == null) {
                output.writeVarInt(0, true);
            } else {
                output.writeVarInt(iArr.length + 1, true);
                output.writeInts(iArr, false);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class LongArraySerializer extends Serializer<long[]> {
        public LongArraySerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public long[] copy(Kryo kryo, long[] jArr) {
            int length = jArr.length;
            long[] jArr2 = new long[length];
            System.arraycopy(jArr, 0, jArr2, 0, length);
            return jArr2;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public long[] read(Kryo kryo, Input input, Class<long[]> cls) {
            int readVarInt = input.readVarInt(true);
            if (readVarInt == 0) {
                return null;
            }
            return input.readLongs(readVarInt - 1, false);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, long[] jArr) {
            if (jArr == null) {
                output.writeVarInt(0, true);
            } else {
                output.writeVarInt(jArr.length + 1, true);
                output.writeLongs(jArr, false);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class ObjectArraySerializer extends Serializer<Object[]> {
        private boolean elementsAreSameType;
        private boolean elementsCanBeNull = true;
        private Class[] generics;
        private final Class type;

        public ObjectArraySerializer(Kryo kryo, Class cls) {
            boolean z10;
            setAcceptsNull(true);
            this.type = cls;
            if ((cls.getComponentType().getModifiers() & 16) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                setElementsAreSameType(true);
            }
        }

        public void setElementsAreSameType(boolean z10) {
            this.elementsAreSameType = z10;
        }

        public void setElementsCanBeNull(boolean z10) {
            this.elementsCanBeNull = z10;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void setGenerics(Kryo kryo, Class[] clsArr) {
            if (Log.TRACE) {
                Log.trace("kryo", "setting generics for ObjectArraySerializer");
            }
            this.generics = clsArr;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Object[] copy(Kryo kryo, Object[] objArr) {
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), objArr.length);
            int length = objArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                objArr2[i10] = kryo.copy(objArr[i10]);
            }
            return objArr2;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Object[] read(Kryo kryo, Input input, Class<Object[]> cls) {
            int readVarInt = input.readVarInt(true);
            if (readVarInt == 0) {
                return null;
            }
            Object[] objArr = (Object[]) Array.newInstance(cls.getComponentType(), readVarInt - 1);
            kryo.reference(objArr);
            Class componentType = objArr.getClass().getComponentType();
            int i10 = 0;
            if (!this.elementsAreSameType && !Modifier.isFinal(componentType.getModifiers())) {
                int length = objArr.length;
                while (i10 < length) {
                    Registration readClass = kryo.readClass(input);
                    if (readClass != null) {
                        readClass.getSerializer().setGenerics(kryo, this.generics);
                        objArr[i10] = kryo.readObject(input, readClass.getType(), readClass.getSerializer());
                    } else {
                        objArr[i10] = null;
                    }
                    i10++;
                }
            } else {
                Serializer serializer = kryo.getSerializer(componentType);
                serializer.setGenerics(kryo, this.generics);
                int length2 = objArr.length;
                while (i10 < length2) {
                    if (this.elementsCanBeNull) {
                        objArr[i10] = kryo.readObjectOrNull(input, componentType, serializer);
                    } else {
                        objArr[i10] = kryo.readObject(input, componentType, serializer);
                    }
                    i10++;
                }
            }
            return objArr;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Object[] objArr) {
            int i10 = 0;
            if (objArr == null) {
                output.writeVarInt(0, true);
                return;
            }
            output.writeVarInt(objArr.length + 1, true);
            Class<?> componentType = objArr.getClass().getComponentType();
            if (!this.elementsAreSameType && !Modifier.isFinal(componentType.getModifiers())) {
                int length = objArr.length;
                while (i10 < length) {
                    Object obj = objArr[i10];
                    if (obj != null) {
                        kryo.getSerializer(obj.getClass()).setGenerics(kryo, this.generics);
                    }
                    kryo.writeClassAndObject(output, objArr[i10]);
                    i10++;
                }
                return;
            }
            Serializer serializer = kryo.getSerializer(componentType);
            serializer.setGenerics(kryo, this.generics);
            int length2 = objArr.length;
            while (i10 < length2) {
                if (this.elementsCanBeNull) {
                    kryo.writeObjectOrNull(output, objArr[i10], serializer);
                } else {
                    kryo.writeObject(output, objArr[i10], serializer);
                }
                i10++;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class ShortArraySerializer extends Serializer<short[]> {
        public ShortArraySerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public short[] copy(Kryo kryo, short[] sArr) {
            int length = sArr.length;
            short[] sArr2 = new short[length];
            System.arraycopy(sArr, 0, sArr2, 0, length);
            return sArr2;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public short[] read(Kryo kryo, Input input, Class<short[]> cls) {
            int readVarInt = input.readVarInt(true);
            if (readVarInt == 0) {
                return null;
            }
            return input.readShorts(readVarInt - 1);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, short[] sArr) {
            if (sArr == null) {
                output.writeVarInt(0, true);
            } else {
                output.writeVarInt(sArr.length + 1, true);
                output.writeShorts(sArr);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class StringArraySerializer extends Serializer<String[]> {
        public StringArraySerializer() {
            setAcceptsNull(true);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public String[] copy(Kryo kryo, String[] strArr) {
            int length = strArr.length;
            String[] strArr2 = new String[length];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            return strArr2;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public String[] read(Kryo kryo, Input input, Class<String[]> cls) {
            int readVarInt = input.readVarInt(true);
            if (readVarInt == 0) {
                return null;
            }
            int i10 = readVarInt - 1;
            String[] strArr = new String[i10];
            int i11 = 0;
            if (kryo.getReferences() && kryo.getReferenceResolver().useReferences(String.class)) {
                Serializer serializer = kryo.getSerializer(String.class);
                while (i11 < i10) {
                    strArr[i11] = (String) kryo.readObjectOrNull(input, String.class, serializer);
                    i11++;
                }
            } else {
                while (i11 < i10) {
                    strArr[i11] = input.readString();
                    i11++;
                }
            }
            return strArr;
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, String[] strArr) {
            int i10 = 0;
            if (strArr == null) {
                output.writeVarInt(0, true);
                return;
            }
            output.writeVarInt(strArr.length + 1, true);
            if (kryo.getReferences() && kryo.getReferenceResolver().useReferences(String.class)) {
                Serializer serializer = kryo.getSerializer(String.class);
                int length = strArr.length;
                while (i10 < length) {
                    kryo.writeObjectOrNull(output, strArr[i10], serializer);
                    i10++;
                }
                return;
            }
            int length2 = strArr.length;
            while (i10 < length2) {
                output.writeString(strArr[i10]);
                i10++;
            }
        }
    }
}
