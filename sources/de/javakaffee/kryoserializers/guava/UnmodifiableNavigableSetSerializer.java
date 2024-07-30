package de.javakaffee.kryoserializers.guava;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import j7.f2;
import java.lang.reflect.Field;
import java.util.NavigableSet;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public class UnmodifiableNavigableSetSerializer extends Serializer<NavigableSet<?>> {
    Field delegate;

    public UnmodifiableNavigableSetSerializer() {
        super(false);
        try {
            Field declaredField = Class.forName(f2.class.getCanonicalName() + "$UnmodifiableNavigableSet").getDeclaredField("delegate");
            this.delegate = declaredField;
            declaredField.setAccessible(true);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("Issues reflectively writing UnmodifiableNavigableSet", e10);
        } catch (IllegalArgumentException e11) {
            throw new RuntimeException("Issues reflectively writing UnmodifiableNavigableSet", e11);
        } catch (NoSuchFieldException e12) {
            throw new RuntimeException("Issues reflectively writing UnmodifiableNavigableSet", e12);
        } catch (SecurityException e13) {
            throw new RuntimeException("Issues reflectively writing UnmodifiableNavigableSet", e13);
        }
    }

    public static void registerSerializers(Kryo kryo) {
        kryo.register(f2.f(new TreeSet()).getClass(), new UnmodifiableNavigableSetSerializer());
    }

    public Object getDelegateFromUnmodifiableNavigableSet(NavigableSet<?> navigableSet) {
        try {
            return this.delegate.get(navigableSet);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Issues reflectively writing UnmodifiableNavigableSet", e10);
        } catch (IllegalArgumentException e11) {
            throw new RuntimeException("Issues reflectively writing UnmodifiableNavigableSet", e11);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public NavigableSet<?> copy(Kryo kryo, NavigableSet<?> navigableSet) {
        return f2.f((NavigableSet) kryo.copy(getDelegateFromUnmodifiableNavigableSet(navigableSet)));
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public NavigableSet<?> read(Kryo kryo, Input input, Class<NavigableSet<?>> cls) {
        return f2.f((NavigableSet) kryo.readClassAndObject(input));
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, NavigableSet<?> navigableSet) {
        kryo.writeClassAndObject(output, getDelegateFromUnmodifiableNavigableSet(navigableSet));
    }
}
