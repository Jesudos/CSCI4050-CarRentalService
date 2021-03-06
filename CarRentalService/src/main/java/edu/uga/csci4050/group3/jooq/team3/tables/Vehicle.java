/**
 * This class is generated by jOOQ
 */
package edu.uga.csci4050.group3.jooq.team3.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Vehicle extends org.jooq.impl.TableImpl<edu.uga.csci4050.group3.jooq.team3.tables.records.VehicleRecord> {

	private static final long serialVersionUID = 2141882332;

	/**
	 * The singleton instance of <code>team3.VEHICLE</code>
	 */
	public static final edu.uga.csci4050.group3.jooq.team3.tables.Vehicle VEHICLE = new edu.uga.csci4050.group3.jooq.team3.tables.Vehicle();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<edu.uga.csci4050.group3.jooq.team3.tables.records.VehicleRecord> getRecordType() {
		return edu.uga.csci4050.group3.jooq.team3.tables.records.VehicleRecord.class;
	}

	/**
	 * The column <code>team3.VEHICLE.id</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.team3.tables.records.VehicleRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>team3.VEHICLE.uid</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.team3.tables.records.VehicleRecord, java.lang.String> UID = createField("uid", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>team3.VEHICLE.type</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.team3.tables.records.VehicleRecord, java.lang.String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>team3.VEHICLE.make</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.team3.tables.records.VehicleRecord, java.lang.String> MAKE = createField("make", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>team3.VEHICLE.model</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.team3.tables.records.VehicleRecord, java.lang.String> MODEL = createField("model", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>team3.VEHICLE.year</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.team3.tables.records.VehicleRecord, java.lang.Integer> YEAR = createField("year", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>team3.VEHICLE.mileage</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.team3.tables.records.VehicleRecord, java.lang.Integer> MILEAGE = createField("mileage", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>team3.VEHICLE.tag</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.team3.tables.records.VehicleRecord, java.lang.String> TAG = createField("tag", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>team3.VEHICLE.lastservice</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.team3.tables.records.VehicleRecord, java.lang.Integer> LASTSERVICE = createField("lastservice", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>team3.VEHICLE.location</code>. 
	 */
	public final org.jooq.TableField<edu.uga.csci4050.group3.jooq.team3.tables.records.VehicleRecord, java.lang.String> LOCATION = createField("location", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * Create a <code>team3.VEHICLE</code> table reference
	 */
	public Vehicle() {
		super("VEHICLE", edu.uga.csci4050.group3.jooq.team3.Team3.TEAM3);
	}

	/**
	 * Create an aliased <code>team3.VEHICLE</code> table reference
	 */
	public Vehicle(java.lang.String alias) {
		super(alias, edu.uga.csci4050.group3.jooq.team3.Team3.TEAM3, edu.uga.csci4050.group3.jooq.team3.tables.Vehicle.VEHICLE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<edu.uga.csci4050.group3.jooq.team3.tables.records.VehicleRecord, java.lang.Integer> getIdentity() {
		return edu.uga.csci4050.group3.jooq.team3.Keys.IDENTITY_VEHICLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<edu.uga.csci4050.group3.jooq.team3.tables.records.VehicleRecord> getPrimaryKey() {
		return edu.uga.csci4050.group3.jooq.team3.Keys.KEY_VEHICLE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<edu.uga.csci4050.group3.jooq.team3.tables.records.VehicleRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<edu.uga.csci4050.group3.jooq.team3.tables.records.VehicleRecord>>asList(edu.uga.csci4050.group3.jooq.team3.Keys.KEY_VEHICLE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public edu.uga.csci4050.group3.jooq.team3.tables.Vehicle as(java.lang.String alias) {
		return new edu.uga.csci4050.group3.jooq.team3.tables.Vehicle(alias);
	}
}
