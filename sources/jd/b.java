package jd;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

/* compiled from: ObjectInputStreamInstantiator.java */
/* loaded from: classes2.dex */
public final class b<T> implements id.a<T> {

    /* renamed from: s, reason: collision with root package name */
    public final ObjectInputStream f30222s;

    public b(Class<T> cls) {
        if (Serializable.class.isAssignableFrom(cls)) {
            try {
                this.f30222s = new ObjectInputStream(new a(cls));
                return;
            } catch (IOException e10) {
                throw new Error("IOException: " + e10.getMessage());
            }
        }
        throw new r2.a(new NotSerializableException(cls + " not serializable"));
    }

    @Override // id.a
    public final T newInstance() {
        try {
            return (T) this.f30222s.readObject();
        } catch (ClassNotFoundException e10) {
            throw new Error("ClassNotFoundException: " + e10.getMessage());
        } catch (Exception e11) {
            throw new r2.a(e11);
        }
    }

    /* compiled from: ObjectInputStreamInstantiator.java */
    /* loaded from: classes2.dex */
    public static class a extends InputStream {

        /* renamed from: w, reason: collision with root package name */
        public static final int[] f30223w = {1, 2, 2};

        /* renamed from: x, reason: collision with root package name */
        public static byte[] f30224x;
        public static byte[] y;

        /* renamed from: v, reason: collision with root package name */
        public final byte[][] f30228v;

        /* renamed from: s, reason: collision with root package name */
        public int f30225s = 0;

        /* renamed from: u, reason: collision with root package name */
        public int f30227u = 0;

        /* renamed from: t, reason: collision with root package name */
        public byte[] f30226t = f30224x;

        static {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeShort(-21267);
                dataOutputStream.writeShort(5);
                f30224x = byteArrayOutputStream.toByteArray();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream2);
                dataOutputStream2.writeByte(115);
                dataOutputStream2.writeByte(113);
                dataOutputStream2.writeInt(8257536);
                y = byteArrayOutputStream2.toByteArray();
            } catch (IOException e10) {
                throw new Error("IOException: " + e10.getMessage());
            }
        }

        public a(Class<?> cls) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeByte(115);
                dataOutputStream.writeByte(114);
                dataOutputStream.writeUTF(cls.getName());
                dataOutputStream.writeLong(ObjectStreamClass.lookup(cls).getSerialVersionUID());
                dataOutputStream.writeByte(2);
                dataOutputStream.writeShort(0);
                dataOutputStream.writeByte(120);
                dataOutputStream.writeByte(112);
                this.f30228v = new byte[][]{f30224x, byteArrayOutputStream.toByteArray(), y};
            } catch (IOException e10) {
                throw new Error("IOException: " + e10.getMessage());
            }
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return Integer.MAX_VALUE;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            byte[] bArr = this.f30226t;
            int i10 = this.f30225s;
            int i11 = i10 + 1;
            this.f30225s = i11;
            byte b10 = bArr[i10];
            if (i11 >= bArr.length) {
                this.f30225s = 0;
                int i12 = f30223w[this.f30227u];
                this.f30227u = i12;
                this.f30226t = this.f30228v[i12];
            }
            return b10;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) throws IOException {
            int length = this.f30226t.length - this.f30225s;
            int i12 = i11;
            while (length <= i12) {
                System.arraycopy(this.f30226t, this.f30225s, bArr, i10, length);
                i10 += length;
                i12 -= length;
                this.f30225s = 0;
                int i13 = f30223w[this.f30227u];
                this.f30227u = i13;
                byte[] bArr2 = this.f30228v[i13];
                this.f30226t = bArr2;
                length = bArr2.length + 0;
            }
            if (i12 > 0) {
                System.arraycopy(this.f30226t, this.f30225s, bArr, i10, i12);
                this.f30225s += i12;
            }
            return i11;
        }
    }
}
