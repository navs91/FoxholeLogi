package com.navs.foxhole.logi.entity;

public enum Rank {

	NONE( 0, "none", "None"),
	PRIVATE( 1, "Pte", "Private"),
	LANCE_CORPORAL( 2, "LCpl", "Lance Corporal"),
	CORPORAL( 3, "Cpl", "Corporal"),
	SARGEANT( 4, "Sgt", "Sergeant"),
	STAFF_SERGEANT( 5, "SSgt", "Staff Sargeant"),
	WARRANT_OFFICER_2( 6, "WO2", "Warrant Officer 2"),
	WARRANT_OFFICER_1( 7, "WO2", "Warrant Officer 1"),
	OFFICER_CADET( 8, "OCdt", "Officer Cadet"),
	SECOND_LIEUTENANT( 1, "Pte", "Private"),
	LIEUTENANT( 1, "Pte", "Private"),
	CAPTIAN( 1, "Pte", "Private"),
	MAJOR( 1, "Pte", "Private"),
	LIEUTENANT_COLONEL( 1, "Pte", "Private"),
	COLONEL( 1, "Pte", "Private"),
	BRIGADIER_GENERAL( 1, "Pte", "Private"),
	MAJOR_GENERAL( 1, "Pte", "Private"),
	LIEUTENANT_GENERAL( 1, "Pte", "Private"),
	GENERAL( 1, "Pte", "Private"),
	FIELD_MARSHAL( 1, "Pte", "Private");
	
	public final int id;
	public final String rank;
	public final String description;
	
	private Rank( int id, String rank, String description ) {
		this.id = id;
		this.rank = rank;
		this.description = description;
	}
	
}
