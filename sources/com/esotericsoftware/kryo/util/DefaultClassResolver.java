package com.esotericsoftware.kryo.util;

import a3.k;
import a3.l;
import com.esotericsoftware.kryo.ClassResolver;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Registration;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.minlog.Log;
import s.f;

/* loaded from: classes.dex */
public class DefaultClassResolver implements ClassResolver {
    public static final byte NAME = -1;
    protected IdentityObjectIntMap<Class> classToNameId;
    protected Kryo kryo;
    private Class memoizedClass;
    private Registration memoizedClassIdValue;
    private Registration memoizedClassValue;
    protected IntMap<Class> nameIdToClass;
    protected ObjectMap<String, Class> nameToClass;
    protected int nextNameId;
    protected final IntMap<Registration> idToRegistration = new IntMap<>();
    protected final ObjectMap<Class, Registration> classToRegistration = new ObjectMap<>();
    private int memoizedClassId = -1;

    @Override // com.esotericsoftware.kryo.ClassResolver
    public Registration getRegistration(Class cls) {
        if (cls == this.memoizedClass) {
            return this.memoizedClassValue;
        }
        Registration registration = this.classToRegistration.get(cls);
        if (registration != null) {
            this.memoizedClass = cls;
            this.memoizedClassValue = registration;
        }
        return registration;
    }

    public Class<?> getTypeByName(String str) {
        ObjectMap<String, Class> objectMap = this.nameToClass;
        if (objectMap != null) {
            return objectMap.get(str);
        }
        return null;
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public Registration readClass(Input input) {
        int readVarInt = input.readVarInt(true);
        if (readVarInt != 0) {
            if (readVarInt != 1) {
                if (readVarInt == this.memoizedClassId) {
                    return this.memoizedClassIdValue;
                }
                int i10 = readVarInt - 2;
                Registration registration = this.idToRegistration.get(i10);
                if (registration != null) {
                    if (Log.TRACE) {
                        StringBuilder n10 = k.n("Read class ", i10, ": ");
                        n10.append(Util.className(registration.getType()));
                        Log.trace("kryo", n10.toString());
                    }
                    this.memoizedClassId = readVarInt;
                    this.memoizedClassIdValue = registration;
                    return registration;
                }
                throw new KryoException(l.i("Encountered unregistered class ID: ", i10));
            }
            return readName(input);
        }
        if (Log.TRACE || (Log.DEBUG && this.kryo.getDepth() == 1)) {
            Util.log("Read", null);
        }
        return null;
    }

    public Registration readName(Input input) {
        int readVarInt = input.readVarInt(true);
        if (this.nameIdToClass == null) {
            this.nameIdToClass = new IntMap<>();
        }
        Class cls = this.nameIdToClass.get(readVarInt);
        if (cls == null) {
            String readString = input.readString();
            cls = getTypeByName(readString);
            if (cls == null) {
                try {
                    cls = Class.forName(readString, false, this.kryo.getClassLoader());
                } catch (ClassNotFoundException e10) {
                    if (Log.WARN) {
                        Log.warn("kryo", "Unable to load class " + readString + " with kryo's ClassLoader. Retrying with current..");
                    }
                    try {
                        cls = Class.forName(readString);
                    } catch (ClassNotFoundException unused) {
                        throw new KryoException(f.b("Unable to find class: ", readString), e10);
                    }
                }
                if (this.nameToClass == null) {
                    this.nameToClass = new ObjectMap<>();
                }
                this.nameToClass.put(readString, cls);
            }
            this.nameIdToClass.put(readVarInt, cls);
            if (Log.TRACE) {
                Log.trace("kryo", "Read class name: " + readString);
            }
        } else if (Log.TRACE) {
            StringBuilder n10 = k.n("Read class name reference ", readVarInt, ": ");
            n10.append(Util.className(cls));
            Log.trace("kryo", n10.toString());
        }
        return this.kryo.getRegistration(cls);
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public Registration register(Registration registration) {
        if (registration != null) {
            if (registration.getId() != -1) {
                if (Log.TRACE) {
                    Log.trace("kryo", "Register class ID " + registration.getId() + ": " + Util.className(registration.getType()) + " (" + registration.getSerializer().getClass().getName() + ")");
                }
                this.idToRegistration.put(registration.getId(), registration);
            } else if (Log.TRACE) {
                Log.trace("kryo", "Register class name: " + Util.className(registration.getType()) + " (" + registration.getSerializer().getClass().getName() + ")");
            }
            this.classToRegistration.put(registration.getType(), registration);
            if (registration.getType().isPrimitive()) {
                this.classToRegistration.put(Util.getWrapperClass(registration.getType()), registration);
            }
            return registration;
        }
        throw new IllegalArgumentException("registration cannot be null.");
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public Registration registerImplicit(Class cls) {
        return register(new Registration(cls, this.kryo.getDefaultSerializer(cls), -1));
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public void reset() {
        if (!this.kryo.isRegistrationRequired()) {
            IdentityObjectIntMap<Class> identityObjectIntMap = this.classToNameId;
            if (identityObjectIntMap != null) {
                identityObjectIntMap.clear();
            }
            IntMap<Class> intMap = this.nameIdToClass;
            if (intMap != null) {
                intMap.clear();
            }
            this.nextNameId = 0;
        }
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public void setKryo(Kryo kryo) {
        this.kryo = kryo;
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public Registration writeClass(Output output, Class cls) {
        if (cls == null) {
            if (Log.TRACE || (Log.DEBUG && this.kryo.getDepth() == 1)) {
                Util.log("Write", null);
            }
            output.writeVarInt(0, true);
            return null;
        }
        Registration registration = this.kryo.getRegistration(cls);
        if (registration.getId() == -1) {
            writeName(output, cls, registration);
        } else {
            if (Log.TRACE) {
                Log.trace("kryo", "Write class " + registration.getId() + ": " + Util.className(cls));
            }
            output.writeVarInt(registration.getId() + 2, true);
        }
        return registration;
    }

    public void writeName(Output output, Class cls, Registration registration) {
        int i10;
        output.writeVarInt(1, true);
        IdentityObjectIntMap<Class> identityObjectIntMap = this.classToNameId;
        if (identityObjectIntMap != null && (i10 = identityObjectIntMap.get(cls, -1)) != -1) {
            if (Log.TRACE) {
                StringBuilder n10 = k.n("Write class name reference ", i10, ": ");
                n10.append(Util.className(cls));
                Log.trace("kryo", n10.toString());
            }
            output.writeVarInt(i10, true);
            return;
        }
        if (Log.TRACE) {
            Log.trace("kryo", "Write class name: " + Util.className(cls));
        }
        int i11 = this.nextNameId;
        this.nextNameId = i11 + 1;
        if (this.classToNameId == null) {
            this.classToNameId = new IdentityObjectIntMap<>();
        }
        this.classToNameId.put(cls, i11);
        output.writeVarInt(i11, true);
        output.writeString(cls.getName());
    }

    @Override // com.esotericsoftware.kryo.ClassResolver
    public Registration getRegistration(int i10) {
        return this.idToRegistration.get(i10);
    }
}
