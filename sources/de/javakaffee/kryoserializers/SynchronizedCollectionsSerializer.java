package de.javakaffee.kryoserializers;

import com.anythink.expressad.d.a.b;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public class SynchronizedCollectionsSerializer extends Serializer<Object> {
    private static final Field SOURCE_COLLECTION_FIELD;
    private static final Field SOURCE_MAP_FIELD;

    /* loaded from: classes2.dex */
    public enum SynchronizedCollection {
        COLLECTION(Collections.synchronizedCollection(Arrays.asList("")).getClass(), SynchronizedCollectionsSerializer.SOURCE_COLLECTION_FIELD) { // from class: de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer.SynchronizedCollection.1
            @Override // de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer.SynchronizedCollection
            public Object create(Object obj) {
                return Collections.synchronizedCollection((Collection) obj);
            }
        },
        RANDOM_ACCESS_LIST(Collections.synchronizedList(new ArrayList()).getClass(), SynchronizedCollectionsSerializer.SOURCE_COLLECTION_FIELD) { // from class: de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer.SynchronizedCollection.2
            @Override // de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer.SynchronizedCollection
            public Object create(Object obj) {
                return Collections.synchronizedList((List) obj);
            }
        },
        LIST(Collections.synchronizedList(new LinkedList()).getClass(), SynchronizedCollectionsSerializer.SOURCE_COLLECTION_FIELD) { // from class: de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer.SynchronizedCollection.3
            @Override // de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer.SynchronizedCollection
            public Object create(Object obj) {
                return Collections.synchronizedList((List) obj);
            }
        },
        SET(Collections.synchronizedSet(new HashSet()).getClass(), SynchronizedCollectionsSerializer.SOURCE_COLLECTION_FIELD) { // from class: de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer.SynchronizedCollection.4
            @Override // de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer.SynchronizedCollection
            public Object create(Object obj) {
                return Collections.synchronizedSet((Set) obj);
            }
        },
        SORTED_SET(Collections.synchronizedSortedSet(new TreeSet()).getClass(), SynchronizedCollectionsSerializer.SOURCE_COLLECTION_FIELD) { // from class: de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer.SynchronizedCollection.5
            @Override // de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer.SynchronizedCollection
            public Object create(Object obj) {
                return Collections.synchronizedSortedSet((SortedSet) obj);
            }
        },
        MAP(Collections.synchronizedMap(new HashMap()).getClass(), SynchronizedCollectionsSerializer.SOURCE_MAP_FIELD) { // from class: de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer.SynchronizedCollection.6
            @Override // de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer.SynchronizedCollection
            public Object create(Object obj) {
                return Collections.synchronizedMap((Map) obj);
            }
        },
        SORTED_MAP(Collections.synchronizedSortedMap(new TreeMap()).getClass(), SynchronizedCollectionsSerializer.SOURCE_MAP_FIELD) { // from class: de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer.SynchronizedCollection.7
            @Override // de.javakaffee.kryoserializers.SynchronizedCollectionsSerializer.SynchronizedCollection
            public Object create(Object obj) {
                return Collections.synchronizedSortedMap((SortedMap) obj);
            }
        };

        private final Field sourceCollectionField;
        private final Class<?> type;

        public static SynchronizedCollection valueOfType(Class<?> cls) {
            for (SynchronizedCollection synchronizedCollection : values()) {
                if (synchronizedCollection.type.equals(cls)) {
                    return synchronizedCollection;
                }
            }
            throw new IllegalArgumentException("The type " + cls + " is not supported.");
        }

        public abstract Object create(Object obj);

        SynchronizedCollection(Class cls, Field field) {
            this.type = cls;
            this.sourceCollectionField = field;
        }
    }

    static {
        try {
            Field declaredField = Class.forName("java.util.Collections$SynchronizedCollection").getDeclaredField("c");
            SOURCE_COLLECTION_FIELD = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = Class.forName("java.util.Collections$SynchronizedMap").getDeclaredField(b.dH);
            SOURCE_MAP_FIELD = declaredField2;
            declaredField2.setAccessible(true);
        } catch (Exception e10) {
            throw new RuntimeException("Could not access source collection field in java.util.Collections$SynchronizedCollection.", e10);
        }
    }

    public static void registerSerializers(Kryo kryo) {
        SynchronizedCollectionsSerializer synchronizedCollectionsSerializer = new SynchronizedCollectionsSerializer();
        SynchronizedCollection.values();
        for (SynchronizedCollection synchronizedCollection : SynchronizedCollection.values()) {
            kryo.register(synchronizedCollection.type, synchronizedCollectionsSerializer);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Object copy(Kryo kryo, Object obj) {
        try {
            SynchronizedCollection valueOfType = SynchronizedCollection.valueOfType(obj.getClass());
            return valueOfType.create(kryo.copy(valueOfType.sourceCollectionField.get(obj)));
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public Object read(Kryo kryo, Input input, Class<Object> cls) {
        return SynchronizedCollection.values()[input.readInt(true)].create(kryo.readClassAndObject(input));
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, Object obj) {
        try {
            SynchronizedCollection valueOfType = SynchronizedCollection.valueOfType(obj.getClass());
            output.writeInt(valueOfType.ordinal(), true);
            kryo.writeClassAndObject(output, valueOfType.sourceCollectionField.get(obj));
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }
}
