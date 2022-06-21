/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.learnavro.domain.generated;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class CoffeeOrderOld extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7779877205242251734L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CoffeeOrderOld\",\"namespace\":\"com.learnavro.domain.generated\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"store\",\"type\":{\"type\":\"record\",\"name\":\"Store\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"address\",\"type\":{\"type\":\"record\",\"name\":\"Address\",\"fields\":[{\"name\":\"addressLine1\",\"type\":\"string\"},{\"name\":\"city\",\"type\":\"string\"},{\"name\":\"state_province\",\"type\":\"string\"},{\"name\":\"country\",\"type\":\"string\",\"default\":\"USA\"},{\"name\":\"zip\",\"type\":\"string\"}]}}]}},{\"name\":\"orderLineItems\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OrderLineItem\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"size\",\"type\":{\"type\":\"enum\",\"name\":\"Size\",\"symbols\":[\"SMALL\",\"MEDIUM\",\"LARGE\"]}},{\"name\":\"quantity\",\"type\":\"int\"},{\"name\":\"cost\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":3,\"scale\":2}}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<CoffeeOrderOld> ENCODER =
      new BinaryMessageEncoder<CoffeeOrderOld>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CoffeeOrderOld> DECODER =
      new BinaryMessageDecoder<CoffeeOrderOld>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CoffeeOrderOld> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CoffeeOrderOld> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CoffeeOrderOld> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CoffeeOrderOld>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CoffeeOrderOld to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CoffeeOrderOld from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CoffeeOrderOld instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CoffeeOrderOld fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public long id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public com.learnavro.domain.generated.Store store;
  @Deprecated public java.util.List<com.learnavro.domain.generated.OrderLineItem> orderLineItems;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CoffeeOrderOld() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param name The new value for name
   * @param store The new value for store
   * @param orderLineItems The new value for orderLineItems
   */
  public CoffeeOrderOld(java.lang.Long id, java.lang.CharSequence name, com.learnavro.domain.generated.Store store, java.util.List<com.learnavro.domain.generated.OrderLineItem> orderLineItems) {
    this.id = id;
    this.name = name;
    this.store = store;
    this.orderLineItems = orderLineItems;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return store;
    case 3: return orderLineItems;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: store = (com.learnavro.domain.generated.Store)value$; break;
    case 3: orderLineItems = (java.util.List<com.learnavro.domain.generated.OrderLineItem>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public long getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'store' field.
   * @return The value of the 'store' field.
   */
  public com.learnavro.domain.generated.Store getStore() {
    return store;
  }


  /**
   * Sets the value of the 'store' field.
   * @param value the value to set.
   */
  public void setStore(com.learnavro.domain.generated.Store value) {
    this.store = value;
  }

  /**
   * Gets the value of the 'orderLineItems' field.
   * @return The value of the 'orderLineItems' field.
   */
  public java.util.List<com.learnavro.domain.generated.OrderLineItem> getOrderLineItems() {
    return orderLineItems;
  }


  /**
   * Sets the value of the 'orderLineItems' field.
   * @param value the value to set.
   */
  public void setOrderLineItems(java.util.List<com.learnavro.domain.generated.OrderLineItem> value) {
    this.orderLineItems = value;
  }

  /**
   * Creates a new CoffeeOrderOld RecordBuilder.
   * @return A new CoffeeOrderOld RecordBuilder
   */
  public static com.learnavro.domain.generated.CoffeeOrderOld.Builder newBuilder() {
    return new com.learnavro.domain.generated.CoffeeOrderOld.Builder();
  }

  /**
   * Creates a new CoffeeOrderOld RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CoffeeOrderOld RecordBuilder
   */
  public static com.learnavro.domain.generated.CoffeeOrderOld.Builder newBuilder(com.learnavro.domain.generated.CoffeeOrderOld.Builder other) {
    if (other == null) {
      return new com.learnavro.domain.generated.CoffeeOrderOld.Builder();
    } else {
      return new com.learnavro.domain.generated.CoffeeOrderOld.Builder(other);
    }
  }

  /**
   * Creates a new CoffeeOrderOld RecordBuilder by copying an existing CoffeeOrderOld instance.
   * @param other The existing instance to copy.
   * @return A new CoffeeOrderOld RecordBuilder
   */
  public static com.learnavro.domain.generated.CoffeeOrderOld.Builder newBuilder(com.learnavro.domain.generated.CoffeeOrderOld other) {
    if (other == null) {
      return new com.learnavro.domain.generated.CoffeeOrderOld.Builder();
    } else {
      return new com.learnavro.domain.generated.CoffeeOrderOld.Builder(other);
    }
  }

  /**
   * RecordBuilder for CoffeeOrderOld instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CoffeeOrderOld>
    implements org.apache.avro.data.RecordBuilder<CoffeeOrderOld> {

    private long id;
    private java.lang.CharSequence name;
    private com.learnavro.domain.generated.Store store;
    private com.learnavro.domain.generated.Store.Builder storeBuilder;
    private java.util.List<com.learnavro.domain.generated.OrderLineItem> orderLineItems;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.learnavro.domain.generated.CoffeeOrderOld.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.store)) {
        this.store = data().deepCopy(fields()[2].schema(), other.store);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasStoreBuilder()) {
        this.storeBuilder = com.learnavro.domain.generated.Store.newBuilder(other.getStoreBuilder());
      }
      if (isValidValue(fields()[3], other.orderLineItems)) {
        this.orderLineItems = data().deepCopy(fields()[3].schema(), other.orderLineItems);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing CoffeeOrderOld instance
     * @param other The existing instance to copy.
     */
    private Builder(com.learnavro.domain.generated.CoffeeOrderOld other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.store)) {
        this.store = data().deepCopy(fields()[2].schema(), other.store);
        fieldSetFlags()[2] = true;
      }
      this.storeBuilder = null;
      if (isValidValue(fields()[3], other.orderLineItems)) {
        this.orderLineItems = data().deepCopy(fields()[3].schema(), other.orderLineItems);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public long getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrderOld.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrderOld.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrderOld.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrderOld.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'store' field.
      * @return The value.
      */
    public com.learnavro.domain.generated.Store getStore() {
      return store;
    }


    /**
      * Sets the value of the 'store' field.
      * @param value The value of 'store'.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrderOld.Builder setStore(com.learnavro.domain.generated.Store value) {
      validate(fields()[2], value);
      this.storeBuilder = null;
      this.store = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'store' field has been set.
      * @return True if the 'store' field has been set, false otherwise.
      */
    public boolean hasStore() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'store' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.learnavro.domain.generated.Store.Builder getStoreBuilder() {
      if (storeBuilder == null) {
        if (hasStore()) {
          setStoreBuilder(com.learnavro.domain.generated.Store.newBuilder(store));
        } else {
          setStoreBuilder(com.learnavro.domain.generated.Store.newBuilder());
        }
      }
      return storeBuilder;
    }

    /**
     * Sets the Builder instance for the 'store' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.learnavro.domain.generated.CoffeeOrderOld.Builder setStoreBuilder(com.learnavro.domain.generated.Store.Builder value) {
      clearStore();
      storeBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'store' field has an active Builder instance
     * @return True if the 'store' field has an active Builder instance
     */
    public boolean hasStoreBuilder() {
      return storeBuilder != null;
    }

    /**
      * Clears the value of the 'store' field.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrderOld.Builder clearStore() {
      store = null;
      storeBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'orderLineItems' field.
      * @return The value.
      */
    public java.util.List<com.learnavro.domain.generated.OrderLineItem> getOrderLineItems() {
      return orderLineItems;
    }


    /**
      * Sets the value of the 'orderLineItems' field.
      * @param value The value of 'orderLineItems'.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrderOld.Builder setOrderLineItems(java.util.List<com.learnavro.domain.generated.OrderLineItem> value) {
      validate(fields()[3], value);
      this.orderLineItems = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'orderLineItems' field has been set.
      * @return True if the 'orderLineItems' field has been set, false otherwise.
      */
    public boolean hasOrderLineItems() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'orderLineItems' field.
      * @return This builder.
      */
    public com.learnavro.domain.generated.CoffeeOrderOld.Builder clearOrderLineItems() {
      orderLineItems = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CoffeeOrderOld build() {
      try {
        CoffeeOrderOld record = new CoffeeOrderOld();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        if (storeBuilder != null) {
          try {
            record.store = this.storeBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("store"));
            throw e;
          }
        } else {
          record.store = fieldSetFlags()[2] ? this.store : (com.learnavro.domain.generated.Store) defaultValue(fields()[2]);
        }
        record.orderLineItems = fieldSetFlags()[3] ? this.orderLineItems : (java.util.List<com.learnavro.domain.generated.OrderLineItem>) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CoffeeOrderOld>
    WRITER$ = (org.apache.avro.io.DatumWriter<CoffeeOrderOld>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CoffeeOrderOld>
    READER$ = (org.apache.avro.io.DatumReader<CoffeeOrderOld>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










